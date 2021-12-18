package org.unclesniper.util.service;

@FunctionalInterface
public interface ContextServicePlacement<OriginT, ContextT, InstanceT, AssignmentExceptionT extends Throwable> {

	void assignServiceInstance(OriginT origin, ContextT context, InstanceT service) throws AssignmentExceptionT;

}
