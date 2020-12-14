/**
 * GetAccountDetailsResponseResponseHeaderBalanceAndDateOfferInformationList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd;

public class GetAccountDetailsResponseResponseHeaderBalanceAndDateOfferInformationList  implements java.io.Serializable {
    private String offerID;

    private String startDat;

    private String expiryDate;

    private String startDateTime;

    private String expiryDateTime;

    private String pamServiceID;

    private String offerType;

    private String offerState;

    private String offerProviderID;

    public GetAccountDetailsResponseResponseHeaderBalanceAndDateOfferInformationList() {
    }

    public GetAccountDetailsResponseResponseHeaderBalanceAndDateOfferInformationList(
           String offerID,
           String startDat,
           String expiryDate,
           String startDateTime,
           String expiryDateTime,
           String pamServiceID,
           String offerType,
           String offerState,
           String offerProviderID) {
           this.offerID = offerID;
           this.startDat = startDat;
           this.expiryDate = expiryDate;
           this.startDateTime = startDateTime;
           this.expiryDateTime = expiryDateTime;
           this.pamServiceID = pamServiceID;
           this.offerType = offerType;
           this.offerState = offerState;
           this.offerProviderID = offerProviderID;
    }


    /**
     * Gets the offerID value for this GetAccountDetailsResponseResponseHeaderBalanceAndDateOfferInformationList.
     * 
     * @return offerID
     */
    public String getOfferID() {
        return offerID;
    }


    /**
     * Sets the offerID value for this GetAccountDetailsResponseResponseHeaderBalanceAndDateOfferInformationList.
     * 
     * @param offerID
     */
    public void setOfferID(String offerID) {
        this.offerID = offerID;
    }


    /**
     * Gets the startDat value for this GetAccountDetailsResponseResponseHeaderBalanceAndDateOfferInformationList.
     * 
     * @return startDat
     */
    public String getStartDat() {
        return startDat;
    }


    /**
     * Sets the startDat value for this GetAccountDetailsResponseResponseHeaderBalanceAndDateOfferInformationList.
     * 
     * @param startDat
     */
    public void setStartDat(String startDat) {
        this.startDat = startDat;
    }


    /**
     * Gets the expiryDate value for this GetAccountDetailsResponseResponseHeaderBalanceAndDateOfferInformationList.
     * 
     * @return expiryDate
     */
    public String getExpiryDate() {
        return expiryDate;
    }


    /**
     * Sets the expiryDate value for this GetAccountDetailsResponseResponseHeaderBalanceAndDateOfferInformationList.
     * 
     * @param expiryDate
     */
    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }


    /**
     * Gets the startDateTime value for this GetAccountDetailsResponseResponseHeaderBalanceAndDateOfferInformationList.
     * 
     * @return startDateTime
     */
    public String getStartDateTime() {
        return startDateTime;
    }


    /**
     * Sets the startDateTime value for this GetAccountDetailsResponseResponseHeaderBalanceAndDateOfferInformationList.
     * 
     * @param startDateTime
     */
    public void setStartDateTime(String startDateTime) {
        this.startDateTime = startDateTime;
    }


    /**
     * Gets the expiryDateTime value for this GetAccountDetailsResponseResponseHeaderBalanceAndDateOfferInformationList.
     * 
     * @return expiryDateTime
     */
    public String getExpiryDateTime() {
        return expiryDateTime;
    }


    /**
     * Sets the expiryDateTime value for this GetAccountDetailsResponseResponseHeaderBalanceAndDateOfferInformationList.
     * 
     * @param expiryDateTime
     */
    public void setExpiryDateTime(String expiryDateTime) {
        this.expiryDateTime = expiryDateTime;
    }


    /**
     * Gets the pamServiceID value for this GetAccountDetailsResponseResponseHeaderBalanceAndDateOfferInformationList.
     * 
     * @return pamServiceID
     */
    public String getPamServiceID() {
        return pamServiceID;
    }


    /**
     * Sets the pamServiceID value for this GetAccountDetailsResponseResponseHeaderBalanceAndDateOfferInformationList.
     * 
     * @param pamServiceID
     */
    public void setPamServiceID(String pamServiceID) {
        this.pamServiceID = pamServiceID;
    }


    /**
     * Gets the offerType value for this GetAccountDetailsResponseResponseHeaderBalanceAndDateOfferInformationList.
     * 
     * @return offerType
     */
    public String getOfferType() {
        return offerType;
    }


    /**
     * Sets the offerType value for this GetAccountDetailsResponseResponseHeaderBalanceAndDateOfferInformationList.
     * 
     * @param offerType
     */
    public void setOfferType(String offerType) {
        this.offerType = offerType;
    }


    /**
     * Gets the offerState value for this GetAccountDetailsResponseResponseHeaderBalanceAndDateOfferInformationList.
     * 
     * @return offerState
     */
    public String getOfferState() {
        return offerState;
    }


    /**
     * Sets the offerState value for this GetAccountDetailsResponseResponseHeaderBalanceAndDateOfferInformationList.
     * 
     * @param offerState
     */
    public void setOfferState(String offerState) {
        this.offerState = offerState;
    }


    /**
     * Gets the offerProviderID value for this GetAccountDetailsResponseResponseHeaderBalanceAndDateOfferInformationList.
     * 
     * @return offerProviderID
     */
    public String getOfferProviderID() {
        return offerProviderID;
    }


    /**
     * Sets the offerProviderID value for this GetAccountDetailsResponseResponseHeaderBalanceAndDateOfferInformationList.
     * 
     * @param offerProviderID
     */
    public void setOfferProviderID(String offerProviderID) {
        this.offerProviderID = offerProviderID;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GetAccountDetailsResponseResponseHeaderBalanceAndDateOfferInformationList)) return false;
        GetAccountDetailsResponseResponseHeaderBalanceAndDateOfferInformationList other = (GetAccountDetailsResponseResponseHeaderBalanceAndDateOfferInformationList) obj;
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
            ((this.startDat==null && other.getStartDat()==null) || 
             (this.startDat!=null &&
              this.startDat.equals(other.getStartDat()))) &&
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
              this.offerProviderID.equals(other.getOfferProviderID())));
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
        if (getStartDat() != null) {
            _hashCode += getStartDat().hashCode();
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetAccountDetailsResponseResponseHeaderBalanceAndDateOfferInformationList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", ">>>>GetAccountDetailsResponse>ResponseHeader>BalanceAndDate>offerInformationList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offerID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "offerID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDat");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "startDat"));
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
