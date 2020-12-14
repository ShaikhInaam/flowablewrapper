/**
 * GetAccountDetailsResponseResponseHeaderGetAccumulatorAccumelatorInformation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd;

public class GetAccountDetailsResponseResponseHeaderGetAccumulatorAccumelatorInformation  implements java.io.Serializable {
    private String accumulatorID;

    private String accumulatorValue;

    private String accumulatorStartDate;

    private String accumulatorEndDate;

    private String accumulatorDesc;

    public GetAccountDetailsResponseResponseHeaderGetAccumulatorAccumelatorInformation() {
    }

    public GetAccountDetailsResponseResponseHeaderGetAccumulatorAccumelatorInformation(
           String accumulatorID,
           String accumulatorValue,
           String accumulatorStartDate,
           String accumulatorEndDate,
           String accumulatorDesc) {
           this.accumulatorID = accumulatorID;
           this.accumulatorValue = accumulatorValue;
           this.accumulatorStartDate = accumulatorStartDate;
           this.accumulatorEndDate = accumulatorEndDate;
           this.accumulatorDesc = accumulatorDesc;
    }


    /**
     * Gets the accumulatorID value for this GetAccountDetailsResponseResponseHeaderGetAccumulatorAccumelatorInformation.
     * 
     * @return accumulatorID
     */
    public String getAccumulatorID() {
        return accumulatorID;
    }


    /**
     * Sets the accumulatorID value for this GetAccountDetailsResponseResponseHeaderGetAccumulatorAccumelatorInformation.
     * 
     * @param accumulatorID
     */
    public void setAccumulatorID(String accumulatorID) {
        this.accumulatorID = accumulatorID;
    }


    /**
     * Gets the accumulatorValue value for this GetAccountDetailsResponseResponseHeaderGetAccumulatorAccumelatorInformation.
     * 
     * @return accumulatorValue
     */
    public String getAccumulatorValue() {
        return accumulatorValue;
    }


    /**
     * Sets the accumulatorValue value for this GetAccountDetailsResponseResponseHeaderGetAccumulatorAccumelatorInformation.
     * 
     * @param accumulatorValue
     */
    public void setAccumulatorValue(String accumulatorValue) {
        this.accumulatorValue = accumulatorValue;
    }


    /**
     * Gets the accumulatorStartDate value for this GetAccountDetailsResponseResponseHeaderGetAccumulatorAccumelatorInformation.
     * 
     * @return accumulatorStartDate
     */
    public String getAccumulatorStartDate() {
        return accumulatorStartDate;
    }


    /**
     * Sets the accumulatorStartDate value for this GetAccountDetailsResponseResponseHeaderGetAccumulatorAccumelatorInformation.
     * 
     * @param accumulatorStartDate
     */
    public void setAccumulatorStartDate(String accumulatorStartDate) {
        this.accumulatorStartDate = accumulatorStartDate;
    }


    /**
     * Gets the accumulatorEndDate value for this GetAccountDetailsResponseResponseHeaderGetAccumulatorAccumelatorInformation.
     * 
     * @return accumulatorEndDate
     */
    public String getAccumulatorEndDate() {
        return accumulatorEndDate;
    }


    /**
     * Sets the accumulatorEndDate value for this GetAccountDetailsResponseResponseHeaderGetAccumulatorAccumelatorInformation.
     * 
     * @param accumulatorEndDate
     */
    public void setAccumulatorEndDate(String accumulatorEndDate) {
        this.accumulatorEndDate = accumulatorEndDate;
    }


    /**
     * Gets the accumulatorDesc value for this GetAccountDetailsResponseResponseHeaderGetAccumulatorAccumelatorInformation.
     * 
     * @return accumulatorDesc
     */
    public String getAccumulatorDesc() {
        return accumulatorDesc;
    }


    /**
     * Sets the accumulatorDesc value for this GetAccountDetailsResponseResponseHeaderGetAccumulatorAccumelatorInformation.
     * 
     * @param accumulatorDesc
     */
    public void setAccumulatorDesc(String accumulatorDesc) {
        this.accumulatorDesc = accumulatorDesc;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GetAccountDetailsResponseResponseHeaderGetAccumulatorAccumelatorInformation)) return false;
        GetAccountDetailsResponseResponseHeaderGetAccumulatorAccumelatorInformation other = (GetAccountDetailsResponseResponseHeaderGetAccumulatorAccumelatorInformation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.accumulatorID==null && other.getAccumulatorID()==null) || 
             (this.accumulatorID!=null &&
              this.accumulatorID.equals(other.getAccumulatorID()))) &&
            ((this.accumulatorValue==null && other.getAccumulatorValue()==null) || 
             (this.accumulatorValue!=null &&
              this.accumulatorValue.equals(other.getAccumulatorValue()))) &&
            ((this.accumulatorStartDate==null && other.getAccumulatorStartDate()==null) || 
             (this.accumulatorStartDate!=null &&
              this.accumulatorStartDate.equals(other.getAccumulatorStartDate()))) &&
            ((this.accumulatorEndDate==null && other.getAccumulatorEndDate()==null) || 
             (this.accumulatorEndDate!=null &&
              this.accumulatorEndDate.equals(other.getAccumulatorEndDate()))) &&
            ((this.accumulatorDesc==null && other.getAccumulatorDesc()==null) || 
             (this.accumulatorDesc!=null &&
              this.accumulatorDesc.equals(other.getAccumulatorDesc())));
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
        if (getAccumulatorID() != null) {
            _hashCode += getAccumulatorID().hashCode();
        }
        if (getAccumulatorValue() != null) {
            _hashCode += getAccumulatorValue().hashCode();
        }
        if (getAccumulatorStartDate() != null) {
            _hashCode += getAccumulatorStartDate().hashCode();
        }
        if (getAccumulatorEndDate() != null) {
            _hashCode += getAccumulatorEndDate().hashCode();
        }
        if (getAccumulatorDesc() != null) {
            _hashCode += getAccumulatorDesc().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetAccountDetailsResponseResponseHeaderGetAccumulatorAccumelatorInformation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", ">>>>GetAccountDetailsResponse>ResponseHeader>GetAccumulator>accumelatorInformation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accumulatorID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "accumulatorID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accumulatorValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "accumulatorValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accumulatorStartDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "accumulatorStartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accumulatorEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "accumulatorEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accumulatorDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "accumulatorDesc"));
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
