package com.InteractionLogging.InteractionLogging.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.InteractionLogging.InteractionLogging.entity.FlowableModel;

@Repository
public interface FlowableModelRepository extends JpaRepository<FlowableModel, Integer> {

	List<FlowableModel> findByKeyOrderByLastUpdatedDesc(String Key);
}
