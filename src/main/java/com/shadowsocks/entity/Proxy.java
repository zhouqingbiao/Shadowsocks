package com.shadowsocks.entity;

public class Proxy {
	public Proxy() {
		this.useProxy = false;
		this.proxyType = 0;
		this.proxyServer = "";
		this.proxyPort = 0;
		this.proxyTimeout = 3;
	}

	private boolean useProxy;
	private Integer proxyType;
	private String proxyServer;
	private Integer proxyPort;
	private Integer proxyTimeout;

	public boolean isUseProxy() {
		return useProxy;
	}

	public void setUseProxy(boolean useProxy) {
		this.useProxy = useProxy;
	}

	public Integer getProxyType() {
		return proxyType;
	}

	public void setProxyType(Integer proxyType) {
		this.proxyType = proxyType;
	}

	public String getProxyServer() {
		return proxyServer;
	}

	public void setProxyServer(String proxyServer) {
		this.proxyServer = proxyServer;
	}

	public Integer getProxyPort() {
		return proxyPort;
	}

	public void setProxyPort(Integer proxyPort) {
		this.proxyPort = proxyPort;
	}

	public Integer getProxyTimeout() {
		return proxyTimeout;
	}

	public void setProxyTimeout(Integer proxyTimeout) {
		this.proxyTimeout = proxyTimeout;
	}
}
