package com.example.demo.propertysource;

import org.springframework.core.env.PropertySource;

public class JPAPropertySource extends PropertySource<JPARepositpry> {

    public JPAPropertySource(String name, JPARepositpry source) {
        super(name, source);
    }

    public JPAPropertySource(String name) {
        super(name);
    }

    @Override
    public Object getProperty(String s) {
        if(s.equalsIgnoreCase("country"))
            return source.getCountry("");
        return null;
    }
}
