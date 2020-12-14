package com.InteractionLogging.InteractionLogging.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.InteractionLogging.InteractionLogging.entity.InteractionLogging;
import com.InteractionLogging.InteractionLogging.request.InteractionLoggingRequest;
import com.InteractionLogging.InteractionLogging.service.InteractionLoggingService;

@RestController
@RequestMapping("interaction-logging")
public class InteractionLoggingController {

	@Autowired
	private InteractionLoggingService interactionLoggingService;

	@PostMapping("create")
	public String createInteractionLogging(@RequestBody InteractionLoggingRequest interactionLoggingRequest) {
		try {
			InteractionLogging interactionLogging = new InteractionLogging();
			interactionLogging.setFlow(interactionLoggingRequest.getFlow());
			interactionLogging.setInteractionType(interactionLoggingRequest.getInteractionType());
			interactionLogging.setProcessInstanceId(interactionLoggingRequest.getProcessInstanceId());
			interactionLoggingService.save(interactionLogging);
		} catch (Exception e) {
			return "failure";
		}

		return "success";

	}
	
	@GetMapping("inquiry")
	public InteractionLogging interactionLoggingInguiry(@RequestParam("processInstanceId") String processInstanceId) {
		
		return interactionLoggingService.getInteractionLoggingByProcessIntance(processInstanceId);


	}
}
