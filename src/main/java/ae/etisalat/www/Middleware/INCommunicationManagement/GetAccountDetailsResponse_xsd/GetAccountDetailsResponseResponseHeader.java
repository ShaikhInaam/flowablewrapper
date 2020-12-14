/**
 * GetAccountDetailsResponseResponseHeader.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd;

public class GetAccountDetailsResponseResponseHeader  implements java.io.Serializable {
    private String transactionID;

    private ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.GetAccountDetailsResponseResponseHeaderAccountDetails accountDetails;

    private ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.GetAccountDetailsResponseResponseHeaderBalanceAndDate balanceAndDate;

    private ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.OfferInformation[] offerInformation;

    private ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.GetAccountDetailsResponseResponseHeaderGetUsageThresholdsAndCounterUsageCounterUsageThresholdInformation[] getUsageThresholdsAndCounter;

    private ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.GetAccountDetailsResponseResponseHeaderGetFaFList getFaFList;

    private ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.GetAccountDetailsResponseResponseHeaderGetAccumulator getAccumulator;

    private ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.GetAccountDetailsResponseResponseHeaderAdditionalInfo[] additionalInfo;

    public GetAccountDetailsResponseResponseHeader() {
    }

    public GetAccountDetailsResponseResponseHeader(
           String transactionID,
           ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.GetAccountDetailsResponseResponseHeaderAccountDetails accountDetails,
           ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.GetAccountDetailsResponseResponseHeaderBalanceAndDate balanceAndDate,
           ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.OfferInformation[] offerInformation,
           ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.GetAccountDetailsResponseResponseHeaderGetUsageThresholdsAndCounterUsageCounterUsageThresholdInformation[] getUsageThresholdsAndCounter,
           ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.GetAccountDetailsResponseResponseHeaderGetFaFList getFaFList,
           ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.GetAccountDetailsResponseResponseHeaderGetAccumulator getAccumulator,
           ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.GetAccountDetailsResponseResponseHeaderAdditionalInfo[] additionalInfo) {
           this.transactionID = transactionID;
           this.accountDetails = accountDetails;
           this.balanceAndDate = balanceAndDate;
           this.offerInformation = offerInformation;
           this.getUsageThresholdsAndCounter = getUsageThresholdsAndCounter;
           this.getFaFList = getFaFList;
           this.getAccumulator = getAccumulator;
           this.additionalInfo = additionalInfo;
    }


    /**
     * Gets the transactionID value for this GetAccountDetailsResponseResponseHeader.
     * 
     * @return transactionID
     */
    public String getTransactionID() {
        return transactionID;
    }


    /**
     * Sets the transactionID value for this GetAccountDetailsResponseResponseHeader.
     * 
     * @param transactionID
     */
    public void setTransactionID(String transactionID) {
        this.transactionID = transactionID;
    }


    /**
     * Gets the accountDetails value for this GetAccountDetailsResponseResponseHeader.
     * 
     * @return accountDetails
     */
    public ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.GetAccountDetailsResponseResponseHeaderAccountDetails getAccountDetails() {
        return accountDetails;
    }


    /**
     * Sets the accountDetails value for this GetAccountDetailsResponseResponseHeader.
     * 
     * @param accountDetails
     */
    public void setAccountDetails(ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.GetAccountDetailsResponseResponseHeaderAccountDetails accountDetails) {
        this.accountDetails = accountDetails;
    }


    /**
     * Gets the balanceAndDate value for this GetAccountDetailsResponseResponseHeader.
     * 
     * @return balanceAndDate
     */
    public ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.GetAccountDetailsResponseResponseHeaderBalanceAndDate getBalanceAndDate() {
        return balanceAndDate;
    }


    /**
     * Sets the balanceAndDate value for this GetAccountDetailsResponseResponseHeader.
     * 
     * @param balanceAndDate
     */
    public void setBalanceAndDate(ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.GetAccountDetailsResponseResponseHeaderBalanceAndDate balanceAndDate) {
        this.balanceAndDate = balanceAndDate;
    }


    /**
     * Gets the offerInformation value for this GetAccountDetailsResponseResponseHeader.
     * 
     * @return offerInformation
     */
    public ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.OfferInformation[] getOfferInformation() {
        return offerInformation;
    }


    /**
     * Sets the offerInformation value for this GetAccountDetailsResponseResponseHeader.
     * 
     * @param offerInformation
     */
    public void setOfferInformation(ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.OfferInformation[] offerInformation) {
        this.offerInformation = offerInformation;
    }

    public ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.OfferInformation getOfferInformation(int i) {
        return this.offerInformation[i];
    }

    public void setOfferInformation(int i, ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.OfferInformation _value) {
        this.offerInformation[i] = _value;
    }


    /**
     * Gets the getUsageThresholdsAndCounter value for this GetAccountDetailsResponseResponseHeader.
     * 
     * @return getUsageThresholdsAndCounter
     */
    public ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.GetAccountDetailsResponseResponseHeaderGetUsageThresholdsAndCounterUsageCounterUsageThresholdInformation[] getGetUsageThresholdsAndCounter() {
        return getUsageThresholdsAndCounter;
    }


    /**
     * Sets the getUsageThresholdsAndCounter value for this GetAccountDetailsResponseResponseHeader.
     * 
     * @param getUsageThresholdsAndCounter
     */
    public void setGetUsageThresholdsAndCounter(ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.GetAccountDetailsResponseResponseHeaderGetUsageThresholdsAndCounterUsageCounterUsageThresholdInformation[] getUsageThresholdsAndCounter) {
        this.getUsageThresholdsAndCounter = getUsageThresholdsAndCounter;
    }


    /**
     * Gets the getFaFList value for this GetAccountDetailsResponseResponseHeader.
     * 
     * @return getFaFList
     */
    public ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.GetAccountDetailsResponseResponseHeaderGetFaFList getGetFaFList() {
        return getFaFList;
    }


    /**
     * Sets the getFaFList value for this GetAccountDetailsResponseResponseHeader.
     * 
     * @param getFaFList
     */
    public void setGetFaFList(ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.GetAccountDetailsResponseResponseHeaderGetFaFList getFaFList) {
        this.getFaFList = getFaFList;
    }


    /**
     * Gets the getAccumulator value for this GetAccountDetailsResponseResponseHeader.
     * 
     * @return getAccumulator
     */
    public ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.GetAccountDetailsResponseResponseHeaderGetAccumulator getGetAccumulator() {
        return getAccumulator;
    }


    /**
     * Sets the getAccumulator value for this GetAccountDetailsResponseResponseHeader.
     * 
     * @param getAccumulator
     */
    public void setGetAccumulator(ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.GetAccountDetailsResponseResponseHeaderGetAccumulator getAccumulator) {
        this.getAccumulator = getAccumulator;
    }


    /**
     * Gets the additionalInfo value for this GetAccountDetailsResponseResponseHeader.
     * 
     * @return additionalInfo
     */
    public ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.GetAccountDetailsResponseResponseHeaderAdditionalInfo[] getAdditionalInfo() {
        return additionalInfo;
    }


    /**
     * Sets the additionalInfo value for this GetAccountDetailsResponseResponseHeader.
     * 
     * @param additionalInfo
     */
    public void setAdditionalInfo(ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.GetAccountDetailsResponseResponseHeaderAdditionalInfo[] additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.GetAccountDetailsResponseResponseHeaderAdditionalInfo getAdditionalInfo(int i) {
        return this.additionalInfo[i];
    }

    public void setAdditionalInfo(int i, ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.GetAccountDetailsResponseResponseHeaderAdditionalInfo _value) {
        this.additionalInfo[i] = _value;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GetAccountDetailsResponseResponseHeader)) return false;
        GetAccountDetailsResponseResponseHeader other = (GetAccountDetailsResponseResponseHeader) obj;
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
            ((this.accountDetails==null && other.getAccountDetails()==null) || 
             (this.accountDetails!=null &&
              this.accountDetails.equals(other.getAccountDetails()))) &&
            ((this.balanceAndDate==null && other.getBalanceAndDate()==null) || 
             (this.balanceAndDate!=null &&
              this.balanceAndDate.equals(other.getBalanceAndDate()))) &&
            ((this.offerInformation==null && other.getOfferInformation()==null) || 
             (this.offerInformation!=null &&
              java.util.Arrays.equals(this.offerInformation, other.getOfferInformation()))) &&
            ((this.getUsageThresholdsAndCounter==null && other.getGetUsageThresholdsAndCounter()==null) || 
             (this.getUsageThresholdsAndCounter!=null &&
              java.util.Arrays.equals(this.getUsageThresholdsAndCounter, other.getGetUsageThresholdsAndCounter()))) &&
            ((this.getFaFList==null && other.getGetFaFList()==null) || 
             (this.getFaFList!=null &&
              this.getFaFList.equals(other.getGetFaFList()))) &&
            ((this.getAccumulator==null && other.getGetAccumulator()==null) || 
             (this.getAccumulator!=null &&
              this.getAccumulator.equals(other.getGetAccumulator()))) &&
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
        if (getAccountDetails() != null) {
            _hashCode += getAccountDetails().hashCode();
        }
        if (getBalanceAndDate() != null) {
            _hashCode += getBalanceAndDate().hashCode();
        }
        if (getOfferInformation() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOfferInformation());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getOfferInformation(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGetUsageThresholdsAndCounter() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGetUsageThresholdsAndCounter());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getGetUsageThresholdsAndCounter(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGetFaFList() != null) {
            _hashCode += getGetFaFList().hashCode();
        }
        if (getGetAccumulator() != null) {
            _hashCode += getGetAccumulator().hashCode();
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
        new org.apache.axis.description.TypeDesc(GetAccountDetailsResponseResponseHeader.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", ">>GetAccountDetailsResponse>ResponseHeader"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "TransactionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "AccountDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", ">>>GetAccountDetailsResponse>ResponseHeader>AccountDetails"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balanceAndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "BalanceAndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", ">>>GetAccountDetailsResponse>ResponseHeader>BalanceAndDate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offerInformation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "OfferInformation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "OfferInformation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getUsageThresholdsAndCounter");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "GetUsageThresholdsAndCounter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", ">>>>GetAccountDetailsResponse>ResponseHeader>GetUsageThresholdsAndCounter>UsageCounterUsageThresholdInformation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "UsageCounterUsageThresholdInformation"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getFaFList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "GetFaFList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", ">>>GetAccountDetailsResponse>ResponseHeader>GetFaFList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getAccumulator");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "GetAccumulator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", ">>>GetAccountDetailsResponse>ResponseHeader>GetAccumulator"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "AdditionalInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", ">>>GetAccountDetailsResponse>ResponseHeader>AdditionalInfo"));
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
