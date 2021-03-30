package com.justanalytics.service;

import com.justanalytics.entity.CarrierVisit;

import java.util.List;

public interface CarrierVisitService {

    List<CarrierVisit> getTopTenCarrierVisit();

    List<CarrierVisit> getCarrierVisitByTerminalAndDate(String terminalAndDate, Integer top);
}
