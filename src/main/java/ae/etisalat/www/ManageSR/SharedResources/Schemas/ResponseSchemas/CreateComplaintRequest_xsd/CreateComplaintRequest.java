/**
 * CreateComplaintRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.CreateComplaintRequest_xsd;

public class CreateComplaintRequest  implements java.io.Serializable {
    private com.tibco.www.schemas.Middleware.SharedResources.Schemas.CommonSchema.ApplicationHeader_xsd.ApplicationHeader applicationHeader;

    private ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.CreateComplaintRequest_xsd.CreateComplaintRequestDataHeader dataHeader;

    public CreateComplaintRequest() {
    }

    public CreateComplaintRequest(
           com.tibco.www.schemas.Middleware.SharedResources.Schemas.CommonSchema.ApplicationHeader_xsd.ApplicationHeader applicationHeader,
           ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.CreateComplaintRequest_xsd.CreateComplaintRequestDataHeader dataHeader) {
           this.applicationHeader = applicationHeader;
           this.dataHeader = dataHeader;
    }


    /**
     * Gets the applicationHeader value for this CreateComplaintRequest.
     * 
     * @return applicationHeader
     */
    public com.tibco.www.schemas.Middleware.SharedResources.Schemas.CommonSchema.ApplicationHeader_xsd.ApplicationHeader getApplicationHeader() {
        return applicationHeader;
    }


    /**
     * Sets the applicationHeader value for this CreateComplaintRequest.
     * 
     * @param applicationHeader
     */
    public void setApplicationHeader(com.tibco.www.schemas.Middleware.SharedResources.Schemas.CommonSchema.ApplicationHeader_xsd.ApplicationHeader applicationHeader) {
        this.applicationHeader = applicationHeader;
    }


    /**
     * Gets the dataHeader value for this CreateComplaintRequest.
     * 
     * @return dataHeader
     */
    public ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.CreateComplaintRequest_xsd.CreateComplaintRequestDataHeader getDataHeader() {
        return dataHeader;
    }


    /**
     * Sets the dataHeader value for this CreateComplaintRequest.
     * 
     * @param dataHeader
     */
    public void setDataHeader(ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.CreateComplaintRequest_xsd.CreateComplaintRequestDataHeader dataHeader) {
        this.dataHeader = dataHeader;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CreateComplaintRequest)) return false;
        CreateComplaintRequest other = (CreateComplaintRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.applicationHeader==null && other.getApplicationHeader()==null) || 
             (this.applicationHeader!=null &&
              this.applicationHeader.equals(other.getApplicationHeader()))) &&
            ((this.dataHeader==null && other.getDataHeader()==null) || 
             (this.dataHeader!=null &&
              this.dataHeader.equals(other.getDataHeader())));
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
        if (getApplicationHeader() != null) {
            _hashCode += getApplicationHeader().hashCode();
        }
        if (getDataHeader() != null) {
            _hashCode += getDataHeader().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateComplaintRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/CreateComplaintRequest.xsd", ">CreateComplaintRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicationHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.tibco.com/schemas/Middleware/SharedResources/Schemas/CommonSchema/ApplicationHeader.xsd", "ApplicationHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.tibco.com/schemas/Middleware/SharedResources/Schemas/CommonSchema/ApplicationHeader.xsd", ">ApplicationHeader"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/CreateComplaintRequest.xsd", "DataHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/CreateComplaintRequest.xsd", ">>CreateComplaintRequest>DataHeader"));
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
