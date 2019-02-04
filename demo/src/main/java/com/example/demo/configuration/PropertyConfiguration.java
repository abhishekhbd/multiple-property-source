package com.example.demo.configuration;

import com.example.demo.property.DemoProperties;
import com.example.demo.propertysource.JsonPropertyFactory;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value = "classpath:application.json", factory = JsonPropertyFactory.class)
@EnableConfigurationProperties(DemoProperties.class)
public class PropertyConfiguration {

    private final DemoProperties properties;

    public PropertyConfiguration(DemoProperties properties){
        this.properties = properties;
    }


}
