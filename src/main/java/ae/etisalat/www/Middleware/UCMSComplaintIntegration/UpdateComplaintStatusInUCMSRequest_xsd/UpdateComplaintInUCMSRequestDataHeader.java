/**
 * UpdateComplaintInUCMSRequestDataHeader.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintStatusInUCMSRequest_xsd;

public class UpdateComplaintInUCMSRequestDataHeader  implements java.io.Serializable {
    private String statusType;

    private String complaintId;

    private String UCMSID;

    private String complaintRemarks;

    private java.util.Calendar actionDate;

    private String actionByuser;

    private UpdateComplaintInUCMSRequestDataHeaderCloseCancelComplaintDetails closeCancelComplaintDetails;

    private ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintStatusInUCMSRequest_xsd.UpdateComplaintInUCMSRequestDataHeaderAdditionalInfo[] additionalInfo;

    public UpdateComplaintInUCMSRequestDataHeader() {
    }

    public UpdateComplaintInUCMSRequestDataHeader(
           String statusType,
           String complaintId,
           String UCMSID,
           String complaintRemarks,
           java.util.Calendar actionDate,
           String actionByuser,
           UpdateComplaintInUCMSRequestDataHeaderCloseCancelComplaintDetails closeCancelComplaintDetails,
           ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintStatusInUCMSRequest_xsd.UpdateComplaintInUCMSRequestDataHeaderAdditionalInfo[] additionalInfo) {
           this.statusType = statusType;
           this.complaintId = complaintId;
           this.UCMSID = UCMSID;
           this.complaintRemarks = complaintRemarks;
           this.actionDate = actionDate;
           this.actionByuser = actionByuser;
           this.closeCancelComplaintDetails = closeCancelComplaintDetails;
           this.additionalInfo = additionalInfo;
    }


    /**
     * Gets the statusType value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return statusType
     */
    public String getStatusType() {
        return statusType;
    }


    /**
     * Sets the statusType value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param statusType
     */
    public void setStatusType(String statusType) {
        this.statusType = statusType;
    }


    /**
     * Gets the complaintId value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return complaintId
     */
    public String getComplaintId() {
        return complaintId;
    }


    /**
     * Sets the complaintId value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param complaintId
     */
    public void setComplaintId(String complaintId) {
        this.complaintId = complaintId;
    }


    /**
     * Gets the UCMSID value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return UCMSID
     */
    public String getUCMSID() {
        return UCMSID;
    }


    /**
     * Sets the UCMSID value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param UCMSID
     */
    public void setUCMSID(String UCMSID) {
        this.UCMSID = UCMSID;
    }


    /**
     * Gets the complaintRemarks value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return complaintRemarks
     */
    public String getComplaintRemarks() {
        return complaintRemarks;
    }


    /**
     * Sets the complaintRemarks value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param complaintRemarks
     */
    public void setComplaintRemarks(String complaintRemarks) {
        this.complaintRemarks = complaintRemarks;
    }


    /**
     * Gets the actionDate value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return actionDate
     */
    public java.util.Calendar getActionDate() {
        return actionDate;
    }


    /**
     * Sets the actionDate value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param actionDate
     */
    public void setActionDate(java.util.Calendar actionDate) {
        this.actionDate = actionDate;
    }


    /**
     * Gets the actionByuser value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return actionByuser
     */
    public String getActionByuser() {
        return actionByuser;
    }


    /**
     * Sets the actionByuser value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param actionByuser
     */
    public void setActionByuser(String actionByuser) {
        this.actionByuser = actionByuser;
    }


    /**
     * Gets the closeCancelComplaintDetails value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return closeCancelComplaintDetails
     */
    public UpdateComplaintInUCMSRequestDataHeaderCloseCancelComplaintDetails getCloseCancelComplaintDetails() {
        return closeCancelComplaintDetails;
    }


    /**
     * Sets the closeCancelComplaintDetails value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param closeCancelComplaintDetails
     */
    public void setCloseCancelComplaintDetails(UpdateComplaintInUCMSRequestDataHeaderCloseCancelComplaintDetails closeCancelComplaintDetails) {
        this.closeCancelComplaintDetails = closeCancelComplaintDetails;
    }


    /**
     * Gets the additionalInfo value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return additionalInfo
     */
    public ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintStatusInUCMSRequest_xsd.UpdateComplaintInUCMSRequestDataHeaderAdditionalInfo[] getAdditionalInfo() {
        return additionalInfo;
    }


    /**
     * Sets the additionalInfo value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param additionalInfo
     */
    public void setAdditionalInfo(ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintStatusInUCMSRequest_xsd.UpdateComplaintInUCMSRequestDataHeaderAdditionalInfo[] additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintStatusInUCMSRequest_xsd.UpdateComplaintInUCMSRequestDataHeaderAdditionalInfo getAdditionalInfo(int i) {
        return this.additionalInfo[i];
    }

    public void setAdditionalInfo(int i, ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintStatusInUCMSRequest_xsd.UpdateComplaintInUCMSRequestDataHeaderAdditionalInfo _value) {
        this.additionalInfo[i] = _value;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof UpdateComplaintInUCMSRequestDataHeader)) return false;
        UpdateComplaintInUCMSRequestDataHeader other = (UpdateComplaintInUCMSRequestDataHeader) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.statusType==null && other.getStatusType()==null) || 
             (this.statusType!=null &&
              this.statusType.equals(other.getStatusType()))) &&
            ((this.complaintId==null && other.getComplaintId()==null) || 
             (this.complaintId!=null &&
              this.complaintId.equals(other.getComplaintId()))) &&
            ((this.UCMSID==null && other.getUCMSID()==null) || 
             (this.UCMSID!=null &&
              this.UCMSID.equals(other.getUCMSID()))) &&
            ((this.complaintRemarks==null && other.getComplaintRemarks()==null) || 
             (this.complaintRemarks!=null &&
              this.complaintRemarks.equals(other.getComplaintRemarks()))) &&
            ((this.actionDate==null && other.getActionDate()==null) || 
             (this.actionDate!=null &&
              this.actionDate.equals(other.getActionDate()))) &&
            ((this.actionByuser==null && other.getActionByuser()==null) || 
             (this.actionByuser!=null &&
              this.actionByuser.equals(other.getActionByuser()))) &&
            ((this.closeCancelComplaintDetails==null && other.getCloseCancelComplaintDetails()==null) || 
             (this.closeCancelComplaintDetails!=null &&
              this.closeCancelComplaintDetails.equals(other.getCloseCancelComplaintDetails()))) &&
            ((this.additionalInfo==null && other.getAdditionalInfo()==null) || 
             (this.additionalInfo!=null &&
              java.util.Arrays.equals(this.additionalInfo, other.getAdditionalInfo())));
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
        if (getStatusType() != null) {
            _hashCode += getStatusType().hashCode();
        }
        if (getComplaintId() != null) {
            _hashCode += getComplaintId().hashCode();
        }
        if (getUCMSID() != null) {
            _hashCode += getUCMSID().hashCode();
        }
        if (getComplaintRemarks() != null) {
            _hashCode += getComplaintRemarks().hashCode();
        }
        if (getActionDate() != null) {
            _hashCode += getActionDate().hashCode();
        }
        if (getActionByuser() != null) {
            _hashCode += getActionByuser().hashCode();
        }
        if (getCloseCancelComplaintDetails() != null) {
            _hashCode += getCloseCancelComplaintDetails().hashCode();
        }
        if (getAdditionalInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAdditionalInfo());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getAdditionalInfo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateComplaintInUCMSRequestDataHeader.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintStatusInUCMSRequest.xsd", ">>UpdateComplaintInUCMSRequest>DataHeader"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintStatusInUCMSRequest.xsd", "StatusType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("complaintId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintStatusInUCMSRequest.xsd", "ComplaintId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("UCMSID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintStatusInUCMSRequest.xsd", "UCMSID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("complaintRemarks");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintStatusInUCMSRequest.xsd", "ComplaintRemarks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actionDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintStatusInUCMSRequest.xsd", "ActionDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actionByuser");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintStatusInUCMSRequest.xsd", "ActionByuser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("closeCancelComplaintDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintStatusInUCMSRequest.xsd", "CloseCancelComplaintDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintStatusInUCMSRequest.xsd", ">>>UpdateComplaintInUCMSRequest>DataHeader>CloseCancelComplaintDetails"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintStatusInUCMSRequest.xsd", "AdditionalInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintStatusInUCMSRequest.xsd", ">>>UpdateComplaintInUCMSRequest>DataHeader>AdditionalInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
