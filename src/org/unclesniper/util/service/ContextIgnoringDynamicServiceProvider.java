package org.unclesniper.util.service;

import static org.unclesniper.util.PropertyUtils.requireSet;

public class ContextIgnoringDynamicServiceProvider<UpperBoundT, ContextT, ProvisionExceptionT extends Throwable>
		implements ContextDynamicServiceProvider<UpperBoundT, ContextT, ProvisionExceptionT> {

	private DynamicServiceProvider<? super UpperBoundT, ? extends ProvisionExceptionT> provider;

	public ContextIgnoringDynamicServiceProvider() {}

	public ContextIgnoringDynamicServiceProvider(DynamicServiceProvider<
				? super UpperBoundT,
				? extends ProvisionExceptionT
			> provider) {
		this.provider = provider;
	}

	public DynamicServiceProvider<? super UpperBoundT, ? extends ProvisionExceptionT> getProvider() {
		return provider;
	}

	public void setProvider(DynamicServiceProvider<? super UpperBoundT, ? extends ProvisionExceptionT> provider) {
		this.provider = provider;
	}

	@Override
	public <ServiceT extends UpperBoundT> ServiceT getService(Class<ServiceT> type, ContextT context)
			throws ProvisionExceptionT {
		return requireSet(provider, "provider", this).getService(type);
	}

	@Override
	public <ServiceT extends UpperBoundT> ServiceT requireService(Class<ServiceT> type, ContextT context)
			throws ProvisionExceptionT {
		return requireSet(provider, "provider", this).requireService(type);
	}

}
