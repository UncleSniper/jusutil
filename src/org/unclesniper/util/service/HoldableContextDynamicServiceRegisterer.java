package org.unclesniper.util.service;

import org.unclesniper.util.Holdable;

public class HoldableContextDynamicServiceRegisterer<
	ReleaseExceptionT extends Exception,
	UpperBoundT extends Holdable<ReleaseExceptionT>,
	ServiceT extends UpperBoundT,
	ContextT
> extends ContextDynamicServiceRegisterer<UpperBoundT, ServiceT, ContextT> implements Holdable<ReleaseExceptionT> {

	public HoldableContextDynamicServiceRegisterer(Class<ServiceT> type, ServiceT service, ContextT context) {
		super(type, service, context);
	}

	public HoldableContextDynamicServiceRegisterer(ContextDynamicServiceEntry<ServiceT, ? extends ContextT> entry) {
		super(entry);
	}

	public HoldableContextDynamicServiceRegisterer(DynamicServiceEntry<ServiceT> entry) {
		super(entry);
	}

	@Override
	public void close() throws ReleaseExceptionT {
		ServiceT service = getService();
		if(service != null)
			service.close();
	}

}
