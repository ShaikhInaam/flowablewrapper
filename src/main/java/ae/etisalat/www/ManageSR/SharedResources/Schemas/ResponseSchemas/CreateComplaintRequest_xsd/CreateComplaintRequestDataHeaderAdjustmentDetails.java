/**
 * CreateComplaintRequestDataHeaderAdjustmentDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.CreateComplaintRequest_xsd;

public class CreateComplaintRequestDataHeaderAdjustmentDetails  implements java.io.Serializable {
    private String billDate;

    private java.math.BigDecimal refundAmount;

    private String chargeCode;

    private String adjustmentRemarks;

    private String adjustmentType;

    public CreateComplaintRequestDataHeaderAdjustmentDetails() {
    }

    public CreateComplaintRequestDataHeaderAdjustmentDetails(
           String billDate,
           java.math.BigDecimal refundAmount,
           String chargeCode,
           String adjustmentRemarks,
           String adjustmentType) {
           this.billDate = billDate;
           this.refundAmount = refundAmount;
           this.chargeCode = chargeCode;
           this.adjustmentRemarks = adjustmentRemarks;
           this.adjustmentType = adjustmentType;
    }


    /**
     * Gets the billDate value for this CreateComplaintRequestDataHeaderAdjustmentDetails.
     * 
     * @return billDate
     */
    public String getBillDate() {
        return billDate;
    }


    /**
     * Sets the billDate value for this CreateComplaintRequestDataHeaderAdjustmentDetails.
     * 
     * @param billDate
     */
    public void setBillDate(String billDate) {
        this.billDate = billDate;
    }


    /**
     * Gets the refundAmount value for this CreateComplaintRequestDataHeaderAdjustmentDetails.
     * 
     * @return refundAmount
     */
    public java.math.BigDecimal getRefundAmount() {
        return refundAmount;
    }


    /**
     * Sets the refundAmount value for this CreateComplaintRequestDataHeaderAdjustmentDetails.
     * 
     * @param refundAmount
     */
    public void setRefundAmount(java.math.BigDecimal refundAmount) {
        this.refundAmount = refundAmount;
    }


    /**
     * Gets the chargeCode value for this CreateComplaintRequestDataHeaderAdjustmentDetails.
     * 
     * @return chargeCode
     */
    public String getChargeCode() {
        return chargeCode;
    }


    /**
     * Sets the chargeCode value for this CreateComplaintRequestDataHeaderAdjustmentDetails.
     * 
     * @param chargeCode
     */
    public void setChargeCode(String chargeCode) {
        this.chargeCode = chargeCode;
    }


    /**
     * Gets the adjustmentRemarks value for this CreateComplaintRequestDataHeaderAdjustmentDetails.
     * 
     * @return adjustmentRemarks
     */
    public String getAdjustmentRemarks() {
        return adjustmentRemarks;
    }


    /**
     * Sets the adjustmentRemarks value for this CreateComplaintRequestDataHeaderAdjustmentDetails.
     * 
     * @param adjustmentRemarks
     */
    public void setAdjustmentRemarks(String adjustmentRemarks) {
        this.adjustmentRemarks = adjustmentRemarks;
    }


    /**
     * Gets the adjustmentType value for this CreateComplaintRequestDataHeaderAdjustmentDetails.
     * 
     * @return adjustmentType
     */
    public String getAdjustmentType() {
        return adjustmentType;
    }


    /**
     * Sets the adjustmentType value for this CreateComplaintRequestDataHeaderAdjustmentDetails.
     * 
     * @param adjustmentType
     */
    public void setAdjustmentType(String adjustmentType) {
        this.adjustmentType = adjustmentType;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CreateComplaintRequestDataHeaderAdjustmentDetails)) return false;
        CreateComplaintRequestDataHeaderAdjustmentDetails other = (CreateComplaintRequestDataHeaderAdjustmentDetails) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.billDate==null && other.getBillDate()==null) || 
             (this.billDate!=null &&
              this.billDate.equals(other.getBillDate()))) &&
            ((this.refundAmount==null && other.getRefundAmount()==null) || 
             (this.refundAmount!=null &&
              this.refundAmount.equals(other.getRefundAmount()))) &&
            ((this.chargeCode==null && other.getChargeCode()==null) || 
             (this.chargeCode!=null &&
              this.chargeCode.equals(other.getChargeCode()))) &&
            ((this.adjustmentRemarks==null && other.getAdjustmentRemarks()==null) || 
             (this.adjustmentRemarks!=null &&
              this.adjustmentRemarks.equals(other.getAdjustmentRemarks()))) &&
            ((this.adjustmentType==null && other.getAdjustmentType()==null) || 
             (this.adjustmentType!=null &&
              this.adjustmentType.equals(other.getAdjustmentType())));
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
        if (getBillDate() != null) {
            _hashCode += getBillDate().hashCode();
        }
        if (getRefundAmount() != null) {
            _hashCode += getRefundAmount().hashCode();
        }
        if (getChargeCode() != null) {
            _hashCode += getChargeCode().hashCode();
        }
        if (getAdjustmentRemarks() != null) {
            _hashCode += getAdjustmentRemarks().hashCode();
        }
        if (getAdjustmentType() != null) {
            _hashCode += getAdjustmentType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateComplaintRequestDataHeaderAdjustmentDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/CreateComplaintRequest.xsd", ">>>CreateComplaintRequest>DataHeader>AdjustmentDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/CreateComplaintRequest.xsd", "BillDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refundAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/CreateComplaintRequest.xsd", "RefundAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/CreateComplaintRequest.xsd", "ChargeCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adjustmentRemarks");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/CreateComplaintRequest.xsd", "AdjustmentRemarks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adjustmentType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/CreateComplaintRequest.xsd", "AdjustmentType"));
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
