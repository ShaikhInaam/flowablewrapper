/**
 * GetNatureAndTypeDetailsResponseGetNatureAndTypeDetailsRequestTypeDetailsArray.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.GetNatureAndTypeDetailsResponse_xsd;

public class GetNatureAndTypeDetailsResponseGetNatureAndTypeDetailsRequestTypeDetailsArray  implements java.io.Serializable {
    private String requestTypeCode;

    private String requestTypeDesc;

    public GetNatureAndTypeDetailsResponseGetNatureAndTypeDetailsRequestTypeDetailsArray() {
    }

    public GetNatureAndTypeDetailsResponseGetNatureAndTypeDetailsRequestTypeDetailsArray(
           String requestTypeCode,
           String requestTypeDesc) {
           this.requestTypeCode = requestTypeCode;
           this.requestTypeDesc = requestTypeDesc;
    }


    /**
     * Gets the requestTypeCode value for this GetNatureAndTypeDetailsResponseGetNatureAndTypeDetailsRequestTypeDetailsArray.
     * 
     * @return requestTypeCode
     */
    public String getRequestTypeCode() {
        return requestTypeCode;
    }


    /**
     * Sets the requestTypeCode value for this GetNatureAndTypeDetailsResponseGetNatureAndTypeDetailsRequestTypeDetailsArray.
     * 
     * @param requestTypeCode
     */
    public void setRequestTypeCode(String requestTypeCode) {
        this.requestTypeCode = requestTypeCode;
    }


    /**
     * Gets the requestTypeDesc value for this GetNatureAndTypeDetailsResponseGetNatureAndTypeDetailsRequestTypeDetailsArray.
     * 
     * @return requestTypeDesc
     */
    public String getRequestTypeDesc() {
        return requestTypeDesc;
    }


    /**
     * Sets the requestTypeDesc value for this GetNatureAndTypeDetailsResponseGetNatureAndTypeDetailsRequestTypeDetailsArray.
     * 
     * @param requestTypeDesc
     */
    public void setRequestTypeDesc(String requestTypeDesc) {
        this.requestTypeDesc = requestTypeDesc;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GetNatureAndTypeDetailsResponseGetNatureAndTypeDetailsRequestTypeDetailsArray)) return false;
        GetNatureAndTypeDetailsResponseGetNatureAndTypeDetailsRequestTypeDetailsArray other = (GetNatureAndTypeDetailsResponseGetNatureAndTypeDetailsRequestTypeDetailsArray) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.requestTypeCode==null && other.getRequestTypeCode()==null) || 
             (this.requestTypeCode!=null &&
              this.requestTypeCode.equals(other.getRequestTypeCode()))) &&
            ((this.requestTypeDesc==null && other.getRequestTypeDesc()==null) || 
             (this.requestTypeDesc!=null &&
              this.requestTypeDesc.equals(other.getRequestTypeDesc())));
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
        if (getRequestTypeCode() != null) {
            _hashCode += getRequestTypeCode().hashCode();
        }
        if (getRequestTypeDesc() != null) {
            _hashCode += getRequestTypeDesc().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetNatureAndTypeDetailsResponseGetNatureAndTypeDetailsRequestTypeDetailsArray.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/GetNatureAndTypeDetailsResponse.xsd", ">>>GetNatureAndTypeDetailsResponse>GetNatureAndTypeDetails>RequestTypeDetailsArray"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestTypeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/GetNatureAndTypeDetailsResponse.xsd", "RequestTypeCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestTypeDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/GetNatureAndTypeDetailsResponse.xsd", "RequestTypeDesc"));
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
