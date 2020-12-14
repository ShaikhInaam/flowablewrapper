/**
 * GetComplaintDetailsResponseResponseDataComplaintListComplaintWFMDataWFMWorkOrderDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ae.etisalat.www.Middleware.UCMSComplaintIntegration.GetComplaintDetailsResponse_xsd;

public class GetComplaintDetailsResponseResponseDataComplaintListComplaintWFMDataWFMWorkOrderDetails  implements java.io.Serializable {
    private String etiWfmWfmsworefld;

    private String etiWfmWoStatus;

    private String etiWfmAppointmentStart;

    private String etiWfmAppointmentEnd;

    private String etiWfmAppointmentRefNo;

    private String etiWfmUcmsAssignmentGroup;

    public GetComplaintDetailsResponseResponseDataComplaintListComplaintWFMDataWFMWorkOrderDetails() {
    }

    public GetComplaintDetailsResponseResponseDataComplaintListComplaintWFMDataWFMWorkOrderDetails(
           String etiWfmWfmsworefld,
           String etiWfmWoStatus,
           String etiWfmAppointmentStart,
           String etiWfmAppointmentEnd,
           String etiWfmAppointmentRefNo,
           String etiWfmUcmsAssignmentGroup) {
           this.etiWfmWfmsworefld = etiWfmWfmsworefld;
           this.etiWfmWoStatus = etiWfmWoStatus;
           this.etiWfmAppointmentStart = etiWfmAppointmentStart;
           this.etiWfmAppointmentEnd = etiWfmAppointmentEnd;
           this.etiWfmAppointmentRefNo = etiWfmAppointmentRefNo;
           this.etiWfmUcmsAssignmentGroup = etiWfmUcmsAssignmentGroup;
    }


    /**
     * Gets the etiWfmWfmsworefld value for this GetComplaintDetailsResponseResponseDataComplaintListComplaintWFMDataWFMWorkOrderDetails.
     * 
     * @return etiWfmWfmsworefld
     */
    public String getEtiWfmWfmsworefld() {
        return etiWfmWfmsworefld;
    }


    /**
     * Sets the etiWfmWfmsworefld value for this GetComplaintDetailsResponseResponseDataComplaintListComplaintWFMDataWFMWorkOrderDetails.
     * 
     * @param etiWfmWfmsworefld
     */
    public void setEtiWfmWfmsworefld(String etiWfmWfmsworefld) {
        this.etiWfmWfmsworefld = etiWfmWfmsworefld;
    }


    /**
     * Gets the etiWfmWoStatus value for this GetComplaintDetailsResponseResponseDataComplaintListComplaintWFMDataWFMWorkOrderDetails.
     * 
     * @return etiWfmWoStatus
     */
    public String getEtiWfmWoStatus() {
        return etiWfmWoStatus;
    }


    /**
     * Sets the etiWfmWoStatus value for this GetComplaintDetailsResponseResponseDataComplaintListComplaintWFMDataWFMWorkOrderDetails.
     * 
     * @param etiWfmWoStatus
     */
    public void setEtiWfmWoStatus(String etiWfmWoStatus) {
        this.etiWfmWoStatus = etiWfmWoStatus;
    }


    /**
     * Gets the etiWfmAppointmentStart value for this GetComplaintDetailsResponseResponseDataComplaintListComplaintWFMDataWFMWorkOrderDetails.
     * 
     * @return etiWfmAppointmentStart
     */
    public String getEtiWfmAppointmentStart() {
        return etiWfmAppointmentStart;
    }


    /**
     * Sets the etiWfmAppointmentStart value for this GetComplaintDetailsResponseResponseDataComplaintListComplaintWFMDataWFMWorkOrderDetails.
     * 
     * @param etiWfmAppointmentStart
     */
    public void setEtiWfmAppointmentStart(String etiWfmAppointmentStart) {
        this.etiWfmAppointmentStart = etiWfmAppointmentStart;
    }


    /**
     * Gets the etiWfmAppointmentEnd value for this GetComplaintDetailsResponseResponseDataComplaintListComplaintWFMDataWFMWorkOrderDetails.
     * 
     * @return etiWfmAppointmentEnd
     */
    public String getEtiWfmAppointmentEnd() {
        return etiWfmAppointmentEnd;
    }


    /**
     * Sets the etiWfmAppointmentEnd value for this GetComplaintDetailsResponseResponseDataComplaintListComplaintWFMDataWFMWorkOrderDetails.
     * 
     * @param etiWfmAppointmentEnd
     */
    public void setEtiWfmAppointmentEnd(String etiWfmAppointmentEnd) {
        this.etiWfmAppointmentEnd = etiWfmAppointmentEnd;
    }


    /**
     * Gets the etiWfmAppointmentRefNo value for this GetComplaintDetailsResponseResponseDataComplaintListComplaintWFMDataWFMWorkOrderDetails.
     * 
     * @return etiWfmAppointmentRefNo
     */
    public String getEtiWfmAppointmentRefNo() {
        return etiWfmAppointmentRefNo;
    }


    /**
     * Sets the etiWfmAppointmentRefNo value for this GetComplaintDetailsResponseResponseDataComplaintListComplaintWFMDataWFMWorkOrderDetails.
     * 
     * @param etiWfmAppointmentRefNo
     */
    public void setEtiWfmAppointmentRefNo(String etiWfmAppointmentRefNo) {
        this.etiWfmAppointmentRefNo = etiWfmAppointmentRefNo;
    }


    /**
     * Gets the etiWfmUcmsAssignmentGroup value for this GetComplaintDetailsResponseResponseDataComplaintListComplaintWFMDataWFMWorkOrderDetails.
     * 
     * @return etiWfmUcmsAssignmentGroup
     */
    public String getEtiWfmUcmsAssignmentGroup() {
        return etiWfmUcmsAssignmentGroup;
    }


    /**
     * Sets the etiWfmUcmsAssignmentGroup value for this GetComplaintDetailsResponseResponseDataComplaintListComplaintWFMDataWFMWorkOrderDetails.
     * 
     * @param etiWfmUcmsAssignmentGroup
     */
    public void setEtiWfmUcmsAssignmentGroup(String etiWfmUcmsAssignmentGroup) {
        this.etiWfmUcmsAssignmentGroup = etiWfmUcmsAssignmentGroup;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GetComplaintDetailsResponseResponseDataComplaintListComplaintWFMDataWFMWorkOrderDetails)) return false;
        GetComplaintDetailsResponseResponseDataComplaintListComplaintWFMDataWFMWorkOrderDetails other = (GetComplaintDetailsResponseResponseDataComplaintListComplaintWFMDataWFMWorkOrderDetails) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.etiWfmWfmsworefld==null && other.getEtiWfmWfmsworefld()==null) || 
             (this.etiWfmWfmsworefld!=null &&
              this.etiWfmWfmsworefld.equals(other.getEtiWfmWfmsworefld()))) &&
            ((this.etiWfmWoStatus==null && other.getEtiWfmWoStatus()==null) || 
             (this.etiWfmWoStatus!=null &&
              this.etiWfmWoStatus.equals(other.getEtiWfmWoStatus()))) &&
            ((this.etiWfmAppointmentStart==null && other.getEtiWfmAppointmentStart()==null) || 
             (this.etiWfmAppointmentStart!=null &&
              this.etiWfmAppointmentStart.equals(other.getEtiWfmAppointmentStart()))) &&
            ((this.etiWfmAppointmentEnd==null && other.getEtiWfmAppointmentEnd()==null) || 
             (this.etiWfmAppointmentEnd!=null &&
              this.etiWfmAppointmentEnd.equals(other.getEtiWfmAppointmentEnd()))) &&
            ((this.etiWfmAppointmentRefNo==null && other.getEtiWfmAppointmentRefNo()==null) || 
             (this.etiWfmAppointmentRefNo!=null &&
              this.etiWfmAppointmentRefNo.equals(other.getEtiWfmAppointmentRefNo()))) &&
            ((this.etiWfmUcmsAssignmentGroup==null && other.getEtiWfmUcmsAssignmentGroup()==null) || 
             (this.etiWfmUcmsAssignmentGroup!=null &&
              this.etiWfmUcmsAssignmentGroup.equals(other.getEtiWfmUcmsAssignmentGroup())));
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
        if (getEtiWfmWfmsworefld() != null) {
            _hashCode += getEtiWfmWfmsworefld().hashCode();
        }
        if (getEtiWfmWoStatus() != null) {
            _hashCode += getEtiWfmWoStatus().hashCode();
        }
        if (getEtiWfmAppointmentStart() != null) {
            _hashCode += getEtiWfmAppointmentStart().hashCode();
        }
        if (getEtiWfmAppointmentEnd() != null) {
            _hashCode += getEtiWfmAppointmentEnd().hashCode();
        }
        if (getEtiWfmAppointmentRefNo() != null) {
            _hashCode += getEtiWfmAppointmentRefNo().hashCode();
        }
        if (getEtiWfmUcmsAssignmentGroup() != null) {
            _hashCode += getEtiWfmUcmsAssignmentGroup().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetComplaintDetailsResponseResponseDataComplaintListComplaintWFMDataWFMWorkOrderDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/GetComplaintDetailsResponse.xsd", ">>>>>>GetComplaintDetailsResponse>ResponseData>ComplaintList>Complaint>WFMData>WFMWorkOrderDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("etiWfmWfmsworefld");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/GetComplaintDetailsResponse.xsd", "EtiWfmWfmsworefld"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("etiWfmWoStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/GetComplaintDetailsResponse.xsd", "EtiWfmWoStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("etiWfmAppointmentStart");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/GetComplaintDetailsResponse.xsd", "EtiWfmAppointmentStart"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("etiWfmAppointmentEnd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/GetComplaintDetailsResponse.xsd", "EtiWfmAppointmentEnd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("etiWfmAppointmentRefNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/GetComplaintDetailsResponse.xsd", "EtiWfmAppointmentRefNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("etiWfmUcmsAssignmentGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/GetComplaintDetailsResponse.xsd", "EtiWfmUcmsAssignmentGroup"));
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
