package com.InteractionLogging.InteractionLogging.response;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PaymentAndChargesStartProcessResponse implements Serializable {

    private String[] formActions;

    private String processInstanceId;

    private String formCode;

    private String formTitle;

    private String taskId;

    private String action;

    private String message;


    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String[] getFormActions ()
    {
        return formActions;
    }

    public void setFormActions (String[] formActions)
    {
        this.formActions = formActions;
    }

    public String getProcessInstanceId ()
    {
        return processInstanceId;
    }

    public void setProcessInstanceId (String processInstanceId)
    {
        this.processInstanceId = processInstanceId;
    }

    public String getFormCode ()
    {
        return formCode;
    }

    public void setFormCode (String formCode)
    {
        this.formCode = formCode;
    }

    public String getFormTitle ()
    {
        return formTitle;
    }

    public void setFormTitle (String formTitle)
    {
        this.formTitle = formTitle;
    }

    public String getTaskId ()
    {
        return taskId;
    }

    public void setTaskId (String taskId)
    {
        this.taskId = taskId;
    }

}
