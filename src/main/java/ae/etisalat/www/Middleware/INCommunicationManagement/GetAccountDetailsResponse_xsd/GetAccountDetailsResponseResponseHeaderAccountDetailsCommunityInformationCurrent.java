/**
 * GetAccountDetailsResponseResponseHeaderAccountDetailsCommunityInformationCurrent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd;

public class GetAccountDetailsResponseResponseHeaderAccountDetailsCommunityInformationCurrent  implements java.io.Serializable {
    private String communityID;

    private String communityIDDesc;

    public GetAccountDetailsResponseResponseHeaderAccountDetailsCommunityInformationCurrent() {
    }

    public GetAccountDetailsResponseResponseHeaderAccountDetailsCommunityInformationCurrent(
           String communityID,
           String communityIDDesc) {
           this.communityID = communityID;
           this.communityIDDesc = communityIDDesc;
    }


    /**
     * Gets the communityID value for this GetAccountDetailsResponseResponseHeaderAccountDetailsCommunityInformationCurrent.
     * 
     * @return communityID
     */
    public String getCommunityID() {
        return communityID;
    }


    /**
     * Sets the communityID value for this GetAccountDetailsResponseResponseHeaderAccountDetailsCommunityInformationCurrent.
     * 
     * @param communityID
     */
    public void setCommunityID(String communityID) {
        this.communityID = communityID;
    }


    /**
     * Gets the communityIDDesc value for this GetAccountDetailsResponseResponseHeaderAccountDetailsCommunityInformationCurrent.
     * 
     * @return communityIDDesc
     */
    public String getCommunityIDDesc() {
        return communityIDDesc;
    }


    /**
     * Sets the communityIDDesc value for this GetAccountDetailsResponseResponseHeaderAccountDetailsCommunityInformationCurrent.
     * 
     * @param communityIDDesc
     */
    public void setCommunityIDDesc(String communityIDDesc) {
        this.communityIDDesc = communityIDDesc;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GetAccountDetailsResponseResponseHeaderAccountDetailsCommunityInformationCurrent)) return false;
        GetAccountDetailsResponseResponseHeaderAccountDetailsCommunityInformationCurrent other = (GetAccountDetailsResponseResponseHeaderAccountDetailsCommunityInformationCurrent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.communityID==null && other.getCommunityID()==null) || 
             (this.communityID!=null &&
              this.communityID.equals(other.getCommunityID()))) &&
            ((this.communityIDDesc==null && other.getCommunityIDDesc()==null) || 
             (this.communityIDDesc!=null &&
              this.communityIDDesc.equals(other.getCommunityIDDesc())));
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
        if (getCommunityID() != null) {
            _hashCode += getCommunityID().hashCode();
        }
        if (getCommunityIDDesc() != null) {
            _hashCode += getCommunityIDDesc().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetAccountDetailsResponseResponseHeaderAccountDetailsCommunityInformationCurrent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", ">>>>GetAccountDetailsResponse>ResponseHeader>AccountDetails>communityInformationCurrent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("communityID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "communityID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("communityIDDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "communityIDDesc"));
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
