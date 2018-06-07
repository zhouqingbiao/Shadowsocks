package com.shadowsocks.entity;

import java.util.List;

public class Gui {
	public Gui() {
		this.strategy = "com.shadowsocks.strategy.balancing";
		this.index = -1;
		this.global = false;
		this.enabled = true;
		this.shareOverLan = false;
		this.isDefault = false;
		this.localPort = 1080;
		this.pacUrl = null;
		this.useOnlinePac = false;
		this.secureLocalPac = false;
		this.availabilityStatistics = false;
		this.autoCheckUpdate = true;
		this.checkPreRelease = false;
		this.isVerboseLogging = true;
	}

	private List<Configs> configs;
	private String strategy;
	private Integer index;
	private boolean global;
	private boolean enabled;
	private boolean shareOverLan;
	private boolean isDefault;
	private Integer localPort;
	private String pacUrl;
	private boolean useOnlinePac;
	private boolean secureLocalPac;
	private boolean availabilityStatistics;
	private boolean autoCheckUpdate;
	private boolean checkPreRelease;
	private boolean isVerboseLogging;
	private LogViewer logViewer;
	private Proxy proxy;
	private Hotkey hotkey;

	public List<Configs> getConfigs() {
		return configs;
	}

	public void setConfigs(List<Configs> configs) {
		this.configs = configs;
	}

	public String getStrategy() {
		return strategy;
	}

	public void setStrategy(String strategy) {
		this.strategy = strategy;
	}

	public Integer getIndex() {
		return index;
	}

	public void setIndex(Integer index) {
		this.index = index;
	}

	public boolean isGlobal() {
		return global;
	}

	public void setGlobal(boolean global) {
		this.global = global;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public boolean isShareOverLan() {
		return shareOverLan;
	}

	public void setShareOverLan(boolean shareOverLan) {
		this.shareOverLan = shareOverLan;
	}

	public boolean isDefault() {
		return isDefault;
	}

	public void setDefault(boolean isDefault) {
		this.isDefault = isDefault;
	}

	public Integer getLocalPort() {
		return localPort;
	}

	public void setLocalPort(Integer localPort) {
		this.localPort = localPort;
	}

	public String getPacUrl() {
		return pacUrl;
	}

	public void setPacUrl(String pacUrl) {
		this.pacUrl = pacUrl;
	}

	public boolean isUseOnlinePac() {
		return useOnlinePac;
	}

	public void setUseOnlinePac(boolean useOnlinePac) {
		this.useOnlinePac = useOnlinePac;
	}

	public boolean isSecureLocalPac() {
		return secureLocalPac;
	}

	public void setSecureLocalPac(boolean secureLocalPac) {
		this.secureLocalPac = secureLocalPac;
	}

	public boolean isAvailabilityStatistics() {
		return availabilityStatistics;
	}

	public void setAvailabilityStatistics(boolean availabilityStatistics) {
		this.availabilityStatistics = availabilityStatistics;
	}

	public boolean isAutoCheckUpdate() {
		return autoCheckUpdate;
	}

	public void setAutoCheckUpdate(boolean autoCheckUpdate) {
		this.autoCheckUpdate = autoCheckUpdate;
	}

	public boolean isCheckPreRelease() {
		return checkPreRelease;
	}

	public void setCheckPreRelease(boolean checkPreRelease) {
		this.checkPreRelease = checkPreRelease;
	}

	public boolean isVerboseLogging() {
		return isVerboseLogging;
	}

	public void setVerboseLogging(boolean isVerboseLogging) {
		this.isVerboseLogging = isVerboseLogging;
	}

	public LogViewer getLogViewer() {
		return logViewer;
	}

	public void setLogViewer(LogViewer logViewer) {
		this.logViewer = logViewer;
	}

	public Proxy getProxy() {
		return proxy;
	}

	public void setProxy(Proxy proxy) {
		this.proxy = proxy;
	}

	public Hotkey getHotkey() {
		return hotkey;
	}

	public void setHotkey(Hotkey hotkey) {
		this.hotkey = hotkey;
	}
}
