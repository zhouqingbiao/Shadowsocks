package com.shadowsocks.entity.r;

public class Configs {
	public Configs() {
		this.remarks = "";
		this.id = "";
		this.server_udp_port = 0;
		this.protocol = "origin";
		this.protocolparam = "";
		this.obfs = "plain";
		this.obfsparam = "";
		this.remarks_base64 = "";
		this.group = "";
		this.enable = true;
		this.udp_over_tcp = false;
	}

	private String remarks;
	private String id;
	private String server;
	private Integer server_port;
	private Integer server_udp_port;
	private String password;
	private String method;
	private String protocol;
	private String protocolparam;
	private String obfs;
	private String obfsparam;
	private String remarks_base64;
	private String group;
	private boolean enable;
	private boolean udp_over_tcp;

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getServer() {
		return server;
	}

	public void setServer(String server) {
		this.server = server;
	}

	public Integer getServer_port() {
		return server_port;
	}

	public void setServer_port(Integer server_port) {
		this.server_port = server_port;
	}

	public Integer getServer_udp_port() {
		return server_udp_port;
	}

	public void setServer_udp_port(Integer server_udp_port) {
		this.server_udp_port = server_udp_port;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public String getProtocol() {
		return protocol;
	}

	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}

	public String getProtocolparam() {
		return protocolparam;
	}

	public void setProtocolparam(String protocolparam) {
		this.protocolparam = protocolparam;
	}

	public String getObfs() {
		return obfs;
	}

	public void setObfs(String obfs) {
		this.obfs = obfs;
	}

	public String getObfsparam() {
		return obfsparam;
	}

	public void setObfsparam(String obfsparam) {
		this.obfsparam = obfsparam;
	}

	public String getRemarks_base64() {
		return remarks_base64;
	}

	public void setRemarks_base64(String remarks_base64) {
		this.remarks_base64 = remarks_base64;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public boolean isEnable() {
		return enable;
	}

	public void setEnable(boolean enable) {
		this.enable = enable;
	}

	public boolean isUdp_over_tcp() {
		return udp_over_tcp;
	}

	public void setUdp_over_tcp(boolean udp_over_tcp) {
		this.udp_over_tcp = udp_over_tcp;
	}
}