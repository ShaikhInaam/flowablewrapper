/**
 * OfferInformationTreeParameterSetInformationListTreeParameterSetInformationTreeParameterInformationTreeParameterValueDecimal.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd;

public class OfferInformationTreeParameterSetInformationListTreeParameterSetInformationTreeParameterInformationTreeParameterValueDecimal  implements java.io.Serializable {
    private String treeParameterValueNumber;

    private String numberOfDecimals;

    public OfferInformationTreeParameterSetInformationListTreeParameterSetInformationTreeParameterInformationTreeParameterValueDecimal() {
    }

    public OfferInformationTreeParameterSetInformationListTreeParameterSetInformationTreeParameterInformationTreeParameterValueDecimal(
           String treeParameterValueNumber,
           String numberOfDecimals) {
           this.treeParameterValueNumber = treeParameterValueNumber;
           this.numberOfDecimals = numberOfDecimals;
    }


    /**
     * Gets the treeParameterValueNumber value for this OfferInformationTreeParameterSetInformationListTreeParameterSetInformationTreeParameterInformationTreeParameterValueDecimal.
     * 
     * @return treeParameterValueNumber
     */
    public String getTreeParameterValueNumber() {
        return treeParameterValueNumber;
    }


    /**
     * Sets the treeParameterValueNumber value for this OfferInformationTreeParameterSetInformationListTreeParameterSetInformationTreeParameterInformationTreeParameterValueDecimal.
     * 
     * @param treeParameterValueNumber
     */
    public void setTreeParameterValueNumber(String treeParameterValueNumber) {
        this.treeParameterValueNumber = treeParameterValueNumber;
    }


    /**
     * Gets the numberOfDecimals value for this OfferInformationTreeParameterSetInformationListTreeParameterSetInformationTreeParameterInformationTreeParameterValueDecimal.
     * 
     * @return numberOfDecimals
     */
    public String getNumberOfDecimals() {
        return numberOfDecimals;
    }


    /**
     * Sets the numberOfDecimals value for this OfferInformationTreeParameterSetInformationListTreeParameterSetInformationTreeParameterInformationTreeParameterValueDecimal.
     * 
     * @param numberOfDecimals
     */
    public void setNumberOfDecimals(String numberOfDecimals) {
        this.numberOfDecimals = numberOfDecimals;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof OfferInformationTreeParameterSetInformationListTreeParameterSetInformationTreeParameterInformationTreeParameterValueDecimal)) return false;
        OfferInformationTreeParameterSetInformationListTreeParameterSetInformationTreeParameterInformationTreeParameterValueDecimal other = (OfferInformationTreeParameterSetInformationListTreeParameterSetInformationTreeParameterInformationTreeParameterValueDecimal) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.treeParameterValueNumber==null && other.getTreeParameterValueNumber()==null) || 
             (this.treeParameterValueNumber!=null &&
              this.treeParameterValueNumber.equals(other.getTreeParameterValueNumber()))) &&
            ((this.numberOfDecimals==null && other.getNumberOfDecimals()==null) || 
             (this.numberOfDecimals!=null &&
              this.numberOfDecimals.equals(other.getNumberOfDecimals())));
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
        if (getTreeParameterValueNumber() != null) {
            _hashCode += getTreeParameterValueNumber().hashCode();
        }
        if (getNumberOfDecimals() != null) {
            _hashCode += getNumberOfDecimals().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OfferInformationTreeParameterSetInformationListTreeParameterSetInformationTreeParameterInformationTreeParameterValueDecimal.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", ">>>>>OfferInformation>TreeParameterSetInformationList>TreeParameterSetInformation>TreeParameterInformation>TreeParameterValueDecimal"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("treeParameterValueNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "TreeParameterValueNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberOfDecimals");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "NumberOfDecimals"));
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
