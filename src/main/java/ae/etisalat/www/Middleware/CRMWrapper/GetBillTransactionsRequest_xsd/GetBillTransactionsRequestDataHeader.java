/**
 * GetBillTransactionsRequestDataHeader.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ae.etisalat.www.Middleware.CRMWrapper.GetBillTransactionsRequest_xsd;

public class GetBillTransactionsRequestDataHeader  implements java.io.Serializable {
    private ae.etisalat.www.Middleware.CRMWrapper.GetBillTransactionsRequest_xsd.GetBillTransactionsRequestDataHeaderBillItem billItem;

    private ae.etisalat.www.Middleware.SharedResources.Common.Common_xsd.AdditionalInfo[] additionalInfo;

    public GetBillTransactionsRequestDataHeader() {
    }

    public GetBillTransactionsRequestDataHeader(
           ae.etisalat.www.Middleware.CRMWrapper.GetBillTransactionsRequest_xsd.GetBillTransactionsRequestDataHeaderBillItem billItem,
           ae.etisalat.www.Middleware.SharedResources.Common.Common_xsd.AdditionalInfo[] additionalInfo) {
           this.billItem = billItem;
           this.additionalInfo = additionalInfo;
    }


    /**
     * Gets the billItem value for this GetBillTransactionsRequestDataHeader.
     * 
     * @return billItem
     */
    public ae.etisalat.www.Middleware.CRMWrapper.GetBillTransactionsRequest_xsd.GetBillTransactionsRequestDataHeaderBillItem getBillItem() {
        return billItem;
    }


    /**
     * Sets the billItem value for this GetBillTransactionsRequestDataHeader.
     * 
     * @param billItem
     */
    public void setBillItem(ae.etisalat.www.Middleware.CRMWrapper.GetBillTransactionsRequest_xsd.GetBillTransactionsRequestDataHeaderBillItem billItem) {
        this.billItem = billItem;
    }


    /**
     * Gets the additionalInfo value for this GetBillTransactionsRequestDataHeader.
     * 
     * @return additionalInfo
     */
    public ae.etisalat.www.Middleware.SharedResources.Common.Common_xsd.AdditionalInfo[] getAdditionalInfo() {
        return additionalInfo;
    }


    /**
     * Sets the additionalInfo value for this GetBillTransactionsRequestDataHeader.
     * 
     * @param additionalInfo
     */
    public void setAdditionalInfo(ae.etisalat.www.Middleware.SharedResources.Common.Common_xsd.AdditionalInfo[] additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public ae.etisalat.www.Middleware.SharedResources.Common.Common_xsd.AdditionalInfo getAdditionalInfo(int i) {
        return this.additionalInfo[i];
    }

    public void setAdditionalInfo(int i, ae.etisalat.www.Middleware.SharedResources.Common.Common_xsd.AdditionalInfo _value) {
        this.additionalInfo[i] = _value;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GetBillTransactionsRequestDataHeader)) return false;
        GetBillTransactionsRequestDataHeader other = (GetBillTransactionsRequestDataHeader) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.billItem==null && other.getBillItem()==null) || 
             (this.billItem!=null &&
              this.billItem.equals(other.getBillItem()))) &&
            ((this.additionalInfo==null && other.getAdditionalInfo()==null) || 
             (this.additionalInfo!=null &&
              java.util.Arrays.equals(this.additionalInfo, other.getAdditionalInfo())));
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
        if (getBillItem() != null) {
            _hashCode += getBillItem().hashCode();
        }
        if (getAdditionalInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAdditionalInfo());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getAdditionalInfo(), i);
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
        new org.apache.axis.description.TypeDesc(GetBillTransactionsRequestDataHeader.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/CRMWrapper/GetBillTransactionsRequest.xsd", ">>GetBillTransactionsRequest>DataHeader"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billItem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/CRMWrapper/GetBillTransactionsRequest.xsd", "BillItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/CRMWrapper/GetBillTransactionsRequest.xsd", ">>>GetBillTransactionsRequest>DataHeader>BillItem"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/SharedResources/Common/Common.xsd", "AdditionalInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/SharedResources/Common/Common.xsd", "AdditionalInfo"));
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
