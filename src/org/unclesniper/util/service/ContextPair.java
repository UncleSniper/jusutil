package org.unclesniper.util.service;

import static org.unclesniper.util.ArgUtils.notNull;

public class ContextPair<ServiceT, ContextT> {

	private final ServiceT service;

	private final ContextT context;

	public ContextPair(ServiceT service, ContextT context) {
		this.service = notNull(service, "service");
		this.context = context;
	}

	public ContextPair(ContextPair<? extends ServiceT, ? extends ContextT> pair) {
		service = notNull(pair, "pair").service;
		context = pair.context;
	}

	public ServiceT getService() {
		return service;
	}

	public ContextT getContext() {
		return context;
	}

}
