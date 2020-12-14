/**
 * GetThirdPartyComplaintDtlsResponseComplaintDetailsArrayContactDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.GetThirdPartyComplaintDtlsResponse_xsd;

public class GetThirdPartyComplaintDtlsResponseComplaintDetailsArrayContactDetails  implements java.io.Serializable {
    private String contactMode;

    private String contactName;

    private String contactNumber;

    private String priority;

    public GetThirdPartyComplaintDtlsResponseComplaintDetailsArrayContactDetails() {
    }

    public GetThirdPartyComplaintDtlsResponseComplaintDetailsArrayContactDetails(
           String contactMode,
           String contactName,
           String contactNumber,
           String priority) {
           this.contactMode = contactMode;
           this.contactName = contactName;
           this.contactNumber = contactNumber;
           this.priority = priority;
    }


    /**
     * Gets the contactMode value for this GetThirdPartyComplaintDtlsResponseComplaintDetailsArrayContactDetails.
     * 
     * @return contactMode
     */
    public String getContactMode() {
        return contactMode;
    }


    /**
     * Sets the contactMode value for this GetThirdPartyComplaintDtlsResponseComplaintDetailsArrayContactDetails.
     * 
     * @param contactMode
     */
    public void setContactMode(String contactMode) {
        this.contactMode = contactMode;
    }


    /**
     * Gets the contactName value for this GetThirdPartyComplaintDtlsResponseComplaintDetailsArrayContactDetails.
     * 
     * @return contactName
     */
    public String getContactName() {
        return contactName;
    }


    /**
     * Sets the contactName value for this GetThirdPartyComplaintDtlsResponseComplaintDetailsArrayContactDetails.
     * 
     * @param contactName
     */
    public void setContactName(String contactName) {
        this.contactName = contactName;
    }


    /**
     * Gets the contactNumber value for this GetThirdPartyComplaintDtlsResponseComplaintDetailsArrayContactDetails.
     * 
     * @return contactNumber
     */
    public String getContactNumber() {
        return contactNumber;
    }


    /**
     * Sets the contactNumber value for this GetThirdPartyComplaintDtlsResponseComplaintDetailsArrayContactDetails.
     * 
     * @param contactNumber
     */
    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }


    /**
     * Gets the priority value for this GetThirdPartyComplaintDtlsResponseComplaintDetailsArrayContactDetails.
     * 
     * @return priority
     */
    public String getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this GetThirdPartyComplaintDtlsResponseComplaintDetailsArrayContactDetails.
     * 
     * @param priority
     */
    public void setPriority(String priority) {
        this.priority = priority;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GetThirdPartyComplaintDtlsResponseComplaintDetailsArrayContactDetails)) return false;
        GetThirdPartyComplaintDtlsResponseComplaintDetailsArrayContactDetails other = (GetThirdPartyComplaintDtlsResponseComplaintDetailsArrayContactDetails) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.contactMode==null && other.getContactMode()==null) || 
             (this.contactMode!=null &&
              this.contactMode.equals(other.getContactMode()))) &&
            ((this.contactName==null && other.getContactName()==null) || 
             (this.contactName!=null &&
              this.contactName.equals(other.getContactName()))) &&
            ((this.contactNumber==null && other.getContactNumber()==null) || 
             (this.contactNumber!=null &&
              this.contactNumber.equals(other.getContactNumber()))) &&
            ((this.priority==null && other.getPriority()==null) || 
             (this.priority!=null &&
              this.priority.equals(other.getPriority())));
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
        if (getContactMode() != null) {
            _hashCode += getContactMode().hashCode();
        }
        if (getContactName() != null) {
            _hashCode += getContactName().hashCode();
        }
        if (getContactNumber() != null) {
            _hashCode += getContactNumber().hashCode();
        }
        if (getPriority() != null) {
            _hashCode += getPriority().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetThirdPartyComplaintDtlsResponseComplaintDetailsArrayContactDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/GetThirdPartyComplaintDtlsResponse.xsd", ">>>GetThirdPartyComplaintDtlsResponse>ComplaintDetailsArray>ContactDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactMode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/GetThirdPartyComplaintDtlsResponse.xsd", "ContactMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/GetThirdPartyComplaintDtlsResponse.xsd", "ContactName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/GetThirdPartyComplaintDtlsResponse.xsd", "ContactNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/GetThirdPartyComplaintDtlsResponse.xsd", "Priority"));
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
