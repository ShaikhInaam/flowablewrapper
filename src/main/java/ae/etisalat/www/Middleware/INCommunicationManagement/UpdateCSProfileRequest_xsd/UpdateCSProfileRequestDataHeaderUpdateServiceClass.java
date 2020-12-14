/**
 * UpdateCSProfileRequestDataHeaderUpdateServiceClass.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ae.etisalat.www.Middleware.INCommunicationManagement.UpdateCSProfileRequest_xsd;

public class UpdateCSProfileRequestDataHeaderUpdateServiceClass  implements java.io.Serializable {
    private Integer subscriberNumberNAI;

    private String subscriberNumber;

    private String originOperatorID;

    private String serviceClassAction;

    private String serviceClassCurrent;

    private String serviceClassNew;

    private String serviceClassTemporary;

    private String serviceClassTemporaryExpiryDate;

    private String serviceClassTemporaryNew;

    private String serviceClassTemporaryNewExpiryDate;

    private String serviceClassValidationFlag;

    private String externalData1;

    private String externalData2;

    private ae.etisalat.www.Middleware.INCommunicationManagement.UpdateCSProfileRequest_xsd.UpdateCSProfileRequestDataHeaderUpdateServiceClassChargingRequestInformation chargingRequestInformation;

    private String negotiatedCapabilities;

    private ae.etisalat.www.Middleware.SharedResources.Common.Common_xsd.AdditionalInfo[] additionalInfo;

    public UpdateCSProfileRequestDataHeaderUpdateServiceClass() {
    }

    public UpdateCSProfileRequestDataHeaderUpdateServiceClass(
           Integer subscriberNumberNAI,
           String subscriberNumber,
           String originOperatorID,
           String serviceClassAction,
           String serviceClassCurrent,
           String serviceClassNew,
           String serviceClassTemporary,
           String serviceClassTemporaryExpiryDate,
           String serviceClassTemporaryNew,
           String serviceClassTemporaryNewExpiryDate,
           String serviceClassValidationFlag,
           String externalData1,
           String externalData2,
           ae.etisalat.www.Middleware.INCommunicationManagement.UpdateCSProfileRequest_xsd.UpdateCSProfileRequestDataHeaderUpdateServiceClassChargingRequestInformation chargingRequestInformation,
           String negotiatedCapabilities,
           ae.etisalat.www.Middleware.SharedResources.Common.Common_xsd.AdditionalInfo[] additionalInfo) {
           this.subscriberNumberNAI = subscriberNumberNAI;
           this.subscriberNumber = subscriberNumber;
           this.originOperatorID = originOperatorID;
           this.serviceClassAction = serviceClassAction;
           this.serviceClassCurrent = serviceClassCurrent;
           this.serviceClassNew = serviceClassNew;
           this.serviceClassTemporary = serviceClassTemporary;
           this.serviceClassTemporaryExpiryDate = serviceClassTemporaryExpiryDate;
           this.serviceClassTemporaryNew = serviceClassTemporaryNew;
           this.serviceClassTemporaryNewExpiryDate = serviceClassTemporaryNewExpiryDate;
           this.serviceClassValidationFlag = serviceClassValidationFlag;
           this.externalData1 = externalData1;
           this.externalData2 = externalData2;
           this.chargingRequestInformation = chargingRequestInformation;
           this.negotiatedCapabilities = negotiatedCapabilities;
           this.additionalInfo = additionalInfo;
    }


    /**
     * Gets the subscriberNumberNAI value for this UpdateCSProfileRequestDataHeaderUpdateServiceClass.
     * 
     * @return subscriberNumberNAI
     */
    public Integer getSubscriberNumberNAI() {
        return subscriberNumberNAI;
    }


    /**
     * Sets the subscriberNumberNAI value for this UpdateCSProfileRequestDataHeaderUpdateServiceClass.
     * 
     * @param subscriberNumberNAI
     */
    public void setSubscriberNumberNAI(Integer subscriberNumberNAI) {
        this.subscriberNumberNAI = subscriberNumberNAI;
    }


    /**
     * Gets the subscriberNumber value for this UpdateCSProfileRequestDataHeaderUpdateServiceClass.
     * 
     * @return subscriberNumber
     */
    public String getSubscriberNumber() {
        return subscriberNumber;
    }


    /**
     * Sets the subscriberNumber value for this UpdateCSProfileRequestDataHeaderUpdateServiceClass.
     * 
     * @param subscriberNumber
     */
    public void setSubscriberNumber(String subscriberNumber) {
        this.subscriberNumber = subscriberNumber;
    }


    /**
     * Gets the originOperatorID value for this UpdateCSProfileRequestDataHeaderUpdateServiceClass.
     * 
     * @return originOperatorID
     */
    public String getOriginOperatorID() {
        return originOperatorID;
    }


    /**
     * Sets the originOperatorID value for this UpdateCSProfileRequestDataHeaderUpdateServiceClass.
     * 
     * @param originOperatorID
     */
    public void setOriginOperatorID(String originOperatorID) {
        this.originOperatorID = originOperatorID;
    }


    /**
     * Gets the serviceClassAction value for this UpdateCSProfileRequestDataHeaderUpdateServiceClass.
     * 
     * @return serviceClassAction
     */
    public String getServiceClassAction() {
        return serviceClassAction;
    }


    /**
     * Sets the serviceClassAction value for this UpdateCSProfileRequestDataHeaderUpdateServiceClass.
     * 
     * @param serviceClassAction
     */
    public void setServiceClassAction(String serviceClassAction) {
        this.serviceClassAction = serviceClassAction;
    }


    /**
     * Gets the serviceClassCurrent value for this UpdateCSProfileRequestDataHeaderUpdateServiceClass.
     * 
     * @return serviceClassCurrent
     */
    public String getServiceClassCurrent() {
        return serviceClassCurrent;
    }


    /**
     * Sets the serviceClassCurrent value for this UpdateCSProfileRequestDataHeaderUpdateServiceClass.
     * 
     * @param serviceClassCurrent
     */
    public void setServiceClassCurrent(String serviceClassCurrent) {
        this.serviceClassCurrent = serviceClassCurrent;
    }


    /**
     * Gets the serviceClassNew value for this UpdateCSProfileRequestDataHeaderUpdateServiceClass.
     * 
     * @return serviceClassNew
     */
    public String getServiceClassNew() {
        return serviceClassNew;
    }


    /**
     * Sets the serviceClassNew value for this UpdateCSProfileRequestDataHeaderUpdateServiceClass.
     * 
     * @param serviceClassNew
     */
    public void setServiceClassNew(String serviceClassNew) {
        this.serviceClassNew = serviceClassNew;
    }


    /**
     * Gets the serviceClassTemporary value for this UpdateCSProfileRequestDataHeaderUpdateServiceClass.
     * 
     * @return serviceClassTemporary
     */
    public String getServiceClassTemporary() {
        return serviceClassTemporary;
    }


    /**
     * Sets the serviceClassTemporary value for this UpdateCSProfileRequestDataHeaderUpdateServiceClass.
     * 
     * @param serviceClassTemporary
     */
    public void setServiceClassTemporary(String serviceClassTemporary) {
        this.serviceClassTemporary = serviceClassTemporary;
    }


    /**
     * Gets the serviceClassTemporaryExpiryDate value for this UpdateCSProfileRequestDataHeaderUpdateServiceClass.
     * 
     * @return serviceClassTemporaryExpiryDate
     */
    public String getServiceClassTemporaryExpiryDate() {
        return serviceClassTemporaryExpiryDate;
    }


    /**
     * Sets the serviceClassTemporaryExpiryDate value for this UpdateCSProfileRequestDataHeaderUpdateServiceClass.
     * 
     * @param serviceClassTemporaryExpiryDate
     */
    public void setServiceClassTemporaryExpiryDate(String serviceClassTemporaryExpiryDate) {
        this.serviceClassTemporaryExpiryDate = serviceClassTemporaryExpiryDate;
    }


    /**
     * Gets the serviceClassTemporaryNew value for this UpdateCSProfileRequestDataHeaderUpdateServiceClass.
     * 
     * @return serviceClassTemporaryNew
     */
    public String getServiceClassTemporaryNew() {
        return serviceClassTemporaryNew;
    }


    /**
     * Sets the serviceClassTemporaryNew value for this UpdateCSProfileRequestDataHeaderUpdateServiceClass.
     * 
     * @param serviceClassTemporaryNew
     */
    public void setServiceClassTemporaryNew(String serviceClassTemporaryNew) {
        this.serviceClassTemporaryNew = serviceClassTemporaryNew;
    }


    /**
     * Gets the serviceClassTemporaryNewExpiryDate value for this UpdateCSProfileRequestDataHeaderUpdateServiceClass.
     * 
     * @return serviceClassTemporaryNewExpiryDate
     */
    public String getServiceClassTemporaryNewExpiryDate() {
        return serviceClassTemporaryNewExpiryDate;
    }


    /**
     * Sets the serviceClassTemporaryNewExpiryDate value for this UpdateCSProfileRequestDataHeaderUpdateServiceClass.
     * 
     * @param serviceClassTemporaryNewExpiryDate
     */
    public void setServiceClassTemporaryNewExpiryDate(String serviceClassTemporaryNewExpiryDate) {
        this.serviceClassTemporaryNewExpiryDate = serviceClassTemporaryNewExpiryDate;
    }


    /**
     * Gets the serviceClassValidationFlag value for this UpdateCSProfileRequestDataHeaderUpdateServiceClass.
     * 
     * @return serviceClassValidationFlag
     */
    public String getServiceClassValidationFlag() {
        return serviceClassValidationFlag;
    }


    /**
     * Sets the serviceClassValidationFlag value for this UpdateCSProfileRequestDataHeaderUpdateServiceClass.
     * 
     * @param serviceClassValidationFlag
     */
    public void setServiceClassValidationFlag(String serviceClassValidationFlag) {
        this.serviceClassValidationFlag = serviceClassValidationFlag;
    }


    /**
     * Gets the externalData1 value for this UpdateCSProfileRequestDataHeaderUpdateServiceClass.
     * 
     * @return externalData1
     */
    public String getExternalData1() {
        return externalData1;
    }


    /**
     * Sets the externalData1 value for this UpdateCSProfileRequestDataHeaderUpdateServiceClass.
     * 
     * @param externalData1
     */
    public void setExternalData1(String externalData1) {
        this.externalData1 = externalData1;
    }


    /**
     * Gets the externalData2 value for this UpdateCSProfileRequestDataHeaderUpdateServiceClass.
     * 
     * @return externalData2
     */
    public String getExternalData2() {
        return externalData2;
    }


    /**
     * Sets the externalData2 value for this UpdateCSProfileRequestDataHeaderUpdateServiceClass.
     * 
     * @param externalData2
     */
    public void setExternalData2(String externalData2) {
        this.externalData2 = externalData2;
    }


    /**
     * Gets the chargingRequestInformation value for this UpdateCSProfileRequestDataHeaderUpdateServiceClass.
     * 
     * @return chargingRequestInformation
     */
    public ae.etisalat.www.Middleware.INCommunicationManagement.UpdateCSProfileRequest_xsd.UpdateCSProfileRequestDataHeaderUpdateServiceClassChargingRequestInformation getChargingRequestInformation() {
        return chargingRequestInformation;
    }


    /**
     * Sets the chargingRequestInformation value for this UpdateCSProfileRequestDataHeaderUpdateServiceClass.
     * 
     * @param chargingRequestInformation
     */
    public void setChargingRequestInformation(ae.etisalat.www.Middleware.INCommunicationManagement.UpdateCSProfileRequest_xsd.UpdateCSProfileRequestDataHeaderUpdateServiceClassChargingRequestInformation chargingRequestInformation) {
        this.chargingRequestInformation = chargingRequestInformation;
    }


    /**
     * Gets the negotiatedCapabilities value for this UpdateCSProfileRequestDataHeaderUpdateServiceClass.
     * 
     * @return negotiatedCapabilities
     */
    public String getNegotiatedCapabilities() {
        return negotiatedCapabilities;
    }


    /**
     * Sets the negotiatedCapabilities value for this UpdateCSProfileRequestDataHeaderUpdateServiceClass.
     * 
     * @param negotiatedCapabilities
     */
    public void setNegotiatedCapabilities(String negotiatedCapabilities) {
        this.negotiatedCapabilities = negotiatedCapabilities;
    }


    /**
     * Gets the additionalInfo value for this UpdateCSProfileRequestDataHeaderUpdateServiceClass.
     * 
     * @return additionalInfo
     */
    public ae.etisalat.www.Middleware.SharedResources.Common.Common_xsd.AdditionalInfo[] getAdditionalInfo() {
        return additionalInfo;
    }


    /**
     * Sets the additionalInfo value for this UpdateCSProfileRequestDataHeaderUpdateServiceClass.
     * 
     * @param additionalInfo
     */
    public void setAdditionalInfo(ae.etisalat.www.Middleware.SharedResources.Common.Common_xsd.AdditionalInfo[] additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public ae.etisalat.www.Middleware.SharedResources.Common.Common_xsd.AdditionalInfo getAdditionalInfo(int i) {
        return this.additionalInfo[i];
    }

    public void setAdditionalInfo(int i, ae.etisalat.www.Middleware.SharedResources.Common.Common_xsd.AdditionalInfo _value) {
        this.additionalInfo[i] = _value;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof UpdateCSProfileRequestDataHeaderUpdateServiceClass)) return false;
        UpdateCSProfileRequestDataHeaderUpdateServiceClass other = (UpdateCSProfileRequestDataHeaderUpdateServiceClass) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.subscriberNumberNAI==null && other.getSubscriberNumberNAI()==null) || 
             (this.subscriberNumberNAI!=null &&
              this.subscriberNumberNAI.equals(other.getSubscriberNumberNAI()))) &&
            ((this.subscriberNumber==null && other.getSubscriberNumber()==null) || 
             (this.subscriberNumber!=null &&
              this.subscriberNumber.equals(other.getSubscriberNumber()))) &&
            ((this.originOperatorID==null && other.getOriginOperatorID()==null) || 
             (this.originOperatorID!=null &&
              this.originOperatorID.equals(other.getOriginOperatorID()))) &&
            ((this.serviceClassAction==null && other.getServiceClassAction()==null) || 
             (this.serviceClassAction!=null &&
              this.serviceClassAction.equals(other.getServiceClassAction()))) &&
            ((this.serviceClassCurrent==null && other.getServiceClassCurrent()==null) || 
             (this.serviceClassCurrent!=null &&
              this.serviceClassCurrent.equals(other.getServiceClassCurrent()))) &&
            ((this.serviceClassNew==null && other.getServiceClassNew()==null) || 
             (this.serviceClassNew!=null &&
              this.serviceClassNew.equals(other.getServiceClassNew()))) &&
            ((this.serviceClassTemporary==null && other.getServiceClassTemporary()==null) || 
             (this.serviceClassTemporary!=null &&
              this.serviceClassTemporary.equals(other.getServiceClassTemporary()))) &&
            ((this.serviceClassTemporaryExpiryDate==null && other.getServiceClassTemporaryExpiryDate()==null) || 
             (this.serviceClassTemporaryExpiryDate!=null &&
              this.serviceClassTemporaryExpiryDate.equals(other.getServiceClassTemporaryExpiryDate()))) &&
            ((this.serviceClassTemporaryNew==null && other.getServiceClassTemporaryNew()==null) || 
             (this.serviceClassTemporaryNew!=null &&
              this.serviceClassTemporaryNew.equals(other.getServiceClassTemporaryNew()))) &&
            ((this.serviceClassTemporaryNewExpiryDate==null && other.getServiceClassTemporaryNewExpiryDate()==null) || 
             (this.serviceClassTemporaryNewExpiryDate!=null &&
              this.serviceClassTemporaryNewExpiryDate.equals(other.getServiceClassTemporaryNewExpiryDate()))) &&
            ((this.serviceClassValidationFlag==null && other.getServiceClassValidationFlag()==null) || 
             (this.serviceClassValidationFlag!=null &&
              this.serviceClassValidationFlag.equals(other.getServiceClassValidationFlag()))) &&
            ((this.externalData1==null && other.getExternalData1()==null) || 
             (this.externalData1!=null &&
              this.externalData1.equals(other.getExternalData1()))) &&
            ((this.externalData2==null && other.getExternalData2()==null) || 
             (this.externalData2!=null &&
              this.externalData2.equals(other.getExternalData2()))) &&
            ((this.chargingRequestInformation==null && other.getChargingRequestInformation()==null) || 
             (this.chargingRequestInformation!=null &&
              this.chargingRequestInformation.equals(other.getChargingRequestInformation()))) &&
            ((this.negotiatedCapabilities==null && other.getNegotiatedCapabilities()==null) || 
             (this.negotiatedCapabilities!=null &&
              this.negotiatedCapabilities.equals(other.getNegotiatedCapabilities()))) &&
            ((this.additionalInfo==null && other.getAdditionalInfo()==null) || 
             (this.additionalInfo!=null &&
              java.util.Arrays.equals(this.additionalInfo, other.getAdditionalInfo())));
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
        if (getSubscriberNumberNAI() != null) {
            _hashCode += getSubscriberNumberNAI().hashCode();
        }
        if (getSubscriberNumber() != null) {
            _hashCode += getSubscriberNumber().hashCode();
        }
        if (getOriginOperatorID() != null) {
            _hashCode += getOriginOperatorID().hashCode();
        }
        if (getServiceClassAction() != null) {
            _hashCode += getServiceClassAction().hashCode();
        }
        if (getServiceClassCurrent() != null) {
            _hashCode += getServiceClassCurrent().hashCode();
        }
        if (getServiceClassNew() != null) {
            _hashCode += getServiceClassNew().hashCode();
        }
        if (getServiceClassTemporary() != null) {
            _hashCode += getServiceClassTemporary().hashCode();
        }
        if (getServiceClassTemporaryExpiryDate() != null) {
            _hashCode += getServiceClassTemporaryExpiryDate().hashCode();
        }
        if (getServiceClassTemporaryNew() != null) {
            _hashCode += getServiceClassTemporaryNew().hashCode();
        }
        if (getServiceClassTemporaryNewExpiryDate() != null) {
            _hashCode += getServiceClassTemporaryNewExpiryDate().hashCode();
        }
        if (getServiceClassValidationFlag() != null) {
            _hashCode += getServiceClassValidationFlag().hashCode();
        }
        if (getExternalData1() != null) {
            _hashCode += getExternalData1().hashCode();
        }
        if (getExternalData2() != null) {
            _hashCode += getExternalData2().hashCode();
        }
        if (getChargingRequestInformation() != null) {
            _hashCode += getChargingRequestInformation().hashCode();
        }
        if (getNegotiatedCapabilities() != null) {
            _hashCode += getNegotiatedCapabilities().hashCode();
        }
        if (getAdditionalInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAdditionalInfo());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getAdditionalInfo(), i);
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
        new org.apache.axis.description.TypeDesc(UpdateCSProfileRequestDataHeaderUpdateServiceClass.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileRequest.xsd", ">>>UpdateCSProfileRequest>DataHeader>UpdateServiceClass"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriberNumberNAI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileRequest.xsd", "SubscriberNumberNAI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriberNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileRequest.xsd", "SubscriberNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originOperatorID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileRequest.xsd", "OriginOperatorID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceClassAction");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileRequest.xsd", "ServiceClassAction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceClassCurrent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileRequest.xsd", "ServiceClassCurrent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceClassNew");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileRequest.xsd", "ServiceClassNew"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceClassTemporary");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileRequest.xsd", "ServiceClassTemporary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceClassTemporaryExpiryDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileRequest.xsd", "ServiceClassTemporaryExpiryDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceClassTemporaryNew");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileRequest.xsd", "ServiceClassTemporaryNew"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceClassTemporaryNewExpiryDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileRequest.xsd", "ServiceClassTemporaryNewExpiryDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceClassValidationFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileRequest.xsd", "ServiceClassValidationFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalData1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileRequest.xsd", "ExternalData1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalData2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileRequest.xsd", "ExternalData2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargingRequestInformation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileRequest.xsd", "ChargingRequestInformation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileRequest.xsd", ">>>>UpdateCSProfileRequest>DataHeader>UpdateServiceClass>ChargingRequestInformation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("negotiatedCapabilities");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileRequest.xsd", "NegotiatedCapabilities"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/SharedResources/Common/Common.xsd", "AdditionalInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/SharedResources/Common/Common.xsd", "AdditionalInfo"));
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
