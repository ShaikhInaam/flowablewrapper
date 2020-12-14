package com.InteractionLogging.InteractionLogging.repository;

import com.InteractionLogging.InteractionLogging.entity.ProcessLookups;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProcessLookupsRepository extends JpaRepository<ProcessLookups, Integer> {

    ProcessLookups findByProcessKey(String processKey);

}
