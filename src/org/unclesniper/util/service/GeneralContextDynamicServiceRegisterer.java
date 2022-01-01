package org.unclesniper.util.service;

import java.util.function.Consumer;

public interface GeneralContextDynamicServiceRegisterer<UpperBoundT, ContextT>
		extends Consumer<ContextDynamicServiceRegistry<UpperBoundT, ContextT>> {}
