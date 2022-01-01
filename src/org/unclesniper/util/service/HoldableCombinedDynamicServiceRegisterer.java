package org.unclesniper.util.service;

import static org.unclesniper.util.ArgUtils.notNull;

public class HoldableCombinedDynamicServiceRegisterer<
	UnheldServiceT,
	UnheldProvisionContextT,
	HoldableServiceT,
	HoldableProvisionContextT,
	ServiceT extends HoldableServiceT
> extends ContextDynamicServiceEntry<ServiceT, HoldableProvisionContextT>
		implements GeneralHoldableCombinedDynamicServiceRegisterer<
			UnheldServiceT,
			UnheldProvisionContextT,
			HoldableServiceT,
			HoldableProvisionContextT
		> {

	public HoldableCombinedDynamicServiceRegisterer(Class<ServiceT> type, ServiceT service,
			HoldableProvisionContextT context) {
		super(type, service, context);
	}

	public HoldableCombinedDynamicServiceRegisterer(
		ContextDynamicServiceEntry<ServiceT, ? extends HoldableProvisionContextT> entry
	) {
		super(entry);
	}

	public HoldableCombinedDynamicServiceRegisterer(DynamicServiceEntry<ServiceT> entry) {
		super(entry);
	}

	@Override
	public void accept(
		CombinedDynamicServiceRegistry<
			UnheldServiceT,
			UnheldProvisionContextT,
			HoldableServiceT,
			HoldableProvisionContextT
		> registry
	) {
		notNull(registry, "registry").setHoldableService(getType(), getContext(), getService());
	}

}
