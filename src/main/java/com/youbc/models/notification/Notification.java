package com.youbc.models.notification;

public class Notification {

    private Integer notificationId;
    private String subjectId;
    private NotificationMessage message;

    public Notification(Integer notificationId, String subjectId, NotificationMessage message) {
        this.notificationId = notificationId;
        this.subjectId = subjectId;
        this.message = message;
    }

    public Integer getNotificationId() {
        return notificationId;
    }

    public void setNotificationId(Integer notificationId) {
        this.notificationId = notificationId;
    }

    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    public NotificationMessage getMessage() {
        return message;
    }

    public void setMessage(NotificationMessage message) {
        this.message = message;
    }

}
