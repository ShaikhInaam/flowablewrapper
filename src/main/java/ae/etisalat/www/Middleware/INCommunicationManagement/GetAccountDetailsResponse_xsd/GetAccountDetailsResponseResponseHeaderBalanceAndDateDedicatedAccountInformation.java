/**
 * GetAccountDetailsResponseResponseHeaderBalanceAndDateDedicatedAccountInformation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd;

public class GetAccountDetailsResponseResponseHeaderBalanceAndDateDedicatedAccountInformation  implements java.io.Serializable {
    private String dedicatedAccountID;

    private String dedicatedAccountIDDesc;

    private String dedicatedAccountValue1;

    private String dedicatedAccountValue2;

    private String expiryDate;

    private String startDate;

    private String pamServiceID;

    private String offerID;

    private String productID;

    private String dedicatedAccountRealMoneyFlag;

    private String closestExpiryDate;

    private String closestExpiryValue1;

    private String closestExpiryValue2;

    private String closestAccessibleDate;

    private String closestAccessibleValue1;

    private String closestAccessibleValue2;

    private ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.GetAccountDetailsResponseResponseHeaderBalanceAndDateDedicatedAccountInformationSubDedicatedAccountInformation[] subDedicatedAccountInformation;

    private String dedicatedAccountActiveValue1;

    private String dedicatedAccountActiveValue2;

    private String dedicatedAccountUnitType;

    private String compositeDedicatedAccountFlag;

    public GetAccountDetailsResponseResponseHeaderBalanceAndDateDedicatedAccountInformation() {
    }

    public GetAccountDetailsResponseResponseHeaderBalanceAndDateDedicatedAccountInformation(
           String dedicatedAccountID,
           String dedicatedAccountIDDesc,
           String dedicatedAccountValue1,
           String dedicatedAccountValue2,
           String expiryDate,
           String startDate,
           String pamServiceID,
           String offerID,
           String productID,
           String dedicatedAccountRealMoneyFlag,
           String closestExpiryDate,
           String closestExpiryValue1,
           String closestExpiryValue2,
           String closestAccessibleDate,
           String closestAccessibleValue1,
           String closestAccessibleValue2,
           ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.GetAccountDetailsResponseResponseHeaderBalanceAndDateDedicatedAccountInformationSubDedicatedAccountInformation[] subDedicatedAccountInformation,
           String dedicatedAccountActiveValue1,
           String dedicatedAccountActiveValue2,
           String dedicatedAccountUnitType,
           String compositeDedicatedAccountFlag) {
           this.dedicatedAccountID = dedicatedAccountID;
           this.dedicatedAccountIDDesc = dedicatedAccountIDDesc;
           this.dedicatedAccountValue1 = dedicatedAccountValue1;
           this.dedicatedAccountValue2 = dedicatedAccountValue2;
           this.expiryDate = expiryDate;
           this.startDate = startDate;
           this.pamServiceID = pamServiceID;
           this.offerID = offerID;
           this.productID = productID;
           this.dedicatedAccountRealMoneyFlag = dedicatedAccountRealMoneyFlag;
           this.closestExpiryDate = closestExpiryDate;
           this.closestExpiryValue1 = closestExpiryValue1;
           this.closestExpiryValue2 = closestExpiryValue2;
           this.closestAccessibleDate = closestAccessibleDate;
           this.closestAccessibleValue1 = closestAccessibleValue1;
           this.closestAccessibleValue2 = closestAccessibleValue2;
           this.subDedicatedAccountInformation = subDedicatedAccountInformation;
           this.dedicatedAccountActiveValue1 = dedicatedAccountActiveValue1;
           this.dedicatedAccountActiveValue2 = dedicatedAccountActiveValue2;
           this.dedicatedAccountUnitType = dedicatedAccountUnitType;
           this.compositeDedicatedAccountFlag = compositeDedicatedAccountFlag;
    }


    /**
     * Gets the dedicatedAccountID value for this GetAccountDetailsResponseResponseHeaderBalanceAndDateDedicatedAccountInformation.
     * 
     * @return dedicatedAccountID
     */
    public String getDedicatedAccountID() {
        return dedicatedAccountID;
    }


    /**
     * Sets the dedicatedAccountID value for this GetAccountDetailsResponseResponseHeaderBalanceAndDateDedicatedAccountInformation.
     * 
     * @param dedicatedAccountID
     */
    public void setDedicatedAccountID(String dedicatedAccountID) {
        this.dedicatedAccountID = dedicatedAccountID;
    }


    /**
     * Gets the dedicatedAccountIDDesc value for this GetAccountDetailsResponseResponseHeaderBalanceAndDateDedicatedAccountInformation.
     * 
     * @return dedicatedAccountIDDesc
     */
    public String getDedicatedAccountIDDesc() {
        return dedicatedAccountIDDesc;
    }


    /**
     * Sets the dedicatedAccountIDDesc value for this GetAccountDetailsResponseResponseHeaderBalanceAndDateDedicatedAccountInformation.
     * 
     * @param dedicatedAccountIDDesc
     */
    public void setDedicatedAccountIDDesc(String dedicatedAccountIDDesc) {
        this.dedicatedAccountIDDesc = dedicatedAccountIDDesc;
    }


    /**
     * Gets the dedicatedAccountValue1 value for this GetAccountDetailsResponseResponseHeaderBalanceAndDateDedicatedAccountInformation.
     * 
     * @return dedicatedAccountValue1
     */
    public String getDedicatedAccountValue1() {
        return dedicatedAccountValue1;
    }


    /**
     * Sets the dedicatedAccountValue1 value for this GetAccountDetailsResponseResponseHeaderBalanceAndDateDedicatedAccountInformation.
     * 
     * @param dedicatedAccountValue1
     */
    public void setDedicatedAccountValue1(String dedicatedAccountValue1) {
        this.dedicatedAccountValue1 = dedicatedAccountValue1;
    }


    /**
     * Gets the dedicatedAccountValue2 value for this GetAccountDetailsResponseResponseHeaderBalanceAndDateDedicatedAccountInformation.
     * 
     * @return dedicatedAccountValue2
     */
    public String getDedicatedAccountValue2() {
        return dedicatedAccountValue2;
    }


    /**
     * Sets the dedicatedAccountValue2 value for this GetAccountDetailsResponseResponseHeaderBalanceAndDateDedicatedAccountInformation.
     * 
     * @param dedicatedAccountValue2
     */
    public void setDedicatedAccountValue2(String dedicatedAccountValue2) {
        this.dedicatedAccountValue2 = dedicatedAccountValue2;
    }


    /**
     * Gets the expiryDate value for this GetAccountDetailsResponseResponseHeaderBalanceAndDateDedicatedAccountInformation.
     * 
     * @return expiryDate
     */
    public String getExpiryDate() {
        return expiryDate;
    }


    /**
     * Sets the expiryDate value for this GetAccountDetailsResponseResponseHeaderBalanceAndDateDedicatedAccountInformation.
     * 
     * @param expiryDate
     */
    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }


    /**
     * Gets the startDate value for this GetAccountDetailsResponseResponseHeaderBalanceAndDateDedicatedAccountInformation.
     * 
     * @return startDate
     */
    public String getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this GetAccountDetailsResponseResponseHeaderBalanceAndDateDedicatedAccountInformation.
     * 
     * @param startDate
     */
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the pamServiceID value for this GetAccountDetailsResponseResponseHeaderBalanceAndDateDedicatedAccountInformation.
     * 
     * @return pamServiceID
     */
    public String getPamServiceID() {
        return pamServiceID;
    }


    /**
     * Sets the pamServiceID value for this GetAccountDetailsResponseResponseHeaderBalanceAndDateDedicatedAccountInformation.
     * 
     * @param pamServiceID
     */
    public void setPamServiceID(String pamServiceID) {
        this.pamServiceID = pamServiceID;
    }


    /**
     * Gets the offerID value for this GetAccountDetailsResponseResponseHeaderBalanceAndDateDedicatedAccountInformation.
     * 
     * @return offerID
     */
    public String getOfferID() {
        return offerID;
    }


    /**
     * Sets the offerID value for this GetAccountDetailsResponseResponseHeaderBalanceAndDateDedicatedAccountInformation.
     * 
     * @param offerID
     */
    public void setOfferID(String offerID) {
        this.offerID = offerID;
    }


    /**
     * Gets the productID value for this GetAccountDetailsResponseResponseHeaderBalanceAndDateDedicatedAccountInformation.
     * 
     * @return productID
     */
    public String getProductID() {
        return productID;
    }


    /**
     * Sets the productID value for this GetAccountDetailsResponseResponseHeaderBalanceAndDateDedicatedAccountInformation.
     * 
     * @param productID
     */
    public void setProductID(String productID) {
        this.productID = productID;
    }


    /**
     * Gets the dedicatedAccountRealMoneyFlag value for this GetAccountDetailsResponseResponseHeaderBalanceAndDateDedicatedAccountInformation.
     * 
     * @return dedicatedAccountRealMoneyFlag
     */
    public String getDedicatedAccountRealMoneyFlag() {
        return dedicatedAccountRealMoneyFlag;
    }


    /**
     * Sets the dedicatedAccountRealMoneyFlag value for this GetAccountDetailsResponseResponseHeaderBalanceAndDateDedicatedAccountInformation.
     * 
     * @param dedicatedAccountRealMoneyFlag
     */
    public void setDedicatedAccountRealMoneyFlag(String dedicatedAccountRealMoneyFlag) {
        this.dedicatedAccountRealMoneyFlag = dedicatedAccountRealMoneyFlag;
    }


    /**
     * Gets the closestExpiryDate value for this GetAccountDetailsResponseResponseHeaderBalanceAndDateDedicatedAccountInformation.
     * 
     * @return closestExpiryDate
     */
    public String getClosestExpiryDate() {
        return closestExpiryDate;
    }


    /**
     * Sets the closestExpiryDate value for this GetAccountDetailsResponseResponseHeaderBalanceAndDateDedicatedAccountInformation.
     * 
     * @param closestExpiryDate
     */
    public void setClosestExpiryDate(String closestExpiryDate) {
        this.closestExpiryDate = closestExpiryDate;
    }


    /**
     * Gets the closestExpiryValue1 value for this GetAccountDetailsResponseResponseHeaderBalanceAndDateDedicatedAccountInformation.
     * 
     * @return closestExpiryValue1
     */
    public String getClosestExpiryValue1() {
        return closestExpiryValue1;
    }


    /**
     * Sets the closestExpiryValue1 value for this GetAccountDetailsResponseResponseHeaderBalanceAndDateDedicatedAccountInformation.
     * 
     * @param closestExpiryValue1
     */
    public void setClosestExpiryValue1(String closestExpiryValue1) {
        this.closestExpiryValue1 = closestExpiryValue1;
    }


    /**
     * Gets the closestExpiryValue2 value for this GetAccountDetailsResponseResponseHeaderBalanceAndDateDedicatedAccountInformation.
     * 
     * @return closestExpiryValue2
     */
    public String getClosestExpiryValue2() {
        return closestExpiryValue2;
    }


    /**
     * Sets the closestExpiryValue2 value for this GetAccountDetailsResponseResponseHeaderBalanceAndDateDedicatedAccountInformation.
     * 
     * @param closestExpiryValue2
     */
    public void setClosestExpiryValue2(String closestExpiryValue2) {
        this.closestExpiryValue2 = closestExpiryValue2;
    }


    /**
     * Gets the closestAccessibleDate value for this GetAccountDetailsResponseResponseHeaderBalanceAndDateDedicatedAccountInformation.
     * 
     * @return closestAccessibleDate
     */
    public String getClosestAccessibleDate() {
        return closestAccessibleDate;
    }


    /**
     * Sets the closestAccessibleDate value for this GetAccountDetailsResponseResponseHeaderBalanceAndDateDedicatedAccountInformation.
     * 
     * @param closestAccessibleDate
     */
    public void setClosestAccessibleDate(String closestAccessibleDate) {
        this.closestAccessibleDate = closestAccessibleDate;
    }


    /**
     * Gets the closestAccessibleValue1 value for this GetAccountDetailsResponseResponseHeaderBalanceAndDateDedicatedAccountInformation.
     * 
     * @return closestAccessibleValue1
     */
    public String getClosestAccessibleValue1() {
        return closestAccessibleValue1;
    }


    /**
     * Sets the closestAccessibleValue1 value for this GetAccountDetailsResponseResponseHeaderBalanceAndDateDedicatedAccountInformation.
     * 
     * @param closestAccessibleValue1
     */
    public void setClosestAccessibleValue1(String closestAccessibleValue1) {
        this.closestAccessibleValue1 = closestAccessibleValue1;
    }


    /**
     * Gets the closestAccessibleValue2 value for this GetAccountDetailsResponseResponseHeaderBalanceAndDateDedicatedAccountInformation.
     * 
     * @return closestAccessibleValue2
     */
    public String getClosestAccessibleValue2() {
        return closestAccessibleValue2;
    }


    /**
     * Sets the closestAccessibleValue2 value for this GetAccountDetailsResponseResponseHeaderBalanceAndDateDedicatedAccountInformation.
     * 
     * @param closestAccessibleValue2
     */
    public void setClosestAccessibleValue2(String closestAccessibleValue2) {
        this.closestAccessibleValue2 = closestAccessibleValue2;
    }


    /**
     * Gets the subDedicatedAccountInformation value for this GetAccountDetailsResponseResponseHeaderBalanceAndDateDedicatedAccountInformation.
     * 
     * @return subDedicatedAccountInformation
     */
    public ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.GetAccountDetailsResponseResponseHeaderBalanceAndDateDedicatedAccountInformationSubDedicatedAccountInformation[] getSubDedicatedAccountInformation() {
        return subDedicatedAccountInformation;
    }


    /**
     * Sets the subDedicatedAccountInformation value for this GetAccountDetailsResponseResponseHeaderBalanceAndDateDedicatedAccountInformation.
     * 
     * @param subDedicatedAccountInformation
     */
    public void setSubDedicatedAccountInformation(ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.GetAccountDetailsResponseResponseHeaderBalanceAndDateDedicatedAccountInformationSubDedicatedAccountInformation[] subDedicatedAccountInformation) {
        this.subDedicatedAccountInformation = subDedicatedAccountInformation;
    }

    public ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.GetAccountDetailsResponseResponseHeaderBalanceAndDateDedicatedAccountInformationSubDedicatedAccountInformation getSubDedicatedAccountInformation(int i) {
        return this.subDedicatedAccountInformation[i];
    }

    public void setSubDedicatedAccountInformation(int i, ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.GetAccountDetailsResponseResponseHeaderBalanceAndDateDedicatedAccountInformationSubDedicatedAccountInformation _value) {
        this.subDedicatedAccountInformation[i] = _value;
    }


    /**
     * Gets the dedicatedAccountActiveValue1 value for this GetAccountDetailsResponseResponseHeaderBalanceAndDateDedicatedAccountInformation.
     * 
     * @return dedicatedAccountActiveValue1
     */
    public String getDedicatedAccountActiveValue1() {
        return dedicatedAccountActiveValue1;
    }


    /**
     * Sets the dedicatedAccountActiveValue1 value for this GetAccountDetailsResponseResponseHeaderBalanceAndDateDedicatedAccountInformation.
     * 
     * @param dedicatedAccountActiveValue1
     */
    public void setDedicatedAccountActiveValue1(String dedicatedAccountActiveValue1) {
        this.dedicatedAccountActiveValue1 = dedicatedAccountActiveValue1;
    }


    /**
     * Gets the dedicatedAccountActiveValue2 value for this GetAccountDetailsResponseResponseHeaderBalanceAndDateDedicatedAccountInformation.
     * 
     * @return dedicatedAccountActiveValue2
     */
    public String getDedicatedAccountActiveValue2() {
        return dedicatedAccountActiveValue2;
    }


    /**
     * Sets the dedicatedAccountActiveValue2 value for this GetAccountDetailsResponseResponseHeaderBalanceAndDateDedicatedAccountInformation.
     * 
     * @param dedicatedAccountActiveValue2
     */
    public void setDedicatedAccountActiveValue2(String dedicatedAccountActiveValue2) {
        this.dedicatedAccountActiveValue2 = dedicatedAccountActiveValue2;
    }


    /**
     * Gets the dedicatedAccountUnitType value for this GetAccountDetailsResponseResponseHeaderBalanceAndDateDedicatedAccountInformation.
     * 
     * @return dedicatedAccountUnitType
     */
    public String getDedicatedAccountUnitType() {
        return dedicatedAccountUnitType;
    }


    /**
     * Sets the dedicatedAccountUnitType value for this GetAccountDetailsResponseResponseHeaderBalanceAndDateDedicatedAccountInformation.
     * 
     * @param dedicatedAccountUnitType
     */
    public void setDedicatedAccountUnitType(String dedicatedAccountUnitType) {
        this.dedicatedAccountUnitType = dedicatedAccountUnitType;
    }


    /**
     * Gets the compositeDedicatedAccountFlag value for this GetAccountDetailsResponseResponseHeaderBalanceAndDateDedicatedAccountInformation.
     * 
     * @return compositeDedicatedAccountFlag
     */
    public String getCompositeDedicatedAccountFlag() {
        return compositeDedicatedAccountFlag;
    }


    /**
     * Sets the compositeDedicatedAccountFlag value for this GetAccountDetailsResponseResponseHeaderBalanceAndDateDedicatedAccountInformation.
     * 
     * @param compositeDedicatedAccountFlag
     */
    public void setCompositeDedicatedAccountFlag(String compositeDedicatedAccountFlag) {
        this.compositeDedicatedAccountFlag = compositeDedicatedAccountFlag;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GetAccountDetailsResponseResponseHeaderBalanceAndDateDedicatedAccountInformation)) return false;
        GetAccountDetailsResponseResponseHeaderBalanceAndDateDedicatedAccountInformation other = (GetAccountDetailsResponseResponseHeaderBalanceAndDateDedicatedAccountInformation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dedicatedAccountID==null && other.getDedicatedAccountID()==null) || 
             (this.dedicatedAccountID!=null &&
              this.dedicatedAccountID.equals(other.getDedicatedAccountID()))) &&
            ((this.dedicatedAccountIDDesc==null && other.getDedicatedAccountIDDesc()==null) || 
             (this.dedicatedAccountIDDesc!=null &&
              this.dedicatedAccountIDDesc.equals(other.getDedicatedAccountIDDesc()))) &&
            ((this.dedicatedAccountValue1==null && other.getDedicatedAccountValue1()==null) || 
             (this.dedicatedAccountValue1!=null &&
              this.dedicatedAccountValue1.equals(other.getDedicatedAccountValue1()))) &&
            ((this.dedicatedAccountValue2==null && other.getDedicatedAccountValue2()==null) || 
             (this.dedicatedAccountValue2!=null &&
              this.dedicatedAccountValue2.equals(other.getDedicatedAccountValue2()))) &&
            ((this.expiryDate==null && other.getExpiryDate()==null) || 
             (this.expiryDate!=null &&
              this.expiryDate.equals(other.getExpiryDate()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.pamServiceID==null && other.getPamServiceID()==null) || 
             (this.pamServiceID!=null &&
              this.pamServiceID.equals(other.getPamServiceID()))) &&
            ((this.offerID==null && other.getOfferID()==null) || 
             (this.offerID!=null &&
              this.offerID.equals(other.getOfferID()))) &&
            ((this.productID==null && other.getProductID()==null) || 
             (this.productID!=null &&
              this.productID.equals(other.getProductID()))) &&
            ((this.dedicatedAccountRealMoneyFlag==null && other.getDedicatedAccountRealMoneyFlag()==null) || 
             (this.dedicatedAccountRealMoneyFlag!=null &&
              this.dedicatedAccountRealMoneyFlag.equals(other.getDedicatedAccountRealMoneyFlag()))) &&
            ((this.closestExpiryDate==null && other.getClosestExpiryDate()==null) || 
             (this.closestExpiryDate!=null &&
              this.closestExpiryDate.equals(other.getClosestExpiryDate()))) &&
            ((this.closestExpiryValue1==null && other.getClosestExpiryValue1()==null) || 
             (this.closestExpiryValue1!=null &&
              this.closestExpiryValue1.equals(other.getClosestExpiryValue1()))) &&
            ((this.closestExpiryValue2==null && other.getClosestExpiryValue2()==null) || 
             (this.closestExpiryValue2!=null &&
              this.closestExpiryValue2.equals(other.getClosestExpiryValue2()))) &&
            ((this.closestAccessibleDate==null && other.getClosestAccessibleDate()==null) || 
             (this.closestAccessibleDate!=null &&
              this.closestAccessibleDate.equals(other.getClosestAccessibleDate()))) &&
            ((this.closestAccessibleValue1==null && other.getClosestAccessibleValue1()==null) || 
             (this.closestAccessibleValue1!=null &&
              this.closestAccessibleValue1.equals(other.getClosestAccessibleValue1()))) &&
            ((this.closestAccessibleValue2==null && other.getClosestAccessibleValue2()==null) || 
             (this.closestAccessibleValue2!=null &&
              this.closestAccessibleValue2.equals(other.getClosestAccessibleValue2()))) &&
            ((this.subDedicatedAccountInformation==null && other.getSubDedicatedAccountInformation()==null) || 
             (this.subDedicatedAccountInformation!=null &&
              java.util.Arrays.equals(this.subDedicatedAccountInformation, other.getSubDedicatedAccountInformation()))) &&
            ((this.dedicatedAccountActiveValue1==null && other.getDedicatedAccountActiveValue1()==null) || 
             (this.dedicatedAccountActiveValue1!=null &&
              this.dedicatedAccountActiveValue1.equals(other.getDedicatedAccountActiveValue1()))) &&
            ((this.dedicatedAccountActiveValue2==null && other.getDedicatedAccountActiveValue2()==null) || 
             (this.dedicatedAccountActiveValue2!=null &&
              this.dedicatedAccountActiveValue2.equals(other.getDedicatedAccountActiveValue2()))) &&
            ((this.dedicatedAccountUnitType==null && other.getDedicatedAccountUnitType()==null) || 
             (this.dedicatedAccountUnitType!=null &&
              this.dedicatedAccountUnitType.equals(other.getDedicatedAccountUnitType()))) &&
            ((this.compositeDedicatedAccountFlag==null && other.getCompositeDedicatedAccountFlag()==null) || 
             (this.compositeDedicatedAccountFlag!=null &&
              this.compositeDedicatedAccountFlag.equals(other.getCompositeDedicatedAccountFlag())));
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
        if (getDedicatedAccountID() != null) {
            _hashCode += getDedicatedAccountID().hashCode();
        }
        if (getDedicatedAccountIDDesc() != null) {
            _hashCode += getDedicatedAccountIDDesc().hashCode();
        }
        if (getDedicatedAccountValue1() != null) {
            _hashCode += getDedicatedAccountValue1().hashCode();
        }
        if (getDedicatedAccountValue2() != null) {
            _hashCode += getDedicatedAccountValue2().hashCode();
        }
        if (getExpiryDate() != null) {
            _hashCode += getExpiryDate().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getPamServiceID() != null) {
            _hashCode += getPamServiceID().hashCode();
        }
        if (getOfferID() != null) {
            _hashCode += getOfferID().hashCode();
        }
        if (getProductID() != null) {
            _hashCode += getProductID().hashCode();
        }
        if (getDedicatedAccountRealMoneyFlag() != null) {
            _hashCode += getDedicatedAccountRealMoneyFlag().hashCode();
        }
        if (getClosestExpiryDate() != null) {
            _hashCode += getClosestExpiryDate().hashCode();
        }
        if (getClosestExpiryValue1() != null) {
            _hashCode += getClosestExpiryValue1().hashCode();
        }
        if (getClosestExpiryValue2() != null) {
            _hashCode += getClosestExpiryValue2().hashCode();
        }
        if (getClosestAccessibleDate() != null) {
            _hashCode += getClosestAccessibleDate().hashCode();
        }
        if (getClosestAccessibleValue1() != null) {
            _hashCode += getClosestAccessibleValue1().hashCode();
        }
        if (getClosestAccessibleValue2() != null) {
            _hashCode += getClosestAccessibleValue2().hashCode();
        }
        if (getSubDedicatedAccountInformation() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubDedicatedAccountInformation());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getSubDedicatedAccountInformation(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDedicatedAccountActiveValue1() != null) {
            _hashCode += getDedicatedAccountActiveValue1().hashCode();
        }
        if (getDedicatedAccountActiveValue2() != null) {
            _hashCode += getDedicatedAccountActiveValue2().hashCode();
        }
        if (getDedicatedAccountUnitType() != null) {
            _hashCode += getDedicatedAccountUnitType().hashCode();
        }
        if (getCompositeDedicatedAccountFlag() != null) {
            _hashCode += getCompositeDedicatedAccountFlag().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetAccountDetailsResponseResponseHeaderBalanceAndDateDedicatedAccountInformation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", ">>>>GetAccountDetailsResponse>ResponseHeader>BalanceAndDate>dedicatedAccountInformation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dedicatedAccountID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "dedicatedAccountID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dedicatedAccountIDDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "dedicatedAccountIDDesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dedicatedAccountValue1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "dedicatedAccountValue1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dedicatedAccountValue2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "dedicatedAccountValue2"));
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
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "startDate"));
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
        elemField.setFieldName("offerID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "offerID"));
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
        elemField.setFieldName("dedicatedAccountRealMoneyFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "dedicatedAccountRealMoneyFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("closestExpiryDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "closestExpiryDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("closestExpiryValue1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "closestExpiryValue1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("closestExpiryValue2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "closestExpiryValue2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("closestAccessibleDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "closestAccessibleDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("closestAccessibleValue1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "closestAccessibleValue1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("closestAccessibleValue2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "closestAccessibleValue2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subDedicatedAccountInformation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "subDedicatedAccountInformation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", ">>>>>GetAccountDetailsResponse>ResponseHeader>BalanceAndDate>dedicatedAccountInformation>subDedicatedAccountInformation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dedicatedAccountActiveValue1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "dedicatedAccountActiveValue1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dedicatedAccountActiveValue2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "dedicatedAccountActiveValue2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dedicatedAccountUnitType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "dedicatedAccountUnitType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("compositeDedicatedAccountFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "compositeDedicatedAccountFlag"));
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
