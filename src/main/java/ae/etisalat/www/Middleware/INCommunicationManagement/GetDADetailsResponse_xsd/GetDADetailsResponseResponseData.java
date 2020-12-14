/**
 * GetDADetailsResponseResponseData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ae.etisalat.www.Middleware.INCommunicationManagement.GetDADetailsResponse_xsd;

public class GetDADetailsResponseResponseData  implements java.io.Serializable {
    private String transactionID;

    private GetDADetailsResponseResponseDataDADetails[] DADetails;

    private GetDADetailsResponseResponseDataAdditionalInfo[] additionalInfo;

    public GetDADetailsResponseResponseData() {
    }

    public GetDADetailsResponseResponseData(
           String transactionID,
           GetDADetailsResponseResponseDataDADetails[] DADetails,
           GetDADetailsResponseResponseDataAdditionalInfo[] additionalInfo) {
           this.transactionID = transactionID;
           this.DADetails = DADetails;
           this.additionalInfo = additionalInfo;
    }


    /**
     * Gets the transactionID value for this GetDADetailsResponseResponseData.
     * 
     * @return transactionID
     */
    public String getTransactionID() {
        return transactionID;
    }


    /**
     * Sets the transactionID value for this GetDADetailsResponseResponseData.
     * 
     * @param transactionID
     */
    public void setTransactionID(String transactionID) {
        this.transactionID = transactionID;
    }


    /**
     * Gets the DADetails value for this GetDADetailsResponseResponseData.
     * 
     * @return DADetails
     */
    public GetDADetailsResponseResponseDataDADetails[] getDADetails() {
        return DADetails;
    }


    /**
     * Sets the DADetails value for this GetDADetailsResponseResponseData.
     * 
     * @param DADetails
     */
    public void setDADetails(GetDADetailsResponseResponseDataDADetails[] DADetails) {
        this.DADetails = DADetails;
    }

    public GetDADetailsResponseResponseDataDADetails getDADetails(int i) {
        return this.DADetails[i];
    }

    public void setDADetails(int i, GetDADetailsResponseResponseDataDADetails _value) {
        this.DADetails[i] = _value;
    }


    /**
     * Gets the additionalInfo value for this GetDADetailsResponseResponseData.
     * 
     * @return additionalInfo
     */
    public GetDADetailsResponseResponseDataAdditionalInfo[] getAdditionalInfo() {
        return additionalInfo;
    }


    /**
     * Sets the additionalInfo value for this GetDADetailsResponseResponseData.
     * 
     * @param additionalInfo
     */
    public void setAdditionalInfo(GetDADetailsResponseResponseDataAdditionalInfo[] additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public GetDADetailsResponseResponseDataAdditionalInfo getAdditionalInfo(int i) {
        return this.additionalInfo[i];
    }

    public void setAdditionalInfo(int i, GetDADetailsResponseResponseDataAdditionalInfo _value) {
        this.additionalInfo[i] = _value;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GetDADetailsResponseResponseData)) return false;
        GetDADetailsResponseResponseData other = (GetDADetailsResponseResponseData) obj;
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
            ((this.DADetails==null && other.getDADetails()==null) || 
             (this.DADetails!=null &&
              java.util.Arrays.equals(this.DADetails, other.getDADetails()))) &&
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
        if (getDADetails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDADetails());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getDADetails(), i);
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
        new org.apache.axis.description.TypeDesc(GetDADetailsResponseResponseData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetDADetailsResponse.xsd", ">>GetDADetailsResponse>ResponseData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetDADetailsResponse.xsd", "TransactionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DADetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetDADetailsResponse.xsd", "DADetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetDADetailsResponse.xsd", ">>>GetDADetailsResponse>ResponseData>DADetails"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetDADetailsResponse.xsd", "AdditionalInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetDADetailsResponse.xsd", ">>>GetDADetailsResponse>ResponseData>AdditionalInfo"));
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
