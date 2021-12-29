package org.unclesniper.util.service;

import java.util.Map;
import java.util.Set;
import java.util.function.Supplier;
import org.unclesniper.util.Holdable;
import org.unclesniper.util.Executable;
import org.unclesniper.util.collection.MappingIterable;

import static org.unclesniper.util.ArgUtils.notNull;

public class AdvancingDynamicServiceProvider<
	UnheldInstantiationContextT,
	UnheldInstanceT,
	UnheldInstantiationExceptionT extends Throwable,
	UnheldProvisionContextT,
	UnheldServiceT extends ContextInstantiableService<
		? super UnheldInstantiationContextT,
		? extends UnheldInstanceT,
		? extends UnheldInstantiationExceptionT
	>,
	ReleaseExceptionT extends Exception,
	HoldableInstantiationContextT,
	HoldableInstanceT extends Holdable<? extends ReleaseExceptionT>,
	HoldableInstantiationExceptionT extends Throwable,
	HoldableProvisionContextT,
	HoldableServiceT extends ContextInstantiableService<
		? super HoldableInstantiationContextT,
		? extends HoldableInstanceT,
		? extends HoldableInstantiationExceptionT
	>
> {

	private final SimpleContextDynamicServiceProvider<
		UnheldServiceT,
		UnheldProvisionContextT,
		RuntimeException
	> unheldServices;

	private final SimpleContextDynamicServiceProvider<
		HoldableServiceT,
		HoldableProvisionContextT,
		RuntimeException
	> holdableServices;

	public AdvancingDynamicServiceProvider(
		Supplier<? extends Map<? super UnheldProvisionContextT, Object>> unheldContextMapConstructor,
		Supplier<? extends Map<? super HoldableProvisionContextT, Object>> holdableContextMapConstructor
	) {
		unheldServices = new SimpleContextDynamicServiceProvider<
			UnheldServiceT,
			UnheldProvisionContextT,
			RuntimeException
		>(unheldContextMapConstructor);
		holdableServices = new SimpleContextDynamicServiceProvider<
			HoldableServiceT,
			HoldableProvisionContextT,
			RuntimeException
		>(holdableContextMapConstructor);
	}

	public Supplier<? extends Map<? super UnheldProvisionContextT, Object>> getUnheldContextMapConstructor() {
		return unheldServices.getContextMapConstructor();
	}

	public Supplier<? extends Map<? super HoldableProvisionContextT, Object>> getHoldableContextMapConstructor() {
		return holdableServices.getContextMapConstructor();
	}

	public boolean isCheckUnheldType() {
		return unheldServices.isCheckType();
	}

	public void setCheckUnheldType(boolean checkType) {
		unheldServices.setCheckType(checkType);
	}

	public boolean isCheckHoldableType() {
		return holdableServices.isCheckType();
	}

	public void setCheckHoldableType(boolean checkType) {
		holdableServices.setCheckType(checkType);
	}

	public Class<UnheldServiceT> getUnheldUpperBoundClass() {
		return unheldServices.getUpperBoundClass();
	}

	public void setUnheldUpperBoundClass(Class<UnheldServiceT> upperBoundClass) {
		unheldServices.setUpperBoundClass(upperBoundClass);
	}

	public Class<HoldableServiceT> getHoldableUpperBoundClass() {
		return holdableServices.getUpperBoundClass();
	}

	public void setHoldableUpperBoundClass(Class<HoldableServiceT> upperBoundClass) {
		holdableServices.setUpperBoundClass(upperBoundClass);
	}

	public <ServiceT extends UnheldServiceT> void setUnheldService(Class<ServiceT> type,
			UnheldProvisionContextT context, ServiceT instance) {
		unheldServices.setService(type, context, instance);
	}

	public <ServiceT extends HoldableServiceT> void setHoldableService(Class<ServiceT> type,
			HoldableProvisionContextT context, ServiceT instance) {
		holdableServices.setService(type, context, instance);
	}

	public <ServiceT extends UnheldServiceT> ServiceT getUnheldService(Class<ServiceT> type,
			UnheldProvisionContextT context) {
		return unheldServices.getService(type, context);
	}

	public <ServiceT extends HoldableServiceT> ServiceT getHoldableService(Class<ServiceT> type,
			HoldableProvisionContextT context) {
		return holdableServices.getService(type, context);
	}

	public void clearUnheldServices() {
		unheldServices.clear();
	}

	public void clearHoldableServices() {
		holdableServices.clear();
	}

	public void clear() {
		clearUnheldServices();
		clearHoldableServices();
	}

	public Set<Class<? extends UnheldServiceT>> unheldServiceTypeSet() {
		return unheldServices.serviceTypeSet();
	}

	public Set<Class<? extends HoldableServiceT>> holdableServiceTypeSet() {
		return holdableServices.serviceTypeSet();
	}

	public boolean removeUnheldService(Class<? extends UnheldServiceT> type) {
		return unheldServices.removeService(type);
	}

	public boolean removeHoldableService(Class<? extends HoldableServiceT> type) {
		return holdableServices.removeService(type);
	}

	public boolean removeUnheldService(Class<? extends UnheldServiceT> type, UnheldProvisionContextT context) {
		return unheldServices.removeService(type, context);
	}

	public boolean removeHoldableService(Class<? extends HoldableServiceT> type,
			HoldableProvisionContextT context) {
		return holdableServices.removeService(type, context);
	}

	private UnheldInstanceT getUnheldServiceInstance(
		Class<? extends UnheldServiceT> type,
		UnheldProvisionContextT provisionContext,
		UnheldInstantiationContextT instantiationContext,
		boolean required
	) throws UnheldInstantiationExceptionT {
		UnheldServiceT service = getUnheldService(type, provisionContext);
		if(service == null) {
			if(required)
				throw new IllegalStateException("Don't know how to provide service of type '"
						+ notNull(type, "type").getName() + "' for context: " + provisionContext);
			return null;
		}
		UnheldInstanceT instance = service.instantiate(instantiationContext);
		if(required && instance == null)
			throw new IllegalStateException("Instantiating service of type '" + notNull(type, "type").getName()
					+ "' (for context: " + provisionContext + ") returned null for context: "
					+ instantiationContext);
		return instance;
	}

	public UnheldInstanceT getUnheldServiceInstance(
		Class<? extends UnheldServiceT> type,
		UnheldProvisionContextT provisionContext,
		UnheldInstantiationContextT instantiationContext
	) throws UnheldInstantiationExceptionT {
		return getUnheldServiceInstance(type, provisionContext, instantiationContext, false);
	}

	public UnheldInstanceT requireUnheldServiceInstance(
		Class<? extends UnheldServiceT> type,
		UnheldProvisionContextT provisionContext,
		UnheldInstantiationContextT instantiationContext
	) throws UnheldInstantiationExceptionT {
		return getUnheldServiceInstance(type, provisionContext, instantiationContext, true);
	}

	private HoldableInstanceT getHoldableServiceInstance(
		Class<? extends HoldableServiceT> type,
		HoldableProvisionContextT provisionContext,
		HoldableInstantiationContextT instantiationContext,
		boolean required
	) throws HoldableInstantiationExceptionT {
		HoldableServiceT service = getHoldableService(type, provisionContext);
		if(service == null) {
			if(required)
				throw new IllegalStateException("Don't know how to provide service of type '"
						+ notNull(type, "type").getName() + "' for context: " + provisionContext);
			return null;
		}
		HoldableInstanceT instance = service.instantiate(instantiationContext);
		if(required && instance == null)
			throw new IllegalStateException("Instantiating service of type '" + notNull(type, "type").getName()
					+ "' (for context: " + provisionContext + ") returned null for context: "
					+ instantiationContext);
		return instance;
	}

	public HoldableInstanceT getHoldableServiceInstance(
		Class<? extends HoldableServiceT> type,
		HoldableProvisionContextT provisionContext,
		HoldableInstantiationContextT instantiationContext
	) throws HoldableInstantiationExceptionT {
		return getHoldableServiceInstance(type, provisionContext, instantiationContext, false);
	}

	public HoldableInstanceT requireHoldableServiceInstance(
		Class<? extends HoldableServiceT> type,
		HoldableProvisionContextT provisionContext,
		HoldableInstantiationContextT instantiationContext
	) throws HoldableInstantiationExceptionT {
		return getHoldableServiceInstance(type, provisionContext, instantiationContext, true);
	}

	public Iterable<Map.Entry<
		Class<? extends UnheldServiceT>,
		ContextPair<UnheldServiceT, UnheldProvisionContextT>
	>> unheldEntries() {
		return unheldServices.entries();
	}

	public Iterable<ContextPair<UnheldServiceT, UnheldProvisionContextT>> unheldServices() {
		return unheldServices.instances();
	}

	public Iterable<Map.Entry<
		Class<? extends HoldableServiceT>,
		ContextPair<HoldableServiceT, HoldableProvisionContextT>
	>> holdableEntries() {
		return holdableServices.entries();
	}

	public Iterable<ContextPair<HoldableServiceT, HoldableProvisionContextT>> holdableServices() {
		return holdableServices.instances();
	}

	public <
		ExecuteExceptionT extends Throwable,
		UnheldAssignmentExceptionT extends Throwable,
		HoldableAssignmentExceptionT extends Throwable
	> void advance(
		Executable<? extends ExecuteExceptionT> action,
		UnheldInstantiationContextT unheldInstantiationContext,
		AdvancingServicePlacement<
			? super UnheldServiceT,
			? super UnheldProvisionContextT,
			? super UnheldInstantiationContextT,
			? super UnheldInstanceT,
			? extends UnheldAssignmentExceptionT
		> unheldPlacement,
		HoldableInstantiationContextT holdableInstantiationContext,
		AdvancingServicePlacement<
			? super HoldableServiceT,
			? super HoldableProvisionContextT,
			? super HoldableInstantiationContextT,
			? super HoldableInstanceT,
			? extends HoldableAssignmentExceptionT
		> holdablePlacement
	) throws ExecuteExceptionT, UnheldInstantiationExceptionT, UnheldAssignmentExceptionT, ReleaseExceptionT,
			HoldableInstantiationExceptionT, HoldableAssignmentExceptionT {
		AdvancingDynamicServiceProvider.<
			ExecuteExceptionT,
			UnheldInstantiationContextT,
			UnheldInstanceT,
			UnheldInstantiationExceptionT,
			UnheldProvisionContextT,
			UnheldServiceT,
			UnheldAssignmentExceptionT,
			ReleaseExceptionT,
			HoldableInstantiationContextT,
			HoldableInstanceT,
			HoldableInstantiationExceptionT,
			HoldableProvisionContextT,
			HoldableServiceT,
			HoldableAssignmentExceptionT
		>advanceServices(
			action,
			unheldServices.instances(),
			unheldInstantiationContext,
			unheldPlacement,
			new MappingIterable<
				ContextPair<HoldableServiceT, HoldableProvisionContextT>,
				ContextInstantiableContextPair<
					? extends HoldableServiceT,
					? extends HoldableProvisionContextT,
					? super HoldableInstantiationContextT,
					? extends HoldableInstanceT,
					? extends HoldableInstantiationExceptionT
				>
			>(
				holdableServices.instances(),
				pair -> new ContextInstantiableContextPair<
					HoldableServiceT,
					HoldableProvisionContextT,
					HoldableInstantiationContextT,
					HoldableInstanceT,
					HoldableInstantiationExceptionT
				>(pair)
			),
			holdableInstantiationContext,
			holdablePlacement
		);
	}

	public static <
		ExecuteExceptionT extends Throwable,
		UnheldInstantiationContextT,
		UnheldInstanceT,
		UnheldInstantiationExceptionT extends Throwable,
		UnheldProvisionContextT,
		UnheldServiceT extends ContextInstantiableService<
			? super UnheldInstantiationContextT,
			? extends UnheldInstanceT,
			? extends UnheldInstantiationExceptionT
		>,
		UnheldAssignmentExceptionT extends Throwable,
		ReleaseExceptionT extends Exception,
		HoldableInstantiationContextT,
		HoldableInstanceT extends Holdable<? extends ReleaseExceptionT>,
		HoldableInstantiationExceptionT extends Throwable,
		HoldableProvisionContextT,
		HoldableServiceT extends ContextInstantiableService<
			? super HoldableInstantiationContextT,
			? extends HoldableInstanceT,
			? extends HoldableInstantiationExceptionT
		>,
		HoldableAssignmentExceptionT extends Throwable
	> void advanceServices(
		Executable<? extends ExecuteExceptionT> action,
		Iterable<
			? extends ContextPair<
				? extends UnheldServiceT,
				? extends UnheldProvisionContextT
			>
		> unheldServices,
		UnheldInstantiationContextT unheldInstantiationContext,
		AdvancingServicePlacement<
			? super UnheldServiceT,
			? super UnheldProvisionContextT,
			? super UnheldInstantiationContextT,
			? super UnheldInstanceT,
			? extends UnheldAssignmentExceptionT
		> unheldPlacement,
		Iterable<
			? extends ContextInstantiableContextPair<
				? extends HoldableServiceT,
				? extends HoldableProvisionContextT,
				? super HoldableInstantiationContextT,
				? extends HoldableInstanceT,
				? extends HoldableInstantiationExceptionT
			>
		> holdableServices,
		HoldableInstantiationContextT holdableInstantiationContext,
		AdvancingServicePlacement<
			? super HoldableServiceT,
			? super HoldableProvisionContextT,
			? super HoldableInstantiationContextT,
			? super HoldableInstanceT,
			? extends HoldableAssignmentExceptionT
		> holdablePlacement
	) throws ExecuteExceptionT, UnheldInstantiationExceptionT, UnheldAssignmentExceptionT, ReleaseExceptionT,
			HoldableInstantiationExceptionT, HoldableAssignmentExceptionT {
		notNull(action, "action");
		if(unheldServices != null) {
			for(ContextPair<? extends UnheldServiceT, ? extends UnheldProvisionContextT> pair : unheldServices) {
				if(pair == null)
					continue;
				UnheldServiceT service = pair.getService();
				UnheldInstanceT instance = service.instantiate(unheldInstantiationContext);
				if(instance != null && unheldPlacement != null)
					unheldPlacement.assignServiceInstance(service, pair.getContext(),
							unheldInstantiationContext, instance);
			}
		}
		ContextServicePlacement<
			ContextInstantiableContextPair<
				? extends HoldableServiceT,
				? extends HoldableProvisionContextT,
				? super HoldableInstantiationContextT,
				? extends HoldableInstanceT,
				? extends HoldableInstantiationExceptionT
			>,
			HoldableInstantiationContextT,
			HoldableInstanceT,
			HoldableAssignmentExceptionT
		> placement;
		if(holdablePlacement == null)
			placement = null;
		else
			placement = (origin, context, service) -> holdablePlacement.assignServiceInstance(origin.getService(),
					origin.getContext(), context, service);
		ContextInstantiableService.withInstances(action, holdableServices, holdableInstantiationContext, placement);
	}

}
