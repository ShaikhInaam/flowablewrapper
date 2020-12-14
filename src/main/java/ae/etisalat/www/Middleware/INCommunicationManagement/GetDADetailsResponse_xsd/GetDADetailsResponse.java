/**
 * GetDADetailsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ae.etisalat.www.Middleware.INCommunicationManagement.GetDADetailsResponse_xsd;

public class GetDADetailsResponse  implements java.io.Serializable {
    private ae.etisalat.www.Middleware.INCommunicationManagement.GetDADetailsResponse_xsd.GetDADetailsResponseResponseData responseData;

    private ae.etisalat.www.Middleware.SharedResources.Common.AckMessage_xsd.AckMessage ackMessage;

    public GetDADetailsResponse() {
    }

    public GetDADetailsResponse(
           ae.etisalat.www.Middleware.INCommunicationManagement.GetDADetailsResponse_xsd.GetDADetailsResponseResponseData responseData,
           ae.etisalat.www.Middleware.SharedResources.Common.AckMessage_xsd.AckMessage ackMessage) {
           this.responseData = responseData;
           this.ackMessage = ackMessage;
    }


    /**
     * Gets the responseData value for this GetDADetailsResponse.
     * 
     * @return responseData
     */
    public ae.etisalat.www.Middleware.INCommunicationManagement.GetDADetailsResponse_xsd.GetDADetailsResponseResponseData getResponseData() {
        return responseData;
    }


    /**
     * Sets the responseData value for this GetDADetailsResponse.
     * 
     * @param responseData
     */
    public void setResponseData(ae.etisalat.www.Middleware.INCommunicationManagement.GetDADetailsResponse_xsd.GetDADetailsResponseResponseData responseData) {
        this.responseData = responseData;
    }


    /**
     * Gets the ackMessage value for this GetDADetailsResponse.
     * 
     * @return ackMessage
     */
    public ae.etisalat.www.Middleware.SharedResources.Common.AckMessage_xsd.AckMessage getAckMessage() {
        return ackMessage;
    }


    /**
     * Sets the ackMessage value for this GetDADetailsResponse.
     * 
     * @param ackMessage
     */
    public void setAckMessage(ae.etisalat.www.Middleware.SharedResources.Common.AckMessage_xsd.AckMessage ackMessage) {
        this.ackMessage = ackMessage;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GetDADetailsResponse)) return false;
        GetDADetailsResponse other = (GetDADetailsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.responseData==null && other.getResponseData()==null) || 
             (this.responseData!=null &&
              this.responseData.equals(other.getResponseData()))) &&
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
        if (getResponseData() != null) {
            _hashCode += getResponseData().hashCode();
        }
        if (getAckMessage() != null) {
            _hashCode += getAckMessage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetDADetailsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetDADetailsResponse.xsd", ">GetDADetailsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetDADetailsResponse.xsd", "ResponseData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetDADetailsResponse.xsd", ">>GetDADetailsResponse>ResponseData"));
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
