/**
 * UpdateCSProfileResponseResponseHeaderUpdateServiceClassChargingResultInformationChargingResultInformationService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ae.etisalat.www.Middleware.INCommunicationManagement.UpdateCSProfileResponset_xsd;

public class UpdateCSProfileResponseResponseHeaderUpdateServiceClassChargingResultInformationChargingResultInformationService  implements java.io.Serializable {
    private String cost1;

    private String cost2;

    public UpdateCSProfileResponseResponseHeaderUpdateServiceClassChargingResultInformationChargingResultInformationService() {
    }

    public UpdateCSProfileResponseResponseHeaderUpdateServiceClassChargingResultInformationChargingResultInformationService(
           String cost1,
           String cost2) {
           this.cost1 = cost1;
           this.cost2 = cost2;
    }


    /**
     * Gets the cost1 value for this UpdateCSProfileResponseResponseHeaderUpdateServiceClassChargingResultInformationChargingResultInformationService.
     * 
     * @return cost1
     */
    public String getCost1() {
        return cost1;
    }


    /**
     * Sets the cost1 value for this UpdateCSProfileResponseResponseHeaderUpdateServiceClassChargingResultInformationChargingResultInformationService.
     * 
     * @param cost1
     */
    public void setCost1(String cost1) {
        this.cost1 = cost1;
    }


    /**
     * Gets the cost2 value for this UpdateCSProfileResponseResponseHeaderUpdateServiceClassChargingResultInformationChargingResultInformationService.
     * 
     * @return cost2
     */
    public String getCost2() {
        return cost2;
    }


    /**
     * Sets the cost2 value for this UpdateCSProfileResponseResponseHeaderUpdateServiceClassChargingResultInformationChargingResultInformationService.
     * 
     * @param cost2
     */
    public void setCost2(String cost2) {
        this.cost2 = cost2;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof UpdateCSProfileResponseResponseHeaderUpdateServiceClassChargingResultInformationChargingResultInformationService)) return false;
        UpdateCSProfileResponseResponseHeaderUpdateServiceClassChargingResultInformationChargingResultInformationService other = (UpdateCSProfileResponseResponseHeaderUpdateServiceClassChargingResultInformationChargingResultInformationService) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cost1==null && other.getCost1()==null) || 
             (this.cost1!=null &&
              this.cost1.equals(other.getCost1()))) &&
            ((this.cost2==null && other.getCost2()==null) || 
             (this.cost2!=null &&
              this.cost2.equals(other.getCost2())));
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
        if (getCost1() != null) {
            _hashCode += getCost1().hashCode();
        }
        if (getCost2() != null) {
            _hashCode += getCost2().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateCSProfileResponseResponseHeaderUpdateServiceClassChargingResultInformationChargingResultInformationService.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileResponset.xsd", ">>>>>UpdateCSProfileResponse>ResponseHeader>UpdateServiceClass>ChargingResultInformation>ChargingResultInformationService"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cost1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileResponset.xsd", "Cost1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cost2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileResponset.xsd", "Cost2"));
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
