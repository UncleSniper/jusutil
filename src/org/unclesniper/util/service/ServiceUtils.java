package org.unclesniper.util.service;

import static org.unclesniper.util.ArgUtils.notNull;

public final class ServiceUtils {

	private ServiceUtils() {}

	public static <UpperBoundT, ProvisionExceptionT extends Throwable>
	DynamicServiceProvider<UpperBoundT, ProvisionExceptionT> withNullContext(ContextDynamicServiceProvider<
		? super UpperBoundT,
		?,
		? extends ProvisionExceptionT
	> provider) {
		notNull(provider, "provider");
		return new NullContextDynamicServiceProvider<UpperBoundT, ProvisionExceptionT>(provider);
	}

	public static <UpperBoundT, ContextT, ProvisionExceptionT extends Throwable>
	ContextDynamicServiceProvider<UpperBoundT, ContextT, ProvisionExceptionT> ignoreContext(DynamicServiceProvider<
		? super UpperBoundT,
		? extends ProvisionExceptionT
	> provider) {
		notNull(provider, "provider");
		return new ContextIgnoringDynamicServiceProvider<UpperBoundT, ContextT, ProvisionExceptionT>(provider);
	}

}
