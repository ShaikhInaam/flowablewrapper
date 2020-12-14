/**
 * UpdateComplaintInUCMSRequestDataHeaderElifeAndEVision.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintDetailsInUCMSRequest_xsd;

public class UpdateComplaintInUCMSRequestDataHeaderElifeAndEVision  implements java.io.Serializable {
    private ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintDetailsInUCMSRequest_xsd.UpdateComplaintInUCMSRequestDataHeaderElifeAndEVisionSTBDetails[] STBDetails;

    private ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintDetailsInUCMSRequest_xsd.UpdateComplaintInUCMSRequestDataHeaderElifeAndEVisionWireless[] wireless;

    public UpdateComplaintInUCMSRequestDataHeaderElifeAndEVision() {
    }

    public UpdateComplaintInUCMSRequestDataHeaderElifeAndEVision(
           ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintDetailsInUCMSRequest_xsd.UpdateComplaintInUCMSRequestDataHeaderElifeAndEVisionSTBDetails[] STBDetails,
           ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintDetailsInUCMSRequest_xsd.UpdateComplaintInUCMSRequestDataHeaderElifeAndEVisionWireless[] wireless) {
           this.STBDetails = STBDetails;
           this.wireless = wireless;
    }


    /**
     * Gets the STBDetails value for this UpdateComplaintInUCMSRequestDataHeaderElifeAndEVision.
     * 
     * @return STBDetails
     */
    public ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintDetailsInUCMSRequest_xsd.UpdateComplaintInUCMSRequestDataHeaderElifeAndEVisionSTBDetails[] getSTBDetails() {
        return STBDetails;
    }


    /**
     * Sets the STBDetails value for this UpdateComplaintInUCMSRequestDataHeaderElifeAndEVision.
     * 
     * @param STBDetails
     */
    public void setSTBDetails(ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintDetailsInUCMSRequest_xsd.UpdateComplaintInUCMSRequestDataHeaderElifeAndEVisionSTBDetails[] STBDetails) {
        this.STBDetails = STBDetails;
    }

    public ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintDetailsInUCMSRequest_xsd.UpdateComplaintInUCMSRequestDataHeaderElifeAndEVisionSTBDetails getSTBDetails(int i) {
        return this.STBDetails[i];
    }

    public void setSTBDetails(int i, ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintDetailsInUCMSRequest_xsd.UpdateComplaintInUCMSRequestDataHeaderElifeAndEVisionSTBDetails _value) {
        this.STBDetails[i] = _value;
    }


    /**
     * Gets the wireless value for this UpdateComplaintInUCMSRequestDataHeaderElifeAndEVision.
     * 
     * @return wireless
     */
    public ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintDetailsInUCMSRequest_xsd.UpdateComplaintInUCMSRequestDataHeaderElifeAndEVisionWireless[] getWireless() {
        return wireless;
    }


    /**
     * Sets the wireless value for this UpdateComplaintInUCMSRequestDataHeaderElifeAndEVision.
     * 
     * @param wireless
     */
    public void setWireless(ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintDetailsInUCMSRequest_xsd.UpdateComplaintInUCMSRequestDataHeaderElifeAndEVisionWireless[] wireless) {
        this.wireless = wireless;
    }

    public ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintDetailsInUCMSRequest_xsd.UpdateComplaintInUCMSRequestDataHeaderElifeAndEVisionWireless getWireless(int i) {
        return this.wireless[i];
    }

    public void setWireless(int i, ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintDetailsInUCMSRequest_xsd.UpdateComplaintInUCMSRequestDataHeaderElifeAndEVisionWireless _value) {
        this.wireless[i] = _value;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof UpdateComplaintInUCMSRequestDataHeaderElifeAndEVision)) return false;
        UpdateComplaintInUCMSRequestDataHeaderElifeAndEVision other = (UpdateComplaintInUCMSRequestDataHeaderElifeAndEVision) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.STBDetails==null && other.getSTBDetails()==null) || 
             (this.STBDetails!=null &&
              java.util.Arrays.equals(this.STBDetails, other.getSTBDetails()))) &&
            ((this.wireless==null && other.getWireless()==null) || 
             (this.wireless!=null &&
              java.util.Arrays.equals(this.wireless, other.getWireless())));
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
        if (getSTBDetails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSTBDetails());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getSTBDetails(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWireless() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWireless());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getWireless(), i);
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
        new org.apache.axis.description.TypeDesc(UpdateComplaintInUCMSRequestDataHeaderElifeAndEVision.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", ">>>UpdateComplaintInUCMSRequest>DataHeader>ElifeAndEVision"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("STBDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "STBDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", ">>>>UpdateComplaintInUCMSRequest>DataHeader>ElifeAndEVision>STBDetails"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wireless");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "Wireless"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", ">>>>UpdateComplaintInUCMSRequest>DataHeader>ElifeAndEVision>Wireless"));
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
