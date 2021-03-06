package org.unclesniper.util.service;

public class InstantiableContextPair<
	ServiceT extends InstantiableService<
		? extends InstanceT,
		? extends InstantiationExceptionT
	>,
	PairContextT,
	InstanceT,
	InstantiationExceptionT extends Throwable
> extends ContextPair<ServiceT, PairContextT> implements InstantiableService<InstanceT, InstantiationExceptionT> {

	public InstantiableContextPair(ServiceT service, PairContextT context) {
		super(service, context);
	}

	public InstantiableContextPair(ContextPair<? extends ServiceT, ? extends PairContextT> pair) {
		super(pair);
	}

	@Override
	public InstanceT instantiate() throws InstantiationExceptionT {
		return getService().instantiate();
	}

}
