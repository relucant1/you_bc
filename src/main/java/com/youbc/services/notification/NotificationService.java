package com.youbc.services.notification;

import com.pusher.rest.Pusher;

import java.util.Collections;
import java.util.Map;

public class NotificationService {
    private Pusher pusher;

    public NotificationService(Pusher pusher) {
        this.pusher = pusher;

    }

    public void triggerNotification(String channel, String event, Object messages) {
        pusher.trigger(
                channel,
                event,
                messages
        );
    }

}
