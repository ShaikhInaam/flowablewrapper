package com.InteractionLogging.InteractionLogging.service.base;

import java.util.Map;

import com.InteractionLogging.InteractionLogging.entity.FlowableModel;
import com.InteractionLogging.InteractionLogging.request.FlowableModelRequest;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

public interface FlowableModelService {

	FlowableModel getModelByKey(String modelKey);

	String updateFlowableModelInputVariables(FlowableModelRequest flowableModelRequest);

	public Map<String, Object> updateFlowableModelParams(FlowableModelRequest flowableModelRequest) throws JsonMappingException, JsonProcessingException;
}
