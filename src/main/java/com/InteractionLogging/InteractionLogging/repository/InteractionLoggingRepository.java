package com.InteractionLogging.InteractionLogging.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.InteractionLogging.InteractionLogging.entity.InteractionLogging;

@Repository
public interface InteractionLoggingRepository extends JpaRepository<InteractionLogging, Integer> {

/*	@Query(value = "select * from INTERACTION_LOGGING IL1,INTERACTION_LOGGING_DETAILS ILD,INTERACTION_LOGGING_ATTRIBUTES ILA\r\n" + 
			"where IL1.ID = ILD.INTERACTION_LOGGING_ID \r\n" + 
			"and ILD.ID = ILA.INTERACTION_LOGGING_DETAILS_ID\r\n" + 
			"And IL1.PROCESS_INSTANCE_ID = :processInstanceId", nativeQuery = true)*/
	InteractionLogging findByProcessInstanceId(@Param("processInstanceId") String  processInstanceId);
}
