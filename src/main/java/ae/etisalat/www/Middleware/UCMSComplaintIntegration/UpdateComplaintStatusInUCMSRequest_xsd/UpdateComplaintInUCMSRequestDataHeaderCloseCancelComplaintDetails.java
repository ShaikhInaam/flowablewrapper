/**
 * UpdateComplaintInUCMSRequestDataHeaderCloseCancelComplaintDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintStatusInUCMSRequest_xsd;

public class UpdateComplaintInUCMSRequestDataHeaderCloseCancelComplaintDetails  implements java.io.Serializable {
    private String mainClearCode;

    private String clearCode;

    private String auxilaryCode;

    private String complaintIssueType;

    public UpdateComplaintInUCMSRequestDataHeaderCloseCancelComplaintDetails() {
    }

    public UpdateComplaintInUCMSRequestDataHeaderCloseCancelComplaintDetails(
           String mainClearCode,
           String clearCode,
           String auxilaryCode,
           String complaintIssueType) {
           this.mainClearCode = mainClearCode;
           this.clearCode = clearCode;
           this.auxilaryCode = auxilaryCode;
           this.complaintIssueType = complaintIssueType;
    }


    /**
     * Gets the mainClearCode value for this UpdateComplaintInUCMSRequestDataHeaderCloseCancelComplaintDetails.
     * 
     * @return mainClearCode
     */
    public String getMainClearCode() {
        return mainClearCode;
    }


    /**
     * Sets the mainClearCode value for this UpdateComplaintInUCMSRequestDataHeaderCloseCancelComplaintDetails.
     * 
     * @param mainClearCode
     */
    public void setMainClearCode(String mainClearCode) {
        this.mainClearCode = mainClearCode;
    }


    /**
     * Gets the clearCode value for this UpdateComplaintInUCMSRequestDataHeaderCloseCancelComplaintDetails.
     * 
     * @return clearCode
     */
    public String getClearCode() {
        return clearCode;
    }


    /**
     * Sets the clearCode value for this UpdateComplaintInUCMSRequestDataHeaderCloseCancelComplaintDetails.
     * 
     * @param clearCode
     */
    public void setClearCode(String clearCode) {
        this.clearCode = clearCode;
    }


    /**
     * Gets the auxilaryCode value for this UpdateComplaintInUCMSRequestDataHeaderCloseCancelComplaintDetails.
     * 
     * @return auxilaryCode
     */
    public String getAuxilaryCode() {
        return auxilaryCode;
    }


    /**
     * Sets the auxilaryCode value for this UpdateComplaintInUCMSRequestDataHeaderCloseCancelComplaintDetails.
     * 
     * @param auxilaryCode
     */
    public void setAuxilaryCode(String auxilaryCode) {
        this.auxilaryCode = auxilaryCode;
    }


    /**
     * Gets the complaintIssueType value for this UpdateComplaintInUCMSRequestDataHeaderCloseCancelComplaintDetails.
     * 
     * @return complaintIssueType
     */
    public String getComplaintIssueType() {
        return complaintIssueType;
    }


    /**
     * Sets the complaintIssueType value for this UpdateComplaintInUCMSRequestDataHeaderCloseCancelComplaintDetails.
     * 
     * @param complaintIssueType
     */
    public void setComplaintIssueType(String complaintIssueType) {
        this.complaintIssueType = complaintIssueType;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof UpdateComplaintInUCMSRequestDataHeaderCloseCancelComplaintDetails)) return false;
        UpdateComplaintInUCMSRequestDataHeaderCloseCancelComplaintDetails other = (UpdateComplaintInUCMSRequestDataHeaderCloseCancelComplaintDetails) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.mainClearCode==null && other.getMainClearCode()==null) || 
             (this.mainClearCode!=null &&
              this.mainClearCode.equals(other.getMainClearCode()))) &&
            ((this.clearCode==null && other.getClearCode()==null) || 
             (this.clearCode!=null &&
              this.clearCode.equals(other.getClearCode()))) &&
            ((this.auxilaryCode==null && other.getAuxilaryCode()==null) || 
             (this.auxilaryCode!=null &&
              this.auxilaryCode.equals(other.getAuxilaryCode()))) &&
            ((this.complaintIssueType==null && other.getComplaintIssueType()==null) || 
             (this.complaintIssueType!=null &&
              this.complaintIssueType.equals(other.getComplaintIssueType())));
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
        if (getMainClearCode() != null) {
            _hashCode += getMainClearCode().hashCode();
        }
        if (getClearCode() != null) {
            _hashCode += getClearCode().hashCode();
        }
        if (getAuxilaryCode() != null) {
            _hashCode += getAuxilaryCode().hashCode();
        }
        if (getComplaintIssueType() != null) {
            _hashCode += getComplaintIssueType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateComplaintInUCMSRequestDataHeaderCloseCancelComplaintDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintStatusInUCMSRequest.xsd", ">>>UpdateComplaintInUCMSRequest>DataHeader>CloseCancelComplaintDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mainClearCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintStatusInUCMSRequest.xsd", "MainClearCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clearCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintStatusInUCMSRequest.xsd", "ClearCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("auxilaryCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintStatusInUCMSRequest.xsd", "AuxilaryCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("complaintIssueType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintStatusInUCMSRequest.xsd", "ComplaintIssueType"));
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
