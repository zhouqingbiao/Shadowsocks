package com.shadowsocks.entity.r;

public class ServerSubscribes {

    private String URL;
    private String Group;
    private Integer LastUpdateTime;

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public String getGroup() {
        return Group;
    }

    public void setGroup(String group) {
        Group = group;
    }

    public Integer getLastUpdateTime() {
        return LastUpdateTime;
    }

    public void setLastUpdateTime(Integer lastUpdateTime) {
        LastUpdateTime = lastUpdateTime;
    }
}
