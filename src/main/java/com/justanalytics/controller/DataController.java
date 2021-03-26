package com.justanalytics.controller;

import com.justanalytics.entity.CarrierVisit;
import com.justanalytics.response.CollectionResponse;
import com.justanalytics.service.CarrierVisitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DataController {

    private final CarrierVisitService carrierVisitService;

    @Autowired
    public DataController(CarrierVisitService carrierVisitService) {
        this.carrierVisitService = carrierVisitService;
    }

    @GetMapping(path = "/api/v1/getTopCarrierVsit", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<CarrierVisit>> getTopCarrierVisit() {
        List<CarrierVisit> carrierVisit = carrierVisitService.getCarrierVisit();
        return new ResponseEntity<>(carrierVisit, HttpStatus.OK);
    }
}
