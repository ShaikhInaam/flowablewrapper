package com.InteractionLogging.InteractionLogging;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.BufferingClientHttpRequestFactory;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class InteractionLoggingApplication {

	public static void main(String[] args) {
		SpringApplication.run(InteractionLoggingApplication.class, args);
	}

	@Bean(name = "appRestClient")
	public RestTemplate getRestClient() {
		RestTemplate restClient = new RestTemplate(
				new BufferingClientHttpRequestFactory(new SimpleClientHttpRequestFactory()));

		// Add one interceptor like in your example, except using anonymous class.
		restClient.setInterceptors(Collections.singletonList((request, body, execution) -> {

			//LOGGER.debug("Intercepting...");
			return execution.execute(request, body);
		}));

		return restClient;
	}
	
	 @RequestMapping(value = "/")
	    public String hello() {
	        return "Interaction Logging Application is up";
	    }

}
