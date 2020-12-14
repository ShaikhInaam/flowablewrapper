/**
 * GetAccountDetailsResponseResponseHeaderGetFaFList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd;

public class GetAccountDetailsResponseResponseHeaderGetFaFList  implements java.io.Serializable {
    private String originTransactionID;

    private GetAccountDetailsResponseResponseHeaderGetFaFListFafInformationList[] fafInformationList;

    private String fafChangeUnbarDate;

    private String fafMaxAllowedNumbersReachedFlag;

    private String fafChargingNotAllowedFlag;

    private String[] negotiatedCapabilities;

    private String[] availableServerCapabilities;

    private ae.etisalat.www.Middleware.SharedResources.Common.Common_xsd.AdditionalInfo[] additionalInfo;

    public GetAccountDetailsResponseResponseHeaderGetFaFList() {
    }

    public GetAccountDetailsResponseResponseHeaderGetFaFList(
           String originTransactionID,
           GetAccountDetailsResponseResponseHeaderGetFaFListFafInformationList[] fafInformationList,
           String fafChangeUnbarDate,
           String fafMaxAllowedNumbersReachedFlag,
           String fafChargingNotAllowedFlag,
           String[] negotiatedCapabilities,
           String[] availableServerCapabilities,
           ae.etisalat.www.Middleware.SharedResources.Common.Common_xsd.AdditionalInfo[] additionalInfo) {
           this.originTransactionID = originTransactionID;
           this.fafInformationList = fafInformationList;
           this.fafChangeUnbarDate = fafChangeUnbarDate;
           this.fafMaxAllowedNumbersReachedFlag = fafMaxAllowedNumbersReachedFlag;
           this.fafChargingNotAllowedFlag = fafChargingNotAllowedFlag;
           this.negotiatedCapabilities = negotiatedCapabilities;
           this.availableServerCapabilities = availableServerCapabilities;
           this.additionalInfo = additionalInfo;
    }


    /**
     * Gets the originTransactionID value for this GetAccountDetailsResponseResponseHeaderGetFaFList.
     * 
     * @return originTransactionID
     */
    public String getOriginTransactionID() {
        return originTransactionID;
    }


    /**
     * Sets the originTransactionID value for this GetAccountDetailsResponseResponseHeaderGetFaFList.
     * 
     * @param originTransactionID
     */
    public void setOriginTransactionID(String originTransactionID) {
        this.originTransactionID = originTransactionID;
    }


    /**
     * Gets the fafInformationList value for this GetAccountDetailsResponseResponseHeaderGetFaFList.
     * 
     * @return fafInformationList
     */
    public GetAccountDetailsResponseResponseHeaderGetFaFListFafInformationList[] getFafInformationList() {
        return fafInformationList;
    }


    /**
     * Sets the fafInformationList value for this GetAccountDetailsResponseResponseHeaderGetFaFList.
     * 
     * @param fafInformationList
     */
    public void setFafInformationList(GetAccountDetailsResponseResponseHeaderGetFaFListFafInformationList[] fafInformationList) {
        this.fafInformationList = fafInformationList;
    }

    public GetAccountDetailsResponseResponseHeaderGetFaFListFafInformationList getFafInformationList(int i) {
        return this.fafInformationList[i];
    }

    public void setFafInformationList(int i, GetAccountDetailsResponseResponseHeaderGetFaFListFafInformationList _value) {
        this.fafInformationList[i] = _value;
    }


    /**
     * Gets the fafChangeUnbarDate value for this GetAccountDetailsResponseResponseHeaderGetFaFList.
     * 
     * @return fafChangeUnbarDate
     */
    public String getFafChangeUnbarDate() {
        return fafChangeUnbarDate;
    }


    /**
     * Sets the fafChangeUnbarDate value for this GetAccountDetailsResponseResponseHeaderGetFaFList.
     * 
     * @param fafChangeUnbarDate
     */
    public void setFafChangeUnbarDate(String fafChangeUnbarDate) {
        this.fafChangeUnbarDate = fafChangeUnbarDate;
    }


    /**
     * Gets the fafMaxAllowedNumbersReachedFlag value for this GetAccountDetailsResponseResponseHeaderGetFaFList.
     * 
     * @return fafMaxAllowedNumbersReachedFlag
     */
    public String getFafMaxAllowedNumbersReachedFlag() {
        return fafMaxAllowedNumbersReachedFlag;
    }


    /**
     * Sets the fafMaxAllowedNumbersReachedFlag value for this GetAccountDetailsResponseResponseHeaderGetFaFList.
     * 
     * @param fafMaxAllowedNumbersReachedFlag
     */
    public void setFafMaxAllowedNumbersReachedFlag(String fafMaxAllowedNumbersReachedFlag) {
        this.fafMaxAllowedNumbersReachedFlag = fafMaxAllowedNumbersReachedFlag;
    }


    /**
     * Gets the fafChargingNotAllowedFlag value for this GetAccountDetailsResponseResponseHeaderGetFaFList.
     * 
     * @return fafChargingNotAllowedFlag
     */
    public String getFafChargingNotAllowedFlag() {
        return fafChargingNotAllowedFlag;
    }


    /**
     * Sets the fafChargingNotAllowedFlag value for this GetAccountDetailsResponseResponseHeaderGetFaFList.
     * 
     * @param fafChargingNotAllowedFlag
     */
    public void setFafChargingNotAllowedFlag(String fafChargingNotAllowedFlag) {
        this.fafChargingNotAllowedFlag = fafChargingNotAllowedFlag;
    }


    /**
     * Gets the negotiatedCapabilities value for this GetAccountDetailsResponseResponseHeaderGetFaFList.
     * 
     * @return negotiatedCapabilities
     */
    public String[] getNegotiatedCapabilities() {
        return negotiatedCapabilities;
    }


    /**
     * Sets the negotiatedCapabilities value for this GetAccountDetailsResponseResponseHeaderGetFaFList.
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
     * Gets the availableServerCapabilities value for this GetAccountDetailsResponseResponseHeaderGetFaFList.
     * 
     * @return availableServerCapabilities
     */
    public String[] getAvailableServerCapabilities() {
        return availableServerCapabilities;
    }


    /**
     * Sets the availableServerCapabilities value for this GetAccountDetailsResponseResponseHeaderGetFaFList.
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
     * Gets the additionalInfo value for this GetAccountDetailsResponseResponseHeaderGetFaFList.
     * 
     * @return additionalInfo
     */
    public ae.etisalat.www.Middleware.SharedResources.Common.Common_xsd.AdditionalInfo[] getAdditionalInfo() {
        return additionalInfo;
    }


    /**
     * Sets the additionalInfo value for this GetAccountDetailsResponseResponseHeaderGetFaFList.
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
        if (!(obj instanceof GetAccountDetailsResponseResponseHeaderGetFaFList)) return false;
        GetAccountDetailsResponseResponseHeaderGetFaFList other = (GetAccountDetailsResponseResponseHeaderGetFaFList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.originTransactionID==null && other.getOriginTransactionID()==null) || 
             (this.originTransactionID!=null &&
              this.originTransactionID.equals(other.getOriginTransactionID()))) &&
            ((this.fafInformationList==null && other.getFafInformationList()==null) || 
             (this.fafInformationList!=null &&
              java.util.Arrays.equals(this.fafInformationList, other.getFafInformationList()))) &&
            ((this.fafChangeUnbarDate==null && other.getFafChangeUnbarDate()==null) || 
             (this.fafChangeUnbarDate!=null &&
              this.fafChangeUnbarDate.equals(other.getFafChangeUnbarDate()))) &&
            ((this.fafMaxAllowedNumbersReachedFlag==null && other.getFafMaxAllowedNumbersReachedFlag()==null) || 
             (this.fafMaxAllowedNumbersReachedFlag!=null &&
              this.fafMaxAllowedNumbersReachedFlag.equals(other.getFafMaxAllowedNumbersReachedFlag()))) &&
            ((this.fafChargingNotAllowedFlag==null && other.getFafChargingNotAllowedFlag()==null) || 
             (this.fafChargingNotAllowedFlag!=null &&
              this.fafChargingNotAllowedFlag.equals(other.getFafChargingNotAllowedFlag()))) &&
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
        if (getOriginTransactionID() != null) {
            _hashCode += getOriginTransactionID().hashCode();
        }
        if (getFafInformationList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFafInformationList());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getFafInformationList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFafChangeUnbarDate() != null) {
            _hashCode += getFafChangeUnbarDate().hashCode();
        }
        if (getFafMaxAllowedNumbersReachedFlag() != null) {
            _hashCode += getFafMaxAllowedNumbersReachedFlag().hashCode();
        }
        if (getFafChargingNotAllowedFlag() != null) {
            _hashCode += getFafChargingNotAllowedFlag().hashCode();
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
        new org.apache.axis.description.TypeDesc(GetAccountDetailsResponseResponseHeaderGetFaFList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", ">>>GetAccountDetailsResponse>ResponseHeader>GetFaFList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originTransactionID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "originTransactionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fafInformationList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "fafInformationList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", ">>>>GetAccountDetailsResponse>ResponseHeader>GetFaFList>fafInformationList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fafChangeUnbarDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "fafChangeUnbarDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fafMaxAllowedNumbersReachedFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "fafMaxAllowedNumbersReachedFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fafChargingNotAllowedFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "fafChargingNotAllowedFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
