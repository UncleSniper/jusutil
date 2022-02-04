package org.unclesniper.util;

public final class SystemProperties {

	public static final String JAVA_VERSION = System.getProperty("java.version");

	public static final String JAVA_VENDOR = System.getProperty("java.vendor");

	public static final String JAVA_VENDOR_URL = System.getProperty("java.vendor.url");

	public static final String JAVA_HOME = System.getProperty("java.home");

	public static final String JVM_SPEC_VERSION = System.getProperty("java.vm.specification.version");

	public static final String JVM_SPEC_VENDOR = System.getProperty("java.vm.specification.vendor");

	public static final String JVM_SPEC_NAME = System.getProperty("java.vm.specification.name");

	public static final String JVM_VERSION = System.getProperty("java.vm.version");

	public static final String JVM_VENDOR = System.getProperty("java.vm.vendor");

	public static final String JVM_NAME = System.getProperty("java.vm.name");

	public static final String JAVA_SPEC_VERSION = System.getProperty("java.specification.version");

	public static final String JAVA_SPEC_VENDOR = System.getProperty("java.specification.vendor");

	public static final String JAVA_SPEC_NAME = System.getProperty("java.specification.name");

	public static final String JAVA_CLASS_VERSION = System.getProperty("java.class.version");

	public static final String JAVA_CLASS_PATH = System.getProperty("java.class.path");

	public static final String JAVA_LIBRARY_PATH = System.getProperty("java.library.path");

	public static final String JAVA_IO_TMPDIR = System.getProperty("java.io.tmpdir");

	public static final String JAVA_COMPILER = System.getProperty("java.compiler");

	public static final String OS_NAME = System.getProperty("os.name");

	public static final String OS_ARCH = System.getProperty("os.arch");

	public static final String OS_VERSION = System.getProperty("os.version");

	public static final String FILE_SEPARATOR = System.getProperty("file.separator");

	public static final String PATH_SEPARATOR = System.getProperty("path.separator");

	public static final String LINE_SEPARATOR = System.getProperty("line.separator");

	public static final String USER_NAME = System.getProperty("user.name");

	public static final String USER_HOME = System.getProperty("user.home");

	public static final String USER_DIR = System.getProperty("user.dir");

	private SystemProperties() {}

}
