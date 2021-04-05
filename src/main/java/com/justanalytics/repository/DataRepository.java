package com.justanalytics.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class DataRepository {

    @Autowired
    @Qualifier("databricksJdbcTemplate")
    private JdbcTemplate jdbcTemplate;

    public List<Map<String, Object>> getData(String query) {
        return jdbcTemplate.queryForList(query);
    }



}

