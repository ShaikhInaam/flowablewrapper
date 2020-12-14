/**
 * UpdateCSProfileResponseResponseHeaderDeleteOfferOfferInformationUsageCounterUsageThresholdInformationUsageThresholdInformation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ae.etisalat.www.Middleware.INCommunicationManagement.UpdateCSProfileResponset_xsd;

public class UpdateCSProfileResponseResponseHeaderDeleteOfferOfferInformationUsageCounterUsageThresholdInformationUsageThresholdInformation  implements java.io.Serializable {
    private String usageThresholdID;

    private String usageThresholdValue;

    private String usageThresholdMonetaryValue1;

    private String usageThresholdMonetaryValue2;

    private String usageThresholdSource;

    private String associatedPartyID;

    public UpdateCSProfileResponseResponseHeaderDeleteOfferOfferInformationUsageCounterUsageThresholdInformationUsageThresholdInformation() {
    }

    public UpdateCSProfileResponseResponseHeaderDeleteOfferOfferInformationUsageCounterUsageThresholdInformationUsageThresholdInformation(
           String usageThresholdID,
           String usageThresholdValue,
           String usageThresholdMonetaryValue1,
           String usageThresholdMonetaryValue2,
           String usageThresholdSource,
           String associatedPartyID) {
           this.usageThresholdID = usageThresholdID;
           this.usageThresholdValue = usageThresholdValue;
           this.usageThresholdMonetaryValue1 = usageThresholdMonetaryValue1;
           this.usageThresholdMonetaryValue2 = usageThresholdMonetaryValue2;
           this.usageThresholdSource = usageThresholdSource;
           this.associatedPartyID = associatedPartyID;
    }


    /**
     * Gets the usageThresholdID value for this UpdateCSProfileResponseResponseHeaderDeleteOfferOfferInformationUsageCounterUsageThresholdInformationUsageThresholdInformation.
     * 
     * @return usageThresholdID
     */
    public String getUsageThresholdID() {
        return usageThresholdID;
    }


    /**
     * Sets the usageThresholdID value for this UpdateCSProfileResponseResponseHeaderDeleteOfferOfferInformationUsageCounterUsageThresholdInformationUsageThresholdInformation.
     * 
     * @param usageThresholdID
     */
    public void setUsageThresholdID(String usageThresholdID) {
        this.usageThresholdID = usageThresholdID;
    }


    /**
     * Gets the usageThresholdValue value for this UpdateCSProfileResponseResponseHeaderDeleteOfferOfferInformationUsageCounterUsageThresholdInformationUsageThresholdInformation.
     * 
     * @return usageThresholdValue
     */
    public String getUsageThresholdValue() {
        return usageThresholdValue;
    }


    /**
     * Sets the usageThresholdValue value for this UpdateCSProfileResponseResponseHeaderDeleteOfferOfferInformationUsageCounterUsageThresholdInformationUsageThresholdInformation.
     * 
     * @param usageThresholdValue
     */
    public void setUsageThresholdValue(String usageThresholdValue) {
        this.usageThresholdValue = usageThresholdValue;
    }


    /**
     * Gets the usageThresholdMonetaryValue1 value for this UpdateCSProfileResponseResponseHeaderDeleteOfferOfferInformationUsageCounterUsageThresholdInformationUsageThresholdInformation.
     * 
     * @return usageThresholdMonetaryValue1
     */
    public String getUsageThresholdMonetaryValue1() {
        return usageThresholdMonetaryValue1;
    }


    /**
     * Sets the usageThresholdMonetaryValue1 value for this UpdateCSProfileResponseResponseHeaderDeleteOfferOfferInformationUsageCounterUsageThresholdInformationUsageThresholdInformation.
     * 
     * @param usageThresholdMonetaryValue1
     */
    public void setUsageThresholdMonetaryValue1(String usageThresholdMonetaryValue1) {
        this.usageThresholdMonetaryValue1 = usageThresholdMonetaryValue1;
    }


    /**
     * Gets the usageThresholdMonetaryValue2 value for this UpdateCSProfileResponseResponseHeaderDeleteOfferOfferInformationUsageCounterUsageThresholdInformationUsageThresholdInformation.
     * 
     * @return usageThresholdMonetaryValue2
     */
    public String getUsageThresholdMonetaryValue2() {
        return usageThresholdMonetaryValue2;
    }


    /**
     * Sets the usageThresholdMonetaryValue2 value for this UpdateCSProfileResponseResponseHeaderDeleteOfferOfferInformationUsageCounterUsageThresholdInformationUsageThresholdInformation.
     * 
     * @param usageThresholdMonetaryValue2
     */
    public void setUsageThresholdMonetaryValue2(String usageThresholdMonetaryValue2) {
        this.usageThresholdMonetaryValue2 = usageThresholdMonetaryValue2;
    }


    /**
     * Gets the usageThresholdSource value for this UpdateCSProfileResponseResponseHeaderDeleteOfferOfferInformationUsageCounterUsageThresholdInformationUsageThresholdInformation.
     * 
     * @return usageThresholdSource
     */
    public String getUsageThresholdSource() {
        return usageThresholdSource;
    }


    /**
     * Sets the usageThresholdSource value for this UpdateCSProfileResponseResponseHeaderDeleteOfferOfferInformationUsageCounterUsageThresholdInformationUsageThresholdInformation.
     * 
     * @param usageThresholdSource
     */
    public void setUsageThresholdSource(String usageThresholdSource) {
        this.usageThresholdSource = usageThresholdSource;
    }


    /**
     * Gets the associatedPartyID value for this UpdateCSProfileResponseResponseHeaderDeleteOfferOfferInformationUsageCounterUsageThresholdInformationUsageThresholdInformation.
     * 
     * @return associatedPartyID
     */
    public String getAssociatedPartyID() {
        return associatedPartyID;
    }


    /**
     * Sets the associatedPartyID value for this UpdateCSProfileResponseResponseHeaderDeleteOfferOfferInformationUsageCounterUsageThresholdInformationUsageThresholdInformation.
     * 
     * @param associatedPartyID
     */
    public void setAssociatedPartyID(String associatedPartyID) {
        this.associatedPartyID = associatedPartyID;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof UpdateCSProfileResponseResponseHeaderDeleteOfferOfferInformationUsageCounterUsageThresholdInformationUsageThresholdInformation)) return false;
        UpdateCSProfileResponseResponseHeaderDeleteOfferOfferInformationUsageCounterUsageThresholdInformationUsageThresholdInformation other = (UpdateCSProfileResponseResponseHeaderDeleteOfferOfferInformationUsageCounterUsageThresholdInformationUsageThresholdInformation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.usageThresholdID==null && other.getUsageThresholdID()==null) || 
             (this.usageThresholdID!=null &&
              this.usageThresholdID.equals(other.getUsageThresholdID()))) &&
            ((this.usageThresholdValue==null && other.getUsageThresholdValue()==null) || 
             (this.usageThresholdValue!=null &&
              this.usageThresholdValue.equals(other.getUsageThresholdValue()))) &&
            ((this.usageThresholdMonetaryValue1==null && other.getUsageThresholdMonetaryValue1()==null) || 
             (this.usageThresholdMonetaryValue1!=null &&
              this.usageThresholdMonetaryValue1.equals(other.getUsageThresholdMonetaryValue1()))) &&
            ((this.usageThresholdMonetaryValue2==null && other.getUsageThresholdMonetaryValue2()==null) || 
             (this.usageThresholdMonetaryValue2!=null &&
              this.usageThresholdMonetaryValue2.equals(other.getUsageThresholdMonetaryValue2()))) &&
            ((this.usageThresholdSource==null && other.getUsageThresholdSource()==null) || 
             (this.usageThresholdSource!=null &&
              this.usageThresholdSource.equals(other.getUsageThresholdSource()))) &&
            ((this.associatedPartyID==null && other.getAssociatedPartyID()==null) || 
             (this.associatedPartyID!=null &&
              this.associatedPartyID.equals(other.getAssociatedPartyID())));
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
        if (getUsageThresholdID() != null) {
            _hashCode += getUsageThresholdID().hashCode();
        }
        if (getUsageThresholdValue() != null) {
            _hashCode += getUsageThresholdValue().hashCode();
        }
        if (getUsageThresholdMonetaryValue1() != null) {
            _hashCode += getUsageThresholdMonetaryValue1().hashCode();
        }
        if (getUsageThresholdMonetaryValue2() != null) {
            _hashCode += getUsageThresholdMonetaryValue2().hashCode();
        }
        if (getUsageThresholdSource() != null) {
            _hashCode += getUsageThresholdSource().hashCode();
        }
        if (getAssociatedPartyID() != null) {
            _hashCode += getAssociatedPartyID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateCSProfileResponseResponseHeaderDeleteOfferOfferInformationUsageCounterUsageThresholdInformationUsageThresholdInformation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileResponset.xsd", ">>>>>>UpdateCSProfileResponse>ResponseHeader>DeleteOffer>OfferInformation>UsageCounterUsageThresholdInformation>UsageThresholdInformation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usageThresholdID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileResponset.xsd", "UsageThresholdID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usageThresholdValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileResponset.xsd", "UsageThresholdValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usageThresholdMonetaryValue1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileResponset.xsd", "UsageThresholdMonetaryValue1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usageThresholdMonetaryValue2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileResponset.xsd", "UsageThresholdMonetaryValue2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usageThresholdSource");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileResponset.xsd", "UsageThresholdSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("associatedPartyID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileResponset.xsd", "AssociatedPartyID"));
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
