package com.justanalytics.controller;

import com.justanalytics.entity.CarrierVisit;
import com.justanalytics.response.RestEnvelope;
import com.justanalytics.service.CarrierVisitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DataController {

    private final CarrierVisitService carrierVisitService;

    @Autowired
    public DataController(CarrierVisitService carrierVisitService) {
        this.carrierVisitService = carrierVisitService;
    }

    @GetMapping(path = "/api/v1/getTopCarrierVisit", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<RestEnvelope> getTopCarrierVisit() {
        List<CarrierVisit> topTenCarrierVisit = carrierVisitService.getTopTenCarrierVisit();
        return ResponseEntity.ok(RestEnvelope.of(topTenCarrierVisit));
    }

    @GetMapping(path = "/api/v1/getCarrierVisitByTerminalAndDate", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<RestEnvelope> getCarrierVisitByTerminalAndDate(@RequestParam(value = "terminal-date") String terminalAndDate,
                                                                         @RequestParam(value = "top") Integer top) {
        List<CarrierVisit> carrierVisitByTerminalAndDate = carrierVisitService.getCarrierVisitByTerminalAndDate(terminalAndDate, top);
        return ResponseEntity.ok(RestEnvelope.of(carrierVisitByTerminalAndDate));
    }

//    @GetMapping(path = "/api/v1/getQueryBasic", produces = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity<RestEnvelope> getArbitraryQueryForCarrierVisit(@RequestParam(value = "container") String container) {
//        String query = dataService.prepareQuery(container);
//        List<Map<String, Object>> results = dataService.getArbitraryQuery(query);
//        return ResponseEntity.ok(RestEnvelope.of(results));
//    }
}
