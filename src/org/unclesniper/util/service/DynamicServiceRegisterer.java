package org.unclesniper.util.service;

import static org.unclesniper.util.ArgUtils.notNull;

public class DynamicServiceRegisterer<UpperBoundT, ServiceT extends UpperBoundT>
		extends DynamicServiceEntry<ServiceT> implements GeneralDynamicServiceRegisterer<UpperBoundT> {

	public DynamicServiceRegisterer(Class<ServiceT> type, ServiceT service) {
		super(type, service);
	}

	public DynamicServiceRegisterer(DynamicServiceEntry<ServiceT> entry) {
		super(entry);
	}

	@Override
	public void accept(DynamicServiceRegistry<UpperBoundT> registry) {
		notNull(registry, "registry").setService(getType(), getService());
	}

}
