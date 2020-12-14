/**
 * GetRechargeDetailsRequestDataHeader.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ae.etisalat.www.Middleware.INCommunicationManagement.GetRechargeDetailsRequest_xsd;

public class GetRechargeDetailsRequestDataHeader  implements java.io.Serializable {
    private String accountNo;

    private String retrieveDACreditDetails;

    private ae.etisalat.www.Middleware.INCommunicationManagement.GetRechargeDetailsRequest_xsd.GetRechargeDetailsRequestDataHeaderAddtionalInfo[] addtionalInfo;

    public GetRechargeDetailsRequestDataHeader() {
    }

    public GetRechargeDetailsRequestDataHeader(
           String accountNo,
           String retrieveDACreditDetails,
           ae.etisalat.www.Middleware.INCommunicationManagement.GetRechargeDetailsRequest_xsd.GetRechargeDetailsRequestDataHeaderAddtionalInfo[] addtionalInfo) {
           this.accountNo = accountNo;
           this.retrieveDACreditDetails = retrieveDACreditDetails;
           this.addtionalInfo = addtionalInfo;
    }


    /**
     * Gets the accountNo value for this GetRechargeDetailsRequestDataHeader.
     * 
     * @return accountNo
     */
    public String getAccountNo() {
        return accountNo;
    }


    /**
     * Sets the accountNo value for this GetRechargeDetailsRequestDataHeader.
     * 
     * @param accountNo
     */
    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }


    /**
     * Gets the retrieveDACreditDetails value for this GetRechargeDetailsRequestDataHeader.
     * 
     * @return retrieveDACreditDetails
     */
    public String getRetrieveDACreditDetails() {
        return retrieveDACreditDetails;
    }


    /**
     * Sets the retrieveDACreditDetails value for this GetRechargeDetailsRequestDataHeader.
     * 
     * @param retrieveDACreditDetails
     */
    public void setRetrieveDACreditDetails(String retrieveDACreditDetails) {
        this.retrieveDACreditDetails = retrieveDACreditDetails;
    }


    /**
     * Gets the addtionalInfo value for this GetRechargeDetailsRequestDataHeader.
     * 
     * @return addtionalInfo
     */
    public ae.etisalat.www.Middleware.INCommunicationManagement.GetRechargeDetailsRequest_xsd.GetRechargeDetailsRequestDataHeaderAddtionalInfo[] getAddtionalInfo() {
        return addtionalInfo;
    }


    /**
     * Sets the addtionalInfo value for this GetRechargeDetailsRequestDataHeader.
     * 
     * @param addtionalInfo
     */
    public void setAddtionalInfo(ae.etisalat.www.Middleware.INCommunicationManagement.GetRechargeDetailsRequest_xsd.GetRechargeDetailsRequestDataHeaderAddtionalInfo[] addtionalInfo) {
        this.addtionalInfo = addtionalInfo;
    }

    public ae.etisalat.www.Middleware.INCommunicationManagement.GetRechargeDetailsRequest_xsd.GetRechargeDetailsRequestDataHeaderAddtionalInfo getAddtionalInfo(int i) {
        return this.addtionalInfo[i];
    }

    public void setAddtionalInfo(int i, ae.etisalat.www.Middleware.INCommunicationManagement.GetRechargeDetailsRequest_xsd.GetRechargeDetailsRequestDataHeaderAddtionalInfo _value) {
        this.addtionalInfo[i] = _value;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GetRechargeDetailsRequestDataHeader)) return false;
        GetRechargeDetailsRequestDataHeader other = (GetRechargeDetailsRequestDataHeader) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.accountNo==null && other.getAccountNo()==null) || 
             (this.accountNo!=null &&
              this.accountNo.equals(other.getAccountNo()))) &&
            ((this.retrieveDACreditDetails==null && other.getRetrieveDACreditDetails()==null) || 
             (this.retrieveDACreditDetails!=null &&
              this.retrieveDACreditDetails.equals(other.getRetrieveDACreditDetails()))) &&
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
        if (getAccountNo() != null) {
            _hashCode += getAccountNo().hashCode();
        }
        if (getRetrieveDACreditDetails() != null) {
            _hashCode += getRetrieveDACreditDetails().hashCode();
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
        new org.apache.axis.description.TypeDesc(GetRechargeDetailsRequestDataHeader.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetRechargeDetailsRequest.xsd", ">>GetRechargeDetailsRequest>DataHeader"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetRechargeDetailsRequest.xsd", "AccountNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retrieveDACreditDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetRechargeDetailsRequest.xsd", "RetrieveDACreditDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addtionalInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetRechargeDetailsRequest.xsd", "AddtionalInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetRechargeDetailsRequest.xsd", ">>>GetRechargeDetailsRequest>DataHeader>AddtionalInfo"));
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
