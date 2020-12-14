/**
 * GetAccountDetailsResponseResponseHeaderGetUsageThresholdsAndCounterUsageCounterUsageThresholdInformation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd;

public class GetAccountDetailsResponseResponseHeaderGetUsageThresholdsAndCounterUsageCounterUsageThresholdInformation  implements java.io.Serializable {
    private String usageCounterID;

    private String usageCounterValue;

    private String usageCounterMonetaryValue1;

    private String usageCounterMonetaryValue2;

    private String associatedPartyID;

    private String productID;

    private String UCDesc;

    private ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.GetAccountDetailsResponseResponseHeaderGetUsageThresholdsAndCounterUsageCounterUsageThresholdInformationUsageThresholdInformation[] usageThresholdInformation;

    public GetAccountDetailsResponseResponseHeaderGetUsageThresholdsAndCounterUsageCounterUsageThresholdInformation() {
    }

    public GetAccountDetailsResponseResponseHeaderGetUsageThresholdsAndCounterUsageCounterUsageThresholdInformation(
           String usageCounterID,
           String usageCounterValue,
           String usageCounterMonetaryValue1,
           String usageCounterMonetaryValue2,
           String associatedPartyID,
           String productID,
           String UCDesc,
           ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.GetAccountDetailsResponseResponseHeaderGetUsageThresholdsAndCounterUsageCounterUsageThresholdInformationUsageThresholdInformation[] usageThresholdInformation) {
           this.usageCounterID = usageCounterID;
           this.usageCounterValue = usageCounterValue;
           this.usageCounterMonetaryValue1 = usageCounterMonetaryValue1;
           this.usageCounterMonetaryValue2 = usageCounterMonetaryValue2;
           this.associatedPartyID = associatedPartyID;
           this.productID = productID;
           this.UCDesc = UCDesc;
           this.usageThresholdInformation = usageThresholdInformation;
    }


    /**
     * Gets the usageCounterID value for this GetAccountDetailsResponseResponseHeaderGetUsageThresholdsAndCounterUsageCounterUsageThresholdInformation.
     * 
     * @return usageCounterID
     */
    public String getUsageCounterID() {
        return usageCounterID;
    }


    /**
     * Sets the usageCounterID value for this GetAccountDetailsResponseResponseHeaderGetUsageThresholdsAndCounterUsageCounterUsageThresholdInformation.
     * 
     * @param usageCounterID
     */
    public void setUsageCounterID(String usageCounterID) {
        this.usageCounterID = usageCounterID;
    }


    /**
     * Gets the usageCounterValue value for this GetAccountDetailsResponseResponseHeaderGetUsageThresholdsAndCounterUsageCounterUsageThresholdInformation.
     * 
     * @return usageCounterValue
     */
    public String getUsageCounterValue() {
        return usageCounterValue;
    }


    /**
     * Sets the usageCounterValue value for this GetAccountDetailsResponseResponseHeaderGetUsageThresholdsAndCounterUsageCounterUsageThresholdInformation.
     * 
     * @param usageCounterValue
     */
    public void setUsageCounterValue(String usageCounterValue) {
        this.usageCounterValue = usageCounterValue;
    }


    /**
     * Gets the usageCounterMonetaryValue1 value for this GetAccountDetailsResponseResponseHeaderGetUsageThresholdsAndCounterUsageCounterUsageThresholdInformation.
     * 
     * @return usageCounterMonetaryValue1
     */
    public String getUsageCounterMonetaryValue1() {
        return usageCounterMonetaryValue1;
    }


    /**
     * Sets the usageCounterMonetaryValue1 value for this GetAccountDetailsResponseResponseHeaderGetUsageThresholdsAndCounterUsageCounterUsageThresholdInformation.
     * 
     * @param usageCounterMonetaryValue1
     */
    public void setUsageCounterMonetaryValue1(String usageCounterMonetaryValue1) {
        this.usageCounterMonetaryValue1 = usageCounterMonetaryValue1;
    }


    /**
     * Gets the usageCounterMonetaryValue2 value for this GetAccountDetailsResponseResponseHeaderGetUsageThresholdsAndCounterUsageCounterUsageThresholdInformation.
     * 
     * @return usageCounterMonetaryValue2
     */
    public String getUsageCounterMonetaryValue2() {
        return usageCounterMonetaryValue2;
    }


    /**
     * Sets the usageCounterMonetaryValue2 value for this GetAccountDetailsResponseResponseHeaderGetUsageThresholdsAndCounterUsageCounterUsageThresholdInformation.
     * 
     * @param usageCounterMonetaryValue2
     */
    public void setUsageCounterMonetaryValue2(String usageCounterMonetaryValue2) {
        this.usageCounterMonetaryValue2 = usageCounterMonetaryValue2;
    }


    /**
     * Gets the associatedPartyID value for this GetAccountDetailsResponseResponseHeaderGetUsageThresholdsAndCounterUsageCounterUsageThresholdInformation.
     * 
     * @return associatedPartyID
     */
    public String getAssociatedPartyID() {
        return associatedPartyID;
    }


    /**
     * Sets the associatedPartyID value for this GetAccountDetailsResponseResponseHeaderGetUsageThresholdsAndCounterUsageCounterUsageThresholdInformation.
     * 
     * @param associatedPartyID
     */
    public void setAssociatedPartyID(String associatedPartyID) {
        this.associatedPartyID = associatedPartyID;
    }


    /**
     * Gets the productID value for this GetAccountDetailsResponseResponseHeaderGetUsageThresholdsAndCounterUsageCounterUsageThresholdInformation.
     * 
     * @return productID
     */
    public String getProductID() {
        return productID;
    }


    /**
     * Sets the productID value for this GetAccountDetailsResponseResponseHeaderGetUsageThresholdsAndCounterUsageCounterUsageThresholdInformation.
     * 
     * @param productID
     */
    public void setProductID(String productID) {
        this.productID = productID;
    }


    /**
     * Gets the UCDesc value for this GetAccountDetailsResponseResponseHeaderGetUsageThresholdsAndCounterUsageCounterUsageThresholdInformation.
     * 
     * @return UCDesc
     */
    public String getUCDesc() {
        return UCDesc;
    }


    /**
     * Sets the UCDesc value for this GetAccountDetailsResponseResponseHeaderGetUsageThresholdsAndCounterUsageCounterUsageThresholdInformation.
     * 
     * @param UCDesc
     */
    public void setUCDesc(String UCDesc) {
        this.UCDesc = UCDesc;
    }


    /**
     * Gets the usageThresholdInformation value for this GetAccountDetailsResponseResponseHeaderGetUsageThresholdsAndCounterUsageCounterUsageThresholdInformation.
     * 
     * @return usageThresholdInformation
     */
    public ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.GetAccountDetailsResponseResponseHeaderGetUsageThresholdsAndCounterUsageCounterUsageThresholdInformationUsageThresholdInformation[] getUsageThresholdInformation() {
        return usageThresholdInformation;
    }


    /**
     * Sets the usageThresholdInformation value for this GetAccountDetailsResponseResponseHeaderGetUsageThresholdsAndCounterUsageCounterUsageThresholdInformation.
     * 
     * @param usageThresholdInformation
     */
    public void setUsageThresholdInformation(ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.GetAccountDetailsResponseResponseHeaderGetUsageThresholdsAndCounterUsageCounterUsageThresholdInformationUsageThresholdInformation[] usageThresholdInformation) {
        this.usageThresholdInformation = usageThresholdInformation;
    }

    public ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.GetAccountDetailsResponseResponseHeaderGetUsageThresholdsAndCounterUsageCounterUsageThresholdInformationUsageThresholdInformation getUsageThresholdInformation(int i) {
        return this.usageThresholdInformation[i];
    }

    public void setUsageThresholdInformation(int i, ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.GetAccountDetailsResponseResponseHeaderGetUsageThresholdsAndCounterUsageCounterUsageThresholdInformationUsageThresholdInformation _value) {
        this.usageThresholdInformation[i] = _value;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GetAccountDetailsResponseResponseHeaderGetUsageThresholdsAndCounterUsageCounterUsageThresholdInformation)) return false;
        GetAccountDetailsResponseResponseHeaderGetUsageThresholdsAndCounterUsageCounterUsageThresholdInformation other = (GetAccountDetailsResponseResponseHeaderGetUsageThresholdsAndCounterUsageCounterUsageThresholdInformation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.usageCounterID==null && other.getUsageCounterID()==null) || 
             (this.usageCounterID!=null &&
              this.usageCounterID.equals(other.getUsageCounterID()))) &&
            ((this.usageCounterValue==null && other.getUsageCounterValue()==null) || 
             (this.usageCounterValue!=null &&
              this.usageCounterValue.equals(other.getUsageCounterValue()))) &&
            ((this.usageCounterMonetaryValue1==null && other.getUsageCounterMonetaryValue1()==null) || 
             (this.usageCounterMonetaryValue1!=null &&
              this.usageCounterMonetaryValue1.equals(other.getUsageCounterMonetaryValue1()))) &&
            ((this.usageCounterMonetaryValue2==null && other.getUsageCounterMonetaryValue2()==null) || 
             (this.usageCounterMonetaryValue2!=null &&
              this.usageCounterMonetaryValue2.equals(other.getUsageCounterMonetaryValue2()))) &&
            ((this.associatedPartyID==null && other.getAssociatedPartyID()==null) || 
             (this.associatedPartyID!=null &&
              this.associatedPartyID.equals(other.getAssociatedPartyID()))) &&
            ((this.productID==null && other.getProductID()==null) || 
             (this.productID!=null &&
              this.productID.equals(other.getProductID()))) &&
            ((this.UCDesc==null && other.getUCDesc()==null) || 
             (this.UCDesc!=null &&
              this.UCDesc.equals(other.getUCDesc()))) &&
            ((this.usageThresholdInformation==null && other.getUsageThresholdInformation()==null) || 
             (this.usageThresholdInformation!=null &&
              java.util.Arrays.equals(this.usageThresholdInformation, other.getUsageThresholdInformation())));
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
        if (getUsageCounterID() != null) {
            _hashCode += getUsageCounterID().hashCode();
        }
        if (getUsageCounterValue() != null) {
            _hashCode += getUsageCounterValue().hashCode();
        }
        if (getUsageCounterMonetaryValue1() != null) {
            _hashCode += getUsageCounterMonetaryValue1().hashCode();
        }
        if (getUsageCounterMonetaryValue2() != null) {
            _hashCode += getUsageCounterMonetaryValue2().hashCode();
        }
        if (getAssociatedPartyID() != null) {
            _hashCode += getAssociatedPartyID().hashCode();
        }
        if (getProductID() != null) {
            _hashCode += getProductID().hashCode();
        }
        if (getUCDesc() != null) {
            _hashCode += getUCDesc().hashCode();
        }
        if (getUsageThresholdInformation() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUsageThresholdInformation());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getUsageThresholdInformation(), i);
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
        new org.apache.axis.description.TypeDesc(GetAccountDetailsResponseResponseHeaderGetUsageThresholdsAndCounterUsageCounterUsageThresholdInformation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", ">>>>GetAccountDetailsResponse>ResponseHeader>GetUsageThresholdsAndCounter>UsageCounterUsageThresholdInformation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usageCounterID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "UsageCounterID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usageCounterValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "UsageCounterValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usageCounterMonetaryValue1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "UsageCounterMonetaryValue1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usageCounterMonetaryValue2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "UsageCounterMonetaryValue2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("associatedPartyID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "AssociatedPartyID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "ProductID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("UCDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "UCDesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usageThresholdInformation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "UsageThresholdInformation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", ">>>>>GetAccountDetailsResponse>ResponseHeader>GetUsageThresholdsAndCounter>UsageCounterUsageThresholdInformation>UsageThresholdInformation"));
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
