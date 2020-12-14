/**
 * ApplicationHeader.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ae.etisalat.www.Middleware.SharedResources.Common.ApplicationHeader_xsd;

public class ApplicationHeader  implements java.io.Serializable {
    private String transactionID;

    private String requestedSystem;

    private String retryLimit;

    private String requestedDate;

    public ApplicationHeader() {
    }

    public ApplicationHeader(
           String transactionID,
           String requestedSystem,
           String retryLimit,
           String requestedDate) {
           this.transactionID = transactionID;
           this.requestedSystem = requestedSystem;
           this.retryLimit = retryLimit;
           this.requestedDate = requestedDate;
    }


    /**
     * Gets the transactionID value for this ApplicationHeader.
     * 
     * @return transactionID
     */
    public String getTransactionID() {
        return transactionID;
    }


    /**
     * Sets the transactionID value for this ApplicationHeader.
     * 
     * @param transactionID
     */
    public void setTransactionID(String transactionID) {
        this.transactionID = transactionID;
    }


    /**
     * Gets the requestedSystem value for this ApplicationHeader.
     * 
     * @return requestedSystem
     */
    public String getRequestedSystem() {
        return requestedSystem;
    }


    /**
     * Sets the requestedSystem value for this ApplicationHeader.
     * 
     * @param requestedSystem
     */
    public void setRequestedSystem(String requestedSystem) {
        this.requestedSystem = requestedSystem;
    }


    /**
     * Gets the retryLimit value for this ApplicationHeader.
     * 
     * @return retryLimit
     */
    public String getRetryLimit() {
        return retryLimit;
    }


    /**
     * Sets the retryLimit value for this ApplicationHeader.
     * 
     * @param retryLimit
     */
    public void setRetryLimit(String retryLimit) {
        this.retryLimit = retryLimit;
    }


    /**
     * Gets the requestedDate value for this ApplicationHeader.
     * 
     * @return requestedDate
     */
    public String getRequestedDate() {
        return requestedDate;
    }


    /**
     * Sets the requestedDate value for this ApplicationHeader.
     * 
     * @param requestedDate
     */
    public void setRequestedDate(String requestedDate) {
        this.requestedDate = requestedDate;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ApplicationHeader)) return false;
        ApplicationHeader other = (ApplicationHeader) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.transactionID==null && other.getTransactionID()==null) || 
             (this.transactionID!=null &&
              this.transactionID.equals(other.getTransactionID()))) &&
            ((this.requestedSystem==null && other.getRequestedSystem()==null) || 
             (this.requestedSystem!=null &&
              this.requestedSystem.equals(other.getRequestedSystem()))) &&
            ((this.retryLimit==null && other.getRetryLimit()==null) || 
             (this.retryLimit!=null &&
              this.retryLimit.equals(other.getRetryLimit()))) &&
            ((this.requestedDate==null && other.getRequestedDate()==null) || 
             (this.requestedDate!=null &&
              this.requestedDate.equals(other.getRequestedDate())));
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
        if (getTransactionID() != null) {
            _hashCode += getTransactionID().hashCode();
        }
        if (getRequestedSystem() != null) {
            _hashCode += getRequestedSystem().hashCode();
        }
        if (getRetryLimit() != null) {
            _hashCode += getRetryLimit().hashCode();
        }
        if (getRequestedDate() != null) {
            _hashCode += getRequestedDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ApplicationHeader.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/SharedResources/Common/ApplicationHeader.xsd", ">ApplicationHeader"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/SharedResources/Common/ApplicationHeader.xsd", "TransactionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestedSystem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/SharedResources/Common/ApplicationHeader.xsd", "RequestedSystem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retryLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/SharedResources/Common/ApplicationHeader.xsd", "RetryLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/SharedResources/Common/ApplicationHeader.xsd", "RequestedDate"));
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
