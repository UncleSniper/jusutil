package org.unclesniper.util.service;

import java.util.function.Consumer;

public interface GeneralUnheldCombinedDynamicServiceRegisterer<
	UnheldServiceT,
	UnheldProvisionContextT,
	HoldableServiceT,
	HoldableProvisionContextT
> extends Consumer<CombinedDynamicServiceRegistry<
	UnheldServiceT,
	UnheldProvisionContextT,
	HoldableServiceT,
	HoldableProvisionContextT
>> {}
