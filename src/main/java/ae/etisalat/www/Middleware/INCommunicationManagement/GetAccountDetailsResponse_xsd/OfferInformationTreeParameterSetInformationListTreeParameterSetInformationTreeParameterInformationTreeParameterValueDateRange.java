/**
 * OfferInformationTreeParameterSetInformationListTreeParameterSetInformationTreeParameterInformationTreeParameterValueDateRange.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd;

public class OfferInformationTreeParameterSetInformationListTreeParameterSetInformationTreeParameterInformationTreeParameterValueDateRange  implements java.io.Serializable {
    private String treeParameterStartDate;

    private String treeParameterEndDate;

    public OfferInformationTreeParameterSetInformationListTreeParameterSetInformationTreeParameterInformationTreeParameterValueDateRange() {
    }

    public OfferInformationTreeParameterSetInformationListTreeParameterSetInformationTreeParameterInformationTreeParameterValueDateRange(
           String treeParameterStartDate,
           String treeParameterEndDate) {
           this.treeParameterStartDate = treeParameterStartDate;
           this.treeParameterEndDate = treeParameterEndDate;
    }


    /**
     * Gets the treeParameterStartDate value for this OfferInformationTreeParameterSetInformationListTreeParameterSetInformationTreeParameterInformationTreeParameterValueDateRange.
     * 
     * @return treeParameterStartDate
     */
    public String getTreeParameterStartDate() {
        return treeParameterStartDate;
    }


    /**
     * Sets the treeParameterStartDate value for this OfferInformationTreeParameterSetInformationListTreeParameterSetInformationTreeParameterInformationTreeParameterValueDateRange.
     * 
     * @param treeParameterStartDate
     */
    public void setTreeParameterStartDate(String treeParameterStartDate) {
        this.treeParameterStartDate = treeParameterStartDate;
    }


    /**
     * Gets the treeParameterEndDate value for this OfferInformationTreeParameterSetInformationListTreeParameterSetInformationTreeParameterInformationTreeParameterValueDateRange.
     * 
     * @return treeParameterEndDate
     */
    public String getTreeParameterEndDate() {
        return treeParameterEndDate;
    }


    /**
     * Sets the treeParameterEndDate value for this OfferInformationTreeParameterSetInformationListTreeParameterSetInformationTreeParameterInformationTreeParameterValueDateRange.
     * 
     * @param treeParameterEndDate
     */
    public void setTreeParameterEndDate(String treeParameterEndDate) {
        this.treeParameterEndDate = treeParameterEndDate;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof OfferInformationTreeParameterSetInformationListTreeParameterSetInformationTreeParameterInformationTreeParameterValueDateRange)) return false;
        OfferInformationTreeParameterSetInformationListTreeParameterSetInformationTreeParameterInformationTreeParameterValueDateRange other = (OfferInformationTreeParameterSetInformationListTreeParameterSetInformationTreeParameterInformationTreeParameterValueDateRange) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.treeParameterStartDate==null && other.getTreeParameterStartDate()==null) || 
             (this.treeParameterStartDate!=null &&
              this.treeParameterStartDate.equals(other.getTreeParameterStartDate()))) &&
            ((this.treeParameterEndDate==null && other.getTreeParameterEndDate()==null) || 
             (this.treeParameterEndDate!=null &&
              this.treeParameterEndDate.equals(other.getTreeParameterEndDate())));
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
        if (getTreeParameterStartDate() != null) {
            _hashCode += getTreeParameterStartDate().hashCode();
        }
        if (getTreeParameterEndDate() != null) {
            _hashCode += getTreeParameterEndDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OfferInformationTreeParameterSetInformationListTreeParameterSetInformationTreeParameterInformationTreeParameterValueDateRange.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", ">>>>>OfferInformation>TreeParameterSetInformationList>TreeParameterSetInformation>TreeParameterInformation>TreeParameterValueDateRange"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("treeParameterStartDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "TreeParameterStartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("treeParameterEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "TreeParameterEndDate"));
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
