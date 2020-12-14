/**
 * SubmitVoucherActionRequestDataHeader.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ae.etisalat.www.Middleware.INCommunicationManagement.SubmitVoucherActionRequest_xsd;

public class SubmitVoucherActionRequestDataHeader  implements java.io.Serializable {
    private String action;

    private String subscriberNo;

    private SubmitVoucherActionRequestDataHeaderVoucherDetails voucherDetails;

    private SubmitVoucherActionRequestDataHeaderAddtionalInfo[] addtionalInfo;

    public SubmitVoucherActionRequestDataHeader() {
    }

    public SubmitVoucherActionRequestDataHeader(
           String action,
           String subscriberNo,
           SubmitVoucherActionRequestDataHeaderVoucherDetails voucherDetails,
           SubmitVoucherActionRequestDataHeaderAddtionalInfo[] addtionalInfo) {
           this.action = action;
           this.subscriberNo = subscriberNo;
           this.voucherDetails = voucherDetails;
           this.addtionalInfo = addtionalInfo;
    }


    /**
     * Gets the action value for this SubmitVoucherActionRequestDataHeader.
     * 
     * @return action
     */
    public String getAction() {
        return action;
    }


    /**
     * Sets the action value for this SubmitVoucherActionRequestDataHeader.
     * 
     * @param action
     */
    public void setAction(String action) {
        this.action = action;
    }


    /**
     * Gets the subscriberNo value for this SubmitVoucherActionRequestDataHeader.
     * 
     * @return subscriberNo
     */
    public String getSubscriberNo() {
        return subscriberNo;
    }


    /**
     * Sets the subscriberNo value for this SubmitVoucherActionRequestDataHeader.
     * 
     * @param subscriberNo
     */
    public void setSubscriberNo(String subscriberNo) {
        this.subscriberNo = subscriberNo;
    }


    /**
     * Gets the voucherDetails value for this SubmitVoucherActionRequestDataHeader.
     * 
     * @return voucherDetails
     */
    public SubmitVoucherActionRequestDataHeaderVoucherDetails getVoucherDetails() {
        return voucherDetails;
    }


    /**
     * Sets the voucherDetails value for this SubmitVoucherActionRequestDataHeader.
     * 
     * @param voucherDetails
     */
    public void setVoucherDetails(SubmitVoucherActionRequestDataHeaderVoucherDetails voucherDetails) {
        this.voucherDetails = voucherDetails;
    }


    /**
     * Gets the addtionalInfo value for this SubmitVoucherActionRequestDataHeader.
     * 
     * @return addtionalInfo
     */
    public SubmitVoucherActionRequestDataHeaderAddtionalInfo[] getAddtionalInfo() {
        return addtionalInfo;
    }


    /**
     * Sets the addtionalInfo value for this SubmitVoucherActionRequestDataHeader.
     * 
     * @param addtionalInfo
     */
    public void setAddtionalInfo(SubmitVoucherActionRequestDataHeaderAddtionalInfo[] addtionalInfo) {
        this.addtionalInfo = addtionalInfo;
    }

    public SubmitVoucherActionRequestDataHeaderAddtionalInfo getAddtionalInfo(int i) {
        return this.addtionalInfo[i];
    }

    public void setAddtionalInfo(int i, SubmitVoucherActionRequestDataHeaderAddtionalInfo _value) {
        this.addtionalInfo[i] = _value;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof SubmitVoucherActionRequestDataHeader)) return false;
        SubmitVoucherActionRequestDataHeader other = (SubmitVoucherActionRequestDataHeader) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.action==null && other.getAction()==null) || 
             (this.action!=null &&
              this.action.equals(other.getAction()))) &&
            ((this.subscriberNo==null && other.getSubscriberNo()==null) || 
             (this.subscriberNo!=null &&
              this.subscriberNo.equals(other.getSubscriberNo()))) &&
            ((this.voucherDetails==null && other.getVoucherDetails()==null) || 
             (this.voucherDetails!=null &&
              this.voucherDetails.equals(other.getVoucherDetails()))) &&
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
        if (getAction() != null) {
            _hashCode += getAction().hashCode();
        }
        if (getSubscriberNo() != null) {
            _hashCode += getSubscriberNo().hashCode();
        }
        if (getVoucherDetails() != null) {
            _hashCode += getVoucherDetails().hashCode();
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
        new org.apache.axis.description.TypeDesc(SubmitVoucherActionRequestDataHeader.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/SubmitVoucherActionRequest.xsd", ">>SubmitVoucherActionRequest>DataHeader"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("action");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/SubmitVoucherActionRequest.xsd", "Action"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriberNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/SubmitVoucherActionRequest.xsd", "SubscriberNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("voucherDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/SubmitVoucherActionRequest.xsd", "VoucherDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/SubmitVoucherActionRequest.xsd", ">>>SubmitVoucherActionRequest>DataHeader>VoucherDetails"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addtionalInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/SubmitVoucherActionRequest.xsd", "AddtionalInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/SubmitVoucherActionRequest.xsd", ">>>SubmitVoucherActionRequest>DataHeader>AddtionalInfo"));
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
