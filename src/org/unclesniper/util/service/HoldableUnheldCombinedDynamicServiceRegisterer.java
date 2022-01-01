package org.unclesniper.util.service;

import org.unclesniper.util.Holdable;

public class HoldableUnheldCombinedDynamicServiceRegisterer<
	ReleaseExceptionT extends Exception,
	UnheldServiceT extends Holdable<ReleaseExceptionT>,
	UnheldProvisionContextT,
	HoldableServiceT,
	HoldableProvisionContextT,
	ServiceT extends UnheldServiceT
> extends UnheldCombinedDynamicServiceRegisterer<
	UnheldServiceT,
	UnheldProvisionContextT,
	HoldableServiceT,
	HoldableProvisionContextT,
	ServiceT
> implements GeneralHoldableUnheldCombinedDynamicServiceRegisterer<
	ReleaseExceptionT,
	UnheldServiceT,
	UnheldProvisionContextT,
	HoldableServiceT,
	HoldableProvisionContextT
> {

	public HoldableUnheldCombinedDynamicServiceRegisterer(Class<ServiceT> type, ServiceT service,
			UnheldProvisionContextT context) {
		super(type, service, context);
	}

	public HoldableUnheldCombinedDynamicServiceRegisterer(
		ContextDynamicServiceEntry<ServiceT, ? extends UnheldProvisionContextT> entry
	) {
		super(entry);
	}

	@Override
	public void close() throws ReleaseExceptionT {
		ServiceT service = getService();
		if(service != null)
			service.close();
	}

}
