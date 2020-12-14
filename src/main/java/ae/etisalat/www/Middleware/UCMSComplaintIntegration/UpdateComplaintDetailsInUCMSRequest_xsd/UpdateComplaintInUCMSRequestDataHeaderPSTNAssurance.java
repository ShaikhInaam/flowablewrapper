/**
 * UpdateComplaintInUCMSRequestDataHeaderPSTNAssurance.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintDetailsInUCMSRequest_xsd;

public class UpdateComplaintInUCMSRequestDataHeaderPSTNAssurance  implements java.io.Serializable {
    private String OOfLines;

    private String enterpriseName;

    private String domainName;

    private String groupName;

    private String VLAN;

    private String IPAddress;

    public UpdateComplaintInUCMSRequestDataHeaderPSTNAssurance() {
    }

    public UpdateComplaintInUCMSRequestDataHeaderPSTNAssurance(
           String OOfLines,
           String enterpriseName,
           String domainName,
           String groupName,
           String VLAN,
           String IPAddress) {
           this.OOfLines = OOfLines;
           this.enterpriseName = enterpriseName;
           this.domainName = domainName;
           this.groupName = groupName;
           this.VLAN = VLAN;
           this.IPAddress = IPAddress;
    }


    /**
     * Gets the OOfLines value for this UpdateComplaintInUCMSRequestDataHeaderPSTNAssurance.
     * 
     * @return OOfLines
     */
    public String getOOfLines() {
        return OOfLines;
    }


    /**
     * Sets the OOfLines value for this UpdateComplaintInUCMSRequestDataHeaderPSTNAssurance.
     * 
     * @param OOfLines
     */
    public void setOOfLines(String OOfLines) {
        this.OOfLines = OOfLines;
    }


    /**
     * Gets the enterpriseName value for this UpdateComplaintInUCMSRequestDataHeaderPSTNAssurance.
     * 
     * @return enterpriseName
     */
    public String getEnterpriseName() {
        return enterpriseName;
    }


    /**
     * Sets the enterpriseName value for this UpdateComplaintInUCMSRequestDataHeaderPSTNAssurance.
     * 
     * @param enterpriseName
     */
    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }


    /**
     * Gets the domainName value for this UpdateComplaintInUCMSRequestDataHeaderPSTNAssurance.
     * 
     * @return domainName
     */
    public String getDomainName() {
        return domainName;
    }


    /**
     * Sets the domainName value for this UpdateComplaintInUCMSRequestDataHeaderPSTNAssurance.
     * 
     * @param domainName
     */
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }


    /**
     * Gets the groupName value for this UpdateComplaintInUCMSRequestDataHeaderPSTNAssurance.
     * 
     * @return groupName
     */
    public String getGroupName() {
        return groupName;
    }


    /**
     * Sets the groupName value for this UpdateComplaintInUCMSRequestDataHeaderPSTNAssurance.
     * 
     * @param groupName
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }


    /**
     * Gets the VLAN value for this UpdateComplaintInUCMSRequestDataHeaderPSTNAssurance.
     * 
     * @return VLAN
     */
    public String getVLAN() {
        return VLAN;
    }


    /**
     * Sets the VLAN value for this UpdateComplaintInUCMSRequestDataHeaderPSTNAssurance.
     * 
     * @param VLAN
     */
    public void setVLAN(String VLAN) {
        this.VLAN = VLAN;
    }


    /**
     * Gets the IPAddress value for this UpdateComplaintInUCMSRequestDataHeaderPSTNAssurance.
     * 
     * @return IPAddress
     */
    public String getIPAddress() {
        return IPAddress;
    }


    /**
     * Sets the IPAddress value for this UpdateComplaintInUCMSRequestDataHeaderPSTNAssurance.
     * 
     * @param IPAddress
     */
    public void setIPAddress(String IPAddress) {
        this.IPAddress = IPAddress;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof UpdateComplaintInUCMSRequestDataHeaderPSTNAssurance)) return false;
        UpdateComplaintInUCMSRequestDataHeaderPSTNAssurance other = (UpdateComplaintInUCMSRequestDataHeaderPSTNAssurance) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.OOfLines==null && other.getOOfLines()==null) || 
             (this.OOfLines!=null &&
              this.OOfLines.equals(other.getOOfLines()))) &&
            ((this.enterpriseName==null && other.getEnterpriseName()==null) || 
             (this.enterpriseName!=null &&
              this.enterpriseName.equals(other.getEnterpriseName()))) &&
            ((this.domainName==null && other.getDomainName()==null) || 
             (this.domainName!=null &&
              this.domainName.equals(other.getDomainName()))) &&
            ((this.groupName==null && other.getGroupName()==null) || 
             (this.groupName!=null &&
              this.groupName.equals(other.getGroupName()))) &&
            ((this.VLAN==null && other.getVLAN()==null) || 
             (this.VLAN!=null &&
              this.VLAN.equals(other.getVLAN()))) &&
            ((this.IPAddress==null && other.getIPAddress()==null) || 
             (this.IPAddress!=null &&
              this.IPAddress.equals(other.getIPAddress())));
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
        if (getOOfLines() != null) {
            _hashCode += getOOfLines().hashCode();
        }
        if (getEnterpriseName() != null) {
            _hashCode += getEnterpriseName().hashCode();
        }
        if (getDomainName() != null) {
            _hashCode += getDomainName().hashCode();
        }
        if (getGroupName() != null) {
            _hashCode += getGroupName().hashCode();
        }
        if (getVLAN() != null) {
            _hashCode += getVLAN().hashCode();
        }
        if (getIPAddress() != null) {
            _hashCode += getIPAddress().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateComplaintInUCMSRequestDataHeaderPSTNAssurance.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", ">>>UpdateComplaintInUCMSRequest>DataHeader>PSTNAssurance"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OOfLines");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "OOfLines"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enterpriseName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "EnterpriseName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("domainName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "DomainName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "GroupName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VLAN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "VLAN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IPAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "IPAddress"));
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
