package com.justanalytics.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@Configuration
public class DatabricksDataSourceConfig {

    Logger logger = LoggerFactory.getLogger(DatabricksDataSourceConfig.class);

    private DatabricksProperties databricksProperties;

    @Autowired
    public DatabricksDataSourceConfig(DatabricksProperties databricksProperties) {
        this.databricksProperties = databricksProperties;
    }

    @Bean(name = "databricksDataSource")
    @ConfigurationProperties(prefix = "databricks")
    public DataSource getDatabricksDataSource() {

        return DataSourceBuilder
                .create()
                .url(databricksProperties.getUrl())
                .driverClassName(databricksProperties.getDriverClassName())
                .build();
    }

    @Bean(name = "databricksJdbcTemplate")
    public JdbcTemplate getDatabricksJdbcTemplate(@Qualifier("databricksDataSource") DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }
}
