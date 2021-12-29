package org.unclesniper.util.service;

@FunctionalInterface
public interface AdvancingServicePlacement<
	OriginT,
	ProvisionContextT,
	InstantiationContextT,
	InstanceT,
	AssignmentExceptionT extends Throwable
> {

	void assignServiceInstance(OriginT origin, ProvisionContextT provisionContext,
			InstantiationContextT instantiationContext, InstanceT service) throws AssignmentExceptionT;

}
