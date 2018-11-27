package com.caa.art.mqttdemo.controller;

import com.caa.art.mqttdemo.service.MqttGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @Autowired
    MqttGateway mqttGateway;

    @RequestMapping(value = "/sendMsg")

    public String sendMsg(@RequestParam String message) {

        //调用网关接口发送消息

        mqttGateway.sendToMqtt(message);
        /*Message<String> messages = MessageBuilder.withPayload(message).build();
        mqttGateway.sendMessage(messages);*/
        return "success";

    }

}