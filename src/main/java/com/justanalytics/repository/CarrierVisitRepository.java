package com.justanalytics.repository;

import com.azure.spring.data.cosmos.repository.CosmosRepository;
import com.azure.spring.data.cosmos.repository.Query;
import com.justanalytics.entity.CarrierVisit;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarrierVisitRepository extends CosmosRepository<CarrierVisit, String> {

    @Query(value = "SELECT TOP 10 * FROM carrier_visit c")
    List<CarrierVisit> getTopTenCarrierVisits();

    @Query(value = "SELECT TOP @top * FROM carrier_visit c WHERE c.partition_key = @partition_key")
    List<CarrierVisit> getCarrierVisitByTerminalAndDate(@Param("partition_key") String partition_key, @Param("top") Integer top);
}
