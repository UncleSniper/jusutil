package org.unclesniper.util;

import org.unclesniper.util.j8.ThrowingObjectFactory;

import static org.unclesniper.util.PropertyUtils.requireSet;

public class Singleton<ElementT, InstantiationExceptionT extends Throwable> {

	private ThrowingObjectFactory<? extends ElementT, ? extends InstantiationExceptionT> constructor;

	private boolean allowNull;

	private final Object lock = new Object();

	private volatile boolean instantiated;

	private volatile ElementT element;

	public Singleton() {
		this(null, false);
	}

	public Singleton(boolean allowNull) {
		this(null, allowNull);
	}

	public Singleton(ThrowingObjectFactory<? extends ElementT, ? extends InstantiationExceptionT> constructor) {
		this(constructor, false);
	}

	public Singleton(ThrowingObjectFactory<? extends ElementT, ? extends InstantiationExceptionT> constructor,
			boolean allowNull) {
		this.constructor = constructor;
		this.allowNull = allowNull;
	}

	public ThrowingObjectFactory<? extends ElementT, ? extends InstantiationExceptionT> getConstructor() {
		return constructor;
	}

	public void setConstructor(
		ThrowingObjectFactory<? extends ElementT, ? extends InstantiationExceptionT> constructor
	) {
		this.constructor = constructor;
	}

	public boolean isAllowNull() {
		return allowNull;
	}

	public void setAllowNull(boolean allowNull) {
		this.allowNull = allowNull;
	}

	protected ElementT obtain() throws InstantiationExceptionT {
		return requireSet(constructor, "constructor", this).newObject();
	}

	public final ElementT get() throws InstantiationExceptionT {
		if(!instantiated) {
			synchronized(lock) {
				if(!instantiated) {
					element = obtain();
					if(element == null && !allowNull)
						throw new IllegalStateException("Construction of singleton element yielded null, "
								+ "which is not allowed");
					instantiated = true;
				}
			}
		}
		return element;
	}

}
