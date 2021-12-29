package org.unclesniper.util.service;

import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Supplier;
import org.unclesniper.util.Holdable;
import org.unclesniper.util.Executable;

import static org.unclesniper.util.ArgUtils.notNull;

public class RegisteringDynamicServiceProvider<
	InnerUnheldServiceT,
	InnerUnheldProvisionContextT,
	InnerHoldableServiceT,
	InnerHoldableProvisionContextT,
	UnheldInstantiationContextT,
	UnheldInstanceT extends Consumer<? super CombinedDynamicServiceRegistry<
		InnerUnheldServiceT,
		InnerUnheldProvisionContextT,
		InnerHoldableServiceT,
		InnerHoldableProvisionContextT
	>>,
	UnheldInstantiationExceptionT extends Throwable,
	OuterUnheldProvisionContextT,
	OuterUnheldServiceT extends ContextInstantiableService<
		? super UnheldInstantiationContextT,
		? extends UnheldInstanceT,
		? extends UnheldInstantiationExceptionT
	>,
	ReleaseExceptionT extends Exception,
	HoldableInstantiationContextT,
	HoldableInstanceT extends Holdable<? extends ReleaseExceptionT>
		& Consumer<? super CombinedDynamicServiceRegistry<
			InnerUnheldServiceT,
			InnerUnheldProvisionContextT,
			InnerHoldableServiceT,
			InnerHoldableProvisionContextT
		>>,
	HoldableInstantiationExceptionT extends Throwable,
	OuterHoldableProvisionContextT,
	OuterHoldableServiceT extends ContextInstantiableService<
		? super HoldableInstantiationContextT,
		? extends HoldableInstanceT,
		? extends HoldableInstantiationExceptionT
	>
> extends AdvancingDynamicServiceProvider<
	UnheldInstantiationContextT,
	UnheldInstanceT,
	UnheldInstantiationExceptionT,
	OuterUnheldProvisionContextT,
	OuterUnheldServiceT,
	ReleaseExceptionT,
	HoldableInstantiationContextT,
	HoldableInstanceT,
	HoldableInstantiationExceptionT,
	OuterHoldableProvisionContextT,
	OuterHoldableServiceT
> {

	public RegisteringDynamicServiceProvider(
		Supplier<? extends Map<? super OuterUnheldProvisionContextT, Object>> unheldContextMapConstructor,
		Supplier<? extends Map<? super OuterHoldableProvisionContextT, Object>> holdableContextMapConstructor
	) {
		super(unheldContextMapConstructor, holdableContextMapConstructor);
	}

	public <ExecuteExceptionT extends Throwable> void advance(
		Executable<? extends ExecuteExceptionT> action,
		UnheldInstantiationContextT unheldInstantiationContext,
		HoldableInstantiationContextT holdableInstantiationContext,
		CombinedDynamicServiceRegistry<
			InnerUnheldServiceT,
			InnerUnheldProvisionContextT,
			InnerHoldableServiceT,
			InnerHoldableProvisionContextT
		> registry
	) throws ExecuteExceptionT, UnheldInstantiationExceptionT, ReleaseExceptionT, HoldableInstantiationExceptionT {
		notNull(registry, "registry");
		advance(
			action,
			unheldInstantiationContext,
			(origin, provisionContext, instantiationContext, service) -> service.accept(registry),
			holdableInstantiationContext,
			(origin, provisionContext, instantiationContext, service) -> service.accept(registry)
		);
	}

}
