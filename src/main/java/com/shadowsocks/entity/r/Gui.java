package com.shadowsocks.entity.r;

import java.util.List;

public class Gui {
    public Gui() {
        this.index = 0;
        this.random = true;
        this.sysProxyMode = 1;
        this.shareOverLan = false;
        this.localPort = 1080;
        this.localAuthPassword = "G5jVaD2mi_bAxAvIoKdp";
        this.dnsServer = "";
        this.reconnectTimes = 2;
        this.balanceAlgorithm = "LowException";
        this.randomInGroup = false;
        this.TTL = 0;
        this.connectTimeout = 5;
        this.proxyRuleMode = 2;
        this.proxyEnable = false;
        this.pacDirectGoProxy = false;
        this.proxyType = 0;
        this.proxyHost = "";
        this.proxyPort = 0;
        this.proxyAuthUser = "";
        this.proxyAuthPass = "";
        this.proxyUserAgent = "";
        this.authUser = "";
        this.authPass = "";
        this.autoBan = false;
        this.sameHostForSameTarget = false;
        this.keepVisitTime = 180;
        this.isHideTips = false;
        this.nodeFeedAutoUpdate = false;
    }

    private List<Configs> configs;
    private Integer index;
    private boolean random;
    private Integer sysProxyMode;
    private boolean shareOverLan;
    private Integer localPort;
    private String localAuthPassword;
    private String dnsServer;
    private Integer reconnectTimes;
    private String balanceAlgorithm;
    private boolean randomInGroup;
    private Integer TTL;
    private Integer connectTimeout;
    private Integer proxyRuleMode;
    private boolean proxyEnable;
    private boolean pacDirectGoProxy;
    private Integer proxyType;
    private String proxyHost;
    private Integer proxyPort;
    private String proxyAuthUser;
    private String proxyAuthPass;
    private String proxyUserAgent;
    private String authUser;
    private String authPass;
    private boolean autoBan;
    private boolean sameHostForSameTarget;
    private Integer keepVisitTime;
    private boolean isHideTips;
    private boolean nodeFeedAutoUpdate;
    private List<ServerSubscribes> serverSubscribes;
    private List<Object> token;
    private List<Object> portMap;

    public List<Configs> getConfigs() {
        return configs;
    }

    public void setConfigs(List<Configs> configs) {
        this.configs = configs;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public boolean isRandom() {
        return random;
    }

    public void setRandom(boolean random) {
        this.random = random;
    }

    public Integer getSysProxyMode() {
        return sysProxyMode;
    }

    public void setSysProxyMode(Integer sysProxyMode) {
        this.sysProxyMode = sysProxyMode;
    }

    public boolean isShareOverLan() {
        return shareOverLan;
    }

    public void setShareOverLan(boolean shareOverLan) {
        this.shareOverLan = shareOverLan;
    }

    public Integer getLocalPort() {
        return localPort;
    }

    public void setLocalPort(Integer localPort) {
        this.localPort = localPort;
    }

    public String getLocalAuthPassword() {
        return localAuthPassword;
    }

    public void setLocalAuthPassword(String localAuthPassword) {
        this.localAuthPassword = localAuthPassword;
    }

    public String getDnsServer() {
        return dnsServer;
    }

    public void setDnsServer(String dnsServer) {
        this.dnsServer = dnsServer;
    }

    public Integer getReconnectTimes() {
        return reconnectTimes;
    }

    public void setReconnectTimes(Integer reconnectTimes) {
        this.reconnectTimes = reconnectTimes;
    }

    public String getBalanceAlgorithm() {
        return balanceAlgorithm;
    }

    public void setBalanceAlgorithm(String balanceAlgorithm) {
        this.balanceAlgorithm = balanceAlgorithm;
    }

    public boolean isRandomInGroup() {
        return randomInGroup;
    }

    public void setRandomInGroup(boolean randomInGroup) {
        this.randomInGroup = randomInGroup;
    }

    public Integer getTTL() {
        return TTL;
    }

    public void setTTL(Integer TTL) {
        this.TTL = TTL;
    }

    public Integer getConnectTimeout() {
        return connectTimeout;
    }

    public void setConnectTimeout(Integer connectTimeout) {
        this.connectTimeout = connectTimeout;
    }

    public Integer getProxyRuleMode() {
        return proxyRuleMode;
    }

    public void setProxyRuleMode(Integer proxyRuleMode) {
        this.proxyRuleMode = proxyRuleMode;
    }

    public boolean isProxyEnable() {
        return proxyEnable;
    }

    public void setProxyEnable(boolean proxyEnable) {
        this.proxyEnable = proxyEnable;
    }

    public boolean isPacDirectGoProxy() {
        return pacDirectGoProxy;
    }

    public void setPacDirectGoProxy(boolean pacDirectGoProxy) {
        this.pacDirectGoProxy = pacDirectGoProxy;
    }

    public Integer getProxyType() {
        return proxyType;
    }

    public void setProxyType(Integer proxyType) {
        this.proxyType = proxyType;
    }

    public String getProxyHost() {
        return proxyHost;
    }

    public void setProxyHost(String proxyHost) {
        this.proxyHost = proxyHost;
    }

    public Integer getProxyPort() {
        return proxyPort;
    }

    public void setProxyPort(Integer proxyPort) {
        this.proxyPort = proxyPort;
    }

    public String getProxyAuthUser() {
        return proxyAuthUser;
    }

    public void setProxyAuthUser(String proxyAuthUser) {
        this.proxyAuthUser = proxyAuthUser;
    }

    public String getProxyAuthPass() {
        return proxyAuthPass;
    }

    public void setProxyAuthPass(String proxyAuthPass) {
        this.proxyAuthPass = proxyAuthPass;
    }

    public String getProxyUserAgent() {
        return proxyUserAgent;
    }

    public void setProxyUserAgent(String proxyUserAgent) {
        this.proxyUserAgent = proxyUserAgent;
    }

    public String getAuthUser() {
        return authUser;
    }

    public void setAuthUser(String authUser) {
        this.authUser = authUser;
    }

    public String getAuthPass() {
        return authPass;
    }

    public void setAuthPass(String authPass) {
        this.authPass = authPass;
    }

    public boolean isAutoBan() {
        return autoBan;
    }

    public void setAutoBan(boolean autoBan) {
        this.autoBan = autoBan;
    }

    public boolean isSameHostForSameTarget() {
        return sameHostForSameTarget;
    }

    public void setSameHostForSameTarget(boolean sameHostForSameTarget) {
        this.sameHostForSameTarget = sameHostForSameTarget;
    }

    public Integer getKeepVisitTime() {
        return keepVisitTime;
    }

    public void setKeepVisitTime(Integer keepVisitTime) {
        this.keepVisitTime = keepVisitTime;
    }

    public boolean isHideTips() {
        return isHideTips;
    }

    public void setHideTips(boolean hideTips) {
        isHideTips = hideTips;
    }

    public boolean isNodeFeedAutoUpdate() {
        return nodeFeedAutoUpdate;
    }

    public void setNodeFeedAutoUpdate(boolean nodeFeedAutoUpdate) {
        this.nodeFeedAutoUpdate = nodeFeedAutoUpdate;
    }

    public List<ServerSubscribes> getServerSubscribes() {
        return serverSubscribes;
    }

    public void setServerSubscribes(List<ServerSubscribes> serverSubscribes) {
        this.serverSubscribes = serverSubscribes;
    }

    public List<Object> getToken() {
        return token;
    }

    public void setToken(List<Object> token) {
        this.token = token;
    }

    public List<Object> getPortMap() {
        return portMap;
    }

    public void setPortMap(List<Object> portMap) {
        this.portMap = portMap;
    }
}
