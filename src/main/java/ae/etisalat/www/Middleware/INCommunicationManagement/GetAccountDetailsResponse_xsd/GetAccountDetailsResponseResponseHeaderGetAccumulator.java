/**
 * GetAccountDetailsResponseResponseHeaderGetAccumulator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd;

public class GetAccountDetailsResponseResponseHeaderGetAccumulator  implements java.io.Serializable {
    private String responseCode;

    private String originTransactionID;

    private String languageIDCurrent;

    private String serviceClassCurrent;

    private ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.GetAccountDetailsResponseResponseHeaderGetAccumulatorAccumelatorInformation[] accumelatorInformation;

    private Boolean temporaryBlockedFlag;

    private GetAccountDetailsResponseResponseHeaderGetAccumulatorChargingResultInformation[] chargingResultInformation;

    private GetAccountDetailsResponseResponseHeaderGetAccumulatorAccountFlagsAfter accountFlagsAfter;

    private ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.GetAccountDetailsResponseResponseHeaderGetAccumulatorAccountFlagsBefore accountFlagsBefore;

    private String[] negotiatedCapabilities;

    private String[] availableServerCapabilities;

    private ae.etisalat.www.Middleware.SharedResources.Common.Common_xsd.AdditionalInfo[] additionalInfo;

    public GetAccountDetailsResponseResponseHeaderGetAccumulator() {
    }

    public GetAccountDetailsResponseResponseHeaderGetAccumulator(
           String responseCode,
           String originTransactionID,
           String languageIDCurrent,
           String serviceClassCurrent,
           ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.GetAccountDetailsResponseResponseHeaderGetAccumulatorAccumelatorInformation[] accumelatorInformation,
           Boolean temporaryBlockedFlag,
           GetAccountDetailsResponseResponseHeaderGetAccumulatorChargingResultInformation[] chargingResultInformation,
           GetAccountDetailsResponseResponseHeaderGetAccumulatorAccountFlagsAfter accountFlagsAfter,
           ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.GetAccountDetailsResponseResponseHeaderGetAccumulatorAccountFlagsBefore accountFlagsBefore,
           String[] negotiatedCapabilities,
           String[] availableServerCapabilities,
           ae.etisalat.www.Middleware.SharedResources.Common.Common_xsd.AdditionalInfo[] additionalInfo) {
           this.responseCode = responseCode;
           this.originTransactionID = originTransactionID;
           this.languageIDCurrent = languageIDCurrent;
           this.serviceClassCurrent = serviceClassCurrent;
           this.accumelatorInformation = accumelatorInformation;
           this.temporaryBlockedFlag = temporaryBlockedFlag;
           this.chargingResultInformation = chargingResultInformation;
           this.accountFlagsAfter = accountFlagsAfter;
           this.accountFlagsBefore = accountFlagsBefore;
           this.negotiatedCapabilities = negotiatedCapabilities;
           this.availableServerCapabilities = availableServerCapabilities;
           this.additionalInfo = additionalInfo;
    }


    /**
     * Gets the responseCode value for this GetAccountDetailsResponseResponseHeaderGetAccumulator.
     * 
     * @return responseCode
     */
    public String getResponseCode() {
        return responseCode;
    }


    /**
     * Sets the responseCode value for this GetAccountDetailsResponseResponseHeaderGetAccumulator.
     * 
     * @param responseCode
     */
    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }


    /**
     * Gets the originTransactionID value for this GetAccountDetailsResponseResponseHeaderGetAccumulator.
     * 
     * @return originTransactionID
     */
    public String getOriginTransactionID() {
        return originTransactionID;
    }


    /**
     * Sets the originTransactionID value for this GetAccountDetailsResponseResponseHeaderGetAccumulator.
     * 
     * @param originTransactionID
     */
    public void setOriginTransactionID(String originTransactionID) {
        this.originTransactionID = originTransactionID;
    }


    /**
     * Gets the languageIDCurrent value for this GetAccountDetailsResponseResponseHeaderGetAccumulator.
     * 
     * @return languageIDCurrent
     */
    public String getLanguageIDCurrent() {
        return languageIDCurrent;
    }


    /**
     * Sets the languageIDCurrent value for this GetAccountDetailsResponseResponseHeaderGetAccumulator.
     * 
     * @param languageIDCurrent
     */
    public void setLanguageIDCurrent(String languageIDCurrent) {
        this.languageIDCurrent = languageIDCurrent;
    }


    /**
     * Gets the serviceClassCurrent value for this GetAccountDetailsResponseResponseHeaderGetAccumulator.
     * 
     * @return serviceClassCurrent
     */
    public String getServiceClassCurrent() {
        return serviceClassCurrent;
    }


    /**
     * Sets the serviceClassCurrent value for this GetAccountDetailsResponseResponseHeaderGetAccumulator.
     * 
     * @param serviceClassCurrent
     */
    public void setServiceClassCurrent(String serviceClassCurrent) {
        this.serviceClassCurrent = serviceClassCurrent;
    }


    /**
     * Gets the accumelatorInformation value for this GetAccountDetailsResponseResponseHeaderGetAccumulator.
     * 
     * @return accumelatorInformation
     */
    public ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.GetAccountDetailsResponseResponseHeaderGetAccumulatorAccumelatorInformation[] getAccumelatorInformation() {
        return accumelatorInformation;
    }


    /**
     * Sets the accumelatorInformation value for this GetAccountDetailsResponseResponseHeaderGetAccumulator.
     * 
     * @param accumelatorInformation
     */
    public void setAccumelatorInformation(ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.GetAccountDetailsResponseResponseHeaderGetAccumulatorAccumelatorInformation[] accumelatorInformation) {
        this.accumelatorInformation = accumelatorInformation;
    }

    public ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.GetAccountDetailsResponseResponseHeaderGetAccumulatorAccumelatorInformation getAccumelatorInformation(int i) {
        return this.accumelatorInformation[i];
    }

    public void setAccumelatorInformation(int i, ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.GetAccountDetailsResponseResponseHeaderGetAccumulatorAccumelatorInformation _value) {
        this.accumelatorInformation[i] = _value;
    }


    /**
     * Gets the temporaryBlockedFlag value for this GetAccountDetailsResponseResponseHeaderGetAccumulator.
     * 
     * @return temporaryBlockedFlag
     */
    public Boolean getTemporaryBlockedFlag() {
        return temporaryBlockedFlag;
    }


    /**
     * Sets the temporaryBlockedFlag value for this GetAccountDetailsResponseResponseHeaderGetAccumulator.
     * 
     * @param temporaryBlockedFlag
     */
    public void setTemporaryBlockedFlag(Boolean temporaryBlockedFlag) {
        this.temporaryBlockedFlag = temporaryBlockedFlag;
    }


    /**
     * Gets the chargingResultInformation value for this GetAccountDetailsResponseResponseHeaderGetAccumulator.
     * 
     * @return chargingResultInformation
     */
    public GetAccountDetailsResponseResponseHeaderGetAccumulatorChargingResultInformation[] getChargingResultInformation() {
        return chargingResultInformation;
    }


    /**
     * Sets the chargingResultInformation value for this GetAccountDetailsResponseResponseHeaderGetAccumulator.
     * 
     * @param chargingResultInformation
     */
    public void setChargingResultInformation(GetAccountDetailsResponseResponseHeaderGetAccumulatorChargingResultInformation[] chargingResultInformation) {
        this.chargingResultInformation = chargingResultInformation;
    }

    public GetAccountDetailsResponseResponseHeaderGetAccumulatorChargingResultInformation getChargingResultInformation(int i) {
        return this.chargingResultInformation[i];
    }

    public void setChargingResultInformation(int i, GetAccountDetailsResponseResponseHeaderGetAccumulatorChargingResultInformation _value) {
        this.chargingResultInformation[i] = _value;
    }


    /**
     * Gets the accountFlagsAfter value for this GetAccountDetailsResponseResponseHeaderGetAccumulator.
     * 
     * @return accountFlagsAfter
     */
    public GetAccountDetailsResponseResponseHeaderGetAccumulatorAccountFlagsAfter getAccountFlagsAfter() {
        return accountFlagsAfter;
    }


    /**
     * Sets the accountFlagsAfter value for this GetAccountDetailsResponseResponseHeaderGetAccumulator.
     * 
     * @param accountFlagsAfter
     */
    public void setAccountFlagsAfter(GetAccountDetailsResponseResponseHeaderGetAccumulatorAccountFlagsAfter accountFlagsAfter) {
        this.accountFlagsAfter = accountFlagsAfter;
    }


    /**
     * Gets the accountFlagsBefore value for this GetAccountDetailsResponseResponseHeaderGetAccumulator.
     * 
     * @return accountFlagsBefore
     */
    public ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.GetAccountDetailsResponseResponseHeaderGetAccumulatorAccountFlagsBefore getAccountFlagsBefore() {
        return accountFlagsBefore;
    }


    /**
     * Sets the accountFlagsBefore value for this GetAccountDetailsResponseResponseHeaderGetAccumulator.
     * 
     * @param accountFlagsBefore
     */
    public void setAccountFlagsBefore(ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.GetAccountDetailsResponseResponseHeaderGetAccumulatorAccountFlagsBefore accountFlagsBefore) {
        this.accountFlagsBefore = accountFlagsBefore;
    }


    /**
     * Gets the negotiatedCapabilities value for this GetAccountDetailsResponseResponseHeaderGetAccumulator.
     * 
     * @return negotiatedCapabilities
     */
    public String[] getNegotiatedCapabilities() {
        return negotiatedCapabilities;
    }


    /**
     * Sets the negotiatedCapabilities value for this GetAccountDetailsResponseResponseHeaderGetAccumulator.
     * 
     * @param negotiatedCapabilities
     */
    public void setNegotiatedCapabilities(String[] negotiatedCapabilities) {
        this.negotiatedCapabilities = negotiatedCapabilities;
    }

    public String getNegotiatedCapabilities(int i) {
        return this.negotiatedCapabilities[i];
    }

    public void setNegotiatedCapabilities(int i, String _value) {
        this.negotiatedCapabilities[i] = _value;
    }


    /**
     * Gets the availableServerCapabilities value for this GetAccountDetailsResponseResponseHeaderGetAccumulator.
     * 
     * @return availableServerCapabilities
     */
    public String[] getAvailableServerCapabilities() {
        return availableServerCapabilities;
    }


    /**
     * Sets the availableServerCapabilities value for this GetAccountDetailsResponseResponseHeaderGetAccumulator.
     * 
     * @param availableServerCapabilities
     */
    public void setAvailableServerCapabilities(String[] availableServerCapabilities) {
        this.availableServerCapabilities = availableServerCapabilities;
    }

    public String getAvailableServerCapabilities(int i) {
        return this.availableServerCapabilities[i];
    }

    public void setAvailableServerCapabilities(int i, String _value) {
        this.availableServerCapabilities[i] = _value;
    }


    /**
     * Gets the additionalInfo value for this GetAccountDetailsResponseResponseHeaderGetAccumulator.
     * 
     * @return additionalInfo
     */
    public ae.etisalat.www.Middleware.SharedResources.Common.Common_xsd.AdditionalInfo[] getAdditionalInfo() {
        return additionalInfo;
    }


    /**
     * Sets the additionalInfo value for this GetAccountDetailsResponseResponseHeaderGetAccumulator.
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
        if (!(obj instanceof GetAccountDetailsResponseResponseHeaderGetAccumulator)) return false;
        GetAccountDetailsResponseResponseHeaderGetAccumulator other = (GetAccountDetailsResponseResponseHeaderGetAccumulator) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.responseCode==null && other.getResponseCode()==null) || 
             (this.responseCode!=null &&
              this.responseCode.equals(other.getResponseCode()))) &&
            ((this.originTransactionID==null && other.getOriginTransactionID()==null) || 
             (this.originTransactionID!=null &&
              this.originTransactionID.equals(other.getOriginTransactionID()))) &&
            ((this.languageIDCurrent==null && other.getLanguageIDCurrent()==null) || 
             (this.languageIDCurrent!=null &&
              this.languageIDCurrent.equals(other.getLanguageIDCurrent()))) &&
            ((this.serviceClassCurrent==null && other.getServiceClassCurrent()==null) || 
             (this.serviceClassCurrent!=null &&
              this.serviceClassCurrent.equals(other.getServiceClassCurrent()))) &&
            ((this.accumelatorInformation==null && other.getAccumelatorInformation()==null) || 
             (this.accumelatorInformation!=null &&
              java.util.Arrays.equals(this.accumelatorInformation, other.getAccumelatorInformation()))) &&
            ((this.temporaryBlockedFlag==null && other.getTemporaryBlockedFlag()==null) || 
             (this.temporaryBlockedFlag!=null &&
              this.temporaryBlockedFlag.equals(other.getTemporaryBlockedFlag()))) &&
            ((this.chargingResultInformation==null && other.getChargingResultInformation()==null) || 
             (this.chargingResultInformation!=null &&
              java.util.Arrays.equals(this.chargingResultInformation, other.getChargingResultInformation()))) &&
            ((this.accountFlagsAfter==null && other.getAccountFlagsAfter()==null) || 
             (this.accountFlagsAfter!=null &&
              this.accountFlagsAfter.equals(other.getAccountFlagsAfter()))) &&
            ((this.accountFlagsBefore==null && other.getAccountFlagsBefore()==null) || 
             (this.accountFlagsBefore!=null &&
              this.accountFlagsBefore.equals(other.getAccountFlagsBefore()))) &&
            ((this.negotiatedCapabilities==null && other.getNegotiatedCapabilities()==null) || 
             (this.negotiatedCapabilities!=null &&
              java.util.Arrays.equals(this.negotiatedCapabilities, other.getNegotiatedCapabilities()))) &&
            ((this.availableServerCapabilities==null && other.getAvailableServerCapabilities()==null) || 
             (this.availableServerCapabilities!=null &&
              java.util.Arrays.equals(this.availableServerCapabilities, other.getAvailableServerCapabilities()))) &&
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
        if (getResponseCode() != null) {
            _hashCode += getResponseCode().hashCode();
        }
        if (getOriginTransactionID() != null) {
            _hashCode += getOriginTransactionID().hashCode();
        }
        if (getLanguageIDCurrent() != null) {
            _hashCode += getLanguageIDCurrent().hashCode();
        }
        if (getServiceClassCurrent() != null) {
            _hashCode += getServiceClassCurrent().hashCode();
        }
        if (getAccumelatorInformation() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAccumelatorInformation());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getAccumelatorInformation(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTemporaryBlockedFlag() != null) {
            _hashCode += getTemporaryBlockedFlag().hashCode();
        }
        if (getChargingResultInformation() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getChargingResultInformation());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getChargingResultInformation(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAccountFlagsAfter() != null) {
            _hashCode += getAccountFlagsAfter().hashCode();
        }
        if (getAccountFlagsBefore() != null) {
            _hashCode += getAccountFlagsBefore().hashCode();
        }
        if (getNegotiatedCapabilities() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNegotiatedCapabilities());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getNegotiatedCapabilities(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAvailableServerCapabilities() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAvailableServerCapabilities());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getAvailableServerCapabilities(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        new org.apache.axis.description.TypeDesc(GetAccountDetailsResponseResponseHeaderGetAccumulator.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", ">>>GetAccountDetailsResponse>ResponseHeader>GetAccumulator"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "responseCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originTransactionID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "originTransactionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("languageIDCurrent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "languageIDCurrent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceClassCurrent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "serviceClassCurrent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accumelatorInformation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "accumelatorInformation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", ">>>>GetAccountDetailsResponse>ResponseHeader>GetAccumulator>accumelatorInformation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("temporaryBlockedFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "temporaryBlockedFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargingResultInformation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "chargingResultInformation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", ">>>>GetAccountDetailsResponse>ResponseHeader>GetAccumulator>chargingResultInformation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountFlagsAfter");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "accountFlagsAfter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", ">>>>GetAccountDetailsResponse>ResponseHeader>GetAccumulator>accountFlagsAfter"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountFlagsBefore");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "accountFlagsBefore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", ">>>>GetAccountDetailsResponse>ResponseHeader>GetAccumulator>accountFlagsBefore"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("negotiatedCapabilities");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "negotiatedCapabilities"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("availableServerCapabilities");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "availableServerCapabilities"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
