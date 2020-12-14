/**
 * OfferInformationTreeParameterSetInformationListTreeParameterSetInformation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd;

public class OfferInformationTreeParameterSetInformationListTreeParameterSetInformation  implements java.io.Serializable {
    private String serviceProvider;

    private ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.OfferInformationTreeParameterSetInformationListTreeParameterSetInformationTreeParameterInformation[] treeParameterInformation;

    public OfferInformationTreeParameterSetInformationListTreeParameterSetInformation() {
    }

    public OfferInformationTreeParameterSetInformationListTreeParameterSetInformation(
           String serviceProvider,
           ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.OfferInformationTreeParameterSetInformationListTreeParameterSetInformationTreeParameterInformation[] treeParameterInformation) {
           this.serviceProvider = serviceProvider;
           this.treeParameterInformation = treeParameterInformation;
    }


    /**
     * Gets the serviceProvider value for this OfferInformationTreeParameterSetInformationListTreeParameterSetInformation.
     * 
     * @return serviceProvider
     */
    public String getServiceProvider() {
        return serviceProvider;
    }


    /**
     * Sets the serviceProvider value for this OfferInformationTreeParameterSetInformationListTreeParameterSetInformation.
     * 
     * @param serviceProvider
     */
    public void setServiceProvider(String serviceProvider) {
        this.serviceProvider = serviceProvider;
    }


    /**
     * Gets the treeParameterInformation value for this OfferInformationTreeParameterSetInformationListTreeParameterSetInformation.
     * 
     * @return treeParameterInformation
     */
    public ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.OfferInformationTreeParameterSetInformationListTreeParameterSetInformationTreeParameterInformation[] getTreeParameterInformation() {
        return treeParameterInformation;
    }


    /**
     * Sets the treeParameterInformation value for this OfferInformationTreeParameterSetInformationListTreeParameterSetInformation.
     * 
     * @param treeParameterInformation
     */
    public void setTreeParameterInformation(ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.OfferInformationTreeParameterSetInformationListTreeParameterSetInformationTreeParameterInformation[] treeParameterInformation) {
        this.treeParameterInformation = treeParameterInformation;
    }

    public ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.OfferInformationTreeParameterSetInformationListTreeParameterSetInformationTreeParameterInformation getTreeParameterInformation(int i) {
        return this.treeParameterInformation[i];
    }

    public void setTreeParameterInformation(int i, ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.OfferInformationTreeParameterSetInformationListTreeParameterSetInformationTreeParameterInformation _value) {
        this.treeParameterInformation[i] = _value;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof OfferInformationTreeParameterSetInformationListTreeParameterSetInformation)) return false;
        OfferInformationTreeParameterSetInformationListTreeParameterSetInformation other = (OfferInformationTreeParameterSetInformationListTreeParameterSetInformation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.serviceProvider==null && other.getServiceProvider()==null) || 
             (this.serviceProvider!=null &&
              this.serviceProvider.equals(other.getServiceProvider()))) &&
            ((this.treeParameterInformation==null && other.getTreeParameterInformation()==null) || 
             (this.treeParameterInformation!=null &&
              java.util.Arrays.equals(this.treeParameterInformation, other.getTreeParameterInformation())));
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
        if (getServiceProvider() != null) {
            _hashCode += getServiceProvider().hashCode();
        }
        if (getTreeParameterInformation() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTreeParameterInformation());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getTreeParameterInformation(), i);
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
        new org.apache.axis.description.TypeDesc(OfferInformationTreeParameterSetInformationListTreeParameterSetInformation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", ">>>OfferInformation>TreeParameterSetInformationList>TreeParameterSetInformation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceProvider");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "ServiceProvider"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("treeParameterInformation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "TreeParameterInformation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", ">>>>OfferInformation>TreeParameterSetInformationList>TreeParameterSetInformation>TreeParameterInformation"));
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
