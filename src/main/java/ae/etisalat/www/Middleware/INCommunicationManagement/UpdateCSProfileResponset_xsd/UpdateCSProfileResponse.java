/**
 * UpdateCSProfileResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ae.etisalat.www.Middleware.INCommunicationManagement.UpdateCSProfileResponset_xsd;

public class UpdateCSProfileResponse  implements java.io.Serializable {
    private ae.etisalat.www.Middleware.INCommunicationManagement.UpdateCSProfileResponset_xsd.UpdateCSProfileResponseResponseHeader responseHeader;

    private ae.etisalat.www.Middleware.SharedResources.Common.AckMessage_xsd.AckMessage ackMessage;

    public UpdateCSProfileResponse() {
    }

    public UpdateCSProfileResponse(
           ae.etisalat.www.Middleware.INCommunicationManagement.UpdateCSProfileResponset_xsd.UpdateCSProfileResponseResponseHeader responseHeader,
           ae.etisalat.www.Middleware.SharedResources.Common.AckMessage_xsd.AckMessage ackMessage) {
           this.responseHeader = responseHeader;
           this.ackMessage = ackMessage;
    }


    /**
     * Gets the responseHeader value for this UpdateCSProfileResponse.
     * 
     * @return responseHeader
     */
    public ae.etisalat.www.Middleware.INCommunicationManagement.UpdateCSProfileResponset_xsd.UpdateCSProfileResponseResponseHeader getResponseHeader() {
        return responseHeader;
    }


    /**
     * Sets the responseHeader value for this UpdateCSProfileResponse.
     * 
     * @param responseHeader
     */
    public void setResponseHeader(ae.etisalat.www.Middleware.INCommunicationManagement.UpdateCSProfileResponset_xsd.UpdateCSProfileResponseResponseHeader responseHeader) {
        this.responseHeader = responseHeader;
    }


    /**
     * Gets the ackMessage value for this UpdateCSProfileResponse.
     * 
     * @return ackMessage
     */
    public ae.etisalat.www.Middleware.SharedResources.Common.AckMessage_xsd.AckMessage getAckMessage() {
        return ackMessage;
    }


    /**
     * Sets the ackMessage value for this UpdateCSProfileResponse.
     * 
     * @param ackMessage
     */
    public void setAckMessage(ae.etisalat.www.Middleware.SharedResources.Common.AckMessage_xsd.AckMessage ackMessage) {
        this.ackMessage = ackMessage;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof UpdateCSProfileResponse)) return false;
        UpdateCSProfileResponse other = (UpdateCSProfileResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.responseHeader==null && other.getResponseHeader()==null) || 
             (this.responseHeader!=null &&
              this.responseHeader.equals(other.getResponseHeader()))) &&
            ((this.ackMessage==null && other.getAckMessage()==null) || 
             (this.ackMessage!=null &&
              this.ackMessage.equals(other.getAckMessage())));
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
        if (getResponseHeader() != null) {
            _hashCode += getResponseHeader().hashCode();
        }
        if (getAckMessage() != null) {
            _hashCode += getAckMessage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateCSProfileResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileResponset.xsd", ">UpdateCSProfileResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileResponset.xsd", "ResponseHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileResponset.xsd", ">>UpdateCSProfileResponse>ResponseHeader"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ackMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/SharedResources/Common/AckMessage.xsd", "AckMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/SharedResources/Common/AckMessage.xsd", ">AckMessage"));
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
