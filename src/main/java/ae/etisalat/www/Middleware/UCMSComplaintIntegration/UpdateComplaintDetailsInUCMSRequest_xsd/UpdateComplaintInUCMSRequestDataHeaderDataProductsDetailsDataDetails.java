/**
 * UpdateComplaintInUCMSRequestDataHeaderDataProductsDetailsDataDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintDetailsInUCMSRequest_xsd;

public class UpdateComplaintInUCMSRequestDataHeaderDataProductsDetailsDataDetails  implements java.io.Serializable {
    private Integer DPCircuitRouteId;

    private Integer DPCircuitTypeId;

    private String DPSystemDesignationO;

    private String DPBandwidth;

    private Integer DPUOM;

    private String DPLDRefNumber;

    private String DPNetworkmedium;

    private String DPFiberOpticRoute;

    public UpdateComplaintInUCMSRequestDataHeaderDataProductsDetailsDataDetails() {
    }

    public UpdateComplaintInUCMSRequestDataHeaderDataProductsDetailsDataDetails(
           Integer DPCircuitRouteId,
           Integer DPCircuitTypeId,
           String DPSystemDesignationO,
           String DPBandwidth,
           Integer DPUOM,
           String DPLDRefNumber,
           String DPNetworkmedium,
           String DPFiberOpticRoute) {
           this.DPCircuitRouteId = DPCircuitRouteId;
           this.DPCircuitTypeId = DPCircuitTypeId;
           this.DPSystemDesignationO = DPSystemDesignationO;
           this.DPBandwidth = DPBandwidth;
           this.DPUOM = DPUOM;
           this.DPLDRefNumber = DPLDRefNumber;
           this.DPNetworkmedium = DPNetworkmedium;
           this.DPFiberOpticRoute = DPFiberOpticRoute;
    }


    /**
     * Gets the DPCircuitRouteId value for this UpdateComplaintInUCMSRequestDataHeaderDataProductsDetailsDataDetails.
     * 
     * @return DPCircuitRouteId
     */
    public Integer getDPCircuitRouteId() {
        return DPCircuitRouteId;
    }


    /**
     * Sets the DPCircuitRouteId value for this UpdateComplaintInUCMSRequestDataHeaderDataProductsDetailsDataDetails.
     * 
     * @param DPCircuitRouteId
     */
    public void setDPCircuitRouteId(Integer DPCircuitRouteId) {
        this.DPCircuitRouteId = DPCircuitRouteId;
    }


    /**
     * Gets the DPCircuitTypeId value for this UpdateComplaintInUCMSRequestDataHeaderDataProductsDetailsDataDetails.
     * 
     * @return DPCircuitTypeId
     */
    public Integer getDPCircuitTypeId() {
        return DPCircuitTypeId;
    }


    /**
     * Sets the DPCircuitTypeId value for this UpdateComplaintInUCMSRequestDataHeaderDataProductsDetailsDataDetails.
     * 
     * @param DPCircuitTypeId
     */
    public void setDPCircuitTypeId(Integer DPCircuitTypeId) {
        this.DPCircuitTypeId = DPCircuitTypeId;
    }


    /**
     * Gets the DPSystemDesignationO value for this UpdateComplaintInUCMSRequestDataHeaderDataProductsDetailsDataDetails.
     * 
     * @return DPSystemDesignationO
     */
    public String getDPSystemDesignationO() {
        return DPSystemDesignationO;
    }


    /**
     * Sets the DPSystemDesignationO value for this UpdateComplaintInUCMSRequestDataHeaderDataProductsDetailsDataDetails.
     * 
     * @param DPSystemDesignationO
     */
    public void setDPSystemDesignationO(String DPSystemDesignationO) {
        this.DPSystemDesignationO = DPSystemDesignationO;
    }


    /**
     * Gets the DPBandwidth value for this UpdateComplaintInUCMSRequestDataHeaderDataProductsDetailsDataDetails.
     * 
     * @return DPBandwidth
     */
    public String getDPBandwidth() {
        return DPBandwidth;
    }


    /**
     * Sets the DPBandwidth value for this UpdateComplaintInUCMSRequestDataHeaderDataProductsDetailsDataDetails.
     * 
     * @param DPBandwidth
     */
    public void setDPBandwidth(String DPBandwidth) {
        this.DPBandwidth = DPBandwidth;
    }


    /**
     * Gets the DPUOM value for this UpdateComplaintInUCMSRequestDataHeaderDataProductsDetailsDataDetails.
     * 
     * @return DPUOM
     */
    public Integer getDPUOM() {
        return DPUOM;
    }


    /**
     * Sets the DPUOM value for this UpdateComplaintInUCMSRequestDataHeaderDataProductsDetailsDataDetails.
     * 
     * @param DPUOM
     */
    public void setDPUOM(Integer DPUOM) {
        this.DPUOM = DPUOM;
    }


    /**
     * Gets the DPLDRefNumber value for this UpdateComplaintInUCMSRequestDataHeaderDataProductsDetailsDataDetails.
     * 
     * @return DPLDRefNumber
     */
    public String getDPLDRefNumber() {
        return DPLDRefNumber;
    }


    /**
     * Sets the DPLDRefNumber value for this UpdateComplaintInUCMSRequestDataHeaderDataProductsDetailsDataDetails.
     * 
     * @param DPLDRefNumber
     */
    public void setDPLDRefNumber(String DPLDRefNumber) {
        this.DPLDRefNumber = DPLDRefNumber;
    }


    /**
     * Gets the DPNetworkmedium value for this UpdateComplaintInUCMSRequestDataHeaderDataProductsDetailsDataDetails.
     * 
     * @return DPNetworkmedium
     */
    public String getDPNetworkmedium() {
        return DPNetworkmedium;
    }


    /**
     * Sets the DPNetworkmedium value for this UpdateComplaintInUCMSRequestDataHeaderDataProductsDetailsDataDetails.
     * 
     * @param DPNetworkmedium
     */
    public void setDPNetworkmedium(String DPNetworkmedium) {
        this.DPNetworkmedium = DPNetworkmedium;
    }


    /**
     * Gets the DPFiberOpticRoute value for this UpdateComplaintInUCMSRequestDataHeaderDataProductsDetailsDataDetails.
     * 
     * @return DPFiberOpticRoute
     */
    public String getDPFiberOpticRoute() {
        return DPFiberOpticRoute;
    }


    /**
     * Sets the DPFiberOpticRoute value for this UpdateComplaintInUCMSRequestDataHeaderDataProductsDetailsDataDetails.
     * 
     * @param DPFiberOpticRoute
     */
    public void setDPFiberOpticRoute(String DPFiberOpticRoute) {
        this.DPFiberOpticRoute = DPFiberOpticRoute;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof UpdateComplaintInUCMSRequestDataHeaderDataProductsDetailsDataDetails)) return false;
        UpdateComplaintInUCMSRequestDataHeaderDataProductsDetailsDataDetails other = (UpdateComplaintInUCMSRequestDataHeaderDataProductsDetailsDataDetails) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.DPCircuitRouteId==null && other.getDPCircuitRouteId()==null) || 
             (this.DPCircuitRouteId!=null &&
              this.DPCircuitRouteId.equals(other.getDPCircuitRouteId()))) &&
            ((this.DPCircuitTypeId==null && other.getDPCircuitTypeId()==null) || 
             (this.DPCircuitTypeId!=null &&
              this.DPCircuitTypeId.equals(other.getDPCircuitTypeId()))) &&
            ((this.DPSystemDesignationO==null && other.getDPSystemDesignationO()==null) || 
             (this.DPSystemDesignationO!=null &&
              this.DPSystemDesignationO.equals(other.getDPSystemDesignationO()))) &&
            ((this.DPBandwidth==null && other.getDPBandwidth()==null) || 
             (this.DPBandwidth!=null &&
              this.DPBandwidth.equals(other.getDPBandwidth()))) &&
            ((this.DPUOM==null && other.getDPUOM()==null) || 
             (this.DPUOM!=null &&
              this.DPUOM.equals(other.getDPUOM()))) &&
            ((this.DPLDRefNumber==null && other.getDPLDRefNumber()==null) || 
             (this.DPLDRefNumber!=null &&
              this.DPLDRefNumber.equals(other.getDPLDRefNumber()))) &&
            ((this.DPNetworkmedium==null && other.getDPNetworkmedium()==null) || 
             (this.DPNetworkmedium!=null &&
              this.DPNetworkmedium.equals(other.getDPNetworkmedium()))) &&
            ((this.DPFiberOpticRoute==null && other.getDPFiberOpticRoute()==null) || 
             (this.DPFiberOpticRoute!=null &&
              this.DPFiberOpticRoute.equals(other.getDPFiberOpticRoute())));
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
        if (getDPCircuitRouteId() != null) {
            _hashCode += getDPCircuitRouteId().hashCode();
        }
        if (getDPCircuitTypeId() != null) {
            _hashCode += getDPCircuitTypeId().hashCode();
        }
        if (getDPSystemDesignationO() != null) {
            _hashCode += getDPSystemDesignationO().hashCode();
        }
        if (getDPBandwidth() != null) {
            _hashCode += getDPBandwidth().hashCode();
        }
        if (getDPUOM() != null) {
            _hashCode += getDPUOM().hashCode();
        }
        if (getDPLDRefNumber() != null) {
            _hashCode += getDPLDRefNumber().hashCode();
        }
        if (getDPNetworkmedium() != null) {
            _hashCode += getDPNetworkmedium().hashCode();
        }
        if (getDPFiberOpticRoute() != null) {
            _hashCode += getDPFiberOpticRoute().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateComplaintInUCMSRequestDataHeaderDataProductsDetailsDataDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", ">>>>UpdateComplaintInUCMSRequest>DataHeader>DataProductsDetails>DataDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DPCircuitRouteId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "DPCircuitRouteId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DPCircuitTypeId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "DPCircuitTypeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DPSystemDesignationO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "DPSystemDesignationO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DPBandwidth");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "DPBandwidth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DPUOM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "DPUOM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DPLDRefNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "DPLDRefNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DPNetworkmedium");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "DPNetworkmedium"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DPFiberOpticRoute");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "DPFiberOpticRoute"));
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
