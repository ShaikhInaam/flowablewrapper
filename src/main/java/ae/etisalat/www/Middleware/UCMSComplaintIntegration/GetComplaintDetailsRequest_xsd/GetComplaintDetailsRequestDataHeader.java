/**
 * GetComplaintDetailsRequestDataHeader.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ae.etisalat.www.Middleware.UCMSComplaintIntegration.GetComplaintDetailsRequest_xsd;

public class GetComplaintDetailsRequestDataHeader  implements java.io.Serializable {
    private String accountNumber;

    private String UCMSComplaintId;

    private String CRSComplaintId;

    private String partyId;

    private String complaintStatus;

    private String idIdentifier;

    private String fromDateTime;

    private String toDateTime;

    private ae.etisalat.www.Middleware.UCMSComplaintIntegration.GetComplaintDetailsRequest_xsd.GetComplaintDetailsRequestDataHeaderAddtionalInfo[] addtionalInfo;

    public GetComplaintDetailsRequestDataHeader() {
    }

    public GetComplaintDetailsRequestDataHeader(
           String accountNumber,
           String UCMSComplaintId,
           String CRSComplaintId,
           String partyId,
           String complaintStatus,
           String idIdentifier,
           String fromDateTime,
           String toDateTime,
           ae.etisalat.www.Middleware.UCMSComplaintIntegration.GetComplaintDetailsRequest_xsd.GetComplaintDetailsRequestDataHeaderAddtionalInfo[] addtionalInfo) {
           this.accountNumber = accountNumber;
           this.UCMSComplaintId = UCMSComplaintId;
           this.CRSComplaintId = CRSComplaintId;
           this.partyId = partyId;
           this.complaintStatus = complaintStatus;
           this.idIdentifier = idIdentifier;
           this.fromDateTime = fromDateTime;
           this.toDateTime = toDateTime;
           this.addtionalInfo = addtionalInfo;
    }


    /**
     * Gets the accountNumber value for this GetComplaintDetailsRequestDataHeader.
     * 
     * @return accountNumber
     */
    public String getAccountNumber() {
        return accountNumber;
    }


    /**
     * Sets the accountNumber value for this GetComplaintDetailsRequestDataHeader.
     * 
     * @param accountNumber
     */
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }


    /**
     * Gets the UCMSComplaintId value for this GetComplaintDetailsRequestDataHeader.
     * 
     * @return UCMSComplaintId
     */
    public String getUCMSComplaintId() {
        return UCMSComplaintId;
    }


    /**
     * Sets the UCMSComplaintId value for this GetComplaintDetailsRequestDataHeader.
     * 
     * @param UCMSComplaintId
     */
    public void setUCMSComplaintId(String UCMSComplaintId) {
        this.UCMSComplaintId = UCMSComplaintId;
    }


    /**
     * Gets the CRSComplaintId value for this GetComplaintDetailsRequestDataHeader.
     * 
     * @return CRSComplaintId
     */
    public String getCRSComplaintId() {
        return CRSComplaintId;
    }


    /**
     * Sets the CRSComplaintId value for this GetComplaintDetailsRequestDataHeader.
     * 
     * @param CRSComplaintId
     */
    public void setCRSComplaintId(String CRSComplaintId) {
        this.CRSComplaintId = CRSComplaintId;
    }


    /**
     * Gets the partyId value for this GetComplaintDetailsRequestDataHeader.
     * 
     * @return partyId
     */
    public String getPartyId() {
        return partyId;
    }


    /**
     * Sets the partyId value for this GetComplaintDetailsRequestDataHeader.
     * 
     * @param partyId
     */
    public void setPartyId(String partyId) {
        this.partyId = partyId;
    }


    /**
     * Gets the complaintStatus value for this GetComplaintDetailsRequestDataHeader.
     * 
     * @return complaintStatus
     */
    public String getComplaintStatus() {
        return complaintStatus;
    }


    /**
     * Sets the complaintStatus value for this GetComplaintDetailsRequestDataHeader.
     * 
     * @param complaintStatus
     */
    public void setComplaintStatus(String complaintStatus) {
        this.complaintStatus = complaintStatus;
    }


    /**
     * Gets the idIdentifier value for this GetComplaintDetailsRequestDataHeader.
     * 
     * @return idIdentifier
     */
    public String getIdIdentifier() {
        return idIdentifier;
    }


    /**
     * Sets the idIdentifier value for this GetComplaintDetailsRequestDataHeader.
     * 
     * @param idIdentifier
     */
    public void setIdIdentifier(String idIdentifier) {
        this.idIdentifier = idIdentifier;
    }


    /**
     * Gets the fromDateTime value for this GetComplaintDetailsRequestDataHeader.
     * 
     * @return fromDateTime
     */
    public String getFromDateTime() {
        return fromDateTime;
    }


    /**
     * Sets the fromDateTime value for this GetComplaintDetailsRequestDataHeader.
     * 
     * @param fromDateTime
     */
    public void setFromDateTime(String fromDateTime) {
        this.fromDateTime = fromDateTime;
    }


    /**
     * Gets the toDateTime value for this GetComplaintDetailsRequestDataHeader.
     * 
     * @return toDateTime
     */
    public String getToDateTime() {
        return toDateTime;
    }


    /**
     * Sets the toDateTime value for this GetComplaintDetailsRequestDataHeader.
     * 
     * @param toDateTime
     */
    public void setToDateTime(String toDateTime) {
        this.toDateTime = toDateTime;
    }


    /**
     * Gets the addtionalInfo value for this GetComplaintDetailsRequestDataHeader.
     * 
     * @return addtionalInfo
     */
    public ae.etisalat.www.Middleware.UCMSComplaintIntegration.GetComplaintDetailsRequest_xsd.GetComplaintDetailsRequestDataHeaderAddtionalInfo[] getAddtionalInfo() {
        return addtionalInfo;
    }


    /**
     * Sets the addtionalInfo value for this GetComplaintDetailsRequestDataHeader.
     * 
     * @param addtionalInfo
     */
    public void setAddtionalInfo(ae.etisalat.www.Middleware.UCMSComplaintIntegration.GetComplaintDetailsRequest_xsd.GetComplaintDetailsRequestDataHeaderAddtionalInfo[] addtionalInfo) {
        this.addtionalInfo = addtionalInfo;
    }

    public ae.etisalat.www.Middleware.UCMSComplaintIntegration.GetComplaintDetailsRequest_xsd.GetComplaintDetailsRequestDataHeaderAddtionalInfo getAddtionalInfo(int i) {
        return this.addtionalInfo[i];
    }

    public void setAddtionalInfo(int i, ae.etisalat.www.Middleware.UCMSComplaintIntegration.GetComplaintDetailsRequest_xsd.GetComplaintDetailsRequestDataHeaderAddtionalInfo _value) {
        this.addtionalInfo[i] = _value;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GetComplaintDetailsRequestDataHeader)) return false;
        GetComplaintDetailsRequestDataHeader other = (GetComplaintDetailsRequestDataHeader) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.accountNumber==null && other.getAccountNumber()==null) || 
             (this.accountNumber!=null &&
              this.accountNumber.equals(other.getAccountNumber()))) &&
            ((this.UCMSComplaintId==null && other.getUCMSComplaintId()==null) || 
             (this.UCMSComplaintId!=null &&
              this.UCMSComplaintId.equals(other.getUCMSComplaintId()))) &&
            ((this.CRSComplaintId==null && other.getCRSComplaintId()==null) || 
             (this.CRSComplaintId!=null &&
              this.CRSComplaintId.equals(other.getCRSComplaintId()))) &&
            ((this.partyId==null && other.getPartyId()==null) || 
             (this.partyId!=null &&
              this.partyId.equals(other.getPartyId()))) &&
            ((this.complaintStatus==null && other.getComplaintStatus()==null) || 
             (this.complaintStatus!=null &&
              this.complaintStatus.equals(other.getComplaintStatus()))) &&
            ((this.idIdentifier==null && other.getIdIdentifier()==null) || 
             (this.idIdentifier!=null &&
              this.idIdentifier.equals(other.getIdIdentifier()))) &&
            ((this.fromDateTime==null && other.getFromDateTime()==null) || 
             (this.fromDateTime!=null &&
              this.fromDateTime.equals(other.getFromDateTime()))) &&
            ((this.toDateTime==null && other.getToDateTime()==null) || 
             (this.toDateTime!=null &&
              this.toDateTime.equals(other.getToDateTime()))) &&
            ((this.addtionalInfo==null && other.getAddtionalInfo()==null) || 
             (this.addtionalInfo!=null &&
              java.util.Arrays.equals(this.addtionalInfo, other.getAddtionalInfo())));
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
        if (getAccountNumber() != null) {
            _hashCode += getAccountNumber().hashCode();
        }
        if (getUCMSComplaintId() != null) {
            _hashCode += getUCMSComplaintId().hashCode();
        }
        if (getCRSComplaintId() != null) {
            _hashCode += getCRSComplaintId().hashCode();
        }
        if (getPartyId() != null) {
            _hashCode += getPartyId().hashCode();
        }
        if (getComplaintStatus() != null) {
            _hashCode += getComplaintStatus().hashCode();
        }
        if (getIdIdentifier() != null) {
            _hashCode += getIdIdentifier().hashCode();
        }
        if (getFromDateTime() != null) {
            _hashCode += getFromDateTime().hashCode();
        }
        if (getToDateTime() != null) {
            _hashCode += getToDateTime().hashCode();
        }
        if (getAddtionalInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAddtionalInfo());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getAddtionalInfo(), i);
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
        new org.apache.axis.description.TypeDesc(GetComplaintDetailsRequestDataHeader.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/GetComplaintDetailsRequest.xsd", ">>GetComplaintDetailsRequest>DataHeader"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/GetComplaintDetailsRequest.xsd", "AccountNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("UCMSComplaintId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/GetComplaintDetailsRequest.xsd", "UCMSComplaintId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CRSComplaintId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/GetComplaintDetailsRequest.xsd", "CRSComplaintId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partyId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/GetComplaintDetailsRequest.xsd", "PartyId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("complaintStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/GetComplaintDetailsRequest.xsd", "ComplaintStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/GetComplaintDetailsRequest.xsd", "IdIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fromDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/GetComplaintDetailsRequest.xsd", "FromDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/GetComplaintDetailsRequest.xsd", "ToDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addtionalInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/GetComplaintDetailsRequest.xsd", "AddtionalInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/GetComplaintDetailsRequest.xsd", ">>>GetComplaintDetailsRequest>DataHeader>AddtionalInfo"));
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
