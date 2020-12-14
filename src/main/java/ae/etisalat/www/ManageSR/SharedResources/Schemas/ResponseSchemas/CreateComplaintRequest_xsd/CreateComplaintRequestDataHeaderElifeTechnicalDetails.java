/**
 * CreateComplaintRequestDataHeaderElifeTechnicalDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.CreateComplaintRequest_xsd;

public class CreateComplaintRequestDataHeaderElifeTechnicalDetails  implements java.io.Serializable {
    private String eLifeFaultyService;

    private String ontRestarted;

    private String STBRestarted;

    private String ontPC;

    private String ontPort;

    private String pcRestarted;

    private String PPPoEConnection;

    public CreateComplaintRequestDataHeaderElifeTechnicalDetails() {
    }

    public CreateComplaintRequestDataHeaderElifeTechnicalDetails(
           String eLifeFaultyService,
           String ontRestarted,
           String STBRestarted,
           String ontPC,
           String ontPort,
           String pcRestarted,
           String PPPoEConnection) {
           this.eLifeFaultyService = eLifeFaultyService;
           this.ontRestarted = ontRestarted;
           this.STBRestarted = STBRestarted;
           this.ontPC = ontPC;
           this.ontPort = ontPort;
           this.pcRestarted = pcRestarted;
           this.PPPoEConnection = PPPoEConnection;
    }


    /**
     * Gets the eLifeFaultyService value for this CreateComplaintRequestDataHeaderElifeTechnicalDetails.
     * 
     * @return eLifeFaultyService
     */
    public String getELifeFaultyService() {
        return eLifeFaultyService;
    }


    /**
     * Sets the eLifeFaultyService value for this CreateComplaintRequestDataHeaderElifeTechnicalDetails.
     * 
     * @param eLifeFaultyService
     */
    public void setELifeFaultyService(String eLifeFaultyService) {
        this.eLifeFaultyService = eLifeFaultyService;
    }


    /**
     * Gets the ontRestarted value for this CreateComplaintRequestDataHeaderElifeTechnicalDetails.
     * 
     * @return ontRestarted
     */
    public String getOntRestarted() {
        return ontRestarted;
    }


    /**
     * Sets the ontRestarted value for this CreateComplaintRequestDataHeaderElifeTechnicalDetails.
     * 
     * @param ontRestarted
     */
    public void setOntRestarted(String ontRestarted) {
        this.ontRestarted = ontRestarted;
    }


    /**
     * Gets the STBRestarted value for this CreateComplaintRequestDataHeaderElifeTechnicalDetails.
     * 
     * @return STBRestarted
     */
    public String getSTBRestarted() {
        return STBRestarted;
    }


    /**
     * Sets the STBRestarted value for this CreateComplaintRequestDataHeaderElifeTechnicalDetails.
     * 
     * @param STBRestarted
     */
    public void setSTBRestarted(String STBRestarted) {
        this.STBRestarted = STBRestarted;
    }


    /**
     * Gets the ontPC value for this CreateComplaintRequestDataHeaderElifeTechnicalDetails.
     * 
     * @return ontPC
     */
    public String getOntPC() {
        return ontPC;
    }


    /**
     * Sets the ontPC value for this CreateComplaintRequestDataHeaderElifeTechnicalDetails.
     * 
     * @param ontPC
     */
    public void setOntPC(String ontPC) {
        this.ontPC = ontPC;
    }


    /**
     * Gets the ontPort value for this CreateComplaintRequestDataHeaderElifeTechnicalDetails.
     * 
     * @return ontPort
     */
    public String getOntPort() {
        return ontPort;
    }


    /**
     * Sets the ontPort value for this CreateComplaintRequestDataHeaderElifeTechnicalDetails.
     * 
     * @param ontPort
     */
    public void setOntPort(String ontPort) {
        this.ontPort = ontPort;
    }


    /**
     * Gets the pcRestarted value for this CreateComplaintRequestDataHeaderElifeTechnicalDetails.
     * 
     * @return pcRestarted
     */
    public String getPcRestarted() {
        return pcRestarted;
    }


    /**
     * Sets the pcRestarted value for this CreateComplaintRequestDataHeaderElifeTechnicalDetails.
     * 
     * @param pcRestarted
     */
    public void setPcRestarted(String pcRestarted) {
        this.pcRestarted = pcRestarted;
    }


    /**
     * Gets the PPPoEConnection value for this CreateComplaintRequestDataHeaderElifeTechnicalDetails.
     * 
     * @return PPPoEConnection
     */
    public String getPPPoEConnection() {
        return PPPoEConnection;
    }


    /**
     * Sets the PPPoEConnection value for this CreateComplaintRequestDataHeaderElifeTechnicalDetails.
     * 
     * @param PPPoEConnection
     */
    public void setPPPoEConnection(String PPPoEConnection) {
        this.PPPoEConnection = PPPoEConnection;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CreateComplaintRequestDataHeaderElifeTechnicalDetails)) return false;
        CreateComplaintRequestDataHeaderElifeTechnicalDetails other = (CreateComplaintRequestDataHeaderElifeTechnicalDetails) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.eLifeFaultyService==null && other.getELifeFaultyService()==null) || 
             (this.eLifeFaultyService!=null &&
              this.eLifeFaultyService.equals(other.getELifeFaultyService()))) &&
            ((this.ontRestarted==null && other.getOntRestarted()==null) || 
             (this.ontRestarted!=null &&
              this.ontRestarted.equals(other.getOntRestarted()))) &&
            ((this.STBRestarted==null && other.getSTBRestarted()==null) || 
             (this.STBRestarted!=null &&
              this.STBRestarted.equals(other.getSTBRestarted()))) &&
            ((this.ontPC==null && other.getOntPC()==null) || 
             (this.ontPC!=null &&
              this.ontPC.equals(other.getOntPC()))) &&
            ((this.ontPort==null && other.getOntPort()==null) || 
             (this.ontPort!=null &&
              this.ontPort.equals(other.getOntPort()))) &&
            ((this.pcRestarted==null && other.getPcRestarted()==null) || 
             (this.pcRestarted!=null &&
              this.pcRestarted.equals(other.getPcRestarted()))) &&
            ((this.PPPoEConnection==null && other.getPPPoEConnection()==null) || 
             (this.PPPoEConnection!=null &&
              this.PPPoEConnection.equals(other.getPPPoEConnection())));
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
        if (getELifeFaultyService() != null) {
            _hashCode += getELifeFaultyService().hashCode();
        }
        if (getOntRestarted() != null) {
            _hashCode += getOntRestarted().hashCode();
        }
        if (getSTBRestarted() != null) {
            _hashCode += getSTBRestarted().hashCode();
        }
        if (getOntPC() != null) {
            _hashCode += getOntPC().hashCode();
        }
        if (getOntPort() != null) {
            _hashCode += getOntPort().hashCode();
        }
        if (getPcRestarted() != null) {
            _hashCode += getPcRestarted().hashCode();
        }
        if (getPPPoEConnection() != null) {
            _hashCode += getPPPoEConnection().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateComplaintRequestDataHeaderElifeTechnicalDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/CreateComplaintRequest.xsd", ">>>CreateComplaintRequest>DataHeader>ElifeTechnicalDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ELifeFaultyService");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/CreateComplaintRequest.xsd", "eLifeFaultyService"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ontRestarted");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/CreateComplaintRequest.xsd", "ontRestarted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("STBRestarted");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/CreateComplaintRequest.xsd", "STBRestarted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ontPC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/CreateComplaintRequest.xsd", "ontPC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ontPort");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/CreateComplaintRequest.xsd", "ontPort"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcRestarted");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/CreateComplaintRequest.xsd", "pcRestarted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PPPoEConnection");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/CreateComplaintRequest.xsd", "PPPoEConnection"));
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
