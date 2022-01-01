package org.unclesniper.util.service;

import static org.unclesniper.util.ArgUtils.notNull;

public class ContextDynamicServiceRegisterer<UpperBoundT, ServiceT extends UpperBoundT, ContextT>
		extends ContextDynamicServiceEntry<ServiceT, ContextT>
		implements GeneralContextDynamicServiceRegisterer<UpperBoundT, ContextT> {

	public ContextDynamicServiceRegisterer(Class<ServiceT> type, ServiceT service, ContextT context) {
		super(type, service, context);
	}

	public ContextDynamicServiceRegisterer(ContextDynamicServiceEntry<ServiceT, ? extends ContextT> entry) {
		super(entry);
	}

	public ContextDynamicServiceRegisterer(DynamicServiceEntry<ServiceT> entry) {
		super(entry);
	}

	@Override
	public void accept(ContextDynamicServiceRegistry<UpperBoundT, ContextT> registry) {
		notNull(registry, "registry").setService(getType(), getContext(), getService());
	}

}
