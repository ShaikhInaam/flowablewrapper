package com.InteractionLogging.InteractionLogging.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.InteractionLogging.InteractionLogging.entity.InteractionLoggingAttributes;

@Repository
public interface InteractionLoggingAttributesRepository extends JpaRepository<InteractionLoggingAttributes, Integer>{

	 
}
