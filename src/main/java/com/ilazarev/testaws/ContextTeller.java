package com.ilazarev.testaws;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.stereotype.Component;

import java.lang.invoke.MethodHandles;
import java.util.Arrays;
import java.util.List;

@Component
@Profile("default")
public class ContextTeller implements CommandLineRunner {
    private static final Logger log = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @Autowired
    ApplicationContext applicationContext;

    @Override
    public void run(String... args) {
        log.debug("The names of all beans defined in this application context:");
        final List<String> beanDefinitionNames = Arrays.asList(applicationContext.getBeanDefinitionNames());
//        log.debug("beanDefinitionNames: {}", beanDefinitionNames);

        ConfigurableEnvironment environment = (ConfigurableEnvironment) applicationContext.getEnvironment();
        MutablePropertySources propertySources = environment.getPropertySources();
//        PropertySource propertySource = propertySources.get("applicationConfig: [" + Constants.WEB_APPLICATION_PROPERTIES_CLASSPATH + "]");
//        Map source = (Map) propertySource.getSource();
//        log.debug("Properties from YAML: {}", source);
    }
}