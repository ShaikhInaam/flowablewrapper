/**
 * UpdateCSProfileRequestDataHeaderUpdateServiceClassChargingRequestInformation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ae.etisalat.www.Middleware.INCommunicationManagement.UpdateCSProfileRequest_xsd;

public class UpdateCSProfileRequestDataHeaderUpdateServiceClassChargingRequestInformation  implements java.io.Serializable {
    private String chargingType;

    private String chargingIndicator;

    private String reservationCorrelationID;

    public UpdateCSProfileRequestDataHeaderUpdateServiceClassChargingRequestInformation() {
    }

    public UpdateCSProfileRequestDataHeaderUpdateServiceClassChargingRequestInformation(
           String chargingType,
           String chargingIndicator,
           String reservationCorrelationID) {
           this.chargingType = chargingType;
           this.chargingIndicator = chargingIndicator;
           this.reservationCorrelationID = reservationCorrelationID;
    }


    /**
     * Gets the chargingType value for this UpdateCSProfileRequestDataHeaderUpdateServiceClassChargingRequestInformation.
     * 
     * @return chargingType
     */
    public String getChargingType() {
        return chargingType;
    }


    /**
     * Sets the chargingType value for this UpdateCSProfileRequestDataHeaderUpdateServiceClassChargingRequestInformation.
     * 
     * @param chargingType
     */
    public void setChargingType(String chargingType) {
        this.chargingType = chargingType;
    }


    /**
     * Gets the chargingIndicator value for this UpdateCSProfileRequestDataHeaderUpdateServiceClassChargingRequestInformation.
     * 
     * @return chargingIndicator
     */
    public String getChargingIndicator() {
        return chargingIndicator;
    }


    /**
     * Sets the chargingIndicator value for this UpdateCSProfileRequestDataHeaderUpdateServiceClassChargingRequestInformation.
     * 
     * @param chargingIndicator
     */
    public void setChargingIndicator(String chargingIndicator) {
        this.chargingIndicator = chargingIndicator;
    }


    /**
     * Gets the reservationCorrelationID value for this UpdateCSProfileRequestDataHeaderUpdateServiceClassChargingRequestInformation.
     * 
     * @return reservationCorrelationID
     */
    public String getReservationCorrelationID() {
        return reservationCorrelationID;
    }


    /**
     * Sets the reservationCorrelationID value for this UpdateCSProfileRequestDataHeaderUpdateServiceClassChargingRequestInformation.
     * 
     * @param reservationCorrelationID
     */
    public void setReservationCorrelationID(String reservationCorrelationID) {
        this.reservationCorrelationID = reservationCorrelationID;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof UpdateCSProfileRequestDataHeaderUpdateServiceClassChargingRequestInformation)) return false;
        UpdateCSProfileRequestDataHeaderUpdateServiceClassChargingRequestInformation other = (UpdateCSProfileRequestDataHeaderUpdateServiceClassChargingRequestInformation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.chargingType==null && other.getChargingType()==null) || 
             (this.chargingType!=null &&
              this.chargingType.equals(other.getChargingType()))) &&
            ((this.chargingIndicator==null && other.getChargingIndicator()==null) || 
             (this.chargingIndicator!=null &&
              this.chargingIndicator.equals(other.getChargingIndicator()))) &&
            ((this.reservationCorrelationID==null && other.getReservationCorrelationID()==null) || 
             (this.reservationCorrelationID!=null &&
              this.reservationCorrelationID.equals(other.getReservationCorrelationID())));
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
        if (getChargingType() != null) {
            _hashCode += getChargingType().hashCode();
        }
        if (getChargingIndicator() != null) {
            _hashCode += getChargingIndicator().hashCode();
        }
        if (getReservationCorrelationID() != null) {
            _hashCode += getReservationCorrelationID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateCSProfileRequestDataHeaderUpdateServiceClassChargingRequestInformation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileRequest.xsd", ">>>>UpdateCSProfileRequest>DataHeader>UpdateServiceClass>ChargingRequestInformation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargingType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileRequest.xsd", "ChargingType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargingIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileRequest.xsd", "ChargingIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reservationCorrelationID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileRequest.xsd", "ReservationCorrelationID"));
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
