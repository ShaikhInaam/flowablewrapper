/**
 * OfferInformationAttributeInformationListAttributeValueDecimal.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd;

public class OfferInformationAttributeInformationListAttributeValueDecimal  implements java.io.Serializable {
    private String attributeValueNumber;

    private String numberOfDecimals;

    public OfferInformationAttributeInformationListAttributeValueDecimal() {
    }

    public OfferInformationAttributeInformationListAttributeValueDecimal(
           String attributeValueNumber,
           String numberOfDecimals) {
           this.attributeValueNumber = attributeValueNumber;
           this.numberOfDecimals = numberOfDecimals;
    }


    /**
     * Gets the attributeValueNumber value for this OfferInformationAttributeInformationListAttributeValueDecimal.
     * 
     * @return attributeValueNumber
     */
    public String getAttributeValueNumber() {
        return attributeValueNumber;
    }


    /**
     * Sets the attributeValueNumber value for this OfferInformationAttributeInformationListAttributeValueDecimal.
     * 
     * @param attributeValueNumber
     */
    public void setAttributeValueNumber(String attributeValueNumber) {
        this.attributeValueNumber = attributeValueNumber;
    }


    /**
     * Gets the numberOfDecimals value for this OfferInformationAttributeInformationListAttributeValueDecimal.
     * 
     * @return numberOfDecimals
     */
    public String getNumberOfDecimals() {
        return numberOfDecimals;
    }


    /**
     * Sets the numberOfDecimals value for this OfferInformationAttributeInformationListAttributeValueDecimal.
     * 
     * @param numberOfDecimals
     */
    public void setNumberOfDecimals(String numberOfDecimals) {
        this.numberOfDecimals = numberOfDecimals;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof OfferInformationAttributeInformationListAttributeValueDecimal)) return false;
        OfferInformationAttributeInformationListAttributeValueDecimal other = (OfferInformationAttributeInformationListAttributeValueDecimal) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.attributeValueNumber==null && other.getAttributeValueNumber()==null) || 
             (this.attributeValueNumber!=null &&
              this.attributeValueNumber.equals(other.getAttributeValueNumber()))) &&
            ((this.numberOfDecimals==null && other.getNumberOfDecimals()==null) || 
             (this.numberOfDecimals!=null &&
              this.numberOfDecimals.equals(other.getNumberOfDecimals())));
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
        if (getAttributeValueNumber() != null) {
            _hashCode += getAttributeValueNumber().hashCode();
        }
        if (getNumberOfDecimals() != null) {
            _hashCode += getNumberOfDecimals().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OfferInformationAttributeInformationListAttributeValueDecimal.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", ">>>OfferInformation>attributeInformationList>attributeValueDecimal"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributeValueNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "attributeValueNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberOfDecimals");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "numberOfDecimals"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
