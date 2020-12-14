/**
 * UpdateComplaintInUCMSRequestDataHeaderElifeAndEVisionWireless.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintDetailsInUCMSRequest_xsd;

public class UpdateComplaintInUCMSRequestDataHeaderElifeAndEVisionWireless  implements java.io.Serializable {
    private String exchangeName;

    private String baseStation;

    public UpdateComplaintInUCMSRequestDataHeaderElifeAndEVisionWireless() {
    }

    public UpdateComplaintInUCMSRequestDataHeaderElifeAndEVisionWireless(
           String exchangeName,
           String baseStation) {
           this.exchangeName = exchangeName;
           this.baseStation = baseStation;
    }


    /**
     * Gets the exchangeName value for this UpdateComplaintInUCMSRequestDataHeaderElifeAndEVisionWireless.
     * 
     * @return exchangeName
     */
    public String getExchangeName() {
        return exchangeName;
    }


    /**
     * Sets the exchangeName value for this UpdateComplaintInUCMSRequestDataHeaderElifeAndEVisionWireless.
     * 
     * @param exchangeName
     */
    public void setExchangeName(String exchangeName) {
        this.exchangeName = exchangeName;
    }


    /**
     * Gets the baseStation value for this UpdateComplaintInUCMSRequestDataHeaderElifeAndEVisionWireless.
     * 
     * @return baseStation
     */
    public String getBaseStation() {
        return baseStation;
    }


    /**
     * Sets the baseStation value for this UpdateComplaintInUCMSRequestDataHeaderElifeAndEVisionWireless.
     * 
     * @param baseStation
     */
    public void setBaseStation(String baseStation) {
        this.baseStation = baseStation;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof UpdateComplaintInUCMSRequestDataHeaderElifeAndEVisionWireless)) return false;
        UpdateComplaintInUCMSRequestDataHeaderElifeAndEVisionWireless other = (UpdateComplaintInUCMSRequestDataHeaderElifeAndEVisionWireless) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.exchangeName==null && other.getExchangeName()==null) || 
             (this.exchangeName!=null &&
              this.exchangeName.equals(other.getExchangeName()))) &&
            ((this.baseStation==null && other.getBaseStation()==null) || 
             (this.baseStation!=null &&
              this.baseStation.equals(other.getBaseStation())));
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
        if (getExchangeName() != null) {
            _hashCode += getExchangeName().hashCode();
        }
        if (getBaseStation() != null) {
            _hashCode += getBaseStation().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateComplaintInUCMSRequestDataHeaderElifeAndEVisionWireless.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", ">>>>UpdateComplaintInUCMSRequest>DataHeader>ElifeAndEVision>Wireless"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exchangeName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "ExchangeName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("baseStation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "BaseStation"));
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
