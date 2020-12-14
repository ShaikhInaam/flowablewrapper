/**
 * GetNatureAndTypeDetailsResponseDOPDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.GetNatureAndTypeDetailsResponse_xsd;

public class GetNatureAndTypeDetailsResponseDOPDetails  implements java.io.Serializable {
    private GetNatureAndTypeDetailsResponseDOPDetailsNature nature;

    private GetNatureAndTypeDetailsResponseDOPDetailsType type;

    public GetNatureAndTypeDetailsResponseDOPDetails() {
    }

    public GetNatureAndTypeDetailsResponseDOPDetails(
           GetNatureAndTypeDetailsResponseDOPDetailsNature nature,
           GetNatureAndTypeDetailsResponseDOPDetailsType type) {
           this.nature = nature;
           this.type = type;
    }


    /**
     * Gets the nature value for this GetNatureAndTypeDetailsResponseDOPDetails.
     * 
     * @return nature
     */
    public GetNatureAndTypeDetailsResponseDOPDetailsNature getNature() {
        return nature;
    }


    /**
     * Sets the nature value for this GetNatureAndTypeDetailsResponseDOPDetails.
     * 
     * @param nature
     */
    public void setNature(GetNatureAndTypeDetailsResponseDOPDetailsNature nature) {
        this.nature = nature;
    }


    /**
     * Gets the type value for this GetNatureAndTypeDetailsResponseDOPDetails.
     * 
     * @return type
     */
    public GetNatureAndTypeDetailsResponseDOPDetailsType getType() {
        return type;
    }


    /**
     * Sets the type value for this GetNatureAndTypeDetailsResponseDOPDetails.
     * 
     * @param type
     */
    public void setType(GetNatureAndTypeDetailsResponseDOPDetailsType type) {
        this.type = type;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GetNatureAndTypeDetailsResponseDOPDetails)) return false;
        GetNatureAndTypeDetailsResponseDOPDetails other = (GetNatureAndTypeDetailsResponseDOPDetails) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nature==null && other.getNature()==null) || 
             (this.nature!=null &&
              this.nature.equals(other.getNature()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType())));
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
        if (getNature() != null) {
            _hashCode += getNature().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetNatureAndTypeDetailsResponseDOPDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/GetNatureAndTypeDetailsResponse.xsd", ">>GetNatureAndTypeDetailsResponse>DOPDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nature");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/GetNatureAndTypeDetailsResponse.xsd", "Nature"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/GetNatureAndTypeDetailsResponse.xsd", ">>>GetNatureAndTypeDetailsResponse>DOPDetails>Nature"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/GetNatureAndTypeDetailsResponse.xsd", "Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/GetNatureAndTypeDetailsResponse.xsd", ">>>GetNatureAndTypeDetailsResponse>DOPDetails>Type"));
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
