/**
 * UpdateComplaintInUCMSRequestDataHeaderDataProductsDetailsFemtocell.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintDetailsInUCMSRequest_xsd;

public class UpdateComplaintInUCMSRequestDataHeaderDataProductsDetailsFemtocell  implements java.io.Serializable {
    private String FTCCPEDeviceO;

    private String FTCCPESerialO;

    private String FTCDPNumber;

    private String FTCExchangeCode;

    public UpdateComplaintInUCMSRequestDataHeaderDataProductsDetailsFemtocell() {
    }

    public UpdateComplaintInUCMSRequestDataHeaderDataProductsDetailsFemtocell(
           String FTCCPEDeviceO,
           String FTCCPESerialO,
           String FTCDPNumber,
           String FTCExchangeCode) {
           this.FTCCPEDeviceO = FTCCPEDeviceO;
           this.FTCCPESerialO = FTCCPESerialO;
           this.FTCDPNumber = FTCDPNumber;
           this.FTCExchangeCode = FTCExchangeCode;
    }


    /**
     * Gets the FTCCPEDeviceO value for this UpdateComplaintInUCMSRequestDataHeaderDataProductsDetailsFemtocell.
     * 
     * @return FTCCPEDeviceO
     */
    public String getFTCCPEDeviceO() {
        return FTCCPEDeviceO;
    }


    /**
     * Sets the FTCCPEDeviceO value for this UpdateComplaintInUCMSRequestDataHeaderDataProductsDetailsFemtocell.
     * 
     * @param FTCCPEDeviceO
     */
    public void setFTCCPEDeviceO(String FTCCPEDeviceO) {
        this.FTCCPEDeviceO = FTCCPEDeviceO;
    }


    /**
     * Gets the FTCCPESerialO value for this UpdateComplaintInUCMSRequestDataHeaderDataProductsDetailsFemtocell.
     * 
     * @return FTCCPESerialO
     */
    public String getFTCCPESerialO() {
        return FTCCPESerialO;
    }


    /**
     * Sets the FTCCPESerialO value for this UpdateComplaintInUCMSRequestDataHeaderDataProductsDetailsFemtocell.
     * 
     * @param FTCCPESerialO
     */
    public void setFTCCPESerialO(String FTCCPESerialO) {
        this.FTCCPESerialO = FTCCPESerialO;
    }


    /**
     * Gets the FTCDPNumber value for this UpdateComplaintInUCMSRequestDataHeaderDataProductsDetailsFemtocell.
     * 
     * @return FTCDPNumber
     */
    public String getFTCDPNumber() {
        return FTCDPNumber;
    }


    /**
     * Sets the FTCDPNumber value for this UpdateComplaintInUCMSRequestDataHeaderDataProductsDetailsFemtocell.
     * 
     * @param FTCDPNumber
     */
    public void setFTCDPNumber(String FTCDPNumber) {
        this.FTCDPNumber = FTCDPNumber;
    }


    /**
     * Gets the FTCExchangeCode value for this UpdateComplaintInUCMSRequestDataHeaderDataProductsDetailsFemtocell.
     * 
     * @return FTCExchangeCode
     */
    public String getFTCExchangeCode() {
        return FTCExchangeCode;
    }


    /**
     * Sets the FTCExchangeCode value for this UpdateComplaintInUCMSRequestDataHeaderDataProductsDetailsFemtocell.
     * 
     * @param FTCExchangeCode
     */
    public void setFTCExchangeCode(String FTCExchangeCode) {
        this.FTCExchangeCode = FTCExchangeCode;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof UpdateComplaintInUCMSRequestDataHeaderDataProductsDetailsFemtocell)) return false;
        UpdateComplaintInUCMSRequestDataHeaderDataProductsDetailsFemtocell other = (UpdateComplaintInUCMSRequestDataHeaderDataProductsDetailsFemtocell) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.FTCCPEDeviceO==null && other.getFTCCPEDeviceO()==null) || 
             (this.FTCCPEDeviceO!=null &&
              this.FTCCPEDeviceO.equals(other.getFTCCPEDeviceO()))) &&
            ((this.FTCCPESerialO==null && other.getFTCCPESerialO()==null) || 
             (this.FTCCPESerialO!=null &&
              this.FTCCPESerialO.equals(other.getFTCCPESerialO()))) &&
            ((this.FTCDPNumber==null && other.getFTCDPNumber()==null) || 
             (this.FTCDPNumber!=null &&
              this.FTCDPNumber.equals(other.getFTCDPNumber()))) &&
            ((this.FTCExchangeCode==null && other.getFTCExchangeCode()==null) || 
             (this.FTCExchangeCode!=null &&
              this.FTCExchangeCode.equals(other.getFTCExchangeCode())));
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
        if (getFTCCPEDeviceO() != null) {
            _hashCode += getFTCCPEDeviceO().hashCode();
        }
        if (getFTCCPESerialO() != null) {
            _hashCode += getFTCCPESerialO().hashCode();
        }
        if (getFTCDPNumber() != null) {
            _hashCode += getFTCDPNumber().hashCode();
        }
        if (getFTCExchangeCode() != null) {
            _hashCode += getFTCExchangeCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateComplaintInUCMSRequestDataHeaderDataProductsDetailsFemtocell.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", ">>>>UpdateComplaintInUCMSRequest>DataHeader>DataProductsDetails>Femtocell"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FTCCPEDeviceO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "FTCCPEDeviceO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FTCCPESerialO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "FTCCPESerialO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FTCDPNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "FTCDPNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FTCExchangeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "FTCExchangeCode"));
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
