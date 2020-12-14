/**
 * GetAccountDetailsResponseResponseHeaderAccountDetailsOfferInformationList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd;

public class GetAccountDetailsResponseResponseHeaderAccountDetailsOfferInformationList  implements java.io.Serializable {
    private String offerID;

    private String startDate;

    private String expiryDate;

    private String startDateTime;

    private String expiryDateTime;

    private String pamServiceID;

    private String offerType;

    private String offerState;

    private String offerProviderID;

    private String productID;

    private GetAccountDetailsResponseResponseHeaderAccountDetailsOfferInformationListAttributeInformationList[] attributeInformationList;

    public GetAccountDetailsResponseResponseHeaderAccountDetailsOfferInformationList() {
    }

    public GetAccountDetailsResponseResponseHeaderAccountDetailsOfferInformationList(
           String offerID,
           String startDate,
           String expiryDate,
           String startDateTime,
           String expiryDateTime,
           String pamServiceID,
           String offerType,
           String offerState,
           String offerProviderID,
           String productID,
           GetAccountDetailsResponseResponseHeaderAccountDetailsOfferInformationListAttributeInformationList[] attributeInformationList) {
           this.offerID = offerID;
           this.startDate = startDate;
           this.expiryDate = expiryDate;
           this.startDateTime = startDateTime;
           this.expiryDateTime = expiryDateTime;
           this.pamServiceID = pamServiceID;
           this.offerType = offerType;
           this.offerState = offerState;
           this.offerProviderID = offerProviderID;
           this.productID = productID;
           this.attributeInformationList = attributeInformationList;
    }


    /**
     * Gets the offerID value for this GetAccountDetailsResponseResponseHeaderAccountDetailsOfferInformationList.
     * 
     * @return offerID
     */
    public String getOfferID() {
        return offerID;
    }


    /**
     * Sets the offerID value for this GetAccountDetailsResponseResponseHeaderAccountDetailsOfferInformationList.
     * 
     * @param offerID
     */
    public void setOfferID(String offerID) {
        this.offerID = offerID;
    }


    /**
     * Gets the startDate value for this GetAccountDetailsResponseResponseHeaderAccountDetailsOfferInformationList.
     * 
     * @return startDate
     */
    public String getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this GetAccountDetailsResponseResponseHeaderAccountDetailsOfferInformationList.
     * 
     * @param startDate
     */
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the expiryDate value for this GetAccountDetailsResponseResponseHeaderAccountDetailsOfferInformationList.
     * 
     * @return expiryDate
     */
    public String getExpiryDate() {
        return expiryDate;
    }


    /**
     * Sets the expiryDate value for this GetAccountDetailsResponseResponseHeaderAccountDetailsOfferInformationList.
     * 
     * @param expiryDate
     */
    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }


    /**
     * Gets the startDateTime value for this GetAccountDetailsResponseResponseHeaderAccountDetailsOfferInformationList.
     * 
     * @return startDateTime
     */
    public String getStartDateTime() {
        return startDateTime;
    }


    /**
     * Sets the startDateTime value for this GetAccountDetailsResponseResponseHeaderAccountDetailsOfferInformationList.
     * 
     * @param startDateTime
     */
    public void setStartDateTime(String startDateTime) {
        this.startDateTime = startDateTime;
    }


    /**
     * Gets the expiryDateTime value for this GetAccountDetailsResponseResponseHeaderAccountDetailsOfferInformationList.
     * 
     * @return expiryDateTime
     */
    public String getExpiryDateTime() {
        return expiryDateTime;
    }


    /**
     * Sets the expiryDateTime value for this GetAccountDetailsResponseResponseHeaderAccountDetailsOfferInformationList.
     * 
     * @param expiryDateTime
     */
    public void setExpiryDateTime(String expiryDateTime) {
        this.expiryDateTime = expiryDateTime;
    }


    /**
     * Gets the pamServiceID value for this GetAccountDetailsResponseResponseHeaderAccountDetailsOfferInformationList.
     * 
     * @return pamServiceID
     */
    public String getPamServiceID() {
        return pamServiceID;
    }


    /**
     * Sets the pamServiceID value for this GetAccountDetailsResponseResponseHeaderAccountDetailsOfferInformationList.
     * 
     * @param pamServiceID
     */
    public void setPamServiceID(String pamServiceID) {
        this.pamServiceID = pamServiceID;
    }


    /**
     * Gets the offerType value for this GetAccountDetailsResponseResponseHeaderAccountDetailsOfferInformationList.
     * 
     * @return offerType
     */
    public String getOfferType() {
        return offerType;
    }


    /**
     * Sets the offerType value for this GetAccountDetailsResponseResponseHeaderAccountDetailsOfferInformationList.
     * 
     * @param offerType
     */
    public void setOfferType(String offerType) {
        this.offerType = offerType;
    }


    /**
     * Gets the offerState value for this GetAccountDetailsResponseResponseHeaderAccountDetailsOfferInformationList.
     * 
     * @return offerState
     */
    public String getOfferState() {
        return offerState;
    }


    /**
     * Sets the offerState value for this GetAccountDetailsResponseResponseHeaderAccountDetailsOfferInformationList.
     * 
     * @param offerState
     */
    public void setOfferState(String offerState) {
        this.offerState = offerState;
    }


    /**
     * Gets the offerProviderID value for this GetAccountDetailsResponseResponseHeaderAccountDetailsOfferInformationList.
     * 
     * @return offerProviderID
     */
    public String getOfferProviderID() {
        return offerProviderID;
    }


    /**
     * Sets the offerProviderID value for this GetAccountDetailsResponseResponseHeaderAccountDetailsOfferInformationList.
     * 
     * @param offerProviderID
     */
    public void setOfferProviderID(String offerProviderID) {
        this.offerProviderID = offerProviderID;
    }


    /**
     * Gets the productID value for this GetAccountDetailsResponseResponseHeaderAccountDetailsOfferInformationList.
     * 
     * @return productID
     */
    public String getProductID() {
        return productID;
    }


    /**
     * Sets the productID value for this GetAccountDetailsResponseResponseHeaderAccountDetailsOfferInformationList.
     * 
     * @param productID
     */
    public void setProductID(String productID) {
        this.productID = productID;
    }


    /**
     * Gets the attributeInformationList value for this GetAccountDetailsResponseResponseHeaderAccountDetailsOfferInformationList.
     * 
     * @return attributeInformationList
     */
    public GetAccountDetailsResponseResponseHeaderAccountDetailsOfferInformationListAttributeInformationList[] getAttributeInformationList() {
        return attributeInformationList;
    }


    /**
     * Sets the attributeInformationList value for this GetAccountDetailsResponseResponseHeaderAccountDetailsOfferInformationList.
     * 
     * @param attributeInformationList
     */
    public void setAttributeInformationList(GetAccountDetailsResponseResponseHeaderAccountDetailsOfferInformationListAttributeInformationList[] attributeInformationList) {
        this.attributeInformationList = attributeInformationList;
    }

    public GetAccountDetailsResponseResponseHeaderAccountDetailsOfferInformationListAttributeInformationList getAttributeInformationList(int i) {
        return this.attributeInformationList[i];
    }

    public void setAttributeInformationList(int i, GetAccountDetailsResponseResponseHeaderAccountDetailsOfferInformationListAttributeInformationList _value) {
        this.attributeInformationList[i] = _value;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GetAccountDetailsResponseResponseHeaderAccountDetailsOfferInformationList)) return false;
        GetAccountDetailsResponseResponseHeaderAccountDetailsOfferInformationList other = (GetAccountDetailsResponseResponseHeaderAccountDetailsOfferInformationList) obj;
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
            ((this.attributeInformationList==null && other.getAttributeInformationList()==null) || 
             (this.attributeInformationList!=null &&
              java.util.Arrays.equals(this.attributeInformationList, other.getAttributeInformationList())));
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetAccountDetailsResponseResponseHeaderAccountDetailsOfferInformationList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", ">>>>GetAccountDetailsResponse>ResponseHeader>AccountDetails>offerInformationList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offerID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "offerID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("attributeInformationList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "attributeInformationList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", ">>>>>GetAccountDetailsResponse>ResponseHeader>AccountDetails>offerInformationList>attributeInformationList"));
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
