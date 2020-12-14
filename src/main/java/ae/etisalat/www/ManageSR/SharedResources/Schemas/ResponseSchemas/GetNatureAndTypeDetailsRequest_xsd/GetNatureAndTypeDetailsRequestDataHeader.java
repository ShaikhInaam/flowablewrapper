/**
 * GetNatureAndTypeDetailsRequestDataHeader.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.GetNatureAndTypeDetailsRequest_xsd;

public class GetNatureAndTypeDetailsRequestDataHeader  implements java.io.Serializable {
    private String transactionId;

    private String requestType;

    private String accountNumber;

    private String accountId;

    private Integer isTechanical;

    private String customerSegment;

    private ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.GetNatureAndTypeDetailsRequest_xsd.GetNatureAndTypeDetailsRequestDataHeaderRefundDetails refundDetails;

    private ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.GetNatureAndTypeDetailsRequest_xsd.GetNatureAndTypeDetailsRequestDataHeaderAdditionalInfo[] additionalInfo;

    public GetNatureAndTypeDetailsRequestDataHeader() {
    }

    public GetNatureAndTypeDetailsRequestDataHeader(
           String transactionId,
           String requestType,
           String accountNumber,
           String accountId,
           Integer isTechanical,
           String customerSegment,
           ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.GetNatureAndTypeDetailsRequest_xsd.GetNatureAndTypeDetailsRequestDataHeaderRefundDetails refundDetails,
           ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.GetNatureAndTypeDetailsRequest_xsd.GetNatureAndTypeDetailsRequestDataHeaderAdditionalInfo[] additionalInfo) {
           this.transactionId = transactionId;
           this.requestType = requestType;
           this.accountNumber = accountNumber;
           this.accountId = accountId;
           this.isTechanical = isTechanical;
           this.customerSegment = customerSegment;
           this.refundDetails = refundDetails;
           this.additionalInfo = additionalInfo;
    }


    /**
     * Gets the transactionId value for this GetNatureAndTypeDetailsRequestDataHeader.
     * 
     * @return transactionId
     */
    public String getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this GetNatureAndTypeDetailsRequestDataHeader.
     * 
     * @param transactionId
     */
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }


    /**
     * Gets the requestType value for this GetNatureAndTypeDetailsRequestDataHeader.
     * 
     * @return requestType
     */
    public String getRequestType() {
        return requestType;
    }


    /**
     * Sets the requestType value for this GetNatureAndTypeDetailsRequestDataHeader.
     * 
     * @param requestType
     */
    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }


    /**
     * Gets the accountNumber value for this GetNatureAndTypeDetailsRequestDataHeader.
     * 
     * @return accountNumber
     */
    public String getAccountNumber() {
        return accountNumber;
    }


    /**
     * Sets the accountNumber value for this GetNatureAndTypeDetailsRequestDataHeader.
     * 
     * @param accountNumber
     */
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }


    /**
     * Gets the accountId value for this GetNatureAndTypeDetailsRequestDataHeader.
     * 
     * @return accountId
     */
    public String getAccountId() {
        return accountId;
    }


    /**
     * Sets the accountId value for this GetNatureAndTypeDetailsRequestDataHeader.
     * 
     * @param accountId
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }


    /**
     * Gets the isTechanical value for this GetNatureAndTypeDetailsRequestDataHeader.
     * 
     * @return isTechanical
     */
    public Integer getIsTechanical() {
        return isTechanical;
    }


    /**
     * Sets the isTechanical value for this GetNatureAndTypeDetailsRequestDataHeader.
     * 
     * @param isTechanical
     */
    public void setIsTechanical(Integer isTechanical) {
        this.isTechanical = isTechanical;
    }


    /**
     * Gets the customerSegment value for this GetNatureAndTypeDetailsRequestDataHeader.
     * 
     * @return customerSegment
     */
    public String getCustomerSegment() {
        return customerSegment;
    }


    /**
     * Sets the customerSegment value for this GetNatureAndTypeDetailsRequestDataHeader.
     * 
     * @param customerSegment
     */
    public void setCustomerSegment(String customerSegment) {
        this.customerSegment = customerSegment;
    }


    /**
     * Gets the refundDetails value for this GetNatureAndTypeDetailsRequestDataHeader.
     * 
     * @return refundDetails
     */
    public ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.GetNatureAndTypeDetailsRequest_xsd.GetNatureAndTypeDetailsRequestDataHeaderRefundDetails getRefundDetails() {
        return refundDetails;
    }


    /**
     * Sets the refundDetails value for this GetNatureAndTypeDetailsRequestDataHeader.
     * 
     * @param refundDetails
     */
    public void setRefundDetails(ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.GetNatureAndTypeDetailsRequest_xsd.GetNatureAndTypeDetailsRequestDataHeaderRefundDetails refundDetails) {
        this.refundDetails = refundDetails;
    }


    /**
     * Gets the additionalInfo value for this GetNatureAndTypeDetailsRequestDataHeader.
     * 
     * @return additionalInfo
     */
    public ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.GetNatureAndTypeDetailsRequest_xsd.GetNatureAndTypeDetailsRequestDataHeaderAdditionalInfo[] getAdditionalInfo() {
        return additionalInfo;
    }


    /**
     * Sets the additionalInfo value for this GetNatureAndTypeDetailsRequestDataHeader.
     * 
     * @param additionalInfo
     */
    public void setAdditionalInfo(ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.GetNatureAndTypeDetailsRequest_xsd.GetNatureAndTypeDetailsRequestDataHeaderAdditionalInfo[] additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.GetNatureAndTypeDetailsRequest_xsd.GetNatureAndTypeDetailsRequestDataHeaderAdditionalInfo getAdditionalInfo(int i) {
        return this.additionalInfo[i];
    }

    public void setAdditionalInfo(int i, ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.GetNatureAndTypeDetailsRequest_xsd.GetNatureAndTypeDetailsRequestDataHeaderAdditionalInfo _value) {
        this.additionalInfo[i] = _value;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GetNatureAndTypeDetailsRequestDataHeader)) return false;
        GetNatureAndTypeDetailsRequestDataHeader other = (GetNatureAndTypeDetailsRequestDataHeader) obj;
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
            ((this.requestType==null && other.getRequestType()==null) || 
             (this.requestType!=null &&
              this.requestType.equals(other.getRequestType()))) &&
            ((this.accountNumber==null && other.getAccountNumber()==null) || 
             (this.accountNumber!=null &&
              this.accountNumber.equals(other.getAccountNumber()))) &&
            ((this.accountId==null && other.getAccountId()==null) || 
             (this.accountId!=null &&
              this.accountId.equals(other.getAccountId()))) &&
            ((this.isTechanical==null && other.getIsTechanical()==null) || 
             (this.isTechanical!=null &&
              this.isTechanical.equals(other.getIsTechanical()))) &&
            ((this.customerSegment==null && other.getCustomerSegment()==null) || 
             (this.customerSegment!=null &&
              this.customerSegment.equals(other.getCustomerSegment()))) &&
            ((this.refundDetails==null && other.getRefundDetails()==null) || 
             (this.refundDetails!=null &&
              this.refundDetails.equals(other.getRefundDetails()))) &&
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
        if (getRequestType() != null) {
            _hashCode += getRequestType().hashCode();
        }
        if (getAccountNumber() != null) {
            _hashCode += getAccountNumber().hashCode();
        }
        if (getAccountId() != null) {
            _hashCode += getAccountId().hashCode();
        }
        if (getIsTechanical() != null) {
            _hashCode += getIsTechanical().hashCode();
        }
        if (getCustomerSegment() != null) {
            _hashCode += getCustomerSegment().hashCode();
        }
        if (getRefundDetails() != null) {
            _hashCode += getRefundDetails().hashCode();
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
        new org.apache.axis.description.TypeDesc(GetNatureAndTypeDetailsRequestDataHeader.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/GetNatureAndTypeDetailsRequest.xsd", ">>GetNatureAndTypeDetailsRequest>DataHeader"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/GetNatureAndTypeDetailsRequest.xsd", "TransactionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/GetNatureAndTypeDetailsRequest.xsd", "RequestType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/GetNatureAndTypeDetailsRequest.xsd", "AccountNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/GetNatureAndTypeDetailsRequest.xsd", "AccountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isTechanical");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/GetNatureAndTypeDetailsRequest.xsd", "IsTechanical"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerSegment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/GetNatureAndTypeDetailsRequest.xsd", "CustomerSegment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refundDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/GetNatureAndTypeDetailsRequest.xsd", "RefundDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/GetNatureAndTypeDetailsRequest.xsd", ">>>GetNatureAndTypeDetailsRequest>DataHeader>RefundDetails"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/GetNatureAndTypeDetailsRequest.xsd", "AdditionalInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/GetNatureAndTypeDetailsRequest.xsd", ">>>GetNatureAndTypeDetailsRequest>DataHeader>AdditionalInfo"));
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
