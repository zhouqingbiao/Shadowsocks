package com.shadowsocks.entity;

public class LogViewer {
    private boolean topMost;
    private boolean wrapText;
    private boolean toolbarShown;
    private String Font;
    private String BackgroundColor;
    private String TextColor;

    public LogViewer() {
        this.topMost = false;
        this.wrapText = false;
        this.toolbarShown = false;
        this.Font = "Consolas, 8pt";
        this.BackgroundColor = "Black";
        this.TextColor = "White";
    }

    public boolean isTopMost() {
        return topMost;
    }

    public void setTopMost(boolean topMost) {
        this.topMost = topMost;
    }

    public boolean isWrapText() {
        return wrapText;
    }

    public void setWrapText(boolean wrapText) {
        this.wrapText = wrapText;
    }

    public boolean isToolbarShown() {
        return toolbarShown;
    }

    public void setToolbarShown(boolean toolbarShown) {
        this.toolbarShown = toolbarShown;
    }

    public String getFont() {
        return Font;
    }

    public void setFont(String font) {
        Font = font;
    }

    public String getBackgroundColor() {
        return BackgroundColor;
    }

    public void setBackgroundColor(String backgroundColor) {
        BackgroundColor = backgroundColor;
    }

    public String getTextColor() {
        return TextColor;
    }

    public void setTextColor(String textColor) {
        TextColor = textColor;
    }
}
