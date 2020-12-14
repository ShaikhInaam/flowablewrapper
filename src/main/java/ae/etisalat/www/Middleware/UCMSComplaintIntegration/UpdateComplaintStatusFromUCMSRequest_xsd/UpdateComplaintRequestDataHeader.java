/**
 * UpdateComplaintRequestDataHeader.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintStatusFromUCMSRequest_xsd;

public class UpdateComplaintRequestDataHeader  implements java.io.Serializable {
    private String sourceSystem;

    private String complaintId;

    private String UCMSID;

    private String disputeAmount;

    private String bulkComplaintFlag;

    private String bulkComplaintID;

    private String MTTID;

    private String complaintNature;

    private String complaintNatureDesc;

    private String complaintType;

    private String complaintTypeDesc;

    private String complaintDescription;

    private String subRegionCode;

    private String subRegion;

    private String channel;

    private String complaintPriorityFlag;

    private String channelCode;

    private String activityType;

    private String resolveBy;

    private ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintStatusFromUCMSRequest_xsd.UpdateComplaintRequestDataHeaderAdditionalInfo[] additionalInfo;

    public UpdateComplaintRequestDataHeader() {
    }

    public UpdateComplaintRequestDataHeader(
           String sourceSystem,
           String complaintId,
           String UCMSID,
           String disputeAmount,
           String bulkComplaintFlag,
           String bulkComplaintID,
           String MTTID,
           String complaintNature,
           String complaintNatureDesc,
           String complaintType,
           String complaintTypeDesc,
           String complaintDescription,
           String subRegionCode,
           String subRegion,
           String channel,
           String complaintPriorityFlag,
           String channelCode,
           String activityType,
           String resolveBy,
           ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintStatusFromUCMSRequest_xsd.UpdateComplaintRequestDataHeaderAdditionalInfo[] additionalInfo) {
           this.sourceSystem = sourceSystem;
           this.complaintId = complaintId;
           this.UCMSID = UCMSID;
           this.disputeAmount = disputeAmount;
           this.bulkComplaintFlag = bulkComplaintFlag;
           this.bulkComplaintID = bulkComplaintID;
           this.MTTID = MTTID;
           this.complaintNature = complaintNature;
           this.complaintNatureDesc = complaintNatureDesc;
           this.complaintType = complaintType;
           this.complaintTypeDesc = complaintTypeDesc;
           this.complaintDescription = complaintDescription;
           this.subRegionCode = subRegionCode;
           this.subRegion = subRegion;
           this.channel = channel;
           this.complaintPriorityFlag = complaintPriorityFlag;
           this.channelCode = channelCode;
           this.activityType = activityType;
           this.resolveBy = resolveBy;
           this.additionalInfo = additionalInfo;
    }


    /**
     * Gets the sourceSystem value for this UpdateComplaintRequestDataHeader.
     * 
     * @return sourceSystem
     */
    public String getSourceSystem() {
        return sourceSystem;
    }


    /**
     * Sets the sourceSystem value for this UpdateComplaintRequestDataHeader.
     * 
     * @param sourceSystem
     */
    public void setSourceSystem(String sourceSystem) {
        this.sourceSystem = sourceSystem;
    }


    /**
     * Gets the complaintId value for this UpdateComplaintRequestDataHeader.
     * 
     * @return complaintId
     */
    public String getComplaintId() {
        return complaintId;
    }


    /**
     * Sets the complaintId value for this UpdateComplaintRequestDataHeader.
     * 
     * @param complaintId
     */
    public void setComplaintId(String complaintId) {
        this.complaintId = complaintId;
    }


    /**
     * Gets the UCMSID value for this UpdateComplaintRequestDataHeader.
     * 
     * @return UCMSID
     */
    public String getUCMSID() {
        return UCMSID;
    }


    /**
     * Sets the UCMSID value for this UpdateComplaintRequestDataHeader.
     * 
     * @param UCMSID
     */
    public void setUCMSID(String UCMSID) {
        this.UCMSID = UCMSID;
    }


    /**
     * Gets the disputeAmount value for this UpdateComplaintRequestDataHeader.
     * 
     * @return disputeAmount
     */
    public String getDisputeAmount() {
        return disputeAmount;
    }


    /**
     * Sets the disputeAmount value for this UpdateComplaintRequestDataHeader.
     * 
     * @param disputeAmount
     */
    public void setDisputeAmount(String disputeAmount) {
        this.disputeAmount = disputeAmount;
    }


    /**
     * Gets the bulkComplaintFlag value for this UpdateComplaintRequestDataHeader.
     * 
     * @return bulkComplaintFlag
     */
    public String getBulkComplaintFlag() {
        return bulkComplaintFlag;
    }


    /**
     * Sets the bulkComplaintFlag value for this UpdateComplaintRequestDataHeader.
     * 
     * @param bulkComplaintFlag
     */
    public void setBulkComplaintFlag(String bulkComplaintFlag) {
        this.bulkComplaintFlag = bulkComplaintFlag;
    }


    /**
     * Gets the bulkComplaintID value for this UpdateComplaintRequestDataHeader.
     * 
     * @return bulkComplaintID
     */
    public String getBulkComplaintID() {
        return bulkComplaintID;
    }


    /**
     * Sets the bulkComplaintID value for this UpdateComplaintRequestDataHeader.
     * 
     * @param bulkComplaintID
     */
    public void setBulkComplaintID(String bulkComplaintID) {
        this.bulkComplaintID = bulkComplaintID;
    }


    /**
     * Gets the MTTID value for this UpdateComplaintRequestDataHeader.
     * 
     * @return MTTID
     */
    public String getMTTID() {
        return MTTID;
    }


    /**
     * Sets the MTTID value for this UpdateComplaintRequestDataHeader.
     * 
     * @param MTTID
     */
    public void setMTTID(String MTTID) {
        this.MTTID = MTTID;
    }


    /**
     * Gets the complaintNature value for this UpdateComplaintRequestDataHeader.
     * 
     * @return complaintNature
     */
    public String getComplaintNature() {
        return complaintNature;
    }


    /**
     * Sets the complaintNature value for this UpdateComplaintRequestDataHeader.
     * 
     * @param complaintNature
     */
    public void setComplaintNature(String complaintNature) {
        this.complaintNature = complaintNature;
    }


    /**
     * Gets the complaintNatureDesc value for this UpdateComplaintRequestDataHeader.
     * 
     * @return complaintNatureDesc
     */
    public String getComplaintNatureDesc() {
        return complaintNatureDesc;
    }


    /**
     * Sets the complaintNatureDesc value for this UpdateComplaintRequestDataHeader.
     * 
     * @param complaintNatureDesc
     */
    public void setComplaintNatureDesc(String complaintNatureDesc) {
        this.complaintNatureDesc = complaintNatureDesc;
    }


    /**
     * Gets the complaintType value for this UpdateComplaintRequestDataHeader.
     * 
     * @return complaintType
     */
    public String getComplaintType() {
        return complaintType;
    }


    /**
     * Sets the complaintType value for this UpdateComplaintRequestDataHeader.
     * 
     * @param complaintType
     */
    public void setComplaintType(String complaintType) {
        this.complaintType = complaintType;
    }


    /**
     * Gets the complaintTypeDesc value for this UpdateComplaintRequestDataHeader.
     * 
     * @return complaintTypeDesc
     */
    public String getComplaintTypeDesc() {
        return complaintTypeDesc;
    }


    /**
     * Sets the complaintTypeDesc value for this UpdateComplaintRequestDataHeader.
     * 
     * @param complaintTypeDesc
     */
    public void setComplaintTypeDesc(String complaintTypeDesc) {
        this.complaintTypeDesc = complaintTypeDesc;
    }


    /**
     * Gets the complaintDescription value for this UpdateComplaintRequestDataHeader.
     * 
     * @return complaintDescription
     */
    public String getComplaintDescription() {
        return complaintDescription;
    }


    /**
     * Sets the complaintDescription value for this UpdateComplaintRequestDataHeader.
     * 
     * @param complaintDescription
     */
    public void setComplaintDescription(String complaintDescription) {
        this.complaintDescription = complaintDescription;
    }


    /**
     * Gets the subRegionCode value for this UpdateComplaintRequestDataHeader.
     * 
     * @return subRegionCode
     */
    public String getSubRegionCode() {
        return subRegionCode;
    }


    /**
     * Sets the subRegionCode value for this UpdateComplaintRequestDataHeader.
     * 
     * @param subRegionCode
     */
    public void setSubRegionCode(String subRegionCode) {
        this.subRegionCode = subRegionCode;
    }


    /**
     * Gets the subRegion value for this UpdateComplaintRequestDataHeader.
     * 
     * @return subRegion
     */
    public String getSubRegion() {
        return subRegion;
    }


    /**
     * Sets the subRegion value for this UpdateComplaintRequestDataHeader.
     * 
     * @param subRegion
     */
    public void setSubRegion(String subRegion) {
        this.subRegion = subRegion;
    }


    /**
     * Gets the channel value for this UpdateComplaintRequestDataHeader.
     * 
     * @return channel
     */
    public String getChannel() {
        return channel;
    }


    /**
     * Sets the channel value for this UpdateComplaintRequestDataHeader.
     * 
     * @param channel
     */
    public void setChannel(String channel) {
        this.channel = channel;
    }


    /**
     * Gets the complaintPriorityFlag value for this UpdateComplaintRequestDataHeader.
     * 
     * @return complaintPriorityFlag
     */
    public String getComplaintPriorityFlag() {
        return complaintPriorityFlag;
    }


    /**
     * Sets the complaintPriorityFlag value for this UpdateComplaintRequestDataHeader.
     * 
     * @param complaintPriorityFlag
     */
    public void setComplaintPriorityFlag(String complaintPriorityFlag) {
        this.complaintPriorityFlag = complaintPriorityFlag;
    }


    /**
     * Gets the channelCode value for this UpdateComplaintRequestDataHeader.
     * 
     * @return channelCode
     */
    public String getChannelCode() {
        return channelCode;
    }


    /**
     * Sets the channelCode value for this UpdateComplaintRequestDataHeader.
     * 
     * @param channelCode
     */
    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode;
    }


    /**
     * Gets the activityType value for this UpdateComplaintRequestDataHeader.
     * 
     * @return activityType
     */
    public String getActivityType() {
        return activityType;
    }


    /**
     * Sets the activityType value for this UpdateComplaintRequestDataHeader.
     * 
     * @param activityType
     */
    public void setActivityType(String activityType) {
        this.activityType = activityType;
    }


    /**
     * Gets the resolveBy value for this UpdateComplaintRequestDataHeader.
     * 
     * @return resolveBy
     */
    public String getResolveBy() {
        return resolveBy;
    }


    /**
     * Sets the resolveBy value for this UpdateComplaintRequestDataHeader.
     * 
     * @param resolveBy
     */
    public void setResolveBy(String resolveBy) {
        this.resolveBy = resolveBy;
    }


    /**
     * Gets the additionalInfo value for this UpdateComplaintRequestDataHeader.
     * 
     * @return additionalInfo
     */
    public ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintStatusFromUCMSRequest_xsd.UpdateComplaintRequestDataHeaderAdditionalInfo[] getAdditionalInfo() {
        return additionalInfo;
    }


    /**
     * Sets the additionalInfo value for this UpdateComplaintRequestDataHeader.
     * 
     * @param additionalInfo
     */
    public void setAdditionalInfo(ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintStatusFromUCMSRequest_xsd.UpdateComplaintRequestDataHeaderAdditionalInfo[] additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintStatusFromUCMSRequest_xsd.UpdateComplaintRequestDataHeaderAdditionalInfo getAdditionalInfo(int i) {
        return this.additionalInfo[i];
    }

    public void setAdditionalInfo(int i, ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintStatusFromUCMSRequest_xsd.UpdateComplaintRequestDataHeaderAdditionalInfo _value) {
        this.additionalInfo[i] = _value;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof UpdateComplaintRequestDataHeader)) return false;
        UpdateComplaintRequestDataHeader other = (UpdateComplaintRequestDataHeader) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sourceSystem==null && other.getSourceSystem()==null) || 
             (this.sourceSystem!=null &&
              this.sourceSystem.equals(other.getSourceSystem()))) &&
            ((this.complaintId==null && other.getComplaintId()==null) || 
             (this.complaintId!=null &&
              this.complaintId.equals(other.getComplaintId()))) &&
            ((this.UCMSID==null && other.getUCMSID()==null) || 
             (this.UCMSID!=null &&
              this.UCMSID.equals(other.getUCMSID()))) &&
            ((this.disputeAmount==null && other.getDisputeAmount()==null) || 
             (this.disputeAmount!=null &&
              this.disputeAmount.equals(other.getDisputeAmount()))) &&
            ((this.bulkComplaintFlag==null && other.getBulkComplaintFlag()==null) || 
             (this.bulkComplaintFlag!=null &&
              this.bulkComplaintFlag.equals(other.getBulkComplaintFlag()))) &&
            ((this.bulkComplaintID==null && other.getBulkComplaintID()==null) || 
             (this.bulkComplaintID!=null &&
              this.bulkComplaintID.equals(other.getBulkComplaintID()))) &&
            ((this.MTTID==null && other.getMTTID()==null) || 
             (this.MTTID!=null &&
              this.MTTID.equals(other.getMTTID()))) &&
            ((this.complaintNature==null && other.getComplaintNature()==null) || 
             (this.complaintNature!=null &&
              this.complaintNature.equals(other.getComplaintNature()))) &&
            ((this.complaintNatureDesc==null && other.getComplaintNatureDesc()==null) || 
             (this.complaintNatureDesc!=null &&
              this.complaintNatureDesc.equals(other.getComplaintNatureDesc()))) &&
            ((this.complaintType==null && other.getComplaintType()==null) || 
             (this.complaintType!=null &&
              this.complaintType.equals(other.getComplaintType()))) &&
            ((this.complaintTypeDesc==null && other.getComplaintTypeDesc()==null) || 
             (this.complaintTypeDesc!=null &&
              this.complaintTypeDesc.equals(other.getComplaintTypeDesc()))) &&
            ((this.complaintDescription==null && other.getComplaintDescription()==null) || 
             (this.complaintDescription!=null &&
              this.complaintDescription.equals(other.getComplaintDescription()))) &&
            ((this.subRegionCode==null && other.getSubRegionCode()==null) || 
             (this.subRegionCode!=null &&
              this.subRegionCode.equals(other.getSubRegionCode()))) &&
            ((this.subRegion==null && other.getSubRegion()==null) || 
             (this.subRegion!=null &&
              this.subRegion.equals(other.getSubRegion()))) &&
            ((this.channel==null && other.getChannel()==null) || 
             (this.channel!=null &&
              this.channel.equals(other.getChannel()))) &&
            ((this.complaintPriorityFlag==null && other.getComplaintPriorityFlag()==null) || 
             (this.complaintPriorityFlag!=null &&
              this.complaintPriorityFlag.equals(other.getComplaintPriorityFlag()))) &&
            ((this.channelCode==null && other.getChannelCode()==null) || 
             (this.channelCode!=null &&
              this.channelCode.equals(other.getChannelCode()))) &&
            ((this.activityType==null && other.getActivityType()==null) || 
             (this.activityType!=null &&
              this.activityType.equals(other.getActivityType()))) &&
            ((this.resolveBy==null && other.getResolveBy()==null) || 
             (this.resolveBy!=null &&
              this.resolveBy.equals(other.getResolveBy()))) &&
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
        if (getSourceSystem() != null) {
            _hashCode += getSourceSystem().hashCode();
        }
        if (getComplaintId() != null) {
            _hashCode += getComplaintId().hashCode();
        }
        if (getUCMSID() != null) {
            _hashCode += getUCMSID().hashCode();
        }
        if (getDisputeAmount() != null) {
            _hashCode += getDisputeAmount().hashCode();
        }
        if (getBulkComplaintFlag() != null) {
            _hashCode += getBulkComplaintFlag().hashCode();
        }
        if (getBulkComplaintID() != null) {
            _hashCode += getBulkComplaintID().hashCode();
        }
        if (getMTTID() != null) {
            _hashCode += getMTTID().hashCode();
        }
        if (getComplaintNature() != null) {
            _hashCode += getComplaintNature().hashCode();
        }
        if (getComplaintNatureDesc() != null) {
            _hashCode += getComplaintNatureDesc().hashCode();
        }
        if (getComplaintType() != null) {
            _hashCode += getComplaintType().hashCode();
        }
        if (getComplaintTypeDesc() != null) {
            _hashCode += getComplaintTypeDesc().hashCode();
        }
        if (getComplaintDescription() != null) {
            _hashCode += getComplaintDescription().hashCode();
        }
        if (getSubRegionCode() != null) {
            _hashCode += getSubRegionCode().hashCode();
        }
        if (getSubRegion() != null) {
            _hashCode += getSubRegion().hashCode();
        }
        if (getChannel() != null) {
            _hashCode += getChannel().hashCode();
        }
        if (getComplaintPriorityFlag() != null) {
            _hashCode += getComplaintPriorityFlag().hashCode();
        }
        if (getChannelCode() != null) {
            _hashCode += getChannelCode().hashCode();
        }
        if (getActivityType() != null) {
            _hashCode += getActivityType().hashCode();
        }
        if (getResolveBy() != null) {
            _hashCode += getResolveBy().hashCode();
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
        new org.apache.axis.description.TypeDesc(UpdateComplaintRequestDataHeader.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintStatusFromUCMSRequest.xsd", ">>UpdateComplaintRequest>DataHeader"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceSystem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintStatusFromUCMSRequest.xsd", "SourceSystem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("complaintId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintStatusFromUCMSRequest.xsd", "ComplaintId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("UCMSID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintStatusFromUCMSRequest.xsd", "UCMSID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disputeAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintStatusFromUCMSRequest.xsd", "DisputeAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bulkComplaintFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintStatusFromUCMSRequest.xsd", "BulkComplaintFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bulkComplaintID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintStatusFromUCMSRequest.xsd", "BulkComplaintID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MTTID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintStatusFromUCMSRequest.xsd", "MTTID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("complaintNature");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintStatusFromUCMSRequest.xsd", "ComplaintNature"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("complaintNatureDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintStatusFromUCMSRequest.xsd", "ComplaintNatureDesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("complaintType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintStatusFromUCMSRequest.xsd", "ComplaintType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("complaintTypeDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintStatusFromUCMSRequest.xsd", "ComplaintTypeDesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("complaintDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintStatusFromUCMSRequest.xsd", "ComplaintDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subRegionCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintStatusFromUCMSRequest.xsd", "SubRegionCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subRegion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintStatusFromUCMSRequest.xsd", "SubRegion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("channel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintStatusFromUCMSRequest.xsd", "Channel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("complaintPriorityFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintStatusFromUCMSRequest.xsd", "ComplaintPriorityFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("channelCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintStatusFromUCMSRequest.xsd", "ChannelCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activityType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintStatusFromUCMSRequest.xsd", "ActivityType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resolveBy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintStatusFromUCMSRequest.xsd", "ResolveBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintStatusFromUCMSRequest.xsd", "AdditionalInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintStatusFromUCMSRequest.xsd", ">>>UpdateComplaintRequest>DataHeader>AdditionalInfo"));
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
