package com.InteractionLogging.InteractionLogging.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.InteractionLogging.InteractionLogging.entity.InteractionLogging;
import com.InteractionLogging.InteractionLogging.entity.InteractionLoggingAttributes;
import com.InteractionLogging.InteractionLogging.entity.InteractionLoggingDetails;
import com.InteractionLogging.InteractionLogging.repository.InteractionLoggingAttributesRepository;
import com.InteractionLogging.InteractionLogging.repository.InteractionLoggingDetailsRepository;
import com.InteractionLogging.InteractionLogging.repository.InteractionLoggingRepository;

@Service
public class InteractionLoggingServiceImpl implements InteractionLoggingService{

	@Autowired
	private InteractionLoggingRepository interactionLoggingRepository;
	
	@Autowired
	private InteractionLoggingDetailsRepository interactionLoggingDetailsRepository;
	
	@Autowired
	private InteractionLoggingAttributesRepository interactionLoggingAttributesRepository;
		
	@Override
	@Transactional
	public void save(InteractionLogging interactionLogging) {
			
		InteractionLoggingAttributes interactionLoggingAttributes = new InteractionLoggingAttributes();
		InteractionLoggingDetails interactionLoggingDetails = new InteractionLoggingDetails();
		List<InteractionLoggingDetails> detailList = new ArrayList<>();
		List<InteractionLoggingAttributes> attributeList = new ArrayList<>();
		
		
		interactionLoggingAttributes.setDisplayName("temp display name");
		interactionLoggingAttributes.setDisplayValue("temp Display value");
		attributeList.add(interactionLoggingAttributes);
		
		interactionLoggingDetails.setInteraction("temp interaction");
		interactionLoggingDetails.setAttributeList(attributeList);
		detailList.add(interactionLoggingDetails);
			
		interactionLogging.setDetailsList(detailList);
		
		interactionLoggingRepository.save(interactionLogging);

	}
	
	@Override
	public InteractionLogging getInteractionLoggingByProcessIntance(String processInstanceId)
	{
		return interactionLoggingRepository.findByProcessInstanceId(processInstanceId);
		
	}

}
