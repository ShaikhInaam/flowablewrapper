/**
 * GetComplaintDetailsResponseResponseDataComplaintListComplaintSMITData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ae.etisalat.www.Middleware.UCMSComplaintIntegration.GetComplaintDetailsResponse_xsd;

public class GetComplaintDetailsResponseResponseDataComplaintListComplaintSMITData  implements java.io.Serializable {
    private String etiSmitAg;

    private String etiSmitAs;

    private String etiSmitStatus;

    private String etiSmitId;

    public GetComplaintDetailsResponseResponseDataComplaintListComplaintSMITData() {
    }

    public GetComplaintDetailsResponseResponseDataComplaintListComplaintSMITData(
           String etiSmitAg,
           String etiSmitAs,
           String etiSmitStatus,
           String etiSmitId) {
           this.etiSmitAg = etiSmitAg;
           this.etiSmitAs = etiSmitAs;
           this.etiSmitStatus = etiSmitStatus;
           this.etiSmitId = etiSmitId;
    }


    /**
     * Gets the etiSmitAg value for this GetComplaintDetailsResponseResponseDataComplaintListComplaintSMITData.
     * 
     * @return etiSmitAg
     */
    public String getEtiSmitAg() {
        return etiSmitAg;
    }


    /**
     * Sets the etiSmitAg value for this GetComplaintDetailsResponseResponseDataComplaintListComplaintSMITData.
     * 
     * @param etiSmitAg
     */
    public void setEtiSmitAg(String etiSmitAg) {
        this.etiSmitAg = etiSmitAg;
    }


    /**
     * Gets the etiSmitAs value for this GetComplaintDetailsResponseResponseDataComplaintListComplaintSMITData.
     * 
     * @return etiSmitAs
     */
    public String getEtiSmitAs() {
        return etiSmitAs;
    }


    /**
     * Sets the etiSmitAs value for this GetComplaintDetailsResponseResponseDataComplaintListComplaintSMITData.
     * 
     * @param etiSmitAs
     */
    public void setEtiSmitAs(String etiSmitAs) {
        this.etiSmitAs = etiSmitAs;
    }


    /**
     * Gets the etiSmitStatus value for this GetComplaintDetailsResponseResponseDataComplaintListComplaintSMITData.
     * 
     * @return etiSmitStatus
     */
    public String getEtiSmitStatus() {
        return etiSmitStatus;
    }


    /**
     * Sets the etiSmitStatus value for this GetComplaintDetailsResponseResponseDataComplaintListComplaintSMITData.
     * 
     * @param etiSmitStatus
     */
    public void setEtiSmitStatus(String etiSmitStatus) {
        this.etiSmitStatus = etiSmitStatus;
    }


    /**
     * Gets the etiSmitId value for this GetComplaintDetailsResponseResponseDataComplaintListComplaintSMITData.
     * 
     * @return etiSmitId
     */
    public String getEtiSmitId() {
        return etiSmitId;
    }


    /**
     * Sets the etiSmitId value for this GetComplaintDetailsResponseResponseDataComplaintListComplaintSMITData.
     * 
     * @param etiSmitId
     */
    public void setEtiSmitId(String etiSmitId) {
        this.etiSmitId = etiSmitId;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GetComplaintDetailsResponseResponseDataComplaintListComplaintSMITData)) return false;
        GetComplaintDetailsResponseResponseDataComplaintListComplaintSMITData other = (GetComplaintDetailsResponseResponseDataComplaintListComplaintSMITData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.etiSmitAg==null && other.getEtiSmitAg()==null) || 
             (this.etiSmitAg!=null &&
              this.etiSmitAg.equals(other.getEtiSmitAg()))) &&
            ((this.etiSmitAs==null && other.getEtiSmitAs()==null) || 
             (this.etiSmitAs!=null &&
              this.etiSmitAs.equals(other.getEtiSmitAs()))) &&
            ((this.etiSmitStatus==null && other.getEtiSmitStatus()==null) || 
             (this.etiSmitStatus!=null &&
              this.etiSmitStatus.equals(other.getEtiSmitStatus()))) &&
            ((this.etiSmitId==null && other.getEtiSmitId()==null) || 
             (this.etiSmitId!=null &&
              this.etiSmitId.equals(other.getEtiSmitId())));
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
        if (getEtiSmitAg() != null) {
            _hashCode += getEtiSmitAg().hashCode();
        }
        if (getEtiSmitAs() != null) {
            _hashCode += getEtiSmitAs().hashCode();
        }
        if (getEtiSmitStatus() != null) {
            _hashCode += getEtiSmitStatus().hashCode();
        }
        if (getEtiSmitId() != null) {
            _hashCode += getEtiSmitId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetComplaintDetailsResponseResponseDataComplaintListComplaintSMITData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/GetComplaintDetailsResponse.xsd", ">>>>>GetComplaintDetailsResponse>ResponseData>ComplaintList>Complaint>SMITData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("etiSmitAg");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/GetComplaintDetailsResponse.xsd", "EtiSmitAg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("etiSmitAs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/GetComplaintDetailsResponse.xsd", "EtiSmitAs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("etiSmitStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/GetComplaintDetailsResponse.xsd", "EtiSmitStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("etiSmitId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/GetComplaintDetailsResponse.xsd", "EtiSmitId"));
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
