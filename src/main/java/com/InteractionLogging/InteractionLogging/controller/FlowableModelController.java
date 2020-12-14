package com.InteractionLogging.InteractionLogging.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.InteractionLogging.InteractionLogging.request.FlowableModelRequest;
import com.InteractionLogging.InteractionLogging.response.FlowableModelParamResponse;
import com.InteractionLogging.InteractionLogging.response.FlowableModelResponse;
import com.InteractionLogging.InteractionLogging.service.base.FlowableModelService;
import com.fasterxml.jackson.core.JsonProcessingException;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("flowable-model")
public class FlowableModelController {

	@Autowired
	private FlowableModelService flowableModelService;

	@PostMapping("update")
	@ResponseBody
	public void updateModel(@RequestBody FlowableModelRequest flowableModelRequest) {
		flowableModelService.updateFlowableModelInputVariables(flowableModelRequest);

	}

	@PostMapping("model-params")
	public FlowableModelParamResponse updateModelParams(@RequestBody FlowableModelRequest flowableModelRequest) {

		FlowableModelParamResponse flowableModelParamResponse = new FlowableModelParamResponse();

		try {

			Map<String, Object> mapResult = flowableModelService.updateFlowableModelParams(flowableModelRequest);
			if (mapResult != null) {
				flowableModelParamResponse.setFromCode(mapResult.get("code").toString());
				flowableModelParamResponse.setFromTitle(mapResult.get("title").toString());
				if (mapResult.get("actions") != null) {
					List<String> actionList = (List<String>) mapResult.get("actions");
					flowableModelParamResponse.setFromActions(listToHashString(actionList));
				}
			}
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return flowableModelParamResponse;
	}

	@GetMapping("get-values")
	@ResponseBody
	public FlowableModelResponse getValues() {
		FlowableModelResponse response = new FlowableModelResponse();
		List<String> test = new ArrayList<String>();
		test.add("job1");
		test.add("job2");
		response.setInputVariable("jobs");
		response.setVariableValues(test);
		response.setModelKey("TestTable");
		return response;
	}

	private String listToHashString(List<String> actionList)
	{
		String hashString = "";
		for (String action : actionList)
		{
			hashString += action+"#:#";
		}
		String newHashString = hashString.substring(0, hashString.length()-3);
		return newHashString;
	}
}
