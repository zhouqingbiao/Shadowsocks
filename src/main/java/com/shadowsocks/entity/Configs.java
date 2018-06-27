package com.shadowsocks.entity;

public class Configs {
    private String server;
    private Integer server_port;
    private String password;
    private String method;
    private String plugin;
    private String plugin_opts;
    private String plugin_args;
    private String remarks;
    private Integer timeout;

    public Configs() {
        this.plugin = "";
        this.plugin_opts = "";
        this.plugin_args = "";
        this.remarks = "";
        this.timeout = 5;
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

    public String getPlugin() {
        return plugin;
    }

    public void setPlugin(String plugin) {
        this.plugin = plugin;
    }

    public String getPlugin_opts() {
        return plugin_opts;
    }

    public void setPlugin_opts(String plugin_opts) {
        this.plugin_opts = plugin_opts;
    }

    public String getPlugin_args() {
        return plugin_args;
    }

    public void setPlugin_args(String plugin_args) {
        this.plugin_args = plugin_args;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Integer getTimeout() {
        return timeout;
    }

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }
}
