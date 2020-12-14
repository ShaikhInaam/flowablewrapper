/**
 * UpdateCSProfileResponseResponseHeaderUpdateServiceClass.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ae.etisalat.www.Middleware.INCommunicationManagement.UpdateCSProfileResponset_xsd;

public class UpdateCSProfileResponseResponseHeaderUpdateServiceClass  implements java.io.Serializable {
    private String originOperatorID;

    private UpdateCSProfileResponseResponseHeaderUpdateServiceClassChargingResultInformation chargingResultInformation;

    private ae.etisalat.www.Middleware.INCommunicationManagement.UpdateCSProfileResponset_xsd.UpdateCSProfileResponseResponseHeaderUpdateServiceClassAccountFlagsBefore accountFlagsBefore;

    private UpdateCSProfileResponseResponseHeaderUpdateServiceClassAccountFlagsAfter accountFlagsAfter;

    private String availableServerCapabilities;

    private String negotiatedCapabilities;

    private ae.etisalat.www.Middleware.SharedResources.Common.Common_xsd.AdditionalInfo[] additionalInfo;

    public UpdateCSProfileResponseResponseHeaderUpdateServiceClass() {
    }

    public UpdateCSProfileResponseResponseHeaderUpdateServiceClass(
           String originOperatorID,
           UpdateCSProfileResponseResponseHeaderUpdateServiceClassChargingResultInformation chargingResultInformation,
           ae.etisalat.www.Middleware.INCommunicationManagement.UpdateCSProfileResponset_xsd.UpdateCSProfileResponseResponseHeaderUpdateServiceClassAccountFlagsBefore accountFlagsBefore,
           UpdateCSProfileResponseResponseHeaderUpdateServiceClassAccountFlagsAfter accountFlagsAfter,
           String availableServerCapabilities,
           String negotiatedCapabilities,
           ae.etisalat.www.Middleware.SharedResources.Common.Common_xsd.AdditionalInfo[] additionalInfo) {
           this.originOperatorID = originOperatorID;
           this.chargingResultInformation = chargingResultInformation;
           this.accountFlagsBefore = accountFlagsBefore;
           this.accountFlagsAfter = accountFlagsAfter;
           this.availableServerCapabilities = availableServerCapabilities;
           this.negotiatedCapabilities = negotiatedCapabilities;
           this.additionalInfo = additionalInfo;
    }


    /**
     * Gets the originOperatorID value for this UpdateCSProfileResponseResponseHeaderUpdateServiceClass.
     * 
     * @return originOperatorID
     */
    public String getOriginOperatorID() {
        return originOperatorID;
    }


    /**
     * Sets the originOperatorID value for this UpdateCSProfileResponseResponseHeaderUpdateServiceClass.
     * 
     * @param originOperatorID
     */
    public void setOriginOperatorID(String originOperatorID) {
        this.originOperatorID = originOperatorID;
    }


    /**
     * Gets the chargingResultInformation value for this UpdateCSProfileResponseResponseHeaderUpdateServiceClass.
     * 
     * @return chargingResultInformation
     */
    public UpdateCSProfileResponseResponseHeaderUpdateServiceClassChargingResultInformation getChargingResultInformation() {
        return chargingResultInformation;
    }


    /**
     * Sets the chargingResultInformation value for this UpdateCSProfileResponseResponseHeaderUpdateServiceClass.
     * 
     * @param chargingResultInformation
     */
    public void setChargingResultInformation(UpdateCSProfileResponseResponseHeaderUpdateServiceClassChargingResultInformation chargingResultInformation) {
        this.chargingResultInformation = chargingResultInformation;
    }


    /**
     * Gets the accountFlagsBefore value for this UpdateCSProfileResponseResponseHeaderUpdateServiceClass.
     * 
     * @return accountFlagsBefore
     */
    public ae.etisalat.www.Middleware.INCommunicationManagement.UpdateCSProfileResponset_xsd.UpdateCSProfileResponseResponseHeaderUpdateServiceClassAccountFlagsBefore getAccountFlagsBefore() {
        return accountFlagsBefore;
    }


    /**
     * Sets the accountFlagsBefore value for this UpdateCSProfileResponseResponseHeaderUpdateServiceClass.
     * 
     * @param accountFlagsBefore
     */
    public void setAccountFlagsBefore(ae.etisalat.www.Middleware.INCommunicationManagement.UpdateCSProfileResponset_xsd.UpdateCSProfileResponseResponseHeaderUpdateServiceClassAccountFlagsBefore accountFlagsBefore) {
        this.accountFlagsBefore = accountFlagsBefore;
    }


    /**
     * Gets the accountFlagsAfter value for this UpdateCSProfileResponseResponseHeaderUpdateServiceClass.
     * 
     * @return accountFlagsAfter
     */
    public UpdateCSProfileResponseResponseHeaderUpdateServiceClassAccountFlagsAfter getAccountFlagsAfter() {
        return accountFlagsAfter;
    }


    /**
     * Sets the accountFlagsAfter value for this UpdateCSProfileResponseResponseHeaderUpdateServiceClass.
     * 
     * @param accountFlagsAfter
     */
    public void setAccountFlagsAfter(UpdateCSProfileResponseResponseHeaderUpdateServiceClassAccountFlagsAfter accountFlagsAfter) {
        this.accountFlagsAfter = accountFlagsAfter;
    }


    /**
     * Gets the availableServerCapabilities value for this UpdateCSProfileResponseResponseHeaderUpdateServiceClass.
     * 
     * @return availableServerCapabilities
     */
    public String getAvailableServerCapabilities() {
        return availableServerCapabilities;
    }


    /**
     * Sets the availableServerCapabilities value for this UpdateCSProfileResponseResponseHeaderUpdateServiceClass.
     * 
     * @param availableServerCapabilities
     */
    public void setAvailableServerCapabilities(String availableServerCapabilities) {
        this.availableServerCapabilities = availableServerCapabilities;
    }


    /**
     * Gets the negotiatedCapabilities value for this UpdateCSProfileResponseResponseHeaderUpdateServiceClass.
     * 
     * @return negotiatedCapabilities
     */
    public String getNegotiatedCapabilities() {
        return negotiatedCapabilities;
    }


    /**
     * Sets the negotiatedCapabilities value for this UpdateCSProfileResponseResponseHeaderUpdateServiceClass.
     * 
     * @param negotiatedCapabilities
     */
    public void setNegotiatedCapabilities(String negotiatedCapabilities) {
        this.negotiatedCapabilities = negotiatedCapabilities;
    }


    /**
     * Gets the additionalInfo value for this UpdateCSProfileResponseResponseHeaderUpdateServiceClass.
     * 
     * @return additionalInfo
     */
    public ae.etisalat.www.Middleware.SharedResources.Common.Common_xsd.AdditionalInfo[] getAdditionalInfo() {
        return additionalInfo;
    }


    /**
     * Sets the additionalInfo value for this UpdateCSProfileResponseResponseHeaderUpdateServiceClass.
     * 
     * @param additionalInfo
     */
    public void setAdditionalInfo(ae.etisalat.www.Middleware.SharedResources.Common.Common_xsd.AdditionalInfo[] additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public ae.etisalat.www.Middleware.SharedResources.Common.Common_xsd.AdditionalInfo getAdditionalInfo(int i) {
        return this.additionalInfo[i];
    }

    public void setAdditionalInfo(int i, ae.etisalat.www.Middleware.SharedResources.Common.Common_xsd.AdditionalInfo _value) {
        this.additionalInfo[i] = _value;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof UpdateCSProfileResponseResponseHeaderUpdateServiceClass)) return false;
        UpdateCSProfileResponseResponseHeaderUpdateServiceClass other = (UpdateCSProfileResponseResponseHeaderUpdateServiceClass) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.originOperatorID==null && other.getOriginOperatorID()==null) || 
             (this.originOperatorID!=null &&
              this.originOperatorID.equals(other.getOriginOperatorID()))) &&
            ((this.chargingResultInformation==null && other.getChargingResultInformation()==null) || 
             (this.chargingResultInformation!=null &&
              this.chargingResultInformation.equals(other.getChargingResultInformation()))) &&
            ((this.accountFlagsBefore==null && other.getAccountFlagsBefore()==null) || 
             (this.accountFlagsBefore!=null &&
              this.accountFlagsBefore.equals(other.getAccountFlagsBefore()))) &&
            ((this.accountFlagsAfter==null && other.getAccountFlagsAfter()==null) || 
             (this.accountFlagsAfter!=null &&
              this.accountFlagsAfter.equals(other.getAccountFlagsAfter()))) &&
            ((this.availableServerCapabilities==null && other.getAvailableServerCapabilities()==null) || 
             (this.availableServerCapabilities!=null &&
              this.availableServerCapabilities.equals(other.getAvailableServerCapabilities()))) &&
            ((this.negotiatedCapabilities==null && other.getNegotiatedCapabilities()==null) || 
             (this.negotiatedCapabilities!=null &&
              this.negotiatedCapabilities.equals(other.getNegotiatedCapabilities()))) &&
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
        if (getOriginOperatorID() != null) {
            _hashCode += getOriginOperatorID().hashCode();
        }
        if (getChargingResultInformation() != null) {
            _hashCode += getChargingResultInformation().hashCode();
        }
        if (getAccountFlagsBefore() != null) {
            _hashCode += getAccountFlagsBefore().hashCode();
        }
        if (getAccountFlagsAfter() != null) {
            _hashCode += getAccountFlagsAfter().hashCode();
        }
        if (getAvailableServerCapabilities() != null) {
            _hashCode += getAvailableServerCapabilities().hashCode();
        }
        if (getNegotiatedCapabilities() != null) {
            _hashCode += getNegotiatedCapabilities().hashCode();
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
        new org.apache.axis.description.TypeDesc(UpdateCSProfileResponseResponseHeaderUpdateServiceClass.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileResponset.xsd", ">>>UpdateCSProfileResponse>ResponseHeader>UpdateServiceClass"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originOperatorID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileResponset.xsd", "OriginOperatorID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargingResultInformation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileResponset.xsd", "ChargingResultInformation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileResponset.xsd", ">>>>UpdateCSProfileResponse>ResponseHeader>UpdateServiceClass>ChargingResultInformation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountFlagsBefore");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileResponset.xsd", "AccountFlagsBefore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileResponset.xsd", ">>>>UpdateCSProfileResponse>ResponseHeader>UpdateServiceClass>AccountFlagsBefore"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountFlagsAfter");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileResponset.xsd", "AccountFlagsAfter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileResponset.xsd", ">>>>UpdateCSProfileResponse>ResponseHeader>UpdateServiceClass>AccountFlagsAfter"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("availableServerCapabilities");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileResponset.xsd", "AvailableServerCapabilities"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("negotiatedCapabilities");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileResponset.xsd", "NegotiatedCapabilities"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/SharedResources/Common/Common.xsd", "AdditionalInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/SharedResources/Common/Common.xsd", "AdditionalInfo"));
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
