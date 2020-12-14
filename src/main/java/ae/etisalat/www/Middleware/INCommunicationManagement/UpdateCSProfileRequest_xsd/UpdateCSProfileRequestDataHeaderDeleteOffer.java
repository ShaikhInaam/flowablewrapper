/**
 * UpdateCSProfileRequestDataHeaderDeleteOffer.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ae.etisalat.www.Middleware.INCommunicationManagement.UpdateCSProfileRequest_xsd;

public class UpdateCSProfileRequestDataHeaderDeleteOffer  implements java.io.Serializable {
    private String subscriberNumberNAI;

    private String subscriberNumber;

    private String originOperatorID;

    private String offerID;

    private String productID;

    private String negotiatedCapabilities;

    private ae.etisalat.www.Middleware.SharedResources.Common.Common_xsd.AdditionalInfo[] additionalInfo;

    public UpdateCSProfileRequestDataHeaderDeleteOffer() {
    }

    public UpdateCSProfileRequestDataHeaderDeleteOffer(
           String subscriberNumberNAI,
           String subscriberNumber,
           String originOperatorID,
           String offerID,
           String productID,
           String negotiatedCapabilities,
           ae.etisalat.www.Middleware.SharedResources.Common.Common_xsd.AdditionalInfo[] additionalInfo) {
           this.subscriberNumberNAI = subscriberNumberNAI;
           this.subscriberNumber = subscriberNumber;
           this.originOperatorID = originOperatorID;
           this.offerID = offerID;
           this.productID = productID;
           this.negotiatedCapabilities = negotiatedCapabilities;
           this.additionalInfo = additionalInfo;
    }


    /**
     * Gets the subscriberNumberNAI value for this UpdateCSProfileRequestDataHeaderDeleteOffer.
     * 
     * @return subscriberNumberNAI
     */
    public String getSubscriberNumberNAI() {
        return subscriberNumberNAI;
    }


    /**
     * Sets the subscriberNumberNAI value for this UpdateCSProfileRequestDataHeaderDeleteOffer.
     * 
     * @param subscriberNumberNAI
     */
    public void setSubscriberNumberNAI(String subscriberNumberNAI) {
        this.subscriberNumberNAI = subscriberNumberNAI;
    }


    /**
     * Gets the subscriberNumber value for this UpdateCSProfileRequestDataHeaderDeleteOffer.
     * 
     * @return subscriberNumber
     */
    public String getSubscriberNumber() {
        return subscriberNumber;
    }


    /**
     * Sets the subscriberNumber value for this UpdateCSProfileRequestDataHeaderDeleteOffer.
     * 
     * @param subscriberNumber
     */
    public void setSubscriberNumber(String subscriberNumber) {
        this.subscriberNumber = subscriberNumber;
    }


    /**
     * Gets the originOperatorID value for this UpdateCSProfileRequestDataHeaderDeleteOffer.
     * 
     * @return originOperatorID
     */
    public String getOriginOperatorID() {
        return originOperatorID;
    }


    /**
     * Sets the originOperatorID value for this UpdateCSProfileRequestDataHeaderDeleteOffer.
     * 
     * @param originOperatorID
     */
    public void setOriginOperatorID(String originOperatorID) {
        this.originOperatorID = originOperatorID;
    }


    /**
     * Gets the offerID value for this UpdateCSProfileRequestDataHeaderDeleteOffer.
     * 
     * @return offerID
     */
    public String getOfferID() {
        return offerID;
    }


    /**
     * Sets the offerID value for this UpdateCSProfileRequestDataHeaderDeleteOffer.
     * 
     * @param offerID
     */
    public void setOfferID(String offerID) {
        this.offerID = offerID;
    }


    /**
     * Gets the productID value for this UpdateCSProfileRequestDataHeaderDeleteOffer.
     * 
     * @return productID
     */
    public String getProductID() {
        return productID;
    }


    /**
     * Sets the productID value for this UpdateCSProfileRequestDataHeaderDeleteOffer.
     * 
     * @param productID
     */
    public void setProductID(String productID) {
        this.productID = productID;
    }


    /**
     * Gets the negotiatedCapabilities value for this UpdateCSProfileRequestDataHeaderDeleteOffer.
     * 
     * @return negotiatedCapabilities
     */
    public String getNegotiatedCapabilities() {
        return negotiatedCapabilities;
    }


    /**
     * Sets the negotiatedCapabilities value for this UpdateCSProfileRequestDataHeaderDeleteOffer.
     * 
     * @param negotiatedCapabilities
     */
    public void setNegotiatedCapabilities(String negotiatedCapabilities) {
        this.negotiatedCapabilities = negotiatedCapabilities;
    }


    /**
     * Gets the additionalInfo value for this UpdateCSProfileRequestDataHeaderDeleteOffer.
     * 
     * @return additionalInfo
     */
    public ae.etisalat.www.Middleware.SharedResources.Common.Common_xsd.AdditionalInfo[] getAdditionalInfo() {
        return additionalInfo;
    }


    /**
     * Sets the additionalInfo value for this UpdateCSProfileRequestDataHeaderDeleteOffer.
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
        if (!(obj instanceof UpdateCSProfileRequestDataHeaderDeleteOffer)) return false;
        UpdateCSProfileRequestDataHeaderDeleteOffer other = (UpdateCSProfileRequestDataHeaderDeleteOffer) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.subscriberNumberNAI==null && other.getSubscriberNumberNAI()==null) || 
             (this.subscriberNumberNAI!=null &&
              this.subscriberNumberNAI.equals(other.getSubscriberNumberNAI()))) &&
            ((this.subscriberNumber==null && other.getSubscriberNumber()==null) || 
             (this.subscriberNumber!=null &&
              this.subscriberNumber.equals(other.getSubscriberNumber()))) &&
            ((this.originOperatorID==null && other.getOriginOperatorID()==null) || 
             (this.originOperatorID!=null &&
              this.originOperatorID.equals(other.getOriginOperatorID()))) &&
            ((this.offerID==null && other.getOfferID()==null) || 
             (this.offerID!=null &&
              this.offerID.equals(other.getOfferID()))) &&
            ((this.productID==null && other.getProductID()==null) || 
             (this.productID!=null &&
              this.productID.equals(other.getProductID()))) &&
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
        if (getSubscriberNumberNAI() != null) {
            _hashCode += getSubscriberNumberNAI().hashCode();
        }
        if (getSubscriberNumber() != null) {
            _hashCode += getSubscriberNumber().hashCode();
        }
        if (getOriginOperatorID() != null) {
            _hashCode += getOriginOperatorID().hashCode();
        }
        if (getOfferID() != null) {
            _hashCode += getOfferID().hashCode();
        }
        if (getProductID() != null) {
            _hashCode += getProductID().hashCode();
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
        new org.apache.axis.description.TypeDesc(UpdateCSProfileRequestDataHeaderDeleteOffer.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileRequest.xsd", ">>>UpdateCSProfileRequest>DataHeader>DeleteOffer"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriberNumberNAI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileRequest.xsd", "SubscriberNumberNAI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriberNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileRequest.xsd", "SubscriberNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originOperatorID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileRequest.xsd", "OriginOperatorID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offerID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileRequest.xsd", "OfferID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileRequest.xsd", "ProductID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("negotiatedCapabilities");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileRequest.xsd", "NegotiatedCapabilities"));
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
