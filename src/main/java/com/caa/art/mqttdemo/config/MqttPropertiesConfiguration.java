package com.caa.art.mqttdemo.config;

import com.caa.art.mqttdemo.properties.MqttProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
/**
 *  配置类生效配置
 * */
@Configuration
@EnableConfigurationProperties(MqttProperties.class)
public class MqttPropertiesConfiguration {
}
