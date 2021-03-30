package com.justanalytics.service;

import com.justanalytics.entity.CarrierVisit;
import com.justanalytics.repository.CarrierVisitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarrierVisitServiceImpl implements CarrierVisitService {

    @Autowired
    CarrierVisitRepository carrierVisitRepository;

    public List<CarrierVisit> getTopTenCarrierVisit() {
        return carrierVisitRepository.getTopTenCarrierVisits();
    }

    @Override
    public List<CarrierVisit> getCarrierVisitByTerminalAndDate(String terminalAndDate, Integer top) {
        return carrierVisitRepository.getCarrierVisitByTerminalAndDate(terminalAndDate, top);

    }
}
