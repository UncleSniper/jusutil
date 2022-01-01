package org.unclesniper.util.service;

import java.util.function.Consumer;

public interface GeneralHoldableCombinedDynamicServiceRegisterer<
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
