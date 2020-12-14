/**
 * SubmitVoucherActionResponseResponseHeader.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ae.etisalat.www.Middleware.INCommunicationManagement.SubmitVoucherActionResponse_xsd;

public class SubmitVoucherActionResponseResponseHeader  implements java.io.Serializable {
    private String transactionID;

    private ae.etisalat.www.Middleware.INCommunicationManagement.SubmitVoucherActionResponse_xsd.SubmitVoucherActionResponseResponseHeaderVoucherDetails voucherDetails;

    private ae.etisalat.www.Middleware.INCommunicationManagement.SubmitVoucherActionResponse_xsd.SubmitVoucherActionResponseResponseHeaderAdditionalInfo[] additionalInfo;

    public SubmitVoucherActionResponseResponseHeader() {
    }

    public SubmitVoucherActionResponseResponseHeader(
           String transactionID,
           ae.etisalat.www.Middleware.INCommunicationManagement.SubmitVoucherActionResponse_xsd.SubmitVoucherActionResponseResponseHeaderVoucherDetails voucherDetails,
           ae.etisalat.www.Middleware.INCommunicationManagement.SubmitVoucherActionResponse_xsd.SubmitVoucherActionResponseResponseHeaderAdditionalInfo[] additionalInfo) {
           this.transactionID = transactionID;
           this.voucherDetails = voucherDetails;
           this.additionalInfo = additionalInfo;
    }


    /**
     * Gets the transactionID value for this SubmitVoucherActionResponseResponseHeader.
     * 
     * @return transactionID
     */
    public String getTransactionID() {
        return transactionID;
    }


    /**
     * Sets the transactionID value for this SubmitVoucherActionResponseResponseHeader.
     * 
     * @param transactionID
     */
    public void setTransactionID(String transactionID) {
        this.transactionID = transactionID;
    }


    /**
     * Gets the voucherDetails value for this SubmitVoucherActionResponseResponseHeader.
     * 
     * @return voucherDetails
     */
    public ae.etisalat.www.Middleware.INCommunicationManagement.SubmitVoucherActionResponse_xsd.SubmitVoucherActionResponseResponseHeaderVoucherDetails getVoucherDetails() {
        return voucherDetails;
    }


    /**
     * Sets the voucherDetails value for this SubmitVoucherActionResponseResponseHeader.
     * 
     * @param voucherDetails
     */
    public void setVoucherDetails(ae.etisalat.www.Middleware.INCommunicationManagement.SubmitVoucherActionResponse_xsd.SubmitVoucherActionResponseResponseHeaderVoucherDetails voucherDetails) {
        this.voucherDetails = voucherDetails;
    }


    /**
     * Gets the additionalInfo value for this SubmitVoucherActionResponseResponseHeader.
     * 
     * @return additionalInfo
     */
    public ae.etisalat.www.Middleware.INCommunicationManagement.SubmitVoucherActionResponse_xsd.SubmitVoucherActionResponseResponseHeaderAdditionalInfo[] getAdditionalInfo() {
        return additionalInfo;
    }


    /**
     * Sets the additionalInfo value for this SubmitVoucherActionResponseResponseHeader.
     * 
     * @param additionalInfo
     */
    public void setAdditionalInfo(ae.etisalat.www.Middleware.INCommunicationManagement.SubmitVoucherActionResponse_xsd.SubmitVoucherActionResponseResponseHeaderAdditionalInfo[] additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public ae.etisalat.www.Middleware.INCommunicationManagement.SubmitVoucherActionResponse_xsd.SubmitVoucherActionResponseResponseHeaderAdditionalInfo getAdditionalInfo(int i) {
        return this.additionalInfo[i];
    }

    public void setAdditionalInfo(int i, ae.etisalat.www.Middleware.INCommunicationManagement.SubmitVoucherActionResponse_xsd.SubmitVoucherActionResponseResponseHeaderAdditionalInfo _value) {
        this.additionalInfo[i] = _value;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof SubmitVoucherActionResponseResponseHeader)) return false;
        SubmitVoucherActionResponseResponseHeader other = (SubmitVoucherActionResponseResponseHeader) obj;
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
            ((this.voucherDetails==null && other.getVoucherDetails()==null) || 
             (this.voucherDetails!=null &&
              this.voucherDetails.equals(other.getVoucherDetails()))) &&
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
        if (getVoucherDetails() != null) {
            _hashCode += getVoucherDetails().hashCode();
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
        new org.apache.axis.description.TypeDesc(SubmitVoucherActionResponseResponseHeader.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/SubmitVoucherActionResponse.xsd", ">>SubmitVoucherActionResponse>ResponseHeader"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/SubmitVoucherActionResponse.xsd", "TransactionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("voucherDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/SubmitVoucherActionResponse.xsd", "VoucherDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/SubmitVoucherActionResponse.xsd", ">>>SubmitVoucherActionResponse>ResponseHeader>VoucherDetails"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/SubmitVoucherActionResponse.xsd", "AdditionalInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/SubmitVoucherActionResponse.xsd", ">>>SubmitVoucherActionResponse>ResponseHeader>AdditionalInfo"));
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
