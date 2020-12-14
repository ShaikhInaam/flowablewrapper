/**
 * GetSuperNumberResponseResponseDataOfferDetailsSlotDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ae.etisalat.www.Middleware.INCommunicationManagement.GetSuperNumberResponse_xsd;

public class GetSuperNumberResponseResponseDataOfferDetailsSlotDetails  implements java.io.Serializable {
    private java.math.BigInteger rank;

    private String faFStatus;

    private String faFNumber;

    private String changeCounter;

    private ae.etisalat.www.Middleware.SharedResources.Common.Common_xsd.AdditionalInfo[] additionalInfo;

    public GetSuperNumberResponseResponseDataOfferDetailsSlotDetails() {
    }

    public GetSuperNumberResponseResponseDataOfferDetailsSlotDetails(
           java.math.BigInteger rank,
           String faFStatus,
           String faFNumber,
           String changeCounter,
           ae.etisalat.www.Middleware.SharedResources.Common.Common_xsd.AdditionalInfo[] additionalInfo) {
           this.rank = rank;
           this.faFStatus = faFStatus;
           this.faFNumber = faFNumber;
           this.changeCounter = changeCounter;
           this.additionalInfo = additionalInfo;
    }


    /**
     * Gets the rank value for this GetSuperNumberResponseResponseDataOfferDetailsSlotDetails.
     * 
     * @return rank
     */
    public java.math.BigInteger getRank() {
        return rank;
    }


    /**
     * Sets the rank value for this GetSuperNumberResponseResponseDataOfferDetailsSlotDetails.
     * 
     * @param rank
     */
    public void setRank(java.math.BigInteger rank) {
        this.rank = rank;
    }


    /**
     * Gets the faFStatus value for this GetSuperNumberResponseResponseDataOfferDetailsSlotDetails.
     * 
     * @return faFStatus
     */
    public String getFaFStatus() {
        return faFStatus;
    }


    /**
     * Sets the faFStatus value for this GetSuperNumberResponseResponseDataOfferDetailsSlotDetails.
     * 
     * @param faFStatus
     */
    public void setFaFStatus(String faFStatus) {
        this.faFStatus = faFStatus;
    }


    /**
     * Gets the faFNumber value for this GetSuperNumberResponseResponseDataOfferDetailsSlotDetails.
     * 
     * @return faFNumber
     */
    public String getFaFNumber() {
        return faFNumber;
    }


    /**
     * Sets the faFNumber value for this GetSuperNumberResponseResponseDataOfferDetailsSlotDetails.
     * 
     * @param faFNumber
     */
    public void setFaFNumber(String faFNumber) {
        this.faFNumber = faFNumber;
    }


    /**
     * Gets the changeCounter value for this GetSuperNumberResponseResponseDataOfferDetailsSlotDetails.
     * 
     * @return changeCounter
     */
    public String getChangeCounter() {
        return changeCounter;
    }


    /**
     * Sets the changeCounter value for this GetSuperNumberResponseResponseDataOfferDetailsSlotDetails.
     * 
     * @param changeCounter
     */
    public void setChangeCounter(String changeCounter) {
        this.changeCounter = changeCounter;
    }


    /**
     * Gets the additionalInfo value for this GetSuperNumberResponseResponseDataOfferDetailsSlotDetails.
     * 
     * @return additionalInfo
     */
    public ae.etisalat.www.Middleware.SharedResources.Common.Common_xsd.AdditionalInfo[] getAdditionalInfo() {
        return additionalInfo;
    }


    /**
     * Sets the additionalInfo value for this GetSuperNumberResponseResponseDataOfferDetailsSlotDetails.
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
        if (!(obj instanceof GetSuperNumberResponseResponseDataOfferDetailsSlotDetails)) return false;
        GetSuperNumberResponseResponseDataOfferDetailsSlotDetails other = (GetSuperNumberResponseResponseDataOfferDetailsSlotDetails) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.rank==null && other.getRank()==null) || 
             (this.rank!=null &&
              this.rank.equals(other.getRank()))) &&
            ((this.faFStatus==null && other.getFaFStatus()==null) || 
             (this.faFStatus!=null &&
              this.faFStatus.equals(other.getFaFStatus()))) &&
            ((this.faFNumber==null && other.getFaFNumber()==null) || 
             (this.faFNumber!=null &&
              this.faFNumber.equals(other.getFaFNumber()))) &&
            ((this.changeCounter==null && other.getChangeCounter()==null) || 
             (this.changeCounter!=null &&
              this.changeCounter.equals(other.getChangeCounter()))) &&
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
        if (getRank() != null) {
            _hashCode += getRank().hashCode();
        }
        if (getFaFStatus() != null) {
            _hashCode += getFaFStatus().hashCode();
        }
        if (getFaFNumber() != null) {
            _hashCode += getFaFNumber().hashCode();
        }
        if (getChangeCounter() != null) {
            _hashCode += getChangeCounter().hashCode();
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
        new org.apache.axis.description.TypeDesc(GetSuperNumberResponseResponseDataOfferDetailsSlotDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetSuperNumberResponse.xsd", ">>>>GetSuperNumberResponse>ResponseData>OfferDetails>SlotDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rank");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetSuperNumberResponse.xsd", "Rank"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("faFStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetSuperNumberResponse.xsd", "FaFStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("faFNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetSuperNumberResponse.xsd", "FaFNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changeCounter");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetSuperNumberResponse.xsd", "ChangeCounter"));
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
