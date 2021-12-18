package org.unclesniper.util.service;

import java.util.List;
import java.util.LinkedList;
import org.unclesniper.util.Holdable;
import org.unclesniper.util.Executable;

import static org.unclesniper.util.ArgUtils.notNull;

public interface ContextInstantiableService<ContextT, InstanceT, InstantiationExceptionT extends Throwable> {

	InstanceT instantiate(ContextT context) throws InstantiationExceptionT;

	@SuppressWarnings("unchecked")
	public static <
		ExecuteExceptionT extends Throwable,
		ReleaseExceptionT extends Exception,
		ContextT,
		InstanceT extends Holdable<? extends ReleaseExceptionT>,
		InstantiationExceptionT extends Throwable,
		ServiceT extends ContextInstantiableService<
			? super ContextT,
			? extends InstanceT,
			? extends InstantiationExceptionT
		>,
		AssignmentExceptionT extends Throwable
	> void withInstances(
		Executable<? extends ExecuteExceptionT> action,
		Iterable<? extends ServiceT> services,
		ContextT context,
		ContextServicePlacement<
			? super ServiceT,
			? super ContextT,
			? super InstanceT,
			? extends AssignmentExceptionT
		> placement
	) throws ExecuteExceptionT, ReleaseExceptionT, InstantiationExceptionT, AssignmentExceptionT {
		notNull(action, "action");
		Throwable ee = null;
		List<InstanceT> instances = null;
		if(services != null) {
			try {
				for(ServiceT service : services) {
					if(service == null)
						continue;
					InstanceT instance = service.instantiate(context);
					if(instance != null) {
						if(instances == null)
							instances = new LinkedList<InstanceT>();
						instances.add(instance);
						if(placement != null)
							placement.assignServiceInstance(service, context, instance);
					}
				}
			}
			catch(Throwable t) {
				ee = t;
			}
		}
		if(ee == null) {
			try {
				action.execute();
			}
			catch(Throwable t) {
				ee = t;
			}
		}
		if(instances != null) {
			for(InstanceT instance : instances) {
				try {
					instance.close();
				}
				catch(Throwable t) {
					if(ee != null)
						ee.addSuppressed(t);
					else
						ee = t;
				}
			}
		}
		if(ee != null)
			throw (ExecuteExceptionT)ee;
	}

}
