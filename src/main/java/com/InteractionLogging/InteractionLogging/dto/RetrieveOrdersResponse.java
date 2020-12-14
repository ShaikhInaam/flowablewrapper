package com.InteractionLogging.InteractionLogging.dto;

public class RetrieveOrdersResponse {

	
	private Result[] result;

    private String responseDesc;

    private String responseCode;

    public Result[] getResult ()
    {
        return result;
    }

    public void setResult (Result[] result)
    {
        this.result = result;
    }

    public String getResponseDesc ()
    {
        return responseDesc;
    }

    public void setResponseDesc (String responseDesc)
    {
        this.responseDesc = responseDesc;
    }

    public String getResponseCode ()
    {
        return responseCode;
    }

    public void setResponseCode (String responseCode)
    {
        this.responseCode = responseCode;
    }

    
    
    public static class Result
    {
        private String orderCrmId;

        private String clientReference;

        private OrderStatus orderStatus;

        public String getOrderCrmId ()
        {
            return orderCrmId;
        }

        public void setOrderCrmId (String orderCrmId)
        {
            this.orderCrmId = orderCrmId;
        }

        public String getClientReference ()
        {
            return clientReference;
        }

        public void setClientReference (String clientReference)
        {
            this.clientReference = clientReference;
        }

        public OrderStatus getOrderStatus ()
        {
            return orderStatus;
        }

        public void setOrderStatus (OrderStatus orderStatus)
        {
            this.orderStatus = orderStatus;
        }

        
    }
    
    
    
    
    public static class OrderStatus
    {
        private String code;

        private String name;

        private String id;

        public String getCode ()
        {
            return code;
        }

        public void setCode (String code)
        {
            this.code = code;
        }

        public String getName ()
        {
            return name;
        }

        public void setName (String name)
        {
            this.name = name;
        }

        public String getId ()
        {
            return id;
        }

        public void setId (String id)
        {
            this.id = id;
        }

        
    }
    	
	
	
	
	
}
