package org.unclesniper.util.service;

import org.unclesniper.util.Holdable;

public interface GeneralHoldableDynamicServiceRegisterer<
	ReleaseExceptionT extends Exception,
	UpperBoundT extends Holdable<ReleaseExceptionT>
> extends GeneralDynamicServiceRegisterer<UpperBoundT>, Holdable<ReleaseExceptionT> {}
