/**
 * GetDADetailsRequestDataHeaderDADetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ae.etisalat.www.Middleware.INCommunicationManagement.GetDADetailsRequest_xsd;

public class GetDADetailsRequestDataHeaderDADetails  implements java.io.Serializable {
    private String DAID;

    private String resourceTypeID;

    private ae.etisalat.www.Middleware.SharedResources.Common.Common_xsd.AdditionalInfo[] additionalInfo;

    public GetDADetailsRequestDataHeaderDADetails() {
    }

    public GetDADetailsRequestDataHeaderDADetails(
           String DAID,
           String resourceTypeID,
           ae.etisalat.www.Middleware.SharedResources.Common.Common_xsd.AdditionalInfo[] additionalInfo) {
           this.DAID = DAID;
           this.resourceTypeID = resourceTypeID;
           this.additionalInfo = additionalInfo;
    }


    /**
     * Gets the DAID value for this GetDADetailsRequestDataHeaderDADetails.
     * 
     * @return DAID
     */
    public String getDAID() {
        return DAID;
    }


    /**
     * Sets the DAID value for this GetDADetailsRequestDataHeaderDADetails.
     * 
     * @param DAID
     */
    public void setDAID(String DAID) {
        this.DAID = DAID;
    }


    /**
     * Gets the resourceTypeID value for this GetDADetailsRequestDataHeaderDADetails.
     * 
     * @return resourceTypeID
     */
    public String getResourceTypeID() {
        return resourceTypeID;
    }


    /**
     * Sets the resourceTypeID value for this GetDADetailsRequestDataHeaderDADetails.
     * 
     * @param resourceTypeID
     */
    public void setResourceTypeID(String resourceTypeID) {
        this.resourceTypeID = resourceTypeID;
    }


    /**
     * Gets the additionalInfo value for this GetDADetailsRequestDataHeaderDADetails.
     * 
     * @return additionalInfo
     */
    public ae.etisalat.www.Middleware.SharedResources.Common.Common_xsd.AdditionalInfo[] getAdditionalInfo() {
        return additionalInfo;
    }


    /**
     * Sets the additionalInfo value for this GetDADetailsRequestDataHeaderDADetails.
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
        if (!(obj instanceof GetDADetailsRequestDataHeaderDADetails)) return false;
        GetDADetailsRequestDataHeaderDADetails other = (GetDADetailsRequestDataHeaderDADetails) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.DAID==null && other.getDAID()==null) || 
             (this.DAID!=null &&
              this.DAID.equals(other.getDAID()))) &&
            ((this.resourceTypeID==null && other.getResourceTypeID()==null) || 
             (this.resourceTypeID!=null &&
              this.resourceTypeID.equals(other.getResourceTypeID()))) &&
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
        if (getDAID() != null) {
            _hashCode += getDAID().hashCode();
        }
        if (getResourceTypeID() != null) {
            _hashCode += getResourceTypeID().hashCode();
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
        new org.apache.axis.description.TypeDesc(GetDADetailsRequestDataHeaderDADetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetDADetailsRequest.xsd", ">>>GetDADetailsRequest>DataHeader>DADetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DAID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetDADetailsRequest.xsd", "DAID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resourceTypeID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetDADetailsRequest.xsd", "ResourceTypeID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
