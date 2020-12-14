/**
 * UpdateCSProfileRequestDataHeader.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ae.etisalat.www.Middleware.INCommunicationManagement.UpdateCSProfileRequest_xsd;

public class UpdateCSProfileRequestDataHeader  implements java.io.Serializable {
    private String noOfAccount;

    private String actionType;

    private String modeType;

    private ae.etisalat.www.Middleware.INCommunicationManagement.UpdateCSProfileRequest_xsd.UpdateCSProfileRequestDataHeaderDeleteOffer deleteOffer;

    private ae.etisalat.www.Middleware.INCommunicationManagement.UpdateCSProfileRequest_xsd.UpdateCSProfileRequestDataHeaderUpdateServiceClass updateServiceClass;

    private Object requestType;

    private ae.etisalat.www.Middleware.INCommunicationManagement.UpdateCSProfileRequest_xsd.UpdateCSProfileRequestDataHeaderAccountDetails[] accountDetails;

    private ae.etisalat.www.Middleware.INCommunicationManagement.UpdateCSProfileRequest_xsd.UpdateCSProfileRequestDataHeaderAddtionalInfo[] addtionalInfo;

    public UpdateCSProfileRequestDataHeader() {
    }

    public UpdateCSProfileRequestDataHeader(
           String noOfAccount,
           String actionType,
           String modeType,
           ae.etisalat.www.Middleware.INCommunicationManagement.UpdateCSProfileRequest_xsd.UpdateCSProfileRequestDataHeaderDeleteOffer deleteOffer,
           ae.etisalat.www.Middleware.INCommunicationManagement.UpdateCSProfileRequest_xsd.UpdateCSProfileRequestDataHeaderUpdateServiceClass updateServiceClass,
           Object requestType,
           ae.etisalat.www.Middleware.INCommunicationManagement.UpdateCSProfileRequest_xsd.UpdateCSProfileRequestDataHeaderAccountDetails[] accountDetails,
           ae.etisalat.www.Middleware.INCommunicationManagement.UpdateCSProfileRequest_xsd.UpdateCSProfileRequestDataHeaderAddtionalInfo[] addtionalInfo) {
           this.noOfAccount = noOfAccount;
           this.actionType = actionType;
           this.modeType = modeType;
           this.deleteOffer = deleteOffer;
           this.updateServiceClass = updateServiceClass;
           this.requestType = requestType;
           this.accountDetails = accountDetails;
           this.addtionalInfo = addtionalInfo;
    }


    /**
     * Gets the noOfAccount value for this UpdateCSProfileRequestDataHeader.
     * 
     * @return noOfAccount
     */
    public String getNoOfAccount() {
        return noOfAccount;
    }


    /**
     * Sets the noOfAccount value for this UpdateCSProfileRequestDataHeader.
     * 
     * @param noOfAccount
     */
    public void setNoOfAccount(String noOfAccount) {
        this.noOfAccount = noOfAccount;
    }


    /**
     * Gets the actionType value for this UpdateCSProfileRequestDataHeader.
     * 
     * @return actionType
     */
    public String getActionType() {
        return actionType;
    }


    /**
     * Sets the actionType value for this UpdateCSProfileRequestDataHeader.
     * 
     * @param actionType
     */
    public void setActionType(String actionType) {
        this.actionType = actionType;
    }


    /**
     * Gets the modeType value for this UpdateCSProfileRequestDataHeader.
     * 
     * @return modeType
     */
    public String getModeType() {
        return modeType;
    }


    /**
     * Sets the modeType value for this UpdateCSProfileRequestDataHeader.
     * 
     * @param modeType
     */
    public void setModeType(String modeType) {
        this.modeType = modeType;
    }


    /**
     * Gets the deleteOffer value for this UpdateCSProfileRequestDataHeader.
     * 
     * @return deleteOffer
     */
    public ae.etisalat.www.Middleware.INCommunicationManagement.UpdateCSProfileRequest_xsd.UpdateCSProfileRequestDataHeaderDeleteOffer getDeleteOffer() {
        return deleteOffer;
    }


    /**
     * Sets the deleteOffer value for this UpdateCSProfileRequestDataHeader.
     * 
     * @param deleteOffer
     */
    public void setDeleteOffer(ae.etisalat.www.Middleware.INCommunicationManagement.UpdateCSProfileRequest_xsd.UpdateCSProfileRequestDataHeaderDeleteOffer deleteOffer) {
        this.deleteOffer = deleteOffer;
    }


    /**
     * Gets the updateServiceClass value for this UpdateCSProfileRequestDataHeader.
     * 
     * @return updateServiceClass
     */
    public ae.etisalat.www.Middleware.INCommunicationManagement.UpdateCSProfileRequest_xsd.UpdateCSProfileRequestDataHeaderUpdateServiceClass getUpdateServiceClass() {
        return updateServiceClass;
    }


    /**
     * Sets the updateServiceClass value for this UpdateCSProfileRequestDataHeader.
     * 
     * @param updateServiceClass
     */
    public void setUpdateServiceClass(ae.etisalat.www.Middleware.INCommunicationManagement.UpdateCSProfileRequest_xsd.UpdateCSProfileRequestDataHeaderUpdateServiceClass updateServiceClass) {
        this.updateServiceClass = updateServiceClass;
    }


    /**
     * Gets the requestType value for this UpdateCSProfileRequestDataHeader.
     * 
     * @return requestType
     */
    public Object getRequestType() {
        return requestType;
    }


    /**
     * Sets the requestType value for this UpdateCSProfileRequestDataHeader.
     * 
     * @param requestType
     */
    public void setRequestType(Object requestType) {
        this.requestType = requestType;
    }


    /**
     * Gets the accountDetails value for this UpdateCSProfileRequestDataHeader.
     * 
     * @return accountDetails
     */
    public ae.etisalat.www.Middleware.INCommunicationManagement.UpdateCSProfileRequest_xsd.UpdateCSProfileRequestDataHeaderAccountDetails[] getAccountDetails() {
        return accountDetails;
    }


    /**
     * Sets the accountDetails value for this UpdateCSProfileRequestDataHeader.
     * 
     * @param accountDetails
     */
    public void setAccountDetails(ae.etisalat.www.Middleware.INCommunicationManagement.UpdateCSProfileRequest_xsd.UpdateCSProfileRequestDataHeaderAccountDetails[] accountDetails) {
        this.accountDetails = accountDetails;
    }

    public ae.etisalat.www.Middleware.INCommunicationManagement.UpdateCSProfileRequest_xsd.UpdateCSProfileRequestDataHeaderAccountDetails getAccountDetails(int i) {
        return this.accountDetails[i];
    }

    public void setAccountDetails(int i, ae.etisalat.www.Middleware.INCommunicationManagement.UpdateCSProfileRequest_xsd.UpdateCSProfileRequestDataHeaderAccountDetails _value) {
        this.accountDetails[i] = _value;
    }


    /**
     * Gets the addtionalInfo value for this UpdateCSProfileRequestDataHeader.
     * 
     * @return addtionalInfo
     */
    public ae.etisalat.www.Middleware.INCommunicationManagement.UpdateCSProfileRequest_xsd.UpdateCSProfileRequestDataHeaderAddtionalInfo[] getAddtionalInfo() {
        return addtionalInfo;
    }


    /**
     * Sets the addtionalInfo value for this UpdateCSProfileRequestDataHeader.
     * 
     * @param addtionalInfo
     */
    public void setAddtionalInfo(ae.etisalat.www.Middleware.INCommunicationManagement.UpdateCSProfileRequest_xsd.UpdateCSProfileRequestDataHeaderAddtionalInfo[] addtionalInfo) {
        this.addtionalInfo = addtionalInfo;
    }

    public ae.etisalat.www.Middleware.INCommunicationManagement.UpdateCSProfileRequest_xsd.UpdateCSProfileRequestDataHeaderAddtionalInfo getAddtionalInfo(int i) {
        return this.addtionalInfo[i];
    }

    public void setAddtionalInfo(int i, ae.etisalat.www.Middleware.INCommunicationManagement.UpdateCSProfileRequest_xsd.UpdateCSProfileRequestDataHeaderAddtionalInfo _value) {
        this.addtionalInfo[i] = _value;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof UpdateCSProfileRequestDataHeader)) return false;
        UpdateCSProfileRequestDataHeader other = (UpdateCSProfileRequestDataHeader) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.noOfAccount==null && other.getNoOfAccount()==null) || 
             (this.noOfAccount!=null &&
              this.noOfAccount.equals(other.getNoOfAccount()))) &&
            ((this.actionType==null && other.getActionType()==null) || 
             (this.actionType!=null &&
              this.actionType.equals(other.getActionType()))) &&
            ((this.modeType==null && other.getModeType()==null) || 
             (this.modeType!=null &&
              this.modeType.equals(other.getModeType()))) &&
            ((this.deleteOffer==null && other.getDeleteOffer()==null) || 
             (this.deleteOffer!=null &&
              this.deleteOffer.equals(other.getDeleteOffer()))) &&
            ((this.updateServiceClass==null && other.getUpdateServiceClass()==null) || 
             (this.updateServiceClass!=null &&
              this.updateServiceClass.equals(other.getUpdateServiceClass()))) &&
            ((this.requestType==null && other.getRequestType()==null) || 
             (this.requestType!=null &&
              this.requestType.equals(other.getRequestType()))) &&
            ((this.accountDetails==null && other.getAccountDetails()==null) || 
             (this.accountDetails!=null &&
              java.util.Arrays.equals(this.accountDetails, other.getAccountDetails()))) &&
            ((this.addtionalInfo==null && other.getAddtionalInfo()==null) || 
             (this.addtionalInfo!=null &&
              java.util.Arrays.equals(this.addtionalInfo, other.getAddtionalInfo())));
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
        if (getNoOfAccount() != null) {
            _hashCode += getNoOfAccount().hashCode();
        }
        if (getActionType() != null) {
            _hashCode += getActionType().hashCode();
        }
        if (getModeType() != null) {
            _hashCode += getModeType().hashCode();
        }
        if (getDeleteOffer() != null) {
            _hashCode += getDeleteOffer().hashCode();
        }
        if (getUpdateServiceClass() != null) {
            _hashCode += getUpdateServiceClass().hashCode();
        }
        if (getRequestType() != null) {
            _hashCode += getRequestType().hashCode();
        }
        if (getAccountDetails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAccountDetails());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getAccountDetails(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAddtionalInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAddtionalInfo());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getAddtionalInfo(), i);
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
        new org.apache.axis.description.TypeDesc(UpdateCSProfileRequestDataHeader.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileRequest.xsd", ">>UpdateCSProfileRequest>DataHeader"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noOfAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileRequest.xsd", "NoOfAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actionType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileRequest.xsd", "ActionType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modeType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileRequest.xsd", "ModeType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deleteOffer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileRequest.xsd", "DeleteOffer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileRequest.xsd", ">>>UpdateCSProfileRequest>DataHeader>DeleteOffer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateServiceClass");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileRequest.xsd", "UpdateServiceClass"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileRequest.xsd", ">>>UpdateCSProfileRequest>DataHeader>UpdateServiceClass"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileRequest.xsd", "RequestType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileRequest.xsd", "AccountDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileRequest.xsd", ">>>UpdateCSProfileRequest>DataHeader>AccountDetails"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addtionalInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileRequest.xsd", "AddtionalInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileRequest.xsd", ">>>UpdateCSProfileRequest>DataHeader>AddtionalInfo"));
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
