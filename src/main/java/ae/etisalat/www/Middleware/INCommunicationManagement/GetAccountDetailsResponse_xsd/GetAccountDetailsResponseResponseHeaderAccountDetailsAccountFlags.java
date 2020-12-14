/**
 * GetAccountDetailsResponseResponseHeaderAccountDetailsAccountFlags.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd;

public class GetAccountDetailsResponseResponseHeaderAccountDetailsAccountFlags  implements java.io.Serializable {
    private String activationStatusFlag;

    private String negativeBarringStatusFlag;

    private String supervisionPeriodWarningActiveFlag;

    private String serviceFeePeriodWarningActiveFlag;

    private String supervisionPeriodExpiryFlag;

    private String serviceFeePeriodExpiryFlag;

    private String twoStepActivationFlag;

    public GetAccountDetailsResponseResponseHeaderAccountDetailsAccountFlags() {
    }

    public GetAccountDetailsResponseResponseHeaderAccountDetailsAccountFlags(
           String activationStatusFlag,
           String negativeBarringStatusFlag,
           String supervisionPeriodWarningActiveFlag,
           String serviceFeePeriodWarningActiveFlag,
           String supervisionPeriodExpiryFlag,
           String serviceFeePeriodExpiryFlag,
           String twoStepActivationFlag) {
           this.activationStatusFlag = activationStatusFlag;
           this.negativeBarringStatusFlag = negativeBarringStatusFlag;
           this.supervisionPeriodWarningActiveFlag = supervisionPeriodWarningActiveFlag;
           this.serviceFeePeriodWarningActiveFlag = serviceFeePeriodWarningActiveFlag;
           this.supervisionPeriodExpiryFlag = supervisionPeriodExpiryFlag;
           this.serviceFeePeriodExpiryFlag = serviceFeePeriodExpiryFlag;
           this.twoStepActivationFlag = twoStepActivationFlag;
    }


    /**
     * Gets the activationStatusFlag value for this GetAccountDetailsResponseResponseHeaderAccountDetailsAccountFlags.
     * 
     * @return activationStatusFlag
     */
    public String getActivationStatusFlag() {
        return activationStatusFlag;
    }


    /**
     * Sets the activationStatusFlag value for this GetAccountDetailsResponseResponseHeaderAccountDetailsAccountFlags.
     * 
     * @param activationStatusFlag
     */
    public void setActivationStatusFlag(String activationStatusFlag) {
        this.activationStatusFlag = activationStatusFlag;
    }


    /**
     * Gets the negativeBarringStatusFlag value for this GetAccountDetailsResponseResponseHeaderAccountDetailsAccountFlags.
     * 
     * @return negativeBarringStatusFlag
     */
    public String getNegativeBarringStatusFlag() {
        return negativeBarringStatusFlag;
    }


    /**
     * Sets the negativeBarringStatusFlag value for this GetAccountDetailsResponseResponseHeaderAccountDetailsAccountFlags.
     * 
     * @param negativeBarringStatusFlag
     */
    public void setNegativeBarringStatusFlag(String negativeBarringStatusFlag) {
        this.negativeBarringStatusFlag = negativeBarringStatusFlag;
    }


    /**
     * Gets the supervisionPeriodWarningActiveFlag value for this GetAccountDetailsResponseResponseHeaderAccountDetailsAccountFlags.
     * 
     * @return supervisionPeriodWarningActiveFlag
     */
    public String getSupervisionPeriodWarningActiveFlag() {
        return supervisionPeriodWarningActiveFlag;
    }


    /**
     * Sets the supervisionPeriodWarningActiveFlag value for this GetAccountDetailsResponseResponseHeaderAccountDetailsAccountFlags.
     * 
     * @param supervisionPeriodWarningActiveFlag
     */
    public void setSupervisionPeriodWarningActiveFlag(String supervisionPeriodWarningActiveFlag) {
        this.supervisionPeriodWarningActiveFlag = supervisionPeriodWarningActiveFlag;
    }


    /**
     * Gets the serviceFeePeriodWarningActiveFlag value for this GetAccountDetailsResponseResponseHeaderAccountDetailsAccountFlags.
     * 
     * @return serviceFeePeriodWarningActiveFlag
     */
    public String getServiceFeePeriodWarningActiveFlag() {
        return serviceFeePeriodWarningActiveFlag;
    }


    /**
     * Sets the serviceFeePeriodWarningActiveFlag value for this GetAccountDetailsResponseResponseHeaderAccountDetailsAccountFlags.
     * 
     * @param serviceFeePeriodWarningActiveFlag
     */
    public void setServiceFeePeriodWarningActiveFlag(String serviceFeePeriodWarningActiveFlag) {
        this.serviceFeePeriodWarningActiveFlag = serviceFeePeriodWarningActiveFlag;
    }


    /**
     * Gets the supervisionPeriodExpiryFlag value for this GetAccountDetailsResponseResponseHeaderAccountDetailsAccountFlags.
     * 
     * @return supervisionPeriodExpiryFlag
     */
    public String getSupervisionPeriodExpiryFlag() {
        return supervisionPeriodExpiryFlag;
    }


    /**
     * Sets the supervisionPeriodExpiryFlag value for this GetAccountDetailsResponseResponseHeaderAccountDetailsAccountFlags.
     * 
     * @param supervisionPeriodExpiryFlag
     */
    public void setSupervisionPeriodExpiryFlag(String supervisionPeriodExpiryFlag) {
        this.supervisionPeriodExpiryFlag = supervisionPeriodExpiryFlag;
    }


    /**
     * Gets the serviceFeePeriodExpiryFlag value for this GetAccountDetailsResponseResponseHeaderAccountDetailsAccountFlags.
     * 
     * @return serviceFeePeriodExpiryFlag
     */
    public String getServiceFeePeriodExpiryFlag() {
        return serviceFeePeriodExpiryFlag;
    }


    /**
     * Sets the serviceFeePeriodExpiryFlag value for this GetAccountDetailsResponseResponseHeaderAccountDetailsAccountFlags.
     * 
     * @param serviceFeePeriodExpiryFlag
     */
    public void setServiceFeePeriodExpiryFlag(String serviceFeePeriodExpiryFlag) {
        this.serviceFeePeriodExpiryFlag = serviceFeePeriodExpiryFlag;
    }


    /**
     * Gets the twoStepActivationFlag value for this GetAccountDetailsResponseResponseHeaderAccountDetailsAccountFlags.
     * 
     * @return twoStepActivationFlag
     */
    public String getTwoStepActivationFlag() {
        return twoStepActivationFlag;
    }


    /**
     * Sets the twoStepActivationFlag value for this GetAccountDetailsResponseResponseHeaderAccountDetailsAccountFlags.
     * 
     * @param twoStepActivationFlag
     */
    public void setTwoStepActivationFlag(String twoStepActivationFlag) {
        this.twoStepActivationFlag = twoStepActivationFlag;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GetAccountDetailsResponseResponseHeaderAccountDetailsAccountFlags)) return false;
        GetAccountDetailsResponseResponseHeaderAccountDetailsAccountFlags other = (GetAccountDetailsResponseResponseHeaderAccountDetailsAccountFlags) obj;
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
            ((this.supervisionPeriodWarningActiveFlag==null && other.getSupervisionPeriodWarningActiveFlag()==null) || 
             (this.supervisionPeriodWarningActiveFlag!=null &&
              this.supervisionPeriodWarningActiveFlag.equals(other.getSupervisionPeriodWarningActiveFlag()))) &&
            ((this.serviceFeePeriodWarningActiveFlag==null && other.getServiceFeePeriodWarningActiveFlag()==null) || 
             (this.serviceFeePeriodWarningActiveFlag!=null &&
              this.serviceFeePeriodWarningActiveFlag.equals(other.getServiceFeePeriodWarningActiveFlag()))) &&
            ((this.supervisionPeriodExpiryFlag==null && other.getSupervisionPeriodExpiryFlag()==null) || 
             (this.supervisionPeriodExpiryFlag!=null &&
              this.supervisionPeriodExpiryFlag.equals(other.getSupervisionPeriodExpiryFlag()))) &&
            ((this.serviceFeePeriodExpiryFlag==null && other.getServiceFeePeriodExpiryFlag()==null) || 
             (this.serviceFeePeriodExpiryFlag!=null &&
              this.serviceFeePeriodExpiryFlag.equals(other.getServiceFeePeriodExpiryFlag()))) &&
            ((this.twoStepActivationFlag==null && other.getTwoStepActivationFlag()==null) || 
             (this.twoStepActivationFlag!=null &&
              this.twoStepActivationFlag.equals(other.getTwoStepActivationFlag())));
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
        if (getSupervisionPeriodWarningActiveFlag() != null) {
            _hashCode += getSupervisionPeriodWarningActiveFlag().hashCode();
        }
        if (getServiceFeePeriodWarningActiveFlag() != null) {
            _hashCode += getServiceFeePeriodWarningActiveFlag().hashCode();
        }
        if (getSupervisionPeriodExpiryFlag() != null) {
            _hashCode += getSupervisionPeriodExpiryFlag().hashCode();
        }
        if (getServiceFeePeriodExpiryFlag() != null) {
            _hashCode += getServiceFeePeriodExpiryFlag().hashCode();
        }
        if (getTwoStepActivationFlag() != null) {
            _hashCode += getTwoStepActivationFlag().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetAccountDetailsResponseResponseHeaderAccountDetailsAccountFlags.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", ">>>>GetAccountDetailsResponse>ResponseHeader>AccountDetails>accountFlags"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activationStatusFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "activationStatusFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("negativeBarringStatusFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "negativeBarringStatusFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supervisionPeriodWarningActiveFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "supervisionPeriodWarningActiveFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceFeePeriodWarningActiveFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "serviceFeePeriodWarningActiveFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supervisionPeriodExpiryFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "supervisionPeriodExpiryFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceFeePeriodExpiryFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "serviceFeePeriodExpiryFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("twoStepActivationFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "twoStepActivationFlag"));
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
