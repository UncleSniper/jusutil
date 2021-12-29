package org.unclesniper.util.service;

public interface CombinedDynamicServiceRegistry<
	UnheldServiceT,
	UnheldProvisionContextT,
	HoldableServiceT,
	HoldableProvisionContextT
> {

	<ServiceT extends UnheldServiceT> void setUnheldService(Class<ServiceT> type,
			UnheldProvisionContextT context, ServiceT instance);

	<ServiceT extends HoldableServiceT> void setHoldableService(Class<ServiceT> type,
			HoldableProvisionContextT context, ServiceT instance);

}
