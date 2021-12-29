package org.unclesniper.util.service;

public interface ContextDynamicServiceRegistry<UpperBoundT, ContextT> {

	<ServiceT extends UpperBoundT> void setService(Class<ServiceT> type, ContextT context, ServiceT instance);

}
