package com.InteractionLogging.InteractionLogging.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class PayAndCharProcessRuntimeTasksJsonResponse {

    private String total;

    private Data[] data;

    private String size;

    private String start;

    private String sort;

    private String order;


    @Setter
    @Getter
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Data {

        private String executionUrl;

        private String parentTaskId;

        private String dueDate;

        private String description;

        private String delegationState;

        private String scopeType;

        private String id;

        private String parentTaskUrl;

        private String owner;

        private String processInstanceId;

        private String processDefinitionId;

        private String scopeId;

        private Variables[] variables;

        private String formKey;

        private String priority;

        private String url;

        private String suspended;

        private String claimTime;

        private String taskDefinitionKey;

        private String executionId;

        private String processInstanceUrl;

        private String scopeDefinitionId;

        private String createTime;

        private String name;

        private String tenantId;

        private String assignee;

        private String category;
    }


    @Getter
    @Setter
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Variables {

        private String scope;

        private String name;

        private String type;

        private String value;
    }

}
