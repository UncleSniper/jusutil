package org.unclesniper.util.service;

import java.util.Map;
import java.util.Set;
import java.util.HashMap;
import java.util.AbstractMap;
import java.util.function.Supplier;
import org.unclesniper.util.collection.CollectionUtils;
import org.unclesniper.util.collection.CoalescingIterable;

import static org.unclesniper.util.ArgUtils.notNull;

public class SimpleContextDynamicServiceProvider<UpperBoundT, ContextT, ProvisionExceptionT extends Throwable>
		implements DynamicServiceProvider<UpperBoundT, ProvisionExceptionT>,
		ContextDynamicServiceProvider<UpperBoundT, ContextT, ProvisionExceptionT>,
		DynamicServiceRegistry<UpperBoundT>,
		ContextDynamicServiceRegistry<UpperBoundT, ContextT> {

	private final Supplier<? extends Map<? super ContextT, Object>> contextMapConstructor;

	private final Map<Class<? extends UpperBoundT>, Map<? super ContextT, Object>> services
			= new HashMap<Class<? extends UpperBoundT>, Map<? super ContextT, Object>>();

	private boolean checkType;

	private Class<UpperBoundT> upperBoundClass;

	public SimpleContextDynamicServiceProvider(
		Supplier<? extends Map<? super ContextT, Object>> contextMapConstructor
	) {
		this.contextMapConstructor = contextMapConstructor == null ? HashMap::new : contextMapConstructor;
	}

	public Supplier<? extends Map<? super ContextT, Object>> getContextMapConstructor() {
		return contextMapConstructor;
	}

	public boolean isCheckType() {
		return checkType;
	}

	public void setCheckType(boolean checkType) {
		this.checkType = checkType;
	}

	public Class<UpperBoundT> getUpperBoundClass() {
		return upperBoundClass;
	}

	public void setUpperBoundClass(Class<UpperBoundT> upperBoundClass) {
		this.upperBoundClass = upperBoundClass;
	}

	@Override
	public <ServiceT extends UpperBoundT> void setService(Class<ServiceT> type, ContextT context,
			ServiceT instance) {
		notNull(type, "type");
		if(upperBoundClass != null && !upperBoundClass.isAssignableFrom(type))
			throw new IllegalArgumentException("Type '" + type.getName() + "' does not conform to upper bound '"
					+ upperBoundClass.getName() + '\'');
		if(checkType && instance != null && !type.isInstance(instance))
			throw new IllegalArgumentException("Instance object of type '" + instance.getClass().getName()
					+ "' is not actually of claimed type '" + type.getName() + '\'');
		Map<? super ContextT, Object> contextMap = services.get(type);
		if(instance == null) {
			if(contextMap != null)
				contextMap.remove(context);
			return;
		}
		if(contextMap == null) {
			contextMap = contextMapConstructor.get();
			if(contextMap == null)
				throw new IllegalStateException("Context map constructor returned null");
			services.put(type, contextMap);
		}
		contextMap.put(context, instance);
	}

	@Override
	public <ServiceT extends UpperBoundT> void setService(Class<ServiceT> type, ServiceT instance) {
		setService(type, null, instance);
	}

	@Override
	public <ServiceT extends UpperBoundT> ServiceT getService(Class<ServiceT> type) {
		return getService(type, null);
	}

	@Override
	@SuppressWarnings("unchecked")
	public <ServiceT extends UpperBoundT> ServiceT getService(Class<ServiceT> type, ContextT context) {
		Map<? super ContextT, Object> contextMap = services.get(type);
		if(contextMap == null)
			return null;
		return (ServiceT)contextMap.get(context);
	}

	public void clear() {
		services.clear();
	}

	public Set<Class<? extends UpperBoundT>> serviceTypeSet() {
		return services.keySet();
	}

	public boolean removeService(Class<? extends UpperBoundT> type) {
		Map<? super ContextT, Object> contextMap = services.remove(type);
		return contextMap != null && !contextMap.isEmpty();
	}

	public boolean removeService(Class<? extends UpperBoundT> type, ContextT context) {
		Map<? super ContextT, Object> contextMap = services.get(type);
		if(contextMap == null)
			return false;
		boolean removed = contextMap.remove(context) != null;
		if(contextMap.isEmpty())
			services.remove(type);
		return removed;
	}

	@SuppressWarnings("unchecked")
	public Iterable<ContextDynamicServiceEntry<? extends UpperBoundT, ContextT>> entries() {
		return new CoalescingIterable<
			Map.Entry<Class<? extends UpperBoundT>, Map<? super ContextT, Object>>,
			Class<? extends UpperBoundT>,
			Map.Entry<? super ContextT, Object>,
			ContextDynamicServiceEntry<? extends UpperBoundT, ContextT>
		>(
			services.entrySet(),
			Map.Entry::getKey,
			entry -> entry.getValue().entrySet().iterator(),
			(type, entry) -> new ContextDynamicServiceEntry(type, entry.getValue(), entry.getKey())
		);
	}

	@SuppressWarnings("unchecked")
	public Iterable<ContextPair<UpperBoundT, ContextT>> instances() {
		return new CoalescingIterable<
			Map<? super ContextT, Object>,
			Void,
			Map.Entry<? super ContextT, Object>,
			ContextPair<UpperBoundT, ContextT>
		>(
			services.values(),
			null,
			CollectionUtils::iteratingEntries,
			(cookie, entry) -> new ContextPair<UpperBoundT, ContextT>(
				(UpperBoundT)entry.getValue(),
				(ContextT)entry.getKey()
			)
		);
	}

}
