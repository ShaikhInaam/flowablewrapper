/**
 * GetDADetailsRequestDataHeader.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ae.etisalat.www.Middleware.INCommunicationManagement.GetDADetailsRequest_xsd;

public class GetDADetailsRequestDataHeader  implements java.io.Serializable {
    private ae.etisalat.www.Middleware.INCommunicationManagement.GetDADetailsRequest_xsd.GetDADetailsRequestDataHeaderDADetails[] DADetails;

    private ae.etisalat.www.Middleware.INCommunicationManagement.GetDADetailsRequest_xsd.GetDADetailsRequestDataHeaderAddtionalInfo[] addtionalInfo;

    public GetDADetailsRequestDataHeader() {
    }

    public GetDADetailsRequestDataHeader(
           ae.etisalat.www.Middleware.INCommunicationManagement.GetDADetailsRequest_xsd.GetDADetailsRequestDataHeaderDADetails[] DADetails,
           ae.etisalat.www.Middleware.INCommunicationManagement.GetDADetailsRequest_xsd.GetDADetailsRequestDataHeaderAddtionalInfo[] addtionalInfo) {
           this.DADetails = DADetails;
           this.addtionalInfo = addtionalInfo;
    }


    /**
     * Gets the DADetails value for this GetDADetailsRequestDataHeader.
     * 
     * @return DADetails
     */
    public ae.etisalat.www.Middleware.INCommunicationManagement.GetDADetailsRequest_xsd.GetDADetailsRequestDataHeaderDADetails[] getDADetails() {
        return DADetails;
    }


    /**
     * Sets the DADetails value for this GetDADetailsRequestDataHeader.
     * 
     * @param DADetails
     */
    public void setDADetails(ae.etisalat.www.Middleware.INCommunicationManagement.GetDADetailsRequest_xsd.GetDADetailsRequestDataHeaderDADetails[] DADetails) {
        this.DADetails = DADetails;
    }

    public ae.etisalat.www.Middleware.INCommunicationManagement.GetDADetailsRequest_xsd.GetDADetailsRequestDataHeaderDADetails getDADetails(int i) {
        return this.DADetails[i];
    }

    public void setDADetails(int i, ae.etisalat.www.Middleware.INCommunicationManagement.GetDADetailsRequest_xsd.GetDADetailsRequestDataHeaderDADetails _value) {
        this.DADetails[i] = _value;
    }


    /**
     * Gets the addtionalInfo value for this GetDADetailsRequestDataHeader.
     * 
     * @return addtionalInfo
     */
    public ae.etisalat.www.Middleware.INCommunicationManagement.GetDADetailsRequest_xsd.GetDADetailsRequestDataHeaderAddtionalInfo[] getAddtionalInfo() {
        return addtionalInfo;
    }


    /**
     * Sets the addtionalInfo value for this GetDADetailsRequestDataHeader.
     * 
     * @param addtionalInfo
     */
    public void setAddtionalInfo(ae.etisalat.www.Middleware.INCommunicationManagement.GetDADetailsRequest_xsd.GetDADetailsRequestDataHeaderAddtionalInfo[] addtionalInfo) {
        this.addtionalInfo = addtionalInfo;
    }

    public ae.etisalat.www.Middleware.INCommunicationManagement.GetDADetailsRequest_xsd.GetDADetailsRequestDataHeaderAddtionalInfo getAddtionalInfo(int i) {
        return this.addtionalInfo[i];
    }

    public void setAddtionalInfo(int i, ae.etisalat.www.Middleware.INCommunicationManagement.GetDADetailsRequest_xsd.GetDADetailsRequestDataHeaderAddtionalInfo _value) {
        this.addtionalInfo[i] = _value;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GetDADetailsRequestDataHeader)) return false;
        GetDADetailsRequestDataHeader other = (GetDADetailsRequestDataHeader) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.DADetails==null && other.getDADetails()==null) || 
             (this.DADetails!=null &&
              java.util.Arrays.equals(this.DADetails, other.getDADetails()))) &&
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
        if (getDADetails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDADetails());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getDADetails(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        new org.apache.axis.description.TypeDesc(GetDADetailsRequestDataHeader.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetDADetailsRequest.xsd", ">>GetDADetailsRequest>DataHeader"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DADetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetDADetailsRequest.xsd", "DADetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetDADetailsRequest.xsd", ">>>GetDADetailsRequest>DataHeader>DADetails"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addtionalInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetDADetailsRequest.xsd", "AddtionalInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetDADetailsRequest.xsd", ">>>GetDADetailsRequest>DataHeader>AddtionalInfo"));
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
