package com.justanalytics.repository;

import com.azure.spring.data.cosmos.repository.CosmosRepository;
import com.azure.spring.data.cosmos.repository.Query;
import com.justanalytics.entity.CarrierVisit;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarrierVisitRepository extends CosmosRepository<CarrierVisit, String> {

    @Query(value = "SELECT TOP 3 * FROM carrier_visit c")
    List<CarrierVisit> getTopThreeCarrierVisits();


}
