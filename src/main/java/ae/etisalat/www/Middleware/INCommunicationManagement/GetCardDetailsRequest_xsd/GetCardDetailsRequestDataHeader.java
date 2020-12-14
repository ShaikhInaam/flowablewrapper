/**
 * GetCardDetailsRequestDataHeader.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ae.etisalat.www.Middleware.INCommunicationManagement.GetCardDetailsRequest_xsd;

public class GetCardDetailsRequestDataHeader  implements java.io.Serializable {
    private String serialNumber;

    private String accountNumber;

    private String action;

    private String cardType;

    private ae.etisalat.www.Middleware.INCommunicationManagement.GetCardDetailsRequest_xsd.GetCardDetailsRequestDataHeaderAddtionalInfo[] addtionalInfo;

    public GetCardDetailsRequestDataHeader() {
    }

    public GetCardDetailsRequestDataHeader(
           String serialNumber,
           String accountNumber,
           String action,
           String cardType,
           ae.etisalat.www.Middleware.INCommunicationManagement.GetCardDetailsRequest_xsd.GetCardDetailsRequestDataHeaderAddtionalInfo[] addtionalInfo) {
           this.serialNumber = serialNumber;
           this.accountNumber = accountNumber;
           this.action = action;
           this.cardType = cardType;
           this.addtionalInfo = addtionalInfo;
    }


    /**
     * Gets the serialNumber value for this GetCardDetailsRequestDataHeader.
     * 
     * @return serialNumber
     */
    public String getSerialNumber() {
        return serialNumber;
    }


    /**
     * Sets the serialNumber value for this GetCardDetailsRequestDataHeader.
     * 
     * @param serialNumber
     */
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }


    /**
     * Gets the accountNumber value for this GetCardDetailsRequestDataHeader.
     * 
     * @return accountNumber
     */
    public String getAccountNumber() {
        return accountNumber;
    }


    /**
     * Sets the accountNumber value for this GetCardDetailsRequestDataHeader.
     * 
     * @param accountNumber
     */
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }


    /**
     * Gets the action value for this GetCardDetailsRequestDataHeader.
     * 
     * @return action
     */
    public String getAction() {
        return action;
    }


    /**
     * Sets the action value for this GetCardDetailsRequestDataHeader.
     * 
     * @param action
     */
    public void setAction(String action) {
        this.action = action;
    }


    /**
     * Gets the cardType value for this GetCardDetailsRequestDataHeader.
     * 
     * @return cardType
     */
    public String getCardType() {
        return cardType;
    }


    /**
     * Sets the cardType value for this GetCardDetailsRequestDataHeader.
     * 
     * @param cardType
     */
    public void setCardType(String cardType) {
        this.cardType = cardType;
    }


    /**
     * Gets the addtionalInfo value for this GetCardDetailsRequestDataHeader.
     * 
     * @return addtionalInfo
     */
    public ae.etisalat.www.Middleware.INCommunicationManagement.GetCardDetailsRequest_xsd.GetCardDetailsRequestDataHeaderAddtionalInfo[] getAddtionalInfo() {
        return addtionalInfo;
    }


    /**
     * Sets the addtionalInfo value for this GetCardDetailsRequestDataHeader.
     * 
     * @param addtionalInfo
     */
    public void setAddtionalInfo(ae.etisalat.www.Middleware.INCommunicationManagement.GetCardDetailsRequest_xsd.GetCardDetailsRequestDataHeaderAddtionalInfo[] addtionalInfo) {
        this.addtionalInfo = addtionalInfo;
    }

    public ae.etisalat.www.Middleware.INCommunicationManagement.GetCardDetailsRequest_xsd.GetCardDetailsRequestDataHeaderAddtionalInfo getAddtionalInfo(int i) {
        return this.addtionalInfo[i];
    }

    public void setAddtionalInfo(int i, ae.etisalat.www.Middleware.INCommunicationManagement.GetCardDetailsRequest_xsd.GetCardDetailsRequestDataHeaderAddtionalInfo _value) {
        this.addtionalInfo[i] = _value;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GetCardDetailsRequestDataHeader)) return false;
        GetCardDetailsRequestDataHeader other = (GetCardDetailsRequestDataHeader) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.serialNumber==null && other.getSerialNumber()==null) || 
             (this.serialNumber!=null &&
              this.serialNumber.equals(other.getSerialNumber()))) &&
            ((this.accountNumber==null && other.getAccountNumber()==null) || 
             (this.accountNumber!=null &&
              this.accountNumber.equals(other.getAccountNumber()))) &&
            ((this.action==null && other.getAction()==null) || 
             (this.action!=null &&
              this.action.equals(other.getAction()))) &&
            ((this.cardType==null && other.getCardType()==null) || 
             (this.cardType!=null &&
              this.cardType.equals(other.getCardType()))) &&
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
        if (getSerialNumber() != null) {
            _hashCode += getSerialNumber().hashCode();
        }
        if (getAccountNumber() != null) {
            _hashCode += getAccountNumber().hashCode();
        }
        if (getAction() != null) {
            _hashCode += getAction().hashCode();
        }
        if (getCardType() != null) {
            _hashCode += getCardType().hashCode();
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
        new org.apache.axis.description.TypeDesc(GetCardDetailsRequestDataHeader.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetCardDetailsRequest.xsd", ">>GetCardDetailsRequest>DataHeader"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serialNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetCardDetailsRequest.xsd", "SerialNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetCardDetailsRequest.xsd", "AccountNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("action");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetCardDetailsRequest.xsd", "Action"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetCardDetailsRequest.xsd", "CardType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addtionalInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetCardDetailsRequest.xsd", "AddtionalInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetCardDetailsRequest.xsd", ">>>GetCardDetailsRequest>DataHeader>AddtionalInfo"));
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
