package com.caa.art.mqttdemo.hander;

import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHandler;
import org.springframework.messaging.MessagingException;

public class ReceiveMessageHandler implements MessageHandler {
    @Override
    public void handleMessage(Message<?> message) throws MessagingException {
        String str = (String) message.getPayload();
        System.out.println("接收到消息：" + str);
    }
}

