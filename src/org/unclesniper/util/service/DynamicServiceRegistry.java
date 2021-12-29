package org.unclesniper.util.service;

public interface DynamicServiceRegistry<UpperBoundT> {

	<ServiceT extends UpperBoundT> void setService(Class<ServiceT> type, ServiceT instance);

}
