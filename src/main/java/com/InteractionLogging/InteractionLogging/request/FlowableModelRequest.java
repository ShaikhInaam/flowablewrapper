package com.InteractionLogging.InteractionLogging.request;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class FlowableModelRequest {

	private String modelKey;
	private String inputVariable;
	private List<String> variableValues;
}
