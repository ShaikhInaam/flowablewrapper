/**
 * GetComplaintDetailsResponseResponseData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ae.etisalat.www.Middleware.UCMSComplaintIntegration.GetComplaintDetailsResponse_xsd;

public class GetComplaintDetailsResponseResponseData  implements java.io.Serializable {
    private String transactionID;

    private ae.etisalat.www.Middleware.UCMSComplaintIntegration.GetComplaintDetailsResponse_xsd.GetComplaintDetailsResponseResponseDataComplaintListComplaint[] complaintList;

    private ae.etisalat.www.Middleware.UCMSComplaintIntegration.GetComplaintDetailsResponse_xsd.GetComplaintDetailsResponseResponseDataAddtionalInfo[] addtionalInfo;

    public GetComplaintDetailsResponseResponseData() {
    }

    public GetComplaintDetailsResponseResponseData(
           String transactionID,
           ae.etisalat.www.Middleware.UCMSComplaintIntegration.GetComplaintDetailsResponse_xsd.GetComplaintDetailsResponseResponseDataComplaintListComplaint[] complaintList,
           ae.etisalat.www.Middleware.UCMSComplaintIntegration.GetComplaintDetailsResponse_xsd.GetComplaintDetailsResponseResponseDataAddtionalInfo[] addtionalInfo) {
           this.transactionID = transactionID;
           this.complaintList = complaintList;
           this.addtionalInfo = addtionalInfo;
    }


    /**
     * Gets the transactionID value for this GetComplaintDetailsResponseResponseData.
     * 
     * @return transactionID
     */
    public String getTransactionID() {
        return transactionID;
    }


    /**
     * Sets the transactionID value for this GetComplaintDetailsResponseResponseData.
     * 
     * @param transactionID
     */
    public void setTransactionID(String transactionID) {
        this.transactionID = transactionID;
    }


    /**
     * Gets the complaintList value for this GetComplaintDetailsResponseResponseData.
     * 
     * @return complaintList
     */
    public ae.etisalat.www.Middleware.UCMSComplaintIntegration.GetComplaintDetailsResponse_xsd.GetComplaintDetailsResponseResponseDataComplaintListComplaint[] getComplaintList() {
        return complaintList;
    }


    /**
     * Sets the complaintList value for this GetComplaintDetailsResponseResponseData.
     * 
     * @param complaintList
     */
    public void setComplaintList(ae.etisalat.www.Middleware.UCMSComplaintIntegration.GetComplaintDetailsResponse_xsd.GetComplaintDetailsResponseResponseDataComplaintListComplaint[] complaintList) {
        this.complaintList = complaintList;
    }


    /**
     * Gets the addtionalInfo value for this GetComplaintDetailsResponseResponseData.
     * 
     * @return addtionalInfo
     */
    public ae.etisalat.www.Middleware.UCMSComplaintIntegration.GetComplaintDetailsResponse_xsd.GetComplaintDetailsResponseResponseDataAddtionalInfo[] getAddtionalInfo() {
        return addtionalInfo;
    }


    /**
     * Sets the addtionalInfo value for this GetComplaintDetailsResponseResponseData.
     * 
     * @param addtionalInfo
     */
    public void setAddtionalInfo(ae.etisalat.www.Middleware.UCMSComplaintIntegration.GetComplaintDetailsResponse_xsd.GetComplaintDetailsResponseResponseDataAddtionalInfo[] addtionalInfo) {
        this.addtionalInfo = addtionalInfo;
    }

    public ae.etisalat.www.Middleware.UCMSComplaintIntegration.GetComplaintDetailsResponse_xsd.GetComplaintDetailsResponseResponseDataAddtionalInfo getAddtionalInfo(int i) {
        return this.addtionalInfo[i];
    }

    public void setAddtionalInfo(int i, ae.etisalat.www.Middleware.UCMSComplaintIntegration.GetComplaintDetailsResponse_xsd.GetComplaintDetailsResponseResponseDataAddtionalInfo _value) {
        this.addtionalInfo[i] = _value;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GetComplaintDetailsResponseResponseData)) return false;
        GetComplaintDetailsResponseResponseData other = (GetComplaintDetailsResponseResponseData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.transactionID==null && other.getTransactionID()==null) || 
             (this.transactionID!=null &&
              this.transactionID.equals(other.getTransactionID()))) &&
            ((this.complaintList==null && other.getComplaintList()==null) || 
             (this.complaintList!=null &&
              java.util.Arrays.equals(this.complaintList, other.getComplaintList()))) &&
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
        if (getTransactionID() != null) {
            _hashCode += getTransactionID().hashCode();
        }
        if (getComplaintList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getComplaintList());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getComplaintList(), i);
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
        new org.apache.axis.description.TypeDesc(GetComplaintDetailsResponseResponseData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/GetComplaintDetailsResponse.xsd", ">>GetComplaintDetailsResponse>ResponseData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/GetComplaintDetailsResponse.xsd", "TransactionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("complaintList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/GetComplaintDetailsResponse.xsd", "ComplaintList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/GetComplaintDetailsResponse.xsd", ">>>>GetComplaintDetailsResponse>ResponseData>ComplaintList>Complaint"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/GetComplaintDetailsResponse.xsd", "Complaint"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addtionalInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/GetComplaintDetailsResponse.xsd", "AddtionalInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/GetComplaintDetailsResponse.xsd", ">>>GetComplaintDetailsResponse>ResponseData>AddtionalInfo"));
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
