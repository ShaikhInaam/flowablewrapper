package com.InteractionLogging.InteractionLogging.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.InteractionLogging.InteractionLogging.entity.FlowableModel;
import com.InteractionLogging.InteractionLogging.repository.FlowableModelRepository;
import com.InteractionLogging.InteractionLogging.request.FlowableModelRequest;
import com.InteractionLogging.InteractionLogging.service.base.FlowableModelService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

@Service
public class FlowableModelServiceImpl implements FlowableModelService {

	@Autowired
	private FlowableModelRepository flowableModelRepository;

	@Override
	public FlowableModel getModelByKey(String modelKey) {

		List<FlowableModel> flowableModel = flowableModelRepository.findByKeyOrderByLastUpdatedDesc(modelKey);
		if (flowableModel != null && !flowableModel.isEmpty())
		{
			return flowableModel.get(0);
		}
		else
		{
			return null;
		}
	}

	private String getUpdatedModelEditorJson(String editorJson, FlowableModelRequest flowableModelRequest)
			throws JsonMappingException, JsonProcessingException {
		ObjectNode node = new ObjectMapper().readValue(editorJson, ObjectNode.class);
		List<String> entriesTagList = new ArrayList<>();
		if (node.has("inputExpressions")) {
			for (int i = 0; i < node.size(); i++) {

				if (node.get("inputExpressions").get(i) != null) {
					if (node.get("inputExpressions").get(i).get("variableId").textValue()
							.equals(flowableModelRequest.getInputVariable())) {
						ArrayNode entiresTag = (ArrayNode) node.get("inputExpressions").get(i).get("entries");
						if (entiresTag != null) {

							for (JsonNode ArrayNode : entiresTag) {
								entriesTagList.add(ArrayNode.textValue());
							}
						}
						if (flowableModelRequest.getVariableValues() != null
								&& !flowableModelRequest.getVariableValues().isEmpty()) {
							for (String jsonValue : flowableModelRequest.getVariableValues())
								if (!(entriesTagList.contains(jsonValue)))
									entiresTag.add(jsonValue);
						}

					}

				}
			}

		}
		return node.toString();
	}

	private Map<String, Object> getModelParamsMap(String editorJson, FlowableModelRequest flowableModelRequest)
			throws JsonMappingException, JsonProcessingException {
		ObjectNode node = new ObjectMapper().readValue(editorJson, ObjectNode.class);
		Map<String, Object> result = null;
		if (node.has("fields")) {
			for (int i = 0; i < node.size(); i++) {

				if (node.get("fields").get(i) != null) {
					if (node.get("fields").get(i).get("type").textValue().equals("multiValue")) {
						JsonNode entiresTag = node.get("fields").get(i).get("params");
						if (entiresTag != null) {
							ObjectMapper mapper = new ObjectMapper();
							result = mapper.convertValue(entiresTag, new TypeReference<Map<String, Object>>() {
							});
						}

					}

				}

			}

		}
		return result;
	}

	@Override
	public String updateFlowableModelInputVariables(FlowableModelRequest flowableModelRequest) {
		FlowableModel flowableModel = getModelByKey(flowableModelRequest.getModelKey());
		if (flowableModel != null)
		{
			try {

				String newEditorjson = getUpdatedModelEditorJson(flowableModel.getModelEditorJson(), flowableModelRequest);
				flowableModel.setModelEditorJson(newEditorjson);

				flowableModelRepository.save(flowableModel);

			} catch (Exception e) {

				return "failure";
			}

			return "success";
		}
		return "Not Found";
	}

	@Override
	public Map<String, Object> updateFlowableModelParams(FlowableModelRequest flowableModelRequest) throws JsonMappingException, JsonProcessingException {
		FlowableModel flowableModel = getModelByKey(flowableModelRequest.getModelKey());
		Map<String, Object> mapResult = null;
		if(flowableModel != null)
		{
			mapResult = getModelParamsMap(flowableModel.getModelEditorJson(), flowableModelRequest);
		}


		return mapResult;
	}

}
