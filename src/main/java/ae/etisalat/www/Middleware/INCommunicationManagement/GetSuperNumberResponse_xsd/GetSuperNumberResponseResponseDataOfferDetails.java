/**
 * GetSuperNumberResponseResponseDataOfferDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ae.etisalat.www.Middleware.INCommunicationManagement.GetSuperNumberResponse_xsd;

public class GetSuperNumberResponseResponseDataOfferDetails  implements java.io.Serializable {
    private String offerID;

    private String expiryDate;

    private ae.etisalat.www.Middleware.INCommunicationManagement.GetSuperNumberResponse_xsd.GetSuperNumberResponseResponseDataOfferDetailsSlotDetails[] slotDetails;

    private ae.etisalat.www.Middleware.SharedResources.Common.Common_xsd.AdditionalInfo[] additionalInfo;

    public GetSuperNumberResponseResponseDataOfferDetails() {
    }

    public GetSuperNumberResponseResponseDataOfferDetails(
           String offerID,
           String expiryDate,
           ae.etisalat.www.Middleware.INCommunicationManagement.GetSuperNumberResponse_xsd.GetSuperNumberResponseResponseDataOfferDetailsSlotDetails[] slotDetails,
           ae.etisalat.www.Middleware.SharedResources.Common.Common_xsd.AdditionalInfo[] additionalInfo) {
           this.offerID = offerID;
           this.expiryDate = expiryDate;
           this.slotDetails = slotDetails;
           this.additionalInfo = additionalInfo;
    }


    /**
     * Gets the offerID value for this GetSuperNumberResponseResponseDataOfferDetails.
     * 
     * @return offerID
     */
    public String getOfferID() {
        return offerID;
    }


    /**
     * Sets the offerID value for this GetSuperNumberResponseResponseDataOfferDetails.
     * 
     * @param offerID
     */
    public void setOfferID(String offerID) {
        this.offerID = offerID;
    }


    /**
     * Gets the expiryDate value for this GetSuperNumberResponseResponseDataOfferDetails.
     * 
     * @return expiryDate
     */
    public String getExpiryDate() {
        return expiryDate;
    }


    /**
     * Sets the expiryDate value for this GetSuperNumberResponseResponseDataOfferDetails.
     * 
     * @param expiryDate
     */
    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }


    /**
     * Gets the slotDetails value for this GetSuperNumberResponseResponseDataOfferDetails.
     * 
     * @return slotDetails
     */
    public ae.etisalat.www.Middleware.INCommunicationManagement.GetSuperNumberResponse_xsd.GetSuperNumberResponseResponseDataOfferDetailsSlotDetails[] getSlotDetails() {
        return slotDetails;
    }


    /**
     * Sets the slotDetails value for this GetSuperNumberResponseResponseDataOfferDetails.
     * 
     * @param slotDetails
     */
    public void setSlotDetails(ae.etisalat.www.Middleware.INCommunicationManagement.GetSuperNumberResponse_xsd.GetSuperNumberResponseResponseDataOfferDetailsSlotDetails[] slotDetails) {
        this.slotDetails = slotDetails;
    }

    public ae.etisalat.www.Middleware.INCommunicationManagement.GetSuperNumberResponse_xsd.GetSuperNumberResponseResponseDataOfferDetailsSlotDetails getSlotDetails(int i) {
        return this.slotDetails[i];
    }

    public void setSlotDetails(int i, ae.etisalat.www.Middleware.INCommunicationManagement.GetSuperNumberResponse_xsd.GetSuperNumberResponseResponseDataOfferDetailsSlotDetails _value) {
        this.slotDetails[i] = _value;
    }


    /**
     * Gets the additionalInfo value for this GetSuperNumberResponseResponseDataOfferDetails.
     * 
     * @return additionalInfo
     */
    public ae.etisalat.www.Middleware.SharedResources.Common.Common_xsd.AdditionalInfo[] getAdditionalInfo() {
        return additionalInfo;
    }


    /**
     * Sets the additionalInfo value for this GetSuperNumberResponseResponseDataOfferDetails.
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
        if (!(obj instanceof GetSuperNumberResponseResponseDataOfferDetails)) return false;
        GetSuperNumberResponseResponseDataOfferDetails other = (GetSuperNumberResponseResponseDataOfferDetails) obj;
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
            ((this.expiryDate==null && other.getExpiryDate()==null) || 
             (this.expiryDate!=null &&
              this.expiryDate.equals(other.getExpiryDate()))) &&
            ((this.slotDetails==null && other.getSlotDetails()==null) || 
             (this.slotDetails!=null &&
              java.util.Arrays.equals(this.slotDetails, other.getSlotDetails()))) &&
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
        if (getOfferID() != null) {
            _hashCode += getOfferID().hashCode();
        }
        if (getExpiryDate() != null) {
            _hashCode += getExpiryDate().hashCode();
        }
        if (getSlotDetails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSlotDetails());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getSlotDetails(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        new org.apache.axis.description.TypeDesc(GetSuperNumberResponseResponseDataOfferDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetSuperNumberResponse.xsd", ">>>GetSuperNumberResponse>ResponseData>OfferDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offerID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetSuperNumberResponse.xsd", "OfferID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expiryDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetSuperNumberResponse.xsd", "ExpiryDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("slotDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetSuperNumberResponse.xsd", "SlotDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetSuperNumberResponse.xsd", ">>>>GetSuperNumberResponse>ResponseData>OfferDetails>SlotDetails"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
