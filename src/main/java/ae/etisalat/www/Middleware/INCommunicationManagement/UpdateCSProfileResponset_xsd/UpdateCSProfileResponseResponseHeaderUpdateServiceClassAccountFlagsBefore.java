/**
 * UpdateCSProfileResponseResponseHeaderUpdateServiceClassAccountFlagsBefore.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ae.etisalat.www.Middleware.INCommunicationManagement.UpdateCSProfileResponset_xsd;

public class UpdateCSProfileResponseResponseHeaderUpdateServiceClassAccountFlagsBefore  implements java.io.Serializable {
    private String activationStatusFlag;

    private String negativeBarringStatusFlag;

    private String serviceFeePeriodExpiryFlag;

    private String serviceFeePeriodWarningActiveFlag;

    private String supervisionPeriodExpiryFlag;

    private String supervisionPeriodWarningActiveFlag;

    public UpdateCSProfileResponseResponseHeaderUpdateServiceClassAccountFlagsBefore() {
    }

    public UpdateCSProfileResponseResponseHeaderUpdateServiceClassAccountFlagsBefore(
           String activationStatusFlag,
           String negativeBarringStatusFlag,
           String serviceFeePeriodExpiryFlag,
           String serviceFeePeriodWarningActiveFlag,
           String supervisionPeriodExpiryFlag,
           String supervisionPeriodWarningActiveFlag) {
           this.activationStatusFlag = activationStatusFlag;
           this.negativeBarringStatusFlag = negativeBarringStatusFlag;
           this.serviceFeePeriodExpiryFlag = serviceFeePeriodExpiryFlag;
           this.serviceFeePeriodWarningActiveFlag = serviceFeePeriodWarningActiveFlag;
           this.supervisionPeriodExpiryFlag = supervisionPeriodExpiryFlag;
           this.supervisionPeriodWarningActiveFlag = supervisionPeriodWarningActiveFlag;
    }


    /**
     * Gets the activationStatusFlag value for this UpdateCSProfileResponseResponseHeaderUpdateServiceClassAccountFlagsBefore.
     * 
     * @return activationStatusFlag
     */
    public String getActivationStatusFlag() {
        return activationStatusFlag;
    }


    /**
     * Sets the activationStatusFlag value for this UpdateCSProfileResponseResponseHeaderUpdateServiceClassAccountFlagsBefore.
     * 
     * @param activationStatusFlag
     */
    public void setActivationStatusFlag(String activationStatusFlag) {
        this.activationStatusFlag = activationStatusFlag;
    }


    /**
     * Gets the negativeBarringStatusFlag value for this UpdateCSProfileResponseResponseHeaderUpdateServiceClassAccountFlagsBefore.
     * 
     * @return negativeBarringStatusFlag
     */
    public String getNegativeBarringStatusFlag() {
        return negativeBarringStatusFlag;
    }


    /**
     * Sets the negativeBarringStatusFlag value for this UpdateCSProfileResponseResponseHeaderUpdateServiceClassAccountFlagsBefore.
     * 
     * @param negativeBarringStatusFlag
     */
    public void setNegativeBarringStatusFlag(String negativeBarringStatusFlag) {
        this.negativeBarringStatusFlag = negativeBarringStatusFlag;
    }


    /**
     * Gets the serviceFeePeriodExpiryFlag value for this UpdateCSProfileResponseResponseHeaderUpdateServiceClassAccountFlagsBefore.
     * 
     * @return serviceFeePeriodExpiryFlag
     */
    public String getServiceFeePeriodExpiryFlag() {
        return serviceFeePeriodExpiryFlag;
    }


    /**
     * Sets the serviceFeePeriodExpiryFlag value for this UpdateCSProfileResponseResponseHeaderUpdateServiceClassAccountFlagsBefore.
     * 
     * @param serviceFeePeriodExpiryFlag
     */
    public void setServiceFeePeriodExpiryFlag(String serviceFeePeriodExpiryFlag) {
        this.serviceFeePeriodExpiryFlag = serviceFeePeriodExpiryFlag;
    }


    /**
     * Gets the serviceFeePeriodWarningActiveFlag value for this UpdateCSProfileResponseResponseHeaderUpdateServiceClassAccountFlagsBefore.
     * 
     * @return serviceFeePeriodWarningActiveFlag
     */
    public String getServiceFeePeriodWarningActiveFlag() {
        return serviceFeePeriodWarningActiveFlag;
    }


    /**
     * Sets the serviceFeePeriodWarningActiveFlag value for this UpdateCSProfileResponseResponseHeaderUpdateServiceClassAccountFlagsBefore.
     * 
     * @param serviceFeePeriodWarningActiveFlag
     */
    public void setServiceFeePeriodWarningActiveFlag(String serviceFeePeriodWarningActiveFlag) {
        this.serviceFeePeriodWarningActiveFlag = serviceFeePeriodWarningActiveFlag;
    }


    /**
     * Gets the supervisionPeriodExpiryFlag value for this UpdateCSProfileResponseResponseHeaderUpdateServiceClassAccountFlagsBefore.
     * 
     * @return supervisionPeriodExpiryFlag
     */
    public String getSupervisionPeriodExpiryFlag() {
        return supervisionPeriodExpiryFlag;
    }


    /**
     * Sets the supervisionPeriodExpiryFlag value for this UpdateCSProfileResponseResponseHeaderUpdateServiceClassAccountFlagsBefore.
     * 
     * @param supervisionPeriodExpiryFlag
     */
    public void setSupervisionPeriodExpiryFlag(String supervisionPeriodExpiryFlag) {
        this.supervisionPeriodExpiryFlag = supervisionPeriodExpiryFlag;
    }


    /**
     * Gets the supervisionPeriodWarningActiveFlag value for this UpdateCSProfileResponseResponseHeaderUpdateServiceClassAccountFlagsBefore.
     * 
     * @return supervisionPeriodWarningActiveFlag
     */
    public String getSupervisionPeriodWarningActiveFlag() {
        return supervisionPeriodWarningActiveFlag;
    }


    /**
     * Sets the supervisionPeriodWarningActiveFlag value for this UpdateCSProfileResponseResponseHeaderUpdateServiceClassAccountFlagsBefore.
     * 
     * @param supervisionPeriodWarningActiveFlag
     */
    public void setSupervisionPeriodWarningActiveFlag(String supervisionPeriodWarningActiveFlag) {
        this.supervisionPeriodWarningActiveFlag = supervisionPeriodWarningActiveFlag;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof UpdateCSProfileResponseResponseHeaderUpdateServiceClassAccountFlagsBefore)) return false;
        UpdateCSProfileResponseResponseHeaderUpdateServiceClassAccountFlagsBefore other = (UpdateCSProfileResponseResponseHeaderUpdateServiceClassAccountFlagsBefore) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.activationStatusFlag==null && other.getActivationStatusFlag()==null) || 
             (this.activationStatusFlag!=null &&
              this.activationStatusFlag.equals(other.getActivationStatusFlag()))) &&
            ((this.negativeBarringStatusFlag==null && other.getNegativeBarringStatusFlag()==null) || 
             (this.negativeBarringStatusFlag!=null &&
              this.negativeBarringStatusFlag.equals(other.getNegativeBarringStatusFlag()))) &&
            ((this.serviceFeePeriodExpiryFlag==null && other.getServiceFeePeriodExpiryFlag()==null) || 
             (this.serviceFeePeriodExpiryFlag!=null &&
              this.serviceFeePeriodExpiryFlag.equals(other.getServiceFeePeriodExpiryFlag()))) &&
            ((this.serviceFeePeriodWarningActiveFlag==null && other.getServiceFeePeriodWarningActiveFlag()==null) || 
             (this.serviceFeePeriodWarningActiveFlag!=null &&
              this.serviceFeePeriodWarningActiveFlag.equals(other.getServiceFeePeriodWarningActiveFlag()))) &&
            ((this.supervisionPeriodExpiryFlag==null && other.getSupervisionPeriodExpiryFlag()==null) || 
             (this.supervisionPeriodExpiryFlag!=null &&
              this.supervisionPeriodExpiryFlag.equals(other.getSupervisionPeriodExpiryFlag()))) &&
            ((this.supervisionPeriodWarningActiveFlag==null && other.getSupervisionPeriodWarningActiveFlag()==null) || 
             (this.supervisionPeriodWarningActiveFlag!=null &&
              this.supervisionPeriodWarningActiveFlag.equals(other.getSupervisionPeriodWarningActiveFlag())));
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
        if (getActivationStatusFlag() != null) {
            _hashCode += getActivationStatusFlag().hashCode();
        }
        if (getNegativeBarringStatusFlag() != null) {
            _hashCode += getNegativeBarringStatusFlag().hashCode();
        }
        if (getServiceFeePeriodExpiryFlag() != null) {
            _hashCode += getServiceFeePeriodExpiryFlag().hashCode();
        }
        if (getServiceFeePeriodWarningActiveFlag() != null) {
            _hashCode += getServiceFeePeriodWarningActiveFlag().hashCode();
        }
        if (getSupervisionPeriodExpiryFlag() != null) {
            _hashCode += getSupervisionPeriodExpiryFlag().hashCode();
        }
        if (getSupervisionPeriodWarningActiveFlag() != null) {
            _hashCode += getSupervisionPeriodWarningActiveFlag().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateCSProfileResponseResponseHeaderUpdateServiceClassAccountFlagsBefore.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileResponset.xsd", ">>>>UpdateCSProfileResponse>ResponseHeader>UpdateServiceClass>AccountFlagsBefore"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activationStatusFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileResponset.xsd", "ActivationStatusFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("negativeBarringStatusFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileResponset.xsd", "NegativeBarringStatusFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceFeePeriodExpiryFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileResponset.xsd", "ServiceFeePeriodExpiryFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceFeePeriodWarningActiveFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileResponset.xsd", "ServiceFeePeriodWarningActiveFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supervisionPeriodExpiryFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileResponset.xsd", "SupervisionPeriodExpiryFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supervisionPeriodWarningActiveFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileResponset.xsd", "SupervisionPeriodWarningActiveFlag"));
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
