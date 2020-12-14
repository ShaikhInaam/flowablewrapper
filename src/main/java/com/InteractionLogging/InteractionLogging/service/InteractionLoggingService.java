package com.InteractionLogging.InteractionLogging.service;

import com.InteractionLogging.InteractionLogging.entity.InteractionLogging;

public interface InteractionLoggingService {

	public void save(InteractionLogging interactionLogging);

	InteractionLogging getInteractionLoggingByProcessIntance(String processInstanceId);
}
