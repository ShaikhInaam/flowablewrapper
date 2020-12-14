/**
 * ResolveComplaintInUCMSRequestDataHeader.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ae.etisalat.www.Middleware.UCMSComplaintIntegration.ResolveComplaintRequest_xsd;

public class ResolveComplaintInUCMSRequestDataHeader  implements java.io.Serializable {
    private int complaintID;

    private String sourceSystem;

    private String ticketStatus;

    private java.util.Calendar resolvedDate;

    private String emplyoeeNumber;

    private String resolvedGroup;

    private String mainClearCode;

    private String clearCode;

    private String auxilaryClearCode;

    private String refundAmount;

    private String refundApprover;

    private String hasCustomerContacted;

    private String hasCustomerSatisfied;

    private String complaintRemark;

    private String resolveBy;

    private String closureMethodology;

    private String leadId;

    private String requestID;

    private String modifiedByChannel;

    private java.util.Calendar modifiedOnDate;

    private String processingChannel;

    private java.util.Calendar processedOn;

    private java.util.Calendar closedDate;

    private String BORequestNature;

    private String BORequestType;

    private String reason;

    private Boolean LMSFlag;

    private String action;

    private String notificationMessage;

    private ae.etisalat.www.Middleware.UCMSComplaintIntegration.ResolveComplaintRequest_xsd.ResolveComplaintInUCMSRequestDataHeaderSMSContent SMSContent;

    private ae.etisalat.www.Middleware.UCMSComplaintIntegration.ResolveComplaintRequest_xsd.ResolveComplaintInUCMSRequestDataHeaderAdditionalInfo[] additionalInfo;

    public ResolveComplaintInUCMSRequestDataHeader() {
    }

    public ResolveComplaintInUCMSRequestDataHeader(
           int complaintID,
           String sourceSystem,
           String ticketStatus,
           java.util.Calendar resolvedDate,
           String emplyoeeNumber,
           String resolvedGroup,
           String mainClearCode,
           String clearCode,
           String auxilaryClearCode,
           String refundAmount,
           String refundApprover,
           String hasCustomerContacted,
           String hasCustomerSatisfied,
           String complaintRemark,
           String resolveBy,
           String closureMethodology,
           String leadId,
           String requestID,
           String modifiedByChannel,
           java.util.Calendar modifiedOnDate,
           String processingChannel,
           java.util.Calendar processedOn,
           java.util.Calendar closedDate,
           String BORequestNature,
           String BORequestType,
           String reason,
           Boolean LMSFlag,
           String action,
           String notificationMessage,
           ae.etisalat.www.Middleware.UCMSComplaintIntegration.ResolveComplaintRequest_xsd.ResolveComplaintInUCMSRequestDataHeaderSMSContent SMSContent,
           ae.etisalat.www.Middleware.UCMSComplaintIntegration.ResolveComplaintRequest_xsd.ResolveComplaintInUCMSRequestDataHeaderAdditionalInfo[] additionalInfo) {
           this.complaintID = complaintID;
           this.sourceSystem = sourceSystem;
           this.ticketStatus = ticketStatus;
           this.resolvedDate = resolvedDate;
           this.emplyoeeNumber = emplyoeeNumber;
           this.resolvedGroup = resolvedGroup;
           this.mainClearCode = mainClearCode;
           this.clearCode = clearCode;
           this.auxilaryClearCode = auxilaryClearCode;
           this.refundAmount = refundAmount;
           this.refundApprover = refundApprover;
           this.hasCustomerContacted = hasCustomerContacted;
           this.hasCustomerSatisfied = hasCustomerSatisfied;
           this.complaintRemark = complaintRemark;
           this.resolveBy = resolveBy;
           this.closureMethodology = closureMethodology;
           this.leadId = leadId;
           this.requestID = requestID;
           this.modifiedByChannel = modifiedByChannel;
           this.modifiedOnDate = modifiedOnDate;
           this.processingChannel = processingChannel;
           this.processedOn = processedOn;
           this.closedDate = closedDate;
           this.BORequestNature = BORequestNature;
           this.BORequestType = BORequestType;
           this.reason = reason;
           this.LMSFlag = LMSFlag;
           this.action = action;
           this.notificationMessage = notificationMessage;
           this.SMSContent = SMSContent;
           this.additionalInfo = additionalInfo;
    }


    /**
     * Gets the complaintID value for this ResolveComplaintInUCMSRequestDataHeader.
     * 
     * @return complaintID
     */
    public int getComplaintID() {
        return complaintID;
    }


    /**
     * Sets the complaintID value for this ResolveComplaintInUCMSRequestDataHeader.
     * 
     * @param complaintID
     */
    public void setComplaintID(int complaintID) {
        this.complaintID = complaintID;
    }


    /**
     * Gets the sourceSystem value for this ResolveComplaintInUCMSRequestDataHeader.
     * 
     * @return sourceSystem
     */
    public String getSourceSystem() {
        return sourceSystem;
    }


    /**
     * Sets the sourceSystem value for this ResolveComplaintInUCMSRequestDataHeader.
     * 
     * @param sourceSystem
     */
    public void setSourceSystem(String sourceSystem) {
        this.sourceSystem = sourceSystem;
    }


    /**
     * Gets the ticketStatus value for this ResolveComplaintInUCMSRequestDataHeader.
     * 
     * @return ticketStatus
     */
    public String getTicketStatus() {
        return ticketStatus;
    }


    /**
     * Sets the ticketStatus value for this ResolveComplaintInUCMSRequestDataHeader.
     * 
     * @param ticketStatus
     */
    public void setTicketStatus(String ticketStatus) {
        this.ticketStatus = ticketStatus;
    }


    /**
     * Gets the resolvedDate value for this ResolveComplaintInUCMSRequestDataHeader.
     * 
     * @return resolvedDate
     */
    public java.util.Calendar getResolvedDate() {
        return resolvedDate;
    }


    /**
     * Sets the resolvedDate value for this ResolveComplaintInUCMSRequestDataHeader.
     * 
     * @param resolvedDate
     */
    public void setResolvedDate(java.util.Calendar resolvedDate) {
        this.resolvedDate = resolvedDate;
    }


    /**
     * Gets the emplyoeeNumber value for this ResolveComplaintInUCMSRequestDataHeader.
     * 
     * @return emplyoeeNumber
     */
    public String getEmplyoeeNumber() {
        return emplyoeeNumber;
    }


    /**
     * Sets the emplyoeeNumber value for this ResolveComplaintInUCMSRequestDataHeader.
     * 
     * @param emplyoeeNumber
     */
    public void setEmplyoeeNumber(String emplyoeeNumber) {
        this.emplyoeeNumber = emplyoeeNumber;
    }


    /**
     * Gets the resolvedGroup value for this ResolveComplaintInUCMSRequestDataHeader.
     * 
     * @return resolvedGroup
     */
    public String getResolvedGroup() {
        return resolvedGroup;
    }


    /**
     * Sets the resolvedGroup value for this ResolveComplaintInUCMSRequestDataHeader.
     * 
     * @param resolvedGroup
     */
    public void setResolvedGroup(String resolvedGroup) {
        this.resolvedGroup = resolvedGroup;
    }


    /**
     * Gets the mainClearCode value for this ResolveComplaintInUCMSRequestDataHeader.
     * 
     * @return mainClearCode
     */
    public String getMainClearCode() {
        return mainClearCode;
    }


    /**
     * Sets the mainClearCode value for this ResolveComplaintInUCMSRequestDataHeader.
     * 
     * @param mainClearCode
     */
    public void setMainClearCode(String mainClearCode) {
        this.mainClearCode = mainClearCode;
    }


    /**
     * Gets the clearCode value for this ResolveComplaintInUCMSRequestDataHeader.
     * 
     * @return clearCode
     */
    public String getClearCode() {
        return clearCode;
    }


    /**
     * Sets the clearCode value for this ResolveComplaintInUCMSRequestDataHeader.
     * 
     * @param clearCode
     */
    public void setClearCode(String clearCode) {
        this.clearCode = clearCode;
    }


    /**
     * Gets the auxilaryClearCode value for this ResolveComplaintInUCMSRequestDataHeader.
     * 
     * @return auxilaryClearCode
     */
    public String getAuxilaryClearCode() {
        return auxilaryClearCode;
    }


    /**
     * Sets the auxilaryClearCode value for this ResolveComplaintInUCMSRequestDataHeader.
     * 
     * @param auxilaryClearCode
     */
    public void setAuxilaryClearCode(String auxilaryClearCode) {
        this.auxilaryClearCode = auxilaryClearCode;
    }


    /**
     * Gets the refundAmount value for this ResolveComplaintInUCMSRequestDataHeader.
     * 
     * @return refundAmount
     */
    public String getRefundAmount() {
        return refundAmount;
    }


    /**
     * Sets the refundAmount value for this ResolveComplaintInUCMSRequestDataHeader.
     * 
     * @param refundAmount
     */
    public void setRefundAmount(String refundAmount) {
        this.refundAmount = refundAmount;
    }


    /**
     * Gets the refundApprover value for this ResolveComplaintInUCMSRequestDataHeader.
     * 
     * @return refundApprover
     */
    public String getRefundApprover() {
        return refundApprover;
    }


    /**
     * Sets the refundApprover value for this ResolveComplaintInUCMSRequestDataHeader.
     * 
     * @param refundApprover
     */
    public void setRefundApprover(String refundApprover) {
        this.refundApprover = refundApprover;
    }


    /**
     * Gets the hasCustomerContacted value for this ResolveComplaintInUCMSRequestDataHeader.
     * 
     * @return hasCustomerContacted
     */
    public String getHasCustomerContacted() {
        return hasCustomerContacted;
    }


    /**
     * Sets the hasCustomerContacted value for this ResolveComplaintInUCMSRequestDataHeader.
     * 
     * @param hasCustomerContacted
     */
    public void setHasCustomerContacted(String hasCustomerContacted) {
        this.hasCustomerContacted = hasCustomerContacted;
    }


    /**
     * Gets the hasCustomerSatisfied value for this ResolveComplaintInUCMSRequestDataHeader.
     * 
     * @return hasCustomerSatisfied
     */
    public String getHasCustomerSatisfied() {
        return hasCustomerSatisfied;
    }


    /**
     * Sets the hasCustomerSatisfied value for this ResolveComplaintInUCMSRequestDataHeader.
     * 
     * @param hasCustomerSatisfied
     */
    public void setHasCustomerSatisfied(String hasCustomerSatisfied) {
        this.hasCustomerSatisfied = hasCustomerSatisfied;
    }


    /**
     * Gets the complaintRemark value for this ResolveComplaintInUCMSRequestDataHeader.
     * 
     * @return complaintRemark
     */
    public String getComplaintRemark() {
        return complaintRemark;
    }


    /**
     * Sets the complaintRemark value for this ResolveComplaintInUCMSRequestDataHeader.
     * 
     * @param complaintRemark
     */
    public void setComplaintRemark(String complaintRemark) {
        this.complaintRemark = complaintRemark;
    }


    /**
     * Gets the resolveBy value for this ResolveComplaintInUCMSRequestDataHeader.
     * 
     * @return resolveBy
     */
    public String getResolveBy() {
        return resolveBy;
    }


    /**
     * Sets the resolveBy value for this ResolveComplaintInUCMSRequestDataHeader.
     * 
     * @param resolveBy
     */
    public void setResolveBy(String resolveBy) {
        this.resolveBy = resolveBy;
    }


    /**
     * Gets the closureMethodology value for this ResolveComplaintInUCMSRequestDataHeader.
     * 
     * @return closureMethodology
     */
    public String getClosureMethodology() {
        return closureMethodology;
    }


    /**
     * Sets the closureMethodology value for this ResolveComplaintInUCMSRequestDataHeader.
     * 
     * @param closureMethodology
     */
    public void setClosureMethodology(String closureMethodology) {
        this.closureMethodology = closureMethodology;
    }


    /**
     * Gets the leadId value for this ResolveComplaintInUCMSRequestDataHeader.
     * 
     * @return leadId
     */
    public String getLeadId() {
        return leadId;
    }


    /**
     * Sets the leadId value for this ResolveComplaintInUCMSRequestDataHeader.
     * 
     * @param leadId
     */
    public void setLeadId(String leadId) {
        this.leadId = leadId;
    }


    /**
     * Gets the requestID value for this ResolveComplaintInUCMSRequestDataHeader.
     * 
     * @return requestID
     */
    public String getRequestID() {
        return requestID;
    }


    /**
     * Sets the requestID value for this ResolveComplaintInUCMSRequestDataHeader.
     * 
     * @param requestID
     */
    public void setRequestID(String requestID) {
        this.requestID = requestID;
    }


    /**
     * Gets the modifiedByChannel value for this ResolveComplaintInUCMSRequestDataHeader.
     * 
     * @return modifiedByChannel
     */
    public String getModifiedByChannel() {
        return modifiedByChannel;
    }


    /**
     * Sets the modifiedByChannel value for this ResolveComplaintInUCMSRequestDataHeader.
     * 
     * @param modifiedByChannel
     */
    public void setModifiedByChannel(String modifiedByChannel) {
        this.modifiedByChannel = modifiedByChannel;
    }


    /**
     * Gets the modifiedOnDate value for this ResolveComplaintInUCMSRequestDataHeader.
     * 
     * @return modifiedOnDate
     */
    public java.util.Calendar getModifiedOnDate() {
        return modifiedOnDate;
    }


    /**
     * Sets the modifiedOnDate value for this ResolveComplaintInUCMSRequestDataHeader.
     * 
     * @param modifiedOnDate
     */
    public void setModifiedOnDate(java.util.Calendar modifiedOnDate) {
        this.modifiedOnDate = modifiedOnDate;
    }


    /**
     * Gets the processingChannel value for this ResolveComplaintInUCMSRequestDataHeader.
     * 
     * @return processingChannel
     */
    public String getProcessingChannel() {
        return processingChannel;
    }


    /**
     * Sets the processingChannel value for this ResolveComplaintInUCMSRequestDataHeader.
     * 
     * @param processingChannel
     */
    public void setProcessingChannel(String processingChannel) {
        this.processingChannel = processingChannel;
    }


    /**
     * Gets the processedOn value for this ResolveComplaintInUCMSRequestDataHeader.
     * 
     * @return processedOn
     */
    public java.util.Calendar getProcessedOn() {
        return processedOn;
    }


    /**
     * Sets the processedOn value for this ResolveComplaintInUCMSRequestDataHeader.
     * 
     * @param processedOn
     */
    public void setProcessedOn(java.util.Calendar processedOn) {
        this.processedOn = processedOn;
    }


    /**
     * Gets the closedDate value for this ResolveComplaintInUCMSRequestDataHeader.
     * 
     * @return closedDate
     */
    public java.util.Calendar getClosedDate() {
        return closedDate;
    }


    /**
     * Sets the closedDate value for this ResolveComplaintInUCMSRequestDataHeader.
     * 
     * @param closedDate
     */
    public void setClosedDate(java.util.Calendar closedDate) {
        this.closedDate = closedDate;
    }


    /**
     * Gets the BORequestNature value for this ResolveComplaintInUCMSRequestDataHeader.
     * 
     * @return BORequestNature
     */
    public String getBORequestNature() {
        return BORequestNature;
    }


    /**
     * Sets the BORequestNature value for this ResolveComplaintInUCMSRequestDataHeader.
     * 
     * @param BORequestNature
     */
    public void setBORequestNature(String BORequestNature) {
        this.BORequestNature = BORequestNature;
    }


    /**
     * Gets the BORequestType value for this ResolveComplaintInUCMSRequestDataHeader.
     * 
     * @return BORequestType
     */
    public String getBORequestType() {
        return BORequestType;
    }


    /**
     * Sets the BORequestType value for this ResolveComplaintInUCMSRequestDataHeader.
     * 
     * @param BORequestType
     */
    public void setBORequestType(String BORequestType) {
        this.BORequestType = BORequestType;
    }


    /**
     * Gets the reason value for this ResolveComplaintInUCMSRequestDataHeader.
     * 
     * @return reason
     */
    public String getReason() {
        return reason;
    }


    /**
     * Sets the reason value for this ResolveComplaintInUCMSRequestDataHeader.
     * 
     * @param reason
     */
    public void setReason(String reason) {
        this.reason = reason;
    }


    /**
     * Gets the LMSFlag value for this ResolveComplaintInUCMSRequestDataHeader.
     * 
     * @return LMSFlag
     */
    public Boolean getLMSFlag() {
        return LMSFlag;
    }


    /**
     * Sets the LMSFlag value for this ResolveComplaintInUCMSRequestDataHeader.
     * 
     * @param LMSFlag
     */
    public void setLMSFlag(Boolean LMSFlag) {
        this.LMSFlag = LMSFlag;
    }


    /**
     * Gets the action value for this ResolveComplaintInUCMSRequestDataHeader.
     * 
     * @return action
     */
    public String getAction() {
        return action;
    }


    /**
     * Sets the action value for this ResolveComplaintInUCMSRequestDataHeader.
     * 
     * @param action
     */
    public void setAction(String action) {
        this.action = action;
    }


    /**
     * Gets the notificationMessage value for this ResolveComplaintInUCMSRequestDataHeader.
     * 
     * @return notificationMessage
     */
    public String getNotificationMessage() {
        return notificationMessage;
    }


    /**
     * Sets the notificationMessage value for this ResolveComplaintInUCMSRequestDataHeader.
     * 
     * @param notificationMessage
     */
    public void setNotificationMessage(String notificationMessage) {
        this.notificationMessage = notificationMessage;
    }


    /**
     * Gets the SMSContent value for this ResolveComplaintInUCMSRequestDataHeader.
     * 
     * @return SMSContent
     */
    public ae.etisalat.www.Middleware.UCMSComplaintIntegration.ResolveComplaintRequest_xsd.ResolveComplaintInUCMSRequestDataHeaderSMSContent getSMSContent() {
        return SMSContent;
    }


    /**
     * Sets the SMSContent value for this ResolveComplaintInUCMSRequestDataHeader.
     * 
     * @param SMSContent
     */
    public void setSMSContent(ae.etisalat.www.Middleware.UCMSComplaintIntegration.ResolveComplaintRequest_xsd.ResolveComplaintInUCMSRequestDataHeaderSMSContent SMSContent) {
        this.SMSContent = SMSContent;
    }


    /**
     * Gets the additionalInfo value for this ResolveComplaintInUCMSRequestDataHeader.
     * 
     * @return additionalInfo
     */
    public ae.etisalat.www.Middleware.UCMSComplaintIntegration.ResolveComplaintRequest_xsd.ResolveComplaintInUCMSRequestDataHeaderAdditionalInfo[] getAdditionalInfo() {
        return additionalInfo;
    }


    /**
     * Sets the additionalInfo value for this ResolveComplaintInUCMSRequestDataHeader.
     * 
     * @param additionalInfo
     */
    public void setAdditionalInfo(ae.etisalat.www.Middleware.UCMSComplaintIntegration.ResolveComplaintRequest_xsd.ResolveComplaintInUCMSRequestDataHeaderAdditionalInfo[] additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public ae.etisalat.www.Middleware.UCMSComplaintIntegration.ResolveComplaintRequest_xsd.ResolveComplaintInUCMSRequestDataHeaderAdditionalInfo getAdditionalInfo(int i) {
        return this.additionalInfo[i];
    }

    public void setAdditionalInfo(int i, ae.etisalat.www.Middleware.UCMSComplaintIntegration.ResolveComplaintRequest_xsd.ResolveComplaintInUCMSRequestDataHeaderAdditionalInfo _value) {
        this.additionalInfo[i] = _value;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ResolveComplaintInUCMSRequestDataHeader)) return false;
        ResolveComplaintInUCMSRequestDataHeader other = (ResolveComplaintInUCMSRequestDataHeader) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.complaintID == other.getComplaintID() &&
            ((this.sourceSystem==null && other.getSourceSystem()==null) || 
             (this.sourceSystem!=null &&
              this.sourceSystem.equals(other.getSourceSystem()))) &&
            ((this.ticketStatus==null && other.getTicketStatus()==null) || 
             (this.ticketStatus!=null &&
              this.ticketStatus.equals(other.getTicketStatus()))) &&
            ((this.resolvedDate==null && other.getResolvedDate()==null) || 
             (this.resolvedDate!=null &&
              this.resolvedDate.equals(other.getResolvedDate()))) &&
            ((this.emplyoeeNumber==null && other.getEmplyoeeNumber()==null) || 
             (this.emplyoeeNumber!=null &&
              this.emplyoeeNumber.equals(other.getEmplyoeeNumber()))) &&
            ((this.resolvedGroup==null && other.getResolvedGroup()==null) || 
             (this.resolvedGroup!=null &&
              this.resolvedGroup.equals(other.getResolvedGroup()))) &&
            ((this.mainClearCode==null && other.getMainClearCode()==null) || 
             (this.mainClearCode!=null &&
              this.mainClearCode.equals(other.getMainClearCode()))) &&
            ((this.clearCode==null && other.getClearCode()==null) || 
             (this.clearCode!=null &&
              this.clearCode.equals(other.getClearCode()))) &&
            ((this.auxilaryClearCode==null && other.getAuxilaryClearCode()==null) || 
             (this.auxilaryClearCode!=null &&
              this.auxilaryClearCode.equals(other.getAuxilaryClearCode()))) &&
            ((this.refundAmount==null && other.getRefundAmount()==null) || 
             (this.refundAmount!=null &&
              this.refundAmount.equals(other.getRefundAmount()))) &&
            ((this.refundApprover==null && other.getRefundApprover()==null) || 
             (this.refundApprover!=null &&
              this.refundApprover.equals(other.getRefundApprover()))) &&
            ((this.hasCustomerContacted==null && other.getHasCustomerContacted()==null) || 
             (this.hasCustomerContacted!=null &&
              this.hasCustomerContacted.equals(other.getHasCustomerContacted()))) &&
            ((this.hasCustomerSatisfied==null && other.getHasCustomerSatisfied()==null) || 
             (this.hasCustomerSatisfied!=null &&
              this.hasCustomerSatisfied.equals(other.getHasCustomerSatisfied()))) &&
            ((this.complaintRemark==null && other.getComplaintRemark()==null) || 
             (this.complaintRemark!=null &&
              this.complaintRemark.equals(other.getComplaintRemark()))) &&
            ((this.resolveBy==null && other.getResolveBy()==null) || 
             (this.resolveBy!=null &&
              this.resolveBy.equals(other.getResolveBy()))) &&
            ((this.closureMethodology==null && other.getClosureMethodology()==null) || 
             (this.closureMethodology!=null &&
              this.closureMethodology.equals(other.getClosureMethodology()))) &&
            ((this.leadId==null && other.getLeadId()==null) || 
             (this.leadId!=null &&
              this.leadId.equals(other.getLeadId()))) &&
            ((this.requestID==null && other.getRequestID()==null) || 
             (this.requestID!=null &&
              this.requestID.equals(other.getRequestID()))) &&
            ((this.modifiedByChannel==null && other.getModifiedByChannel()==null) || 
             (this.modifiedByChannel!=null &&
              this.modifiedByChannel.equals(other.getModifiedByChannel()))) &&
            ((this.modifiedOnDate==null && other.getModifiedOnDate()==null) || 
             (this.modifiedOnDate!=null &&
              this.modifiedOnDate.equals(other.getModifiedOnDate()))) &&
            ((this.processingChannel==null && other.getProcessingChannel()==null) || 
             (this.processingChannel!=null &&
              this.processingChannel.equals(other.getProcessingChannel()))) &&
            ((this.processedOn==null && other.getProcessedOn()==null) || 
             (this.processedOn!=null &&
              this.processedOn.equals(other.getProcessedOn()))) &&
            ((this.closedDate==null && other.getClosedDate()==null) || 
             (this.closedDate!=null &&
              this.closedDate.equals(other.getClosedDate()))) &&
            ((this.BORequestNature==null && other.getBORequestNature()==null) || 
             (this.BORequestNature!=null &&
              this.BORequestNature.equals(other.getBORequestNature()))) &&
            ((this.BORequestType==null && other.getBORequestType()==null) || 
             (this.BORequestType!=null &&
              this.BORequestType.equals(other.getBORequestType()))) &&
            ((this.reason==null && other.getReason()==null) || 
             (this.reason!=null &&
              this.reason.equals(other.getReason()))) &&
            ((this.LMSFlag==null && other.getLMSFlag()==null) || 
             (this.LMSFlag!=null &&
              this.LMSFlag.equals(other.getLMSFlag()))) &&
            ((this.action==null && other.getAction()==null) || 
             (this.action!=null &&
              this.action.equals(other.getAction()))) &&
            ((this.notificationMessage==null && other.getNotificationMessage()==null) || 
             (this.notificationMessage!=null &&
              this.notificationMessage.equals(other.getNotificationMessage()))) &&
            ((this.SMSContent==null && other.getSMSContent()==null) || 
             (this.SMSContent!=null &&
              this.SMSContent.equals(other.getSMSContent()))) &&
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
        _hashCode += getComplaintID();
        if (getSourceSystem() != null) {
            _hashCode += getSourceSystem().hashCode();
        }
        if (getTicketStatus() != null) {
            _hashCode += getTicketStatus().hashCode();
        }
        if (getResolvedDate() != null) {
            _hashCode += getResolvedDate().hashCode();
        }
        if (getEmplyoeeNumber() != null) {
            _hashCode += getEmplyoeeNumber().hashCode();
        }
        if (getResolvedGroup() != null) {
            _hashCode += getResolvedGroup().hashCode();
        }
        if (getMainClearCode() != null) {
            _hashCode += getMainClearCode().hashCode();
        }
        if (getClearCode() != null) {
            _hashCode += getClearCode().hashCode();
        }
        if (getAuxilaryClearCode() != null) {
            _hashCode += getAuxilaryClearCode().hashCode();
        }
        if (getRefundAmount() != null) {
            _hashCode += getRefundAmount().hashCode();
        }
        if (getRefundApprover() != null) {
            _hashCode += getRefundApprover().hashCode();
        }
        if (getHasCustomerContacted() != null) {
            _hashCode += getHasCustomerContacted().hashCode();
        }
        if (getHasCustomerSatisfied() != null) {
            _hashCode += getHasCustomerSatisfied().hashCode();
        }
        if (getComplaintRemark() != null) {
            _hashCode += getComplaintRemark().hashCode();
        }
        if (getResolveBy() != null) {
            _hashCode += getResolveBy().hashCode();
        }
        if (getClosureMethodology() != null) {
            _hashCode += getClosureMethodology().hashCode();
        }
        if (getLeadId() != null) {
            _hashCode += getLeadId().hashCode();
        }
        if (getRequestID() != null) {
            _hashCode += getRequestID().hashCode();
        }
        if (getModifiedByChannel() != null) {
            _hashCode += getModifiedByChannel().hashCode();
        }
        if (getModifiedOnDate() != null) {
            _hashCode += getModifiedOnDate().hashCode();
        }
        if (getProcessingChannel() != null) {
            _hashCode += getProcessingChannel().hashCode();
        }
        if (getProcessedOn() != null) {
            _hashCode += getProcessedOn().hashCode();
        }
        if (getClosedDate() != null) {
            _hashCode += getClosedDate().hashCode();
        }
        if (getBORequestNature() != null) {
            _hashCode += getBORequestNature().hashCode();
        }
        if (getBORequestType() != null) {
            _hashCode += getBORequestType().hashCode();
        }
        if (getReason() != null) {
            _hashCode += getReason().hashCode();
        }
        if (getLMSFlag() != null) {
            _hashCode += getLMSFlag().hashCode();
        }
        if (getAction() != null) {
            _hashCode += getAction().hashCode();
        }
        if (getNotificationMessage() != null) {
            _hashCode += getNotificationMessage().hashCode();
        }
        if (getSMSContent() != null) {
            _hashCode += getSMSContent().hashCode();
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
        new org.apache.axis.description.TypeDesc(ResolveComplaintInUCMSRequestDataHeader.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/ResolveComplaintRequest.xsd", ">>ResolveComplaintInUCMSRequest>DataHeader"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("complaintID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/ResolveComplaintRequest.xsd", "ComplaintID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceSystem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/ResolveComplaintRequest.xsd", "SourceSystem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ticketStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/ResolveComplaintRequest.xsd", "TicketStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resolvedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/ResolveComplaintRequest.xsd", "ResolvedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emplyoeeNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/ResolveComplaintRequest.xsd", "EmplyoeeNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resolvedGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/ResolveComplaintRequest.xsd", "ResolvedGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mainClearCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/ResolveComplaintRequest.xsd", "MainClearCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clearCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/ResolveComplaintRequest.xsd", "ClearCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("auxilaryClearCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/ResolveComplaintRequest.xsd", "AuxilaryClearCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refundAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/ResolveComplaintRequest.xsd", "RefundAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refundApprover");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/ResolveComplaintRequest.xsd", "RefundApprover"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasCustomerContacted");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/ResolveComplaintRequest.xsd", "HasCustomerContacted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasCustomerSatisfied");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/ResolveComplaintRequest.xsd", "HasCustomerSatisfied"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("complaintRemark");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/ResolveComplaintRequest.xsd", "ComplaintRemark"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resolveBy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/ResolveComplaintRequest.xsd", "ResolveBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("closureMethodology");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/ResolveComplaintRequest.xsd", "ClosureMethodology"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("leadId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/ResolveComplaintRequest.xsd", "LeadId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/ResolveComplaintRequest.xsd", "RequestID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modifiedByChannel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/ResolveComplaintRequest.xsd", "ModifiedByChannel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modifiedOnDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/ResolveComplaintRequest.xsd", "ModifiedOnDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processingChannel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/ResolveComplaintRequest.xsd", "ProcessingChannel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processedOn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/ResolveComplaintRequest.xsd", "ProcessedOn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("closedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/ResolveComplaintRequest.xsd", "ClosedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BORequestNature");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/ResolveComplaintRequest.xsd", "BORequestNature"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BORequestType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/ResolveComplaintRequest.xsd", "BORequestType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reason");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/ResolveComplaintRequest.xsd", "Reason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LMSFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/ResolveComplaintRequest.xsd", "LMSFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("action");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/ResolveComplaintRequest.xsd", "Action"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notificationMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/ResolveComplaintRequest.xsd", "NotificationMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SMSContent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/ResolveComplaintRequest.xsd", "SMSContent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/ResolveComplaintRequest.xsd", ">>>ResolveComplaintInUCMSRequest>DataHeader>SMSContent"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/ResolveComplaintRequest.xsd", "AdditionalInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/ResolveComplaintRequest.xsd", ">>>ResolveComplaintInUCMSRequest>DataHeader>AdditionalInfo"));
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
