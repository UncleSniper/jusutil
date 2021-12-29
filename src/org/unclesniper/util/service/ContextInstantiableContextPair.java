package org.unclesniper.util.service;

import static org.unclesniper.util.ArgUtils.notNull;

public class ContextInstantiableContextPair<
	ServiceT extends ContextInstantiableService<
		? super InstantiationContextT,
		? extends InstanceT,
		? extends InstantiationExceptionT
	>,
	PairContextT,
	InstantiationContextT,
	InstanceT,
	InstantiationExceptionT extends Throwable
> extends ContextPair<ServiceT, PairContextT>
		implements ContextInstantiableService<InstantiationContextT, InstanceT, InstantiationExceptionT> {

	public ContextInstantiableContextPair(ServiceT service, PairContextT context) {
		super(service, context);
	}

	public ContextInstantiableContextPair(ContextPair<? extends ServiceT, ? extends PairContextT> pair) {
		super(pair);
	}

	@Override
	public InstanceT instantiate(InstantiationContextT context) throws InstantiationExceptionT {
		return getService().instantiate(context);
	}

}
