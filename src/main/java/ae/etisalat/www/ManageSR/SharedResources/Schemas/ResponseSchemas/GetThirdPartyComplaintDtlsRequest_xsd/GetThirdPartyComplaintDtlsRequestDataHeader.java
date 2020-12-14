/**
 * GetThirdPartyComplaintDtlsRequestDataHeader.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.GetThirdPartyComplaintDtlsRequest_xsd;

public class GetThirdPartyComplaintDtlsRequestDataHeader  implements java.io.Serializable {
    private String transactionId;

    private java.util.Date registeredDateFrom;

    private java.util.Date registeredDateTo;

    private String accountNumber;

    private String accountId;

    private String[] partyIdsList;

    private String complaintStatus;

    private String[] complaintChannel;

    private Long complaintId;

    private String customerSegment;

    private ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.GetThirdPartyComplaintDtlsRequest_xsd.GetThirdPartyComplaintDtlsRequestDataHeaderAdditionalInfo[] additionalInfo;

    public GetThirdPartyComplaintDtlsRequestDataHeader() {
    }

    public GetThirdPartyComplaintDtlsRequestDataHeader(
           String transactionId,
           java.util.Date registeredDateFrom,
           java.util.Date registeredDateTo,
           String accountNumber,
           String accountId,
           String[] partyIdsList,
           String complaintStatus,
           String[] complaintChannel,
           Long complaintId,
           String customerSegment,
           ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.GetThirdPartyComplaintDtlsRequest_xsd.GetThirdPartyComplaintDtlsRequestDataHeaderAdditionalInfo[] additionalInfo) {
           this.transactionId = transactionId;
           this.registeredDateFrom = registeredDateFrom;
           this.registeredDateTo = registeredDateTo;
           this.accountNumber = accountNumber;
           this.accountId = accountId;
           this.partyIdsList = partyIdsList;
           this.complaintStatus = complaintStatus;
           this.complaintChannel = complaintChannel;
           this.complaintId = complaintId;
           this.customerSegment = customerSegment;
           this.additionalInfo = additionalInfo;
    }


    /**
     * Gets the transactionId value for this GetThirdPartyComplaintDtlsRequestDataHeader.
     * 
     * @return transactionId
     */
    public String getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this GetThirdPartyComplaintDtlsRequestDataHeader.
     * 
     * @param transactionId
     */
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }


    /**
     * Gets the registeredDateFrom value for this GetThirdPartyComplaintDtlsRequestDataHeader.
     * 
     * @return registeredDateFrom
     */
    public java.util.Date getRegisteredDateFrom() {
        return registeredDateFrom;
    }


    /**
     * Sets the registeredDateFrom value for this GetThirdPartyComplaintDtlsRequestDataHeader.
     * 
     * @param registeredDateFrom
     */
    public void setRegisteredDateFrom(java.util.Date registeredDateFrom) {
        this.registeredDateFrom = registeredDateFrom;
    }


    /**
     * Gets the registeredDateTo value for this GetThirdPartyComplaintDtlsRequestDataHeader.
     * 
     * @return registeredDateTo
     */
    public java.util.Date getRegisteredDateTo() {
        return registeredDateTo;
    }


    /**
     * Sets the registeredDateTo value for this GetThirdPartyComplaintDtlsRequestDataHeader.
     * 
     * @param registeredDateTo
     */
    public void setRegisteredDateTo(java.util.Date registeredDateTo) {
        this.registeredDateTo = registeredDateTo;
    }


    /**
     * Gets the accountNumber value for this GetThirdPartyComplaintDtlsRequestDataHeader.
     * 
     * @return accountNumber
     */
    public String getAccountNumber() {
        return accountNumber;
    }


    /**
     * Sets the accountNumber value for this GetThirdPartyComplaintDtlsRequestDataHeader.
     * 
     * @param accountNumber
     */
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }


    /**
     * Gets the accountId value for this GetThirdPartyComplaintDtlsRequestDataHeader.
     * 
     * @return accountId
     */
    public String getAccountId() {
        return accountId;
    }


    /**
     * Sets the accountId value for this GetThirdPartyComplaintDtlsRequestDataHeader.
     * 
     * @param accountId
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }


    /**
     * Gets the partyIdsList value for this GetThirdPartyComplaintDtlsRequestDataHeader.
     * 
     * @return partyIdsList
     */
    public String[] getPartyIdsList() {
        return partyIdsList;
    }


    /**
     * Sets the partyIdsList value for this GetThirdPartyComplaintDtlsRequestDataHeader.
     * 
     * @param partyIdsList
     */
    public void setPartyIdsList(String[] partyIdsList) {
        this.partyIdsList = partyIdsList;
    }

    public String getPartyIdsList(int i) {
        return this.partyIdsList[i];
    }

    public void setPartyIdsList(int i, String _value) {
        this.partyIdsList[i] = _value;
    }


    /**
     * Gets the complaintStatus value for this GetThirdPartyComplaintDtlsRequestDataHeader.
     * 
     * @return complaintStatus
     */
    public String getComplaintStatus() {
        return complaintStatus;
    }


    /**
     * Sets the complaintStatus value for this GetThirdPartyComplaintDtlsRequestDataHeader.
     * 
     * @param complaintStatus
     */
    public void setComplaintStatus(String complaintStatus) {
        this.complaintStatus = complaintStatus;
    }


    /**
     * Gets the complaintChannel value for this GetThirdPartyComplaintDtlsRequestDataHeader.
     * 
     * @return complaintChannel
     */
    public String[] getComplaintChannel() {
        return complaintChannel;
    }


    /**
     * Sets the complaintChannel value for this GetThirdPartyComplaintDtlsRequestDataHeader.
     * 
     * @param complaintChannel
     */
    public void setComplaintChannel(String[] complaintChannel) {
        this.complaintChannel = complaintChannel;
    }

    public String getComplaintChannel(int i) {
        return this.complaintChannel[i];
    }

    public void setComplaintChannel(int i, String _value) {
        this.complaintChannel[i] = _value;
    }


    /**
     * Gets the complaintId value for this GetThirdPartyComplaintDtlsRequestDataHeader.
     * 
     * @return complaintId
     */
    public Long getComplaintId() {
        return complaintId;
    }


    /**
     * Sets the complaintId value for this GetThirdPartyComplaintDtlsRequestDataHeader.
     * 
     * @param complaintId
     */
    public void setComplaintId(Long complaintId) {
        this.complaintId = complaintId;
    }


    /**
     * Gets the customerSegment value for this GetThirdPartyComplaintDtlsRequestDataHeader.
     * 
     * @return customerSegment
     */
    public String getCustomerSegment() {
        return customerSegment;
    }


    /**
     * Sets the customerSegment value for this GetThirdPartyComplaintDtlsRequestDataHeader.
     * 
     * @param customerSegment
     */
    public void setCustomerSegment(String customerSegment) {
        this.customerSegment = customerSegment;
    }


    /**
     * Gets the additionalInfo value for this GetThirdPartyComplaintDtlsRequestDataHeader.
     * 
     * @return additionalInfo
     */
    public ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.GetThirdPartyComplaintDtlsRequest_xsd.GetThirdPartyComplaintDtlsRequestDataHeaderAdditionalInfo[] getAdditionalInfo() {
        return additionalInfo;
    }


    /**
     * Sets the additionalInfo value for this GetThirdPartyComplaintDtlsRequestDataHeader.
     * 
     * @param additionalInfo
     */
    public void setAdditionalInfo(ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.GetThirdPartyComplaintDtlsRequest_xsd.GetThirdPartyComplaintDtlsRequestDataHeaderAdditionalInfo[] additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.GetThirdPartyComplaintDtlsRequest_xsd.GetThirdPartyComplaintDtlsRequestDataHeaderAdditionalInfo getAdditionalInfo(int i) {
        return this.additionalInfo[i];
    }

    public void setAdditionalInfo(int i, ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.GetThirdPartyComplaintDtlsRequest_xsd.GetThirdPartyComplaintDtlsRequestDataHeaderAdditionalInfo _value) {
        this.additionalInfo[i] = _value;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GetThirdPartyComplaintDtlsRequestDataHeader)) return false;
        GetThirdPartyComplaintDtlsRequestDataHeader other = (GetThirdPartyComplaintDtlsRequestDataHeader) obj;
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
            ((this.registeredDateFrom==null && other.getRegisteredDateFrom()==null) || 
             (this.registeredDateFrom!=null &&
              this.registeredDateFrom.equals(other.getRegisteredDateFrom()))) &&
            ((this.registeredDateTo==null && other.getRegisteredDateTo()==null) || 
             (this.registeredDateTo!=null &&
              this.registeredDateTo.equals(other.getRegisteredDateTo()))) &&
            ((this.accountNumber==null && other.getAccountNumber()==null) || 
             (this.accountNumber!=null &&
              this.accountNumber.equals(other.getAccountNumber()))) &&
            ((this.accountId==null && other.getAccountId()==null) || 
             (this.accountId!=null &&
              this.accountId.equals(other.getAccountId()))) &&
            ((this.partyIdsList==null && other.getPartyIdsList()==null) || 
             (this.partyIdsList!=null &&
              java.util.Arrays.equals(this.partyIdsList, other.getPartyIdsList()))) &&
            ((this.complaintStatus==null && other.getComplaintStatus()==null) || 
             (this.complaintStatus!=null &&
              this.complaintStatus.equals(other.getComplaintStatus()))) &&
            ((this.complaintChannel==null && other.getComplaintChannel()==null) || 
             (this.complaintChannel!=null &&
              java.util.Arrays.equals(this.complaintChannel, other.getComplaintChannel()))) &&
            ((this.complaintId==null && other.getComplaintId()==null) || 
             (this.complaintId!=null &&
              this.complaintId.equals(other.getComplaintId()))) &&
            ((this.customerSegment==null && other.getCustomerSegment()==null) || 
             (this.customerSegment!=null &&
              this.customerSegment.equals(other.getCustomerSegment()))) &&
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
        if (getRegisteredDateFrom() != null) {
            _hashCode += getRegisteredDateFrom().hashCode();
        }
        if (getRegisteredDateTo() != null) {
            _hashCode += getRegisteredDateTo().hashCode();
        }
        if (getAccountNumber() != null) {
            _hashCode += getAccountNumber().hashCode();
        }
        if (getAccountId() != null) {
            _hashCode += getAccountId().hashCode();
        }
        if (getPartyIdsList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPartyIdsList());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getPartyIdsList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getComplaintStatus() != null) {
            _hashCode += getComplaintStatus().hashCode();
        }
        if (getComplaintChannel() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getComplaintChannel());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getComplaintChannel(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getComplaintId() != null) {
            _hashCode += getComplaintId().hashCode();
        }
        if (getCustomerSegment() != null) {
            _hashCode += getCustomerSegment().hashCode();
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
        new org.apache.axis.description.TypeDesc(GetThirdPartyComplaintDtlsRequestDataHeader.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/GetThirdPartyComplaintDtlsRequest.xsd", ">>GetThirdPartyComplaintDtlsRequest>DataHeader"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/GetThirdPartyComplaintDtlsRequest.xsd", "TransactionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registeredDateFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/GetThirdPartyComplaintDtlsRequest.xsd", "RegisteredDateFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registeredDateTo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/GetThirdPartyComplaintDtlsRequest.xsd", "RegisteredDateTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/GetThirdPartyComplaintDtlsRequest.xsd", "AccountNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/GetThirdPartyComplaintDtlsRequest.xsd", "AccountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partyIdsList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/GetThirdPartyComplaintDtlsRequest.xsd", "PartyIdsList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("complaintStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/GetThirdPartyComplaintDtlsRequest.xsd", "ComplaintStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("complaintChannel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/GetThirdPartyComplaintDtlsRequest.xsd", "ComplaintChannel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("complaintId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/GetThirdPartyComplaintDtlsRequest.xsd", "ComplaintId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerSegment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/GetThirdPartyComplaintDtlsRequest.xsd", "CustomerSegment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/GetThirdPartyComplaintDtlsRequest.xsd", "AdditionalInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/GetThirdPartyComplaintDtlsRequest.xsd", ">>>GetThirdPartyComplaintDtlsRequest>DataHeader>AdditionalInfo"));
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
