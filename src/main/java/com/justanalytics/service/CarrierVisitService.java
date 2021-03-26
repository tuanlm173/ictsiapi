package com.justanalytics.service;

import com.justanalytics.entity.CarrierVisit;
import com.justanalytics.repository.CarrierVisitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarrierVisitService {

    @Autowired
    CarrierVisitRepository carrierVisitRepository;

    public List<CarrierVisit> getCarrierVisit() {
        return carrierVisitRepository.getTopThreeCarrierVisits();
    }
}
