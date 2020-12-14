/**
 * UpdateCSProfileResponseResponseHeaderDeleteOfferOfferInformationFafInformationList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ae.etisalat.www.Middleware.INCommunicationManagement.UpdateCSProfileResponset_xsd;

public class UpdateCSProfileResponseResponseHeaderDeleteOfferOfferInformationFafInformationList  implements java.io.Serializable {
    private String promotionNotificationFlag;

    private String firstIVRCallSetFlag;

    private String accountActivationFlag;

    public UpdateCSProfileResponseResponseHeaderDeleteOfferOfferInformationFafInformationList() {
    }

    public UpdateCSProfileResponseResponseHeaderDeleteOfferOfferInformationFafInformationList(
           String promotionNotificationFlag,
           String firstIVRCallSetFlag,
           String accountActivationFlag) {
           this.promotionNotificationFlag = promotionNotificationFlag;
           this.firstIVRCallSetFlag = firstIVRCallSetFlag;
           this.accountActivationFlag = accountActivationFlag;
    }


    /**
     * Gets the promotionNotificationFlag value for this UpdateCSProfileResponseResponseHeaderDeleteOfferOfferInformationFafInformationList.
     * 
     * @return promotionNotificationFlag
     */
    public String getPromotionNotificationFlag() {
        return promotionNotificationFlag;
    }


    /**
     * Sets the promotionNotificationFlag value for this UpdateCSProfileResponseResponseHeaderDeleteOfferOfferInformationFafInformationList.
     * 
     * @param promotionNotificationFlag
     */
    public void setPromotionNotificationFlag(String promotionNotificationFlag) {
        this.promotionNotificationFlag = promotionNotificationFlag;
    }


    /**
     * Gets the firstIVRCallSetFlag value for this UpdateCSProfileResponseResponseHeaderDeleteOfferOfferInformationFafInformationList.
     * 
     * @return firstIVRCallSetFlag
     */
    public String getFirstIVRCallSetFlag() {
        return firstIVRCallSetFlag;
    }


    /**
     * Sets the firstIVRCallSetFlag value for this UpdateCSProfileResponseResponseHeaderDeleteOfferOfferInformationFafInformationList.
     * 
     * @param firstIVRCallSetFlag
     */
    public void setFirstIVRCallSetFlag(String firstIVRCallSetFlag) {
        this.firstIVRCallSetFlag = firstIVRCallSetFlag;
    }


    /**
     * Gets the accountActivationFlag value for this UpdateCSProfileResponseResponseHeaderDeleteOfferOfferInformationFafInformationList.
     * 
     * @return accountActivationFlag
     */
    public String getAccountActivationFlag() {
        return accountActivationFlag;
    }


    /**
     * Sets the accountActivationFlag value for this UpdateCSProfileResponseResponseHeaderDeleteOfferOfferInformationFafInformationList.
     * 
     * @param accountActivationFlag
     */
    public void setAccountActivationFlag(String accountActivationFlag) {
        this.accountActivationFlag = accountActivationFlag;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof UpdateCSProfileResponseResponseHeaderDeleteOfferOfferInformationFafInformationList)) return false;
        UpdateCSProfileResponseResponseHeaderDeleteOfferOfferInformationFafInformationList other = (UpdateCSProfileResponseResponseHeaderDeleteOfferOfferInformationFafInformationList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.promotionNotificationFlag==null && other.getPromotionNotificationFlag()==null) || 
             (this.promotionNotificationFlag!=null &&
              this.promotionNotificationFlag.equals(other.getPromotionNotificationFlag()))) &&
            ((this.firstIVRCallSetFlag==null && other.getFirstIVRCallSetFlag()==null) || 
             (this.firstIVRCallSetFlag!=null &&
              this.firstIVRCallSetFlag.equals(other.getFirstIVRCallSetFlag()))) &&
            ((this.accountActivationFlag==null && other.getAccountActivationFlag()==null) || 
             (this.accountActivationFlag!=null &&
              this.accountActivationFlag.equals(other.getAccountActivationFlag())));
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
        if (getPromotionNotificationFlag() != null) {
            _hashCode += getPromotionNotificationFlag().hashCode();
        }
        if (getFirstIVRCallSetFlag() != null) {
            _hashCode += getFirstIVRCallSetFlag().hashCode();
        }
        if (getAccountActivationFlag() != null) {
            _hashCode += getAccountActivationFlag().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateCSProfileResponseResponseHeaderDeleteOfferOfferInformationFafInformationList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileResponset.xsd", ">>>>>UpdateCSProfileResponse>ResponseHeader>DeleteOffer>OfferInformation>FafInformationList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promotionNotificationFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileResponset.xsd", "PromotionNotificationFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstIVRCallSetFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileResponset.xsd", "FirstIVRCallSetFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountActivationFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileResponset.xsd", "AccountActivationFlag"));
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
