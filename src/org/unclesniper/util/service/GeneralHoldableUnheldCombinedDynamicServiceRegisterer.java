package org.unclesniper.util.service;

import org.unclesniper.util.Holdable;

public interface GeneralHoldableUnheldCombinedDynamicServiceRegisterer<
	ReleaseExceptionT extends Exception,
	UnheldServiceT extends Holdable<ReleaseExceptionT>,
	UnheldProvisionContextT,
	HoldableServiceT,
	HoldableProvisionContextT
> extends GeneralUnheldCombinedDynamicServiceRegisterer<
	UnheldServiceT,
	UnheldProvisionContextT,
	HoldableServiceT,
	HoldableProvisionContextT
>, Holdable<ReleaseExceptionT> {}
