package org.unclesniper.util.service;

import static org.unclesniper.util.ArgUtils.notNull;

public class DynamicServiceEntry<ServiceT> {

	private final Class<ServiceT> type;

	private final ServiceT service;

	public DynamicServiceEntry(Class<ServiceT> type, ServiceT service) {
		this.type = notNull(type, "type");
		this.service = service;
	}

	public DynamicServiceEntry(DynamicServiceEntry<ServiceT> entry) {
		type = notNull(entry, "entry").type;
		service = entry.service;
	}

	public Class<ServiceT> getType() {
		return type;
	}

	public ServiceT getService() {
		return service;
	}

	public <ContextT> ContextDynamicServiceEntry<ServiceT, ContextT> withContext(ContextT context) {
		return new ContextDynamicServiceEntry<ServiceT, ContextT>(type, service, context);
	}

}
