package com.icepoint.restful.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "ipconfig")
@PropertySource(value = "classpath:ipconfig.properties")
public class IpConfig {
    @Value("${ipWhiteList}")
    private String ipWhiteList;

    /**
     * @return ipWhiteList
     */
    public String getIpWhiteList(){
        return ipWhiteList;
    }
}
