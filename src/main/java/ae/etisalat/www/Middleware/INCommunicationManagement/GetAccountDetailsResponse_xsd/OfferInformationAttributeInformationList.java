/**
 * OfferInformationAttributeInformationList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd;

public class OfferInformationAttributeInformationList  implements java.io.Serializable {
    private String attributeName;

    private String attributeValueString;

    private String attributeValueDate;

    private ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.OfferInformationAttributeInformationListAttributeValueDecimal attributeValueDecimal;

    private String attributeSource;

    public OfferInformationAttributeInformationList() {
    }

    public OfferInformationAttributeInformationList(
           String attributeName,
           String attributeValueString,
           String attributeValueDate,
           ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.OfferInformationAttributeInformationListAttributeValueDecimal attributeValueDecimal,
           String attributeSource) {
           this.attributeName = attributeName;
           this.attributeValueString = attributeValueString;
           this.attributeValueDate = attributeValueDate;
           this.attributeValueDecimal = attributeValueDecimal;
           this.attributeSource = attributeSource;
    }


    /**
     * Gets the attributeName value for this OfferInformationAttributeInformationList.
     * 
     * @return attributeName
     */
    public String getAttributeName() {
        return attributeName;
    }


    /**
     * Sets the attributeName value for this OfferInformationAttributeInformationList.
     * 
     * @param attributeName
     */
    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }


    /**
     * Gets the attributeValueString value for this OfferInformationAttributeInformationList.
     * 
     * @return attributeValueString
     */
    public String getAttributeValueString() {
        return attributeValueString;
    }


    /**
     * Sets the attributeValueString value for this OfferInformationAttributeInformationList.
     * 
     * @param attributeValueString
     */
    public void setAttributeValueString(String attributeValueString) {
        this.attributeValueString = attributeValueString;
    }


    /**
     * Gets the attributeValueDate value for this OfferInformationAttributeInformationList.
     * 
     * @return attributeValueDate
     */
    public String getAttributeValueDate() {
        return attributeValueDate;
    }


    /**
     * Sets the attributeValueDate value for this OfferInformationAttributeInformationList.
     * 
     * @param attributeValueDate
     */
    public void setAttributeValueDate(String attributeValueDate) {
        this.attributeValueDate = attributeValueDate;
    }


    /**
     * Gets the attributeValueDecimal value for this OfferInformationAttributeInformationList.
     * 
     * @return attributeValueDecimal
     */
    public ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.OfferInformationAttributeInformationListAttributeValueDecimal getAttributeValueDecimal() {
        return attributeValueDecimal;
    }


    /**
     * Sets the attributeValueDecimal value for this OfferInformationAttributeInformationList.
     * 
     * @param attributeValueDecimal
     */
    public void setAttributeValueDecimal(ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.OfferInformationAttributeInformationListAttributeValueDecimal attributeValueDecimal) {
        this.attributeValueDecimal = attributeValueDecimal;
    }


    /**
     * Gets the attributeSource value for this OfferInformationAttributeInformationList.
     * 
     * @return attributeSource
     */
    public String getAttributeSource() {
        return attributeSource;
    }


    /**
     * Sets the attributeSource value for this OfferInformationAttributeInformationList.
     * 
     * @param attributeSource
     */
    public void setAttributeSource(String attributeSource) {
        this.attributeSource = attributeSource;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof OfferInformationAttributeInformationList)) return false;
        OfferInformationAttributeInformationList other = (OfferInformationAttributeInformationList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.attributeName==null && other.getAttributeName()==null) || 
             (this.attributeName!=null &&
              this.attributeName.equals(other.getAttributeName()))) &&
            ((this.attributeValueString==null && other.getAttributeValueString()==null) || 
             (this.attributeValueString!=null &&
              this.attributeValueString.equals(other.getAttributeValueString()))) &&
            ((this.attributeValueDate==null && other.getAttributeValueDate()==null) || 
             (this.attributeValueDate!=null &&
              this.attributeValueDate.equals(other.getAttributeValueDate()))) &&
            ((this.attributeValueDecimal==null && other.getAttributeValueDecimal()==null) || 
             (this.attributeValueDecimal!=null &&
              this.attributeValueDecimal.equals(other.getAttributeValueDecimal()))) &&
            ((this.attributeSource==null && other.getAttributeSource()==null) || 
             (this.attributeSource!=null &&
              this.attributeSource.equals(other.getAttributeSource())));
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
        if (getAttributeName() != null) {
            _hashCode += getAttributeName().hashCode();
        }
        if (getAttributeValueString() != null) {
            _hashCode += getAttributeValueString().hashCode();
        }
        if (getAttributeValueDate() != null) {
            _hashCode += getAttributeValueDate().hashCode();
        }
        if (getAttributeValueDecimal() != null) {
            _hashCode += getAttributeValueDecimal().hashCode();
        }
        if (getAttributeSource() != null) {
            _hashCode += getAttributeSource().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OfferInformationAttributeInformationList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", ">>OfferInformation>attributeInformationList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributeName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "attributeName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributeValueString");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "attributeValueString"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributeValueDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "attributeValueDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributeValueDecimal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "attributeValueDecimal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", ">>>OfferInformation>attributeInformationList>attributeValueDecimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributeSource");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "attributeSource"));
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
