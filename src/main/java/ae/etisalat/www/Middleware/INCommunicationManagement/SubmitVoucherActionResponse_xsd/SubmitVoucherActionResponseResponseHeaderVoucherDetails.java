/**
 * SubmitVoucherActionResponseResponseHeaderVoucherDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ae.etisalat.www.Middleware.INCommunicationManagement.SubmitVoucherActionResponse_xsd;

public class SubmitVoucherActionResponseResponseHeaderVoucherDetails  implements java.io.Serializable {
    private java.util.Calendar voucherStateChangeDate;

    private String state;

    private String value;

    private Boolean voucherExpired;

    public SubmitVoucherActionResponseResponseHeaderVoucherDetails() {
    }

    public SubmitVoucherActionResponseResponseHeaderVoucherDetails(
           java.util.Calendar voucherStateChangeDate,
           String state,
           String value,
           Boolean voucherExpired) {
           this.voucherStateChangeDate = voucherStateChangeDate;
           this.state = state;
           this.value = value;
           this.voucherExpired = voucherExpired;
    }


    /**
     * Gets the voucherStateChangeDate value for this SubmitVoucherActionResponseResponseHeaderVoucherDetails.
     * 
     * @return voucherStateChangeDate
     */
    public java.util.Calendar getVoucherStateChangeDate() {
        return voucherStateChangeDate;
    }


    /**
     * Sets the voucherStateChangeDate value for this SubmitVoucherActionResponseResponseHeaderVoucherDetails.
     * 
     * @param voucherStateChangeDate
     */
    public void setVoucherStateChangeDate(java.util.Calendar voucherStateChangeDate) {
        this.voucherStateChangeDate = voucherStateChangeDate;
    }


    /**
     * Gets the state value for this SubmitVoucherActionResponseResponseHeaderVoucherDetails.
     * 
     * @return state
     */
    public String getState() {
        return state;
    }


    /**
     * Sets the state value for this SubmitVoucherActionResponseResponseHeaderVoucherDetails.
     * 
     * @param state
     */
    public void setState(String state) {
        this.state = state;
    }


    /**
     * Gets the value value for this SubmitVoucherActionResponseResponseHeaderVoucherDetails.
     * 
     * @return value
     */
    public String getValue() {
        return value;
    }


    /**
     * Sets the value value for this SubmitVoucherActionResponseResponseHeaderVoucherDetails.
     * 
     * @param value
     */
    public void setValue(String value) {
        this.value = value;
    }


    /**
     * Gets the voucherExpired value for this SubmitVoucherActionResponseResponseHeaderVoucherDetails.
     * 
     * @return voucherExpired
     */
    public Boolean getVoucherExpired() {
        return voucherExpired;
    }


    /**
     * Sets the voucherExpired value for this SubmitVoucherActionResponseResponseHeaderVoucherDetails.
     * 
     * @param voucherExpired
     */
    public void setVoucherExpired(Boolean voucherExpired) {
        this.voucherExpired = voucherExpired;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof SubmitVoucherActionResponseResponseHeaderVoucherDetails)) return false;
        SubmitVoucherActionResponseResponseHeaderVoucherDetails other = (SubmitVoucherActionResponseResponseHeaderVoucherDetails) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.voucherStateChangeDate==null && other.getVoucherStateChangeDate()==null) || 
             (this.voucherStateChangeDate!=null &&
              this.voucherStateChangeDate.equals(other.getVoucherStateChangeDate()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              this.value.equals(other.getValue()))) &&
            ((this.voucherExpired==null && other.getVoucherExpired()==null) || 
             (this.voucherExpired!=null &&
              this.voucherExpired.equals(other.getVoucherExpired())));
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
        if (getVoucherStateChangeDate() != null) {
            _hashCode += getVoucherStateChangeDate().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        if (getVoucherExpired() != null) {
            _hashCode += getVoucherExpired().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SubmitVoucherActionResponseResponseHeaderVoucherDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/SubmitVoucherActionResponse.xsd", ">>>SubmitVoucherActionResponse>ResponseHeader>VoucherDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("voucherStateChangeDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/SubmitVoucherActionResponse.xsd", "VoucherStateChangeDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/SubmitVoucherActionResponse.xsd", "State"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/SubmitVoucherActionResponse.xsd", "Value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("voucherExpired");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/SubmitVoucherActionResponse.xsd", "VoucherExpired"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
