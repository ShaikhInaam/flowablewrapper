/**
 * CreateComplaintResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.CreateComplaintResponse_xsd;

public class CreateComplaintResponse  implements java.io.Serializable {
    private String transactionID;

    private Long complaintID;

    private String requestID;

    private String requestStatus;

    private CreateComplaintResponseAdditionalInfo[] additionalInfo;

    private com.tibco.www.schemas.Middleware.SharedResources.Schemas.CommonSchemas.AckMessage_xsd.AckMessage ackMessage;

    public CreateComplaintResponse() {
    }

    public CreateComplaintResponse(
           String transactionID,
           Long complaintID,
           String requestID,
           String requestStatus,
           CreateComplaintResponseAdditionalInfo[] additionalInfo,
           com.tibco.www.schemas.Middleware.SharedResources.Schemas.CommonSchemas.AckMessage_xsd.AckMessage ackMessage) {
           this.transactionID = transactionID;
           this.complaintID = complaintID;
           this.requestID = requestID;
           this.requestStatus = requestStatus;
           this.additionalInfo = additionalInfo;
           this.ackMessage = ackMessage;
    }


    /**
     * Gets the transactionID value for this CreateComplaintResponse.
     * 
     * @return transactionID
     */
    public String getTransactionID() {
        return transactionID;
    }


    /**
     * Sets the transactionID value for this CreateComplaintResponse.
     * 
     * @param transactionID
     */
    public void setTransactionID(String transactionID) {
        this.transactionID = transactionID;
    }


    /**
     * Gets the complaintID value for this CreateComplaintResponse.
     * 
     * @return complaintID
     */
    public Long getComplaintID() {
        return complaintID;
    }


    /**
     * Sets the complaintID value for this CreateComplaintResponse.
     * 
     * @param complaintID
     */
    public void setComplaintID(Long complaintID) {
        this.complaintID = complaintID;
    }


    /**
     * Gets the requestID value for this CreateComplaintResponse.
     * 
     * @return requestID
     */
    public String getRequestID() {
        return requestID;
    }


    /**
     * Sets the requestID value for this CreateComplaintResponse.
     * 
     * @param requestID
     */
    public void setRequestID(String requestID) {
        this.requestID = requestID;
    }


    /**
     * Gets the requestStatus value for this CreateComplaintResponse.
     * 
     * @return requestStatus
     */
    public String getRequestStatus() {
        return requestStatus;
    }


    /**
     * Sets the requestStatus value for this CreateComplaintResponse.
     * 
     * @param requestStatus
     */
    public void setRequestStatus(String requestStatus) {
        this.requestStatus = requestStatus;
    }


    /**
     * Gets the additionalInfo value for this CreateComplaintResponse.
     * 
     * @return additionalInfo
     */
    public CreateComplaintResponseAdditionalInfo[] getAdditionalInfo() {
        return additionalInfo;
    }


    /**
     * Sets the additionalInfo value for this CreateComplaintResponse.
     * 
     * @param additionalInfo
     */
    public void setAdditionalInfo(CreateComplaintResponseAdditionalInfo[] additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public CreateComplaintResponseAdditionalInfo getAdditionalInfo(int i) {
        return this.additionalInfo[i];
    }

    public void setAdditionalInfo(int i, CreateComplaintResponseAdditionalInfo _value) {
        this.additionalInfo[i] = _value;
    }


    /**
     * Gets the ackMessage value for this CreateComplaintResponse.
     * 
     * @return ackMessage
     */
    public com.tibco.www.schemas.Middleware.SharedResources.Schemas.CommonSchemas.AckMessage_xsd.AckMessage getAckMessage() {
        return ackMessage;
    }


    /**
     * Sets the ackMessage value for this CreateComplaintResponse.
     * 
     * @param ackMessage
     */
    public void setAckMessage(com.tibco.www.schemas.Middleware.SharedResources.Schemas.CommonSchemas.AckMessage_xsd.AckMessage ackMessage) {
        this.ackMessage = ackMessage;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CreateComplaintResponse)) return false;
        CreateComplaintResponse other = (CreateComplaintResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.transactionID==null && other.getTransactionID()==null) || 
             (this.transactionID!=null &&
              this.transactionID.equals(other.getTransactionID()))) &&
            ((this.complaintID==null && other.getComplaintID()==null) || 
             (this.complaintID!=null &&
              this.complaintID.equals(other.getComplaintID()))) &&
            ((this.requestID==null && other.getRequestID()==null) || 
             (this.requestID!=null &&
              this.requestID.equals(other.getRequestID()))) &&
            ((this.requestStatus==null && other.getRequestStatus()==null) || 
             (this.requestStatus!=null &&
              this.requestStatus.equals(other.getRequestStatus()))) &&
            ((this.additionalInfo==null && other.getAdditionalInfo()==null) || 
             (this.additionalInfo!=null &&
              java.util.Arrays.equals(this.additionalInfo, other.getAdditionalInfo()))) &&
            ((this.ackMessage==null && other.getAckMessage()==null) || 
             (this.ackMessage!=null &&
              this.ackMessage.equals(other.getAckMessage())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getTransactionID() != null) {
            _hashCode += getTransactionID().hashCode();
        }
        if (getComplaintID() != null) {
            _hashCode += getComplaintID().hashCode();
        }
        if (getRequestID() != null) {
            _hashCode += getRequestID().hashCode();
        }
        if (getRequestStatus() != null) {
            _hashCode += getRequestStatus().hashCode();
        }
        if (getAdditionalInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAdditionalInfo());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getAdditionalInfo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAckMessage() != null) {
            _hashCode += getAckMessage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateComplaintResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/CreateComplaintResponse.xsd", ">CreateComplaintResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/CreateComplaintResponse.xsd", "TransactionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("complaintID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/CreateComplaintResponse.xsd", "ComplaintID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/CreateComplaintResponse.xsd", "RequestID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/CreateComplaintResponse.xsd", "RequestStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/CreateComplaintResponse.xsd", "AdditionalInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/CreateComplaintResponse.xsd", ">>CreateComplaintResponse>AdditionalInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ackMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.tibco.com/schemas/Middleware/SharedResources/Schemas/CommonSchemas/AckMessage.xsd", "AckMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.tibco.com/schemas/Middleware/SharedResources/Schemas/CommonSchemas/AckMessage.xsd", ">AckMessage"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
