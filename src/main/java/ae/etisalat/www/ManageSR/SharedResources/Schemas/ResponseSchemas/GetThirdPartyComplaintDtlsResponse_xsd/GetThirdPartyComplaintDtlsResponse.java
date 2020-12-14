/**
 * GetThirdPartyComplaintDtlsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.GetThirdPartyComplaintDtlsResponse_xsd;

public class GetThirdPartyComplaintDtlsResponse  implements java.io.Serializable {
    private String transactionID;

    private GetThirdPartyComplaintDtlsResponseComplaintDetailsArray[] complaintDetailsArray;

    private com.tibco.www.schemas.Middleware.SharedResources.Schemas.CommonSchemas.AckMessage_xsd.AckMessage ackMessage;

    public GetThirdPartyComplaintDtlsResponse() {
    }

    public GetThirdPartyComplaintDtlsResponse(
           String transactionID,
           GetThirdPartyComplaintDtlsResponseComplaintDetailsArray[] complaintDetailsArray,
           com.tibco.www.schemas.Middleware.SharedResources.Schemas.CommonSchemas.AckMessage_xsd.AckMessage ackMessage) {
           this.transactionID = transactionID;
           this.complaintDetailsArray = complaintDetailsArray;
           this.ackMessage = ackMessage;
    }


    /**
     * Gets the transactionID value for this GetThirdPartyComplaintDtlsResponse.
     * 
     * @return transactionID
     */
    public String getTransactionID() {
        return transactionID;
    }


    /**
     * Sets the transactionID value for this GetThirdPartyComplaintDtlsResponse.
     * 
     * @param transactionID
     */
    public void setTransactionID(String transactionID) {
        this.transactionID = transactionID;
    }


    /**
     * Gets the complaintDetailsArray value for this GetThirdPartyComplaintDtlsResponse.
     * 
     * @return complaintDetailsArray
     */
    public GetThirdPartyComplaintDtlsResponseComplaintDetailsArray[] getComplaintDetailsArray() {
        return complaintDetailsArray;
    }


    /**
     * Sets the complaintDetailsArray value for this GetThirdPartyComplaintDtlsResponse.
     * 
     * @param complaintDetailsArray
     */
    public void setComplaintDetailsArray(GetThirdPartyComplaintDtlsResponseComplaintDetailsArray[] complaintDetailsArray) {
        this.complaintDetailsArray = complaintDetailsArray;
    }

    public GetThirdPartyComplaintDtlsResponseComplaintDetailsArray getComplaintDetailsArray(int i) {
        return this.complaintDetailsArray[i];
    }

    public void setComplaintDetailsArray(int i, GetThirdPartyComplaintDtlsResponseComplaintDetailsArray _value) {
        this.complaintDetailsArray[i] = _value;
    }


    /**
     * Gets the ackMessage value for this GetThirdPartyComplaintDtlsResponse.
     * 
     * @return ackMessage
     */
    public com.tibco.www.schemas.Middleware.SharedResources.Schemas.CommonSchemas.AckMessage_xsd.AckMessage getAckMessage() {
        return ackMessage;
    }


    /**
     * Sets the ackMessage value for this GetThirdPartyComplaintDtlsResponse.
     * 
     * @param ackMessage
     */
    public void setAckMessage(com.tibco.www.schemas.Middleware.SharedResources.Schemas.CommonSchemas.AckMessage_xsd.AckMessage ackMessage) {
        this.ackMessage = ackMessage;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GetThirdPartyComplaintDtlsResponse)) return false;
        GetThirdPartyComplaintDtlsResponse other = (GetThirdPartyComplaintDtlsResponse) obj;
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
            ((this.complaintDetailsArray==null && other.getComplaintDetailsArray()==null) || 
             (this.complaintDetailsArray!=null &&
              java.util.Arrays.equals(this.complaintDetailsArray, other.getComplaintDetailsArray()))) &&
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
        if (getComplaintDetailsArray() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getComplaintDetailsArray());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getComplaintDetailsArray(), i);
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
        new org.apache.axis.description.TypeDesc(GetThirdPartyComplaintDtlsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/GetThirdPartyComplaintDtlsResponse.xsd", ">GetThirdPartyComplaintDtlsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/GetThirdPartyComplaintDtlsResponse.xsd", "TransactionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("complaintDetailsArray");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/GetThirdPartyComplaintDtlsResponse.xsd", "ComplaintDetailsArray"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/GetThirdPartyComplaintDtlsResponse.xsd", ">>GetThirdPartyComplaintDtlsResponse>ComplaintDetailsArray"));
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
