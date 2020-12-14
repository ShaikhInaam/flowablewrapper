/**
 * GetAccountDetailsResponseResponseHeaderGetFaFListFafInformationList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd;

public class GetAccountDetailsResponseResponseHeaderGetFaFListFafInformationList  implements java.io.Serializable {
    private String fafNumber;

    private String owner;

    private String expiryDate;

    private String expiryDateRelative;

    private String fafIndicator;

    private String fafDesc;

    private String countryName;

    private String offerID;

    public GetAccountDetailsResponseResponseHeaderGetFaFListFafInformationList() {
    }

    public GetAccountDetailsResponseResponseHeaderGetFaFListFafInformationList(
           String fafNumber,
           String owner,
           String expiryDate,
           String expiryDateRelative,
           String fafIndicator,
           String fafDesc,
           String countryName,
           String offerID) {
           this.fafNumber = fafNumber;
           this.owner = owner;
           this.expiryDate = expiryDate;
           this.expiryDateRelative = expiryDateRelative;
           this.fafIndicator = fafIndicator;
           this.fafDesc = fafDesc;
           this.countryName = countryName;
           this.offerID = offerID;
    }


    /**
     * Gets the fafNumber value for this GetAccountDetailsResponseResponseHeaderGetFaFListFafInformationList.
     * 
     * @return fafNumber
     */
    public String getFafNumber() {
        return fafNumber;
    }


    /**
     * Sets the fafNumber value for this GetAccountDetailsResponseResponseHeaderGetFaFListFafInformationList.
     * 
     * @param fafNumber
     */
    public void setFafNumber(String fafNumber) {
        this.fafNumber = fafNumber;
    }


    /**
     * Gets the owner value for this GetAccountDetailsResponseResponseHeaderGetFaFListFafInformationList.
     * 
     * @return owner
     */
    public String getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this GetAccountDetailsResponseResponseHeaderGetFaFListFafInformationList.
     * 
     * @param owner
     */
    public void setOwner(String owner) {
        this.owner = owner;
    }


    /**
     * Gets the expiryDate value for this GetAccountDetailsResponseResponseHeaderGetFaFListFafInformationList.
     * 
     * @return expiryDate
     */
    public String getExpiryDate() {
        return expiryDate;
    }


    /**
     * Sets the expiryDate value for this GetAccountDetailsResponseResponseHeaderGetFaFListFafInformationList.
     * 
     * @param expiryDate
     */
    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }


    /**
     * Gets the expiryDateRelative value for this GetAccountDetailsResponseResponseHeaderGetFaFListFafInformationList.
     * 
     * @return expiryDateRelative
     */
    public String getExpiryDateRelative() {
        return expiryDateRelative;
    }


    /**
     * Sets the expiryDateRelative value for this GetAccountDetailsResponseResponseHeaderGetFaFListFafInformationList.
     * 
     * @param expiryDateRelative
     */
    public void setExpiryDateRelative(String expiryDateRelative) {
        this.expiryDateRelative = expiryDateRelative;
    }


    /**
     * Gets the fafIndicator value for this GetAccountDetailsResponseResponseHeaderGetFaFListFafInformationList.
     * 
     * @return fafIndicator
     */
    public String getFafIndicator() {
        return fafIndicator;
    }


    /**
     * Sets the fafIndicator value for this GetAccountDetailsResponseResponseHeaderGetFaFListFafInformationList.
     * 
     * @param fafIndicator
     */
    public void setFafIndicator(String fafIndicator) {
        this.fafIndicator = fafIndicator;
    }


    /**
     * Gets the fafDesc value for this GetAccountDetailsResponseResponseHeaderGetFaFListFafInformationList.
     * 
     * @return fafDesc
     */
    public String getFafDesc() {
        return fafDesc;
    }


    /**
     * Sets the fafDesc value for this GetAccountDetailsResponseResponseHeaderGetFaFListFafInformationList.
     * 
     * @param fafDesc
     */
    public void setFafDesc(String fafDesc) {
        this.fafDesc = fafDesc;
    }


    /**
     * Gets the countryName value for this GetAccountDetailsResponseResponseHeaderGetFaFListFafInformationList.
     * 
     * @return countryName
     */
    public String getCountryName() {
        return countryName;
    }


    /**
     * Sets the countryName value for this GetAccountDetailsResponseResponseHeaderGetFaFListFafInformationList.
     * 
     * @param countryName
     */
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }


    /**
     * Gets the offerID value for this GetAccountDetailsResponseResponseHeaderGetFaFListFafInformationList.
     * 
     * @return offerID
     */
    public String getOfferID() {
        return offerID;
    }


    /**
     * Sets the offerID value for this GetAccountDetailsResponseResponseHeaderGetFaFListFafInformationList.
     * 
     * @param offerID
     */
    public void setOfferID(String offerID) {
        this.offerID = offerID;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GetAccountDetailsResponseResponseHeaderGetFaFListFafInformationList)) return false;
        GetAccountDetailsResponseResponseHeaderGetFaFListFafInformationList other = (GetAccountDetailsResponseResponseHeaderGetFaFListFafInformationList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fafNumber==null && other.getFafNumber()==null) || 
             (this.fafNumber!=null &&
              this.fafNumber.equals(other.getFafNumber()))) &&
            ((this.owner==null && other.getOwner()==null) || 
             (this.owner!=null &&
              this.owner.equals(other.getOwner()))) &&
            ((this.expiryDate==null && other.getExpiryDate()==null) || 
             (this.expiryDate!=null &&
              this.expiryDate.equals(other.getExpiryDate()))) &&
            ((this.expiryDateRelative==null && other.getExpiryDateRelative()==null) || 
             (this.expiryDateRelative!=null &&
              this.expiryDateRelative.equals(other.getExpiryDateRelative()))) &&
            ((this.fafIndicator==null && other.getFafIndicator()==null) || 
             (this.fafIndicator!=null &&
              this.fafIndicator.equals(other.getFafIndicator()))) &&
            ((this.fafDesc==null && other.getFafDesc()==null) || 
             (this.fafDesc!=null &&
              this.fafDesc.equals(other.getFafDesc()))) &&
            ((this.countryName==null && other.getCountryName()==null) || 
             (this.countryName!=null &&
              this.countryName.equals(other.getCountryName()))) &&
            ((this.offerID==null && other.getOfferID()==null) || 
             (this.offerID!=null &&
              this.offerID.equals(other.getOfferID())));
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
        if (getFafNumber() != null) {
            _hashCode += getFafNumber().hashCode();
        }
        if (getOwner() != null) {
            _hashCode += getOwner().hashCode();
        }
        if (getExpiryDate() != null) {
            _hashCode += getExpiryDate().hashCode();
        }
        if (getExpiryDateRelative() != null) {
            _hashCode += getExpiryDateRelative().hashCode();
        }
        if (getFafIndicator() != null) {
            _hashCode += getFafIndicator().hashCode();
        }
        if (getFafDesc() != null) {
            _hashCode += getFafDesc().hashCode();
        }
        if (getCountryName() != null) {
            _hashCode += getCountryName().hashCode();
        }
        if (getOfferID() != null) {
            _hashCode += getOfferID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetAccountDetailsResponseResponseHeaderGetFaFListFafInformationList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", ">>>>GetAccountDetailsResponse>ResponseHeader>GetFaFList>fafInformationList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fafNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "fafNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("owner");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "owner"));
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
        elemField.setFieldName("expiryDateRelative");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "expiryDateRelative"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fafIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "fafIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fafDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "fafDesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "countryName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offerID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "offerID"));
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
