package org.unclesniper.util.service;

import java.util.function.Consumer;

import static org.unclesniper.util.ArgUtils.notNull;

public class UnheldCombinedDynamicServiceRegisterer<
	UnheldServiceT,
	UnheldProvisionContextT,
	HoldableServiceT,
	HoldableProvisionContextT,
	ServiceT extends UnheldServiceT
> extends ContextDynamicServiceEntry<ServiceT, UnheldProvisionContextT>
		implements Consumer<CombinedDynamicServiceRegistry<
			UnheldServiceT,
			UnheldProvisionContextT,
			HoldableServiceT,
			HoldableProvisionContextT
		>> {

	public UnheldCombinedDynamicServiceRegisterer(Class<ServiceT> type, ServiceT service,
			UnheldProvisionContextT context) {
		super(type, service, context);
	}

	public UnheldCombinedDynamicServiceRegisterer(
		ContextDynamicServiceEntry<ServiceT, ? extends UnheldProvisionContextT> entry
	) {
		super(entry);
	}

	public UnheldCombinedDynamicServiceRegisterer(DynamicServiceEntry<ServiceT> entry) {
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
		notNull(registry, "registry").setUnheldService(getType(), getContext(), getService());
	}

}
