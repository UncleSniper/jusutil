package org.unclesniper.util.service;

import static org.unclesniper.util.ArgUtils.notNull;

public interface ExtensibleService<ServiceT extends ExtensibleService<ServiceT>> {

	default <ExtensionT extends ExtensionPoint<ServiceT>> ExtensionT getExtensionPoint(Class<ExtensionT> type) {
		return notNull(type, "type").isInstance(this) ? type.cast(this) : null;
	}

}
