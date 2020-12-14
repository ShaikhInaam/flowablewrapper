/**
 * QueryHLRResponseResponseHeader.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ae.etisalat.www.Middleware.HLRActions.QueryHLRResponse_xsd;

public class QueryHLRResponseResponseHeader  implements java.io.Serializable {
    private String transactionID;

    private String MSISDN;

    private String IMSI;

    private QueryHLRResponseResponseHeaderDetails[] details;

    private ae.etisalat.www.Middleware.HLRActions.QueryHLRResponse_xsd.QueryHLRResponseResponseHeaderAdditionalInfo[] additionalInfo;

    public QueryHLRResponseResponseHeader() {
    }

    public QueryHLRResponseResponseHeader(
           String transactionID,
           String MSISDN,
           String IMSI,
           QueryHLRResponseResponseHeaderDetails[] details,
           ae.etisalat.www.Middleware.HLRActions.QueryHLRResponse_xsd.QueryHLRResponseResponseHeaderAdditionalInfo[] additionalInfo) {
           this.transactionID = transactionID;
           this.MSISDN = MSISDN;
           this.IMSI = IMSI;
           this.details = details;
           this.additionalInfo = additionalInfo;
    }


    /**
     * Gets the transactionID value for this QueryHLRResponseResponseHeader.
     * 
     * @return transactionID
     */
    public String getTransactionID() {
        return transactionID;
    }


    /**
     * Sets the transactionID value for this QueryHLRResponseResponseHeader.
     * 
     * @param transactionID
     */
    public void setTransactionID(String transactionID) {
        this.transactionID = transactionID;
    }


    /**
     * Gets the MSISDN value for this QueryHLRResponseResponseHeader.
     * 
     * @return MSISDN
     */
    public String getMSISDN() {
        return MSISDN;
    }


    /**
     * Sets the MSISDN value for this QueryHLRResponseResponseHeader.
     * 
     * @param MSISDN
     */
    public void setMSISDN(String MSISDN) {
        this.MSISDN = MSISDN;
    }


    /**
     * Gets the IMSI value for this QueryHLRResponseResponseHeader.
     * 
     * @return IMSI
     */
    public String getIMSI() {
        return IMSI;
    }


    /**
     * Sets the IMSI value for this QueryHLRResponseResponseHeader.
     * 
     * @param IMSI
     */
    public void setIMSI(String IMSI) {
        this.IMSI = IMSI;
    }


    /**
     * Gets the details value for this QueryHLRResponseResponseHeader.
     * 
     * @return details
     */
    public QueryHLRResponseResponseHeaderDetails[] getDetails() {
        return details;
    }


    /**
     * Sets the details value for this QueryHLRResponseResponseHeader.
     * 
     * @param details
     */
    public void setDetails(QueryHLRResponseResponseHeaderDetails[] details) {
        this.details = details;
    }

    public QueryHLRResponseResponseHeaderDetails getDetails(int i) {
        return this.details[i];
    }

    public void setDetails(int i, QueryHLRResponseResponseHeaderDetails _value) {
        this.details[i] = _value;
    }


    /**
     * Gets the additionalInfo value for this QueryHLRResponseResponseHeader.
     * 
     * @return additionalInfo
     */
    public ae.etisalat.www.Middleware.HLRActions.QueryHLRResponse_xsd.QueryHLRResponseResponseHeaderAdditionalInfo[] getAdditionalInfo() {
        return additionalInfo;
    }


    /**
     * Sets the additionalInfo value for this QueryHLRResponseResponseHeader.
     * 
     * @param additionalInfo
     */
    public void setAdditionalInfo(ae.etisalat.www.Middleware.HLRActions.QueryHLRResponse_xsd.QueryHLRResponseResponseHeaderAdditionalInfo[] additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public ae.etisalat.www.Middleware.HLRActions.QueryHLRResponse_xsd.QueryHLRResponseResponseHeaderAdditionalInfo getAdditionalInfo(int i) {
        return this.additionalInfo[i];
    }

    public void setAdditionalInfo(int i, ae.etisalat.www.Middleware.HLRActions.QueryHLRResponse_xsd.QueryHLRResponseResponseHeaderAdditionalInfo _value) {
        this.additionalInfo[i] = _value;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof QueryHLRResponseResponseHeader)) return false;
        QueryHLRResponseResponseHeader other = (QueryHLRResponseResponseHeader) obj;
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
            ((this.MSISDN==null && other.getMSISDN()==null) || 
             (this.MSISDN!=null &&
              this.MSISDN.equals(other.getMSISDN()))) &&
            ((this.IMSI==null && other.getIMSI()==null) || 
             (this.IMSI!=null &&
              this.IMSI.equals(other.getIMSI()))) &&
            ((this.details==null && other.getDetails()==null) || 
             (this.details!=null &&
              java.util.Arrays.equals(this.details, other.getDetails()))) &&
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
        if (getMSISDN() != null) {
            _hashCode += getMSISDN().hashCode();
        }
        if (getIMSI() != null) {
            _hashCode += getIMSI().hashCode();
        }
        if (getDetails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDetails());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getDetails(), i);
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
        new org.apache.axis.description.TypeDesc(QueryHLRResponseResponseHeader.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/HLRActions/QueryHLRResponse.xsd", ">>QueryHLRResponse>ResponseHeader"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/HLRActions/QueryHLRResponse.xsd", "TransactionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSISDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/HLRActions/QueryHLRResponse.xsd", "MSISDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IMSI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/HLRActions/QueryHLRResponse.xsd", "IMSI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("details");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/HLRActions/QueryHLRResponse.xsd", "Details"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/HLRActions/QueryHLRResponse.xsd", ">>>QueryHLRResponse>ResponseHeader>Details"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/HLRActions/QueryHLRResponse.xsd", "AdditionalInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/HLRActions/QueryHLRResponse.xsd", ">>>QueryHLRResponse>ResponseHeader>AdditionalInfo"));
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
