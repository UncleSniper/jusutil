package org.unclesniper.util.service;

import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Supplier;
import org.unclesniper.util.Holdable;
import org.unclesniper.util.Executable;

import static org.unclesniper.util.ArgUtils.notNull;

public class RegisteringDynamicServiceProvider<
	UnheldRegistryT,
	UnheldInstantiationContextT,
	UnheldInstanceT extends Consumer<? super UnheldRegistryT>,
	UnheldInstantiationExceptionT extends Throwable,
	UnheldProvisionContextT,
	UnheldServiceT extends ContextInstantiableService<
		? super UnheldInstantiationContextT,
		? extends UnheldInstanceT,
		? extends UnheldInstantiationExceptionT
	>,
	ReleaseExceptionT extends Exception,
	HoldableRegistryT,
	HoldableInstantiationContextT,
	HoldableInstanceT extends Holdable<? extends ReleaseExceptionT> & Consumer<? super HoldableRegistryT>,
	HoldableInstantiationExceptionT extends Throwable,
	HoldableProvisionContextT,
	HoldableServiceT extends ContextInstantiableService<
		? super HoldableInstantiationContextT,
		? extends HoldableInstanceT,
		? extends HoldableInstantiationExceptionT
	>
> extends AdvancingDynamicServiceProvider<
	UnheldInstantiationContextT,
	UnheldInstanceT,
	UnheldInstantiationExceptionT,
	UnheldProvisionContextT,
	UnheldServiceT,
	ReleaseExceptionT,
	HoldableInstantiationContextT,
	HoldableInstanceT,
	HoldableInstantiationExceptionT,
	HoldableProvisionContextT,
	HoldableServiceT
> {

	public RegisteringDynamicServiceProvider(
		Supplier<? extends Map<? super UnheldProvisionContextT, Object>> unheldContextMapConstructor,
		Supplier<? extends Map<? super HoldableProvisionContextT, Object>> holdableContextMapConstructor
	) {
		super(unheldContextMapConstructor, holdableContextMapConstructor);
	}

	public <ExecuteExceptionT extends Throwable> void advance(
		Executable<? extends ExecuteExceptionT> action,
		UnheldInstantiationContextT unheldInstantiationContext,
		HoldableInstantiationContextT holdableInstantiationContext,
		UnheldRegistryT unheldRegistry,
		HoldableRegistryT holdableRegistry
	) throws ExecuteExceptionT, UnheldInstantiationExceptionT, ReleaseExceptionT, HoldableInstantiationExceptionT {
		notNull(unheldRegistry, "unheldRegistry");
		notNull(holdableRegistry, "holdableRegistry");
		advance(
			action,
			unheldInstantiationContext,
			(origin, provisionContext, instantiationContext, service) -> service.accept(unheldRegistry),
			holdableInstantiationContext,
			(origin, provisionContext, instantiationContext, service) -> service.accept(holdableRegistry)
		);
	}

}
