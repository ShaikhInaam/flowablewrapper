/**
 * GetBillTransactionsRequestDataHeaderBillItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ae.etisalat.www.Middleware.CRMWrapper.GetBillTransactionsRequest_xsd;

public class GetBillTransactionsRequestDataHeaderBillItem  implements java.io.Serializable {
    private String accountNumber;

    private String billDate;

    private String agentId;

    public GetBillTransactionsRequestDataHeaderBillItem() {
    }

    public GetBillTransactionsRequestDataHeaderBillItem(
           String accountNumber,
           String billDate,
           String agentId) {
           this.accountNumber = accountNumber;
           this.billDate = billDate;
           this.agentId = agentId;
    }


    /**
     * Gets the accountNumber value for this GetBillTransactionsRequestDataHeaderBillItem.
     * 
     * @return accountNumber
     */
    public String getAccountNumber() {
        return accountNumber;
    }


    /**
     * Sets the accountNumber value for this GetBillTransactionsRequestDataHeaderBillItem.
     * 
     * @param accountNumber
     */
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }


    /**
     * Gets the billDate value for this GetBillTransactionsRequestDataHeaderBillItem.
     * 
     * @return billDate
     */
    public String getBillDate() {
        return billDate;
    }


    /**
     * Sets the billDate value for this GetBillTransactionsRequestDataHeaderBillItem.
     * 
     * @param billDate
     */
    public void setBillDate(String billDate) {
        this.billDate = billDate;
    }


    /**
     * Gets the agentId value for this GetBillTransactionsRequestDataHeaderBillItem.
     * 
     * @return agentId
     */
    public String getAgentId() {
        return agentId;
    }


    /**
     * Sets the agentId value for this GetBillTransactionsRequestDataHeaderBillItem.
     * 
     * @param agentId
     */
    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GetBillTransactionsRequestDataHeaderBillItem)) return false;
        GetBillTransactionsRequestDataHeaderBillItem other = (GetBillTransactionsRequestDataHeaderBillItem) obj;
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
            ((this.billDate==null && other.getBillDate()==null) || 
             (this.billDate!=null &&
              this.billDate.equals(other.getBillDate()))) &&
            ((this.agentId==null && other.getAgentId()==null) || 
             (this.agentId!=null &&
              this.agentId.equals(other.getAgentId())));
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
        if (getBillDate() != null) {
            _hashCode += getBillDate().hashCode();
        }
        if (getAgentId() != null) {
            _hashCode += getAgentId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetBillTransactionsRequestDataHeaderBillItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/CRMWrapper/GetBillTransactionsRequest.xsd", ">>>GetBillTransactionsRequest>DataHeader>BillItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/CRMWrapper/GetBillTransactionsRequest.xsd", "AccountNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/CRMWrapper/GetBillTransactionsRequest.xsd", "BillDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agentId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/CRMWrapper/GetBillTransactionsRequest.xsd", "AgentId"));
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
