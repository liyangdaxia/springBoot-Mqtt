package com.caa.art.mqttdemo.properties;


import com.caa.art.mqttdemo.entity.MqttInboundProperties;
import com.caa.art.mqttdemo.entity.MqttOutboundProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
/**
 * MqttProperties配置类（读取yml)
 *
 * */
@ConfigurationProperties(prefix = "com.mqtt")
public class MqttProperties {
    private MqttInboundProperties inbound;
    private MqttOutboundProperties outbound;
    public MqttInboundProperties getInbound() {
        return inbound;
    }
    public void setInbound(MqttInboundProperties inbound) {
        this.inbound = inbound;
    }
    public MqttOutboundProperties getOutbound() {
        return outbound;
    }
    public void setOutbound(MqttOutboundProperties outbound) {
        this.outbound = outbound;
    }
}
