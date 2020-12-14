/**
 * UpdateComplaintInUCMSRequestDataHeaderDataProductsDetailsInternetLeaseLine.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintDetailsInUCMSRequest_xsd;

public class UpdateComplaintInUCMSRequestDataHeaderDataProductsDetailsInternetLeaseLine  implements java.io.Serializable {
    private String ILLDomainName;

    private String ILLServiceVLAN;

    private Integer ILLMaiOrBackup;

    private String ILLPOPDetails;

    public UpdateComplaintInUCMSRequestDataHeaderDataProductsDetailsInternetLeaseLine() {
    }

    public UpdateComplaintInUCMSRequestDataHeaderDataProductsDetailsInternetLeaseLine(
           String ILLDomainName,
           String ILLServiceVLAN,
           Integer ILLMaiOrBackup,
           String ILLPOPDetails) {
           this.ILLDomainName = ILLDomainName;
           this.ILLServiceVLAN = ILLServiceVLAN;
           this.ILLMaiOrBackup = ILLMaiOrBackup;
           this.ILLPOPDetails = ILLPOPDetails;
    }


    /**
     * Gets the ILLDomainName value for this UpdateComplaintInUCMSRequestDataHeaderDataProductsDetailsInternetLeaseLine.
     * 
     * @return ILLDomainName
     */
    public String getILLDomainName() {
        return ILLDomainName;
    }


    /**
     * Sets the ILLDomainName value for this UpdateComplaintInUCMSRequestDataHeaderDataProductsDetailsInternetLeaseLine.
     * 
     * @param ILLDomainName
     */
    public void setILLDomainName(String ILLDomainName) {
        this.ILLDomainName = ILLDomainName;
    }


    /**
     * Gets the ILLServiceVLAN value for this UpdateComplaintInUCMSRequestDataHeaderDataProductsDetailsInternetLeaseLine.
     * 
     * @return ILLServiceVLAN
     */
    public String getILLServiceVLAN() {
        return ILLServiceVLAN;
    }


    /**
     * Sets the ILLServiceVLAN value for this UpdateComplaintInUCMSRequestDataHeaderDataProductsDetailsInternetLeaseLine.
     * 
     * @param ILLServiceVLAN
     */
    public void setILLServiceVLAN(String ILLServiceVLAN) {
        this.ILLServiceVLAN = ILLServiceVLAN;
    }


    /**
     * Gets the ILLMaiOrBackup value for this UpdateComplaintInUCMSRequestDataHeaderDataProductsDetailsInternetLeaseLine.
     * 
     * @return ILLMaiOrBackup
     */
    public Integer getILLMaiOrBackup() {
        return ILLMaiOrBackup;
    }


    /**
     * Sets the ILLMaiOrBackup value for this UpdateComplaintInUCMSRequestDataHeaderDataProductsDetailsInternetLeaseLine.
     * 
     * @param ILLMaiOrBackup
     */
    public void setILLMaiOrBackup(Integer ILLMaiOrBackup) {
        this.ILLMaiOrBackup = ILLMaiOrBackup;
    }


    /**
     * Gets the ILLPOPDetails value for this UpdateComplaintInUCMSRequestDataHeaderDataProductsDetailsInternetLeaseLine.
     * 
     * @return ILLPOPDetails
     */
    public String getILLPOPDetails() {
        return ILLPOPDetails;
    }


    /**
     * Sets the ILLPOPDetails value for this UpdateComplaintInUCMSRequestDataHeaderDataProductsDetailsInternetLeaseLine.
     * 
     * @param ILLPOPDetails
     */
    public void setILLPOPDetails(String ILLPOPDetails) {
        this.ILLPOPDetails = ILLPOPDetails;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof UpdateComplaintInUCMSRequestDataHeaderDataProductsDetailsInternetLeaseLine)) return false;
        UpdateComplaintInUCMSRequestDataHeaderDataProductsDetailsInternetLeaseLine other = (UpdateComplaintInUCMSRequestDataHeaderDataProductsDetailsInternetLeaseLine) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ILLDomainName==null && other.getILLDomainName()==null) || 
             (this.ILLDomainName!=null &&
              this.ILLDomainName.equals(other.getILLDomainName()))) &&
            ((this.ILLServiceVLAN==null && other.getILLServiceVLAN()==null) || 
             (this.ILLServiceVLAN!=null &&
              this.ILLServiceVLAN.equals(other.getILLServiceVLAN()))) &&
            ((this.ILLMaiOrBackup==null && other.getILLMaiOrBackup()==null) || 
             (this.ILLMaiOrBackup!=null &&
              this.ILLMaiOrBackup.equals(other.getILLMaiOrBackup()))) &&
            ((this.ILLPOPDetails==null && other.getILLPOPDetails()==null) || 
             (this.ILLPOPDetails!=null &&
              this.ILLPOPDetails.equals(other.getILLPOPDetails())));
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
        if (getILLDomainName() != null) {
            _hashCode += getILLDomainName().hashCode();
        }
        if (getILLServiceVLAN() != null) {
            _hashCode += getILLServiceVLAN().hashCode();
        }
        if (getILLMaiOrBackup() != null) {
            _hashCode += getILLMaiOrBackup().hashCode();
        }
        if (getILLPOPDetails() != null) {
            _hashCode += getILLPOPDetails().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateComplaintInUCMSRequestDataHeaderDataProductsDetailsInternetLeaseLine.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", ">>>>UpdateComplaintInUCMSRequest>DataHeader>DataProductsDetails>InternetLeaseLine"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ILLDomainName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "ILLDomainName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ILLServiceVLAN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "ILLServiceVLAN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ILLMaiOrBackup");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "ILLMaiOrBackup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ILLPOPDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "ILLPOPDetails"));
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
