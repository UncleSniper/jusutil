package org.unclesniper.util.service;

import org.unclesniper.util.Holdable;

public class HoldableHoldableCombinedDynamicServiceRegisterer<
	ReleaseExceptionT extends Exception,
	UnheldServiceT,
	UnheldProvisionContextT,
	HoldableServiceT extends Holdable<ReleaseExceptionT>,
	HoldableProvisionContextT,
	ServiceT extends HoldableServiceT
> extends HoldableCombinedDynamicServiceRegisterer<
	UnheldServiceT,
	UnheldProvisionContextT,
	HoldableServiceT,
	HoldableProvisionContextT,
	ServiceT
> implements GeneralHoldableHoldableCombinedDynamicServiceRegisterer<
	ReleaseExceptionT,
	UnheldServiceT,
	UnheldProvisionContextT,
	HoldableServiceT,
	HoldableProvisionContextT
> {

	public HoldableHoldableCombinedDynamicServiceRegisterer(Class<ServiceT> type, ServiceT service,
			HoldableProvisionContextT context) {
		super(type, service, context);
	}

	public HoldableHoldableCombinedDynamicServiceRegisterer(
		ContextDynamicServiceEntry<ServiceT, ? extends HoldableProvisionContextT> entry
	) {
		super(entry);
	}

	public HoldableHoldableCombinedDynamicServiceRegisterer(DynamicServiceEntry<ServiceT> entry) {
		super(entry);
	}

	@Override
	public void close() throws ReleaseExceptionT {
		ServiceT service = getService();
		if(service != null)
			service.close();
	}

}
