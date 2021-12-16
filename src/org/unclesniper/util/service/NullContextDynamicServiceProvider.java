package org.unclesniper.util.service;

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
		if(provider == null)
			throw new IllegalStateException("No inner service provider has been set");
		return provider.getService(type, null);
	}

	@Override
	public <ServiceT extends UpperBoundT> ServiceT requireService(Class<ServiceT> type) throws ProvisionExceptionT {
		if(provider == null)
			throw new IllegalStateException("No inner service provider has been set");
		return provider.requireService(type, null);
	}

}
