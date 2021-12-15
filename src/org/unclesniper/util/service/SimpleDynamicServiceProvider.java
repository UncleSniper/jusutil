package org.unclesniper.util.service;

import java.util.Set;
import org.unclesniper.util.collection.TypeMap;

import static org.unclesniper.util.ArgUtils.notNull;

public class SimpleDynamicServiceProvider<UpperBoundT, ContextT, ProvisionExceptionT extends Throwable>
		implements DynamicServiceProvider<UpperBoundT, ProvisionExceptionT>,
		ContextDynamicServiceProvider<UpperBoundT, ContextT, ProvisionExceptionT> {

	private final TypeMap<UpperBoundT> services = new TypeMap<UpperBoundT>();

	public SimpleDynamicServiceProvider() {}

	public boolean isCheckType() {
		return services.isCheckType();
	}

	public void setCheckType(boolean checkType) {
		services.setCheckType(checkType);
	}

	public <ServiceT extends UpperBoundT> void setService(Class<ServiceT> type, ServiceT instance) {
		services.put(type, instance);
	}

	@Override
	public <ServiceT extends UpperBoundT> ServiceT getService(Class<ServiceT> type) {
		return services.get(type);
	}

	@Override
	public <ServiceT extends UpperBoundT> ServiceT getService(Class<ServiceT> type, ContextT context) {
		return services.get(type);
	}

	public void clear() {
		services.clear();
	}

	public Set<Class<? extends UpperBoundT>> serviceTypeSet() {
		return services.keySet();
	}

	public boolean removeService(Class<? extends UpperBoundT> type) {
		return services.remove(type);
	}

}
