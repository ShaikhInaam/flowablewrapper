/**
 * AckMessage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.tibco.www.schemas.Middleware.SharedResources.Schemas.CommonSchemas.AckMessage_xsd;

public class AckMessage  implements java.io.Serializable {
    private boolean messageCode;

    private String messageDescription;

    private String errorCode;

    private String errorType;

    private String errorDescription;

    public AckMessage() {
    }

    public AckMessage(
           boolean messageCode,
           String messageDescription,
           String errorCode,
           String errorType,
           String errorDescription) {
           this.messageCode = messageCode;
           this.messageDescription = messageDescription;
           this.errorCode = errorCode;
           this.errorType = errorType;
           this.errorDescription = errorDescription;
    }


    /**
     * Gets the messageCode value for this AckMessage.
     * 
     * @return messageCode
     */
    public boolean isMessageCode() {
        return messageCode;
    }


    /**
     * Sets the messageCode value for this AckMessage.
     * 
     * @param messageCode
     */
    public void setMessageCode(boolean messageCode) {
        this.messageCode = messageCode;
    }


    /**
     * Gets the messageDescription value for this AckMessage.
     * 
     * @return messageDescription
     */
    public String getMessageDescription() {
        return messageDescription;
    }


    /**
     * Sets the messageDescription value for this AckMessage.
     * 
     * @param messageDescription
     */
    public void setMessageDescription(String messageDescription) {
        this.messageDescription = messageDescription;
    }


    /**
     * Gets the errorCode value for this AckMessage.
     * 
     * @return errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }


    /**
     * Sets the errorCode value for this AckMessage.
     * 
     * @param errorCode
     */
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }


    /**
     * Gets the errorType value for this AckMessage.
     * 
     * @return errorType
     */
    public String getErrorType() {
        return errorType;
    }


    /**
     * Sets the errorType value for this AckMessage.
     * 
     * @param errorType
     */
    public void setErrorType(String errorType) {
        this.errorType = errorType;
    }


    /**
     * Gets the errorDescription value for this AckMessage.
     * 
     * @return errorDescription
     */
    public String getErrorDescription() {
        return errorDescription;
    }


    /**
     * Sets the errorDescription value for this AckMessage.
     * 
     * @param errorDescription
     */
    public void setErrorDescription(String errorDescription) {
        this.errorDescription = errorDescription;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof AckMessage)) return false;
        AckMessage other = (AckMessage) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.messageCode == other.isMessageCode() &&
            ((this.messageDescription==null && other.getMessageDescription()==null) || 
             (this.messageDescription!=null &&
              this.messageDescription.equals(other.getMessageDescription()))) &&
            ((this.errorCode==null && other.getErrorCode()==null) || 
             (this.errorCode!=null &&
              this.errorCode.equals(other.getErrorCode()))) &&
            ((this.errorType==null && other.getErrorType()==null) || 
             (this.errorType!=null &&
              this.errorType.equals(other.getErrorType()))) &&
            ((this.errorDescription==null && other.getErrorDescription()==null) || 
             (this.errorDescription!=null &&
              this.errorDescription.equals(other.getErrorDescription())));
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
        _hashCode += (isMessageCode() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getMessageDescription() != null) {
            _hashCode += getMessageDescription().hashCode();
        }
        if (getErrorCode() != null) {
            _hashCode += getErrorCode().hashCode();
        }
        if (getErrorType() != null) {
            _hashCode += getErrorType().hashCode();
        }
        if (getErrorDescription() != null) {
            _hashCode += getErrorDescription().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AckMessage.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.tibco.com/schemas/Middleware/SharedResources/Schemas/CommonSchemas/AckMessage.xsd", ">AckMessage"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.tibco.com/schemas/Middleware/SharedResources/Schemas/CommonSchemas/AckMessage.xsd", "MessageCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.tibco.com/schemas/Middleware/SharedResources/Schemas/CommonSchemas/AckMessage.xsd", "MessageDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.tibco.com/schemas/Middleware/SharedResources/Schemas/CommonSchemas/AckMessage.xsd", "ErrorCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.tibco.com/schemas/Middleware/SharedResources/Schemas/CommonSchemas/AckMessage.xsd", "ErrorType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.tibco.com/schemas/Middleware/SharedResources/Schemas/CommonSchemas/AckMessage.xsd", "ErrorDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
