/**
 * SubmitVoucherActionRequestDataHeaderVoucherDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ae.etisalat.www.Middleware.INCommunicationManagement.SubmitVoucherActionRequest_xsd;

public class SubmitVoucherActionRequestDataHeaderVoucherDetails  implements java.io.Serializable {
    private String serialNumber;

    private String activationCode;

    public SubmitVoucherActionRequestDataHeaderVoucherDetails() {
    }

    public SubmitVoucherActionRequestDataHeaderVoucherDetails(
           String serialNumber,
           String activationCode) {
           this.serialNumber = serialNumber;
           this.activationCode = activationCode;
    }


    /**
     * Gets the serialNumber value for this SubmitVoucherActionRequestDataHeaderVoucherDetails.
     * 
     * @return serialNumber
     */
    public String getSerialNumber() {
        return serialNumber;
    }


    /**
     * Sets the serialNumber value for this SubmitVoucherActionRequestDataHeaderVoucherDetails.
     * 
     * @param serialNumber
     */
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }


    /**
     * Gets the activationCode value for this SubmitVoucherActionRequestDataHeaderVoucherDetails.
     * 
     * @return activationCode
     */
    public String getActivationCode() {
        return activationCode;
    }


    /**
     * Sets the activationCode value for this SubmitVoucherActionRequestDataHeaderVoucherDetails.
     * 
     * @param activationCode
     */
    public void setActivationCode(String activationCode) {
        this.activationCode = activationCode;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof SubmitVoucherActionRequestDataHeaderVoucherDetails)) return false;
        SubmitVoucherActionRequestDataHeaderVoucherDetails other = (SubmitVoucherActionRequestDataHeaderVoucherDetails) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.serialNumber==null && other.getSerialNumber()==null) || 
             (this.serialNumber!=null &&
              this.serialNumber.equals(other.getSerialNumber()))) &&
            ((this.activationCode==null && other.getActivationCode()==null) || 
             (this.activationCode!=null &&
              this.activationCode.equals(other.getActivationCode())));
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
        if (getSerialNumber() != null) {
            _hashCode += getSerialNumber().hashCode();
        }
        if (getActivationCode() != null) {
            _hashCode += getActivationCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SubmitVoucherActionRequestDataHeaderVoucherDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/SubmitVoucherActionRequest.xsd", ">>>SubmitVoucherActionRequest>DataHeader>VoucherDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serialNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/SubmitVoucherActionRequest.xsd", "SerialNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activationCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/SubmitVoucherActionRequest.xsd", "ActivationCode"));
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
