package org.unclesniper.util;

import static org.unclesniper.util.ArgUtils.notNull;

@FunctionalInterface
public interface Holdable<ReleaseExceptionT extends Exception> extends AutoCloseable {

	@Override
	void close() throws ReleaseExceptionT;

	@SuppressWarnings("unchecked")
	public static <ExecuteExceptionT extends Throwable, ReleaseExceptionT extends Exception> void holding(
		Executable<? extends ExecuteExceptionT> action,
		Iterable<? extends Holdable<? extends ReleaseExceptionT>> resources
	) throws ExecuteExceptionT, ReleaseExceptionT {
		Throwable ee = null;
		try {
			notNull(action, "action").execute();
		}
		catch(Throwable t) {
			ee = t;
		}
		if(resources != null) {
			for(Holdable<? extends ReleaseExceptionT> holdable : resources) {
				if(holdable == null)
					continue;
				try {
					holdable.close();
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
