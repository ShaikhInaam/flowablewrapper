/**
 * GetNatureAndTypeDetailsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.GetNatureAndTypeDetailsResponse_xsd;

public class GetNatureAndTypeDetailsResponse  implements java.io.Serializable {
    private String requestStatus;

    private String transactionID;

    private GetNatureAndTypeDetailsResponseGetNatureAndTypeDetails[] getNatureAndTypeDetails;

    private ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.GetNatureAndTypeDetailsResponse_xsd.GetNatureAndTypeDetailsResponseDOPDetails DOPDetails;

    private com.tibco.www.schemas.Middleware.SharedResources.Schemas.CommonSchemas.AckMessage_xsd.AckMessage ackMessage;

    public GetNatureAndTypeDetailsResponse() {
    }

    public GetNatureAndTypeDetailsResponse(
           String requestStatus,
           String transactionID,
           GetNatureAndTypeDetailsResponseGetNatureAndTypeDetails[] getNatureAndTypeDetails,
           ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.GetNatureAndTypeDetailsResponse_xsd.GetNatureAndTypeDetailsResponseDOPDetails DOPDetails,
           com.tibco.www.schemas.Middleware.SharedResources.Schemas.CommonSchemas.AckMessage_xsd.AckMessage ackMessage) {
           this.requestStatus = requestStatus;
           this.transactionID = transactionID;
           this.getNatureAndTypeDetails = getNatureAndTypeDetails;
           this.DOPDetails = DOPDetails;
           this.ackMessage = ackMessage;
    }


    /**
     * Gets the requestStatus value for this GetNatureAndTypeDetailsResponse.
     * 
     * @return requestStatus
     */
    public String getRequestStatus() {
        return requestStatus;
    }


    /**
     * Sets the requestStatus value for this GetNatureAndTypeDetailsResponse.
     * 
     * @param requestStatus
     */
    public void setRequestStatus(String requestStatus) {
        this.requestStatus = requestStatus;
    }


    /**
     * Gets the transactionID value for this GetNatureAndTypeDetailsResponse.
     * 
     * @return transactionID
     */
    public String getTransactionID() {
        return transactionID;
    }


    /**
     * Sets the transactionID value for this GetNatureAndTypeDetailsResponse.
     * 
     * @param transactionID
     */
    public void setTransactionID(String transactionID) {
        this.transactionID = transactionID;
    }


    /**
     * Gets the getNatureAndTypeDetails value for this GetNatureAndTypeDetailsResponse.
     * 
     * @return getNatureAndTypeDetails
     */
    public GetNatureAndTypeDetailsResponseGetNatureAndTypeDetails[] getGetNatureAndTypeDetails() {
        return getNatureAndTypeDetails;
    }


    /**
     * Sets the getNatureAndTypeDetails value for this GetNatureAndTypeDetailsResponse.
     * 
     * @param getNatureAndTypeDetails
     */
    public void setGetNatureAndTypeDetails(GetNatureAndTypeDetailsResponseGetNatureAndTypeDetails[] getNatureAndTypeDetails) {
        this.getNatureAndTypeDetails = getNatureAndTypeDetails;
    }

    public GetNatureAndTypeDetailsResponseGetNatureAndTypeDetails getGetNatureAndTypeDetails(int i) {
        return this.getNatureAndTypeDetails[i];
    }

    public void setGetNatureAndTypeDetails(int i, GetNatureAndTypeDetailsResponseGetNatureAndTypeDetails _value) {
        this.getNatureAndTypeDetails[i] = _value;
    }


    /**
     * Gets the DOPDetails value for this GetNatureAndTypeDetailsResponse.
     * 
     * @return DOPDetails
     */
    public ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.GetNatureAndTypeDetailsResponse_xsd.GetNatureAndTypeDetailsResponseDOPDetails getDOPDetails() {
        return DOPDetails;
    }


    /**
     * Sets the DOPDetails value for this GetNatureAndTypeDetailsResponse.
     * 
     * @param DOPDetails
     */
    public void setDOPDetails(ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.GetNatureAndTypeDetailsResponse_xsd.GetNatureAndTypeDetailsResponseDOPDetails DOPDetails) {
        this.DOPDetails = DOPDetails;
    }


    /**
     * Gets the ackMessage value for this GetNatureAndTypeDetailsResponse.
     * 
     * @return ackMessage
     */
    public com.tibco.www.schemas.Middleware.SharedResources.Schemas.CommonSchemas.AckMessage_xsd.AckMessage getAckMessage() {
        return ackMessage;
    }


    /**
     * Sets the ackMessage value for this GetNatureAndTypeDetailsResponse.
     * 
     * @param ackMessage
     */
    public void setAckMessage(com.tibco.www.schemas.Middleware.SharedResources.Schemas.CommonSchemas.AckMessage_xsd.AckMessage ackMessage) {
        this.ackMessage = ackMessage;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GetNatureAndTypeDetailsResponse)) return false;
        GetNatureAndTypeDetailsResponse other = (GetNatureAndTypeDetailsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.requestStatus==null && other.getRequestStatus()==null) || 
             (this.requestStatus!=null &&
              this.requestStatus.equals(other.getRequestStatus()))) &&
            ((this.transactionID==null && other.getTransactionID()==null) || 
             (this.transactionID!=null &&
              this.transactionID.equals(other.getTransactionID()))) &&
            ((this.getNatureAndTypeDetails==null && other.getGetNatureAndTypeDetails()==null) || 
             (this.getNatureAndTypeDetails!=null &&
              java.util.Arrays.equals(this.getNatureAndTypeDetails, other.getGetNatureAndTypeDetails()))) &&
            ((this.DOPDetails==null && other.getDOPDetails()==null) || 
             (this.DOPDetails!=null &&
              this.DOPDetails.equals(other.getDOPDetails()))) &&
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
        if (getRequestStatus() != null) {
            _hashCode += getRequestStatus().hashCode();
        }
        if (getTransactionID() != null) {
            _hashCode += getTransactionID().hashCode();
        }
        if (getGetNatureAndTypeDetails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGetNatureAndTypeDetails());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getGetNatureAndTypeDetails(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDOPDetails() != null) {
            _hashCode += getDOPDetails().hashCode();
        }
        if (getAckMessage() != null) {
            _hashCode += getAckMessage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetNatureAndTypeDetailsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/GetNatureAndTypeDetailsResponse.xsd", ">GetNatureAndTypeDetailsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/GetNatureAndTypeDetailsResponse.xsd", "RequestStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/GetNatureAndTypeDetailsResponse.xsd", "TransactionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getNatureAndTypeDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/GetNatureAndTypeDetailsResponse.xsd", "GetNatureAndTypeDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/GetNatureAndTypeDetailsResponse.xsd", ">>GetNatureAndTypeDetailsResponse>GetNatureAndTypeDetails"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DOPDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/GetNatureAndTypeDetailsResponse.xsd", "DOPDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/GetNatureAndTypeDetailsResponse.xsd", ">>GetNatureAndTypeDetailsResponse>DOPDetails"));
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
