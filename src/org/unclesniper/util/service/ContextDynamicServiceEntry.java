package org.unclesniper.util.service;

import static org.unclesniper.util.ArgUtils.notNull;

public class ContextDynamicServiceEntry<ServiceT, ContextT> {

	private final Class<ServiceT> type;

	private final ServiceT service;

	private final ContextT context;

	public ContextDynamicServiceEntry(Class<ServiceT> type, ServiceT service, ContextT context) {
		this.type = notNull(type, "type");
		this.service = service;
		this.context = context;
	}

	public ContextDynamicServiceEntry(ContextDynamicServiceEntry<ServiceT, ? extends ContextT> entry) {
		type = notNull(entry, "entry").type;
		service = entry.service;
		context = entry.context;
	}

	public ContextDynamicServiceEntry(DynamicServiceEntry<ServiceT> entry) {
		type = notNull(notNull(entry, "entry").getType(), "entry.getType()");
		service = entry.getService();
		context = null;
	}

	public Class<ServiceT> getType() {
		return type;
	}

	public ServiceT getService() {
		return service;
	}

	public ContextT getContext() {
		return context;
	}

	public DynamicServiceEntry<ServiceT> dropContext() {
		return new DynamicServiceEntry<ServiceT>(type, service);
	}

}
