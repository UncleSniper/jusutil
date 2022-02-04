package org.unclesniper.util.service;

import java.util.Objects;

import static org.unclesniper.util.ArgUtils.notNull;

public interface ContextExtensibleService<
	ContextT,
	ServiceT extends ContextExtensibleService<ContextT, ServiceT>
> {

	default <ExtensionT extends ContextExtensionPoint<ContextT, ServiceT>>
	ExtensionT getExtensionPoint(Class<ExtensionT> type, ContextT context) {
		return notNull(type, "type").isInstance(this) && Objects.equals(getExtensionContext(), context)
				? type.cast(this) : null;
	}

	default ContextT getExtensionContext() {
		return null;
	}

}
