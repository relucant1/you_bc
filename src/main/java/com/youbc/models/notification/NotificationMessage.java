package com.youbc.models.notification;

public class NotificationMessage {
    private String wechatId;
    private String username;
    private String thumbnail_image_url;

    public NotificationMessage(String wechatId, String username, String thumbnail_image_url) {
        this.wechatId = wechatId;
        this.username = username;
        this.thumbnail_image_url = thumbnail_image_url;
    }

    public String getWechatId() {
        return wechatId;
    }

    public void setWechatId(String wechatId) {
        this.wechatId = wechatId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getThumbnail_image_url() {
        return thumbnail_image_url;
    }

    public void setThumbnail_image_url(String thumbnail_image_url) {
        this.thumbnail_image_url = thumbnail_image_url;
    }

}
