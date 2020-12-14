/**
 * UpdateComplaintInUCMSRequestDataHeaderCustomerContactList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintDetailsInUCMSRequest_xsd;

public class UpdateComplaintInUCMSRequestDataHeaderCustomerContactList  implements java.io.Serializable {
    private String contactName;

    private String contactMode;

    private String contactNumber;

    private String preferredContactTime;

    private Integer contactPriority;

    public UpdateComplaintInUCMSRequestDataHeaderCustomerContactList() {
    }

    public UpdateComplaintInUCMSRequestDataHeaderCustomerContactList(
           String contactName,
           String contactMode,
           String contactNumber,
           String preferredContactTime,
           Integer contactPriority) {
           this.contactName = contactName;
           this.contactMode = contactMode;
           this.contactNumber = contactNumber;
           this.preferredContactTime = preferredContactTime;
           this.contactPriority = contactPriority;
    }


    /**
     * Gets the contactName value for this UpdateComplaintInUCMSRequestDataHeaderCustomerContactList.
     * 
     * @return contactName
     */
    public String getContactName() {
        return contactName;
    }


    /**
     * Sets the contactName value for this UpdateComplaintInUCMSRequestDataHeaderCustomerContactList.
     * 
     * @param contactName
     */
    public void setContactName(String contactName) {
        this.contactName = contactName;
    }


    /**
     * Gets the contactMode value for this UpdateComplaintInUCMSRequestDataHeaderCustomerContactList.
     * 
     * @return contactMode
     */
    public String getContactMode() {
        return contactMode;
    }


    /**
     * Sets the contactMode value for this UpdateComplaintInUCMSRequestDataHeaderCustomerContactList.
     * 
     * @param contactMode
     */
    public void setContactMode(String contactMode) {
        this.contactMode = contactMode;
    }


    /**
     * Gets the contactNumber value for this UpdateComplaintInUCMSRequestDataHeaderCustomerContactList.
     * 
     * @return contactNumber
     */
    public String getContactNumber() {
        return contactNumber;
    }


    /**
     * Sets the contactNumber value for this UpdateComplaintInUCMSRequestDataHeaderCustomerContactList.
     * 
     * @param contactNumber
     */
    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }


    /**
     * Gets the preferredContactTime value for this UpdateComplaintInUCMSRequestDataHeaderCustomerContactList.
     * 
     * @return preferredContactTime
     */
    public String getPreferredContactTime() {
        return preferredContactTime;
    }


    /**
     * Sets the preferredContactTime value for this UpdateComplaintInUCMSRequestDataHeaderCustomerContactList.
     * 
     * @param preferredContactTime
     */
    public void setPreferredContactTime(String preferredContactTime) {
        this.preferredContactTime = preferredContactTime;
    }


    /**
     * Gets the contactPriority value for this UpdateComplaintInUCMSRequestDataHeaderCustomerContactList.
     * 
     * @return contactPriority
     */
    public Integer getContactPriority() {
        return contactPriority;
    }


    /**
     * Sets the contactPriority value for this UpdateComplaintInUCMSRequestDataHeaderCustomerContactList.
     * 
     * @param contactPriority
     */
    public void setContactPriority(Integer contactPriority) {
        this.contactPriority = contactPriority;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof UpdateComplaintInUCMSRequestDataHeaderCustomerContactList)) return false;
        UpdateComplaintInUCMSRequestDataHeaderCustomerContactList other = (UpdateComplaintInUCMSRequestDataHeaderCustomerContactList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.contactName==null && other.getContactName()==null) || 
             (this.contactName!=null &&
              this.contactName.equals(other.getContactName()))) &&
            ((this.contactMode==null && other.getContactMode()==null) || 
             (this.contactMode!=null &&
              this.contactMode.equals(other.getContactMode()))) &&
            ((this.contactNumber==null && other.getContactNumber()==null) || 
             (this.contactNumber!=null &&
              this.contactNumber.equals(other.getContactNumber()))) &&
            ((this.preferredContactTime==null && other.getPreferredContactTime()==null) || 
             (this.preferredContactTime!=null &&
              this.preferredContactTime.equals(other.getPreferredContactTime()))) &&
            ((this.contactPriority==null && other.getContactPriority()==null) || 
             (this.contactPriority!=null &&
              this.contactPriority.equals(other.getContactPriority())));
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
        if (getContactName() != null) {
            _hashCode += getContactName().hashCode();
        }
        if (getContactMode() != null) {
            _hashCode += getContactMode().hashCode();
        }
        if (getContactNumber() != null) {
            _hashCode += getContactNumber().hashCode();
        }
        if (getPreferredContactTime() != null) {
            _hashCode += getPreferredContactTime().hashCode();
        }
        if (getContactPriority() != null) {
            _hashCode += getContactPriority().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateComplaintInUCMSRequestDataHeaderCustomerContactList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", ">>>UpdateComplaintInUCMSRequest>DataHeader>CustomerContactList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "ContactName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactMode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "ContactMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "ContactNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preferredContactTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "PreferredContactTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactPriority");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "ContactPriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
