/**
 * GetNatureAndTypeDetailsResponseGetNatureAndTypeDetailsComplaintTypeDetailsArray.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.GetNatureAndTypeDetailsResponse_xsd;

public class GetNatureAndTypeDetailsResponseGetNatureAndTypeDetailsComplaintTypeDetailsArray  implements java.io.Serializable {
    private String complaintTypeCode;

    private String complaintTypeDesc;

    public GetNatureAndTypeDetailsResponseGetNatureAndTypeDetailsComplaintTypeDetailsArray() {
    }

    public GetNatureAndTypeDetailsResponseGetNatureAndTypeDetailsComplaintTypeDetailsArray(
           String complaintTypeCode,
           String complaintTypeDesc) {
           this.complaintTypeCode = complaintTypeCode;
           this.complaintTypeDesc = complaintTypeDesc;
    }


    /**
     * Gets the complaintTypeCode value for this GetNatureAndTypeDetailsResponseGetNatureAndTypeDetailsComplaintTypeDetailsArray.
     * 
     * @return complaintTypeCode
     */
    public String getComplaintTypeCode() {
        return complaintTypeCode;
    }


    /**
     * Sets the complaintTypeCode value for this GetNatureAndTypeDetailsResponseGetNatureAndTypeDetailsComplaintTypeDetailsArray.
     * 
     * @param complaintTypeCode
     */
    public void setComplaintTypeCode(String complaintTypeCode) {
        this.complaintTypeCode = complaintTypeCode;
    }


    /**
     * Gets the complaintTypeDesc value for this GetNatureAndTypeDetailsResponseGetNatureAndTypeDetailsComplaintTypeDetailsArray.
     * 
     * @return complaintTypeDesc
     */
    public String getComplaintTypeDesc() {
        return complaintTypeDesc;
    }


    /**
     * Sets the complaintTypeDesc value for this GetNatureAndTypeDetailsResponseGetNatureAndTypeDetailsComplaintTypeDetailsArray.
     * 
     * @param complaintTypeDesc
     */
    public void setComplaintTypeDesc(String complaintTypeDesc) {
        this.complaintTypeDesc = complaintTypeDesc;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GetNatureAndTypeDetailsResponseGetNatureAndTypeDetailsComplaintTypeDetailsArray)) return false;
        GetNatureAndTypeDetailsResponseGetNatureAndTypeDetailsComplaintTypeDetailsArray other = (GetNatureAndTypeDetailsResponseGetNatureAndTypeDetailsComplaintTypeDetailsArray) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.complaintTypeCode==null && other.getComplaintTypeCode()==null) || 
             (this.complaintTypeCode!=null &&
              this.complaintTypeCode.equals(other.getComplaintTypeCode()))) &&
            ((this.complaintTypeDesc==null && other.getComplaintTypeDesc()==null) || 
             (this.complaintTypeDesc!=null &&
              this.complaintTypeDesc.equals(other.getComplaintTypeDesc())));
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
        if (getComplaintTypeCode() != null) {
            _hashCode += getComplaintTypeCode().hashCode();
        }
        if (getComplaintTypeDesc() != null) {
            _hashCode += getComplaintTypeDesc().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetNatureAndTypeDetailsResponseGetNatureAndTypeDetailsComplaintTypeDetailsArray.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/GetNatureAndTypeDetailsResponse.xsd", ">>>GetNatureAndTypeDetailsResponse>GetNatureAndTypeDetails>ComplaintTypeDetailsArray"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("complaintTypeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/GetNatureAndTypeDetailsResponse.xsd", "ComplaintTypeCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("complaintTypeDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/GetNatureAndTypeDetailsResponse.xsd", "ComplaintTypeDesc"));
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
