/**
 * GetAccountDetailsResponseResponseHeaderBalanceAndDateDedicatedAccountInformationSubDedicatedAccountInformation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd;

public class GetAccountDetailsResponseResponseHeaderBalanceAndDateDedicatedAccountInformationSubDedicatedAccountInformation  implements java.io.Serializable {
    private String dedicatedAccountValue1;

    private String dedicatedAccountValue2;

    private String startDate;

    private String expiryDate;

    public GetAccountDetailsResponseResponseHeaderBalanceAndDateDedicatedAccountInformationSubDedicatedAccountInformation() {
    }

    public GetAccountDetailsResponseResponseHeaderBalanceAndDateDedicatedAccountInformationSubDedicatedAccountInformation(
           String dedicatedAccountValue1,
           String dedicatedAccountValue2,
           String startDate,
           String expiryDate) {
           this.dedicatedAccountValue1 = dedicatedAccountValue1;
           this.dedicatedAccountValue2 = dedicatedAccountValue2;
           this.startDate = startDate;
           this.expiryDate = expiryDate;
    }


    /**
     * Gets the dedicatedAccountValue1 value for this GetAccountDetailsResponseResponseHeaderBalanceAndDateDedicatedAccountInformationSubDedicatedAccountInformation.
     * 
     * @return dedicatedAccountValue1
     */
    public String getDedicatedAccountValue1() {
        return dedicatedAccountValue1;
    }


    /**
     * Sets the dedicatedAccountValue1 value for this GetAccountDetailsResponseResponseHeaderBalanceAndDateDedicatedAccountInformationSubDedicatedAccountInformation.
     * 
     * @param dedicatedAccountValue1
     */
    public void setDedicatedAccountValue1(String dedicatedAccountValue1) {
        this.dedicatedAccountValue1 = dedicatedAccountValue1;
    }


    /**
     * Gets the dedicatedAccountValue2 value for this GetAccountDetailsResponseResponseHeaderBalanceAndDateDedicatedAccountInformationSubDedicatedAccountInformation.
     * 
     * @return dedicatedAccountValue2
     */
    public String getDedicatedAccountValue2() {
        return dedicatedAccountValue2;
    }


    /**
     * Sets the dedicatedAccountValue2 value for this GetAccountDetailsResponseResponseHeaderBalanceAndDateDedicatedAccountInformationSubDedicatedAccountInformation.
     * 
     * @param dedicatedAccountValue2
     */
    public void setDedicatedAccountValue2(String dedicatedAccountValue2) {
        this.dedicatedAccountValue2 = dedicatedAccountValue2;
    }


    /**
     * Gets the startDate value for this GetAccountDetailsResponseResponseHeaderBalanceAndDateDedicatedAccountInformationSubDedicatedAccountInformation.
     * 
     * @return startDate
     */
    public String getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this GetAccountDetailsResponseResponseHeaderBalanceAndDateDedicatedAccountInformationSubDedicatedAccountInformation.
     * 
     * @param startDate
     */
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the expiryDate value for this GetAccountDetailsResponseResponseHeaderBalanceAndDateDedicatedAccountInformationSubDedicatedAccountInformation.
     * 
     * @return expiryDate
     */
    public String getExpiryDate() {
        return expiryDate;
    }


    /**
     * Sets the expiryDate value for this GetAccountDetailsResponseResponseHeaderBalanceAndDateDedicatedAccountInformationSubDedicatedAccountInformation.
     * 
     * @param expiryDate
     */
    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GetAccountDetailsResponseResponseHeaderBalanceAndDateDedicatedAccountInformationSubDedicatedAccountInformation)) return false;
        GetAccountDetailsResponseResponseHeaderBalanceAndDateDedicatedAccountInformationSubDedicatedAccountInformation other = (GetAccountDetailsResponseResponseHeaderBalanceAndDateDedicatedAccountInformationSubDedicatedAccountInformation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dedicatedAccountValue1==null && other.getDedicatedAccountValue1()==null) || 
             (this.dedicatedAccountValue1!=null &&
              this.dedicatedAccountValue1.equals(other.getDedicatedAccountValue1()))) &&
            ((this.dedicatedAccountValue2==null && other.getDedicatedAccountValue2()==null) || 
             (this.dedicatedAccountValue2!=null &&
              this.dedicatedAccountValue2.equals(other.getDedicatedAccountValue2()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.expiryDate==null && other.getExpiryDate()==null) || 
             (this.expiryDate!=null &&
              this.expiryDate.equals(other.getExpiryDate())));
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
        if (getDedicatedAccountValue1() != null) {
            _hashCode += getDedicatedAccountValue1().hashCode();
        }
        if (getDedicatedAccountValue2() != null) {
            _hashCode += getDedicatedAccountValue2().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getExpiryDate() != null) {
            _hashCode += getExpiryDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetAccountDetailsResponseResponseHeaderBalanceAndDateDedicatedAccountInformationSubDedicatedAccountInformation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", ">>>>>GetAccountDetailsResponse>ResponseHeader>BalanceAndDate>dedicatedAccountInformation>subDedicatedAccountInformation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dedicatedAccountValue1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "dedicatedAccountValue1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dedicatedAccountValue2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "dedicatedAccountValue2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expiryDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "expiryDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
