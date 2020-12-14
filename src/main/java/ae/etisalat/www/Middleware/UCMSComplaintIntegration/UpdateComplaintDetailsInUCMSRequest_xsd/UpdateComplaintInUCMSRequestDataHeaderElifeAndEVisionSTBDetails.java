/**
 * UpdateComplaintInUCMSRequestDataHeaderElifeAndEVisionSTBDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintDetailsInUCMSRequest_xsd;

public class UpdateComplaintInUCMSRequestDataHeaderElifeAndEVisionSTBDetails  implements java.io.Serializable {
    private String serialNumber;

    private String MACAddress;

    private String STBType;

    public UpdateComplaintInUCMSRequestDataHeaderElifeAndEVisionSTBDetails() {
    }

    public UpdateComplaintInUCMSRequestDataHeaderElifeAndEVisionSTBDetails(
           String serialNumber,
           String MACAddress,
           String STBType) {
           this.serialNumber = serialNumber;
           this.MACAddress = MACAddress;
           this.STBType = STBType;
    }


    /**
     * Gets the serialNumber value for this UpdateComplaintInUCMSRequestDataHeaderElifeAndEVisionSTBDetails.
     * 
     * @return serialNumber
     */
    public String getSerialNumber() {
        return serialNumber;
    }


    /**
     * Sets the serialNumber value for this UpdateComplaintInUCMSRequestDataHeaderElifeAndEVisionSTBDetails.
     * 
     * @param serialNumber
     */
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }


    /**
     * Gets the MACAddress value for this UpdateComplaintInUCMSRequestDataHeaderElifeAndEVisionSTBDetails.
     * 
     * @return MACAddress
     */
    public String getMACAddress() {
        return MACAddress;
    }


    /**
     * Sets the MACAddress value for this UpdateComplaintInUCMSRequestDataHeaderElifeAndEVisionSTBDetails.
     * 
     * @param MACAddress
     */
    public void setMACAddress(String MACAddress) {
        this.MACAddress = MACAddress;
    }


    /**
     * Gets the STBType value for this UpdateComplaintInUCMSRequestDataHeaderElifeAndEVisionSTBDetails.
     * 
     * @return STBType
     */
    public String getSTBType() {
        return STBType;
    }


    /**
     * Sets the STBType value for this UpdateComplaintInUCMSRequestDataHeaderElifeAndEVisionSTBDetails.
     * 
     * @param STBType
     */
    public void setSTBType(String STBType) {
        this.STBType = STBType;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof UpdateComplaintInUCMSRequestDataHeaderElifeAndEVisionSTBDetails)) return false;
        UpdateComplaintInUCMSRequestDataHeaderElifeAndEVisionSTBDetails other = (UpdateComplaintInUCMSRequestDataHeaderElifeAndEVisionSTBDetails) obj;
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
            ((this.MACAddress==null && other.getMACAddress()==null) || 
             (this.MACAddress!=null &&
              this.MACAddress.equals(other.getMACAddress()))) &&
            ((this.STBType==null && other.getSTBType()==null) || 
             (this.STBType!=null &&
              this.STBType.equals(other.getSTBType())));
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
        if (getMACAddress() != null) {
            _hashCode += getMACAddress().hashCode();
        }
        if (getSTBType() != null) {
            _hashCode += getSTBType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateComplaintInUCMSRequestDataHeaderElifeAndEVisionSTBDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", ">>>>UpdateComplaintInUCMSRequest>DataHeader>ElifeAndEVision>STBDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serialNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "SerialNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MACAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "MACAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("STBType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "STBType"));
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
