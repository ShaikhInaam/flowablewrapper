/**
 * OfferInformation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd;

public class OfferInformation  implements java.io.Serializable {
    private String offerID;

    private String startDate;

    private String expiryDate;

    private String startDateTime;

    private String expiryDateTime;

    private String pamServiceID;

    private String offerDesc;

    private OfferInformationAttributeInformationList[] attributeInformationList;

    private OfferInformationDedicatedAccountInformation[] dedicatedAccountInformation;

    private OfferInformationFafInformationList[] fafInformationList;

    private String offerType;

    private String offerState;

    private String offerProviderID;

    private String productID;

    private OfferInformationUsageCounterUsageThresholdInformation[] usageCounterUsageThresholdInformation;

    private OfferInformationAggregatedOfferInformation[] aggregatedOfferInformation;

    private OfferInformationTreeParameterSetInformationListTreeParameterSetInformation[] treeParameterSetInformationList;

    public OfferInformation() {
    }

    public OfferInformation(
           String offerID,
           String startDate,
           String expiryDate,
           String startDateTime,
           String expiryDateTime,
           String pamServiceID,
           String offerDesc,
           OfferInformationAttributeInformationList[] attributeInformationList,
           OfferInformationDedicatedAccountInformation[] dedicatedAccountInformation,
           OfferInformationFafInformationList[] fafInformationList,
           String offerType,
           String offerState,
           String offerProviderID,
           String productID,
           OfferInformationUsageCounterUsageThresholdInformation[] usageCounterUsageThresholdInformation,
           OfferInformationAggregatedOfferInformation[] aggregatedOfferInformation,
           OfferInformationTreeParameterSetInformationListTreeParameterSetInformation[] treeParameterSetInformationList) {
           this.offerID = offerID;
           this.startDate = startDate;
           this.expiryDate = expiryDate;
           this.startDateTime = startDateTime;
           this.expiryDateTime = expiryDateTime;
           this.pamServiceID = pamServiceID;
           this.offerDesc = offerDesc;
           this.attributeInformationList = attributeInformationList;
           this.dedicatedAccountInformation = dedicatedAccountInformation;
           this.fafInformationList = fafInformationList;
           this.offerType = offerType;
           this.offerState = offerState;
           this.offerProviderID = offerProviderID;
           this.productID = productID;
           this.usageCounterUsageThresholdInformation = usageCounterUsageThresholdInformation;
           this.aggregatedOfferInformation = aggregatedOfferInformation;
           this.treeParameterSetInformationList = treeParameterSetInformationList;
    }


    /**
     * Gets the offerID value for this OfferInformation.
     * 
     * @return offerID
     */
    public String getOfferID() {
        return offerID;
    }


    /**
     * Sets the offerID value for this OfferInformation.
     * 
     * @param offerID
     */
    public void setOfferID(String offerID) {
        this.offerID = offerID;
    }


    /**
     * Gets the startDate value for this OfferInformation.
     * 
     * @return startDate
     */
    public String getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this OfferInformation.
     * 
     * @param startDate
     */
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the expiryDate value for this OfferInformation.
     * 
     * @return expiryDate
     */
    public String getExpiryDate() {
        return expiryDate;
    }


    /**
     * Sets the expiryDate value for this OfferInformation.
     * 
     * @param expiryDate
     */
    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }


    /**
     * Gets the startDateTime value for this OfferInformation.
     * 
     * @return startDateTime
     */
    public String getStartDateTime() {
        return startDateTime;
    }


    /**
     * Sets the startDateTime value for this OfferInformation.
     * 
     * @param startDateTime
     */
    public void setStartDateTime(String startDateTime) {
        this.startDateTime = startDateTime;
    }


    /**
     * Gets the expiryDateTime value for this OfferInformation.
     * 
     * @return expiryDateTime
     */
    public String getExpiryDateTime() {
        return expiryDateTime;
    }


    /**
     * Sets the expiryDateTime value for this OfferInformation.
     * 
     * @param expiryDateTime
     */
    public void setExpiryDateTime(String expiryDateTime) {
        this.expiryDateTime = expiryDateTime;
    }


    /**
     * Gets the pamServiceID value for this OfferInformation.
     * 
     * @return pamServiceID
     */
    public String getPamServiceID() {
        return pamServiceID;
    }


    /**
     * Sets the pamServiceID value for this OfferInformation.
     * 
     * @param pamServiceID
     */
    public void setPamServiceID(String pamServiceID) {
        this.pamServiceID = pamServiceID;
    }


    /**
     * Gets the offerDesc value for this OfferInformation.
     * 
     * @return offerDesc
     */
    public String getOfferDesc() {
        return offerDesc;
    }


    /**
     * Sets the offerDesc value for this OfferInformation.
     * 
     * @param offerDesc
     */
    public void setOfferDesc(String offerDesc) {
        this.offerDesc = offerDesc;
    }


    /**
     * Gets the attributeInformationList value for this OfferInformation.
     * 
     * @return attributeInformationList
     */
    public OfferInformationAttributeInformationList[] getAttributeInformationList() {
        return attributeInformationList;
    }


    /**
     * Sets the attributeInformationList value for this OfferInformation.
     * 
     * @param attributeInformationList
     */
    public void setAttributeInformationList(OfferInformationAttributeInformationList[] attributeInformationList) {
        this.attributeInformationList = attributeInformationList;
    }

    public OfferInformationAttributeInformationList getAttributeInformationList(int i) {
        return this.attributeInformationList[i];
    }

    public void setAttributeInformationList(int i, OfferInformationAttributeInformationList _value) {
        this.attributeInformationList[i] = _value;
    }


    /**
     * Gets the dedicatedAccountInformation value for this OfferInformation.
     * 
     * @return dedicatedAccountInformation
     */
    public OfferInformationDedicatedAccountInformation[] getDedicatedAccountInformation() {
        return dedicatedAccountInformation;
    }


    /**
     * Sets the dedicatedAccountInformation value for this OfferInformation.
     * 
     * @param dedicatedAccountInformation
     */
    public void setDedicatedAccountInformation(OfferInformationDedicatedAccountInformation[] dedicatedAccountInformation) {
        this.dedicatedAccountInformation = dedicatedAccountInformation;
    }

    public OfferInformationDedicatedAccountInformation getDedicatedAccountInformation(int i) {
        return this.dedicatedAccountInformation[i];
    }

    public void setDedicatedAccountInformation(int i, OfferInformationDedicatedAccountInformation _value) {
        this.dedicatedAccountInformation[i] = _value;
    }


    /**
     * Gets the fafInformationList value for this OfferInformation.
     * 
     * @return fafInformationList
     */
    public OfferInformationFafInformationList[] getFafInformationList() {
        return fafInformationList;
    }


    /**
     * Sets the fafInformationList value for this OfferInformation.
     * 
     * @param fafInformationList
     */
    public void setFafInformationList(OfferInformationFafInformationList[] fafInformationList) {
        this.fafInformationList = fafInformationList;
    }

    public OfferInformationFafInformationList getFafInformationList(int i) {
        return this.fafInformationList[i];
    }

    public void setFafInformationList(int i, OfferInformationFafInformationList _value) {
        this.fafInformationList[i] = _value;
    }


    /**
     * Gets the offerType value for this OfferInformation.
     * 
     * @return offerType
     */
    public String getOfferType() {
        return offerType;
    }


    /**
     * Sets the offerType value for this OfferInformation.
     * 
     * @param offerType
     */
    public void setOfferType(String offerType) {
        this.offerType = offerType;
    }


    /**
     * Gets the offerState value for this OfferInformation.
     * 
     * @return offerState
     */
    public String getOfferState() {
        return offerState;
    }


    /**
     * Sets the offerState value for this OfferInformation.
     * 
     * @param offerState
     */
    public void setOfferState(String offerState) {
        this.offerState = offerState;
    }


    /**
     * Gets the offerProviderID value for this OfferInformation.
     * 
     * @return offerProviderID
     */
    public String getOfferProviderID() {
        return offerProviderID;
    }


    /**
     * Sets the offerProviderID value for this OfferInformation.
     * 
     * @param offerProviderID
     */
    public void setOfferProviderID(String offerProviderID) {
        this.offerProviderID = offerProviderID;
    }


    /**
     * Gets the productID value for this OfferInformation.
     * 
     * @return productID
     */
    public String getProductID() {
        return productID;
    }


    /**
     * Sets the productID value for this OfferInformation.
     * 
     * @param productID
     */
    public void setProductID(String productID) {
        this.productID = productID;
    }


    /**
     * Gets the usageCounterUsageThresholdInformation value for this OfferInformation.
     * 
     * @return usageCounterUsageThresholdInformation
     */
    public OfferInformationUsageCounterUsageThresholdInformation[] getUsageCounterUsageThresholdInformation() {
        return usageCounterUsageThresholdInformation;
    }


    /**
     * Sets the usageCounterUsageThresholdInformation value for this OfferInformation.
     * 
     * @param usageCounterUsageThresholdInformation
     */
    public void setUsageCounterUsageThresholdInformation(OfferInformationUsageCounterUsageThresholdInformation[] usageCounterUsageThresholdInformation) {
        this.usageCounterUsageThresholdInformation = usageCounterUsageThresholdInformation;
    }

    public OfferInformationUsageCounterUsageThresholdInformation getUsageCounterUsageThresholdInformation(int i) {
        return this.usageCounterUsageThresholdInformation[i];
    }

    public void setUsageCounterUsageThresholdInformation(int i, OfferInformationUsageCounterUsageThresholdInformation _value) {
        this.usageCounterUsageThresholdInformation[i] = _value;
    }


    /**
     * Gets the aggregatedOfferInformation value for this OfferInformation.
     * 
     * @return aggregatedOfferInformation
     */
    public OfferInformationAggregatedOfferInformation[] getAggregatedOfferInformation() {
        return aggregatedOfferInformation;
    }


    /**
     * Sets the aggregatedOfferInformation value for this OfferInformation.
     * 
     * @param aggregatedOfferInformation
     */
    public void setAggregatedOfferInformation(OfferInformationAggregatedOfferInformation[] aggregatedOfferInformation) {
        this.aggregatedOfferInformation = aggregatedOfferInformation;
    }

    public OfferInformationAggregatedOfferInformation getAggregatedOfferInformation(int i) {
        return this.aggregatedOfferInformation[i];
    }

    public void setAggregatedOfferInformation(int i, OfferInformationAggregatedOfferInformation _value) {
        this.aggregatedOfferInformation[i] = _value;
    }


    /**
     * Gets the treeParameterSetInformationList value for this OfferInformation.
     * 
     * @return treeParameterSetInformationList
     */
    public OfferInformationTreeParameterSetInformationListTreeParameterSetInformation[] getTreeParameterSetInformationList() {
        return treeParameterSetInformationList;
    }


    /**
     * Sets the treeParameterSetInformationList value for this OfferInformation.
     * 
     * @param treeParameterSetInformationList
     */
    public void setTreeParameterSetInformationList(OfferInformationTreeParameterSetInformationListTreeParameterSetInformation[] treeParameterSetInformationList) {
        this.treeParameterSetInformationList = treeParameterSetInformationList;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof OfferInformation)) return false;
        OfferInformation other = (OfferInformation) obj;
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
            ((this.offerDesc==null && other.getOfferDesc()==null) || 
             (this.offerDesc!=null &&
              this.offerDesc.equals(other.getOfferDesc()))) &&
            ((this.attributeInformationList==null && other.getAttributeInformationList()==null) || 
             (this.attributeInformationList!=null &&
              java.util.Arrays.equals(this.attributeInformationList, other.getAttributeInformationList()))) &&
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
              java.util.Arrays.equals(this.aggregatedOfferInformation, other.getAggregatedOfferInformation()))) &&
            ((this.treeParameterSetInformationList==null && other.getTreeParameterSetInformationList()==null) || 
             (this.treeParameterSetInformationList!=null &&
              java.util.Arrays.equals(this.treeParameterSetInformationList, other.getTreeParameterSetInformationList())));
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
        if (getOfferDesc() != null) {
            _hashCode += getOfferDesc().hashCode();
        }
        if (getAttributeInformationList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAttributeInformationList());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getAttributeInformationList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        if (getTreeParameterSetInformationList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTreeParameterSetInformationList());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getTreeParameterSetInformationList(), i);
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
        new org.apache.axis.description.TypeDesc(OfferInformation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", ">OfferInformation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offerID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "offerID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expiryDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "expiryDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "startDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expiryDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "expiryDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pamServiceID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "pamServiceID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offerDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "offerDesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributeInformationList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "attributeInformationList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", ">>OfferInformation>attributeInformationList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dedicatedAccountInformation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "dedicatedAccountInformation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", ">>OfferInformation>dedicatedAccountInformation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fafInformationList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "fafInformationList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", ">>OfferInformation>fafInformationList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offerType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "offerType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offerState");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "offerState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offerProviderID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "offerProviderID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "productID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usageCounterUsageThresholdInformation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "usageCounterUsageThresholdInformation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", ">>OfferInformation>usageCounterUsageThresholdInformation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aggregatedOfferInformation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "aggregatedOfferInformation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", ">>OfferInformation>aggregatedOfferInformation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("treeParameterSetInformationList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "TreeParameterSetInformationList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", ">>>OfferInformation>TreeParameterSetInformationList>TreeParameterSetInformation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "TreeParameterSetInformation"));
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
