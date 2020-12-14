/**
 * UpdateComplaintInUCMSRequestDataHeaderBistreamFields.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintDetailsInUCMSRequest_xsd;

public class UpdateComplaintInUCMSRequestDataHeaderBistreamFields  implements java.io.Serializable {
    private String TTPID;

    private String BSPriority;

    private String BSCustomerType;

    private UpdateComplaintInUCMSRequestDataHeaderBistreamFieldsBSCustomerAddress[] BSCustomerAddress;

    private String BSAccessType;

    private String BSAccessDetail;

    private String BSAccessLinkID;

    private String BSAccessServiceID;

    private String BSOrderID;

    private String BSFlag;

    private String BCustomerSegment;

    private String BValueSegment;

    private Boolean earlyLifeFlag;

    private String ratePlanCode;

    private String ratePlanDescription;

    private String mobileDeviceType;

    private String FESystem;

    public UpdateComplaintInUCMSRequestDataHeaderBistreamFields() {
    }

    public UpdateComplaintInUCMSRequestDataHeaderBistreamFields(
           String TTPID,
           String BSPriority,
           String BSCustomerType,
           UpdateComplaintInUCMSRequestDataHeaderBistreamFieldsBSCustomerAddress[] BSCustomerAddress,
           String BSAccessType,
           String BSAccessDetail,
           String BSAccessLinkID,
           String BSAccessServiceID,
           String BSOrderID,
           String BSFlag,
           String BCustomerSegment,
           String BValueSegment,
           Boolean earlyLifeFlag,
           String ratePlanCode,
           String ratePlanDescription,
           String mobileDeviceType,
           String FESystem) {
           this.TTPID = TTPID;
           this.BSPriority = BSPriority;
           this.BSCustomerType = BSCustomerType;
           this.BSCustomerAddress = BSCustomerAddress;
           this.BSAccessType = BSAccessType;
           this.BSAccessDetail = BSAccessDetail;
           this.BSAccessLinkID = BSAccessLinkID;
           this.BSAccessServiceID = BSAccessServiceID;
           this.BSOrderID = BSOrderID;
           this.BSFlag = BSFlag;
           this.BCustomerSegment = BCustomerSegment;
           this.BValueSegment = BValueSegment;
           this.earlyLifeFlag = earlyLifeFlag;
           this.ratePlanCode = ratePlanCode;
           this.ratePlanDescription = ratePlanDescription;
           this.mobileDeviceType = mobileDeviceType;
           this.FESystem = FESystem;
    }


    /**
     * Gets the TTPID value for this UpdateComplaintInUCMSRequestDataHeaderBistreamFields.
     * 
     * @return TTPID
     */
    public String getTTPID() {
        return TTPID;
    }


    /**
     * Sets the TTPID value for this UpdateComplaintInUCMSRequestDataHeaderBistreamFields.
     * 
     * @param TTPID
     */
    public void setTTPID(String TTPID) {
        this.TTPID = TTPID;
    }


    /**
     * Gets the BSPriority value for this UpdateComplaintInUCMSRequestDataHeaderBistreamFields.
     * 
     * @return BSPriority
     */
    public String getBSPriority() {
        return BSPriority;
    }


    /**
     * Sets the BSPriority value for this UpdateComplaintInUCMSRequestDataHeaderBistreamFields.
     * 
     * @param BSPriority
     */
    public void setBSPriority(String BSPriority) {
        this.BSPriority = BSPriority;
    }


    /**
     * Gets the BSCustomerType value for this UpdateComplaintInUCMSRequestDataHeaderBistreamFields.
     * 
     * @return BSCustomerType
     */
    public String getBSCustomerType() {
        return BSCustomerType;
    }


    /**
     * Sets the BSCustomerType value for this UpdateComplaintInUCMSRequestDataHeaderBistreamFields.
     * 
     * @param BSCustomerType
     */
    public void setBSCustomerType(String BSCustomerType) {
        this.BSCustomerType = BSCustomerType;
    }


    /**
     * Gets the BSCustomerAddress value for this UpdateComplaintInUCMSRequestDataHeaderBistreamFields.
     * 
     * @return BSCustomerAddress
     */
    public UpdateComplaintInUCMSRequestDataHeaderBistreamFieldsBSCustomerAddress[] getBSCustomerAddress() {
        return BSCustomerAddress;
    }


    /**
     * Sets the BSCustomerAddress value for this UpdateComplaintInUCMSRequestDataHeaderBistreamFields.
     * 
     * @param BSCustomerAddress
     */
    public void setBSCustomerAddress(UpdateComplaintInUCMSRequestDataHeaderBistreamFieldsBSCustomerAddress[] BSCustomerAddress) {
        this.BSCustomerAddress = BSCustomerAddress;
    }

    public UpdateComplaintInUCMSRequestDataHeaderBistreamFieldsBSCustomerAddress getBSCustomerAddress(int i) {
        return this.BSCustomerAddress[i];
    }

    public void setBSCustomerAddress(int i, UpdateComplaintInUCMSRequestDataHeaderBistreamFieldsBSCustomerAddress _value) {
        this.BSCustomerAddress[i] = _value;
    }


    /**
     * Gets the BSAccessType value for this UpdateComplaintInUCMSRequestDataHeaderBistreamFields.
     * 
     * @return BSAccessType
     */
    public String getBSAccessType() {
        return BSAccessType;
    }


    /**
     * Sets the BSAccessType value for this UpdateComplaintInUCMSRequestDataHeaderBistreamFields.
     * 
     * @param BSAccessType
     */
    public void setBSAccessType(String BSAccessType) {
        this.BSAccessType = BSAccessType;
    }


    /**
     * Gets the BSAccessDetail value for this UpdateComplaintInUCMSRequestDataHeaderBistreamFields.
     * 
     * @return BSAccessDetail
     */
    public String getBSAccessDetail() {
        return BSAccessDetail;
    }


    /**
     * Sets the BSAccessDetail value for this UpdateComplaintInUCMSRequestDataHeaderBistreamFields.
     * 
     * @param BSAccessDetail
     */
    public void setBSAccessDetail(String BSAccessDetail) {
        this.BSAccessDetail = BSAccessDetail;
    }


    /**
     * Gets the BSAccessLinkID value for this UpdateComplaintInUCMSRequestDataHeaderBistreamFields.
     * 
     * @return BSAccessLinkID
     */
    public String getBSAccessLinkID() {
        return BSAccessLinkID;
    }


    /**
     * Sets the BSAccessLinkID value for this UpdateComplaintInUCMSRequestDataHeaderBistreamFields.
     * 
     * @param BSAccessLinkID
     */
    public void setBSAccessLinkID(String BSAccessLinkID) {
        this.BSAccessLinkID = BSAccessLinkID;
    }


    /**
     * Gets the BSAccessServiceID value for this UpdateComplaintInUCMSRequestDataHeaderBistreamFields.
     * 
     * @return BSAccessServiceID
     */
    public String getBSAccessServiceID() {
        return BSAccessServiceID;
    }


    /**
     * Sets the BSAccessServiceID value for this UpdateComplaintInUCMSRequestDataHeaderBistreamFields.
     * 
     * @param BSAccessServiceID
     */
    public void setBSAccessServiceID(String BSAccessServiceID) {
        this.BSAccessServiceID = BSAccessServiceID;
    }


    /**
     * Gets the BSOrderID value for this UpdateComplaintInUCMSRequestDataHeaderBistreamFields.
     * 
     * @return BSOrderID
     */
    public String getBSOrderID() {
        return BSOrderID;
    }


    /**
     * Sets the BSOrderID value for this UpdateComplaintInUCMSRequestDataHeaderBistreamFields.
     * 
     * @param BSOrderID
     */
    public void setBSOrderID(String BSOrderID) {
        this.BSOrderID = BSOrderID;
    }


    /**
     * Gets the BSFlag value for this UpdateComplaintInUCMSRequestDataHeaderBistreamFields.
     * 
     * @return BSFlag
     */
    public String getBSFlag() {
        return BSFlag;
    }


    /**
     * Sets the BSFlag value for this UpdateComplaintInUCMSRequestDataHeaderBistreamFields.
     * 
     * @param BSFlag
     */
    public void setBSFlag(String BSFlag) {
        this.BSFlag = BSFlag;
    }


    /**
     * Gets the BCustomerSegment value for this UpdateComplaintInUCMSRequestDataHeaderBistreamFields.
     * 
     * @return BCustomerSegment
     */
    public String getBCustomerSegment() {
        return BCustomerSegment;
    }


    /**
     * Sets the BCustomerSegment value for this UpdateComplaintInUCMSRequestDataHeaderBistreamFields.
     * 
     * @param BCustomerSegment
     */
    public void setBCustomerSegment(String BCustomerSegment) {
        this.BCustomerSegment = BCustomerSegment;
    }


    /**
     * Gets the BValueSegment value for this UpdateComplaintInUCMSRequestDataHeaderBistreamFields.
     * 
     * @return BValueSegment
     */
    public String getBValueSegment() {
        return BValueSegment;
    }


    /**
     * Sets the BValueSegment value for this UpdateComplaintInUCMSRequestDataHeaderBistreamFields.
     * 
     * @param BValueSegment
     */
    public void setBValueSegment(String BValueSegment) {
        this.BValueSegment = BValueSegment;
    }


    /**
     * Gets the earlyLifeFlag value for this UpdateComplaintInUCMSRequestDataHeaderBistreamFields.
     * 
     * @return earlyLifeFlag
     */
    public Boolean getEarlyLifeFlag() {
        return earlyLifeFlag;
    }


    /**
     * Sets the earlyLifeFlag value for this UpdateComplaintInUCMSRequestDataHeaderBistreamFields.
     * 
     * @param earlyLifeFlag
     */
    public void setEarlyLifeFlag(Boolean earlyLifeFlag) {
        this.earlyLifeFlag = earlyLifeFlag;
    }


    /**
     * Gets the ratePlanCode value for this UpdateComplaintInUCMSRequestDataHeaderBistreamFields.
     * 
     * @return ratePlanCode
     */
    public String getRatePlanCode() {
        return ratePlanCode;
    }


    /**
     * Sets the ratePlanCode value for this UpdateComplaintInUCMSRequestDataHeaderBistreamFields.
     * 
     * @param ratePlanCode
     */
    public void setRatePlanCode(String ratePlanCode) {
        this.ratePlanCode = ratePlanCode;
    }


    /**
     * Gets the ratePlanDescription value for this UpdateComplaintInUCMSRequestDataHeaderBistreamFields.
     * 
     * @return ratePlanDescription
     */
    public String getRatePlanDescription() {
        return ratePlanDescription;
    }


    /**
     * Sets the ratePlanDescription value for this UpdateComplaintInUCMSRequestDataHeaderBistreamFields.
     * 
     * @param ratePlanDescription
     */
    public void setRatePlanDescription(String ratePlanDescription) {
        this.ratePlanDescription = ratePlanDescription;
    }


    /**
     * Gets the mobileDeviceType value for this UpdateComplaintInUCMSRequestDataHeaderBistreamFields.
     * 
     * @return mobileDeviceType
     */
    public String getMobileDeviceType() {
        return mobileDeviceType;
    }


    /**
     * Sets the mobileDeviceType value for this UpdateComplaintInUCMSRequestDataHeaderBistreamFields.
     * 
     * @param mobileDeviceType
     */
    public void setMobileDeviceType(String mobileDeviceType) {
        this.mobileDeviceType = mobileDeviceType;
    }


    /**
     * Gets the FESystem value for this UpdateComplaintInUCMSRequestDataHeaderBistreamFields.
     * 
     * @return FESystem
     */
    public String getFESystem() {
        return FESystem;
    }


    /**
     * Sets the FESystem value for this UpdateComplaintInUCMSRequestDataHeaderBistreamFields.
     * 
     * @param FESystem
     */
    public void setFESystem(String FESystem) {
        this.FESystem = FESystem;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof UpdateComplaintInUCMSRequestDataHeaderBistreamFields)) return false;
        UpdateComplaintInUCMSRequestDataHeaderBistreamFields other = (UpdateComplaintInUCMSRequestDataHeaderBistreamFields) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.TTPID==null && other.getTTPID()==null) || 
             (this.TTPID!=null &&
              this.TTPID.equals(other.getTTPID()))) &&
            ((this.BSPriority==null && other.getBSPriority()==null) || 
             (this.BSPriority!=null &&
              this.BSPriority.equals(other.getBSPriority()))) &&
            ((this.BSCustomerType==null && other.getBSCustomerType()==null) || 
             (this.BSCustomerType!=null &&
              this.BSCustomerType.equals(other.getBSCustomerType()))) &&
            ((this.BSCustomerAddress==null && other.getBSCustomerAddress()==null) || 
             (this.BSCustomerAddress!=null &&
              java.util.Arrays.equals(this.BSCustomerAddress, other.getBSCustomerAddress()))) &&
            ((this.BSAccessType==null && other.getBSAccessType()==null) || 
             (this.BSAccessType!=null &&
              this.BSAccessType.equals(other.getBSAccessType()))) &&
            ((this.BSAccessDetail==null && other.getBSAccessDetail()==null) || 
             (this.BSAccessDetail!=null &&
              this.BSAccessDetail.equals(other.getBSAccessDetail()))) &&
            ((this.BSAccessLinkID==null && other.getBSAccessLinkID()==null) || 
             (this.BSAccessLinkID!=null &&
              this.BSAccessLinkID.equals(other.getBSAccessLinkID()))) &&
            ((this.BSAccessServiceID==null && other.getBSAccessServiceID()==null) || 
             (this.BSAccessServiceID!=null &&
              this.BSAccessServiceID.equals(other.getBSAccessServiceID()))) &&
            ((this.BSOrderID==null && other.getBSOrderID()==null) || 
             (this.BSOrderID!=null &&
              this.BSOrderID.equals(other.getBSOrderID()))) &&
            ((this.BSFlag==null && other.getBSFlag()==null) || 
             (this.BSFlag!=null &&
              this.BSFlag.equals(other.getBSFlag()))) &&
            ((this.BCustomerSegment==null && other.getBCustomerSegment()==null) || 
             (this.BCustomerSegment!=null &&
              this.BCustomerSegment.equals(other.getBCustomerSegment()))) &&
            ((this.BValueSegment==null && other.getBValueSegment()==null) || 
             (this.BValueSegment!=null &&
              this.BValueSegment.equals(other.getBValueSegment()))) &&
            ((this.earlyLifeFlag==null && other.getEarlyLifeFlag()==null) || 
             (this.earlyLifeFlag!=null &&
              this.earlyLifeFlag.equals(other.getEarlyLifeFlag()))) &&
            ((this.ratePlanCode==null && other.getRatePlanCode()==null) || 
             (this.ratePlanCode!=null &&
              this.ratePlanCode.equals(other.getRatePlanCode()))) &&
            ((this.ratePlanDescription==null && other.getRatePlanDescription()==null) || 
             (this.ratePlanDescription!=null &&
              this.ratePlanDescription.equals(other.getRatePlanDescription()))) &&
            ((this.mobileDeviceType==null && other.getMobileDeviceType()==null) || 
             (this.mobileDeviceType!=null &&
              this.mobileDeviceType.equals(other.getMobileDeviceType()))) &&
            ((this.FESystem==null && other.getFESystem()==null) || 
             (this.FESystem!=null &&
              this.FESystem.equals(other.getFESystem())));
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
        if (getTTPID() != null) {
            _hashCode += getTTPID().hashCode();
        }
        if (getBSPriority() != null) {
            _hashCode += getBSPriority().hashCode();
        }
        if (getBSCustomerType() != null) {
            _hashCode += getBSCustomerType().hashCode();
        }
        if (getBSCustomerAddress() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBSCustomerAddress());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getBSCustomerAddress(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBSAccessType() != null) {
            _hashCode += getBSAccessType().hashCode();
        }
        if (getBSAccessDetail() != null) {
            _hashCode += getBSAccessDetail().hashCode();
        }
        if (getBSAccessLinkID() != null) {
            _hashCode += getBSAccessLinkID().hashCode();
        }
        if (getBSAccessServiceID() != null) {
            _hashCode += getBSAccessServiceID().hashCode();
        }
        if (getBSOrderID() != null) {
            _hashCode += getBSOrderID().hashCode();
        }
        if (getBSFlag() != null) {
            _hashCode += getBSFlag().hashCode();
        }
        if (getBCustomerSegment() != null) {
            _hashCode += getBCustomerSegment().hashCode();
        }
        if (getBValueSegment() != null) {
            _hashCode += getBValueSegment().hashCode();
        }
        if (getEarlyLifeFlag() != null) {
            _hashCode += getEarlyLifeFlag().hashCode();
        }
        if (getRatePlanCode() != null) {
            _hashCode += getRatePlanCode().hashCode();
        }
        if (getRatePlanDescription() != null) {
            _hashCode += getRatePlanDescription().hashCode();
        }
        if (getMobileDeviceType() != null) {
            _hashCode += getMobileDeviceType().hashCode();
        }
        if (getFESystem() != null) {
            _hashCode += getFESystem().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateComplaintInUCMSRequestDataHeaderBistreamFields.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", ">>>UpdateComplaintInUCMSRequest>DataHeader>BistreamFields"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TTPID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "TTPID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BSPriority");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "BSPriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BSCustomerType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "BSCustomerType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BSCustomerAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "BSCustomerAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", ">>>>UpdateComplaintInUCMSRequest>DataHeader>BistreamFields>BSCustomerAddress"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BSAccessType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "BSAccessType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BSAccessDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "BSAccessDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BSAccessLinkID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "BSAccessLinkID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BSAccessServiceID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "BSAccessServiceID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BSOrderID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "BSOrderID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BSFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "BSFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BCustomerSegment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "BCustomerSegment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BValueSegment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "BValueSegment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("earlyLifeFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "EarlyLifeFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ratePlanCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "RatePlanCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ratePlanDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "RatePlanDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mobileDeviceType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "MobileDeviceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FESystem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "FESystem"));
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
