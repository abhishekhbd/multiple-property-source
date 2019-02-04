package com.example.demo.property;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties
public class DemoProperties {

    private String country;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
