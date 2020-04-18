package com.ilazarev.testaws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication(scanBasePackages = {"com.ilazarev.testaws"}, exclude={DataSourceAutoConfiguration.class})
public class Application extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

/*
    // ATTN: This gets executed only when running from within an external tomcat.
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(TestAwsApplication.class).properties(getProperties());
    }

    private Properties getProperties() {
        Properties props = new Properties();
        props.put("spring.config.location", Constants.WEB_APPLICATION_PROPERTIES_CLASSPATH);
        return props;
    }
*/

}
