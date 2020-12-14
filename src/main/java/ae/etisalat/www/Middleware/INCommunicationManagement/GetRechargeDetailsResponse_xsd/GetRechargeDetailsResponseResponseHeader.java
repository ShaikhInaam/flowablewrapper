/**
 * GetRechargeDetailsResponseResponseHeader.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ae.etisalat.www.Middleware.INCommunicationManagement.GetRechargeDetailsResponse_xsd;

public class GetRechargeDetailsResponseResponseHeader  implements java.io.Serializable {
    private String transactionID;

    private String lastRechargeValue;

    private String lastRechargeDate;

    private String balanceAfterLastRecharge;

    private String currentBalance;

    private ae.etisalat.www.Middleware.INCommunicationManagement.GetRechargeDetailsResponse_xsd.GetRechargeDetailsResponseResponseHeaderBalanceDetails[] balanceDetails;

    private ae.etisalat.www.Middleware.INCommunicationManagement.GetRechargeDetailsResponse_xsd.GetRechargeDetailsResponseResponseHeaderAdditionalInfo[] additionalInfo;

    public GetRechargeDetailsResponseResponseHeader() {
    }

    public GetRechargeDetailsResponseResponseHeader(
           String transactionID,
           String lastRechargeValue,
           String lastRechargeDate,
           String balanceAfterLastRecharge,
           String currentBalance,
           ae.etisalat.www.Middleware.INCommunicationManagement.GetRechargeDetailsResponse_xsd.GetRechargeDetailsResponseResponseHeaderBalanceDetails[] balanceDetails,
           ae.etisalat.www.Middleware.INCommunicationManagement.GetRechargeDetailsResponse_xsd.GetRechargeDetailsResponseResponseHeaderAdditionalInfo[] additionalInfo) {
           this.transactionID = transactionID;
           this.lastRechargeValue = lastRechargeValue;
           this.lastRechargeDate = lastRechargeDate;
           this.balanceAfterLastRecharge = balanceAfterLastRecharge;
           this.currentBalance = currentBalance;
           this.balanceDetails = balanceDetails;
           this.additionalInfo = additionalInfo;
    }


    /**
     * Gets the transactionID value for this GetRechargeDetailsResponseResponseHeader.
     * 
     * @return transactionID
     */
    public String getTransactionID() {
        return transactionID;
    }


    /**
     * Sets the transactionID value for this GetRechargeDetailsResponseResponseHeader.
     * 
     * @param transactionID
     */
    public void setTransactionID(String transactionID) {
        this.transactionID = transactionID;
    }


    /**
     * Gets the lastRechargeValue value for this GetRechargeDetailsResponseResponseHeader.
     * 
     * @return lastRechargeValue
     */
    public String getLastRechargeValue() {
        return lastRechargeValue;
    }


    /**
     * Sets the lastRechargeValue value for this GetRechargeDetailsResponseResponseHeader.
     * 
     * @param lastRechargeValue
     */
    public void setLastRechargeValue(String lastRechargeValue) {
        this.lastRechargeValue = lastRechargeValue;
    }


    /**
     * Gets the lastRechargeDate value for this GetRechargeDetailsResponseResponseHeader.
     * 
     * @return lastRechargeDate
     */
    public String getLastRechargeDate() {
        return lastRechargeDate;
    }


    /**
     * Sets the lastRechargeDate value for this GetRechargeDetailsResponseResponseHeader.
     * 
     * @param lastRechargeDate
     */
    public void setLastRechargeDate(String lastRechargeDate) {
        this.lastRechargeDate = lastRechargeDate;
    }


    /**
     * Gets the balanceAfterLastRecharge value for this GetRechargeDetailsResponseResponseHeader.
     * 
     * @return balanceAfterLastRecharge
     */
    public String getBalanceAfterLastRecharge() {
        return balanceAfterLastRecharge;
    }


    /**
     * Sets the balanceAfterLastRecharge value for this GetRechargeDetailsResponseResponseHeader.
     * 
     * @param balanceAfterLastRecharge
     */
    public void setBalanceAfterLastRecharge(String balanceAfterLastRecharge) {
        this.balanceAfterLastRecharge = balanceAfterLastRecharge;
    }


    /**
     * Gets the currentBalance value for this GetRechargeDetailsResponseResponseHeader.
     * 
     * @return currentBalance
     */
    public String getCurrentBalance() {
        return currentBalance;
    }


    /**
     * Sets the currentBalance value for this GetRechargeDetailsResponseResponseHeader.
     * 
     * @param currentBalance
     */
    public void setCurrentBalance(String currentBalance) {
        this.currentBalance = currentBalance;
    }


    /**
     * Gets the balanceDetails value for this GetRechargeDetailsResponseResponseHeader.
     * 
     * @return balanceDetails
     */
    public ae.etisalat.www.Middleware.INCommunicationManagement.GetRechargeDetailsResponse_xsd.GetRechargeDetailsResponseResponseHeaderBalanceDetails[] getBalanceDetails() {
        return balanceDetails;
    }


    /**
     * Sets the balanceDetails value for this GetRechargeDetailsResponseResponseHeader.
     * 
     * @param balanceDetails
     */
    public void setBalanceDetails(ae.etisalat.www.Middleware.INCommunicationManagement.GetRechargeDetailsResponse_xsd.GetRechargeDetailsResponseResponseHeaderBalanceDetails[] balanceDetails) {
        this.balanceDetails = balanceDetails;
    }

    public ae.etisalat.www.Middleware.INCommunicationManagement.GetRechargeDetailsResponse_xsd.GetRechargeDetailsResponseResponseHeaderBalanceDetails getBalanceDetails(int i) {
        return this.balanceDetails[i];
    }

    public void setBalanceDetails(int i, ae.etisalat.www.Middleware.INCommunicationManagement.GetRechargeDetailsResponse_xsd.GetRechargeDetailsResponseResponseHeaderBalanceDetails _value) {
        this.balanceDetails[i] = _value;
    }


    /**
     * Gets the additionalInfo value for this GetRechargeDetailsResponseResponseHeader.
     * 
     * @return additionalInfo
     */
    public ae.etisalat.www.Middleware.INCommunicationManagement.GetRechargeDetailsResponse_xsd.GetRechargeDetailsResponseResponseHeaderAdditionalInfo[] getAdditionalInfo() {
        return additionalInfo;
    }


    /**
     * Sets the additionalInfo value for this GetRechargeDetailsResponseResponseHeader.
     * 
     * @param additionalInfo
     */
    public void setAdditionalInfo(ae.etisalat.www.Middleware.INCommunicationManagement.GetRechargeDetailsResponse_xsd.GetRechargeDetailsResponseResponseHeaderAdditionalInfo[] additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public ae.etisalat.www.Middleware.INCommunicationManagement.GetRechargeDetailsResponse_xsd.GetRechargeDetailsResponseResponseHeaderAdditionalInfo getAdditionalInfo(int i) {
        return this.additionalInfo[i];
    }

    public void setAdditionalInfo(int i, ae.etisalat.www.Middleware.INCommunicationManagement.GetRechargeDetailsResponse_xsd.GetRechargeDetailsResponseResponseHeaderAdditionalInfo _value) {
        this.additionalInfo[i] = _value;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GetRechargeDetailsResponseResponseHeader)) return false;
        GetRechargeDetailsResponseResponseHeader other = (GetRechargeDetailsResponseResponseHeader) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.transactionID==null && other.getTransactionID()==null) || 
             (this.transactionID!=null &&
              this.transactionID.equals(other.getTransactionID()))) &&
            ((this.lastRechargeValue==null && other.getLastRechargeValue()==null) || 
             (this.lastRechargeValue!=null &&
              this.lastRechargeValue.equals(other.getLastRechargeValue()))) &&
            ((this.lastRechargeDate==null && other.getLastRechargeDate()==null) || 
             (this.lastRechargeDate!=null &&
              this.lastRechargeDate.equals(other.getLastRechargeDate()))) &&
            ((this.balanceAfterLastRecharge==null && other.getBalanceAfterLastRecharge()==null) || 
             (this.balanceAfterLastRecharge!=null &&
              this.balanceAfterLastRecharge.equals(other.getBalanceAfterLastRecharge()))) &&
            ((this.currentBalance==null && other.getCurrentBalance()==null) || 
             (this.currentBalance!=null &&
              this.currentBalance.equals(other.getCurrentBalance()))) &&
            ((this.balanceDetails==null && other.getBalanceDetails()==null) || 
             (this.balanceDetails!=null &&
              java.util.Arrays.equals(this.balanceDetails, other.getBalanceDetails()))) &&
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
        if (getTransactionID() != null) {
            _hashCode += getTransactionID().hashCode();
        }
        if (getLastRechargeValue() != null) {
            _hashCode += getLastRechargeValue().hashCode();
        }
        if (getLastRechargeDate() != null) {
            _hashCode += getLastRechargeDate().hashCode();
        }
        if (getBalanceAfterLastRecharge() != null) {
            _hashCode += getBalanceAfterLastRecharge().hashCode();
        }
        if (getCurrentBalance() != null) {
            _hashCode += getCurrentBalance().hashCode();
        }
        if (getBalanceDetails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBalanceDetails());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getBalanceDetails(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        new org.apache.axis.description.TypeDesc(GetRechargeDetailsResponseResponseHeader.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetRechargeDetailsResponse.xsd", ">>GetRechargeDetailsResponse>ResponseHeader"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetRechargeDetailsResponse.xsd", "TransactionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastRechargeValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetRechargeDetailsResponse.xsd", "LastRechargeValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastRechargeDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetRechargeDetailsResponse.xsd", "LastRechargeDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balanceAfterLastRecharge");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetRechargeDetailsResponse.xsd", "BalanceAfterLastRecharge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetRechargeDetailsResponse.xsd", "CurrentBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balanceDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetRechargeDetailsResponse.xsd", "BalanceDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetRechargeDetailsResponse.xsd", ">>>GetRechargeDetailsResponse>ResponseHeader>BalanceDetails"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetRechargeDetailsResponse.xsd", "AdditionalInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetRechargeDetailsResponse.xsd", ">>>GetRechargeDetailsResponse>ResponseHeader>AdditionalInfo"));
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
