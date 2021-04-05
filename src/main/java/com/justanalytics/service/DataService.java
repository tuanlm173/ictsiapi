package com.justanalytics.service;

import com.justanalytics.entity.CarrierVisit;
import com.justanalytics.repository.DataRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class DataService {

    Logger logger = LoggerFactory.getLogger(DataService.class);

    @Autowired
    private DataRepository dataRepository;

    public List<Map<String, Object>> getArbitraryQuery(String query) {
        logger.info("Getting data with query: {}", query);
        return dataRepository.getData(query);
    }

    public String prepareQuery(String container) {
        return String.format("SELECT TOP 10 * FROM %s c", container);
    }
}
