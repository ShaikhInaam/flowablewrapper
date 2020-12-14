/**
 * GetNatureAndTypeDetailsResponseGetNatureAndTypeDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.GetNatureAndTypeDetailsResponse_xsd;

public class GetNatureAndTypeDetailsResponseGetNatureAndTypeDetails  implements java.io.Serializable {
    private String complaintNatureCode;

    private String complaintNatureDesc;

    private String requestNatureCode;

    private String requestNatureDesc;

    private ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.GetNatureAndTypeDetailsResponse_xsd.GetNatureAndTypeDetailsResponseGetNatureAndTypeDetailsComplaintTypeDetailsArray[] complaintTypeDetailsArray;

    private GetNatureAndTypeDetailsResponseGetNatureAndTypeDetailsRequestTypeDetailsArray[] requestTypeDetailsArray;

    public GetNatureAndTypeDetailsResponseGetNatureAndTypeDetails() {
    }

    public GetNatureAndTypeDetailsResponseGetNatureAndTypeDetails(
           String complaintNatureCode,
           String complaintNatureDesc,
           String requestNatureCode,
           String requestNatureDesc,
           ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.GetNatureAndTypeDetailsResponse_xsd.GetNatureAndTypeDetailsResponseGetNatureAndTypeDetailsComplaintTypeDetailsArray[] complaintTypeDetailsArray,
           GetNatureAndTypeDetailsResponseGetNatureAndTypeDetailsRequestTypeDetailsArray[] requestTypeDetailsArray) {
           this.complaintNatureCode = complaintNatureCode;
           this.complaintNatureDesc = complaintNatureDesc;
           this.requestNatureCode = requestNatureCode;
           this.requestNatureDesc = requestNatureDesc;
           this.complaintTypeDetailsArray = complaintTypeDetailsArray;
           this.requestTypeDetailsArray = requestTypeDetailsArray;
    }


    /**
     * Gets the complaintNatureCode value for this GetNatureAndTypeDetailsResponseGetNatureAndTypeDetails.
     * 
     * @return complaintNatureCode
     */
    public String getComplaintNatureCode() {
        return complaintNatureCode;
    }


    /**
     * Sets the complaintNatureCode value for this GetNatureAndTypeDetailsResponseGetNatureAndTypeDetails.
     * 
     * @param complaintNatureCode
     */
    public void setComplaintNatureCode(String complaintNatureCode) {
        this.complaintNatureCode = complaintNatureCode;
    }


    /**
     * Gets the complaintNatureDesc value for this GetNatureAndTypeDetailsResponseGetNatureAndTypeDetails.
     * 
     * @return complaintNatureDesc
     */
    public String getComplaintNatureDesc() {
        return complaintNatureDesc;
    }


    /**
     * Sets the complaintNatureDesc value for this GetNatureAndTypeDetailsResponseGetNatureAndTypeDetails.
     * 
     * @param complaintNatureDesc
     */
    public void setComplaintNatureDesc(String complaintNatureDesc) {
        this.complaintNatureDesc = complaintNatureDesc;
    }


    /**
     * Gets the requestNatureCode value for this GetNatureAndTypeDetailsResponseGetNatureAndTypeDetails.
     * 
     * @return requestNatureCode
     */
    public String getRequestNatureCode() {
        return requestNatureCode;
    }


    /**
     * Sets the requestNatureCode value for this GetNatureAndTypeDetailsResponseGetNatureAndTypeDetails.
     * 
     * @param requestNatureCode
     */
    public void setRequestNatureCode(String requestNatureCode) {
        this.requestNatureCode = requestNatureCode;
    }


    /**
     * Gets the requestNatureDesc value for this GetNatureAndTypeDetailsResponseGetNatureAndTypeDetails.
     * 
     * @return requestNatureDesc
     */
    public String getRequestNatureDesc() {
        return requestNatureDesc;
    }


    /**
     * Sets the requestNatureDesc value for this GetNatureAndTypeDetailsResponseGetNatureAndTypeDetails.
     * 
     * @param requestNatureDesc
     */
    public void setRequestNatureDesc(String requestNatureDesc) {
        this.requestNatureDesc = requestNatureDesc;
    }


    /**
     * Gets the complaintTypeDetailsArray value for this GetNatureAndTypeDetailsResponseGetNatureAndTypeDetails.
     * 
     * @return complaintTypeDetailsArray
     */
    public ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.GetNatureAndTypeDetailsResponse_xsd.GetNatureAndTypeDetailsResponseGetNatureAndTypeDetailsComplaintTypeDetailsArray[] getComplaintTypeDetailsArray() {
        return complaintTypeDetailsArray;
    }


    /**
     * Sets the complaintTypeDetailsArray value for this GetNatureAndTypeDetailsResponseGetNatureAndTypeDetails.
     * 
     * @param complaintTypeDetailsArray
     */
    public void setComplaintTypeDetailsArray(ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.GetNatureAndTypeDetailsResponse_xsd.GetNatureAndTypeDetailsResponseGetNatureAndTypeDetailsComplaintTypeDetailsArray[] complaintTypeDetailsArray) {
        this.complaintTypeDetailsArray = complaintTypeDetailsArray;
    }

    public ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.GetNatureAndTypeDetailsResponse_xsd.GetNatureAndTypeDetailsResponseGetNatureAndTypeDetailsComplaintTypeDetailsArray getComplaintTypeDetailsArray(int i) {
        return this.complaintTypeDetailsArray[i];
    }

    public void setComplaintTypeDetailsArray(int i, ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.GetNatureAndTypeDetailsResponse_xsd.GetNatureAndTypeDetailsResponseGetNatureAndTypeDetailsComplaintTypeDetailsArray _value) {
        this.complaintTypeDetailsArray[i] = _value;
    }


    /**
     * Gets the requestTypeDetailsArray value for this GetNatureAndTypeDetailsResponseGetNatureAndTypeDetails.
     * 
     * @return requestTypeDetailsArray
     */
    public GetNatureAndTypeDetailsResponseGetNatureAndTypeDetailsRequestTypeDetailsArray[] getRequestTypeDetailsArray() {
        return requestTypeDetailsArray;
    }


    /**
     * Sets the requestTypeDetailsArray value for this GetNatureAndTypeDetailsResponseGetNatureAndTypeDetails.
     * 
     * @param requestTypeDetailsArray
     */
    public void setRequestTypeDetailsArray(GetNatureAndTypeDetailsResponseGetNatureAndTypeDetailsRequestTypeDetailsArray[] requestTypeDetailsArray) {
        this.requestTypeDetailsArray = requestTypeDetailsArray;
    }

    public GetNatureAndTypeDetailsResponseGetNatureAndTypeDetailsRequestTypeDetailsArray getRequestTypeDetailsArray(int i) {
        return this.requestTypeDetailsArray[i];
    }

    public void setRequestTypeDetailsArray(int i, GetNatureAndTypeDetailsResponseGetNatureAndTypeDetailsRequestTypeDetailsArray _value) {
        this.requestTypeDetailsArray[i] = _value;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GetNatureAndTypeDetailsResponseGetNatureAndTypeDetails)) return false;
        GetNatureAndTypeDetailsResponseGetNatureAndTypeDetails other = (GetNatureAndTypeDetailsResponseGetNatureAndTypeDetails) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.complaintNatureCode==null && other.getComplaintNatureCode()==null) || 
             (this.complaintNatureCode!=null &&
              this.complaintNatureCode.equals(other.getComplaintNatureCode()))) &&
            ((this.complaintNatureDesc==null && other.getComplaintNatureDesc()==null) || 
             (this.complaintNatureDesc!=null &&
              this.complaintNatureDesc.equals(other.getComplaintNatureDesc()))) &&
            ((this.requestNatureCode==null && other.getRequestNatureCode()==null) || 
             (this.requestNatureCode!=null &&
              this.requestNatureCode.equals(other.getRequestNatureCode()))) &&
            ((this.requestNatureDesc==null && other.getRequestNatureDesc()==null) || 
             (this.requestNatureDesc!=null &&
              this.requestNatureDesc.equals(other.getRequestNatureDesc()))) &&
            ((this.complaintTypeDetailsArray==null && other.getComplaintTypeDetailsArray()==null) || 
             (this.complaintTypeDetailsArray!=null &&
              java.util.Arrays.equals(this.complaintTypeDetailsArray, other.getComplaintTypeDetailsArray()))) &&
            ((this.requestTypeDetailsArray==null && other.getRequestTypeDetailsArray()==null) || 
             (this.requestTypeDetailsArray!=null &&
              java.util.Arrays.equals(this.requestTypeDetailsArray, other.getRequestTypeDetailsArray())));
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
        if (getComplaintNatureCode() != null) {
            _hashCode += getComplaintNatureCode().hashCode();
        }
        if (getComplaintNatureDesc() != null) {
            _hashCode += getComplaintNatureDesc().hashCode();
        }
        if (getRequestNatureCode() != null) {
            _hashCode += getRequestNatureCode().hashCode();
        }
        if (getRequestNatureDesc() != null) {
            _hashCode += getRequestNatureDesc().hashCode();
        }
        if (getComplaintTypeDetailsArray() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getComplaintTypeDetailsArray());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getComplaintTypeDetailsArray(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRequestTypeDetailsArray() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRequestTypeDetailsArray());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getRequestTypeDetailsArray(), i);
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
        new org.apache.axis.description.TypeDesc(GetNatureAndTypeDetailsResponseGetNatureAndTypeDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/GetNatureAndTypeDetailsResponse.xsd", ">>GetNatureAndTypeDetailsResponse>GetNatureAndTypeDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("complaintNatureCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/GetNatureAndTypeDetailsResponse.xsd", "ComplaintNatureCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("complaintNatureDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/GetNatureAndTypeDetailsResponse.xsd", "ComplaintNatureDesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestNatureCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/GetNatureAndTypeDetailsResponse.xsd", "RequestNatureCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestNatureDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/GetNatureAndTypeDetailsResponse.xsd", "RequestNatureDesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("complaintTypeDetailsArray");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/GetNatureAndTypeDetailsResponse.xsd", "ComplaintTypeDetailsArray"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/GetNatureAndTypeDetailsResponse.xsd", ">>>GetNatureAndTypeDetailsResponse>GetNatureAndTypeDetails>ComplaintTypeDetailsArray"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestTypeDetailsArray");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/GetNatureAndTypeDetailsResponse.xsd", "RequestTypeDetailsArray"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/GetNatureAndTypeDetailsResponse.xsd", ">>>GetNatureAndTypeDetailsResponse>GetNatureAndTypeDetails>RequestTypeDetailsArray"));
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
