package com.justanalytics.repository;

import com.azure.spring.data.cosmos.repository.CosmosRepository;
import com.justanalytics.entity.Container;
import org.springframework.stereotype.Repository;

@Repository
public interface ContainerRepository extends CosmosRepository<Container, String> {



}
