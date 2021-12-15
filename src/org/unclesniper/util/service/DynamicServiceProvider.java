package org.unclesniper.util.service;

import static org.unclesniper.util.ArgUtils.notNull;

public interface DynamicServiceProvider<ProvisionExceptionT extends Throwable> {

	<ServiceT> ServiceT getService(Class<ServiceT> type) throws ProvisionExceptionT;

	default <ServiceT> ServiceT requireService(Class<ServiceT> type) throws ProvisionExceptionT {
		ServiceT service = this.getService(type);
		if(service == null)
			throw new IllegalStateException("Don't know how to provide service of type '"
					+ notNull(type, "type").getName() + '\'');
		return service;
	}

}
