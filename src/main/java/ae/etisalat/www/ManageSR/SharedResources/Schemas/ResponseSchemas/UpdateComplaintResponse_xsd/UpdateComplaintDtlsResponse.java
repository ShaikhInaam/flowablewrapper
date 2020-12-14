/**
 * UpdateComplaintDtlsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.UpdateComplaintResponse_xsd;

public class UpdateComplaintDtlsResponse  implements java.io.Serializable {
    private String transactionID;

    private Long complaintId;

    private com.tibco.www.schemas.Middleware.SharedResources.Schemas.CommonSchemas.AckMessage_xsd.AckMessage ackMessage;

    public UpdateComplaintDtlsResponse() {
    }

    public UpdateComplaintDtlsResponse(
           String transactionID,
           Long complaintId,
           com.tibco.www.schemas.Middleware.SharedResources.Schemas.CommonSchemas.AckMessage_xsd.AckMessage ackMessage) {
           this.transactionID = transactionID;
           this.complaintId = complaintId;
           this.ackMessage = ackMessage;
    }


    /**
     * Gets the transactionID value for this UpdateComplaintDtlsResponse.
     * 
     * @return transactionID
     */
    public String getTransactionID() {
        return transactionID;
    }


    /**
     * Sets the transactionID value for this UpdateComplaintDtlsResponse.
     * 
     * @param transactionID
     */
    public void setTransactionID(String transactionID) {
        this.transactionID = transactionID;
    }


    /**
     * Gets the complaintId value for this UpdateComplaintDtlsResponse.
     * 
     * @return complaintId
     */
    public Long getComplaintId() {
        return complaintId;
    }


    /**
     * Sets the complaintId value for this UpdateComplaintDtlsResponse.
     * 
     * @param complaintId
     */
    public void setComplaintId(Long complaintId) {
        this.complaintId = complaintId;
    }


    /**
     * Gets the ackMessage value for this UpdateComplaintDtlsResponse.
     * 
     * @return ackMessage
     */
    public com.tibco.www.schemas.Middleware.SharedResources.Schemas.CommonSchemas.AckMessage_xsd.AckMessage getAckMessage() {
        return ackMessage;
    }


    /**
     * Sets the ackMessage value for this UpdateComplaintDtlsResponse.
     * 
     * @param ackMessage
     */
    public void setAckMessage(com.tibco.www.schemas.Middleware.SharedResources.Schemas.CommonSchemas.AckMessage_xsd.AckMessage ackMessage) {
        this.ackMessage = ackMessage;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof UpdateComplaintDtlsResponse)) return false;
        UpdateComplaintDtlsResponse other = (UpdateComplaintDtlsResponse) obj;
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
            ((this.complaintId==null && other.getComplaintId()==null) || 
             (this.complaintId!=null &&
              this.complaintId.equals(other.getComplaintId()))) &&
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
        if (getComplaintId() != null) {
            _hashCode += getComplaintId().hashCode();
        }
        if (getAckMessage() != null) {
            _hashCode += getAckMessage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateComplaintDtlsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/UpdateComplaintResponse.xsd", ">UpdateComplaintDtlsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/UpdateComplaintResponse.xsd", "TransactionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("complaintId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/UpdateComplaintResponse.xsd", "ComplaintId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
