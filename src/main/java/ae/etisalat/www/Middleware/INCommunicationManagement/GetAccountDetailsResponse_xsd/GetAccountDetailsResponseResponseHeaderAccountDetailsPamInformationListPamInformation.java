/**
 * GetAccountDetailsResponseResponseHeaderAccountDetailsPamInformationListPamInformation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd;

public class GetAccountDetailsResponseResponseHeaderAccountDetailsPamInformationListPamInformation  implements java.io.Serializable {
    private String pamServiceID;

    private String pamClassID;

    private String scheduleID;

    private String currentPamPeriod;

    private String deferredToDate;

    private String lastEvaluationDate;

    private String pamServicePriority;

    public GetAccountDetailsResponseResponseHeaderAccountDetailsPamInformationListPamInformation() {
    }

    public GetAccountDetailsResponseResponseHeaderAccountDetailsPamInformationListPamInformation(
           String pamServiceID,
           String pamClassID,
           String scheduleID,
           String currentPamPeriod,
           String deferredToDate,
           String lastEvaluationDate,
           String pamServicePriority) {
           this.pamServiceID = pamServiceID;
           this.pamClassID = pamClassID;
           this.scheduleID = scheduleID;
           this.currentPamPeriod = currentPamPeriod;
           this.deferredToDate = deferredToDate;
           this.lastEvaluationDate = lastEvaluationDate;
           this.pamServicePriority = pamServicePriority;
    }


    /**
     * Gets the pamServiceID value for this GetAccountDetailsResponseResponseHeaderAccountDetailsPamInformationListPamInformation.
     * 
     * @return pamServiceID
     */
    public String getPamServiceID() {
        return pamServiceID;
    }


    /**
     * Sets the pamServiceID value for this GetAccountDetailsResponseResponseHeaderAccountDetailsPamInformationListPamInformation.
     * 
     * @param pamServiceID
     */
    public void setPamServiceID(String pamServiceID) {
        this.pamServiceID = pamServiceID;
    }


    /**
     * Gets the pamClassID value for this GetAccountDetailsResponseResponseHeaderAccountDetailsPamInformationListPamInformation.
     * 
     * @return pamClassID
     */
    public String getPamClassID() {
        return pamClassID;
    }


    /**
     * Sets the pamClassID value for this GetAccountDetailsResponseResponseHeaderAccountDetailsPamInformationListPamInformation.
     * 
     * @param pamClassID
     */
    public void setPamClassID(String pamClassID) {
        this.pamClassID = pamClassID;
    }


    /**
     * Gets the scheduleID value for this GetAccountDetailsResponseResponseHeaderAccountDetailsPamInformationListPamInformation.
     * 
     * @return scheduleID
     */
    public String getScheduleID() {
        return scheduleID;
    }


    /**
     * Sets the scheduleID value for this GetAccountDetailsResponseResponseHeaderAccountDetailsPamInformationListPamInformation.
     * 
     * @param scheduleID
     */
    public void setScheduleID(String scheduleID) {
        this.scheduleID = scheduleID;
    }


    /**
     * Gets the currentPamPeriod value for this GetAccountDetailsResponseResponseHeaderAccountDetailsPamInformationListPamInformation.
     * 
     * @return currentPamPeriod
     */
    public String getCurrentPamPeriod() {
        return currentPamPeriod;
    }


    /**
     * Sets the currentPamPeriod value for this GetAccountDetailsResponseResponseHeaderAccountDetailsPamInformationListPamInformation.
     * 
     * @param currentPamPeriod
     */
    public void setCurrentPamPeriod(String currentPamPeriod) {
        this.currentPamPeriod = currentPamPeriod;
    }


    /**
     * Gets the deferredToDate value for this GetAccountDetailsResponseResponseHeaderAccountDetailsPamInformationListPamInformation.
     * 
     * @return deferredToDate
     */
    public String getDeferredToDate() {
        return deferredToDate;
    }


    /**
     * Sets the deferredToDate value for this GetAccountDetailsResponseResponseHeaderAccountDetailsPamInformationListPamInformation.
     * 
     * @param deferredToDate
     */
    public void setDeferredToDate(String deferredToDate) {
        this.deferredToDate = deferredToDate;
    }


    /**
     * Gets the lastEvaluationDate value for this GetAccountDetailsResponseResponseHeaderAccountDetailsPamInformationListPamInformation.
     * 
     * @return lastEvaluationDate
     */
    public String getLastEvaluationDate() {
        return lastEvaluationDate;
    }


    /**
     * Sets the lastEvaluationDate value for this GetAccountDetailsResponseResponseHeaderAccountDetailsPamInformationListPamInformation.
     * 
     * @param lastEvaluationDate
     */
    public void setLastEvaluationDate(String lastEvaluationDate) {
        this.lastEvaluationDate = lastEvaluationDate;
    }


    /**
     * Gets the pamServicePriority value for this GetAccountDetailsResponseResponseHeaderAccountDetailsPamInformationListPamInformation.
     * 
     * @return pamServicePriority
     */
    public String getPamServicePriority() {
        return pamServicePriority;
    }


    /**
     * Sets the pamServicePriority value for this GetAccountDetailsResponseResponseHeaderAccountDetailsPamInformationListPamInformation.
     * 
     * @param pamServicePriority
     */
    public void setPamServicePriority(String pamServicePriority) {
        this.pamServicePriority = pamServicePriority;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GetAccountDetailsResponseResponseHeaderAccountDetailsPamInformationListPamInformation)) return false;
        GetAccountDetailsResponseResponseHeaderAccountDetailsPamInformationListPamInformation other = (GetAccountDetailsResponseResponseHeaderAccountDetailsPamInformationListPamInformation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.pamServiceID==null && other.getPamServiceID()==null) || 
             (this.pamServiceID!=null &&
              this.pamServiceID.equals(other.getPamServiceID()))) &&
            ((this.pamClassID==null && other.getPamClassID()==null) || 
             (this.pamClassID!=null &&
              this.pamClassID.equals(other.getPamClassID()))) &&
            ((this.scheduleID==null && other.getScheduleID()==null) || 
             (this.scheduleID!=null &&
              this.scheduleID.equals(other.getScheduleID()))) &&
            ((this.currentPamPeriod==null && other.getCurrentPamPeriod()==null) || 
             (this.currentPamPeriod!=null &&
              this.currentPamPeriod.equals(other.getCurrentPamPeriod()))) &&
            ((this.deferredToDate==null && other.getDeferredToDate()==null) || 
             (this.deferredToDate!=null &&
              this.deferredToDate.equals(other.getDeferredToDate()))) &&
            ((this.lastEvaluationDate==null && other.getLastEvaluationDate()==null) || 
             (this.lastEvaluationDate!=null &&
              this.lastEvaluationDate.equals(other.getLastEvaluationDate()))) &&
            ((this.pamServicePriority==null && other.getPamServicePriority()==null) || 
             (this.pamServicePriority!=null &&
              this.pamServicePriority.equals(other.getPamServicePriority())));
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
        if (getPamServiceID() != null) {
            _hashCode += getPamServiceID().hashCode();
        }
        if (getPamClassID() != null) {
            _hashCode += getPamClassID().hashCode();
        }
        if (getScheduleID() != null) {
            _hashCode += getScheduleID().hashCode();
        }
        if (getCurrentPamPeriod() != null) {
            _hashCode += getCurrentPamPeriod().hashCode();
        }
        if (getDeferredToDate() != null) {
            _hashCode += getDeferredToDate().hashCode();
        }
        if (getLastEvaluationDate() != null) {
            _hashCode += getLastEvaluationDate().hashCode();
        }
        if (getPamServicePriority() != null) {
            _hashCode += getPamServicePriority().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetAccountDetailsResponseResponseHeaderAccountDetailsPamInformationListPamInformation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", ">>>>>GetAccountDetailsResponse>ResponseHeader>AccountDetails>pamInformationList>pamInformation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pamServiceID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "pamServiceID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pamClassID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "pamClassID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduleID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "scheduleID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentPamPeriod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "currentPamPeriod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deferredToDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "deferredToDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastEvaluationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "lastEvaluationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pamServicePriority");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "pamServicePriority"));
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
