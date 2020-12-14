/**
 * OfferInformationAggregatedOfferInformation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd;

public class OfferInformationAggregatedOfferInformation  implements java.io.Serializable {
    private ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.OfferInformationAggregatedOfferInformationAggregatedBalanceInformation aggregatedBalanceInformation;

    public OfferInformationAggregatedOfferInformation() {
    }

    public OfferInformationAggregatedOfferInformation(
           ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.OfferInformationAggregatedOfferInformationAggregatedBalanceInformation aggregatedBalanceInformation) {
           this.aggregatedBalanceInformation = aggregatedBalanceInformation;
    }


    /**
     * Gets the aggregatedBalanceInformation value for this OfferInformationAggregatedOfferInformation.
     * 
     * @return aggregatedBalanceInformation
     */
    public ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.OfferInformationAggregatedOfferInformationAggregatedBalanceInformation getAggregatedBalanceInformation() {
        return aggregatedBalanceInformation;
    }


    /**
     * Sets the aggregatedBalanceInformation value for this OfferInformationAggregatedOfferInformation.
     * 
     * @param aggregatedBalanceInformation
     */
    public void setAggregatedBalanceInformation(ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.OfferInformationAggregatedOfferInformationAggregatedBalanceInformation aggregatedBalanceInformation) {
        this.aggregatedBalanceInformation = aggregatedBalanceInformation;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof OfferInformationAggregatedOfferInformation)) return false;
        OfferInformationAggregatedOfferInformation other = (OfferInformationAggregatedOfferInformation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.aggregatedBalanceInformation==null && other.getAggregatedBalanceInformation()==null) || 
             (this.aggregatedBalanceInformation!=null &&
              this.aggregatedBalanceInformation.equals(other.getAggregatedBalanceInformation())));
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
        if (getAggregatedBalanceInformation() != null) {
            _hashCode += getAggregatedBalanceInformation().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OfferInformationAggregatedOfferInformation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", ">>OfferInformation>aggregatedOfferInformation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aggregatedBalanceInformation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "aggregatedBalanceInformation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", ">>>OfferInformation>aggregatedOfferInformation>aggregatedBalanceInformation"));
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
