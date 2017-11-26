package com.db.test;

import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

@ServerEndpoint("/websocketTest")
public class WebSocketTest {
    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy:MM:dd HH:ss");
    @OnMessage
    public void onMessage(String message, Session session) throws IOException, InterruptedException {

        // Print the client message for testing purposes
        System.out.println("Received: " + message);

        while (true) {
            Thread.sleep(5000);
            session.getBasicRemote().sendText("亲爱的，现在是："+sdf.format(new Date()));
        }

    }

    @OnOpen
    public void onOpen() {
        System.out.println("Client connected");
    }

    @OnClose
    public void onClose() {
        System.out.println("Connection closed");
    }
}
