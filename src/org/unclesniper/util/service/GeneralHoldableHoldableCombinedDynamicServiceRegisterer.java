package org.unclesniper.util.service;

import org.unclesniper.util.Holdable;

public interface GeneralHoldableHoldableCombinedDynamicServiceRegisterer<
	ReleaseExceptionT extends Exception,
	UnheldServiceT,
	UnheldProvisionContextT,
	HoldableServiceT extends Holdable<ReleaseExceptionT>,
	HoldableProvisionContextT
> extends GeneralHoldableCombinedDynamicServiceRegisterer<
	UnheldServiceT,
	UnheldProvisionContextT,
	HoldableServiceT,
	HoldableProvisionContextT
>, Holdable<ReleaseExceptionT> {}
