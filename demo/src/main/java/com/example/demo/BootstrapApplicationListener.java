package com.example.demo;

import com.example.demo.propertysource.JPAPropertySource;
import com.example.demo.propertysource.JPARepositpry;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * https://stackoverflow.com/questions/39161644/plug-into-the-hierarchy-of-spring-boot-property-sources
   https://github.com/griffio/redis-property-source
 */

public class BootstrapApplicationListener implements
        ApplicationContextInitializer<ConfigurableApplicationContext> {


        private static final String PROPERTY_SOURCE_NAME = "integrationTestProps";

        @Override
        public void initialize(final ConfigurableApplicationContext applicationContext) {
            ConfigurableEnvironment environment = applicationContext.getEnvironment();
            environment.getPropertySources().addLast(new JPAPropertySource("JPAPropertySource", new JPARepositpry()));
        }

}
