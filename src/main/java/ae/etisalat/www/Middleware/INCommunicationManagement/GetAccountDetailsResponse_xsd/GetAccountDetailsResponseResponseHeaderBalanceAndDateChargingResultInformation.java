/**
 * GetAccountDetailsResponseResponseHeaderBalanceAndDateChargingResultInformation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd;

public class GetAccountDetailsResponseResponseHeaderBalanceAndDateChargingResultInformation  implements java.io.Serializable {
    private String cost1;

    private String currency1;

    private String cost2;

    private String currency2;

    private String chargingResultCode;

    private String reservationCorrelationID;

    private String chargingResultInformationService;

    public GetAccountDetailsResponseResponseHeaderBalanceAndDateChargingResultInformation() {
    }

    public GetAccountDetailsResponseResponseHeaderBalanceAndDateChargingResultInformation(
           String cost1,
           String currency1,
           String cost2,
           String currency2,
           String chargingResultCode,
           String reservationCorrelationID,
           String chargingResultInformationService) {
           this.cost1 = cost1;
           this.currency1 = currency1;
           this.cost2 = cost2;
           this.currency2 = currency2;
           this.chargingResultCode = chargingResultCode;
           this.reservationCorrelationID = reservationCorrelationID;
           this.chargingResultInformationService = chargingResultInformationService;
    }


    /**
     * Gets the cost1 value for this GetAccountDetailsResponseResponseHeaderBalanceAndDateChargingResultInformation.
     * 
     * @return cost1
     */
    public String getCost1() {
        return cost1;
    }


    /**
     * Sets the cost1 value for this GetAccountDetailsResponseResponseHeaderBalanceAndDateChargingResultInformation.
     * 
     * @param cost1
     */
    public void setCost1(String cost1) {
        this.cost1 = cost1;
    }


    /**
     * Gets the currency1 value for this GetAccountDetailsResponseResponseHeaderBalanceAndDateChargingResultInformation.
     * 
     * @return currency1
     */
    public String getCurrency1() {
        return currency1;
    }


    /**
     * Sets the currency1 value for this GetAccountDetailsResponseResponseHeaderBalanceAndDateChargingResultInformation.
     * 
     * @param currency1
     */
    public void setCurrency1(String currency1) {
        this.currency1 = currency1;
    }


    /**
     * Gets the cost2 value for this GetAccountDetailsResponseResponseHeaderBalanceAndDateChargingResultInformation.
     * 
     * @return cost2
     */
    public String getCost2() {
        return cost2;
    }


    /**
     * Sets the cost2 value for this GetAccountDetailsResponseResponseHeaderBalanceAndDateChargingResultInformation.
     * 
     * @param cost2
     */
    public void setCost2(String cost2) {
        this.cost2 = cost2;
    }


    /**
     * Gets the currency2 value for this GetAccountDetailsResponseResponseHeaderBalanceAndDateChargingResultInformation.
     * 
     * @return currency2
     */
    public String getCurrency2() {
        return currency2;
    }


    /**
     * Sets the currency2 value for this GetAccountDetailsResponseResponseHeaderBalanceAndDateChargingResultInformation.
     * 
     * @param currency2
     */
    public void setCurrency2(String currency2) {
        this.currency2 = currency2;
    }


    /**
     * Gets the chargingResultCode value for this GetAccountDetailsResponseResponseHeaderBalanceAndDateChargingResultInformation.
     * 
     * @return chargingResultCode
     */
    public String getChargingResultCode() {
        return chargingResultCode;
    }


    /**
     * Sets the chargingResultCode value for this GetAccountDetailsResponseResponseHeaderBalanceAndDateChargingResultInformation.
     * 
     * @param chargingResultCode
     */
    public void setChargingResultCode(String chargingResultCode) {
        this.chargingResultCode = chargingResultCode;
    }


    /**
     * Gets the reservationCorrelationID value for this GetAccountDetailsResponseResponseHeaderBalanceAndDateChargingResultInformation.
     * 
     * @return reservationCorrelationID
     */
    public String getReservationCorrelationID() {
        return reservationCorrelationID;
    }


    /**
     * Sets the reservationCorrelationID value for this GetAccountDetailsResponseResponseHeaderBalanceAndDateChargingResultInformation.
     * 
     * @param reservationCorrelationID
     */
    public void setReservationCorrelationID(String reservationCorrelationID) {
        this.reservationCorrelationID = reservationCorrelationID;
    }


    /**
     * Gets the chargingResultInformationService value for this GetAccountDetailsResponseResponseHeaderBalanceAndDateChargingResultInformation.
     * 
     * @return chargingResultInformationService
     */
    public String getChargingResultInformationService() {
        return chargingResultInformationService;
    }


    /**
     * Sets the chargingResultInformationService value for this GetAccountDetailsResponseResponseHeaderBalanceAndDateChargingResultInformation.
     * 
     * @param chargingResultInformationService
     */
    public void setChargingResultInformationService(String chargingResultInformationService) {
        this.chargingResultInformationService = chargingResultInformationService;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GetAccountDetailsResponseResponseHeaderBalanceAndDateChargingResultInformation)) return false;
        GetAccountDetailsResponseResponseHeaderBalanceAndDateChargingResultInformation other = (GetAccountDetailsResponseResponseHeaderBalanceAndDateChargingResultInformation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cost1==null && other.getCost1()==null) || 
             (this.cost1!=null &&
              this.cost1.equals(other.getCost1()))) &&
            ((this.currency1==null && other.getCurrency1()==null) || 
             (this.currency1!=null &&
              this.currency1.equals(other.getCurrency1()))) &&
            ((this.cost2==null && other.getCost2()==null) || 
             (this.cost2!=null &&
              this.cost2.equals(other.getCost2()))) &&
            ((this.currency2==null && other.getCurrency2()==null) || 
             (this.currency2!=null &&
              this.currency2.equals(other.getCurrency2()))) &&
            ((this.chargingResultCode==null && other.getChargingResultCode()==null) || 
             (this.chargingResultCode!=null &&
              this.chargingResultCode.equals(other.getChargingResultCode()))) &&
            ((this.reservationCorrelationID==null && other.getReservationCorrelationID()==null) || 
             (this.reservationCorrelationID!=null &&
              this.reservationCorrelationID.equals(other.getReservationCorrelationID()))) &&
            ((this.chargingResultInformationService==null && other.getChargingResultInformationService()==null) || 
             (this.chargingResultInformationService!=null &&
              this.chargingResultInformationService.equals(other.getChargingResultInformationService())));
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
        if (getCost1() != null) {
            _hashCode += getCost1().hashCode();
        }
        if (getCurrency1() != null) {
            _hashCode += getCurrency1().hashCode();
        }
        if (getCost2() != null) {
            _hashCode += getCost2().hashCode();
        }
        if (getCurrency2() != null) {
            _hashCode += getCurrency2().hashCode();
        }
        if (getChargingResultCode() != null) {
            _hashCode += getChargingResultCode().hashCode();
        }
        if (getReservationCorrelationID() != null) {
            _hashCode += getReservationCorrelationID().hashCode();
        }
        if (getChargingResultInformationService() != null) {
            _hashCode += getChargingResultInformationService().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetAccountDetailsResponseResponseHeaderBalanceAndDateChargingResultInformation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", ">>>>GetAccountDetailsResponse>ResponseHeader>BalanceAndDate>ChargingResultInformation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cost1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "cost1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "currency1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cost2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "cost2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "currency2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargingResultCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "chargingResultCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reservationCorrelationID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "reservationCorrelationID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargingResultInformationService");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "chargingResultInformationService"));
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
