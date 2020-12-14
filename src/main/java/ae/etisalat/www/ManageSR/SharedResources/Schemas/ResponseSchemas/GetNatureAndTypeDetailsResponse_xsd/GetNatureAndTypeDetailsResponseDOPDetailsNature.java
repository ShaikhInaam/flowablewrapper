/**
 * GetNatureAndTypeDetailsResponseDOPDetailsNature.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.GetNatureAndTypeDetailsResponse_xsd;

public class GetNatureAndTypeDetailsResponseDOPDetailsNature  implements java.io.Serializable {
    private String natureCode;

    private String natureDesc;

    public GetNatureAndTypeDetailsResponseDOPDetailsNature() {
    }

    public GetNatureAndTypeDetailsResponseDOPDetailsNature(
           String natureCode,
           String natureDesc) {
           this.natureCode = natureCode;
           this.natureDesc = natureDesc;
    }


    /**
     * Gets the natureCode value for this GetNatureAndTypeDetailsResponseDOPDetailsNature.
     * 
     * @return natureCode
     */
    public String getNatureCode() {
        return natureCode;
    }


    /**
     * Sets the natureCode value for this GetNatureAndTypeDetailsResponseDOPDetailsNature.
     * 
     * @param natureCode
     */
    public void setNatureCode(String natureCode) {
        this.natureCode = natureCode;
    }


    /**
     * Gets the natureDesc value for this GetNatureAndTypeDetailsResponseDOPDetailsNature.
     * 
     * @return natureDesc
     */
    public String getNatureDesc() {
        return natureDesc;
    }


    /**
     * Sets the natureDesc value for this GetNatureAndTypeDetailsResponseDOPDetailsNature.
     * 
     * @param natureDesc
     */
    public void setNatureDesc(String natureDesc) {
        this.natureDesc = natureDesc;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GetNatureAndTypeDetailsResponseDOPDetailsNature)) return false;
        GetNatureAndTypeDetailsResponseDOPDetailsNature other = (GetNatureAndTypeDetailsResponseDOPDetailsNature) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.natureCode==null && other.getNatureCode()==null) || 
             (this.natureCode!=null &&
              this.natureCode.equals(other.getNatureCode()))) &&
            ((this.natureDesc==null && other.getNatureDesc()==null) || 
             (this.natureDesc!=null &&
              this.natureDesc.equals(other.getNatureDesc())));
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
        if (getNatureCode() != null) {
            _hashCode += getNatureCode().hashCode();
        }
        if (getNatureDesc() != null) {
            _hashCode += getNatureDesc().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetNatureAndTypeDetailsResponseDOPDetailsNature.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/GetNatureAndTypeDetailsResponse.xsd", ">>>GetNatureAndTypeDetailsResponse>DOPDetails>Nature"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("natureCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/GetNatureAndTypeDetailsResponse.xsd", "NatureCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("natureDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/GetNatureAndTypeDetailsResponse.xsd", "NatureDesc"));
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
