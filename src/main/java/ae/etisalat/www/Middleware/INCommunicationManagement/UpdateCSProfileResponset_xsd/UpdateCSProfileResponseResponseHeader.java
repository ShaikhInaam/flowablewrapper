/**
 * UpdateCSProfileResponseResponseHeader.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ae.etisalat.www.Middleware.INCommunicationManagement.UpdateCSProfileResponset_xsd;

public class UpdateCSProfileResponseResponseHeader  implements java.io.Serializable {
    private String transactionID;

    private UpdateCSProfileResponseResponseHeaderDeleteOffer deleteOffer;

    private UpdateCSProfileResponseResponseHeaderUpdateServiceClass updateServiceClass;

    private Object responseType;

    private UpdateCSProfileResponseResponseHeaderAdditionalInfo[] additionalInfo;

    public UpdateCSProfileResponseResponseHeader() {
    }

    public UpdateCSProfileResponseResponseHeader(
           String transactionID,
           UpdateCSProfileResponseResponseHeaderDeleteOffer deleteOffer,
           UpdateCSProfileResponseResponseHeaderUpdateServiceClass updateServiceClass,
           Object responseType,
           UpdateCSProfileResponseResponseHeaderAdditionalInfo[] additionalInfo) {
           this.transactionID = transactionID;
           this.deleteOffer = deleteOffer;
           this.updateServiceClass = updateServiceClass;
           this.responseType = responseType;
           this.additionalInfo = additionalInfo;
    }


    /**
     * Gets the transactionID value for this UpdateCSProfileResponseResponseHeader.
     * 
     * @return transactionID
     */
    public String getTransactionID() {
        return transactionID;
    }


    /**
     * Sets the transactionID value for this UpdateCSProfileResponseResponseHeader.
     * 
     * @param transactionID
     */
    public void setTransactionID(String transactionID) {
        this.transactionID = transactionID;
    }


    /**
     * Gets the deleteOffer value for this UpdateCSProfileResponseResponseHeader.
     * 
     * @return deleteOffer
     */
    public UpdateCSProfileResponseResponseHeaderDeleteOffer getDeleteOffer() {
        return deleteOffer;
    }


    /**
     * Sets the deleteOffer value for this UpdateCSProfileResponseResponseHeader.
     * 
     * @param deleteOffer
     */
    public void setDeleteOffer(UpdateCSProfileResponseResponseHeaderDeleteOffer deleteOffer) {
        this.deleteOffer = deleteOffer;
    }


    /**
     * Gets the updateServiceClass value for this UpdateCSProfileResponseResponseHeader.
     * 
     * @return updateServiceClass
     */
    public UpdateCSProfileResponseResponseHeaderUpdateServiceClass getUpdateServiceClass() {
        return updateServiceClass;
    }


    /**
     * Sets the updateServiceClass value for this UpdateCSProfileResponseResponseHeader.
     * 
     * @param updateServiceClass
     */
    public void setUpdateServiceClass(UpdateCSProfileResponseResponseHeaderUpdateServiceClass updateServiceClass) {
        this.updateServiceClass = updateServiceClass;
    }


    /**
     * Gets the responseType value for this UpdateCSProfileResponseResponseHeader.
     * 
     * @return responseType
     */
    public Object getResponseType() {
        return responseType;
    }


    /**
     * Sets the responseType value for this UpdateCSProfileResponseResponseHeader.
     * 
     * @param responseType
     */
    public void setResponseType(Object responseType) {
        this.responseType = responseType;
    }


    /**
     * Gets the additionalInfo value for this UpdateCSProfileResponseResponseHeader.
     * 
     * @return additionalInfo
     */
    public UpdateCSProfileResponseResponseHeaderAdditionalInfo[] getAdditionalInfo() {
        return additionalInfo;
    }


    /**
     * Sets the additionalInfo value for this UpdateCSProfileResponseResponseHeader.
     * 
     * @param additionalInfo
     */
    public void setAdditionalInfo(UpdateCSProfileResponseResponseHeaderAdditionalInfo[] additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public UpdateCSProfileResponseResponseHeaderAdditionalInfo getAdditionalInfo(int i) {
        return this.additionalInfo[i];
    }

    public void setAdditionalInfo(int i, UpdateCSProfileResponseResponseHeaderAdditionalInfo _value) {
        this.additionalInfo[i] = _value;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof UpdateCSProfileResponseResponseHeader)) return false;
        UpdateCSProfileResponseResponseHeader other = (UpdateCSProfileResponseResponseHeader) obj;
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
            ((this.deleteOffer==null && other.getDeleteOffer()==null) || 
             (this.deleteOffer!=null &&
              this.deleteOffer.equals(other.getDeleteOffer()))) &&
            ((this.updateServiceClass==null && other.getUpdateServiceClass()==null) || 
             (this.updateServiceClass!=null &&
              this.updateServiceClass.equals(other.getUpdateServiceClass()))) &&
            ((this.responseType==null && other.getResponseType()==null) || 
             (this.responseType!=null &&
              this.responseType.equals(other.getResponseType()))) &&
            ((this.additionalInfo==null && other.getAdditionalInfo()==null) || 
             (this.additionalInfo!=null &&
              java.util.Arrays.equals(this.additionalInfo, other.getAdditionalInfo())));
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
        if (getDeleteOffer() != null) {
            _hashCode += getDeleteOffer().hashCode();
        }
        if (getUpdateServiceClass() != null) {
            _hashCode += getUpdateServiceClass().hashCode();
        }
        if (getResponseType() != null) {
            _hashCode += getResponseType().hashCode();
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateCSProfileResponseResponseHeader.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileResponset.xsd", ">>UpdateCSProfileResponse>ResponseHeader"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileResponset.xsd", "TransactionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deleteOffer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileResponset.xsd", "DeleteOffer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileResponset.xsd", ">>>UpdateCSProfileResponse>ResponseHeader>DeleteOffer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateServiceClass");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileResponset.xsd", "UpdateServiceClass"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileResponset.xsd", ">>>UpdateCSProfileResponse>ResponseHeader>UpdateServiceClass"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileResponset.xsd", "ResponseType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileResponset.xsd", "AdditionalInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileResponset.xsd", ">>>UpdateCSProfileResponse>ResponseHeader>AdditionalInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
