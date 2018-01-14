package com.youbc.services.notification;

import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@ServerEndpoint("/notificationSocket/{client_id}")
public class NotificationSocketServer {
    private static Set<Session> peers = Collections.synchronizedSet(new HashSet());

    @OnOpen
    public void onOpen(Session session, @PathParam("client_id") String clientId) {
        peers.add(session);
    }

    @OnMessage
    public String onMessage(String message, Session session, @PathParam("client_id") String clientId) {
        System.out.println("received message from client " + clientId);
        for (Session s : peers) {
            try {
                //TODO: implement notification logic
                s.getBasicRemote().sendText(message);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return "message was received by socket mediator and processed: " + message;
    }

    @OnClose
    public void onClose(Session session, @PathParam("client_id") String clientId) {
        peers.remove(session);
    }
}
