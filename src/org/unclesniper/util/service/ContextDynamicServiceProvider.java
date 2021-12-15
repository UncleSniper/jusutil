package org.unclesniper.util.service;

import static org.unclesniper.util.ArgUtils.notNull;

public interface ContextDynamicServiceProvider<UpperBoundT, ContextT, ProvisionExceptionT extends Throwable> {

	<ServiceT extends UpperBoundT> ServiceT getService(Class<ServiceT> type, ContextT context)
			throws ProvisionExceptionT;

	default <ServiceT extends UpperBoundT> ServiceT requireService(Class<ServiceT> type, ContextT context)
			throws ProvisionExceptionT {
		ServiceT service = this.getService(type, context);
		if(service == null)
			throw new IllegalStateException("Don't know how to provide service of type '"
					+ notNull(type, "type").getName() + "' for context: " + context);
		return service;
	}

}
