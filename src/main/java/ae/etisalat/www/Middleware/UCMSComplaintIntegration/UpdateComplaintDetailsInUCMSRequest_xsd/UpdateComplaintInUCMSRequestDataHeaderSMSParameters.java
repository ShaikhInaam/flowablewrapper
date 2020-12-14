/**
 * UpdateComplaintInUCMSRequestDataHeaderSMSParameters.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintDetailsInUCMSRequest_xsd;

public class UpdateComplaintInUCMSRequestDataHeaderSMSParameters  implements java.io.Serializable {
    private String deliveryType;

    private String notificationID;

    private String notificationCode;

    private String templateId;

    private String notificationLanguage;

    private String interactionReason;

    private String accountNumber;

    private ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintDetailsInUCMSRequest_xsd.UpdateComplaintInUCMSRequestDataHeaderSMSParametersDynamicParameters[] dynamicParameters;

    public UpdateComplaintInUCMSRequestDataHeaderSMSParameters() {
    }

    public UpdateComplaintInUCMSRequestDataHeaderSMSParameters(
           String deliveryType,
           String notificationID,
           String notificationCode,
           String templateId,
           String notificationLanguage,
           String interactionReason,
           String accountNumber,
           ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintDetailsInUCMSRequest_xsd.UpdateComplaintInUCMSRequestDataHeaderSMSParametersDynamicParameters[] dynamicParameters) {
           this.deliveryType = deliveryType;
           this.notificationID = notificationID;
           this.notificationCode = notificationCode;
           this.templateId = templateId;
           this.notificationLanguage = notificationLanguage;
           this.interactionReason = interactionReason;
           this.accountNumber = accountNumber;
           this.dynamicParameters = dynamicParameters;
    }


    /**
     * Gets the deliveryType value for this UpdateComplaintInUCMSRequestDataHeaderSMSParameters.
     * 
     * @return deliveryType
     */
    public String getDeliveryType() {
        return deliveryType;
    }


    /**
     * Sets the deliveryType value for this UpdateComplaintInUCMSRequestDataHeaderSMSParameters.
     * 
     * @param deliveryType
     */
    public void setDeliveryType(String deliveryType) {
        this.deliveryType = deliveryType;
    }


    /**
     * Gets the notificationID value for this UpdateComplaintInUCMSRequestDataHeaderSMSParameters.
     * 
     * @return notificationID
     */
    public String getNotificationID() {
        return notificationID;
    }


    /**
     * Sets the notificationID value for this UpdateComplaintInUCMSRequestDataHeaderSMSParameters.
     * 
     * @param notificationID
     */
    public void setNotificationID(String notificationID) {
        this.notificationID = notificationID;
    }


    /**
     * Gets the notificationCode value for this UpdateComplaintInUCMSRequestDataHeaderSMSParameters.
     * 
     * @return notificationCode
     */
    public String getNotificationCode() {
        return notificationCode;
    }


    /**
     * Sets the notificationCode value for this UpdateComplaintInUCMSRequestDataHeaderSMSParameters.
     * 
     * @param notificationCode
     */
    public void setNotificationCode(String notificationCode) {
        this.notificationCode = notificationCode;
    }


    /**
     * Gets the templateId value for this UpdateComplaintInUCMSRequestDataHeaderSMSParameters.
     * 
     * @return templateId
     */
    public String getTemplateId() {
        return templateId;
    }


    /**
     * Sets the templateId value for this UpdateComplaintInUCMSRequestDataHeaderSMSParameters.
     * 
     * @param templateId
     */
    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }


    /**
     * Gets the notificationLanguage value for this UpdateComplaintInUCMSRequestDataHeaderSMSParameters.
     * 
     * @return notificationLanguage
     */
    public String getNotificationLanguage() {
        return notificationLanguage;
    }


    /**
     * Sets the notificationLanguage value for this UpdateComplaintInUCMSRequestDataHeaderSMSParameters.
     * 
     * @param notificationLanguage
     */
    public void setNotificationLanguage(String notificationLanguage) {
        this.notificationLanguage = notificationLanguage;
    }


    /**
     * Gets the interactionReason value for this UpdateComplaintInUCMSRequestDataHeaderSMSParameters.
     * 
     * @return interactionReason
     */
    public String getInteractionReason() {
        return interactionReason;
    }


    /**
     * Sets the interactionReason value for this UpdateComplaintInUCMSRequestDataHeaderSMSParameters.
     * 
     * @param interactionReason
     */
    public void setInteractionReason(String interactionReason) {
        this.interactionReason = interactionReason;
    }


    /**
     * Gets the accountNumber value for this UpdateComplaintInUCMSRequestDataHeaderSMSParameters.
     * 
     * @return accountNumber
     */
    public String getAccountNumber() {
        return accountNumber;
    }


    /**
     * Sets the accountNumber value for this UpdateComplaintInUCMSRequestDataHeaderSMSParameters.
     * 
     * @param accountNumber
     */
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }


    /**
     * Gets the dynamicParameters value for this UpdateComplaintInUCMSRequestDataHeaderSMSParameters.
     * 
     * @return dynamicParameters
     */
    public ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintDetailsInUCMSRequest_xsd.UpdateComplaintInUCMSRequestDataHeaderSMSParametersDynamicParameters[] getDynamicParameters() {
        return dynamicParameters;
    }


    /**
     * Sets the dynamicParameters value for this UpdateComplaintInUCMSRequestDataHeaderSMSParameters.
     * 
     * @param dynamicParameters
     */
    public void setDynamicParameters(ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintDetailsInUCMSRequest_xsd.UpdateComplaintInUCMSRequestDataHeaderSMSParametersDynamicParameters[] dynamicParameters) {
        this.dynamicParameters = dynamicParameters;
    }

    public ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintDetailsInUCMSRequest_xsd.UpdateComplaintInUCMSRequestDataHeaderSMSParametersDynamicParameters getDynamicParameters(int i) {
        return this.dynamicParameters[i];
    }

    public void setDynamicParameters(int i, ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintDetailsInUCMSRequest_xsd.UpdateComplaintInUCMSRequestDataHeaderSMSParametersDynamicParameters _value) {
        this.dynamicParameters[i] = _value;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof UpdateComplaintInUCMSRequestDataHeaderSMSParameters)) return false;
        UpdateComplaintInUCMSRequestDataHeaderSMSParameters other = (UpdateComplaintInUCMSRequestDataHeaderSMSParameters) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.deliveryType==null && other.getDeliveryType()==null) || 
             (this.deliveryType!=null &&
              this.deliveryType.equals(other.getDeliveryType()))) &&
            ((this.notificationID==null && other.getNotificationID()==null) || 
             (this.notificationID!=null &&
              this.notificationID.equals(other.getNotificationID()))) &&
            ((this.notificationCode==null && other.getNotificationCode()==null) || 
             (this.notificationCode!=null &&
              this.notificationCode.equals(other.getNotificationCode()))) &&
            ((this.templateId==null && other.getTemplateId()==null) || 
             (this.templateId!=null &&
              this.templateId.equals(other.getTemplateId()))) &&
            ((this.notificationLanguage==null && other.getNotificationLanguage()==null) || 
             (this.notificationLanguage!=null &&
              this.notificationLanguage.equals(other.getNotificationLanguage()))) &&
            ((this.interactionReason==null && other.getInteractionReason()==null) || 
             (this.interactionReason!=null &&
              this.interactionReason.equals(other.getInteractionReason()))) &&
            ((this.accountNumber==null && other.getAccountNumber()==null) || 
             (this.accountNumber!=null &&
              this.accountNumber.equals(other.getAccountNumber()))) &&
            ((this.dynamicParameters==null && other.getDynamicParameters()==null) || 
             (this.dynamicParameters!=null &&
              java.util.Arrays.equals(this.dynamicParameters, other.getDynamicParameters())));
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
        if (getDeliveryType() != null) {
            _hashCode += getDeliveryType().hashCode();
        }
        if (getNotificationID() != null) {
            _hashCode += getNotificationID().hashCode();
        }
        if (getNotificationCode() != null) {
            _hashCode += getNotificationCode().hashCode();
        }
        if (getTemplateId() != null) {
            _hashCode += getTemplateId().hashCode();
        }
        if (getNotificationLanguage() != null) {
            _hashCode += getNotificationLanguage().hashCode();
        }
        if (getInteractionReason() != null) {
            _hashCode += getInteractionReason().hashCode();
        }
        if (getAccountNumber() != null) {
            _hashCode += getAccountNumber().hashCode();
        }
        if (getDynamicParameters() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDynamicParameters());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getDynamicParameters(), i);
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
        new org.apache.axis.description.TypeDesc(UpdateComplaintInUCMSRequestDataHeaderSMSParameters.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", ">>>UpdateComplaintInUCMSRequest>DataHeader>SMSParameters"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "DeliveryType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notificationID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "NotificationID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notificationCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "NotificationCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("templateId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "TemplateId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notificationLanguage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "NotificationLanguage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interactionReason");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "InteractionReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "AccountNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dynamicParameters");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "DynamicParameters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", ">>>>UpdateComplaintInUCMSRequest>DataHeader>SMSParameters>DynamicParameters"));
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
