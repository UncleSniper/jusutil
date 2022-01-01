package org.unclesniper.util.service;

import org.unclesniper.util.Holdable;

public interface GeneralHoldableContextDynamicServiceRegisterer<
	ReleaseExceptionT extends Exception,
	UpperBoundT extends Holdable<ReleaseExceptionT>,
	ContextT
> extends GeneralContextDynamicServiceRegisterer<UpperBoundT, ContextT>, Holdable<ReleaseExceptionT> {}
