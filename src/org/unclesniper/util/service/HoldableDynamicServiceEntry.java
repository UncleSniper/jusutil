package org.unclesniper.util.service;

import org.unclesniper.util.Holdable;

public class HoldableDynamicServiceEntry<
	ReleaseExceptionT extends Exception,
	ServiceT extends Holdable<ReleaseExceptionT>
> extends DynamicServiceEntry<ServiceT> implements Holdable<ReleaseExceptionT> {

	public HoldableDynamicServiceEntry(Class<ServiceT> type, ServiceT service) {
		super(type, service);
	}

	public HoldableDynamicServiceEntry(DynamicServiceEntry<ServiceT> entry) {
		super(entry);
	}

	@Override
	public void close() throws ReleaseExceptionT {
		ServiceT service = getService();
		if(service != null)
			service.close();
	}

}
