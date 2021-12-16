package org.unclesniper.util.service;

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
		if(provider == null)
			throw new IllegalStateException("No inner service provider has been set");
		return provider.getService(type);
	}

	@Override
	public <ServiceT extends UpperBoundT> ServiceT requireService(Class<ServiceT> type, ContextT context)
			throws ProvisionExceptionT {
		if(provider == null)
			throw new IllegalStateException("No inner service provider has been set");
		return provider.requireService(type);
	}

}
