/**
 * UpdateComplaintInUCMSRequestDataHeader.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintDetailsInUCMSRequest_xsd;

public class UpdateComplaintInUCMSRequestDataHeader  implements java.io.Serializable {
    private String complaintId;

    private String UCMSID;

    private java.util.Calendar modifiedDate;

    private String modifiedBy;

    private String complaintRemark;

    private java.util.Calendar openTime;

    private String openedBy;

    private String urgency;

    private java.util.Calendar updatedTime;

    private java.util.Calendar closedDate;

    private String closedBy;

    private String company;

    private String closureCode;

    private String[] solution;

    private String ticketOwner;

    private String updatedBy;

    private String area;

    private String siteCategory;

    private String subarea;

    private String problemType;

    private String hasCustomerContacted;

    private String newUCMSComplaintID;

    private String systemType;

    private String networkType;

    private String networkTypeDesc;

    private String EIDNo;

    private String mainClearCode;

    private String auxClearCode;

    private String clearCode;

    private String suspendReason;

    private String parkingReason;

    private String handlingTime;

    private String chargeCode;

    private String reasonCode;

    private String adjustmentType;

    private String userOrgUnit;

    private String productType;

    private String serviceDescription;

    private String subReqType;

    private String IVRNumber;

    private ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintDetailsInUCMSRequest_xsd.UpdateComplaintInUCMSRequestDataHeaderCustomerContactList[] customerContactList;

    private ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintDetailsInUCMSRequest_xsd.UpdateComplaintInUCMSRequestDataHeaderAttachmentList[] attachmentList;

    private UpdateComplaintInUCMSRequestDataHeaderCustomerLocation[] customerLocation;

    private String disputeAmount;

    private String refundedAmount;

    private String refundApprover;

    private String complaintDescription;

    private String FEProductGroup;

    private String FEProductGroupDesc;

    private String product;

    private String productdesc;

    private String regionCode;

    private String region;

    private String subRegionCode;

    private String subRegion;

    private String location;

    private String emirate;

    private java.util.Calendar problemStartDate;

    private String complaintPriorityFlag;

    private String highSeverityFlag;

    private String channelCode;

    private String customerSegment;

    private String activityType;

    private String CRSPriority;

    private String customerfollowCounter;

    private String coverageEligibility;

    private String coverageLocation;

    private String valueSegment;

    private String wrongClassification;

    private String complaintNature;

    private String complaintNatureDesc;

    private String complaintType;

    private String complaintTypeDesc;

    private String complaintstatus;

    private java.util.Calendar createdDate;

    private String createdBy;

    private String complaintShortDescription;

    private String category;

    private String service;

    private String serviceDesc;

    private String customerCategoryid;

    private String customerCategory;

    private String partyName;

    private String priority;

    private String assignmentGroup;

    private String assigneeName;

    private String MTTId;

    private String channel;

    private String accountNumber;

    private String partyId;

    private String accountFullName;

    private String accountStatus;

    private String bulkComplaintFlag;

    private String bulkComplaintID;

    private String customerSegmentCode;

    private String preferredLanguage;

    private Boolean isTier2Required;

    private String bitStreamParameter;

    private String bitStreamFlag;

    private String[] wholeSaleProductLines;

    private String BSLinkID;

    private String wholeSaleCategory;

    private String wholeSaleSubCategory;

    private Integer BSRequestID;

    private Integer BSMessageID;

    private Integer duComplaintID;

    private String isTechnicalFlag;

    private Integer technicalComplaintID;

    private Boolean direct2CSTflag;

    private String subRequestNumber;

    private String internetUserId;

    private String internetSpeed;

    private java.util.Calendar accountInstallationDate;

    private String extentionNumber;

    private String networkmedium;

    private String complaintLevel;

    private String complaintLevelDesc;

    private String customerAdvisedofPossibleCharges;

    private String issueType;

    private String staffError;

    private String staffDept;

    private String staffPFID;

    private String miniBillSMSMobileNumber;

    private String EBillEmailID;

    private String customerSatisfied;

    private String customerFeedback;

    private String physicalOrgID;

    private Boolean sendSMSFlag;

    private ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintDetailsInUCMSRequest_xsd.UpdateComplaintInUCMSRequestDataHeaderServiceAuthAndEquipmentDetails[] serviceAuthAndEquipmentDetails;

    private UpdateComplaintInUCMSRequestDataHeaderGPONTestDetails[] GPONTestDetails;

    private ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintDetailsInUCMSRequest_xsd.UpdateComplaintInUCMSRequestDataHeaderPendingServiceOrderDetails[] pendingServiceOrderDetails;

    private UpdateComplaintInUCMSRequestDataHeaderPreviousComplaintHistory[] previousComplaintHistory;

    private ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintDetailsInUCMSRequest_xsd.UpdateComplaintInUCMSRequestDataHeaderPSTNAssurance[] PSTNAssurance;

    private UpdateComplaintInUCMSRequestDataHeaderElifeAndEVision[] elifeAndEVision;

    private UpdateComplaintInUCMSRequestDataHeaderLOCNETPMSDetails[] LOCNETPMSDetails;

    private UpdateComplaintInUCMSRequestDataHeaderDataProductsDetails[] dataProductsDetails;

    private ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintDetailsInUCMSRequest_xsd.UpdateComplaintInUCMSRequestDataHeaderBistreamFields[] bistreamFields;

    private ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintDetailsInUCMSRequest_xsd.UpdateComplaintInUCMSRequestDataHeaderSMSParameters SMSParameters;

    private java.util.Calendar unSuspendTime;

    private String chargingCode;

    private String DOPType;

    private String DOPRemark;

    private String DOPAmount;

    private String callRecordingID;

    private UpdateComplaintInUCMSRequestDataHeaderAdditionalInfo[] additionalInfo;

    public UpdateComplaintInUCMSRequestDataHeader() {
    }

    public UpdateComplaintInUCMSRequestDataHeader(
           String complaintId,
           String UCMSID,
           java.util.Calendar modifiedDate,
           String modifiedBy,
           String complaintRemark,
           java.util.Calendar openTime,
           String openedBy,
           String urgency,
           java.util.Calendar updatedTime,
           java.util.Calendar closedDate,
           String closedBy,
           String company,
           String closureCode,
           String[] solution,
           String ticketOwner,
           String updatedBy,
           String area,
           String siteCategory,
           String subarea,
           String problemType,
           String hasCustomerContacted,
           String newUCMSComplaintID,
           String systemType,
           String networkType,
           String networkTypeDesc,
           String EIDNo,
           String mainClearCode,
           String auxClearCode,
           String clearCode,
           String suspendReason,
           String parkingReason,
           String handlingTime,
           String chargeCode,
           String reasonCode,
           String adjustmentType,
           String userOrgUnit,
           String productType,
           String serviceDescription,
           String subReqType,
           String IVRNumber,
           ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintDetailsInUCMSRequest_xsd.UpdateComplaintInUCMSRequestDataHeaderCustomerContactList[] customerContactList,
           ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintDetailsInUCMSRequest_xsd.UpdateComplaintInUCMSRequestDataHeaderAttachmentList[] attachmentList,
           UpdateComplaintInUCMSRequestDataHeaderCustomerLocation[] customerLocation,
           String disputeAmount,
           String refundedAmount,
           String refundApprover,
           String complaintDescription,
           String FEProductGroup,
           String FEProductGroupDesc,
           String product,
           String productdesc,
           String regionCode,
           String region,
           String subRegionCode,
           String subRegion,
           String location,
           String emirate,
           java.util.Calendar problemStartDate,
           String complaintPriorityFlag,
           String highSeverityFlag,
           String channelCode,
           String customerSegment,
           String activityType,
           String CRSPriority,
           String customerfollowCounter,
           String coverageEligibility,
           String coverageLocation,
           String valueSegment,
           String wrongClassification,
           String complaintNature,
           String complaintNatureDesc,
           String complaintType,
           String complaintTypeDesc,
           String complaintstatus,
           java.util.Calendar createdDate,
           String createdBy,
           String complaintShortDescription,
           String category,
           String service,
           String serviceDesc,
           String customerCategoryid,
           String customerCategory,
           String partyName,
           String priority,
           String assignmentGroup,
           String assigneeName,
           String MTTId,
           String channel,
           String accountNumber,
           String partyId,
           String accountFullName,
           String accountStatus,
           String bulkComplaintFlag,
           String bulkComplaintID,
           String customerSegmentCode,
           String preferredLanguage,
           Boolean isTier2Required,
           String bitStreamParameter,
           String bitStreamFlag,
           String[] wholeSaleProductLines,
           String BSLinkID,
           String wholeSaleCategory,
           String wholeSaleSubCategory,
           Integer BSRequestID,
           Integer BSMessageID,
           Integer duComplaintID,
           String isTechnicalFlag,
           Integer technicalComplaintID,
           Boolean direct2CSTflag,
           String subRequestNumber,
           String internetUserId,
           String internetSpeed,
           java.util.Calendar accountInstallationDate,
           String extentionNumber,
           String networkmedium,
           String complaintLevel,
           String complaintLevelDesc,
           String customerAdvisedofPossibleCharges,
           String issueType,
           String staffError,
           String staffDept,
           String staffPFID,
           String miniBillSMSMobileNumber,
           String EBillEmailID,
           String customerSatisfied,
           String customerFeedback,
           String physicalOrgID,
           Boolean sendSMSFlag,
           ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintDetailsInUCMSRequest_xsd.UpdateComplaintInUCMSRequestDataHeaderServiceAuthAndEquipmentDetails[] serviceAuthAndEquipmentDetails,
           UpdateComplaintInUCMSRequestDataHeaderGPONTestDetails[] GPONTestDetails,
           ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintDetailsInUCMSRequest_xsd.UpdateComplaintInUCMSRequestDataHeaderPendingServiceOrderDetails[] pendingServiceOrderDetails,
           UpdateComplaintInUCMSRequestDataHeaderPreviousComplaintHistory[] previousComplaintHistory,
           ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintDetailsInUCMSRequest_xsd.UpdateComplaintInUCMSRequestDataHeaderPSTNAssurance[] PSTNAssurance,
           UpdateComplaintInUCMSRequestDataHeaderElifeAndEVision[] elifeAndEVision,
           UpdateComplaintInUCMSRequestDataHeaderLOCNETPMSDetails[] LOCNETPMSDetails,
           UpdateComplaintInUCMSRequestDataHeaderDataProductsDetails[] dataProductsDetails,
           ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintDetailsInUCMSRequest_xsd.UpdateComplaintInUCMSRequestDataHeaderBistreamFields[] bistreamFields,
           ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintDetailsInUCMSRequest_xsd.UpdateComplaintInUCMSRequestDataHeaderSMSParameters SMSParameters,
           java.util.Calendar unSuspendTime,
           String chargingCode,
           String DOPType,
           String DOPRemark,
           String DOPAmount,
           String callRecordingID,
           UpdateComplaintInUCMSRequestDataHeaderAdditionalInfo[] additionalInfo) {
           this.complaintId = complaintId;
           this.UCMSID = UCMSID;
           this.modifiedDate = modifiedDate;
           this.modifiedBy = modifiedBy;
           this.complaintRemark = complaintRemark;
           this.openTime = openTime;
           this.openedBy = openedBy;
           this.urgency = urgency;
           this.updatedTime = updatedTime;
           this.closedDate = closedDate;
           this.closedBy = closedBy;
           this.company = company;
           this.closureCode = closureCode;
           this.solution = solution;
           this.ticketOwner = ticketOwner;
           this.updatedBy = updatedBy;
           this.area = area;
           this.siteCategory = siteCategory;
           this.subarea = subarea;
           this.problemType = problemType;
           this.hasCustomerContacted = hasCustomerContacted;
           this.newUCMSComplaintID = newUCMSComplaintID;
           this.systemType = systemType;
           this.networkType = networkType;
           this.networkTypeDesc = networkTypeDesc;
           this.EIDNo = EIDNo;
           this.mainClearCode = mainClearCode;
           this.auxClearCode = auxClearCode;
           this.clearCode = clearCode;
           this.suspendReason = suspendReason;
           this.parkingReason = parkingReason;
           this.handlingTime = handlingTime;
           this.chargeCode = chargeCode;
           this.reasonCode = reasonCode;
           this.adjustmentType = adjustmentType;
           this.userOrgUnit = userOrgUnit;
           this.productType = productType;
           this.serviceDescription = serviceDescription;
           this.subReqType = subReqType;
           this.IVRNumber = IVRNumber;
           this.customerContactList = customerContactList;
           this.attachmentList = attachmentList;
           this.customerLocation = customerLocation;
           this.disputeAmount = disputeAmount;
           this.refundedAmount = refundedAmount;
           this.refundApprover = refundApprover;
           this.complaintDescription = complaintDescription;
           this.FEProductGroup = FEProductGroup;
           this.FEProductGroupDesc = FEProductGroupDesc;
           this.product = product;
           this.productdesc = productdesc;
           this.regionCode = regionCode;
           this.region = region;
           this.subRegionCode = subRegionCode;
           this.subRegion = subRegion;
           this.location = location;
           this.emirate = emirate;
           this.problemStartDate = problemStartDate;
           this.complaintPriorityFlag = complaintPriorityFlag;
           this.highSeverityFlag = highSeverityFlag;
           this.channelCode = channelCode;
           this.customerSegment = customerSegment;
           this.activityType = activityType;
           this.CRSPriority = CRSPriority;
           this.customerfollowCounter = customerfollowCounter;
           this.coverageEligibility = coverageEligibility;
           this.coverageLocation = coverageLocation;
           this.valueSegment = valueSegment;
           this.wrongClassification = wrongClassification;
           this.complaintNature = complaintNature;
           this.complaintNatureDesc = complaintNatureDesc;
           this.complaintType = complaintType;
           this.complaintTypeDesc = complaintTypeDesc;
           this.complaintstatus = complaintstatus;
           this.createdDate = createdDate;
           this.createdBy = createdBy;
           this.complaintShortDescription = complaintShortDescription;
           this.category = category;
           this.service = service;
           this.serviceDesc = serviceDesc;
           this.customerCategoryid = customerCategoryid;
           this.customerCategory = customerCategory;
           this.partyName = partyName;
           this.priority = priority;
           this.assignmentGroup = assignmentGroup;
           this.assigneeName = assigneeName;
           this.MTTId = MTTId;
           this.channel = channel;
           this.accountNumber = accountNumber;
           this.partyId = partyId;
           this.accountFullName = accountFullName;
           this.accountStatus = accountStatus;
           this.bulkComplaintFlag = bulkComplaintFlag;
           this.bulkComplaintID = bulkComplaintID;
           this.customerSegmentCode = customerSegmentCode;
           this.preferredLanguage = preferredLanguage;
           this.isTier2Required = isTier2Required;
           this.bitStreamParameter = bitStreamParameter;
           this.bitStreamFlag = bitStreamFlag;
           this.wholeSaleProductLines = wholeSaleProductLines;
           this.BSLinkID = BSLinkID;
           this.wholeSaleCategory = wholeSaleCategory;
           this.wholeSaleSubCategory = wholeSaleSubCategory;
           this.BSRequestID = BSRequestID;
           this.BSMessageID = BSMessageID;
           this.duComplaintID = duComplaintID;
           this.isTechnicalFlag = isTechnicalFlag;
           this.technicalComplaintID = technicalComplaintID;
           this.direct2CSTflag = direct2CSTflag;
           this.subRequestNumber = subRequestNumber;
           this.internetUserId = internetUserId;
           this.internetSpeed = internetSpeed;
           this.accountInstallationDate = accountInstallationDate;
           this.extentionNumber = extentionNumber;
           this.networkmedium = networkmedium;
           this.complaintLevel = complaintLevel;
           this.complaintLevelDesc = complaintLevelDesc;
           this.customerAdvisedofPossibleCharges = customerAdvisedofPossibleCharges;
           this.issueType = issueType;
           this.staffError = staffError;
           this.staffDept = staffDept;
           this.staffPFID = staffPFID;
           this.miniBillSMSMobileNumber = miniBillSMSMobileNumber;
           this.EBillEmailID = EBillEmailID;
           this.customerSatisfied = customerSatisfied;
           this.customerFeedback = customerFeedback;
           this.physicalOrgID = physicalOrgID;
           this.sendSMSFlag = sendSMSFlag;
           this.serviceAuthAndEquipmentDetails = serviceAuthAndEquipmentDetails;
           this.GPONTestDetails = GPONTestDetails;
           this.pendingServiceOrderDetails = pendingServiceOrderDetails;
           this.previousComplaintHistory = previousComplaintHistory;
           this.PSTNAssurance = PSTNAssurance;
           this.elifeAndEVision = elifeAndEVision;
           this.LOCNETPMSDetails = LOCNETPMSDetails;
           this.dataProductsDetails = dataProductsDetails;
           this.bistreamFields = bistreamFields;
           this.SMSParameters = SMSParameters;
           this.unSuspendTime = unSuspendTime;
           this.chargingCode = chargingCode;
           this.DOPType = DOPType;
           this.DOPRemark = DOPRemark;
           this.DOPAmount = DOPAmount;
           this.callRecordingID = callRecordingID;
           this.additionalInfo = additionalInfo;
    }


    /**
     * Gets the complaintId value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return complaintId
     */
    public String getComplaintId() {
        return complaintId;
    }


    /**
     * Sets the complaintId value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param complaintId
     */
    public void setComplaintId(String complaintId) {
        this.complaintId = complaintId;
    }


    /**
     * Gets the UCMSID value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return UCMSID
     */
    public String getUCMSID() {
        return UCMSID;
    }


    /**
     * Sets the UCMSID value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param UCMSID
     */
    public void setUCMSID(String UCMSID) {
        this.UCMSID = UCMSID;
    }


    /**
     * Gets the modifiedDate value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return modifiedDate
     */
    public java.util.Calendar getModifiedDate() {
        return modifiedDate;
    }


    /**
     * Sets the modifiedDate value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param modifiedDate
     */
    public void setModifiedDate(java.util.Calendar modifiedDate) {
        this.modifiedDate = modifiedDate;
    }


    /**
     * Gets the modifiedBy value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return modifiedBy
     */
    public String getModifiedBy() {
        return modifiedBy;
    }


    /**
     * Sets the modifiedBy value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param modifiedBy
     */
    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }


    /**
     * Gets the complaintRemark value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return complaintRemark
     */
    public String getComplaintRemark() {
        return complaintRemark;
    }


    /**
     * Sets the complaintRemark value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param complaintRemark
     */
    public void setComplaintRemark(String complaintRemark) {
        this.complaintRemark = complaintRemark;
    }


    /**
     * Gets the openTime value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return openTime
     */
    public java.util.Calendar getOpenTime() {
        return openTime;
    }


    /**
     * Sets the openTime value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param openTime
     */
    public void setOpenTime(java.util.Calendar openTime) {
        this.openTime = openTime;
    }


    /**
     * Gets the openedBy value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return openedBy
     */
    public String getOpenedBy() {
        return openedBy;
    }


    /**
     * Sets the openedBy value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param openedBy
     */
    public void setOpenedBy(String openedBy) {
        this.openedBy = openedBy;
    }


    /**
     * Gets the urgency value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return urgency
     */
    public String getUrgency() {
        return urgency;
    }


    /**
     * Sets the urgency value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param urgency
     */
    public void setUrgency(String urgency) {
        this.urgency = urgency;
    }


    /**
     * Gets the updatedTime value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return updatedTime
     */
    public java.util.Calendar getUpdatedTime() {
        return updatedTime;
    }


    /**
     * Sets the updatedTime value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param updatedTime
     */
    public void setUpdatedTime(java.util.Calendar updatedTime) {
        this.updatedTime = updatedTime;
    }


    /**
     * Gets the closedDate value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return closedDate
     */
    public java.util.Calendar getClosedDate() {
        return closedDate;
    }


    /**
     * Sets the closedDate value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param closedDate
     */
    public void setClosedDate(java.util.Calendar closedDate) {
        this.closedDate = closedDate;
    }


    /**
     * Gets the closedBy value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return closedBy
     */
    public String getClosedBy() {
        return closedBy;
    }


    /**
     * Sets the closedBy value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param closedBy
     */
    public void setClosedBy(String closedBy) {
        this.closedBy = closedBy;
    }


    /**
     * Gets the company value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return company
     */
    public String getCompany() {
        return company;
    }


    /**
     * Sets the company value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param company
     */
    public void setCompany(String company) {
        this.company = company;
    }


    /**
     * Gets the closureCode value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return closureCode
     */
    public String getClosureCode() {
        return closureCode;
    }


    /**
     * Sets the closureCode value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param closureCode
     */
    public void setClosureCode(String closureCode) {
        this.closureCode = closureCode;
    }


    /**
     * Gets the solution value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return solution
     */
    public String[] getSolution() {
        return solution;
    }


    /**
     * Sets the solution value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param solution
     */
    public void setSolution(String[] solution) {
        this.solution = solution;
    }

    public String getSolution(int i) {
        return this.solution[i];
    }

    public void setSolution(int i, String _value) {
        this.solution[i] = _value;
    }


    /**
     * Gets the ticketOwner value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return ticketOwner
     */
    public String getTicketOwner() {
        return ticketOwner;
    }


    /**
     * Sets the ticketOwner value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param ticketOwner
     */
    public void setTicketOwner(String ticketOwner) {
        this.ticketOwner = ticketOwner;
    }


    /**
     * Gets the updatedBy value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return updatedBy
     */
    public String getUpdatedBy() {
        return updatedBy;
    }


    /**
     * Sets the updatedBy value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param updatedBy
     */
    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }


    /**
     * Gets the area value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return area
     */
    public String getArea() {
        return area;
    }


    /**
     * Sets the area value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param area
     */
    public void setArea(String area) {
        this.area = area;
    }


    /**
     * Gets the siteCategory value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return siteCategory
     */
    public String getSiteCategory() {
        return siteCategory;
    }


    /**
     * Sets the siteCategory value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param siteCategory
     */
    public void setSiteCategory(String siteCategory) {
        this.siteCategory = siteCategory;
    }


    /**
     * Gets the subarea value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return subarea
     */
    public String getSubarea() {
        return subarea;
    }


    /**
     * Sets the subarea value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param subarea
     */
    public void setSubarea(String subarea) {
        this.subarea = subarea;
    }


    /**
     * Gets the problemType value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return problemType
     */
    public String getProblemType() {
        return problemType;
    }


    /**
     * Sets the problemType value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param problemType
     */
    public void setProblemType(String problemType) {
        this.problemType = problemType;
    }


    /**
     * Gets the hasCustomerContacted value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return hasCustomerContacted
     */
    public String getHasCustomerContacted() {
        return hasCustomerContacted;
    }


    /**
     * Sets the hasCustomerContacted value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param hasCustomerContacted
     */
    public void setHasCustomerContacted(String hasCustomerContacted) {
        this.hasCustomerContacted = hasCustomerContacted;
    }


    /**
     * Gets the newUCMSComplaintID value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return newUCMSComplaintID
     */
    public String getNewUCMSComplaintID() {
        return newUCMSComplaintID;
    }


    /**
     * Sets the newUCMSComplaintID value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param newUCMSComplaintID
     */
    public void setNewUCMSComplaintID(String newUCMSComplaintID) {
        this.newUCMSComplaintID = newUCMSComplaintID;
    }


    /**
     * Gets the systemType value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return systemType
     */
    public String getSystemType() {
        return systemType;
    }


    /**
     * Sets the systemType value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param systemType
     */
    public void setSystemType(String systemType) {
        this.systemType = systemType;
    }


    /**
     * Gets the networkType value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return networkType
     */
    public String getNetworkType() {
        return networkType;
    }


    /**
     * Sets the networkType value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param networkType
     */
    public void setNetworkType(String networkType) {
        this.networkType = networkType;
    }


    /**
     * Gets the networkTypeDesc value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return networkTypeDesc
     */
    public String getNetworkTypeDesc() {
        return networkTypeDesc;
    }


    /**
     * Sets the networkTypeDesc value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param networkTypeDesc
     */
    public void setNetworkTypeDesc(String networkTypeDesc) {
        this.networkTypeDesc = networkTypeDesc;
    }


    /**
     * Gets the EIDNo value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return EIDNo
     */
    public String getEIDNo() {
        return EIDNo;
    }


    /**
     * Sets the EIDNo value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param EIDNo
     */
    public void setEIDNo(String EIDNo) {
        this.EIDNo = EIDNo;
    }


    /**
     * Gets the mainClearCode value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return mainClearCode
     */
    public String getMainClearCode() {
        return mainClearCode;
    }


    /**
     * Sets the mainClearCode value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param mainClearCode
     */
    public void setMainClearCode(String mainClearCode) {
        this.mainClearCode = mainClearCode;
    }


    /**
     * Gets the auxClearCode value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return auxClearCode
     */
    public String getAuxClearCode() {
        return auxClearCode;
    }


    /**
     * Sets the auxClearCode value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param auxClearCode
     */
    public void setAuxClearCode(String auxClearCode) {
        this.auxClearCode = auxClearCode;
    }


    /**
     * Gets the clearCode value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return clearCode
     */
    public String getClearCode() {
        return clearCode;
    }


    /**
     * Sets the clearCode value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param clearCode
     */
    public void setClearCode(String clearCode) {
        this.clearCode = clearCode;
    }


    /**
     * Gets the suspendReason value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return suspendReason
     */
    public String getSuspendReason() {
        return suspendReason;
    }


    /**
     * Sets the suspendReason value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param suspendReason
     */
    public void setSuspendReason(String suspendReason) {
        this.suspendReason = suspendReason;
    }


    /**
     * Gets the parkingReason value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return parkingReason
     */
    public String getParkingReason() {
        return parkingReason;
    }


    /**
     * Sets the parkingReason value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param parkingReason
     */
    public void setParkingReason(String parkingReason) {
        this.parkingReason = parkingReason;
    }


    /**
     * Gets the handlingTime value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return handlingTime
     */
    public String getHandlingTime() {
        return handlingTime;
    }


    /**
     * Sets the handlingTime value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param handlingTime
     */
    public void setHandlingTime(String handlingTime) {
        this.handlingTime = handlingTime;
    }


    /**
     * Gets the chargeCode value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return chargeCode
     */
    public String getChargeCode() {
        return chargeCode;
    }


    /**
     * Sets the chargeCode value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param chargeCode
     */
    public void setChargeCode(String chargeCode) {
        this.chargeCode = chargeCode;
    }


    /**
     * Gets the reasonCode value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return reasonCode
     */
    public String getReasonCode() {
        return reasonCode;
    }


    /**
     * Sets the reasonCode value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param reasonCode
     */
    public void setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
    }


    /**
     * Gets the adjustmentType value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return adjustmentType
     */
    public String getAdjustmentType() {
        return adjustmentType;
    }


    /**
     * Sets the adjustmentType value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param adjustmentType
     */
    public void setAdjustmentType(String adjustmentType) {
        this.adjustmentType = adjustmentType;
    }


    /**
     * Gets the userOrgUnit value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return userOrgUnit
     */
    public String getUserOrgUnit() {
        return userOrgUnit;
    }


    /**
     * Sets the userOrgUnit value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param userOrgUnit
     */
    public void setUserOrgUnit(String userOrgUnit) {
        this.userOrgUnit = userOrgUnit;
    }


    /**
     * Gets the productType value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return productType
     */
    public String getProductType() {
        return productType;
    }


    /**
     * Sets the productType value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param productType
     */
    public void setProductType(String productType) {
        this.productType = productType;
    }


    /**
     * Gets the serviceDescription value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return serviceDescription
     */
    public String getServiceDescription() {
        return serviceDescription;
    }


    /**
     * Sets the serviceDescription value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param serviceDescription
     */
    public void setServiceDescription(String serviceDescription) {
        this.serviceDescription = serviceDescription;
    }


    /**
     * Gets the subReqType value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return subReqType
     */
    public String getSubReqType() {
        return subReqType;
    }


    /**
     * Sets the subReqType value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param subReqType
     */
    public void setSubReqType(String subReqType) {
        this.subReqType = subReqType;
    }


    /**
     * Gets the IVRNumber value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return IVRNumber
     */
    public String getIVRNumber() {
        return IVRNumber;
    }


    /**
     * Sets the IVRNumber value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param IVRNumber
     */
    public void setIVRNumber(String IVRNumber) {
        this.IVRNumber = IVRNumber;
    }


    /**
     * Gets the customerContactList value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return customerContactList
     */
    public ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintDetailsInUCMSRequest_xsd.UpdateComplaintInUCMSRequestDataHeaderCustomerContactList[] getCustomerContactList() {
        return customerContactList;
    }


    /**
     * Sets the customerContactList value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param customerContactList
     */
    public void setCustomerContactList(ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintDetailsInUCMSRequest_xsd.UpdateComplaintInUCMSRequestDataHeaderCustomerContactList[] customerContactList) {
        this.customerContactList = customerContactList;
    }

    public ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintDetailsInUCMSRequest_xsd.UpdateComplaintInUCMSRequestDataHeaderCustomerContactList getCustomerContactList(int i) {
        return this.customerContactList[i];
    }

    public void setCustomerContactList(int i, ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintDetailsInUCMSRequest_xsd.UpdateComplaintInUCMSRequestDataHeaderCustomerContactList _value) {
        this.customerContactList[i] = _value;
    }


    /**
     * Gets the attachmentList value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return attachmentList
     */
    public ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintDetailsInUCMSRequest_xsd.UpdateComplaintInUCMSRequestDataHeaderAttachmentList[] getAttachmentList() {
        return attachmentList;
    }


    /**
     * Sets the attachmentList value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param attachmentList
     */
    public void setAttachmentList(ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintDetailsInUCMSRequest_xsd.UpdateComplaintInUCMSRequestDataHeaderAttachmentList[] attachmentList) {
        this.attachmentList = attachmentList;
    }

    public ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintDetailsInUCMSRequest_xsd.UpdateComplaintInUCMSRequestDataHeaderAttachmentList getAttachmentList(int i) {
        return this.attachmentList[i];
    }

    public void setAttachmentList(int i, ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintDetailsInUCMSRequest_xsd.UpdateComplaintInUCMSRequestDataHeaderAttachmentList _value) {
        this.attachmentList[i] = _value;
    }


    /**
     * Gets the customerLocation value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return customerLocation
     */
    public UpdateComplaintInUCMSRequestDataHeaderCustomerLocation[] getCustomerLocation() {
        return customerLocation;
    }


    /**
     * Sets the customerLocation value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param customerLocation
     */
    public void setCustomerLocation(UpdateComplaintInUCMSRequestDataHeaderCustomerLocation[] customerLocation) {
        this.customerLocation = customerLocation;
    }

    public UpdateComplaintInUCMSRequestDataHeaderCustomerLocation getCustomerLocation(int i) {
        return this.customerLocation[i];
    }

    public void setCustomerLocation(int i, UpdateComplaintInUCMSRequestDataHeaderCustomerLocation _value) {
        this.customerLocation[i] = _value;
    }


    /**
     * Gets the disputeAmount value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return disputeAmount
     */
    public String getDisputeAmount() {
        return disputeAmount;
    }


    /**
     * Sets the disputeAmount value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param disputeAmount
     */
    public void setDisputeAmount(String disputeAmount) {
        this.disputeAmount = disputeAmount;
    }


    /**
     * Gets the refundedAmount value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return refundedAmount
     */
    public String getRefundedAmount() {
        return refundedAmount;
    }


    /**
     * Sets the refundedAmount value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param refundedAmount
     */
    public void setRefundedAmount(String refundedAmount) {
        this.refundedAmount = refundedAmount;
    }


    /**
     * Gets the refundApprover value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return refundApprover
     */
    public String getRefundApprover() {
        return refundApprover;
    }


    /**
     * Sets the refundApprover value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param refundApprover
     */
    public void setRefundApprover(String refundApprover) {
        this.refundApprover = refundApprover;
    }


    /**
     * Gets the complaintDescription value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return complaintDescription
     */
    public String getComplaintDescription() {
        return complaintDescription;
    }


    /**
     * Sets the complaintDescription value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param complaintDescription
     */
    public void setComplaintDescription(String complaintDescription) {
        this.complaintDescription = complaintDescription;
    }


    /**
     * Gets the FEProductGroup value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return FEProductGroup
     */
    public String getFEProductGroup() {
        return FEProductGroup;
    }


    /**
     * Sets the FEProductGroup value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param FEProductGroup
     */
    public void setFEProductGroup(String FEProductGroup) {
        this.FEProductGroup = FEProductGroup;
    }


    /**
     * Gets the FEProductGroupDesc value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return FEProductGroupDesc
     */
    public String getFEProductGroupDesc() {
        return FEProductGroupDesc;
    }


    /**
     * Sets the FEProductGroupDesc value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param FEProductGroupDesc
     */
    public void setFEProductGroupDesc(String FEProductGroupDesc) {
        this.FEProductGroupDesc = FEProductGroupDesc;
    }


    /**
     * Gets the product value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return product
     */
    public String getProduct() {
        return product;
    }


    /**
     * Sets the product value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param product
     */
    public void setProduct(String product) {
        this.product = product;
    }


    /**
     * Gets the productdesc value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return productdesc
     */
    public String getProductdesc() {
        return productdesc;
    }


    /**
     * Sets the productdesc value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param productdesc
     */
    public void setProductdesc(String productdesc) {
        this.productdesc = productdesc;
    }


    /**
     * Gets the regionCode value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return regionCode
     */
    public String getRegionCode() {
        return regionCode;
    }


    /**
     * Sets the regionCode value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param regionCode
     */
    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }


    /**
     * Gets the region value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return region
     */
    public String getRegion() {
        return region;
    }


    /**
     * Sets the region value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param region
     */
    public void setRegion(String region) {
        this.region = region;
    }


    /**
     * Gets the subRegionCode value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return subRegionCode
     */
    public String getSubRegionCode() {
        return subRegionCode;
    }


    /**
     * Sets the subRegionCode value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param subRegionCode
     */
    public void setSubRegionCode(String subRegionCode) {
        this.subRegionCode = subRegionCode;
    }


    /**
     * Gets the subRegion value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return subRegion
     */
    public String getSubRegion() {
        return subRegion;
    }


    /**
     * Sets the subRegion value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param subRegion
     */
    public void setSubRegion(String subRegion) {
        this.subRegion = subRegion;
    }


    /**
     * Gets the location value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return location
     */
    public String getLocation() {
        return location;
    }


    /**
     * Sets the location value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param location
     */
    public void setLocation(String location) {
        this.location = location;
    }


    /**
     * Gets the emirate value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return emirate
     */
    public String getEmirate() {
        return emirate;
    }


    /**
     * Sets the emirate value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param emirate
     */
    public void setEmirate(String emirate) {
        this.emirate = emirate;
    }


    /**
     * Gets the problemStartDate value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return problemStartDate
     */
    public java.util.Calendar getProblemStartDate() {
        return problemStartDate;
    }


    /**
     * Sets the problemStartDate value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param problemStartDate
     */
    public void setProblemStartDate(java.util.Calendar problemStartDate) {
        this.problemStartDate = problemStartDate;
    }


    /**
     * Gets the complaintPriorityFlag value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return complaintPriorityFlag
     */
    public String getComplaintPriorityFlag() {
        return complaintPriorityFlag;
    }


    /**
     * Sets the complaintPriorityFlag value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param complaintPriorityFlag
     */
    public void setComplaintPriorityFlag(String complaintPriorityFlag) {
        this.complaintPriorityFlag = complaintPriorityFlag;
    }


    /**
     * Gets the highSeverityFlag value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return highSeverityFlag
     */
    public String getHighSeverityFlag() {
        return highSeverityFlag;
    }


    /**
     * Sets the highSeverityFlag value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param highSeverityFlag
     */
    public void setHighSeverityFlag(String highSeverityFlag) {
        this.highSeverityFlag = highSeverityFlag;
    }


    /**
     * Gets the channelCode value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return channelCode
     */
    public String getChannelCode() {
        return channelCode;
    }


    /**
     * Sets the channelCode value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param channelCode
     */
    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode;
    }


    /**
     * Gets the customerSegment value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return customerSegment
     */
    public String getCustomerSegment() {
        return customerSegment;
    }


    /**
     * Sets the customerSegment value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param customerSegment
     */
    public void setCustomerSegment(String customerSegment) {
        this.customerSegment = customerSegment;
    }


    /**
     * Gets the activityType value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return activityType
     */
    public String getActivityType() {
        return activityType;
    }


    /**
     * Sets the activityType value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param activityType
     */
    public void setActivityType(String activityType) {
        this.activityType = activityType;
    }


    /**
     * Gets the CRSPriority value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return CRSPriority
     */
    public String getCRSPriority() {
        return CRSPriority;
    }


    /**
     * Sets the CRSPriority value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param CRSPriority
     */
    public void setCRSPriority(String CRSPriority) {
        this.CRSPriority = CRSPriority;
    }


    /**
     * Gets the customerfollowCounter value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return customerfollowCounter
     */
    public String getCustomerfollowCounter() {
        return customerfollowCounter;
    }


    /**
     * Sets the customerfollowCounter value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param customerfollowCounter
     */
    public void setCustomerfollowCounter(String customerfollowCounter) {
        this.customerfollowCounter = customerfollowCounter;
    }


    /**
     * Gets the coverageEligibility value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return coverageEligibility
     */
    public String getCoverageEligibility() {
        return coverageEligibility;
    }


    /**
     * Sets the coverageEligibility value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param coverageEligibility
     */
    public void setCoverageEligibility(String coverageEligibility) {
        this.coverageEligibility = coverageEligibility;
    }


    /**
     * Gets the coverageLocation value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return coverageLocation
     */
    public String getCoverageLocation() {
        return coverageLocation;
    }


    /**
     * Sets the coverageLocation value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param coverageLocation
     */
    public void setCoverageLocation(String coverageLocation) {
        this.coverageLocation = coverageLocation;
    }


    /**
     * Gets the valueSegment value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return valueSegment
     */
    public String getValueSegment() {
        return valueSegment;
    }


    /**
     * Sets the valueSegment value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param valueSegment
     */
    public void setValueSegment(String valueSegment) {
        this.valueSegment = valueSegment;
    }


    /**
     * Gets the wrongClassification value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return wrongClassification
     */
    public String getWrongClassification() {
        return wrongClassification;
    }


    /**
     * Sets the wrongClassification value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param wrongClassification
     */
    public void setWrongClassification(String wrongClassification) {
        this.wrongClassification = wrongClassification;
    }


    /**
     * Gets the complaintNature value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return complaintNature
     */
    public String getComplaintNature() {
        return complaintNature;
    }


    /**
     * Sets the complaintNature value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param complaintNature
     */
    public void setComplaintNature(String complaintNature) {
        this.complaintNature = complaintNature;
    }


    /**
     * Gets the complaintNatureDesc value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return complaintNatureDesc
     */
    public String getComplaintNatureDesc() {
        return complaintNatureDesc;
    }


    /**
     * Sets the complaintNatureDesc value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param complaintNatureDesc
     */
    public void setComplaintNatureDesc(String complaintNatureDesc) {
        this.complaintNatureDesc = complaintNatureDesc;
    }


    /**
     * Gets the complaintType value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return complaintType
     */
    public String getComplaintType() {
        return complaintType;
    }


    /**
     * Sets the complaintType value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param complaintType
     */
    public void setComplaintType(String complaintType) {
        this.complaintType = complaintType;
    }


    /**
     * Gets the complaintTypeDesc value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return complaintTypeDesc
     */
    public String getComplaintTypeDesc() {
        return complaintTypeDesc;
    }


    /**
     * Sets the complaintTypeDesc value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param complaintTypeDesc
     */
    public void setComplaintTypeDesc(String complaintTypeDesc) {
        this.complaintTypeDesc = complaintTypeDesc;
    }


    /**
     * Gets the complaintstatus value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return complaintstatus
     */
    public String getComplaintstatus() {
        return complaintstatus;
    }


    /**
     * Sets the complaintstatus value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param complaintstatus
     */
    public void setComplaintstatus(String complaintstatus) {
        this.complaintstatus = complaintstatus;
    }


    /**
     * Gets the createdDate value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the createdBy value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return createdBy
     */
    public String getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param createdBy
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the complaintShortDescription value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return complaintShortDescription
     */
    public String getComplaintShortDescription() {
        return complaintShortDescription;
    }


    /**
     * Sets the complaintShortDescription value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param complaintShortDescription
     */
    public void setComplaintShortDescription(String complaintShortDescription) {
        this.complaintShortDescription = complaintShortDescription;
    }


    /**
     * Gets the category value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return category
     */
    public String getCategory() {
        return category;
    }


    /**
     * Sets the category value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param category
     */
    public void setCategory(String category) {
        this.category = category;
    }


    /**
     * Gets the service value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return service
     */
    public String getService() {
        return service;
    }


    /**
     * Sets the service value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param service
     */
    public void setService(String service) {
        this.service = service;
    }


    /**
     * Gets the serviceDesc value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return serviceDesc
     */
    public String getServiceDesc() {
        return serviceDesc;
    }


    /**
     * Sets the serviceDesc value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param serviceDesc
     */
    public void setServiceDesc(String serviceDesc) {
        this.serviceDesc = serviceDesc;
    }


    /**
     * Gets the customerCategoryid value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return customerCategoryid
     */
    public String getCustomerCategoryid() {
        return customerCategoryid;
    }


    /**
     * Sets the customerCategoryid value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param customerCategoryid
     */
    public void setCustomerCategoryid(String customerCategoryid) {
        this.customerCategoryid = customerCategoryid;
    }


    /**
     * Gets the customerCategory value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return customerCategory
     */
    public String getCustomerCategory() {
        return customerCategory;
    }


    /**
     * Sets the customerCategory value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param customerCategory
     */
    public void setCustomerCategory(String customerCategory) {
        this.customerCategory = customerCategory;
    }


    /**
     * Gets the partyName value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return partyName
     */
    public String getPartyName() {
        return partyName;
    }


    /**
     * Sets the partyName value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param partyName
     */
    public void setPartyName(String partyName) {
        this.partyName = partyName;
    }


    /**
     * Gets the priority value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return priority
     */
    public String getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param priority
     */
    public void setPriority(String priority) {
        this.priority = priority;
    }


    /**
     * Gets the assignmentGroup value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return assignmentGroup
     */
    public String getAssignmentGroup() {
        return assignmentGroup;
    }


    /**
     * Sets the assignmentGroup value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param assignmentGroup
     */
    public void setAssignmentGroup(String assignmentGroup) {
        this.assignmentGroup = assignmentGroup;
    }


    /**
     * Gets the assigneeName value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return assigneeName
     */
    public String getAssigneeName() {
        return assigneeName;
    }


    /**
     * Sets the assigneeName value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param assigneeName
     */
    public void setAssigneeName(String assigneeName) {
        this.assigneeName = assigneeName;
    }


    /**
     * Gets the MTTId value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return MTTId
     */
    public String getMTTId() {
        return MTTId;
    }


    /**
     * Sets the MTTId value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param MTTId
     */
    public void setMTTId(String MTTId) {
        this.MTTId = MTTId;
    }


    /**
     * Gets the channel value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return channel
     */
    public String getChannel() {
        return channel;
    }


    /**
     * Sets the channel value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param channel
     */
    public void setChannel(String channel) {
        this.channel = channel;
    }


    /**
     * Gets the accountNumber value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return accountNumber
     */
    public String getAccountNumber() {
        return accountNumber;
    }


    /**
     * Sets the accountNumber value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param accountNumber
     */
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }


    /**
     * Gets the partyId value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return partyId
     */
    public String getPartyId() {
        return partyId;
    }


    /**
     * Sets the partyId value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param partyId
     */
    public void setPartyId(String partyId) {
        this.partyId = partyId;
    }


    /**
     * Gets the accountFullName value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return accountFullName
     */
    public String getAccountFullName() {
        return accountFullName;
    }


    /**
     * Sets the accountFullName value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param accountFullName
     */
    public void setAccountFullName(String accountFullName) {
        this.accountFullName = accountFullName;
    }


    /**
     * Gets the accountStatus value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return accountStatus
     */
    public String getAccountStatus() {
        return accountStatus;
    }


    /**
     * Sets the accountStatus value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param accountStatus
     */
    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }


    /**
     * Gets the bulkComplaintFlag value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return bulkComplaintFlag
     */
    public String getBulkComplaintFlag() {
        return bulkComplaintFlag;
    }


    /**
     * Sets the bulkComplaintFlag value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param bulkComplaintFlag
     */
    public void setBulkComplaintFlag(String bulkComplaintFlag) {
        this.bulkComplaintFlag = bulkComplaintFlag;
    }


    /**
     * Gets the bulkComplaintID value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return bulkComplaintID
     */
    public String getBulkComplaintID() {
        return bulkComplaintID;
    }


    /**
     * Sets the bulkComplaintID value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param bulkComplaintID
     */
    public void setBulkComplaintID(String bulkComplaintID) {
        this.bulkComplaintID = bulkComplaintID;
    }


    /**
     * Gets the customerSegmentCode value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return customerSegmentCode
     */
    public String getCustomerSegmentCode() {
        return customerSegmentCode;
    }


    /**
     * Sets the customerSegmentCode value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param customerSegmentCode
     */
    public void setCustomerSegmentCode(String customerSegmentCode) {
        this.customerSegmentCode = customerSegmentCode;
    }


    /**
     * Gets the preferredLanguage value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return preferredLanguage
     */
    public String getPreferredLanguage() {
        return preferredLanguage;
    }


    /**
     * Sets the preferredLanguage value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param preferredLanguage
     */
    public void setPreferredLanguage(String preferredLanguage) {
        this.preferredLanguage = preferredLanguage;
    }


    /**
     * Gets the isTier2Required value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return isTier2Required
     */
    public Boolean getIsTier2Required() {
        return isTier2Required;
    }


    /**
     * Sets the isTier2Required value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param isTier2Required
     */
    public void setIsTier2Required(Boolean isTier2Required) {
        this.isTier2Required = isTier2Required;
    }


    /**
     * Gets the bitStreamParameter value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return bitStreamParameter
     */
    public String getBitStreamParameter() {
        return bitStreamParameter;
    }


    /**
     * Sets the bitStreamParameter value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param bitStreamParameter
     */
    public void setBitStreamParameter(String bitStreamParameter) {
        this.bitStreamParameter = bitStreamParameter;
    }


    /**
     * Gets the bitStreamFlag value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return bitStreamFlag
     */
    public String getBitStreamFlag() {
        return bitStreamFlag;
    }


    /**
     * Sets the bitStreamFlag value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param bitStreamFlag
     */
    public void setBitStreamFlag(String bitStreamFlag) {
        this.bitStreamFlag = bitStreamFlag;
    }


    /**
     * Gets the wholeSaleProductLines value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return wholeSaleProductLines
     */
    public String[] getWholeSaleProductLines() {
        return wholeSaleProductLines;
    }


    /**
     * Sets the wholeSaleProductLines value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param wholeSaleProductLines
     */
    public void setWholeSaleProductLines(String[] wholeSaleProductLines) {
        this.wholeSaleProductLines = wholeSaleProductLines;
    }

    public String getWholeSaleProductLines(int i) {
        return this.wholeSaleProductLines[i];
    }

    public void setWholeSaleProductLines(int i, String _value) {
        this.wholeSaleProductLines[i] = _value;
    }


    /**
     * Gets the BSLinkID value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return BSLinkID
     */
    public String getBSLinkID() {
        return BSLinkID;
    }


    /**
     * Sets the BSLinkID value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param BSLinkID
     */
    public void setBSLinkID(String BSLinkID) {
        this.BSLinkID = BSLinkID;
    }


    /**
     * Gets the wholeSaleCategory value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return wholeSaleCategory
     */
    public String getWholeSaleCategory() {
        return wholeSaleCategory;
    }


    /**
     * Sets the wholeSaleCategory value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param wholeSaleCategory
     */
    public void setWholeSaleCategory(String wholeSaleCategory) {
        this.wholeSaleCategory = wholeSaleCategory;
    }


    /**
     * Gets the wholeSaleSubCategory value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return wholeSaleSubCategory
     */
    public String getWholeSaleSubCategory() {
        return wholeSaleSubCategory;
    }


    /**
     * Sets the wholeSaleSubCategory value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param wholeSaleSubCategory
     */
    public void setWholeSaleSubCategory(String wholeSaleSubCategory) {
        this.wholeSaleSubCategory = wholeSaleSubCategory;
    }


    /**
     * Gets the BSRequestID value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return BSRequestID
     */
    public Integer getBSRequestID() {
        return BSRequestID;
    }


    /**
     * Sets the BSRequestID value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param BSRequestID
     */
    public void setBSRequestID(Integer BSRequestID) {
        this.BSRequestID = BSRequestID;
    }


    /**
     * Gets the BSMessageID value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return BSMessageID
     */
    public Integer getBSMessageID() {
        return BSMessageID;
    }


    /**
     * Sets the BSMessageID value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param BSMessageID
     */
    public void setBSMessageID(Integer BSMessageID) {
        this.BSMessageID = BSMessageID;
    }


    /**
     * Gets the duComplaintID value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return duComplaintID
     */
    public Integer getDuComplaintID() {
        return duComplaintID;
    }


    /**
     * Sets the duComplaintID value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param duComplaintID
     */
    public void setDuComplaintID(Integer duComplaintID) {
        this.duComplaintID = duComplaintID;
    }


    /**
     * Gets the isTechnicalFlag value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return isTechnicalFlag
     */
    public String getIsTechnicalFlag() {
        return isTechnicalFlag;
    }


    /**
     * Sets the isTechnicalFlag value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param isTechnicalFlag
     */
    public void setIsTechnicalFlag(String isTechnicalFlag) {
        this.isTechnicalFlag = isTechnicalFlag;
    }


    /**
     * Gets the technicalComplaintID value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return technicalComplaintID
     */
    public Integer getTechnicalComplaintID() {
        return technicalComplaintID;
    }


    /**
     * Sets the technicalComplaintID value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param technicalComplaintID
     */
    public void setTechnicalComplaintID(Integer technicalComplaintID) {
        this.technicalComplaintID = technicalComplaintID;
    }


    /**
     * Gets the direct2CSTflag value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return direct2CSTflag
     */
    public Boolean getDirect2CSTflag() {
        return direct2CSTflag;
    }


    /**
     * Sets the direct2CSTflag value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param direct2CSTflag
     */
    public void setDirect2CSTflag(Boolean direct2CSTflag) {
        this.direct2CSTflag = direct2CSTflag;
    }


    /**
     * Gets the subRequestNumber value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return subRequestNumber
     */
    public String getSubRequestNumber() {
        return subRequestNumber;
    }


    /**
     * Sets the subRequestNumber value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param subRequestNumber
     */
    public void setSubRequestNumber(String subRequestNumber) {
        this.subRequestNumber = subRequestNumber;
    }


    /**
     * Gets the internetUserId value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return internetUserId
     */
    public String getInternetUserId() {
        return internetUserId;
    }


    /**
     * Sets the internetUserId value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param internetUserId
     */
    public void setInternetUserId(String internetUserId) {
        this.internetUserId = internetUserId;
    }


    /**
     * Gets the internetSpeed value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return internetSpeed
     */
    public String getInternetSpeed() {
        return internetSpeed;
    }


    /**
     * Sets the internetSpeed value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param internetSpeed
     */
    public void setInternetSpeed(String internetSpeed) {
        this.internetSpeed = internetSpeed;
    }


    /**
     * Gets the accountInstallationDate value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return accountInstallationDate
     */
    public java.util.Calendar getAccountInstallationDate() {
        return accountInstallationDate;
    }


    /**
     * Sets the accountInstallationDate value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param accountInstallationDate
     */
    public void setAccountInstallationDate(java.util.Calendar accountInstallationDate) {
        this.accountInstallationDate = accountInstallationDate;
    }


    /**
     * Gets the extentionNumber value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return extentionNumber
     */
    public String getExtentionNumber() {
        return extentionNumber;
    }


    /**
     * Sets the extentionNumber value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param extentionNumber
     */
    public void setExtentionNumber(String extentionNumber) {
        this.extentionNumber = extentionNumber;
    }


    /**
     * Gets the networkmedium value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return networkmedium
     */
    public String getNetworkmedium() {
        return networkmedium;
    }


    /**
     * Sets the networkmedium value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param networkmedium
     */
    public void setNetworkmedium(String networkmedium) {
        this.networkmedium = networkmedium;
    }


    /**
     * Gets the complaintLevel value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return complaintLevel
     */
    public String getComplaintLevel() {
        return complaintLevel;
    }


    /**
     * Sets the complaintLevel value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param complaintLevel
     */
    public void setComplaintLevel(String complaintLevel) {
        this.complaintLevel = complaintLevel;
    }


    /**
     * Gets the complaintLevelDesc value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return complaintLevelDesc
     */
    public String getComplaintLevelDesc() {
        return complaintLevelDesc;
    }


    /**
     * Sets the complaintLevelDesc value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param complaintLevelDesc
     */
    public void setComplaintLevelDesc(String complaintLevelDesc) {
        this.complaintLevelDesc = complaintLevelDesc;
    }


    /**
     * Gets the customerAdvisedofPossibleCharges value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return customerAdvisedofPossibleCharges
     */
    public String getCustomerAdvisedofPossibleCharges() {
        return customerAdvisedofPossibleCharges;
    }


    /**
     * Sets the customerAdvisedofPossibleCharges value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param customerAdvisedofPossibleCharges
     */
    public void setCustomerAdvisedofPossibleCharges(String customerAdvisedofPossibleCharges) {
        this.customerAdvisedofPossibleCharges = customerAdvisedofPossibleCharges;
    }


    /**
     * Gets the issueType value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return issueType
     */
    public String getIssueType() {
        return issueType;
    }


    /**
     * Sets the issueType value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param issueType
     */
    public void setIssueType(String issueType) {
        this.issueType = issueType;
    }


    /**
     * Gets the staffError value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return staffError
     */
    public String getStaffError() {
        return staffError;
    }


    /**
     * Sets the staffError value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param staffError
     */
    public void setStaffError(String staffError) {
        this.staffError = staffError;
    }


    /**
     * Gets the staffDept value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return staffDept
     */
    public String getStaffDept() {
        return staffDept;
    }


    /**
     * Sets the staffDept value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param staffDept
     */
    public void setStaffDept(String staffDept) {
        this.staffDept = staffDept;
    }


    /**
     * Gets the staffPFID value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return staffPFID
     */
    public String getStaffPFID() {
        return staffPFID;
    }


    /**
     * Sets the staffPFID value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param staffPFID
     */
    public void setStaffPFID(String staffPFID) {
        this.staffPFID = staffPFID;
    }


    /**
     * Gets the miniBillSMSMobileNumber value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return miniBillSMSMobileNumber
     */
    public String getMiniBillSMSMobileNumber() {
        return miniBillSMSMobileNumber;
    }


    /**
     * Sets the miniBillSMSMobileNumber value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param miniBillSMSMobileNumber
     */
    public void setMiniBillSMSMobileNumber(String miniBillSMSMobileNumber) {
        this.miniBillSMSMobileNumber = miniBillSMSMobileNumber;
    }


    /**
     * Gets the EBillEmailID value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return EBillEmailID
     */
    public String getEBillEmailID() {
        return EBillEmailID;
    }


    /**
     * Sets the EBillEmailID value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param EBillEmailID
     */
    public void setEBillEmailID(String EBillEmailID) {
        this.EBillEmailID = EBillEmailID;
    }


    /**
     * Gets the customerSatisfied value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return customerSatisfied
     */
    public String getCustomerSatisfied() {
        return customerSatisfied;
    }


    /**
     * Sets the customerSatisfied value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param customerSatisfied
     */
    public void setCustomerSatisfied(String customerSatisfied) {
        this.customerSatisfied = customerSatisfied;
    }


    /**
     * Gets the customerFeedback value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return customerFeedback
     */
    public String getCustomerFeedback() {
        return customerFeedback;
    }


    /**
     * Sets the customerFeedback value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param customerFeedback
     */
    public void setCustomerFeedback(String customerFeedback) {
        this.customerFeedback = customerFeedback;
    }


    /**
     * Gets the physicalOrgID value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return physicalOrgID
     */
    public String getPhysicalOrgID() {
        return physicalOrgID;
    }


    /**
     * Sets the physicalOrgID value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param physicalOrgID
     */
    public void setPhysicalOrgID(String physicalOrgID) {
        this.physicalOrgID = physicalOrgID;
    }


    /**
     * Gets the sendSMSFlag value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return sendSMSFlag
     */
    public Boolean getSendSMSFlag() {
        return sendSMSFlag;
    }


    /**
     * Sets the sendSMSFlag value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param sendSMSFlag
     */
    public void setSendSMSFlag(Boolean sendSMSFlag) {
        this.sendSMSFlag = sendSMSFlag;
    }


    /**
     * Gets the serviceAuthAndEquipmentDetails value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return serviceAuthAndEquipmentDetails
     */
    public ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintDetailsInUCMSRequest_xsd.UpdateComplaintInUCMSRequestDataHeaderServiceAuthAndEquipmentDetails[] getServiceAuthAndEquipmentDetails() {
        return serviceAuthAndEquipmentDetails;
    }


    /**
     * Sets the serviceAuthAndEquipmentDetails value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param serviceAuthAndEquipmentDetails
     */
    public void setServiceAuthAndEquipmentDetails(ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintDetailsInUCMSRequest_xsd.UpdateComplaintInUCMSRequestDataHeaderServiceAuthAndEquipmentDetails[] serviceAuthAndEquipmentDetails) {
        this.serviceAuthAndEquipmentDetails = serviceAuthAndEquipmentDetails;
    }

    public ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintDetailsInUCMSRequest_xsd.UpdateComplaintInUCMSRequestDataHeaderServiceAuthAndEquipmentDetails getServiceAuthAndEquipmentDetails(int i) {
        return this.serviceAuthAndEquipmentDetails[i];
    }

    public void setServiceAuthAndEquipmentDetails(int i, ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintDetailsInUCMSRequest_xsd.UpdateComplaintInUCMSRequestDataHeaderServiceAuthAndEquipmentDetails _value) {
        this.serviceAuthAndEquipmentDetails[i] = _value;
    }


    /**
     * Gets the GPONTestDetails value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return GPONTestDetails
     */
    public UpdateComplaintInUCMSRequestDataHeaderGPONTestDetails[] getGPONTestDetails() {
        return GPONTestDetails;
    }


    /**
     * Sets the GPONTestDetails value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param GPONTestDetails
     */
    public void setGPONTestDetails(UpdateComplaintInUCMSRequestDataHeaderGPONTestDetails[] GPONTestDetails) {
        this.GPONTestDetails = GPONTestDetails;
    }

    public UpdateComplaintInUCMSRequestDataHeaderGPONTestDetails getGPONTestDetails(int i) {
        return this.GPONTestDetails[i];
    }

    public void setGPONTestDetails(int i, UpdateComplaintInUCMSRequestDataHeaderGPONTestDetails _value) {
        this.GPONTestDetails[i] = _value;
    }


    /**
     * Gets the pendingServiceOrderDetails value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return pendingServiceOrderDetails
     */
    public ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintDetailsInUCMSRequest_xsd.UpdateComplaintInUCMSRequestDataHeaderPendingServiceOrderDetails[] getPendingServiceOrderDetails() {
        return pendingServiceOrderDetails;
    }


    /**
     * Sets the pendingServiceOrderDetails value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param pendingServiceOrderDetails
     */
    public void setPendingServiceOrderDetails(ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintDetailsInUCMSRequest_xsd.UpdateComplaintInUCMSRequestDataHeaderPendingServiceOrderDetails[] pendingServiceOrderDetails) {
        this.pendingServiceOrderDetails = pendingServiceOrderDetails;
    }

    public ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintDetailsInUCMSRequest_xsd.UpdateComplaintInUCMSRequestDataHeaderPendingServiceOrderDetails getPendingServiceOrderDetails(int i) {
        return this.pendingServiceOrderDetails[i];
    }

    public void setPendingServiceOrderDetails(int i, ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintDetailsInUCMSRequest_xsd.UpdateComplaintInUCMSRequestDataHeaderPendingServiceOrderDetails _value) {
        this.pendingServiceOrderDetails[i] = _value;
    }


    /**
     * Gets the previousComplaintHistory value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return previousComplaintHistory
     */
    public UpdateComplaintInUCMSRequestDataHeaderPreviousComplaintHistory[] getPreviousComplaintHistory() {
        return previousComplaintHistory;
    }


    /**
     * Sets the previousComplaintHistory value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param previousComplaintHistory
     */
    public void setPreviousComplaintHistory(UpdateComplaintInUCMSRequestDataHeaderPreviousComplaintHistory[] previousComplaintHistory) {
        this.previousComplaintHistory = previousComplaintHistory;
    }

    public UpdateComplaintInUCMSRequestDataHeaderPreviousComplaintHistory getPreviousComplaintHistory(int i) {
        return this.previousComplaintHistory[i];
    }

    public void setPreviousComplaintHistory(int i, UpdateComplaintInUCMSRequestDataHeaderPreviousComplaintHistory _value) {
        this.previousComplaintHistory[i] = _value;
    }


    /**
     * Gets the PSTNAssurance value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return PSTNAssurance
     */
    public ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintDetailsInUCMSRequest_xsd.UpdateComplaintInUCMSRequestDataHeaderPSTNAssurance[] getPSTNAssurance() {
        return PSTNAssurance;
    }


    /**
     * Sets the PSTNAssurance value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param PSTNAssurance
     */
    public void setPSTNAssurance(ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintDetailsInUCMSRequest_xsd.UpdateComplaintInUCMSRequestDataHeaderPSTNAssurance[] PSTNAssurance) {
        this.PSTNAssurance = PSTNAssurance;
    }

    public ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintDetailsInUCMSRequest_xsd.UpdateComplaintInUCMSRequestDataHeaderPSTNAssurance getPSTNAssurance(int i) {
        return this.PSTNAssurance[i];
    }

    public void setPSTNAssurance(int i, ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintDetailsInUCMSRequest_xsd.UpdateComplaintInUCMSRequestDataHeaderPSTNAssurance _value) {
        this.PSTNAssurance[i] = _value;
    }


    /**
     * Gets the elifeAndEVision value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return elifeAndEVision
     */
    public UpdateComplaintInUCMSRequestDataHeaderElifeAndEVision[] getElifeAndEVision() {
        return elifeAndEVision;
    }


    /**
     * Sets the elifeAndEVision value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param elifeAndEVision
     */
    public void setElifeAndEVision(UpdateComplaintInUCMSRequestDataHeaderElifeAndEVision[] elifeAndEVision) {
        this.elifeAndEVision = elifeAndEVision;
    }

    public UpdateComplaintInUCMSRequestDataHeaderElifeAndEVision getElifeAndEVision(int i) {
        return this.elifeAndEVision[i];
    }

    public void setElifeAndEVision(int i, UpdateComplaintInUCMSRequestDataHeaderElifeAndEVision _value) {
        this.elifeAndEVision[i] = _value;
    }


    /**
     * Gets the LOCNETPMSDetails value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return LOCNETPMSDetails
     */
    public UpdateComplaintInUCMSRequestDataHeaderLOCNETPMSDetails[] getLOCNETPMSDetails() {
        return LOCNETPMSDetails;
    }


    /**
     * Sets the LOCNETPMSDetails value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param LOCNETPMSDetails
     */
    public void setLOCNETPMSDetails(UpdateComplaintInUCMSRequestDataHeaderLOCNETPMSDetails[] LOCNETPMSDetails) {
        this.LOCNETPMSDetails = LOCNETPMSDetails;
    }

    public UpdateComplaintInUCMSRequestDataHeaderLOCNETPMSDetails getLOCNETPMSDetails(int i) {
        return this.LOCNETPMSDetails[i];
    }

    public void setLOCNETPMSDetails(int i, UpdateComplaintInUCMSRequestDataHeaderLOCNETPMSDetails _value) {
        this.LOCNETPMSDetails[i] = _value;
    }


    /**
     * Gets the dataProductsDetails value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return dataProductsDetails
     */
    public UpdateComplaintInUCMSRequestDataHeaderDataProductsDetails[] getDataProductsDetails() {
        return dataProductsDetails;
    }


    /**
     * Sets the dataProductsDetails value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param dataProductsDetails
     */
    public void setDataProductsDetails(UpdateComplaintInUCMSRequestDataHeaderDataProductsDetails[] dataProductsDetails) {
        this.dataProductsDetails = dataProductsDetails;
    }

    public UpdateComplaintInUCMSRequestDataHeaderDataProductsDetails getDataProductsDetails(int i) {
        return this.dataProductsDetails[i];
    }

    public void setDataProductsDetails(int i, UpdateComplaintInUCMSRequestDataHeaderDataProductsDetails _value) {
        this.dataProductsDetails[i] = _value;
    }


    /**
     * Gets the bistreamFields value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return bistreamFields
     */
    public ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintDetailsInUCMSRequest_xsd.UpdateComplaintInUCMSRequestDataHeaderBistreamFields[] getBistreamFields() {
        return bistreamFields;
    }


    /**
     * Sets the bistreamFields value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param bistreamFields
     */
    public void setBistreamFields(ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintDetailsInUCMSRequest_xsd.UpdateComplaintInUCMSRequestDataHeaderBistreamFields[] bistreamFields) {
        this.bistreamFields = bistreamFields;
    }

    public ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintDetailsInUCMSRequest_xsd.UpdateComplaintInUCMSRequestDataHeaderBistreamFields getBistreamFields(int i) {
        return this.bistreamFields[i];
    }

    public void setBistreamFields(int i, ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintDetailsInUCMSRequest_xsd.UpdateComplaintInUCMSRequestDataHeaderBistreamFields _value) {
        this.bistreamFields[i] = _value;
    }


    /**
     * Gets the SMSParameters value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return SMSParameters
     */
    public ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintDetailsInUCMSRequest_xsd.UpdateComplaintInUCMSRequestDataHeaderSMSParameters getSMSParameters() {
        return SMSParameters;
    }


    /**
     * Sets the SMSParameters value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param SMSParameters
     */
    public void setSMSParameters(ae.etisalat.www.Middleware.UCMSComplaintIntegration.UpdateComplaintDetailsInUCMSRequest_xsd.UpdateComplaintInUCMSRequestDataHeaderSMSParameters SMSParameters) {
        this.SMSParameters = SMSParameters;
    }


    /**
     * Gets the unSuspendTime value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return unSuspendTime
     */
    public java.util.Calendar getUnSuspendTime() {
        return unSuspendTime;
    }


    /**
     * Sets the unSuspendTime value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param unSuspendTime
     */
    public void setUnSuspendTime(java.util.Calendar unSuspendTime) {
        this.unSuspendTime = unSuspendTime;
    }


    /**
     * Gets the chargingCode value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return chargingCode
     */
    public String getChargingCode() {
        return chargingCode;
    }


    /**
     * Sets the chargingCode value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param chargingCode
     */
    public void setChargingCode(String chargingCode) {
        this.chargingCode = chargingCode;
    }


    /**
     * Gets the DOPType value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return DOPType
     */
    public String getDOPType() {
        return DOPType;
    }


    /**
     * Sets the DOPType value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param DOPType
     */
    public void setDOPType(String DOPType) {
        this.DOPType = DOPType;
    }


    /**
     * Gets the DOPRemark value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return DOPRemark
     */
    public String getDOPRemark() {
        return DOPRemark;
    }


    /**
     * Sets the DOPRemark value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param DOPRemark
     */
    public void setDOPRemark(String DOPRemark) {
        this.DOPRemark = DOPRemark;
    }


    /**
     * Gets the DOPAmount value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return DOPAmount
     */
    public String getDOPAmount() {
        return DOPAmount;
    }


    /**
     * Sets the DOPAmount value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param DOPAmount
     */
    public void setDOPAmount(String DOPAmount) {
        this.DOPAmount = DOPAmount;
    }


    /**
     * Gets the callRecordingID value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return callRecordingID
     */
    public String getCallRecordingID() {
        return callRecordingID;
    }


    /**
     * Sets the callRecordingID value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param callRecordingID
     */
    public void setCallRecordingID(String callRecordingID) {
        this.callRecordingID = callRecordingID;
    }


    /**
     * Gets the additionalInfo value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @return additionalInfo
     */
    public UpdateComplaintInUCMSRequestDataHeaderAdditionalInfo[] getAdditionalInfo() {
        return additionalInfo;
    }


    /**
     * Sets the additionalInfo value for this UpdateComplaintInUCMSRequestDataHeader.
     * 
     * @param additionalInfo
     */
    public void setAdditionalInfo(UpdateComplaintInUCMSRequestDataHeaderAdditionalInfo[] additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public UpdateComplaintInUCMSRequestDataHeaderAdditionalInfo getAdditionalInfo(int i) {
        return this.additionalInfo[i];
    }

    public void setAdditionalInfo(int i, UpdateComplaintInUCMSRequestDataHeaderAdditionalInfo _value) {
        this.additionalInfo[i] = _value;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof UpdateComplaintInUCMSRequestDataHeader)) return false;
        UpdateComplaintInUCMSRequestDataHeader other = (UpdateComplaintInUCMSRequestDataHeader) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.complaintId==null && other.getComplaintId()==null) || 
             (this.complaintId!=null &&
              this.complaintId.equals(other.getComplaintId()))) &&
            ((this.UCMSID==null && other.getUCMSID()==null) || 
             (this.UCMSID!=null &&
              this.UCMSID.equals(other.getUCMSID()))) &&
            ((this.modifiedDate==null && other.getModifiedDate()==null) || 
             (this.modifiedDate!=null &&
              this.modifiedDate.equals(other.getModifiedDate()))) &&
            ((this.modifiedBy==null && other.getModifiedBy()==null) || 
             (this.modifiedBy!=null &&
              this.modifiedBy.equals(other.getModifiedBy()))) &&
            ((this.complaintRemark==null && other.getComplaintRemark()==null) || 
             (this.complaintRemark!=null &&
              this.complaintRemark.equals(other.getComplaintRemark()))) &&
            ((this.openTime==null && other.getOpenTime()==null) || 
             (this.openTime!=null &&
              this.openTime.equals(other.getOpenTime()))) &&
            ((this.openedBy==null && other.getOpenedBy()==null) || 
             (this.openedBy!=null &&
              this.openedBy.equals(other.getOpenedBy()))) &&
            ((this.urgency==null && other.getUrgency()==null) || 
             (this.urgency!=null &&
              this.urgency.equals(other.getUrgency()))) &&
            ((this.updatedTime==null && other.getUpdatedTime()==null) || 
             (this.updatedTime!=null &&
              this.updatedTime.equals(other.getUpdatedTime()))) &&
            ((this.closedDate==null && other.getClosedDate()==null) || 
             (this.closedDate!=null &&
              this.closedDate.equals(other.getClosedDate()))) &&
            ((this.closedBy==null && other.getClosedBy()==null) || 
             (this.closedBy!=null &&
              this.closedBy.equals(other.getClosedBy()))) &&
            ((this.company==null && other.getCompany()==null) || 
             (this.company!=null &&
              this.company.equals(other.getCompany()))) &&
            ((this.closureCode==null && other.getClosureCode()==null) || 
             (this.closureCode!=null &&
              this.closureCode.equals(other.getClosureCode()))) &&
            ((this.solution==null && other.getSolution()==null) || 
             (this.solution!=null &&
              java.util.Arrays.equals(this.solution, other.getSolution()))) &&
            ((this.ticketOwner==null && other.getTicketOwner()==null) || 
             (this.ticketOwner!=null &&
              this.ticketOwner.equals(other.getTicketOwner()))) &&
            ((this.updatedBy==null && other.getUpdatedBy()==null) || 
             (this.updatedBy!=null &&
              this.updatedBy.equals(other.getUpdatedBy()))) &&
            ((this.area==null && other.getArea()==null) || 
             (this.area!=null &&
              this.area.equals(other.getArea()))) &&
            ((this.siteCategory==null && other.getSiteCategory()==null) || 
             (this.siteCategory!=null &&
              this.siteCategory.equals(other.getSiteCategory()))) &&
            ((this.subarea==null && other.getSubarea()==null) || 
             (this.subarea!=null &&
              this.subarea.equals(other.getSubarea()))) &&
            ((this.problemType==null && other.getProblemType()==null) || 
             (this.problemType!=null &&
              this.problemType.equals(other.getProblemType()))) &&
            ((this.hasCustomerContacted==null && other.getHasCustomerContacted()==null) || 
             (this.hasCustomerContacted!=null &&
              this.hasCustomerContacted.equals(other.getHasCustomerContacted()))) &&
            ((this.newUCMSComplaintID==null && other.getNewUCMSComplaintID()==null) || 
             (this.newUCMSComplaintID!=null &&
              this.newUCMSComplaintID.equals(other.getNewUCMSComplaintID()))) &&
            ((this.systemType==null && other.getSystemType()==null) || 
             (this.systemType!=null &&
              this.systemType.equals(other.getSystemType()))) &&
            ((this.networkType==null && other.getNetworkType()==null) || 
             (this.networkType!=null &&
              this.networkType.equals(other.getNetworkType()))) &&
            ((this.networkTypeDesc==null && other.getNetworkTypeDesc()==null) || 
             (this.networkTypeDesc!=null &&
              this.networkTypeDesc.equals(other.getNetworkTypeDesc()))) &&
            ((this.EIDNo==null && other.getEIDNo()==null) || 
             (this.EIDNo!=null &&
              this.EIDNo.equals(other.getEIDNo()))) &&
            ((this.mainClearCode==null && other.getMainClearCode()==null) || 
             (this.mainClearCode!=null &&
              this.mainClearCode.equals(other.getMainClearCode()))) &&
            ((this.auxClearCode==null && other.getAuxClearCode()==null) || 
             (this.auxClearCode!=null &&
              this.auxClearCode.equals(other.getAuxClearCode()))) &&
            ((this.clearCode==null && other.getClearCode()==null) || 
             (this.clearCode!=null &&
              this.clearCode.equals(other.getClearCode()))) &&
            ((this.suspendReason==null && other.getSuspendReason()==null) || 
             (this.suspendReason!=null &&
              this.suspendReason.equals(other.getSuspendReason()))) &&
            ((this.parkingReason==null && other.getParkingReason()==null) || 
             (this.parkingReason!=null &&
              this.parkingReason.equals(other.getParkingReason()))) &&
            ((this.handlingTime==null && other.getHandlingTime()==null) || 
             (this.handlingTime!=null &&
              this.handlingTime.equals(other.getHandlingTime()))) &&
            ((this.chargeCode==null && other.getChargeCode()==null) || 
             (this.chargeCode!=null &&
              this.chargeCode.equals(other.getChargeCode()))) &&
            ((this.reasonCode==null && other.getReasonCode()==null) || 
             (this.reasonCode!=null &&
              this.reasonCode.equals(other.getReasonCode()))) &&
            ((this.adjustmentType==null && other.getAdjustmentType()==null) || 
             (this.adjustmentType!=null &&
              this.adjustmentType.equals(other.getAdjustmentType()))) &&
            ((this.userOrgUnit==null && other.getUserOrgUnit()==null) || 
             (this.userOrgUnit!=null &&
              this.userOrgUnit.equals(other.getUserOrgUnit()))) &&
            ((this.productType==null && other.getProductType()==null) || 
             (this.productType!=null &&
              this.productType.equals(other.getProductType()))) &&
            ((this.serviceDescription==null && other.getServiceDescription()==null) || 
             (this.serviceDescription!=null &&
              this.serviceDescription.equals(other.getServiceDescription()))) &&
            ((this.subReqType==null && other.getSubReqType()==null) || 
             (this.subReqType!=null &&
              this.subReqType.equals(other.getSubReqType()))) &&
            ((this.IVRNumber==null && other.getIVRNumber()==null) || 
             (this.IVRNumber!=null &&
              this.IVRNumber.equals(other.getIVRNumber()))) &&
            ((this.customerContactList==null && other.getCustomerContactList()==null) || 
             (this.customerContactList!=null &&
              java.util.Arrays.equals(this.customerContactList, other.getCustomerContactList()))) &&
            ((this.attachmentList==null && other.getAttachmentList()==null) || 
             (this.attachmentList!=null &&
              java.util.Arrays.equals(this.attachmentList, other.getAttachmentList()))) &&
            ((this.customerLocation==null && other.getCustomerLocation()==null) || 
             (this.customerLocation!=null &&
              java.util.Arrays.equals(this.customerLocation, other.getCustomerLocation()))) &&
            ((this.disputeAmount==null && other.getDisputeAmount()==null) || 
             (this.disputeAmount!=null &&
              this.disputeAmount.equals(other.getDisputeAmount()))) &&
            ((this.refundedAmount==null && other.getRefundedAmount()==null) || 
             (this.refundedAmount!=null &&
              this.refundedAmount.equals(other.getRefundedAmount()))) &&
            ((this.refundApprover==null && other.getRefundApprover()==null) || 
             (this.refundApprover!=null &&
              this.refundApprover.equals(other.getRefundApprover()))) &&
            ((this.complaintDescription==null && other.getComplaintDescription()==null) || 
             (this.complaintDescription!=null &&
              this.complaintDescription.equals(other.getComplaintDescription()))) &&
            ((this.FEProductGroup==null && other.getFEProductGroup()==null) || 
             (this.FEProductGroup!=null &&
              this.FEProductGroup.equals(other.getFEProductGroup()))) &&
            ((this.FEProductGroupDesc==null && other.getFEProductGroupDesc()==null) || 
             (this.FEProductGroupDesc!=null &&
              this.FEProductGroupDesc.equals(other.getFEProductGroupDesc()))) &&
            ((this.product==null && other.getProduct()==null) || 
             (this.product!=null &&
              this.product.equals(other.getProduct()))) &&
            ((this.productdesc==null && other.getProductdesc()==null) || 
             (this.productdesc!=null &&
              this.productdesc.equals(other.getProductdesc()))) &&
            ((this.regionCode==null && other.getRegionCode()==null) || 
             (this.regionCode!=null &&
              this.regionCode.equals(other.getRegionCode()))) &&
            ((this.region==null && other.getRegion()==null) || 
             (this.region!=null &&
              this.region.equals(other.getRegion()))) &&
            ((this.subRegionCode==null && other.getSubRegionCode()==null) || 
             (this.subRegionCode!=null &&
              this.subRegionCode.equals(other.getSubRegionCode()))) &&
            ((this.subRegion==null && other.getSubRegion()==null) || 
             (this.subRegion!=null &&
              this.subRegion.equals(other.getSubRegion()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              this.location.equals(other.getLocation()))) &&
            ((this.emirate==null && other.getEmirate()==null) || 
             (this.emirate!=null &&
              this.emirate.equals(other.getEmirate()))) &&
            ((this.problemStartDate==null && other.getProblemStartDate()==null) || 
             (this.problemStartDate!=null &&
              this.problemStartDate.equals(other.getProblemStartDate()))) &&
            ((this.complaintPriorityFlag==null && other.getComplaintPriorityFlag()==null) || 
             (this.complaintPriorityFlag!=null &&
              this.complaintPriorityFlag.equals(other.getComplaintPriorityFlag()))) &&
            ((this.highSeverityFlag==null && other.getHighSeverityFlag()==null) || 
             (this.highSeverityFlag!=null &&
              this.highSeverityFlag.equals(other.getHighSeverityFlag()))) &&
            ((this.channelCode==null && other.getChannelCode()==null) || 
             (this.channelCode!=null &&
              this.channelCode.equals(other.getChannelCode()))) &&
            ((this.customerSegment==null && other.getCustomerSegment()==null) || 
             (this.customerSegment!=null &&
              this.customerSegment.equals(other.getCustomerSegment()))) &&
            ((this.activityType==null && other.getActivityType()==null) || 
             (this.activityType!=null &&
              this.activityType.equals(other.getActivityType()))) &&
            ((this.CRSPriority==null && other.getCRSPriority()==null) || 
             (this.CRSPriority!=null &&
              this.CRSPriority.equals(other.getCRSPriority()))) &&
            ((this.customerfollowCounter==null && other.getCustomerfollowCounter()==null) || 
             (this.customerfollowCounter!=null &&
              this.customerfollowCounter.equals(other.getCustomerfollowCounter()))) &&
            ((this.coverageEligibility==null && other.getCoverageEligibility()==null) || 
             (this.coverageEligibility!=null &&
              this.coverageEligibility.equals(other.getCoverageEligibility()))) &&
            ((this.coverageLocation==null && other.getCoverageLocation()==null) || 
             (this.coverageLocation!=null &&
              this.coverageLocation.equals(other.getCoverageLocation()))) &&
            ((this.valueSegment==null && other.getValueSegment()==null) || 
             (this.valueSegment!=null &&
              this.valueSegment.equals(other.getValueSegment()))) &&
            ((this.wrongClassification==null && other.getWrongClassification()==null) || 
             (this.wrongClassification!=null &&
              this.wrongClassification.equals(other.getWrongClassification()))) &&
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
            ((this.complaintstatus==null && other.getComplaintstatus()==null) || 
             (this.complaintstatus!=null &&
              this.complaintstatus.equals(other.getComplaintstatus()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.createdBy==null && other.getCreatedBy()==null) || 
             (this.createdBy!=null &&
              this.createdBy.equals(other.getCreatedBy()))) &&
            ((this.complaintShortDescription==null && other.getComplaintShortDescription()==null) || 
             (this.complaintShortDescription!=null &&
              this.complaintShortDescription.equals(other.getComplaintShortDescription()))) &&
            ((this.category==null && other.getCategory()==null) || 
             (this.category!=null &&
              this.category.equals(other.getCategory()))) &&
            ((this.service==null && other.getService()==null) || 
             (this.service!=null &&
              this.service.equals(other.getService()))) &&
            ((this.serviceDesc==null && other.getServiceDesc()==null) || 
             (this.serviceDesc!=null &&
              this.serviceDesc.equals(other.getServiceDesc()))) &&
            ((this.customerCategoryid==null && other.getCustomerCategoryid()==null) || 
             (this.customerCategoryid!=null &&
              this.customerCategoryid.equals(other.getCustomerCategoryid()))) &&
            ((this.customerCategory==null && other.getCustomerCategory()==null) || 
             (this.customerCategory!=null &&
              this.customerCategory.equals(other.getCustomerCategory()))) &&
            ((this.partyName==null && other.getPartyName()==null) || 
             (this.partyName!=null &&
              this.partyName.equals(other.getPartyName()))) &&
            ((this.priority==null && other.getPriority()==null) || 
             (this.priority!=null &&
              this.priority.equals(other.getPriority()))) &&
            ((this.assignmentGroup==null && other.getAssignmentGroup()==null) || 
             (this.assignmentGroup!=null &&
              this.assignmentGroup.equals(other.getAssignmentGroup()))) &&
            ((this.assigneeName==null && other.getAssigneeName()==null) || 
             (this.assigneeName!=null &&
              this.assigneeName.equals(other.getAssigneeName()))) &&
            ((this.MTTId==null && other.getMTTId()==null) || 
             (this.MTTId!=null &&
              this.MTTId.equals(other.getMTTId()))) &&
            ((this.channel==null && other.getChannel()==null) || 
             (this.channel!=null &&
              this.channel.equals(other.getChannel()))) &&
            ((this.accountNumber==null && other.getAccountNumber()==null) || 
             (this.accountNumber!=null &&
              this.accountNumber.equals(other.getAccountNumber()))) &&
            ((this.partyId==null && other.getPartyId()==null) || 
             (this.partyId!=null &&
              this.partyId.equals(other.getPartyId()))) &&
            ((this.accountFullName==null && other.getAccountFullName()==null) || 
             (this.accountFullName!=null &&
              this.accountFullName.equals(other.getAccountFullName()))) &&
            ((this.accountStatus==null && other.getAccountStatus()==null) || 
             (this.accountStatus!=null &&
              this.accountStatus.equals(other.getAccountStatus()))) &&
            ((this.bulkComplaintFlag==null && other.getBulkComplaintFlag()==null) || 
             (this.bulkComplaintFlag!=null &&
              this.bulkComplaintFlag.equals(other.getBulkComplaintFlag()))) &&
            ((this.bulkComplaintID==null && other.getBulkComplaintID()==null) || 
             (this.bulkComplaintID!=null &&
              this.bulkComplaintID.equals(other.getBulkComplaintID()))) &&
            ((this.customerSegmentCode==null && other.getCustomerSegmentCode()==null) || 
             (this.customerSegmentCode!=null &&
              this.customerSegmentCode.equals(other.getCustomerSegmentCode()))) &&
            ((this.preferredLanguage==null && other.getPreferredLanguage()==null) || 
             (this.preferredLanguage!=null &&
              this.preferredLanguage.equals(other.getPreferredLanguage()))) &&
            ((this.isTier2Required==null && other.getIsTier2Required()==null) || 
             (this.isTier2Required!=null &&
              this.isTier2Required.equals(other.getIsTier2Required()))) &&
            ((this.bitStreamParameter==null && other.getBitStreamParameter()==null) || 
             (this.bitStreamParameter!=null &&
              this.bitStreamParameter.equals(other.getBitStreamParameter()))) &&
            ((this.bitStreamFlag==null && other.getBitStreamFlag()==null) || 
             (this.bitStreamFlag!=null &&
              this.bitStreamFlag.equals(other.getBitStreamFlag()))) &&
            ((this.wholeSaleProductLines==null && other.getWholeSaleProductLines()==null) || 
             (this.wholeSaleProductLines!=null &&
              java.util.Arrays.equals(this.wholeSaleProductLines, other.getWholeSaleProductLines()))) &&
            ((this.BSLinkID==null && other.getBSLinkID()==null) || 
             (this.BSLinkID!=null &&
              this.BSLinkID.equals(other.getBSLinkID()))) &&
            ((this.wholeSaleCategory==null && other.getWholeSaleCategory()==null) || 
             (this.wholeSaleCategory!=null &&
              this.wholeSaleCategory.equals(other.getWholeSaleCategory()))) &&
            ((this.wholeSaleSubCategory==null && other.getWholeSaleSubCategory()==null) || 
             (this.wholeSaleSubCategory!=null &&
              this.wholeSaleSubCategory.equals(other.getWholeSaleSubCategory()))) &&
            ((this.BSRequestID==null && other.getBSRequestID()==null) || 
             (this.BSRequestID!=null &&
              this.BSRequestID.equals(other.getBSRequestID()))) &&
            ((this.BSMessageID==null && other.getBSMessageID()==null) || 
             (this.BSMessageID!=null &&
              this.BSMessageID.equals(other.getBSMessageID()))) &&
            ((this.duComplaintID==null && other.getDuComplaintID()==null) || 
             (this.duComplaintID!=null &&
              this.duComplaintID.equals(other.getDuComplaintID()))) &&
            ((this.isTechnicalFlag==null && other.getIsTechnicalFlag()==null) || 
             (this.isTechnicalFlag!=null &&
              this.isTechnicalFlag.equals(other.getIsTechnicalFlag()))) &&
            ((this.technicalComplaintID==null && other.getTechnicalComplaintID()==null) || 
             (this.technicalComplaintID!=null &&
              this.technicalComplaintID.equals(other.getTechnicalComplaintID()))) &&
            ((this.direct2CSTflag==null && other.getDirect2CSTflag()==null) || 
             (this.direct2CSTflag!=null &&
              this.direct2CSTflag.equals(other.getDirect2CSTflag()))) &&
            ((this.subRequestNumber==null && other.getSubRequestNumber()==null) || 
             (this.subRequestNumber!=null &&
              this.subRequestNumber.equals(other.getSubRequestNumber()))) &&
            ((this.internetUserId==null && other.getInternetUserId()==null) || 
             (this.internetUserId!=null &&
              this.internetUserId.equals(other.getInternetUserId()))) &&
            ((this.internetSpeed==null && other.getInternetSpeed()==null) || 
             (this.internetSpeed!=null &&
              this.internetSpeed.equals(other.getInternetSpeed()))) &&
            ((this.accountInstallationDate==null && other.getAccountInstallationDate()==null) || 
             (this.accountInstallationDate!=null &&
              this.accountInstallationDate.equals(other.getAccountInstallationDate()))) &&
            ((this.extentionNumber==null && other.getExtentionNumber()==null) || 
             (this.extentionNumber!=null &&
              this.extentionNumber.equals(other.getExtentionNumber()))) &&
            ((this.networkmedium==null && other.getNetworkmedium()==null) || 
             (this.networkmedium!=null &&
              this.networkmedium.equals(other.getNetworkmedium()))) &&
            ((this.complaintLevel==null && other.getComplaintLevel()==null) || 
             (this.complaintLevel!=null &&
              this.complaintLevel.equals(other.getComplaintLevel()))) &&
            ((this.complaintLevelDesc==null && other.getComplaintLevelDesc()==null) || 
             (this.complaintLevelDesc!=null &&
              this.complaintLevelDesc.equals(other.getComplaintLevelDesc()))) &&
            ((this.customerAdvisedofPossibleCharges==null && other.getCustomerAdvisedofPossibleCharges()==null) || 
             (this.customerAdvisedofPossibleCharges!=null &&
              this.customerAdvisedofPossibleCharges.equals(other.getCustomerAdvisedofPossibleCharges()))) &&
            ((this.issueType==null && other.getIssueType()==null) || 
             (this.issueType!=null &&
              this.issueType.equals(other.getIssueType()))) &&
            ((this.staffError==null && other.getStaffError()==null) || 
             (this.staffError!=null &&
              this.staffError.equals(other.getStaffError()))) &&
            ((this.staffDept==null && other.getStaffDept()==null) || 
             (this.staffDept!=null &&
              this.staffDept.equals(other.getStaffDept()))) &&
            ((this.staffPFID==null && other.getStaffPFID()==null) || 
             (this.staffPFID!=null &&
              this.staffPFID.equals(other.getStaffPFID()))) &&
            ((this.miniBillSMSMobileNumber==null && other.getMiniBillSMSMobileNumber()==null) || 
             (this.miniBillSMSMobileNumber!=null &&
              this.miniBillSMSMobileNumber.equals(other.getMiniBillSMSMobileNumber()))) &&
            ((this.EBillEmailID==null && other.getEBillEmailID()==null) || 
             (this.EBillEmailID!=null &&
              this.EBillEmailID.equals(other.getEBillEmailID()))) &&
            ((this.customerSatisfied==null && other.getCustomerSatisfied()==null) || 
             (this.customerSatisfied!=null &&
              this.customerSatisfied.equals(other.getCustomerSatisfied()))) &&
            ((this.customerFeedback==null && other.getCustomerFeedback()==null) || 
             (this.customerFeedback!=null &&
              this.customerFeedback.equals(other.getCustomerFeedback()))) &&
            ((this.physicalOrgID==null && other.getPhysicalOrgID()==null) || 
             (this.physicalOrgID!=null &&
              this.physicalOrgID.equals(other.getPhysicalOrgID()))) &&
            ((this.sendSMSFlag==null && other.getSendSMSFlag()==null) || 
             (this.sendSMSFlag!=null &&
              this.sendSMSFlag.equals(other.getSendSMSFlag()))) &&
            ((this.serviceAuthAndEquipmentDetails==null && other.getServiceAuthAndEquipmentDetails()==null) || 
             (this.serviceAuthAndEquipmentDetails!=null &&
              java.util.Arrays.equals(this.serviceAuthAndEquipmentDetails, other.getServiceAuthAndEquipmentDetails()))) &&
            ((this.GPONTestDetails==null && other.getGPONTestDetails()==null) || 
             (this.GPONTestDetails!=null &&
              java.util.Arrays.equals(this.GPONTestDetails, other.getGPONTestDetails()))) &&
            ((this.pendingServiceOrderDetails==null && other.getPendingServiceOrderDetails()==null) || 
             (this.pendingServiceOrderDetails!=null &&
              java.util.Arrays.equals(this.pendingServiceOrderDetails, other.getPendingServiceOrderDetails()))) &&
            ((this.previousComplaintHistory==null && other.getPreviousComplaintHistory()==null) || 
             (this.previousComplaintHistory!=null &&
              java.util.Arrays.equals(this.previousComplaintHistory, other.getPreviousComplaintHistory()))) &&
            ((this.PSTNAssurance==null && other.getPSTNAssurance()==null) || 
             (this.PSTNAssurance!=null &&
              java.util.Arrays.equals(this.PSTNAssurance, other.getPSTNAssurance()))) &&
            ((this.elifeAndEVision==null && other.getElifeAndEVision()==null) || 
             (this.elifeAndEVision!=null &&
              java.util.Arrays.equals(this.elifeAndEVision, other.getElifeAndEVision()))) &&
            ((this.LOCNETPMSDetails==null && other.getLOCNETPMSDetails()==null) || 
             (this.LOCNETPMSDetails!=null &&
              java.util.Arrays.equals(this.LOCNETPMSDetails, other.getLOCNETPMSDetails()))) &&
            ((this.dataProductsDetails==null && other.getDataProductsDetails()==null) || 
             (this.dataProductsDetails!=null &&
              java.util.Arrays.equals(this.dataProductsDetails, other.getDataProductsDetails()))) &&
            ((this.bistreamFields==null && other.getBistreamFields()==null) || 
             (this.bistreamFields!=null &&
              java.util.Arrays.equals(this.bistreamFields, other.getBistreamFields()))) &&
            ((this.SMSParameters==null && other.getSMSParameters()==null) || 
             (this.SMSParameters!=null &&
              this.SMSParameters.equals(other.getSMSParameters()))) &&
            ((this.unSuspendTime==null && other.getUnSuspendTime()==null) || 
             (this.unSuspendTime!=null &&
              this.unSuspendTime.equals(other.getUnSuspendTime()))) &&
            ((this.chargingCode==null && other.getChargingCode()==null) || 
             (this.chargingCode!=null &&
              this.chargingCode.equals(other.getChargingCode()))) &&
            ((this.DOPType==null && other.getDOPType()==null) || 
             (this.DOPType!=null &&
              this.DOPType.equals(other.getDOPType()))) &&
            ((this.DOPRemark==null && other.getDOPRemark()==null) || 
             (this.DOPRemark!=null &&
              this.DOPRemark.equals(other.getDOPRemark()))) &&
            ((this.DOPAmount==null && other.getDOPAmount()==null) || 
             (this.DOPAmount!=null &&
              this.DOPAmount.equals(other.getDOPAmount()))) &&
            ((this.callRecordingID==null && other.getCallRecordingID()==null) || 
             (this.callRecordingID!=null &&
              this.callRecordingID.equals(other.getCallRecordingID()))) &&
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
        if (getComplaintId() != null) {
            _hashCode += getComplaintId().hashCode();
        }
        if (getUCMSID() != null) {
            _hashCode += getUCMSID().hashCode();
        }
        if (getModifiedDate() != null) {
            _hashCode += getModifiedDate().hashCode();
        }
        if (getModifiedBy() != null) {
            _hashCode += getModifiedBy().hashCode();
        }
        if (getComplaintRemark() != null) {
            _hashCode += getComplaintRemark().hashCode();
        }
        if (getOpenTime() != null) {
            _hashCode += getOpenTime().hashCode();
        }
        if (getOpenedBy() != null) {
            _hashCode += getOpenedBy().hashCode();
        }
        if (getUrgency() != null) {
            _hashCode += getUrgency().hashCode();
        }
        if (getUpdatedTime() != null) {
            _hashCode += getUpdatedTime().hashCode();
        }
        if (getClosedDate() != null) {
            _hashCode += getClosedDate().hashCode();
        }
        if (getClosedBy() != null) {
            _hashCode += getClosedBy().hashCode();
        }
        if (getCompany() != null) {
            _hashCode += getCompany().hashCode();
        }
        if (getClosureCode() != null) {
            _hashCode += getClosureCode().hashCode();
        }
        if (getSolution() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSolution());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getSolution(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTicketOwner() != null) {
            _hashCode += getTicketOwner().hashCode();
        }
        if (getUpdatedBy() != null) {
            _hashCode += getUpdatedBy().hashCode();
        }
        if (getArea() != null) {
            _hashCode += getArea().hashCode();
        }
        if (getSiteCategory() != null) {
            _hashCode += getSiteCategory().hashCode();
        }
        if (getSubarea() != null) {
            _hashCode += getSubarea().hashCode();
        }
        if (getProblemType() != null) {
            _hashCode += getProblemType().hashCode();
        }
        if (getHasCustomerContacted() != null) {
            _hashCode += getHasCustomerContacted().hashCode();
        }
        if (getNewUCMSComplaintID() != null) {
            _hashCode += getNewUCMSComplaintID().hashCode();
        }
        if (getSystemType() != null) {
            _hashCode += getSystemType().hashCode();
        }
        if (getNetworkType() != null) {
            _hashCode += getNetworkType().hashCode();
        }
        if (getNetworkTypeDesc() != null) {
            _hashCode += getNetworkTypeDesc().hashCode();
        }
        if (getEIDNo() != null) {
            _hashCode += getEIDNo().hashCode();
        }
        if (getMainClearCode() != null) {
            _hashCode += getMainClearCode().hashCode();
        }
        if (getAuxClearCode() != null) {
            _hashCode += getAuxClearCode().hashCode();
        }
        if (getClearCode() != null) {
            _hashCode += getClearCode().hashCode();
        }
        if (getSuspendReason() != null) {
            _hashCode += getSuspendReason().hashCode();
        }
        if (getParkingReason() != null) {
            _hashCode += getParkingReason().hashCode();
        }
        if (getHandlingTime() != null) {
            _hashCode += getHandlingTime().hashCode();
        }
        if (getChargeCode() != null) {
            _hashCode += getChargeCode().hashCode();
        }
        if (getReasonCode() != null) {
            _hashCode += getReasonCode().hashCode();
        }
        if (getAdjustmentType() != null) {
            _hashCode += getAdjustmentType().hashCode();
        }
        if (getUserOrgUnit() != null) {
            _hashCode += getUserOrgUnit().hashCode();
        }
        if (getProductType() != null) {
            _hashCode += getProductType().hashCode();
        }
        if (getServiceDescription() != null) {
            _hashCode += getServiceDescription().hashCode();
        }
        if (getSubReqType() != null) {
            _hashCode += getSubReqType().hashCode();
        }
        if (getIVRNumber() != null) {
            _hashCode += getIVRNumber().hashCode();
        }
        if (getCustomerContactList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomerContactList());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getCustomerContactList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAttachmentList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAttachmentList());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getAttachmentList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCustomerLocation() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomerLocation());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getCustomerLocation(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDisputeAmount() != null) {
            _hashCode += getDisputeAmount().hashCode();
        }
        if (getRefundedAmount() != null) {
            _hashCode += getRefundedAmount().hashCode();
        }
        if (getRefundApprover() != null) {
            _hashCode += getRefundApprover().hashCode();
        }
        if (getComplaintDescription() != null) {
            _hashCode += getComplaintDescription().hashCode();
        }
        if (getFEProductGroup() != null) {
            _hashCode += getFEProductGroup().hashCode();
        }
        if (getFEProductGroupDesc() != null) {
            _hashCode += getFEProductGroupDesc().hashCode();
        }
        if (getProduct() != null) {
            _hashCode += getProduct().hashCode();
        }
        if (getProductdesc() != null) {
            _hashCode += getProductdesc().hashCode();
        }
        if (getRegionCode() != null) {
            _hashCode += getRegionCode().hashCode();
        }
        if (getRegion() != null) {
            _hashCode += getRegion().hashCode();
        }
        if (getSubRegionCode() != null) {
            _hashCode += getSubRegionCode().hashCode();
        }
        if (getSubRegion() != null) {
            _hashCode += getSubRegion().hashCode();
        }
        if (getLocation() != null) {
            _hashCode += getLocation().hashCode();
        }
        if (getEmirate() != null) {
            _hashCode += getEmirate().hashCode();
        }
        if (getProblemStartDate() != null) {
            _hashCode += getProblemStartDate().hashCode();
        }
        if (getComplaintPriorityFlag() != null) {
            _hashCode += getComplaintPriorityFlag().hashCode();
        }
        if (getHighSeverityFlag() != null) {
            _hashCode += getHighSeverityFlag().hashCode();
        }
        if (getChannelCode() != null) {
            _hashCode += getChannelCode().hashCode();
        }
        if (getCustomerSegment() != null) {
            _hashCode += getCustomerSegment().hashCode();
        }
        if (getActivityType() != null) {
            _hashCode += getActivityType().hashCode();
        }
        if (getCRSPriority() != null) {
            _hashCode += getCRSPriority().hashCode();
        }
        if (getCustomerfollowCounter() != null) {
            _hashCode += getCustomerfollowCounter().hashCode();
        }
        if (getCoverageEligibility() != null) {
            _hashCode += getCoverageEligibility().hashCode();
        }
        if (getCoverageLocation() != null) {
            _hashCode += getCoverageLocation().hashCode();
        }
        if (getValueSegment() != null) {
            _hashCode += getValueSegment().hashCode();
        }
        if (getWrongClassification() != null) {
            _hashCode += getWrongClassification().hashCode();
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
        if (getComplaintstatus() != null) {
            _hashCode += getComplaintstatus().hashCode();
        }
        if (getCreatedDate() != null) {
            _hashCode += getCreatedDate().hashCode();
        }
        if (getCreatedBy() != null) {
            _hashCode += getCreatedBy().hashCode();
        }
        if (getComplaintShortDescription() != null) {
            _hashCode += getComplaintShortDescription().hashCode();
        }
        if (getCategory() != null) {
            _hashCode += getCategory().hashCode();
        }
        if (getService() != null) {
            _hashCode += getService().hashCode();
        }
        if (getServiceDesc() != null) {
            _hashCode += getServiceDesc().hashCode();
        }
        if (getCustomerCategoryid() != null) {
            _hashCode += getCustomerCategoryid().hashCode();
        }
        if (getCustomerCategory() != null) {
            _hashCode += getCustomerCategory().hashCode();
        }
        if (getPartyName() != null) {
            _hashCode += getPartyName().hashCode();
        }
        if (getPriority() != null) {
            _hashCode += getPriority().hashCode();
        }
        if (getAssignmentGroup() != null) {
            _hashCode += getAssignmentGroup().hashCode();
        }
        if (getAssigneeName() != null) {
            _hashCode += getAssigneeName().hashCode();
        }
        if (getMTTId() != null) {
            _hashCode += getMTTId().hashCode();
        }
        if (getChannel() != null) {
            _hashCode += getChannel().hashCode();
        }
        if (getAccountNumber() != null) {
            _hashCode += getAccountNumber().hashCode();
        }
        if (getPartyId() != null) {
            _hashCode += getPartyId().hashCode();
        }
        if (getAccountFullName() != null) {
            _hashCode += getAccountFullName().hashCode();
        }
        if (getAccountStatus() != null) {
            _hashCode += getAccountStatus().hashCode();
        }
        if (getBulkComplaintFlag() != null) {
            _hashCode += getBulkComplaintFlag().hashCode();
        }
        if (getBulkComplaintID() != null) {
            _hashCode += getBulkComplaintID().hashCode();
        }
        if (getCustomerSegmentCode() != null) {
            _hashCode += getCustomerSegmentCode().hashCode();
        }
        if (getPreferredLanguage() != null) {
            _hashCode += getPreferredLanguage().hashCode();
        }
        if (getIsTier2Required() != null) {
            _hashCode += getIsTier2Required().hashCode();
        }
        if (getBitStreamParameter() != null) {
            _hashCode += getBitStreamParameter().hashCode();
        }
        if (getBitStreamFlag() != null) {
            _hashCode += getBitStreamFlag().hashCode();
        }
        if (getWholeSaleProductLines() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWholeSaleProductLines());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getWholeSaleProductLines(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBSLinkID() != null) {
            _hashCode += getBSLinkID().hashCode();
        }
        if (getWholeSaleCategory() != null) {
            _hashCode += getWholeSaleCategory().hashCode();
        }
        if (getWholeSaleSubCategory() != null) {
            _hashCode += getWholeSaleSubCategory().hashCode();
        }
        if (getBSRequestID() != null) {
            _hashCode += getBSRequestID().hashCode();
        }
        if (getBSMessageID() != null) {
            _hashCode += getBSMessageID().hashCode();
        }
        if (getDuComplaintID() != null) {
            _hashCode += getDuComplaintID().hashCode();
        }
        if (getIsTechnicalFlag() != null) {
            _hashCode += getIsTechnicalFlag().hashCode();
        }
        if (getTechnicalComplaintID() != null) {
            _hashCode += getTechnicalComplaintID().hashCode();
        }
        if (getDirect2CSTflag() != null) {
            _hashCode += getDirect2CSTflag().hashCode();
        }
        if (getSubRequestNumber() != null) {
            _hashCode += getSubRequestNumber().hashCode();
        }
        if (getInternetUserId() != null) {
            _hashCode += getInternetUserId().hashCode();
        }
        if (getInternetSpeed() != null) {
            _hashCode += getInternetSpeed().hashCode();
        }
        if (getAccountInstallationDate() != null) {
            _hashCode += getAccountInstallationDate().hashCode();
        }
        if (getExtentionNumber() != null) {
            _hashCode += getExtentionNumber().hashCode();
        }
        if (getNetworkmedium() != null) {
            _hashCode += getNetworkmedium().hashCode();
        }
        if (getComplaintLevel() != null) {
            _hashCode += getComplaintLevel().hashCode();
        }
        if (getComplaintLevelDesc() != null) {
            _hashCode += getComplaintLevelDesc().hashCode();
        }
        if (getCustomerAdvisedofPossibleCharges() != null) {
            _hashCode += getCustomerAdvisedofPossibleCharges().hashCode();
        }
        if (getIssueType() != null) {
            _hashCode += getIssueType().hashCode();
        }
        if (getStaffError() != null) {
            _hashCode += getStaffError().hashCode();
        }
        if (getStaffDept() != null) {
            _hashCode += getStaffDept().hashCode();
        }
        if (getStaffPFID() != null) {
            _hashCode += getStaffPFID().hashCode();
        }
        if (getMiniBillSMSMobileNumber() != null) {
            _hashCode += getMiniBillSMSMobileNumber().hashCode();
        }
        if (getEBillEmailID() != null) {
            _hashCode += getEBillEmailID().hashCode();
        }
        if (getCustomerSatisfied() != null) {
            _hashCode += getCustomerSatisfied().hashCode();
        }
        if (getCustomerFeedback() != null) {
            _hashCode += getCustomerFeedback().hashCode();
        }
        if (getPhysicalOrgID() != null) {
            _hashCode += getPhysicalOrgID().hashCode();
        }
        if (getSendSMSFlag() != null) {
            _hashCode += getSendSMSFlag().hashCode();
        }
        if (getServiceAuthAndEquipmentDetails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getServiceAuthAndEquipmentDetails());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getServiceAuthAndEquipmentDetails(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGPONTestDetails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGPONTestDetails());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getGPONTestDetails(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPendingServiceOrderDetails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPendingServiceOrderDetails());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getPendingServiceOrderDetails(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPreviousComplaintHistory() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPreviousComplaintHistory());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getPreviousComplaintHistory(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPSTNAssurance() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPSTNAssurance());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getPSTNAssurance(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getElifeAndEVision() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getElifeAndEVision());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getElifeAndEVision(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLOCNETPMSDetails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLOCNETPMSDetails());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getLOCNETPMSDetails(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDataProductsDetails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDataProductsDetails());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getDataProductsDetails(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBistreamFields() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBistreamFields());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getBistreamFields(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSMSParameters() != null) {
            _hashCode += getSMSParameters().hashCode();
        }
        if (getUnSuspendTime() != null) {
            _hashCode += getUnSuspendTime().hashCode();
        }
        if (getChargingCode() != null) {
            _hashCode += getChargingCode().hashCode();
        }
        if (getDOPType() != null) {
            _hashCode += getDOPType().hashCode();
        }
        if (getDOPRemark() != null) {
            _hashCode += getDOPRemark().hashCode();
        }
        if (getDOPAmount() != null) {
            _hashCode += getDOPAmount().hashCode();
        }
        if (getCallRecordingID() != null) {
            _hashCode += getCallRecordingID().hashCode();
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
        new org.apache.axis.description.TypeDesc(UpdateComplaintInUCMSRequestDataHeader.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", ">>UpdateComplaintInUCMSRequest>DataHeader"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("complaintId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "ComplaintId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("UCMSID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "UCMSID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modifiedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "ModifiedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modifiedBy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "ModifiedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("complaintRemark");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "ComplaintRemark"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("openTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "OpenTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("openedBy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "OpenedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("urgency");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "Urgency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updatedTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "UpdatedTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("closedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "ClosedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("closedBy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "ClosedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("company");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "Company"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("closureCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "ClosureCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("solution");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "Solution"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ticketOwner");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "TicketOwner"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updatedBy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "UpdatedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("area");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "Area"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("siteCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "SiteCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subarea");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "Subarea"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("problemType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "ProblemType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasCustomerContacted");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "HasCustomerContacted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newUCMSComplaintID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "NewUCMSComplaintID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("systemType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "SystemType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networkType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "NetworkType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networkTypeDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "NetworkTypeDesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EIDNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "EIDNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mainClearCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "MainClearCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("auxClearCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "AuxClearCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clearCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "ClearCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("suspendReason");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "SuspendReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parkingReason");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "ParkingReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("handlingTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "HandlingTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "ChargeCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reasonCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "ReasonCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adjustmentType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "AdjustmentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userOrgUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "UserOrgUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "ProductType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "ServiceDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subReqType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "SubReqType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IVRNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "IVRNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerContactList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "CustomerContactList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", ">>>UpdateComplaintInUCMSRequest>DataHeader>CustomerContactList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attachmentList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "AttachmentList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", ">>>UpdateComplaintInUCMSRequest>DataHeader>AttachmentList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerLocation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "CustomerLocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", ">>>UpdateComplaintInUCMSRequest>DataHeader>CustomerLocation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disputeAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "DisputeAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refundedAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "RefundedAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refundApprover");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "RefundApprover"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("complaintDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "ComplaintDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FEProductGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "FEProductGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FEProductGroupDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "FEProductGroupDesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("product");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "Product"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productdesc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "Productdesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regionCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "RegionCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("region");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "Region"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subRegionCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "SubRegionCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subRegion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "SubRegion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "Location"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emirate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "Emirate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("problemStartDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "ProblemStartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("complaintPriorityFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "ComplaintPriorityFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("highSeverityFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "HighSeverityFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("channelCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "ChannelCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerSegment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "CustomerSegment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activityType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "ActivityType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CRSPriority");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "CRSPriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerfollowCounter");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "CustomerfollowCounter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coverageEligibility");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "CoverageEligibility"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coverageLocation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "CoverageLocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valueSegment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "ValueSegment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wrongClassification");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "WrongClassification"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("complaintNature");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "ComplaintNature"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("complaintNatureDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "ComplaintNatureDesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("complaintType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "ComplaintType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("complaintTypeDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "ComplaintTypeDesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("complaintstatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "Complaintstatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "CreatedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdBy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "CreatedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("complaintShortDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "ComplaintShortDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("category");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "Category"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("service");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "Service"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "ServiceDesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerCategoryid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "CustomerCategoryid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "CustomerCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partyName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "PartyName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "Priority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assignmentGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "AssignmentGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assigneeName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "AssigneeName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MTTId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "MTTId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("channel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "Channel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "AccountNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partyId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "PartyId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountFullName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "AccountFullName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "AccountStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bulkComplaintFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "BulkComplaintFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bulkComplaintID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "BulkComplaintID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerSegmentCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "CustomerSegmentCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preferredLanguage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "PreferredLanguage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isTier2Required");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "isTier2Required"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bitStreamParameter");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "BitStreamParameter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bitStreamFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "BitStreamFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wholeSaleProductLines");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "WholeSaleProductLines"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BSLinkID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "BSLinkID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wholeSaleCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "WholeSaleCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wholeSaleSubCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "WholeSaleSubCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BSRequestID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "BSRequestID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BSMessageID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "BSMessageID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("duComplaintID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "DuComplaintID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isTechnicalFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "isTechnicalFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("technicalComplaintID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "TechnicalComplaintID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("direct2CSTflag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "Direct2CSTflag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subRequestNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "SubRequestNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internetUserId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "InternetUserId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internetSpeed");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "InternetSpeed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountInstallationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "AccountInstallationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extentionNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "ExtentionNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networkmedium");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "Networkmedium"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("complaintLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "ComplaintLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("complaintLevelDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "ComplaintLevelDesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerAdvisedofPossibleCharges");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "CustomerAdvisedofPossibleCharges"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issueType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "IssueType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("staffError");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "StaffError"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("staffDept");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "StaffDept"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("staffPFID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "StaffPFID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("miniBillSMSMobileNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "MiniBillSMSMobileNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EBillEmailID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "EBillEmailID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerSatisfied");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "CustomerSatisfied"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerFeedback");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "CustomerFeedback"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("physicalOrgID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "PhysicalOrgID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sendSMSFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "SendSMSFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceAuthAndEquipmentDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "ServiceAuthAndEquipmentDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", ">>>UpdateComplaintInUCMSRequest>DataHeader>ServiceAuthAndEquipmentDetails"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GPONTestDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "GPONTestDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", ">>>UpdateComplaintInUCMSRequest>DataHeader>GPONTestDetails"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pendingServiceOrderDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "PendingServiceOrderDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", ">>>UpdateComplaintInUCMSRequest>DataHeader>PendingServiceOrderDetails"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("previousComplaintHistory");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "PreviousComplaintHistory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", ">>>UpdateComplaintInUCMSRequest>DataHeader>PreviousComplaintHistory"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PSTNAssurance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "PSTNAssurance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", ">>>UpdateComplaintInUCMSRequest>DataHeader>PSTNAssurance"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("elifeAndEVision");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "ElifeAndEVision"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", ">>>UpdateComplaintInUCMSRequest>DataHeader>ElifeAndEVision"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LOCNETPMSDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "LOCNETPMSDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", ">>>UpdateComplaintInUCMSRequest>DataHeader>LOCNETPMSDetails"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataProductsDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "DataProductsDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", ">>>UpdateComplaintInUCMSRequest>DataHeader>DataProductsDetails"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bistreamFields");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "BistreamFields"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", ">>>UpdateComplaintInUCMSRequest>DataHeader>BistreamFields"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SMSParameters");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "SMSParameters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", ">>>UpdateComplaintInUCMSRequest>DataHeader>SMSParameters"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unSuspendTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "UnSuspendTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargingCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "ChargingCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DOPType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "DOPType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DOPRemark");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "DOPRemark"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DOPAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "DOPAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callRecordingID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "CallRecordingID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", "AdditionalInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/UCMSComplaintIntegration/UpdateComplaintDetailsInUCMSRequest.xsd", ">>>UpdateComplaintInUCMSRequest>DataHeader>AdditionalInfo"));
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
