/**
 * UpdateComplaintDtlsRequestDataHeader.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.UpdateComplaintRequest_xsd;

public class UpdateComplaintDtlsRequestDataHeader  implements java.io.Serializable {
    private String transactionId;

    private String complaintID;

    private String userID;

    private String remarks;

    private String customerSegment;

    private String accountNumber;

    private String accountId;

    private UpdateComplaintDtlsRequestDataHeaderAdditionalInfo[] additionalInfo;

    public UpdateComplaintDtlsRequestDataHeader() {
    }

    public UpdateComplaintDtlsRequestDataHeader(
           String transactionId,
           String complaintID,
           String userID,
           String remarks,
           String customerSegment,
           String accountNumber,
           String accountId,
           UpdateComplaintDtlsRequestDataHeaderAdditionalInfo[] additionalInfo) {
           this.transactionId = transactionId;
           this.complaintID = complaintID;
           this.userID = userID;
           this.remarks = remarks;
           this.customerSegment = customerSegment;
           this.accountNumber = accountNumber;
           this.accountId = accountId;
           this.additionalInfo = additionalInfo;
    }


    /**
     * Gets the transactionId value for this UpdateComplaintDtlsRequestDataHeader.
     * 
     * @return transactionId
     */
    public String getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this UpdateComplaintDtlsRequestDataHeader.
     * 
     * @param transactionId
     */
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }


    /**
     * Gets the complaintID value for this UpdateComplaintDtlsRequestDataHeader.
     * 
     * @return complaintID
     */
    public String getComplaintID() {
        return complaintID;
    }


    /**
     * Sets the complaintID value for this UpdateComplaintDtlsRequestDataHeader.
     * 
     * @param complaintID
     */
    public void setComplaintID(String complaintID) {
        this.complaintID = complaintID;
    }


    /**
     * Gets the userID value for this UpdateComplaintDtlsRequestDataHeader.
     * 
     * @return userID
     */
    public String getUserID() {
        return userID;
    }


    /**
     * Sets the userID value for this UpdateComplaintDtlsRequestDataHeader.
     * 
     * @param userID
     */
    public void setUserID(String userID) {
        this.userID = userID;
    }


    /**
     * Gets the remarks value for this UpdateComplaintDtlsRequestDataHeader.
     * 
     * @return remarks
     */
    public String getRemarks() {
        return remarks;
    }


    /**
     * Sets the remarks value for this UpdateComplaintDtlsRequestDataHeader.
     * 
     * @param remarks
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }


    /**
     * Gets the customerSegment value for this UpdateComplaintDtlsRequestDataHeader.
     * 
     * @return customerSegment
     */
    public String getCustomerSegment() {
        return customerSegment;
    }


    /**
     * Sets the customerSegment value for this UpdateComplaintDtlsRequestDataHeader.
     * 
     * @param customerSegment
     */
    public void setCustomerSegment(String customerSegment) {
        this.customerSegment = customerSegment;
    }


    /**
     * Gets the accountNumber value for this UpdateComplaintDtlsRequestDataHeader.
     * 
     * @return accountNumber
     */
    public String getAccountNumber() {
        return accountNumber;
    }


    /**
     * Sets the accountNumber value for this UpdateComplaintDtlsRequestDataHeader.
     * 
     * @param accountNumber
     */
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }


    /**
     * Gets the accountId value for this UpdateComplaintDtlsRequestDataHeader.
     * 
     * @return accountId
     */
    public String getAccountId() {
        return accountId;
    }


    /**
     * Sets the accountId value for this UpdateComplaintDtlsRequestDataHeader.
     * 
     * @param accountId
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }


    /**
     * Gets the additionalInfo value for this UpdateComplaintDtlsRequestDataHeader.
     * 
     * @return additionalInfo
     */
    public UpdateComplaintDtlsRequestDataHeaderAdditionalInfo[] getAdditionalInfo() {
        return additionalInfo;
    }


    /**
     * Sets the additionalInfo value for this UpdateComplaintDtlsRequestDataHeader.
     * 
     * @param additionalInfo
     */
    public void setAdditionalInfo(UpdateComplaintDtlsRequestDataHeaderAdditionalInfo[] additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public UpdateComplaintDtlsRequestDataHeaderAdditionalInfo getAdditionalInfo(int i) {
        return this.additionalInfo[i];
    }

    public void setAdditionalInfo(int i, UpdateComplaintDtlsRequestDataHeaderAdditionalInfo _value) {
        this.additionalInfo[i] = _value;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof UpdateComplaintDtlsRequestDataHeader)) return false;
        UpdateComplaintDtlsRequestDataHeader other = (UpdateComplaintDtlsRequestDataHeader) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.transactionId==null && other.getTransactionId()==null) || 
             (this.transactionId!=null &&
              this.transactionId.equals(other.getTransactionId()))) &&
            ((this.complaintID==null && other.getComplaintID()==null) || 
             (this.complaintID!=null &&
              this.complaintID.equals(other.getComplaintID()))) &&
            ((this.userID==null && other.getUserID()==null) || 
             (this.userID!=null &&
              this.userID.equals(other.getUserID()))) &&
            ((this.remarks==null && other.getRemarks()==null) || 
             (this.remarks!=null &&
              this.remarks.equals(other.getRemarks()))) &&
            ((this.customerSegment==null && other.getCustomerSegment()==null) || 
             (this.customerSegment!=null &&
              this.customerSegment.equals(other.getCustomerSegment()))) &&
            ((this.accountNumber==null && other.getAccountNumber()==null) || 
             (this.accountNumber!=null &&
              this.accountNumber.equals(other.getAccountNumber()))) &&
            ((this.accountId==null && other.getAccountId()==null) || 
             (this.accountId!=null &&
              this.accountId.equals(other.getAccountId()))) &&
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
        if (getTransactionId() != null) {
            _hashCode += getTransactionId().hashCode();
        }
        if (getComplaintID() != null) {
            _hashCode += getComplaintID().hashCode();
        }
        if (getUserID() != null) {
            _hashCode += getUserID().hashCode();
        }
        if (getRemarks() != null) {
            _hashCode += getRemarks().hashCode();
        }
        if (getCustomerSegment() != null) {
            _hashCode += getCustomerSegment().hashCode();
        }
        if (getAccountNumber() != null) {
            _hashCode += getAccountNumber().hashCode();
        }
        if (getAccountId() != null) {
            _hashCode += getAccountId().hashCode();
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
        new org.apache.axis.description.TypeDesc(UpdateComplaintDtlsRequestDataHeader.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/UpdateComplaintRequest.xsd", ">>UpdateComplaintDtlsRequest>DataHeader"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/UpdateComplaintRequest.xsd", "TransactionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("complaintID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/UpdateComplaintRequest.xsd", "ComplaintID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/UpdateComplaintRequest.xsd", "UserID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remarks");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/UpdateComplaintRequest.xsd", "Remarks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerSegment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/UpdateComplaintRequest.xsd", "CustomerSegment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/UpdateComplaintRequest.xsd", "AccountNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/UpdateComplaintRequest.xsd", "AccountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/UpdateComplaintRequest.xsd", "AdditionalInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/UpdateComplaintRequest.xsd", ">>>UpdateComplaintDtlsRequest>DataHeader>AdditionalInfo"));
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
