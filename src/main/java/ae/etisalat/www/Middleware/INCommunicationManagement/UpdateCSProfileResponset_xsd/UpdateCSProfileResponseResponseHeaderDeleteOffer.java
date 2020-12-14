/**
 * UpdateCSProfileResponseResponseHeaderDeleteOffer.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ae.etisalat.www.Middleware.INCommunicationManagement.UpdateCSProfileResponset_xsd;

public class UpdateCSProfileResponseResponseHeaderDeleteOffer  implements java.io.Serializable {
    private ae.etisalat.www.Middleware.INCommunicationManagement.UpdateCSProfileResponset_xsd.UpdateCSProfileResponseResponseHeaderDeleteOfferOfferInformation[] offerInformation;

    private String currency1;

    private String currency2;

    private String[] negotiatedCapabilities;

    private String[] availableServerCapabilities;

    private ae.etisalat.www.Middleware.SharedResources.Common.Common_xsd.AdditionalInfo[] additionalInfo;

    public UpdateCSProfileResponseResponseHeaderDeleteOffer() {
    }

    public UpdateCSProfileResponseResponseHeaderDeleteOffer(
           ae.etisalat.www.Middleware.INCommunicationManagement.UpdateCSProfileResponset_xsd.UpdateCSProfileResponseResponseHeaderDeleteOfferOfferInformation[] offerInformation,
           String currency1,
           String currency2,
           String[] negotiatedCapabilities,
           String[] availableServerCapabilities,
           ae.etisalat.www.Middleware.SharedResources.Common.Common_xsd.AdditionalInfo[] additionalInfo) {
           this.offerInformation = offerInformation;
           this.currency1 = currency1;
           this.currency2 = currency2;
           this.negotiatedCapabilities = negotiatedCapabilities;
           this.availableServerCapabilities = availableServerCapabilities;
           this.additionalInfo = additionalInfo;
    }


    /**
     * Gets the offerInformation value for this UpdateCSProfileResponseResponseHeaderDeleteOffer.
     * 
     * @return offerInformation
     */
    public ae.etisalat.www.Middleware.INCommunicationManagement.UpdateCSProfileResponset_xsd.UpdateCSProfileResponseResponseHeaderDeleteOfferOfferInformation[] getOfferInformation() {
        return offerInformation;
    }


    /**
     * Sets the offerInformation value for this UpdateCSProfileResponseResponseHeaderDeleteOffer.
     * 
     * @param offerInformation
     */
    public void setOfferInformation(ae.etisalat.www.Middleware.INCommunicationManagement.UpdateCSProfileResponset_xsd.UpdateCSProfileResponseResponseHeaderDeleteOfferOfferInformation[] offerInformation) {
        this.offerInformation = offerInformation;
    }

    public ae.etisalat.www.Middleware.INCommunicationManagement.UpdateCSProfileResponset_xsd.UpdateCSProfileResponseResponseHeaderDeleteOfferOfferInformation getOfferInformation(int i) {
        return this.offerInformation[i];
    }

    public void setOfferInformation(int i, ae.etisalat.www.Middleware.INCommunicationManagement.UpdateCSProfileResponset_xsd.UpdateCSProfileResponseResponseHeaderDeleteOfferOfferInformation _value) {
        this.offerInformation[i] = _value;
    }


    /**
     * Gets the currency1 value for this UpdateCSProfileResponseResponseHeaderDeleteOffer.
     * 
     * @return currency1
     */
    public String getCurrency1() {
        return currency1;
    }


    /**
     * Sets the currency1 value for this UpdateCSProfileResponseResponseHeaderDeleteOffer.
     * 
     * @param currency1
     */
    public void setCurrency1(String currency1) {
        this.currency1 = currency1;
    }


    /**
     * Gets the currency2 value for this UpdateCSProfileResponseResponseHeaderDeleteOffer.
     * 
     * @return currency2
     */
    public String getCurrency2() {
        return currency2;
    }


    /**
     * Sets the currency2 value for this UpdateCSProfileResponseResponseHeaderDeleteOffer.
     * 
     * @param currency2
     */
    public void setCurrency2(String currency2) {
        this.currency2 = currency2;
    }


    /**
     * Gets the negotiatedCapabilities value for this UpdateCSProfileResponseResponseHeaderDeleteOffer.
     * 
     * @return negotiatedCapabilities
     */
    public String[] getNegotiatedCapabilities() {
        return negotiatedCapabilities;
    }


    /**
     * Sets the negotiatedCapabilities value for this UpdateCSProfileResponseResponseHeaderDeleteOffer.
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
     * Gets the availableServerCapabilities value for this UpdateCSProfileResponseResponseHeaderDeleteOffer.
     * 
     * @return availableServerCapabilities
     */
    public String[] getAvailableServerCapabilities() {
        return availableServerCapabilities;
    }


    /**
     * Sets the availableServerCapabilities value for this UpdateCSProfileResponseResponseHeaderDeleteOffer.
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
     * Gets the additionalInfo value for this UpdateCSProfileResponseResponseHeaderDeleteOffer.
     * 
     * @return additionalInfo
     */
    public ae.etisalat.www.Middleware.SharedResources.Common.Common_xsd.AdditionalInfo[] getAdditionalInfo() {
        return additionalInfo;
    }


    /**
     * Sets the additionalInfo value for this UpdateCSProfileResponseResponseHeaderDeleteOffer.
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
        if (!(obj instanceof UpdateCSProfileResponseResponseHeaderDeleteOffer)) return false;
        UpdateCSProfileResponseResponseHeaderDeleteOffer other = (UpdateCSProfileResponseResponseHeaderDeleteOffer) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.offerInformation==null && other.getOfferInformation()==null) || 
             (this.offerInformation!=null &&
              java.util.Arrays.equals(this.offerInformation, other.getOfferInformation()))) &&
            ((this.currency1==null && other.getCurrency1()==null) || 
             (this.currency1!=null &&
              this.currency1.equals(other.getCurrency1()))) &&
            ((this.currency2==null && other.getCurrency2()==null) || 
             (this.currency2!=null &&
              this.currency2.equals(other.getCurrency2()))) &&
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
        if (getOfferInformation() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOfferInformation());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getOfferInformation(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCurrency1() != null) {
            _hashCode += getCurrency1().hashCode();
        }
        if (getCurrency2() != null) {
            _hashCode += getCurrency2().hashCode();
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
        new org.apache.axis.description.TypeDesc(UpdateCSProfileResponseResponseHeaderDeleteOffer.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileResponset.xsd", ">>>UpdateCSProfileResponse>ResponseHeader>DeleteOffer"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offerInformation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileResponset.xsd", "OfferInformation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileResponset.xsd", ">>>>UpdateCSProfileResponse>ResponseHeader>DeleteOffer>OfferInformation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileResponset.xsd", "Currency1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileResponset.xsd", "Currency2"));
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
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("availableServerCapabilities");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileResponset.xsd", "AvailableServerCapabilities"));
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
