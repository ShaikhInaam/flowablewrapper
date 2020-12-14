package com.InteractionLogging.InteractionLogging.response;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class FlowableModelResponse {

	private String inputVariable;
	private List<String>variableValues;
	private String modelKey;
}
