/**
 * UpdateComplaintInUCMSRequestDataHeaderPendingServiceOrderDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintDetailsInUCMSRequest_xsd;

public class UpdateComplaintInUCMSRequestDataHeaderPendingServiceOrderDetails  implements java.io.Serializable {
    private String PSOSubRequestNumber;

    private String PSOStatus;

    private String subRequestType;

    private java.util.Calendar PSOCreatedDate;

    public UpdateComplaintInUCMSRequestDataHeaderPendingServiceOrderDetails() {
    }

    public UpdateComplaintInUCMSRequestDataHeaderPendingServiceOrderDetails(
           String PSOSubRequestNumber,
           String PSOStatus,
           String subRequestType,
           java.util.Calendar PSOCreatedDate) {
           this.PSOSubRequestNumber = PSOSubRequestNumber;
           this.PSOStatus = PSOStatus;
           this.subRequestType = subRequestType;
           this.PSOCreatedDate = PSOCreatedDate;
    }


    /**
     * Gets the PSOSubRequestNumber value for this UpdateComplaintInUCMSRequestDataHeaderPendingServiceOrderDetails.
     * 
     * @return PSOSubRequestNumber
     */
    public String getPSOSubRequestNumber() {
        return PSOSubRequestNumber;
    }


    /**
     * Sets the PSOSubRequestNumber value for this UpdateComplaintInUCMSRequestDataHeaderPendingServiceOrderDetails.
     * 
     * @param PSOSubRequestNumber
     */
    public void setPSOSubRequestNumber(String PSOSubRequestNumber) {
        this.PSOSubRequestNumber = PSOSubRequestNumber;
    }


    /**
     * Gets the PSOStatus value for this UpdateComplaintInUCMSRequestDataHeaderPendingServiceOrderDetails.
     * 
     * @return PSOStatus
     */
    public String getPSOStatus() {
        return PSOStatus;
    }


    /**
     * Sets the PSOStatus value for this UpdateComplaintInUCMSRequestDataHeaderPendingServiceOrderDetails.
     * 
     * @param PSOStatus
     */
    public void setPSOStatus(String PSOStatus) {
        this.PSOStatus = PSOStatus;
    }


    /**
     * Gets the subRequestType value for this UpdateComplaintInUCMSRequestDataHeaderPendingServiceOrderDetails.
     * 
     * @return subRequestType
     */
    public String getSubRequestType() {
        return subRequestType;
    }


    /**
     * Sets the subRequestType value for this UpdateComplaintInUCMSRequestDataHeaderPendingServiceOrderDetails.
     * 
     * @param subRequestType
     */
    public void setSubRequestType(String subRequestType) {
        this.subRequestType = subRequestType;
    }


    /**
     * Gets the PSOCreatedDate value for this UpdateComplaintInUCMSRequestDataHeaderPendingServiceOrderDetails.
     * 
     * @return PSOCreatedDate
     */
    public java.util.Calendar getPSOCreatedDate() {
        return PSOCreatedDate;
    }


    /**
     * Sets the PSOCreatedDate value for this UpdateComplaintInUCMSRequestDataHeaderPendingServiceOrderDetails.
     * 
     * @param PSOCreatedDate
     */
    public void setPSOCreatedDate(java.util.Calendar PSOCreatedDate) {
        this.PSOCreatedDate = PSOCreatedDate;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof UpdateComplaintInUCMSRequestDataHeaderPendingServiceOrderDetails)) return false;
        UpdateComplaintInUCMSRequestDataHeaderPendingServiceOrderDetails other = (UpdateComplaintInUCMSRequestDataHeaderPendingServiceOrderDetails) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.PSOSubRequestNumber==null && other.getPSOSubRequestNumber()==null) || 
             (this.PSOSubRequestNumber!=null &&
              this.PSOSubRequestNumber.equals(other.getPSOSubRequestNumber()))) &&
            ((this.PSOStatus==null && other.getPSOStatus()==null) || 
             (this.PSOStatus!=null &&
              this.PSOStatus.equals(other.getPSOStatus()))) &&
            ((this.subRequestType==null && other.getSubRequestType()==null) || 
             (this.subRequestType!=null &&
              this.subRequestType.equals(other.getSubRequestType()))) &&
            ((this.PSOCreatedDate==null && other.getPSOCreatedDate()==null) || 
             (this.PSOCreatedDate!=null &&
              this.PSOCreatedDate.equals(other.getPSOCreatedDate())));
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
        if (getPSOSubRequestNumber() != null) {
            _hashCode += getPSOSubRequestNumber().hashCode();
        }
        if (getPSOStatus() != null) {
            _hashCode += getPSOStatus().hashCode();
        }
        if (getSubRequestType() != null) {
            _hashCode += getSubRequestType().hashCode();
        }
        if (getPSOCreatedDate() != null) {
            _hashCode += getPSOCreatedDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateComplaintInUCMSRequestDataHeaderPendingServiceOrderDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", ">>>UpdateComplaintInUCMSRequest>DataHeader>PendingServiceOrderDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PSOSubRequestNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "PSOSubRequestNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PSOStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "PSOStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subRequestType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "SubRequestType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PSOCreatedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "PSOCreatedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
