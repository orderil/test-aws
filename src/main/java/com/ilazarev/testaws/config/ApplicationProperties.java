package com.ilazarev.testaws.config;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotEmpty;

/**
 * Created by ilazarev on 7/19/19.
 */
@Getter
@Setter
@ToString
@ConfigurationProperties(prefix = "application")
@Component
public class ApplicationProperties {
    @NotEmpty
    private String outputPath;
    @NotEmpty
    private Integer guidObfuscationMultiplier;
    @NotEmpty
    private Integer maxPlansPerUser;
    @NotEmpty
    private String sqliteDbName;
    @NotEmpty
    private String statusFileName;
    @NotEmpty
    private String zipFileName;
}
