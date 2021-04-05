package com.justanalytics.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "databricks")
public class DatabricksProperties {

    private String url;
    private String driverClassName;
}
