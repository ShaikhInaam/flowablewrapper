/**
 * CreateComplaintRequestDataHeader.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.CreateComplaintRequest_xsd;

public class CreateComplaintRequestDataHeader  implements java.io.Serializable {
    private String transactionId;

    private String complaintDescription;

    private String requestDescription;

    private String preferredLanguage;

    private java.util.Date registeredDate;

    private java.util.Date problemOccuredDate;

    private String complaintNatureCode;

    private String complaintTypeCode;

    private String requestNatureCode;

    private String requestTypeCode;

    private String accountNumber;

    private String accountId;

    private Long partyID;

    private String channelCode;

    private String createdUserId;

    private Long subRequestNumber;

    private Long techanicalComplaintId;

    private String disputeAmount;

    private String issueType;

    private String sourceChannel;

    private String complaintPriority;

    private java.math.BigInteger technicianVisitRequired;

    private Boolean customerAdvisedForPossibleCharges;

    private Boolean chargeableVisitConfirmed;

    private CreateComplaintRequestDataHeaderAdjustmentDetails[] adjustmentDetails;

    private CreateComplaintRequestDataHeaderContactDetailsArray[] contactDetailsArray;

    private CreateComplaintRequestDataHeaderAttachmentDetailsArray[] attachmentDetailsArray;

    private CreateComplaintRequestDataHeaderElifeTechnicalDetails elifeTechnicalDetails;

    private CreateComplaintRequestDataHeaderAdditionalInfo[] additionalInfo;

    private Integer isTechnical;

    private String customerPriority;

    private String customerSegment;

    private String customerName;

    private String user;

    private String isFCR;

    private String targetDate;

    private String region;

    private String service;

    private String priorityFlag;

    private String requestType;

    public CreateComplaintRequestDataHeader() {
    }

    public CreateComplaintRequestDataHeader(
           String transactionId,
           String complaintDescription,
           String requestDescription,
           String preferredLanguage,
           java.util.Date registeredDate,
           java.util.Date problemOccuredDate,
           String complaintNatureCode,
           String complaintTypeCode,
           String requestNatureCode,
           String requestTypeCode,
           String accountNumber,
           String accountId,
           Long partyID,
           String channelCode,
           String createdUserId,
           Long subRequestNumber,
           Long techanicalComplaintId,
           String disputeAmount,
           String issueType,
           String sourceChannel,
           String complaintPriority,
           java.math.BigInteger technicianVisitRequired,
           Boolean customerAdvisedForPossibleCharges,
           Boolean chargeableVisitConfirmed,
           CreateComplaintRequestDataHeaderAdjustmentDetails[] adjustmentDetails,
           CreateComplaintRequestDataHeaderContactDetailsArray[] contactDetailsArray,
           CreateComplaintRequestDataHeaderAttachmentDetailsArray[] attachmentDetailsArray,
           CreateComplaintRequestDataHeaderElifeTechnicalDetails elifeTechnicalDetails,
           CreateComplaintRequestDataHeaderAdditionalInfo[] additionalInfo,
           Integer isTechnical,
           String customerPriority,
           String customerSegment,
           String customerName,
           String user,
           String isFCR,
           String targetDate,
           String region,
           String service,
           String priorityFlag,
           String requestType) {
           this.transactionId = transactionId;
           this.complaintDescription = complaintDescription;
           this.requestDescription = requestDescription;
           this.preferredLanguage = preferredLanguage;
           this.registeredDate = registeredDate;
           this.problemOccuredDate = problemOccuredDate;
           this.complaintNatureCode = complaintNatureCode;
           this.complaintTypeCode = complaintTypeCode;
           this.requestNatureCode = requestNatureCode;
           this.requestTypeCode = requestTypeCode;
           this.accountNumber = accountNumber;
           this.accountId = accountId;
           this.partyID = partyID;
           this.channelCode = channelCode;
           this.createdUserId = createdUserId;
           this.subRequestNumber = subRequestNumber;
           this.techanicalComplaintId = techanicalComplaintId;
           this.disputeAmount = disputeAmount;
           this.issueType = issueType;
           this.sourceChannel = sourceChannel;
           this.complaintPriority = complaintPriority;
           this.technicianVisitRequired = technicianVisitRequired;
           this.customerAdvisedForPossibleCharges = customerAdvisedForPossibleCharges;
           this.chargeableVisitConfirmed = chargeableVisitConfirmed;
           this.adjustmentDetails = adjustmentDetails;
           this.contactDetailsArray = contactDetailsArray;
           this.attachmentDetailsArray = attachmentDetailsArray;
           this.elifeTechnicalDetails = elifeTechnicalDetails;
           this.additionalInfo = additionalInfo;
           this.isTechnical = isTechnical;
           this.customerPriority = customerPriority;
           this.customerSegment = customerSegment;
           this.customerName = customerName;
           this.user = user;
           this.isFCR = isFCR;
           this.targetDate = targetDate;
           this.region = region;
           this.service = service;
           this.priorityFlag = priorityFlag;
           this.requestType = requestType;
    }


    /**
     * Gets the transactionId value for this CreateComplaintRequestDataHeader.
     * 
     * @return transactionId
     */
    public String getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this CreateComplaintRequestDataHeader.
     * 
     * @param transactionId
     */
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }


    /**
     * Gets the complaintDescription value for this CreateComplaintRequestDataHeader.
     * 
     * @return complaintDescription
     */
    public String getComplaintDescription() {
        return complaintDescription;
    }


    /**
     * Sets the complaintDescription value for this CreateComplaintRequestDataHeader.
     * 
     * @param complaintDescription
     */
    public void setComplaintDescription(String complaintDescription) {
        this.complaintDescription = complaintDescription;
    }


    /**
     * Gets the requestDescription value for this CreateComplaintRequestDataHeader.
     * 
     * @return requestDescription
     */
    public String getRequestDescription() {
        return requestDescription;
    }


    /**
     * Sets the requestDescription value for this CreateComplaintRequestDataHeader.
     * 
     * @param requestDescription
     */
    public void setRequestDescription(String requestDescription) {
        this.requestDescription = requestDescription;
    }


    /**
     * Gets the preferredLanguage value for this CreateComplaintRequestDataHeader.
     * 
     * @return preferredLanguage
     */
    public String getPreferredLanguage() {
        return preferredLanguage;
    }


    /**
     * Sets the preferredLanguage value for this CreateComplaintRequestDataHeader.
     * 
     * @param preferredLanguage
     */
    public void setPreferredLanguage(String preferredLanguage) {
        this.preferredLanguage = preferredLanguage;
    }


    /**
     * Gets the registeredDate value for this CreateComplaintRequestDataHeader.
     * 
     * @return registeredDate
     */
    public java.util.Date getRegisteredDate() {
        return registeredDate;
    }


    /**
     * Sets the registeredDate value for this CreateComplaintRequestDataHeader.
     * 
     * @param registeredDate
     */
    public void setRegisteredDate(java.util.Date registeredDate) {
        this.registeredDate = registeredDate;
    }


    /**
     * Gets the problemOccuredDate value for this CreateComplaintRequestDataHeader.
     * 
     * @return problemOccuredDate
     */
    public java.util.Date getProblemOccuredDate() {
        return problemOccuredDate;
    }


    /**
     * Sets the problemOccuredDate value for this CreateComplaintRequestDataHeader.
     * 
     * @param problemOccuredDate
     */
    public void setProblemOccuredDate(java.util.Date problemOccuredDate) {
        this.problemOccuredDate = problemOccuredDate;
    }


    /**
     * Gets the complaintNatureCode value for this CreateComplaintRequestDataHeader.
     * 
     * @return complaintNatureCode
     */
    public String getComplaintNatureCode() {
        return complaintNatureCode;
    }


    /**
     * Sets the complaintNatureCode value for this CreateComplaintRequestDataHeader.
     * 
     * @param complaintNatureCode
     */
    public void setComplaintNatureCode(String complaintNatureCode) {
        this.complaintNatureCode = complaintNatureCode;
    }


    /**
     * Gets the complaintTypeCode value for this CreateComplaintRequestDataHeader.
     * 
     * @return complaintTypeCode
     */
    public String getComplaintTypeCode() {
        return complaintTypeCode;
    }


    /**
     * Sets the complaintTypeCode value for this CreateComplaintRequestDataHeader.
     * 
     * @param complaintTypeCode
     */
    public void setComplaintTypeCode(String complaintTypeCode) {
        this.complaintTypeCode = complaintTypeCode;
    }


    /**
     * Gets the requestNatureCode value for this CreateComplaintRequestDataHeader.
     * 
     * @return requestNatureCode
     */
    public String getRequestNatureCode() {
        return requestNatureCode;
    }


    /**
     * Sets the requestNatureCode value for this CreateComplaintRequestDataHeader.
     * 
     * @param requestNatureCode
     */
    public void setRequestNatureCode(String requestNatureCode) {
        this.requestNatureCode = requestNatureCode;
    }


    /**
     * Gets the requestTypeCode value for this CreateComplaintRequestDataHeader.
     * 
     * @return requestTypeCode
     */
    public String getRequestTypeCode() {
        return requestTypeCode;
    }


    /**
     * Sets the requestTypeCode value for this CreateComplaintRequestDataHeader.
     * 
     * @param requestTypeCode
     */
    public void setRequestTypeCode(String requestTypeCode) {
        this.requestTypeCode = requestTypeCode;
    }


    /**
     * Gets the accountNumber value for this CreateComplaintRequestDataHeader.
     * 
     * @return accountNumber
     */
    public String getAccountNumber() {
        return accountNumber;
    }


    /**
     * Sets the accountNumber value for this CreateComplaintRequestDataHeader.
     * 
     * @param accountNumber
     */
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }


    /**
     * Gets the accountId value for this CreateComplaintRequestDataHeader.
     * 
     * @return accountId
     */
    public String getAccountId() {
        return accountId;
    }


    /**
     * Sets the accountId value for this CreateComplaintRequestDataHeader.
     * 
     * @param accountId
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }


    /**
     * Gets the partyID value for this CreateComplaintRequestDataHeader.
     * 
     * @return partyID
     */
    public Long getPartyID() {
        return partyID;
    }


    /**
     * Sets the partyID value for this CreateComplaintRequestDataHeader.
     * 
     * @param partyID
     */
    public void setPartyID(Long partyID) {
        this.partyID = partyID;
    }


    /**
     * Gets the channelCode value for this CreateComplaintRequestDataHeader.
     * 
     * @return channelCode
     */
    public String getChannelCode() {
        return channelCode;
    }


    /**
     * Sets the channelCode value for this CreateComplaintRequestDataHeader.
     * 
     * @param channelCode
     */
    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode;
    }


    /**
     * Gets the createdUserId value for this CreateComplaintRequestDataHeader.
     * 
     * @return createdUserId
     */
    public String getCreatedUserId() {
        return createdUserId;
    }


    /**
     * Sets the createdUserId value for this CreateComplaintRequestDataHeader.
     * 
     * @param createdUserId
     */
    public void setCreatedUserId(String createdUserId) {
        this.createdUserId = createdUserId;
    }


    /**
     * Gets the subRequestNumber value for this CreateComplaintRequestDataHeader.
     * 
     * @return subRequestNumber
     */
    public Long getSubRequestNumber() {
        return subRequestNumber;
    }


    /**
     * Sets the subRequestNumber value for this CreateComplaintRequestDataHeader.
     * 
     * @param subRequestNumber
     */
    public void setSubRequestNumber(Long subRequestNumber) {
        this.subRequestNumber = subRequestNumber;
    }


    /**
     * Gets the techanicalComplaintId value for this CreateComplaintRequestDataHeader.
     * 
     * @return techanicalComplaintId
     */
    public Long getTechanicalComplaintId() {
        return techanicalComplaintId;
    }


    /**
     * Sets the techanicalComplaintId value for this CreateComplaintRequestDataHeader.
     * 
     * @param techanicalComplaintId
     */
    public void setTechanicalComplaintId(Long techanicalComplaintId) {
        this.techanicalComplaintId = techanicalComplaintId;
    }


    /**
     * Gets the disputeAmount value for this CreateComplaintRequestDataHeader.
     * 
     * @return disputeAmount
     */
    public String getDisputeAmount() {
        return disputeAmount;
    }


    /**
     * Sets the disputeAmount value for this CreateComplaintRequestDataHeader.
     * 
     * @param disputeAmount
     */
    public void setDisputeAmount(String disputeAmount) {
        this.disputeAmount = disputeAmount;
    }


    /**
     * Gets the issueType value for this CreateComplaintRequestDataHeader.
     * 
     * @return issueType
     */
    public String getIssueType() {
        return issueType;
    }


    /**
     * Sets the issueType value for this CreateComplaintRequestDataHeader.
     * 
     * @param issueType
     */
    public void setIssueType(String issueType) {
        this.issueType = issueType;
    }


    /**
     * Gets the sourceChannel value for this CreateComplaintRequestDataHeader.
     * 
     * @return sourceChannel
     */
    public String getSourceChannel() {
        return sourceChannel;
    }


    /**
     * Sets the sourceChannel value for this CreateComplaintRequestDataHeader.
     * 
     * @param sourceChannel
     */
    public void setSourceChannel(String sourceChannel) {
        this.sourceChannel = sourceChannel;
    }


    /**
     * Gets the complaintPriority value for this CreateComplaintRequestDataHeader.
     * 
     * @return complaintPriority
     */
    public String getComplaintPriority() {
        return complaintPriority;
    }


    /**
     * Sets the complaintPriority value for this CreateComplaintRequestDataHeader.
     * 
     * @param complaintPriority
     */
    public void setComplaintPriority(String complaintPriority) {
        this.complaintPriority = complaintPriority;
    }


    /**
     * Gets the technicianVisitRequired value for this CreateComplaintRequestDataHeader.
     * 
     * @return technicianVisitRequired
     */
    public java.math.BigInteger getTechnicianVisitRequired() {
        return technicianVisitRequired;
    }


    /**
     * Sets the technicianVisitRequired value for this CreateComplaintRequestDataHeader.
     * 
     * @param technicianVisitRequired
     */
    public void setTechnicianVisitRequired(java.math.BigInteger technicianVisitRequired) {
        this.technicianVisitRequired = technicianVisitRequired;
    }


    /**
     * Gets the customerAdvisedForPossibleCharges value for this CreateComplaintRequestDataHeader.
     * 
     * @return customerAdvisedForPossibleCharges
     */
    public Boolean getCustomerAdvisedForPossibleCharges() {
        return customerAdvisedForPossibleCharges;
    }


    /**
     * Sets the customerAdvisedForPossibleCharges value for this CreateComplaintRequestDataHeader.
     * 
     * @param customerAdvisedForPossibleCharges
     */
    public void setCustomerAdvisedForPossibleCharges(Boolean customerAdvisedForPossibleCharges) {
        this.customerAdvisedForPossibleCharges = customerAdvisedForPossibleCharges;
    }


    /**
     * Gets the chargeableVisitConfirmed value for this CreateComplaintRequestDataHeader.
     * 
     * @return chargeableVisitConfirmed
     */
    public Boolean getChargeableVisitConfirmed() {
        return chargeableVisitConfirmed;
    }


    /**
     * Sets the chargeableVisitConfirmed value for this CreateComplaintRequestDataHeader.
     * 
     * @param chargeableVisitConfirmed
     */
    public void setChargeableVisitConfirmed(Boolean chargeableVisitConfirmed) {
        this.chargeableVisitConfirmed = chargeableVisitConfirmed;
    }


    /**
     * Gets the adjustmentDetails value for this CreateComplaintRequestDataHeader.
     * 
     * @return adjustmentDetails
     */
    public CreateComplaintRequestDataHeaderAdjustmentDetails[] getAdjustmentDetails() {
        return adjustmentDetails;
    }


    /**
     * Sets the adjustmentDetails value for this CreateComplaintRequestDataHeader.
     * 
     * @param adjustmentDetails
     */
    public void setAdjustmentDetails(CreateComplaintRequestDataHeaderAdjustmentDetails[] adjustmentDetails) {
        this.adjustmentDetails = adjustmentDetails;
    }

    public CreateComplaintRequestDataHeaderAdjustmentDetails getAdjustmentDetails(int i) {
        return this.adjustmentDetails[i];
    }

    public void setAdjustmentDetails(int i, CreateComplaintRequestDataHeaderAdjustmentDetails _value) {
        this.adjustmentDetails[i] = _value;
    }


    /**
     * Gets the contactDetailsArray value for this CreateComplaintRequestDataHeader.
     * 
     * @return contactDetailsArray
     */
    public CreateComplaintRequestDataHeaderContactDetailsArray[] getContactDetailsArray() {
        return contactDetailsArray;
    }


    /**
     * Sets the contactDetailsArray value for this CreateComplaintRequestDataHeader.
     * 
     * @param contactDetailsArray
     */
    public void setContactDetailsArray(CreateComplaintRequestDataHeaderContactDetailsArray[] contactDetailsArray) {
        this.contactDetailsArray = contactDetailsArray;
    }

    public CreateComplaintRequestDataHeaderContactDetailsArray getContactDetailsArray(int i) {
        return this.contactDetailsArray[i];
    }

    public void setContactDetailsArray(int i, CreateComplaintRequestDataHeaderContactDetailsArray _value) {
        this.contactDetailsArray[i] = _value;
    }


    /**
     * Gets the attachmentDetailsArray value for this CreateComplaintRequestDataHeader.
     * 
     * @return attachmentDetailsArray
     */
    public CreateComplaintRequestDataHeaderAttachmentDetailsArray[] getAttachmentDetailsArray() {
        return attachmentDetailsArray;
    }


    /**
     * Sets the attachmentDetailsArray value for this CreateComplaintRequestDataHeader.
     * 
     * @param attachmentDetailsArray
     */
    public void setAttachmentDetailsArray(CreateComplaintRequestDataHeaderAttachmentDetailsArray[] attachmentDetailsArray) {
        this.attachmentDetailsArray = attachmentDetailsArray;
    }

    public CreateComplaintRequestDataHeaderAttachmentDetailsArray getAttachmentDetailsArray(int i) {
        return this.attachmentDetailsArray[i];
    }

    public void setAttachmentDetailsArray(int i, CreateComplaintRequestDataHeaderAttachmentDetailsArray _value) {
        this.attachmentDetailsArray[i] = _value;
    }


    /**
     * Gets the elifeTechnicalDetails value for this CreateComplaintRequestDataHeader.
     * 
     * @return elifeTechnicalDetails
     */
    public CreateComplaintRequestDataHeaderElifeTechnicalDetails getElifeTechnicalDetails() {
        return elifeTechnicalDetails;
    }


    /**
     * Sets the elifeTechnicalDetails value for this CreateComplaintRequestDataHeader.
     * 
     * @param elifeTechnicalDetails
     */
    public void setElifeTechnicalDetails(CreateComplaintRequestDataHeaderElifeTechnicalDetails elifeTechnicalDetails) {
        this.elifeTechnicalDetails = elifeTechnicalDetails;
    }


    /**
     * Gets the additionalInfo value for this CreateComplaintRequestDataHeader.
     * 
     * @return additionalInfo
     */
    public CreateComplaintRequestDataHeaderAdditionalInfo[] getAdditionalInfo() {
        return additionalInfo;
    }


    /**
     * Sets the additionalInfo value for this CreateComplaintRequestDataHeader.
     * 
     * @param additionalInfo
     */
    public void setAdditionalInfo(CreateComplaintRequestDataHeaderAdditionalInfo[] additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public CreateComplaintRequestDataHeaderAdditionalInfo getAdditionalInfo(int i) {
        return this.additionalInfo[i];
    }

    public void setAdditionalInfo(int i, CreateComplaintRequestDataHeaderAdditionalInfo _value) {
        this.additionalInfo[i] = _value;
    }


    /**
     * Gets the isTechnical value for this CreateComplaintRequestDataHeader.
     * 
     * @return isTechnical
     */
    public Integer getIsTechnical() {
        return isTechnical;
    }


    /**
     * Sets the isTechnical value for this CreateComplaintRequestDataHeader.
     * 
     * @param isTechnical
     */
    public void setIsTechnical(Integer isTechnical) {
        this.isTechnical = isTechnical;
    }


    /**
     * Gets the customerPriority value for this CreateComplaintRequestDataHeader.
     * 
     * @return customerPriority
     */
    public String getCustomerPriority() {
        return customerPriority;
    }


    /**
     * Sets the customerPriority value for this CreateComplaintRequestDataHeader.
     * 
     * @param customerPriority
     */
    public void setCustomerPriority(String customerPriority) {
        this.customerPriority = customerPriority;
    }


    /**
     * Gets the customerSegment value for this CreateComplaintRequestDataHeader.
     * 
     * @return customerSegment
     */
    public String getCustomerSegment() {
        return customerSegment;
    }


    /**
     * Sets the customerSegment value for this CreateComplaintRequestDataHeader.
     * 
     * @param customerSegment
     */
    public void setCustomerSegment(String customerSegment) {
        this.customerSegment = customerSegment;
    }


    /**
     * Gets the customerName value for this CreateComplaintRequestDataHeader.
     * 
     * @return customerName
     */
    public String getCustomerName() {
        return customerName;
    }


    /**
     * Sets the customerName value for this CreateComplaintRequestDataHeader.
     * 
     * @param customerName
     */
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }


    /**
     * Gets the user value for this CreateComplaintRequestDataHeader.
     * 
     * @return user
     */
    public String getUser() {
        return user;
    }


    /**
     * Sets the user value for this CreateComplaintRequestDataHeader.
     * 
     * @param user
     */
    public void setUser(String user) {
        this.user = user;
    }


    /**
     * Gets the isFCR value for this CreateComplaintRequestDataHeader.
     * 
     * @return isFCR
     */
    public String getIsFCR() {
        return isFCR;
    }


    /**
     * Sets the isFCR value for this CreateComplaintRequestDataHeader.
     * 
     * @param isFCR
     */
    public void setIsFCR(String isFCR) {
        this.isFCR = isFCR;
    }


    /**
     * Gets the targetDate value for this CreateComplaintRequestDataHeader.
     * 
     * @return targetDate
     */
    public String getTargetDate() {
        return targetDate;
    }


    /**
     * Sets the targetDate value for this CreateComplaintRequestDataHeader.
     * 
     * @param targetDate
     */
    public void setTargetDate(String targetDate) {
        this.targetDate = targetDate;
    }


    /**
     * Gets the region value for this CreateComplaintRequestDataHeader.
     * 
     * @return region
     */
    public String getRegion() {
        return region;
    }


    /**
     * Sets the region value for this CreateComplaintRequestDataHeader.
     * 
     * @param region
     */
    public void setRegion(String region) {
        this.region = region;
    }


    /**
     * Gets the service value for this CreateComplaintRequestDataHeader.
     * 
     * @return service
     */
    public String getService() {
        return service;
    }


    /**
     * Sets the service value for this CreateComplaintRequestDataHeader.
     * 
     * @param service
     */
    public void setService(String service) {
        this.service = service;
    }


    /**
     * Gets the priorityFlag value for this CreateComplaintRequestDataHeader.
     * 
     * @return priorityFlag
     */
    public String getPriorityFlag() {
        return priorityFlag;
    }


    /**
     * Sets the priorityFlag value for this CreateComplaintRequestDataHeader.
     * 
     * @param priorityFlag
     */
    public void setPriorityFlag(String priorityFlag) {
        this.priorityFlag = priorityFlag;
    }


    /**
     * Gets the requestType value for this CreateComplaintRequestDataHeader.
     * 
     * @return requestType
     */
    public String getRequestType() {
        return requestType;
    }


    /**
     * Sets the requestType value for this CreateComplaintRequestDataHeader.
     * 
     * @param requestType
     */
    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CreateComplaintRequestDataHeader)) return false;
        CreateComplaintRequestDataHeader other = (CreateComplaintRequestDataHeader) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.transactionId==null && other.getTransactionId()==null) || 
             (this.transactionId!=null &&
              this.transactionId.equals(other.getTransactionId()))) &&
            ((this.complaintDescription==null && other.getComplaintDescription()==null) || 
             (this.complaintDescription!=null &&
              this.complaintDescription.equals(other.getComplaintDescription()))) &&
            ((this.requestDescription==null && other.getRequestDescription()==null) || 
             (this.requestDescription!=null &&
              this.requestDescription.equals(other.getRequestDescription()))) &&
            ((this.preferredLanguage==null && other.getPreferredLanguage()==null) || 
             (this.preferredLanguage!=null &&
              this.preferredLanguage.equals(other.getPreferredLanguage()))) &&
            ((this.registeredDate==null && other.getRegisteredDate()==null) || 
             (this.registeredDate!=null &&
              this.registeredDate.equals(other.getRegisteredDate()))) &&
            ((this.problemOccuredDate==null && other.getProblemOccuredDate()==null) || 
             (this.problemOccuredDate!=null &&
              this.problemOccuredDate.equals(other.getProblemOccuredDate()))) &&
            ((this.complaintNatureCode==null && other.getComplaintNatureCode()==null) || 
             (this.complaintNatureCode!=null &&
              this.complaintNatureCode.equals(other.getComplaintNatureCode()))) &&
            ((this.complaintTypeCode==null && other.getComplaintTypeCode()==null) || 
             (this.complaintTypeCode!=null &&
              this.complaintTypeCode.equals(other.getComplaintTypeCode()))) &&
            ((this.requestNatureCode==null && other.getRequestNatureCode()==null) || 
             (this.requestNatureCode!=null &&
              this.requestNatureCode.equals(other.getRequestNatureCode()))) &&
            ((this.requestTypeCode==null && other.getRequestTypeCode()==null) || 
             (this.requestTypeCode!=null &&
              this.requestTypeCode.equals(other.getRequestTypeCode()))) &&
            ((this.accountNumber==null && other.getAccountNumber()==null) || 
             (this.accountNumber!=null &&
              this.accountNumber.equals(other.getAccountNumber()))) &&
            ((this.accountId==null && other.getAccountId()==null) || 
             (this.accountId!=null &&
              this.accountId.equals(other.getAccountId()))) &&
            ((this.partyID==null && other.getPartyID()==null) || 
             (this.partyID!=null &&
              this.partyID.equals(other.getPartyID()))) &&
            ((this.channelCode==null && other.getChannelCode()==null) || 
             (this.channelCode!=null &&
              this.channelCode.equals(other.getChannelCode()))) &&
            ((this.createdUserId==null && other.getCreatedUserId()==null) || 
             (this.createdUserId!=null &&
              this.createdUserId.equals(other.getCreatedUserId()))) &&
            ((this.subRequestNumber==null && other.getSubRequestNumber()==null) || 
             (this.subRequestNumber!=null &&
              this.subRequestNumber.equals(other.getSubRequestNumber()))) &&
            ((this.techanicalComplaintId==null && other.getTechanicalComplaintId()==null) || 
             (this.techanicalComplaintId!=null &&
              this.techanicalComplaintId.equals(other.getTechanicalComplaintId()))) &&
            ((this.disputeAmount==null && other.getDisputeAmount()==null) || 
             (this.disputeAmount!=null &&
              this.disputeAmount.equals(other.getDisputeAmount()))) &&
            ((this.issueType==null && other.getIssueType()==null) || 
             (this.issueType!=null &&
              this.issueType.equals(other.getIssueType()))) &&
            ((this.sourceChannel==null && other.getSourceChannel()==null) || 
             (this.sourceChannel!=null &&
              this.sourceChannel.equals(other.getSourceChannel()))) &&
            ((this.complaintPriority==null && other.getComplaintPriority()==null) || 
             (this.complaintPriority!=null &&
              this.complaintPriority.equals(other.getComplaintPriority()))) &&
            ((this.technicianVisitRequired==null && other.getTechnicianVisitRequired()==null) || 
             (this.technicianVisitRequired!=null &&
              this.technicianVisitRequired.equals(other.getTechnicianVisitRequired()))) &&
            ((this.customerAdvisedForPossibleCharges==null && other.getCustomerAdvisedForPossibleCharges()==null) || 
             (this.customerAdvisedForPossibleCharges!=null &&
              this.customerAdvisedForPossibleCharges.equals(other.getCustomerAdvisedForPossibleCharges()))) &&
            ((this.chargeableVisitConfirmed==null && other.getChargeableVisitConfirmed()==null) || 
             (this.chargeableVisitConfirmed!=null &&
              this.chargeableVisitConfirmed.equals(other.getChargeableVisitConfirmed()))) &&
            ((this.adjustmentDetails==null && other.getAdjustmentDetails()==null) || 
             (this.adjustmentDetails!=null &&
              java.util.Arrays.equals(this.adjustmentDetails, other.getAdjustmentDetails()))) &&
            ((this.contactDetailsArray==null && other.getContactDetailsArray()==null) || 
             (this.contactDetailsArray!=null &&
              java.util.Arrays.equals(this.contactDetailsArray, other.getContactDetailsArray()))) &&
            ((this.attachmentDetailsArray==null && other.getAttachmentDetailsArray()==null) || 
             (this.attachmentDetailsArray!=null &&
              java.util.Arrays.equals(this.attachmentDetailsArray, other.getAttachmentDetailsArray()))) &&
            ((this.elifeTechnicalDetails==null && other.getElifeTechnicalDetails()==null) || 
             (this.elifeTechnicalDetails!=null &&
              this.elifeTechnicalDetails.equals(other.getElifeTechnicalDetails()))) &&
            ((this.additionalInfo==null && other.getAdditionalInfo()==null) || 
             (this.additionalInfo!=null &&
              java.util.Arrays.equals(this.additionalInfo, other.getAdditionalInfo()))) &&
            ((this.isTechnical==null && other.getIsTechnical()==null) || 
             (this.isTechnical!=null &&
              this.isTechnical.equals(other.getIsTechnical()))) &&
            ((this.customerPriority==null && other.getCustomerPriority()==null) || 
             (this.customerPriority!=null &&
              this.customerPriority.equals(other.getCustomerPriority()))) &&
            ((this.customerSegment==null && other.getCustomerSegment()==null) || 
             (this.customerSegment!=null &&
              this.customerSegment.equals(other.getCustomerSegment()))) &&
            ((this.customerName==null && other.getCustomerName()==null) || 
             (this.customerName!=null &&
              this.customerName.equals(other.getCustomerName()))) &&
            ((this.user==null && other.getUser()==null) || 
             (this.user!=null &&
              this.user.equals(other.getUser()))) &&
            ((this.isFCR==null && other.getIsFCR()==null) || 
             (this.isFCR!=null &&
              this.isFCR.equals(other.getIsFCR()))) &&
            ((this.targetDate==null && other.getTargetDate()==null) || 
             (this.targetDate!=null &&
              this.targetDate.equals(other.getTargetDate()))) &&
            ((this.region==null && other.getRegion()==null) || 
             (this.region!=null &&
              this.region.equals(other.getRegion()))) &&
            ((this.service==null && other.getService()==null) || 
             (this.service!=null &&
              this.service.equals(other.getService()))) &&
            ((this.priorityFlag==null && other.getPriorityFlag()==null) || 
             (this.priorityFlag!=null &&
              this.priorityFlag.equals(other.getPriorityFlag()))) &&
            ((this.requestType==null && other.getRequestType()==null) || 
             (this.requestType!=null &&
              this.requestType.equals(other.getRequestType())));
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
        if (getTransactionId() != null) {
            _hashCode += getTransactionId().hashCode();
        }
        if (getComplaintDescription() != null) {
            _hashCode += getComplaintDescription().hashCode();
        }
        if (getRequestDescription() != null) {
            _hashCode += getRequestDescription().hashCode();
        }
        if (getPreferredLanguage() != null) {
            _hashCode += getPreferredLanguage().hashCode();
        }
        if (getRegisteredDate() != null) {
            _hashCode += getRegisteredDate().hashCode();
        }
        if (getProblemOccuredDate() != null) {
            _hashCode += getProblemOccuredDate().hashCode();
        }
        if (getComplaintNatureCode() != null) {
            _hashCode += getComplaintNatureCode().hashCode();
        }
        if (getComplaintTypeCode() != null) {
            _hashCode += getComplaintTypeCode().hashCode();
        }
        if (getRequestNatureCode() != null) {
            _hashCode += getRequestNatureCode().hashCode();
        }
        if (getRequestTypeCode() != null) {
            _hashCode += getRequestTypeCode().hashCode();
        }
        if (getAccountNumber() != null) {
            _hashCode += getAccountNumber().hashCode();
        }
        if (getAccountId() != null) {
            _hashCode += getAccountId().hashCode();
        }
        if (getPartyID() != null) {
            _hashCode += getPartyID().hashCode();
        }
        if (getChannelCode() != null) {
            _hashCode += getChannelCode().hashCode();
        }
        if (getCreatedUserId() != null) {
            _hashCode += getCreatedUserId().hashCode();
        }
        if (getSubRequestNumber() != null) {
            _hashCode += getSubRequestNumber().hashCode();
        }
        if (getTechanicalComplaintId() != null) {
            _hashCode += getTechanicalComplaintId().hashCode();
        }
        if (getDisputeAmount() != null) {
            _hashCode += getDisputeAmount().hashCode();
        }
        if (getIssueType() != null) {
            _hashCode += getIssueType().hashCode();
        }
        if (getSourceChannel() != null) {
            _hashCode += getSourceChannel().hashCode();
        }
        if (getComplaintPriority() != null) {
            _hashCode += getComplaintPriority().hashCode();
        }
        if (getTechnicianVisitRequired() != null) {
            _hashCode += getTechnicianVisitRequired().hashCode();
        }
        if (getCustomerAdvisedForPossibleCharges() != null) {
            _hashCode += getCustomerAdvisedForPossibleCharges().hashCode();
        }
        if (getChargeableVisitConfirmed() != null) {
            _hashCode += getChargeableVisitConfirmed().hashCode();
        }
        if (getAdjustmentDetails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAdjustmentDetails());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getAdjustmentDetails(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getContactDetailsArray() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getContactDetailsArray());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getContactDetailsArray(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAttachmentDetailsArray() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAttachmentDetailsArray());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getAttachmentDetailsArray(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getElifeTechnicalDetails() != null) {
            _hashCode += getElifeTechnicalDetails().hashCode();
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
        if (getIsTechnical() != null) {
            _hashCode += getIsTechnical().hashCode();
        }
        if (getCustomerPriority() != null) {
            _hashCode += getCustomerPriority().hashCode();
        }
        if (getCustomerSegment() != null) {
            _hashCode += getCustomerSegment().hashCode();
        }
        if (getCustomerName() != null) {
            _hashCode += getCustomerName().hashCode();
        }
        if (getUser() != null) {
            _hashCode += getUser().hashCode();
        }
        if (getIsFCR() != null) {
            _hashCode += getIsFCR().hashCode();
        }
        if (getTargetDate() != null) {
            _hashCode += getTargetDate().hashCode();
        }
        if (getRegion() != null) {
            _hashCode += getRegion().hashCode();
        }
        if (getService() != null) {
            _hashCode += getService().hashCode();
        }
        if (getPriorityFlag() != null) {
            _hashCode += getPriorityFlag().hashCode();
        }
        if (getRequestType() != null) {
            _hashCode += getRequestType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateComplaintRequestDataHeader.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/CreateComplaintRequest.xsd", ">>CreateComplaintRequest>DataHeader"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/CreateComplaintRequest.xsd", "TransactionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("complaintDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/CreateComplaintRequest.xsd", "ComplaintDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/CreateComplaintRequest.xsd", "RequestDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preferredLanguage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/CreateComplaintRequest.xsd", "PreferredLanguage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registeredDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/CreateComplaintRequest.xsd", "RegisteredDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("problemOccuredDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/CreateComplaintRequest.xsd", "ProblemOccuredDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("complaintNatureCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/CreateComplaintRequest.xsd", "ComplaintNatureCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("complaintTypeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/CreateComplaintRequest.xsd", "ComplaintTypeCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestNatureCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/CreateComplaintRequest.xsd", "RequestNatureCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestTypeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/CreateComplaintRequest.xsd", "RequestTypeCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/CreateComplaintRequest.xsd", "AccountNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/CreateComplaintRequest.xsd", "AccountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partyID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/CreateComplaintRequest.xsd", "PartyID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("channelCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/CreateComplaintRequest.xsd", "ChannelCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdUserId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/CreateComplaintRequest.xsd", "CreatedUserId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subRequestNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/CreateComplaintRequest.xsd", "SubRequestNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("techanicalComplaintId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/CreateComplaintRequest.xsd", "TechanicalComplaintId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disputeAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/CreateComplaintRequest.xsd", "DisputeAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issueType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/CreateComplaintRequest.xsd", "IssueType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceChannel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/CreateComplaintRequest.xsd", "SourceChannel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("complaintPriority");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/CreateComplaintRequest.xsd", "ComplaintPriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("technicianVisitRequired");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/CreateComplaintRequest.xsd", "TechnicianVisitRequired"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerAdvisedForPossibleCharges");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/CreateComplaintRequest.xsd", "CustomerAdvisedForPossibleCharges"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargeableVisitConfirmed");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/CreateComplaintRequest.xsd", "ChargeableVisitConfirmed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adjustmentDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/CreateComplaintRequest.xsd", "AdjustmentDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/CreateComplaintRequest.xsd", ">>>CreateComplaintRequest>DataHeader>AdjustmentDetails"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactDetailsArray");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/CreateComplaintRequest.xsd", "ContactDetailsArray"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/CreateComplaintRequest.xsd", ">>>CreateComplaintRequest>DataHeader>ContactDetailsArray"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attachmentDetailsArray");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/CreateComplaintRequest.xsd", "AttachmentDetailsArray"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/CreateComplaintRequest.xsd", ">>>CreateComplaintRequest>DataHeader>AttachmentDetailsArray"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("elifeTechnicalDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/CreateComplaintRequest.xsd", "ElifeTechnicalDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/CreateComplaintRequest.xsd", ">>>CreateComplaintRequest>DataHeader>ElifeTechnicalDetails"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/CreateComplaintRequest.xsd", "AdditionalInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/CreateComplaintRequest.xsd", ">>>CreateComplaintRequest>DataHeader>AdditionalInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isTechnical");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/CreateComplaintRequest.xsd", "isTechnical"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerPriority");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/CreateComplaintRequest.xsd", "CustomerPriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerSegment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/CreateComplaintRequest.xsd", "CustomerSegment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/CreateComplaintRequest.xsd", "CustomerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("user");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/CreateComplaintRequest.xsd", "User"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isFCR");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/CreateComplaintRequest.xsd", "isFCR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/CreateComplaintRequest.xsd", "targetDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("region");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/CreateComplaintRequest.xsd", "region"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("service");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/CreateComplaintRequest.xsd", "service"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priorityFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/CreateComplaintRequest.xsd", "priorityFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/CreateComplaintRequest.xsd", "RequestType"));
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
