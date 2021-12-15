package org.unclesniper.util.service;

@FunctionalInterface
public interface ServicePlacement<OriginT, InstanceT, AssignmentExceptionT extends Throwable> {

	void assignServiceInstance(OriginT origin, InstanceT service) throws AssignmentExceptionT;

}
