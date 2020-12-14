/**
 * UpdateComplaintInUCMSRequestDataHeaderServiceAuthAndEquipmentDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintDetailsInUCMSRequest_xsd;

public class UpdateComplaintInUCMSRequestDataHeaderServiceAuthAndEquipmentDetails  implements java.io.Serializable {
    private String ratePlanCode;

    private String ratePlanDescription;

    private String serviceCode;

    private String serviceDescription;

    private String productCode;

    private String productDesc;

    public UpdateComplaintInUCMSRequestDataHeaderServiceAuthAndEquipmentDetails() {
    }

    public UpdateComplaintInUCMSRequestDataHeaderServiceAuthAndEquipmentDetails(
           String ratePlanCode,
           String ratePlanDescription,
           String serviceCode,
           String serviceDescription,
           String productCode,
           String productDesc) {
           this.ratePlanCode = ratePlanCode;
           this.ratePlanDescription = ratePlanDescription;
           this.serviceCode = serviceCode;
           this.serviceDescription = serviceDescription;
           this.productCode = productCode;
           this.productDesc = productDesc;
    }


    /**
     * Gets the ratePlanCode value for this UpdateComplaintInUCMSRequestDataHeaderServiceAuthAndEquipmentDetails.
     * 
     * @return ratePlanCode
     */
    public String getRatePlanCode() {
        return ratePlanCode;
    }


    /**
     * Sets the ratePlanCode value for this UpdateComplaintInUCMSRequestDataHeaderServiceAuthAndEquipmentDetails.
     * 
     * @param ratePlanCode
     */
    public void setRatePlanCode(String ratePlanCode) {
        this.ratePlanCode = ratePlanCode;
    }


    /**
     * Gets the ratePlanDescription value for this UpdateComplaintInUCMSRequestDataHeaderServiceAuthAndEquipmentDetails.
     * 
     * @return ratePlanDescription
     */
    public String getRatePlanDescription() {
        return ratePlanDescription;
    }


    /**
     * Sets the ratePlanDescription value for this UpdateComplaintInUCMSRequestDataHeaderServiceAuthAndEquipmentDetails.
     * 
     * @param ratePlanDescription
     */
    public void setRatePlanDescription(String ratePlanDescription) {
        this.ratePlanDescription = ratePlanDescription;
    }


    /**
     * Gets the serviceCode value for this UpdateComplaintInUCMSRequestDataHeaderServiceAuthAndEquipmentDetails.
     * 
     * @return serviceCode
     */
    public String getServiceCode() {
        return serviceCode;
    }


    /**
     * Sets the serviceCode value for this UpdateComplaintInUCMSRequestDataHeaderServiceAuthAndEquipmentDetails.
     * 
     * @param serviceCode
     */
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }


    /**
     * Gets the serviceDescription value for this UpdateComplaintInUCMSRequestDataHeaderServiceAuthAndEquipmentDetails.
     * 
     * @return serviceDescription
     */
    public String getServiceDescription() {
        return serviceDescription;
    }


    /**
     * Sets the serviceDescription value for this UpdateComplaintInUCMSRequestDataHeaderServiceAuthAndEquipmentDetails.
     * 
     * @param serviceDescription
     */
    public void setServiceDescription(String serviceDescription) {
        this.serviceDescription = serviceDescription;
    }


    /**
     * Gets the productCode value for this UpdateComplaintInUCMSRequestDataHeaderServiceAuthAndEquipmentDetails.
     * 
     * @return productCode
     */
    public String getProductCode() {
        return productCode;
    }


    /**
     * Sets the productCode value for this UpdateComplaintInUCMSRequestDataHeaderServiceAuthAndEquipmentDetails.
     * 
     * @param productCode
     */
    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }


    /**
     * Gets the productDesc value for this UpdateComplaintInUCMSRequestDataHeaderServiceAuthAndEquipmentDetails.
     * 
     * @return productDesc
     */
    public String getProductDesc() {
        return productDesc;
    }


    /**
     * Sets the productDesc value for this UpdateComplaintInUCMSRequestDataHeaderServiceAuthAndEquipmentDetails.
     * 
     * @param productDesc
     */
    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof UpdateComplaintInUCMSRequestDataHeaderServiceAuthAndEquipmentDetails)) return false;
        UpdateComplaintInUCMSRequestDataHeaderServiceAuthAndEquipmentDetails other = (UpdateComplaintInUCMSRequestDataHeaderServiceAuthAndEquipmentDetails) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ratePlanCode==null && other.getRatePlanCode()==null) || 
             (this.ratePlanCode!=null &&
              this.ratePlanCode.equals(other.getRatePlanCode()))) &&
            ((this.ratePlanDescription==null && other.getRatePlanDescription()==null) || 
             (this.ratePlanDescription!=null &&
              this.ratePlanDescription.equals(other.getRatePlanDescription()))) &&
            ((this.serviceCode==null && other.getServiceCode()==null) || 
             (this.serviceCode!=null &&
              this.serviceCode.equals(other.getServiceCode()))) &&
            ((this.serviceDescription==null && other.getServiceDescription()==null) || 
             (this.serviceDescription!=null &&
              this.serviceDescription.equals(other.getServiceDescription()))) &&
            ((this.productCode==null && other.getProductCode()==null) || 
             (this.productCode!=null &&
              this.productCode.equals(other.getProductCode()))) &&
            ((this.productDesc==null && other.getProductDesc()==null) || 
             (this.productDesc!=null &&
              this.productDesc.equals(other.getProductDesc())));
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
        if (getRatePlanCode() != null) {
            _hashCode += getRatePlanCode().hashCode();
        }
        if (getRatePlanDescription() != null) {
            _hashCode += getRatePlanDescription().hashCode();
        }
        if (getServiceCode() != null) {
            _hashCode += getServiceCode().hashCode();
        }
        if (getServiceDescription() != null) {
            _hashCode += getServiceDescription().hashCode();
        }
        if (getProductCode() != null) {
            _hashCode += getProductCode().hashCode();
        }
        if (getProductDesc() != null) {
            _hashCode += getProductDesc().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateComplaintInUCMSRequestDataHeaderServiceAuthAndEquipmentDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", ">>>UpdateComplaintInUCMSRequest>DataHeader>ServiceAuthAndEquipmentDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ratePlanCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "RatePlanCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ratePlanDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "RatePlanDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "ServiceCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "ServiceDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "ProductCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "ProductDesc"));
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
