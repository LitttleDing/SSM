package com.db.redis;

import org.apache.axis2.databinding.types.xsd.String;
import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.listener.adapter.MessageListenerAdapter;

public class RedisMessageListener extends MessageListenerAdapter {
    @Override
    public void onMessage(Message message, byte[] pattern) {
         System.out.println(message.getBody().toString());
    }
}
