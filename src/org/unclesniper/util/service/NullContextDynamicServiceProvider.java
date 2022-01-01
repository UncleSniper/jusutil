package org.unclesniper.util.service;

import static org.unclesniper.util.PropertyUtils.requireSet;

public class NullContextDynamicServiceProvider<UpperBoundT, ProvisionExceptionT extends Throwable>
		implements DynamicServiceProvider<UpperBoundT, ProvisionExceptionT> {

	private ContextDynamicServiceProvider<? super UpperBoundT, ?, ? extends ProvisionExceptionT> provider;

	public NullContextDynamicServiceProvider() {}

	public NullContextDynamicServiceProvider(ContextDynamicServiceProvider<
				? super UpperBoundT,
				?,
				? extends ProvisionExceptionT
			> provider) {
		this.provider = provider;
	}

	public ContextDynamicServiceProvider<? super UpperBoundT, ?, ? extends ProvisionExceptionT> getProvider() {
		return provider;
	}

	public void setProvider(ContextDynamicServiceProvider<
				? super UpperBoundT,
				?,
				? extends ProvisionExceptionT
			> provider) {
		this.provider = provider;
	}

	@Override
	public <ServiceT extends UpperBoundT> ServiceT getService(Class<ServiceT> type) throws ProvisionExceptionT {
		return requireSet(provider, "provider", this).getService(type, null);
	}

	@Override
	public <ServiceT extends UpperBoundT> ServiceT requireService(Class<ServiceT> type) throws ProvisionExceptionT {
		return requireSet(provider, "provider", this).requireService(type, null);
	}

}
