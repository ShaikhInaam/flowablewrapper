package com.InteractionLogging.InteractionLogging.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PayAndCharStartProcessRuntimeProcessInstancesJsonResponse {

    private String id;

    private Variables[] variables;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Variables[] getVariables ()
    {
        return variables;
    }

    public void setVariables (Variables[] variables)
    {
        this.variables = variables;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Variables
    {
        private String name;

        private String value;

        public String getName ()
        {
            return name;
        }

        public void setName (String name)
        {
            this.name = name;
        }

        public String getValue ()
        {
            return value;
        }

        public void setValue (String value)
        {
            this.value = value;
        }


    }
}
