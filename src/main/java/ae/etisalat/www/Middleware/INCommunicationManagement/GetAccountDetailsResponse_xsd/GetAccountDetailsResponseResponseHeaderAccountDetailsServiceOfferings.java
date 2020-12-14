/**
 * GetAccountDetailsResponseResponseHeaderAccountDetailsServiceOfferings.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd;

public class GetAccountDetailsResponseResponseHeaderAccountDetailsServiceOfferings  implements java.io.Serializable {
    private String serviceOfferingID;

    private String serviceOfferingActiveFlag;

    public GetAccountDetailsResponseResponseHeaderAccountDetailsServiceOfferings() {
    }

    public GetAccountDetailsResponseResponseHeaderAccountDetailsServiceOfferings(
           String serviceOfferingID,
           String serviceOfferingActiveFlag) {
           this.serviceOfferingID = serviceOfferingID;
           this.serviceOfferingActiveFlag = serviceOfferingActiveFlag;
    }


    /**
     * Gets the serviceOfferingID value for this GetAccountDetailsResponseResponseHeaderAccountDetailsServiceOfferings.
     * 
     * @return serviceOfferingID
     */
    public String getServiceOfferingID() {
        return serviceOfferingID;
    }


    /**
     * Sets the serviceOfferingID value for this GetAccountDetailsResponseResponseHeaderAccountDetailsServiceOfferings.
     * 
     * @param serviceOfferingID
     */
    public void setServiceOfferingID(String serviceOfferingID) {
        this.serviceOfferingID = serviceOfferingID;
    }


    /**
     * Gets the serviceOfferingActiveFlag value for this GetAccountDetailsResponseResponseHeaderAccountDetailsServiceOfferings.
     * 
     * @return serviceOfferingActiveFlag
     */
    public String getServiceOfferingActiveFlag() {
        return serviceOfferingActiveFlag;
    }


    /**
     * Sets the serviceOfferingActiveFlag value for this GetAccountDetailsResponseResponseHeaderAccountDetailsServiceOfferings.
     * 
     * @param serviceOfferingActiveFlag
     */
    public void setServiceOfferingActiveFlag(String serviceOfferingActiveFlag) {
        this.serviceOfferingActiveFlag = serviceOfferingActiveFlag;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GetAccountDetailsResponseResponseHeaderAccountDetailsServiceOfferings)) return false;
        GetAccountDetailsResponseResponseHeaderAccountDetailsServiceOfferings other = (GetAccountDetailsResponseResponseHeaderAccountDetailsServiceOfferings) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.serviceOfferingID==null && other.getServiceOfferingID()==null) || 
             (this.serviceOfferingID!=null &&
              this.serviceOfferingID.equals(other.getServiceOfferingID()))) &&
            ((this.serviceOfferingActiveFlag==null && other.getServiceOfferingActiveFlag()==null) || 
             (this.serviceOfferingActiveFlag!=null &&
              this.serviceOfferingActiveFlag.equals(other.getServiceOfferingActiveFlag())));
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
        if (getServiceOfferingID() != null) {
            _hashCode += getServiceOfferingID().hashCode();
        }
        if (getServiceOfferingActiveFlag() != null) {
            _hashCode += getServiceOfferingActiveFlag().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetAccountDetailsResponseResponseHeaderAccountDetailsServiceOfferings.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", ">>>>GetAccountDetailsResponse>ResponseHeader>AccountDetails>serviceOfferings"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceOfferingID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "serviceOfferingID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceOfferingActiveFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "serviceOfferingActiveFlag"));
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
