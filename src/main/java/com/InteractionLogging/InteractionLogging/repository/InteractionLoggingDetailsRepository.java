package com.InteractionLogging.InteractionLogging.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.InteractionLogging.InteractionLogging.entity.InteractionLoggingDetails;

@Repository
public interface InteractionLoggingDetailsRepository extends JpaRepository<InteractionLoggingDetails, Integer>{
	

}
