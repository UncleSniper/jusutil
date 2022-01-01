package org.unclesniper.util.service;

import org.unclesniper.util.Holdable;

public class HoldableDynamicServiceRegisterer<
	ReleaseExceptionT extends Exception,
	UpperBoundT extends Holdable<ReleaseExceptionT>,
	ServiceT extends UpperBoundT
> extends DynamicServiceRegisterer<UpperBoundT, ServiceT>
		implements GeneralHoldableDynamicServiceRegisterer<ReleaseExceptionT, UpperBoundT> {

	public HoldableDynamicServiceRegisterer(Class<ServiceT> type, ServiceT service) {
		super(type, service);
	}

	public HoldableDynamicServiceRegisterer(DynamicServiceEntry<ServiceT> entry) {
		super(entry);
	}

	@Override
	public void close() throws ReleaseExceptionT {
		ServiceT service = getService();
		if(service != null)
			service.close();
	}

}
