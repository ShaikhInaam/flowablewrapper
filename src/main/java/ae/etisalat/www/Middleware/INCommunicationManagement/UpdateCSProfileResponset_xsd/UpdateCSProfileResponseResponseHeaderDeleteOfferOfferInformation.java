/**
 * UpdateCSProfileResponseResponseHeaderDeleteOfferOfferInformation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ae.etisalat.www.Middleware.INCommunicationManagement.UpdateCSProfileResponset_xsd;

public class UpdateCSProfileResponseResponseHeaderDeleteOfferOfferInformation  implements java.io.Serializable {
    private String offerID;

    private String startDate;

    private String expiryDate;

    private String startDateTime;

    private String expiryDateTime;

    private String pamServiceID;

    private UpdateCSProfileResponseResponseHeaderDeleteOfferOfferInformationDedicatedAccountInformation[] dedicatedAccountInformation;

    private UpdateCSProfileResponseResponseHeaderDeleteOfferOfferInformationFafInformationList[] fafInformationList;

    private String offerType;

    private String offerState;

    private String offerProviderID;

    private String productID;

    private UpdateCSProfileResponseResponseHeaderDeleteOfferOfferInformationUsageCounterUsageThresholdInformation[] usageCounterUsageThresholdInformation;

    private UpdateCSProfileResponseResponseHeaderDeleteOfferOfferInformationAggregatedOfferInformationAggregatedBalanceInformation[][] aggregatedOfferInformation;

    public UpdateCSProfileResponseResponseHeaderDeleteOfferOfferInformation() {
    }

    public UpdateCSProfileResponseResponseHeaderDeleteOfferOfferInformation(
           String offerID,
           String startDate,
           String expiryDate,
           String startDateTime,
           String expiryDateTime,
           String pamServiceID,
           UpdateCSProfileResponseResponseHeaderDeleteOfferOfferInformationDedicatedAccountInformation[] dedicatedAccountInformation,
           UpdateCSProfileResponseResponseHeaderDeleteOfferOfferInformationFafInformationList[] fafInformationList,
           String offerType,
           String offerState,
           String offerProviderID,
           String productID,
           UpdateCSProfileResponseResponseHeaderDeleteOfferOfferInformationUsageCounterUsageThresholdInformation[] usageCounterUsageThresholdInformation,
           UpdateCSProfileResponseResponseHeaderDeleteOfferOfferInformationAggregatedOfferInformationAggregatedBalanceInformation[][] aggregatedOfferInformation) {
           this.offerID = offerID;
           this.startDate = startDate;
           this.expiryDate = expiryDate;
           this.startDateTime = startDateTime;
           this.expiryDateTime = expiryDateTime;
           this.pamServiceID = pamServiceID;
           this.dedicatedAccountInformation = dedicatedAccountInformation;
           this.fafInformationList = fafInformationList;
           this.offerType = offerType;
           this.offerState = offerState;
           this.offerProviderID = offerProviderID;
           this.productID = productID;
           this.usageCounterUsageThresholdInformation = usageCounterUsageThresholdInformation;
           this.aggregatedOfferInformation = aggregatedOfferInformation;
    }


    /**
     * Gets the offerID value for this UpdateCSProfileResponseResponseHeaderDeleteOfferOfferInformation.
     * 
     * @return offerID
     */
    public String getOfferID() {
        return offerID;
    }


    /**
     * Sets the offerID value for this UpdateCSProfileResponseResponseHeaderDeleteOfferOfferInformation.
     * 
     * @param offerID
     */
    public void setOfferID(String offerID) {
        this.offerID = offerID;
    }


    /**
     * Gets the startDate value for this UpdateCSProfileResponseResponseHeaderDeleteOfferOfferInformation.
     * 
     * @return startDate
     */
    public String getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this UpdateCSProfileResponseResponseHeaderDeleteOfferOfferInformation.
     * 
     * @param startDate
     */
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the expiryDate value for this UpdateCSProfileResponseResponseHeaderDeleteOfferOfferInformation.
     * 
     * @return expiryDate
     */
    public String getExpiryDate() {
        return expiryDate;
    }


    /**
     * Sets the expiryDate value for this UpdateCSProfileResponseResponseHeaderDeleteOfferOfferInformation.
     * 
     * @param expiryDate
     */
    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }


    /**
     * Gets the startDateTime value for this UpdateCSProfileResponseResponseHeaderDeleteOfferOfferInformation.
     * 
     * @return startDateTime
     */
    public String getStartDateTime() {
        return startDateTime;
    }


    /**
     * Sets the startDateTime value for this UpdateCSProfileResponseResponseHeaderDeleteOfferOfferInformation.
     * 
     * @param startDateTime
     */
    public void setStartDateTime(String startDateTime) {
        this.startDateTime = startDateTime;
    }


    /**
     * Gets the expiryDateTime value for this UpdateCSProfileResponseResponseHeaderDeleteOfferOfferInformation.
     * 
     * @return expiryDateTime
     */
    public String getExpiryDateTime() {
        return expiryDateTime;
    }


    /**
     * Sets the expiryDateTime value for this UpdateCSProfileResponseResponseHeaderDeleteOfferOfferInformation.
     * 
     * @param expiryDateTime
     */
    public void setExpiryDateTime(String expiryDateTime) {
        this.expiryDateTime = expiryDateTime;
    }


    /**
     * Gets the pamServiceID value for this UpdateCSProfileResponseResponseHeaderDeleteOfferOfferInformation.
     * 
     * @return pamServiceID
     */
    public String getPamServiceID() {
        return pamServiceID;
    }


    /**
     * Sets the pamServiceID value for this UpdateCSProfileResponseResponseHeaderDeleteOfferOfferInformation.
     * 
     * @param pamServiceID
     */
    public void setPamServiceID(String pamServiceID) {
        this.pamServiceID = pamServiceID;
    }


    /**
     * Gets the dedicatedAccountInformation value for this UpdateCSProfileResponseResponseHeaderDeleteOfferOfferInformation.
     * 
     * @return dedicatedAccountInformation
     */
    public UpdateCSProfileResponseResponseHeaderDeleteOfferOfferInformationDedicatedAccountInformation[] getDedicatedAccountInformation() {
        return dedicatedAccountInformation;
    }


    /**
     * Sets the dedicatedAccountInformation value for this UpdateCSProfileResponseResponseHeaderDeleteOfferOfferInformation.
     * 
     * @param dedicatedAccountInformation
     */
    public void setDedicatedAccountInformation(UpdateCSProfileResponseResponseHeaderDeleteOfferOfferInformationDedicatedAccountInformation[] dedicatedAccountInformation) {
        this.dedicatedAccountInformation = dedicatedAccountInformation;
    }

    public UpdateCSProfileResponseResponseHeaderDeleteOfferOfferInformationDedicatedAccountInformation getDedicatedAccountInformation(int i) {
        return this.dedicatedAccountInformation[i];
    }

    public void setDedicatedAccountInformation(int i, UpdateCSProfileResponseResponseHeaderDeleteOfferOfferInformationDedicatedAccountInformation _value) {
        this.dedicatedAccountInformation[i] = _value;
    }


    /**
     * Gets the fafInformationList value for this UpdateCSProfileResponseResponseHeaderDeleteOfferOfferInformation.
     * 
     * @return fafInformationList
     */
    public UpdateCSProfileResponseResponseHeaderDeleteOfferOfferInformationFafInformationList[] getFafInformationList() {
        return fafInformationList;
    }


    /**
     * Sets the fafInformationList value for this UpdateCSProfileResponseResponseHeaderDeleteOfferOfferInformation.
     * 
     * @param fafInformationList
     */
    public void setFafInformationList(UpdateCSProfileResponseResponseHeaderDeleteOfferOfferInformationFafInformationList[] fafInformationList) {
        this.fafInformationList = fafInformationList;
    }

    public UpdateCSProfileResponseResponseHeaderDeleteOfferOfferInformationFafInformationList getFafInformationList(int i) {
        return this.fafInformationList[i];
    }

    public void setFafInformationList(int i, UpdateCSProfileResponseResponseHeaderDeleteOfferOfferInformationFafInformationList _value) {
        this.fafInformationList[i] = _value;
    }


    /**
     * Gets the offerType value for this UpdateCSProfileResponseResponseHeaderDeleteOfferOfferInformation.
     * 
     * @return offerType
     */
    public String getOfferType() {
        return offerType;
    }


    /**
     * Sets the offerType value for this UpdateCSProfileResponseResponseHeaderDeleteOfferOfferInformation.
     * 
     * @param offerType
     */
    public void setOfferType(String offerType) {
        this.offerType = offerType;
    }


    /**
     * Gets the offerState value for this UpdateCSProfileResponseResponseHeaderDeleteOfferOfferInformation.
     * 
     * @return offerState
     */
    public String getOfferState() {
        return offerState;
    }


    /**
     * Sets the offerState value for this UpdateCSProfileResponseResponseHeaderDeleteOfferOfferInformation.
     * 
     * @param offerState
     */
    public void setOfferState(String offerState) {
        this.offerState = offerState;
    }


    /**
     * Gets the offerProviderID value for this UpdateCSProfileResponseResponseHeaderDeleteOfferOfferInformation.
     * 
     * @return offerProviderID
     */
    public String getOfferProviderID() {
        return offerProviderID;
    }


    /**
     * Sets the offerProviderID value for this UpdateCSProfileResponseResponseHeaderDeleteOfferOfferInformation.
     * 
     * @param offerProviderID
     */
    public void setOfferProviderID(String offerProviderID) {
        this.offerProviderID = offerProviderID;
    }


    /**
     * Gets the productID value for this UpdateCSProfileResponseResponseHeaderDeleteOfferOfferInformation.
     * 
     * @return productID
     */
    public String getProductID() {
        return productID;
    }


    /**
     * Sets the productID value for this UpdateCSProfileResponseResponseHeaderDeleteOfferOfferInformation.
     * 
     * @param productID
     */
    public void setProductID(String productID) {
        this.productID = productID;
    }


    /**
     * Gets the usageCounterUsageThresholdInformation value for this UpdateCSProfileResponseResponseHeaderDeleteOfferOfferInformation.
     * 
     * @return usageCounterUsageThresholdInformation
     */
    public UpdateCSProfileResponseResponseHeaderDeleteOfferOfferInformationUsageCounterUsageThresholdInformation[] getUsageCounterUsageThresholdInformation() {
        return usageCounterUsageThresholdInformation;
    }


    /**
     * Sets the usageCounterUsageThresholdInformation value for this UpdateCSProfileResponseResponseHeaderDeleteOfferOfferInformation.
     * 
     * @param usageCounterUsageThresholdInformation
     */
    public void setUsageCounterUsageThresholdInformation(UpdateCSProfileResponseResponseHeaderDeleteOfferOfferInformationUsageCounterUsageThresholdInformation[] usageCounterUsageThresholdInformation) {
        this.usageCounterUsageThresholdInformation = usageCounterUsageThresholdInformation;
    }

    public UpdateCSProfileResponseResponseHeaderDeleteOfferOfferInformationUsageCounterUsageThresholdInformation getUsageCounterUsageThresholdInformation(int i) {
        return this.usageCounterUsageThresholdInformation[i];
    }

    public void setUsageCounterUsageThresholdInformation(int i, UpdateCSProfileResponseResponseHeaderDeleteOfferOfferInformationUsageCounterUsageThresholdInformation _value) {
        this.usageCounterUsageThresholdInformation[i] = _value;
    }


    /**
     * Gets the aggregatedOfferInformation value for this UpdateCSProfileResponseResponseHeaderDeleteOfferOfferInformation.
     * 
     * @return aggregatedOfferInformation
     */
    public UpdateCSProfileResponseResponseHeaderDeleteOfferOfferInformationAggregatedOfferInformationAggregatedBalanceInformation[][] getAggregatedOfferInformation() {
        return aggregatedOfferInformation;
    }


    /**
     * Sets the aggregatedOfferInformation value for this UpdateCSProfileResponseResponseHeaderDeleteOfferOfferInformation.
     * 
     * @param aggregatedOfferInformation
     */
    public void setAggregatedOfferInformation(UpdateCSProfileResponseResponseHeaderDeleteOfferOfferInformationAggregatedOfferInformationAggregatedBalanceInformation[][] aggregatedOfferInformation) {
        this.aggregatedOfferInformation = aggregatedOfferInformation;
    }

    public UpdateCSProfileResponseResponseHeaderDeleteOfferOfferInformationAggregatedOfferInformationAggregatedBalanceInformation[] getAggregatedOfferInformation(int i) {
        return this.aggregatedOfferInformation[i];
    }

    public void setAggregatedOfferInformation(int i, UpdateCSProfileResponseResponseHeaderDeleteOfferOfferInformationAggregatedOfferInformationAggregatedBalanceInformation[] _value) {
        this.aggregatedOfferInformation[i] = _value;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof UpdateCSProfileResponseResponseHeaderDeleteOfferOfferInformation)) return false;
        UpdateCSProfileResponseResponseHeaderDeleteOfferOfferInformation other = (UpdateCSProfileResponseResponseHeaderDeleteOfferOfferInformation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.offerID==null && other.getOfferID()==null) || 
             (this.offerID!=null &&
              this.offerID.equals(other.getOfferID()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.expiryDate==null && other.getExpiryDate()==null) || 
             (this.expiryDate!=null &&
              this.expiryDate.equals(other.getExpiryDate()))) &&
            ((this.startDateTime==null && other.getStartDateTime()==null) || 
             (this.startDateTime!=null &&
              this.startDateTime.equals(other.getStartDateTime()))) &&
            ((this.expiryDateTime==null && other.getExpiryDateTime()==null) || 
             (this.expiryDateTime!=null &&
              this.expiryDateTime.equals(other.getExpiryDateTime()))) &&
            ((this.pamServiceID==null && other.getPamServiceID()==null) || 
             (this.pamServiceID!=null &&
              this.pamServiceID.equals(other.getPamServiceID()))) &&
            ((this.dedicatedAccountInformation==null && other.getDedicatedAccountInformation()==null) || 
             (this.dedicatedAccountInformation!=null &&
              java.util.Arrays.equals(this.dedicatedAccountInformation, other.getDedicatedAccountInformation()))) &&
            ((this.fafInformationList==null && other.getFafInformationList()==null) || 
             (this.fafInformationList!=null &&
              java.util.Arrays.equals(this.fafInformationList, other.getFafInformationList()))) &&
            ((this.offerType==null && other.getOfferType()==null) || 
             (this.offerType!=null &&
              this.offerType.equals(other.getOfferType()))) &&
            ((this.offerState==null && other.getOfferState()==null) || 
             (this.offerState!=null &&
              this.offerState.equals(other.getOfferState()))) &&
            ((this.offerProviderID==null && other.getOfferProviderID()==null) || 
             (this.offerProviderID!=null &&
              this.offerProviderID.equals(other.getOfferProviderID()))) &&
            ((this.productID==null && other.getProductID()==null) || 
             (this.productID!=null &&
              this.productID.equals(other.getProductID()))) &&
            ((this.usageCounterUsageThresholdInformation==null && other.getUsageCounterUsageThresholdInformation()==null) || 
             (this.usageCounterUsageThresholdInformation!=null &&
              java.util.Arrays.equals(this.usageCounterUsageThresholdInformation, other.getUsageCounterUsageThresholdInformation()))) &&
            ((this.aggregatedOfferInformation==null && other.getAggregatedOfferInformation()==null) || 
             (this.aggregatedOfferInformation!=null &&
              java.util.Arrays.equals(this.aggregatedOfferInformation, other.getAggregatedOfferInformation())));
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
        if (getOfferID() != null) {
            _hashCode += getOfferID().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getExpiryDate() != null) {
            _hashCode += getExpiryDate().hashCode();
        }
        if (getStartDateTime() != null) {
            _hashCode += getStartDateTime().hashCode();
        }
        if (getExpiryDateTime() != null) {
            _hashCode += getExpiryDateTime().hashCode();
        }
        if (getPamServiceID() != null) {
            _hashCode += getPamServiceID().hashCode();
        }
        if (getDedicatedAccountInformation() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDedicatedAccountInformation());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getDedicatedAccountInformation(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFafInformationList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFafInformationList());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getFafInformationList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOfferType() != null) {
            _hashCode += getOfferType().hashCode();
        }
        if (getOfferState() != null) {
            _hashCode += getOfferState().hashCode();
        }
        if (getOfferProviderID() != null) {
            _hashCode += getOfferProviderID().hashCode();
        }
        if (getProductID() != null) {
            _hashCode += getProductID().hashCode();
        }
        if (getUsageCounterUsageThresholdInformation() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUsageCounterUsageThresholdInformation());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getUsageCounterUsageThresholdInformation(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAggregatedOfferInformation() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAggregatedOfferInformation());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getAggregatedOfferInformation(), i);
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
        new org.apache.axis.description.TypeDesc(UpdateCSProfileResponseResponseHeaderDeleteOfferOfferInformation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileResponset.xsd", ">>>>UpdateCSProfileResponse>ResponseHeader>DeleteOffer>OfferInformation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offerID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileResponset.xsd", "OfferID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileResponset.xsd", "StartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expiryDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileResponset.xsd", "ExpiryDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileResponset.xsd", "StartDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expiryDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileResponset.xsd", "ExpiryDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pamServiceID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileResponset.xsd", "PamServiceID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dedicatedAccountInformation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileResponset.xsd", "DedicatedAccountInformation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileResponset.xsd", ">>>>>UpdateCSProfileResponse>ResponseHeader>DeleteOffer>OfferInformation>DedicatedAccountInformation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fafInformationList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileResponset.xsd", "FafInformationList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileResponset.xsd", ">>>>>UpdateCSProfileResponse>ResponseHeader>DeleteOffer>OfferInformation>FafInformationList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offerType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileResponset.xsd", "OfferType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offerState");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileResponset.xsd", "OfferState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offerProviderID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileResponset.xsd", "OfferProviderID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileResponset.xsd", "ProductID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usageCounterUsageThresholdInformation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileResponset.xsd", "UsageCounterUsageThresholdInformation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileResponset.xsd", ">>>>>UpdateCSProfileResponse>ResponseHeader>DeleteOffer>OfferInformation>UsageCounterUsageThresholdInformation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aggregatedOfferInformation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileResponset.xsd", "AggregatedOfferInformation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/UpdateCSProfileResponset.xsd", ">>>>>UpdateCSProfileResponse>ResponseHeader>DeleteOffer>OfferInformation>AggregatedOfferInformation"));
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
