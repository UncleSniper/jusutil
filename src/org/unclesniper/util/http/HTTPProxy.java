package org.unclesniper.util.http;

import java.net.Proxy;

public final class HTTPProxy {

	private String host;

	private int port;

	private Proxy.Type type;

	public HTTPProxy() {}

	public HTTPProxy(String host, int port, Proxy.Type type) {
		this.host = host;
		this.port = port;
		this.type = type;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		if(host != null && host.length() == 0)
			host = null;
		this.host = host;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		if(port > 65535)
			throw new IllegalArgumentException("Port number out of range: " + port);
		if(port < 0)
			port = 0;
		this.port = port;
	}

	public Proxy.Type getType() {
		return type;
	}

	public void setType(Proxy.Type type) {
		this.type = type;
	}

}
