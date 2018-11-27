package com.caa.art.mqttdemo;

import com.caa.art.mqttdemo.properties.MqttProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@EnableConfigurationProperties(MqttProperties.class)
public class MqttdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MqttdemoApplication.class, args);
    }
}
