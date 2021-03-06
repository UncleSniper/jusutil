package org.unclesniper.util.service;

import static org.unclesniper.util.ArgUtils.notNull;

public interface DynamicServiceProvider<UpperBoundT, ProvisionExceptionT extends Throwable> {

	<ServiceT extends UpperBoundT> ServiceT getService(Class<ServiceT> type) throws ProvisionExceptionT;

	default <ServiceT extends UpperBoundT> ServiceT requireService(Class<ServiceT> type)
			throws ProvisionExceptionT {
		ServiceT service = this.getService(type);
		if(service == null)
			throw new IllegalStateException("Don't know how to provide service of type '"
					+ notNull(type, "type").getName() + '\'');
		return service;
	}

}
