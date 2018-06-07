package com.shadowsocks.entity;

public class Hotkey {
	public Hotkey() {
		this.SwitchSystemProxy = "";
		this.SwitchSystemProxyMode = "";
		this.SwitchAllowLan = "";
		this.ShowLogs = "";
		this.ServerMoveUp = "";
		this.ServerMoveDown = "";
	}

	private String SwitchSystemProxy;
	private String SwitchSystemProxyMode;
	private String SwitchAllowLan;
	private String ShowLogs;
	private String ServerMoveUp;
	private String ServerMoveDown;

	public String getSwitchSystemProxy() {
		return SwitchSystemProxy;
	}

	public void setSwitchSystemProxy(String switchSystemProxy) {
		SwitchSystemProxy = switchSystemProxy;
	}

	public String getSwitchSystemProxyMode() {
		return SwitchSystemProxyMode;
	}

	public void setSwitchSystemProxyMode(String switchSystemProxyMode) {
		SwitchSystemProxyMode = switchSystemProxyMode;
	}

	public String getSwitchAllowLan() {
		return SwitchAllowLan;
	}

	public void setSwitchAllowLan(String switchAllowLan) {
		SwitchAllowLan = switchAllowLan;
	}

	public String getShowLogs() {
		return ShowLogs;
	}

	public void setShowLogs(String showLogs) {
		ShowLogs = showLogs;
	}

	public String getServerMoveUp() {
		return ServerMoveUp;
	}

	public void setServerMoveUp(String serverMoveUp) {
		ServerMoveUp = serverMoveUp;
	}

	public String getServerMoveDown() {
		return ServerMoveDown;
	}

	public void setServerMoveDown(String serverMoveDown) {
		ServerMoveDown = serverMoveDown;
	}
}
