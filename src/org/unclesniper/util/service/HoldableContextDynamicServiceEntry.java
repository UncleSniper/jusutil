package org.unclesniper.util.service;

import org.unclesniper.util.Holdable;

public class HoldableContextDynamicServiceEntry<
	ReleaseExceptionT extends Exception,
	ServiceT extends Holdable<ReleaseExceptionT>,
	ContextT
> extends ContextDynamicServiceEntry<ServiceT, ContextT> implements Holdable<ReleaseExceptionT> {

	public HoldableContextDynamicServiceEntry(Class<ServiceT> type, ServiceT service, ContextT context) {
		super(type, service, context);
	}

	public HoldableContextDynamicServiceEntry(ContextDynamicServiceEntry<ServiceT, ? extends ContextT> entry) {
		super(entry);
	}

	public HoldableContextDynamicServiceEntry(DynamicServiceEntry<ServiceT> entry) {
		super(entry);
	}

	@Override
	public void close() throws ReleaseExceptionT {
		ServiceT service = getService();
		if(service != null)
			service.close();
	}

}
