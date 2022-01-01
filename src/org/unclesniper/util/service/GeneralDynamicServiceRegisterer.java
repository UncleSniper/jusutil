package org.unclesniper.util.service;

import java.util.function.Consumer;

public interface GeneralDynamicServiceRegisterer<UpperBoundT>
		extends Consumer<DynamicServiceRegistry<UpperBoundT>> {}
