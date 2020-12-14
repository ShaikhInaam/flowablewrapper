/**
 * GetAccountDetailsResponseResponseHeaderAccountDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd;

public class GetAccountDetailsResponseResponseHeaderAccountDetails  implements java.io.Serializable {
    private String originTransactionID;

    private String firstIVRCallFlag;

    private String languageIDCurrent;

    private String languageIDDesc;

    private String serviceClassCurrent;

    private String serviceClassOriginal;

    private String serviceClassTemporaryExpiryDate;

    private String ussdEndOfCallNotificationID;

    private String accountGroupID;

    private GetAccountDetailsResponseResponseHeaderAccountDetailsServiceOfferings[] serviceOfferings;

    private GetAccountDetailsResponseResponseHeaderAccountDetailsCommunityInformationCurrent[] communityInformationCurrent;

    private String temporaryBlockedFlag;

    private String accountActivatedFlag;

    private String activationDate;

    private ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.GetAccountDetailsResponseResponseHeaderAccountDetailsAccountFlags accountFlags;

    private String masterSubscriberFlag;

    private String masterAccountNumber;

    private String refillUnbarDateTime;

    private String promotionAnnouncementCode;

    private String promotionPlanID;

    private String promotionStartDate;

    private String promotionEndDate;

    private String supervisionExpiryDate;

    private String creditClearanceDate;

    private String serviceRemovalDate;

    private String serviceFeeExpiryDate;

    private String serviceClassChangeUnbarDate;

    private String serviceFeePeriod;

    private String supervisionPeriod;

    private String serviceRemovalPeriod;

    private String creditClearancePeriod;

    private String currency1;

    private String accountValue1;

    private String currency2;

    private String accountValue2;

    private String accountHomeRegion;

    private String pinCode;

    private String aggregatedBalance1;

    private String aggregatedBalance2;

    private ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.GetAccountDetailsResponseResponseHeaderAccountDetailsPamInformationListPamInformation[] pamInformationList;

    private String maxServiceFeePeriod;

    private String maxSupervisionPeriod;

    private String negativeBalanceBarringDate;

    private GetAccountDetailsResponseResponseHeaderAccountDetailsAccountFlagsBefore accountFlagsBefore;

    private ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.GetAccountDetailsResponseResponseHeaderAccountDetailsOfferInformationList[] offerInformationList;

    private String accountTimeZone;

    private String negotiatedCapabilities;

    private String availableServerCapabalities;

    private String cellIdentifier;

    private String locationNumber;

    private String accountPrepaidEmptyLimit1;

    private String accountPrepaidEmptyLimit2;

    public GetAccountDetailsResponseResponseHeaderAccountDetails() {
    }

    public GetAccountDetailsResponseResponseHeaderAccountDetails(
           String originTransactionID,
           String firstIVRCallFlag,
           String languageIDCurrent,
           String languageIDDesc,
           String serviceClassCurrent,
           String serviceClassOriginal,
           String serviceClassTemporaryExpiryDate,
           String ussdEndOfCallNotificationID,
           String accountGroupID,
           GetAccountDetailsResponseResponseHeaderAccountDetailsServiceOfferings[] serviceOfferings,
           GetAccountDetailsResponseResponseHeaderAccountDetailsCommunityInformationCurrent[] communityInformationCurrent,
           String temporaryBlockedFlag,
           String accountActivatedFlag,
           String activationDate,
           ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.GetAccountDetailsResponseResponseHeaderAccountDetailsAccountFlags accountFlags,
           String masterSubscriberFlag,
           String masterAccountNumber,
           String refillUnbarDateTime,
           String promotionAnnouncementCode,
           String promotionPlanID,
           String promotionStartDate,
           String promotionEndDate,
           String supervisionExpiryDate,
           String creditClearanceDate,
           String serviceRemovalDate,
           String serviceFeeExpiryDate,
           String serviceClassChangeUnbarDate,
           String serviceFeePeriod,
           String supervisionPeriod,
           String serviceRemovalPeriod,
           String creditClearancePeriod,
           String currency1,
           String accountValue1,
           String currency2,
           String accountValue2,
           String accountHomeRegion,
           String pinCode,
           String aggregatedBalance1,
           String aggregatedBalance2,
           ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.GetAccountDetailsResponseResponseHeaderAccountDetailsPamInformationListPamInformation[] pamInformationList,
           String maxServiceFeePeriod,
           String maxSupervisionPeriod,
           String negativeBalanceBarringDate,
           GetAccountDetailsResponseResponseHeaderAccountDetailsAccountFlagsBefore accountFlagsBefore,
           ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.GetAccountDetailsResponseResponseHeaderAccountDetailsOfferInformationList[] offerInformationList,
           String accountTimeZone,
           String negotiatedCapabilities,
           String availableServerCapabalities,
           String cellIdentifier,
           String locationNumber,
           String accountPrepaidEmptyLimit1,
           String accountPrepaidEmptyLimit2) {
           this.originTransactionID = originTransactionID;
           this.firstIVRCallFlag = firstIVRCallFlag;
           this.languageIDCurrent = languageIDCurrent;
           this.languageIDDesc = languageIDDesc;
           this.serviceClassCurrent = serviceClassCurrent;
           this.serviceClassOriginal = serviceClassOriginal;
           this.serviceClassTemporaryExpiryDate = serviceClassTemporaryExpiryDate;
           this.ussdEndOfCallNotificationID = ussdEndOfCallNotificationID;
           this.accountGroupID = accountGroupID;
           this.serviceOfferings = serviceOfferings;
           this.communityInformationCurrent = communityInformationCurrent;
           this.temporaryBlockedFlag = temporaryBlockedFlag;
           this.accountActivatedFlag = accountActivatedFlag;
           this.activationDate = activationDate;
           this.accountFlags = accountFlags;
           this.masterSubscriberFlag = masterSubscriberFlag;
           this.masterAccountNumber = masterAccountNumber;
           this.refillUnbarDateTime = refillUnbarDateTime;
           this.promotionAnnouncementCode = promotionAnnouncementCode;
           this.promotionPlanID = promotionPlanID;
           this.promotionStartDate = promotionStartDate;
           this.promotionEndDate = promotionEndDate;
           this.supervisionExpiryDate = supervisionExpiryDate;
           this.creditClearanceDate = creditClearanceDate;
           this.serviceRemovalDate = serviceRemovalDate;
           this.serviceFeeExpiryDate = serviceFeeExpiryDate;
           this.serviceClassChangeUnbarDate = serviceClassChangeUnbarDate;
           this.serviceFeePeriod = serviceFeePeriod;
           this.supervisionPeriod = supervisionPeriod;
           this.serviceRemovalPeriod = serviceRemovalPeriod;
           this.creditClearancePeriod = creditClearancePeriod;
           this.currency1 = currency1;
           this.accountValue1 = accountValue1;
           this.currency2 = currency2;
           this.accountValue2 = accountValue2;
           this.accountHomeRegion = accountHomeRegion;
           this.pinCode = pinCode;
           this.aggregatedBalance1 = aggregatedBalance1;
           this.aggregatedBalance2 = aggregatedBalance2;
           this.pamInformationList = pamInformationList;
           this.maxServiceFeePeriod = maxServiceFeePeriod;
           this.maxSupervisionPeriod = maxSupervisionPeriod;
           this.negativeBalanceBarringDate = negativeBalanceBarringDate;
           this.accountFlagsBefore = accountFlagsBefore;
           this.offerInformationList = offerInformationList;
           this.accountTimeZone = accountTimeZone;
           this.negotiatedCapabilities = negotiatedCapabilities;
           this.availableServerCapabalities = availableServerCapabalities;
           this.cellIdentifier = cellIdentifier;
           this.locationNumber = locationNumber;
           this.accountPrepaidEmptyLimit1 = accountPrepaidEmptyLimit1;
           this.accountPrepaidEmptyLimit2 = accountPrepaidEmptyLimit2;
    }


    /**
     * Gets the originTransactionID value for this GetAccountDetailsResponseResponseHeaderAccountDetails.
     * 
     * @return originTransactionID
     */
    public String getOriginTransactionID() {
        return originTransactionID;
    }


    /**
     * Sets the originTransactionID value for this GetAccountDetailsResponseResponseHeaderAccountDetails.
     * 
     * @param originTransactionID
     */
    public void setOriginTransactionID(String originTransactionID) {
        this.originTransactionID = originTransactionID;
    }


    /**
     * Gets the firstIVRCallFlag value for this GetAccountDetailsResponseResponseHeaderAccountDetails.
     * 
     * @return firstIVRCallFlag
     */
    public String getFirstIVRCallFlag() {
        return firstIVRCallFlag;
    }


    /**
     * Sets the firstIVRCallFlag value for this GetAccountDetailsResponseResponseHeaderAccountDetails.
     * 
     * @param firstIVRCallFlag
     */
    public void setFirstIVRCallFlag(String firstIVRCallFlag) {
        this.firstIVRCallFlag = firstIVRCallFlag;
    }


    /**
     * Gets the languageIDCurrent value for this GetAccountDetailsResponseResponseHeaderAccountDetails.
     * 
     * @return languageIDCurrent
     */
    public String getLanguageIDCurrent() {
        return languageIDCurrent;
    }


    /**
     * Sets the languageIDCurrent value for this GetAccountDetailsResponseResponseHeaderAccountDetails.
     * 
     * @param languageIDCurrent
     */
    public void setLanguageIDCurrent(String languageIDCurrent) {
        this.languageIDCurrent = languageIDCurrent;
    }


    /**
     * Gets the languageIDDesc value for this GetAccountDetailsResponseResponseHeaderAccountDetails.
     * 
     * @return languageIDDesc
     */
    public String getLanguageIDDesc() {
        return languageIDDesc;
    }


    /**
     * Sets the languageIDDesc value for this GetAccountDetailsResponseResponseHeaderAccountDetails.
     * 
     * @param languageIDDesc
     */
    public void setLanguageIDDesc(String languageIDDesc) {
        this.languageIDDesc = languageIDDesc;
    }


    /**
     * Gets the serviceClassCurrent value for this GetAccountDetailsResponseResponseHeaderAccountDetails.
     * 
     * @return serviceClassCurrent
     */
    public String getServiceClassCurrent() {
        return serviceClassCurrent;
    }


    /**
     * Sets the serviceClassCurrent value for this GetAccountDetailsResponseResponseHeaderAccountDetails.
     * 
     * @param serviceClassCurrent
     */
    public void setServiceClassCurrent(String serviceClassCurrent) {
        this.serviceClassCurrent = serviceClassCurrent;
    }


    /**
     * Gets the serviceClassOriginal value for this GetAccountDetailsResponseResponseHeaderAccountDetails.
     * 
     * @return serviceClassOriginal
     */
    public String getServiceClassOriginal() {
        return serviceClassOriginal;
    }


    /**
     * Sets the serviceClassOriginal value for this GetAccountDetailsResponseResponseHeaderAccountDetails.
     * 
     * @param serviceClassOriginal
     */
    public void setServiceClassOriginal(String serviceClassOriginal) {
        this.serviceClassOriginal = serviceClassOriginal;
    }


    /**
     * Gets the serviceClassTemporaryExpiryDate value for this GetAccountDetailsResponseResponseHeaderAccountDetails.
     * 
     * @return serviceClassTemporaryExpiryDate
     */
    public String getServiceClassTemporaryExpiryDate() {
        return serviceClassTemporaryExpiryDate;
    }


    /**
     * Sets the serviceClassTemporaryExpiryDate value for this GetAccountDetailsResponseResponseHeaderAccountDetails.
     * 
     * @param serviceClassTemporaryExpiryDate
     */
    public void setServiceClassTemporaryExpiryDate(String serviceClassTemporaryExpiryDate) {
        this.serviceClassTemporaryExpiryDate = serviceClassTemporaryExpiryDate;
    }


    /**
     * Gets the ussdEndOfCallNotificationID value for this GetAccountDetailsResponseResponseHeaderAccountDetails.
     * 
     * @return ussdEndOfCallNotificationID
     */
    public String getUssdEndOfCallNotificationID() {
        return ussdEndOfCallNotificationID;
    }


    /**
     * Sets the ussdEndOfCallNotificationID value for this GetAccountDetailsResponseResponseHeaderAccountDetails.
     * 
     * @param ussdEndOfCallNotificationID
     */
    public void setUssdEndOfCallNotificationID(String ussdEndOfCallNotificationID) {
        this.ussdEndOfCallNotificationID = ussdEndOfCallNotificationID;
    }


    /**
     * Gets the accountGroupID value for this GetAccountDetailsResponseResponseHeaderAccountDetails.
     * 
     * @return accountGroupID
     */
    public String getAccountGroupID() {
        return accountGroupID;
    }


    /**
     * Sets the accountGroupID value for this GetAccountDetailsResponseResponseHeaderAccountDetails.
     * 
     * @param accountGroupID
     */
    public void setAccountGroupID(String accountGroupID) {
        this.accountGroupID = accountGroupID;
    }


    /**
     * Gets the serviceOfferings value for this GetAccountDetailsResponseResponseHeaderAccountDetails.
     * 
     * @return serviceOfferings
     */
    public GetAccountDetailsResponseResponseHeaderAccountDetailsServiceOfferings[] getServiceOfferings() {
        return serviceOfferings;
    }


    /**
     * Sets the serviceOfferings value for this GetAccountDetailsResponseResponseHeaderAccountDetails.
     * 
     * @param serviceOfferings
     */
    public void setServiceOfferings(GetAccountDetailsResponseResponseHeaderAccountDetailsServiceOfferings[] serviceOfferings) {
        this.serviceOfferings = serviceOfferings;
    }

    public GetAccountDetailsResponseResponseHeaderAccountDetailsServiceOfferings getServiceOfferings(int i) {
        return this.serviceOfferings[i];
    }

    public void setServiceOfferings(int i, GetAccountDetailsResponseResponseHeaderAccountDetailsServiceOfferings _value) {
        this.serviceOfferings[i] = _value;
    }


    /**
     * Gets the communityInformationCurrent value for this GetAccountDetailsResponseResponseHeaderAccountDetails.
     * 
     * @return communityInformationCurrent
     */
    public GetAccountDetailsResponseResponseHeaderAccountDetailsCommunityInformationCurrent[] getCommunityInformationCurrent() {
        return communityInformationCurrent;
    }


    /**
     * Sets the communityInformationCurrent value for this GetAccountDetailsResponseResponseHeaderAccountDetails.
     * 
     * @param communityInformationCurrent
     */
    public void setCommunityInformationCurrent(GetAccountDetailsResponseResponseHeaderAccountDetailsCommunityInformationCurrent[] communityInformationCurrent) {
        this.communityInformationCurrent = communityInformationCurrent;
    }

    public GetAccountDetailsResponseResponseHeaderAccountDetailsCommunityInformationCurrent getCommunityInformationCurrent(int i) {
        return this.communityInformationCurrent[i];
    }

    public void setCommunityInformationCurrent(int i, GetAccountDetailsResponseResponseHeaderAccountDetailsCommunityInformationCurrent _value) {
        this.communityInformationCurrent[i] = _value;
    }


    /**
     * Gets the temporaryBlockedFlag value for this GetAccountDetailsResponseResponseHeaderAccountDetails.
     * 
     * @return temporaryBlockedFlag
     */
    public String getTemporaryBlockedFlag() {
        return temporaryBlockedFlag;
    }


    /**
     * Sets the temporaryBlockedFlag value for this GetAccountDetailsResponseResponseHeaderAccountDetails.
     * 
     * @param temporaryBlockedFlag
     */
    public void setTemporaryBlockedFlag(String temporaryBlockedFlag) {
        this.temporaryBlockedFlag = temporaryBlockedFlag;
    }


    /**
     * Gets the accountActivatedFlag value for this GetAccountDetailsResponseResponseHeaderAccountDetails.
     * 
     * @return accountActivatedFlag
     */
    public String getAccountActivatedFlag() {
        return accountActivatedFlag;
    }


    /**
     * Sets the accountActivatedFlag value for this GetAccountDetailsResponseResponseHeaderAccountDetails.
     * 
     * @param accountActivatedFlag
     */
    public void setAccountActivatedFlag(String accountActivatedFlag) {
        this.accountActivatedFlag = accountActivatedFlag;
    }


    /**
     * Gets the activationDate value for this GetAccountDetailsResponseResponseHeaderAccountDetails.
     * 
     * @return activationDate
     */
    public String getActivationDate() {
        return activationDate;
    }


    /**
     * Sets the activationDate value for this GetAccountDetailsResponseResponseHeaderAccountDetails.
     * 
     * @param activationDate
     */
    public void setActivationDate(String activationDate) {
        this.activationDate = activationDate;
    }


    /**
     * Gets the accountFlags value for this GetAccountDetailsResponseResponseHeaderAccountDetails.
     * 
     * @return accountFlags
     */
    public ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.GetAccountDetailsResponseResponseHeaderAccountDetailsAccountFlags getAccountFlags() {
        return accountFlags;
    }


    /**
     * Sets the accountFlags value for this GetAccountDetailsResponseResponseHeaderAccountDetails.
     * 
     * @param accountFlags
     */
    public void setAccountFlags(ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.GetAccountDetailsResponseResponseHeaderAccountDetailsAccountFlags accountFlags) {
        this.accountFlags = accountFlags;
    }


    /**
     * Gets the masterSubscriberFlag value for this GetAccountDetailsResponseResponseHeaderAccountDetails.
     * 
     * @return masterSubscriberFlag
     */
    public String getMasterSubscriberFlag() {
        return masterSubscriberFlag;
    }


    /**
     * Sets the masterSubscriberFlag value for this GetAccountDetailsResponseResponseHeaderAccountDetails.
     * 
     * @param masterSubscriberFlag
     */
    public void setMasterSubscriberFlag(String masterSubscriberFlag) {
        this.masterSubscriberFlag = masterSubscriberFlag;
    }


    /**
     * Gets the masterAccountNumber value for this GetAccountDetailsResponseResponseHeaderAccountDetails.
     * 
     * @return masterAccountNumber
     */
    public String getMasterAccountNumber() {
        return masterAccountNumber;
    }


    /**
     * Sets the masterAccountNumber value for this GetAccountDetailsResponseResponseHeaderAccountDetails.
     * 
     * @param masterAccountNumber
     */
    public void setMasterAccountNumber(String masterAccountNumber) {
        this.masterAccountNumber = masterAccountNumber;
    }


    /**
     * Gets the refillUnbarDateTime value for this GetAccountDetailsResponseResponseHeaderAccountDetails.
     * 
     * @return refillUnbarDateTime
     */
    public String getRefillUnbarDateTime() {
        return refillUnbarDateTime;
    }


    /**
     * Sets the refillUnbarDateTime value for this GetAccountDetailsResponseResponseHeaderAccountDetails.
     * 
     * @param refillUnbarDateTime
     */
    public void setRefillUnbarDateTime(String refillUnbarDateTime) {
        this.refillUnbarDateTime = refillUnbarDateTime;
    }


    /**
     * Gets the promotionAnnouncementCode value for this GetAccountDetailsResponseResponseHeaderAccountDetails.
     * 
     * @return promotionAnnouncementCode
     */
    public String getPromotionAnnouncementCode() {
        return promotionAnnouncementCode;
    }


    /**
     * Sets the promotionAnnouncementCode value for this GetAccountDetailsResponseResponseHeaderAccountDetails.
     * 
     * @param promotionAnnouncementCode
     */
    public void setPromotionAnnouncementCode(String promotionAnnouncementCode) {
        this.promotionAnnouncementCode = promotionAnnouncementCode;
    }


    /**
     * Gets the promotionPlanID value for this GetAccountDetailsResponseResponseHeaderAccountDetails.
     * 
     * @return promotionPlanID
     */
    public String getPromotionPlanID() {
        return promotionPlanID;
    }


    /**
     * Sets the promotionPlanID value for this GetAccountDetailsResponseResponseHeaderAccountDetails.
     * 
     * @param promotionPlanID
     */
    public void setPromotionPlanID(String promotionPlanID) {
        this.promotionPlanID = promotionPlanID;
    }


    /**
     * Gets the promotionStartDate value for this GetAccountDetailsResponseResponseHeaderAccountDetails.
     * 
     * @return promotionStartDate
     */
    public String getPromotionStartDate() {
        return promotionStartDate;
    }


    /**
     * Sets the promotionStartDate value for this GetAccountDetailsResponseResponseHeaderAccountDetails.
     * 
     * @param promotionStartDate
     */
    public void setPromotionStartDate(String promotionStartDate) {
        this.promotionStartDate = promotionStartDate;
    }


    /**
     * Gets the promotionEndDate value for this GetAccountDetailsResponseResponseHeaderAccountDetails.
     * 
     * @return promotionEndDate
     */
    public String getPromotionEndDate() {
        return promotionEndDate;
    }


    /**
     * Sets the promotionEndDate value for this GetAccountDetailsResponseResponseHeaderAccountDetails.
     * 
     * @param promotionEndDate
     */
    public void setPromotionEndDate(String promotionEndDate) {
        this.promotionEndDate = promotionEndDate;
    }


    /**
     * Gets the supervisionExpiryDate value for this GetAccountDetailsResponseResponseHeaderAccountDetails.
     * 
     * @return supervisionExpiryDate
     */
    public String getSupervisionExpiryDate() {
        return supervisionExpiryDate;
    }


    /**
     * Sets the supervisionExpiryDate value for this GetAccountDetailsResponseResponseHeaderAccountDetails.
     * 
     * @param supervisionExpiryDate
     */
    public void setSupervisionExpiryDate(String supervisionExpiryDate) {
        this.supervisionExpiryDate = supervisionExpiryDate;
    }


    /**
     * Gets the creditClearanceDate value for this GetAccountDetailsResponseResponseHeaderAccountDetails.
     * 
     * @return creditClearanceDate
     */
    public String getCreditClearanceDate() {
        return creditClearanceDate;
    }


    /**
     * Sets the creditClearanceDate value for this GetAccountDetailsResponseResponseHeaderAccountDetails.
     * 
     * @param creditClearanceDate
     */
    public void setCreditClearanceDate(String creditClearanceDate) {
        this.creditClearanceDate = creditClearanceDate;
    }


    /**
     * Gets the serviceRemovalDate value for this GetAccountDetailsResponseResponseHeaderAccountDetails.
     * 
     * @return serviceRemovalDate
     */
    public String getServiceRemovalDate() {
        return serviceRemovalDate;
    }


    /**
     * Sets the serviceRemovalDate value for this GetAccountDetailsResponseResponseHeaderAccountDetails.
     * 
     * @param serviceRemovalDate
     */
    public void setServiceRemovalDate(String serviceRemovalDate) {
        this.serviceRemovalDate = serviceRemovalDate;
    }


    /**
     * Gets the serviceFeeExpiryDate value for this GetAccountDetailsResponseResponseHeaderAccountDetails.
     * 
     * @return serviceFeeExpiryDate
     */
    public String getServiceFeeExpiryDate() {
        return serviceFeeExpiryDate;
    }


    /**
     * Sets the serviceFeeExpiryDate value for this GetAccountDetailsResponseResponseHeaderAccountDetails.
     * 
     * @param serviceFeeExpiryDate
     */
    public void setServiceFeeExpiryDate(String serviceFeeExpiryDate) {
        this.serviceFeeExpiryDate = serviceFeeExpiryDate;
    }


    /**
     * Gets the serviceClassChangeUnbarDate value for this GetAccountDetailsResponseResponseHeaderAccountDetails.
     * 
     * @return serviceClassChangeUnbarDate
     */
    public String getServiceClassChangeUnbarDate() {
        return serviceClassChangeUnbarDate;
    }


    /**
     * Sets the serviceClassChangeUnbarDate value for this GetAccountDetailsResponseResponseHeaderAccountDetails.
     * 
     * @param serviceClassChangeUnbarDate
     */
    public void setServiceClassChangeUnbarDate(String serviceClassChangeUnbarDate) {
        this.serviceClassChangeUnbarDate = serviceClassChangeUnbarDate;
    }


    /**
     * Gets the serviceFeePeriod value for this GetAccountDetailsResponseResponseHeaderAccountDetails.
     * 
     * @return serviceFeePeriod
     */
    public String getServiceFeePeriod() {
        return serviceFeePeriod;
    }


    /**
     * Sets the serviceFeePeriod value for this GetAccountDetailsResponseResponseHeaderAccountDetails.
     * 
     * @param serviceFeePeriod
     */
    public void setServiceFeePeriod(String serviceFeePeriod) {
        this.serviceFeePeriod = serviceFeePeriod;
    }


    /**
     * Gets the supervisionPeriod value for this GetAccountDetailsResponseResponseHeaderAccountDetails.
     * 
     * @return supervisionPeriod
     */
    public String getSupervisionPeriod() {
        return supervisionPeriod;
    }


    /**
     * Sets the supervisionPeriod value for this GetAccountDetailsResponseResponseHeaderAccountDetails.
     * 
     * @param supervisionPeriod
     */
    public void setSupervisionPeriod(String supervisionPeriod) {
        this.supervisionPeriod = supervisionPeriod;
    }


    /**
     * Gets the serviceRemovalPeriod value for this GetAccountDetailsResponseResponseHeaderAccountDetails.
     * 
     * @return serviceRemovalPeriod
     */
    public String getServiceRemovalPeriod() {
        return serviceRemovalPeriod;
    }


    /**
     * Sets the serviceRemovalPeriod value for this GetAccountDetailsResponseResponseHeaderAccountDetails.
     * 
     * @param serviceRemovalPeriod
     */
    public void setServiceRemovalPeriod(String serviceRemovalPeriod) {
        this.serviceRemovalPeriod = serviceRemovalPeriod;
    }


    /**
     * Gets the creditClearancePeriod value for this GetAccountDetailsResponseResponseHeaderAccountDetails.
     * 
     * @return creditClearancePeriod
     */
    public String getCreditClearancePeriod() {
        return creditClearancePeriod;
    }


    /**
     * Sets the creditClearancePeriod value for this GetAccountDetailsResponseResponseHeaderAccountDetails.
     * 
     * @param creditClearancePeriod
     */
    public void setCreditClearancePeriod(String creditClearancePeriod) {
        this.creditClearancePeriod = creditClearancePeriod;
    }


    /**
     * Gets the currency1 value for this GetAccountDetailsResponseResponseHeaderAccountDetails.
     * 
     * @return currency1
     */
    public String getCurrency1() {
        return currency1;
    }


    /**
     * Sets the currency1 value for this GetAccountDetailsResponseResponseHeaderAccountDetails.
     * 
     * @param currency1
     */
    public void setCurrency1(String currency1) {
        this.currency1 = currency1;
    }


    /**
     * Gets the accountValue1 value for this GetAccountDetailsResponseResponseHeaderAccountDetails.
     * 
     * @return accountValue1
     */
    public String getAccountValue1() {
        return accountValue1;
    }


    /**
     * Sets the accountValue1 value for this GetAccountDetailsResponseResponseHeaderAccountDetails.
     * 
     * @param accountValue1
     */
    public void setAccountValue1(String accountValue1) {
        this.accountValue1 = accountValue1;
    }


    /**
     * Gets the currency2 value for this GetAccountDetailsResponseResponseHeaderAccountDetails.
     * 
     * @return currency2
     */
    public String getCurrency2() {
        return currency2;
    }


    /**
     * Sets the currency2 value for this GetAccountDetailsResponseResponseHeaderAccountDetails.
     * 
     * @param currency2
     */
    public void setCurrency2(String currency2) {
        this.currency2 = currency2;
    }


    /**
     * Gets the accountValue2 value for this GetAccountDetailsResponseResponseHeaderAccountDetails.
     * 
     * @return accountValue2
     */
    public String getAccountValue2() {
        return accountValue2;
    }


    /**
     * Sets the accountValue2 value for this GetAccountDetailsResponseResponseHeaderAccountDetails.
     * 
     * @param accountValue2
     */
    public void setAccountValue2(String accountValue2) {
        this.accountValue2 = accountValue2;
    }


    /**
     * Gets the accountHomeRegion value for this GetAccountDetailsResponseResponseHeaderAccountDetails.
     * 
     * @return accountHomeRegion
     */
    public String getAccountHomeRegion() {
        return accountHomeRegion;
    }


    /**
     * Sets the accountHomeRegion value for this GetAccountDetailsResponseResponseHeaderAccountDetails.
     * 
     * @param accountHomeRegion
     */
    public void setAccountHomeRegion(String accountHomeRegion) {
        this.accountHomeRegion = accountHomeRegion;
    }


    /**
     * Gets the pinCode value for this GetAccountDetailsResponseResponseHeaderAccountDetails.
     * 
     * @return pinCode
     */
    public String getPinCode() {
        return pinCode;
    }


    /**
     * Sets the pinCode value for this GetAccountDetailsResponseResponseHeaderAccountDetails.
     * 
     * @param pinCode
     */
    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }


    /**
     * Gets the aggregatedBalance1 value for this GetAccountDetailsResponseResponseHeaderAccountDetails.
     * 
     * @return aggregatedBalance1
     */
    public String getAggregatedBalance1() {
        return aggregatedBalance1;
    }


    /**
     * Sets the aggregatedBalance1 value for this GetAccountDetailsResponseResponseHeaderAccountDetails.
     * 
     * @param aggregatedBalance1
     */
    public void setAggregatedBalance1(String aggregatedBalance1) {
        this.aggregatedBalance1 = aggregatedBalance1;
    }


    /**
     * Gets the aggregatedBalance2 value for this GetAccountDetailsResponseResponseHeaderAccountDetails.
     * 
     * @return aggregatedBalance2
     */
    public String getAggregatedBalance2() {
        return aggregatedBalance2;
    }


    /**
     * Sets the aggregatedBalance2 value for this GetAccountDetailsResponseResponseHeaderAccountDetails.
     * 
     * @param aggregatedBalance2
     */
    public void setAggregatedBalance2(String aggregatedBalance2) {
        this.aggregatedBalance2 = aggregatedBalance2;
    }


    /**
     * Gets the pamInformationList value for this GetAccountDetailsResponseResponseHeaderAccountDetails.
     * 
     * @return pamInformationList
     */
    public ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.GetAccountDetailsResponseResponseHeaderAccountDetailsPamInformationListPamInformation[] getPamInformationList() {
        return pamInformationList;
    }


    /**
     * Sets the pamInformationList value for this GetAccountDetailsResponseResponseHeaderAccountDetails.
     * 
     * @param pamInformationList
     */
    public void setPamInformationList(ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.GetAccountDetailsResponseResponseHeaderAccountDetailsPamInformationListPamInformation[] pamInformationList) {
        this.pamInformationList = pamInformationList;
    }


    /**
     * Gets the maxServiceFeePeriod value for this GetAccountDetailsResponseResponseHeaderAccountDetails.
     * 
     * @return maxServiceFeePeriod
     */
    public String getMaxServiceFeePeriod() {
        return maxServiceFeePeriod;
    }


    /**
     * Sets the maxServiceFeePeriod value for this GetAccountDetailsResponseResponseHeaderAccountDetails.
     * 
     * @param maxServiceFeePeriod
     */
    public void setMaxServiceFeePeriod(String maxServiceFeePeriod) {
        this.maxServiceFeePeriod = maxServiceFeePeriod;
    }


    /**
     * Gets the maxSupervisionPeriod value for this GetAccountDetailsResponseResponseHeaderAccountDetails.
     * 
     * @return maxSupervisionPeriod
     */
    public String getMaxSupervisionPeriod() {
        return maxSupervisionPeriod;
    }


    /**
     * Sets the maxSupervisionPeriod value for this GetAccountDetailsResponseResponseHeaderAccountDetails.
     * 
     * @param maxSupervisionPeriod
     */
    public void setMaxSupervisionPeriod(String maxSupervisionPeriod) {
        this.maxSupervisionPeriod = maxSupervisionPeriod;
    }


    /**
     * Gets the negativeBalanceBarringDate value for this GetAccountDetailsResponseResponseHeaderAccountDetails.
     * 
     * @return negativeBalanceBarringDate
     */
    public String getNegativeBalanceBarringDate() {
        return negativeBalanceBarringDate;
    }


    /**
     * Sets the negativeBalanceBarringDate value for this GetAccountDetailsResponseResponseHeaderAccountDetails.
     * 
     * @param negativeBalanceBarringDate
     */
    public void setNegativeBalanceBarringDate(String negativeBalanceBarringDate) {
        this.negativeBalanceBarringDate = negativeBalanceBarringDate;
    }


    /**
     * Gets the accountFlagsBefore value for this GetAccountDetailsResponseResponseHeaderAccountDetails.
     * 
     * @return accountFlagsBefore
     */
    public GetAccountDetailsResponseResponseHeaderAccountDetailsAccountFlagsBefore getAccountFlagsBefore() {
        return accountFlagsBefore;
    }


    /**
     * Sets the accountFlagsBefore value for this GetAccountDetailsResponseResponseHeaderAccountDetails.
     * 
     * @param accountFlagsBefore
     */
    public void setAccountFlagsBefore(GetAccountDetailsResponseResponseHeaderAccountDetailsAccountFlagsBefore accountFlagsBefore) {
        this.accountFlagsBefore = accountFlagsBefore;
    }


    /**
     * Gets the offerInformationList value for this GetAccountDetailsResponseResponseHeaderAccountDetails.
     * 
     * @return offerInformationList
     */
    public ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.GetAccountDetailsResponseResponseHeaderAccountDetailsOfferInformationList[] getOfferInformationList() {
        return offerInformationList;
    }


    /**
     * Sets the offerInformationList value for this GetAccountDetailsResponseResponseHeaderAccountDetails.
     * 
     * @param offerInformationList
     */
    public void setOfferInformationList(ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.GetAccountDetailsResponseResponseHeaderAccountDetailsOfferInformationList[] offerInformationList) {
        this.offerInformationList = offerInformationList;
    }

    public ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.GetAccountDetailsResponseResponseHeaderAccountDetailsOfferInformationList getOfferInformationList(int i) {
        return this.offerInformationList[i];
    }

    public void setOfferInformationList(int i, ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.GetAccountDetailsResponseResponseHeaderAccountDetailsOfferInformationList _value) {
        this.offerInformationList[i] = _value;
    }


    /**
     * Gets the accountTimeZone value for this GetAccountDetailsResponseResponseHeaderAccountDetails.
     * 
     * @return accountTimeZone
     */
    public String getAccountTimeZone() {
        return accountTimeZone;
    }


    /**
     * Sets the accountTimeZone value for this GetAccountDetailsResponseResponseHeaderAccountDetails.
     * 
     * @param accountTimeZone
     */
    public void setAccountTimeZone(String accountTimeZone) {
        this.accountTimeZone = accountTimeZone;
    }


    /**
     * Gets the negotiatedCapabilities value for this GetAccountDetailsResponseResponseHeaderAccountDetails.
     * 
     * @return negotiatedCapabilities
     */
    public String getNegotiatedCapabilities() {
        return negotiatedCapabilities;
    }


    /**
     * Sets the negotiatedCapabilities value for this GetAccountDetailsResponseResponseHeaderAccountDetails.
     * 
     * @param negotiatedCapabilities
     */
    public void setNegotiatedCapabilities(String negotiatedCapabilities) {
        this.negotiatedCapabilities = negotiatedCapabilities;
    }


    /**
     * Gets the availableServerCapabalities value for this GetAccountDetailsResponseResponseHeaderAccountDetails.
     * 
     * @return availableServerCapabalities
     */
    public String getAvailableServerCapabalities() {
        return availableServerCapabalities;
    }


    /**
     * Sets the availableServerCapabalities value for this GetAccountDetailsResponseResponseHeaderAccountDetails.
     * 
     * @param availableServerCapabalities
     */
    public void setAvailableServerCapabalities(String availableServerCapabalities) {
        this.availableServerCapabalities = availableServerCapabalities;
    }


    /**
     * Gets the cellIdentifier value for this GetAccountDetailsResponseResponseHeaderAccountDetails.
     * 
     * @return cellIdentifier
     */
    public String getCellIdentifier() {
        return cellIdentifier;
    }


    /**
     * Sets the cellIdentifier value for this GetAccountDetailsResponseResponseHeaderAccountDetails.
     * 
     * @param cellIdentifier
     */
    public void setCellIdentifier(String cellIdentifier) {
        this.cellIdentifier = cellIdentifier;
    }


    /**
     * Gets the locationNumber value for this GetAccountDetailsResponseResponseHeaderAccountDetails.
     * 
     * @return locationNumber
     */
    public String getLocationNumber() {
        return locationNumber;
    }


    /**
     * Sets the locationNumber value for this GetAccountDetailsResponseResponseHeaderAccountDetails.
     * 
     * @param locationNumber
     */
    public void setLocationNumber(String locationNumber) {
        this.locationNumber = locationNumber;
    }


    /**
     * Gets the accountPrepaidEmptyLimit1 value for this GetAccountDetailsResponseResponseHeaderAccountDetails.
     * 
     * @return accountPrepaidEmptyLimit1
     */
    public String getAccountPrepaidEmptyLimit1() {
        return accountPrepaidEmptyLimit1;
    }


    /**
     * Sets the accountPrepaidEmptyLimit1 value for this GetAccountDetailsResponseResponseHeaderAccountDetails.
     * 
     * @param accountPrepaidEmptyLimit1
     */
    public void setAccountPrepaidEmptyLimit1(String accountPrepaidEmptyLimit1) {
        this.accountPrepaidEmptyLimit1 = accountPrepaidEmptyLimit1;
    }


    /**
     * Gets the accountPrepaidEmptyLimit2 value for this GetAccountDetailsResponseResponseHeaderAccountDetails.
     * 
     * @return accountPrepaidEmptyLimit2
     */
    public String getAccountPrepaidEmptyLimit2() {
        return accountPrepaidEmptyLimit2;
    }


    /**
     * Sets the accountPrepaidEmptyLimit2 value for this GetAccountDetailsResponseResponseHeaderAccountDetails.
     * 
     * @param accountPrepaidEmptyLimit2
     */
    public void setAccountPrepaidEmptyLimit2(String accountPrepaidEmptyLimit2) {
        this.accountPrepaidEmptyLimit2 = accountPrepaidEmptyLimit2;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GetAccountDetailsResponseResponseHeaderAccountDetails)) return false;
        GetAccountDetailsResponseResponseHeaderAccountDetails other = (GetAccountDetailsResponseResponseHeaderAccountDetails) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.originTransactionID==null && other.getOriginTransactionID()==null) || 
             (this.originTransactionID!=null &&
              this.originTransactionID.equals(other.getOriginTransactionID()))) &&
            ((this.firstIVRCallFlag==null && other.getFirstIVRCallFlag()==null) || 
             (this.firstIVRCallFlag!=null &&
              this.firstIVRCallFlag.equals(other.getFirstIVRCallFlag()))) &&
            ((this.languageIDCurrent==null && other.getLanguageIDCurrent()==null) || 
             (this.languageIDCurrent!=null &&
              this.languageIDCurrent.equals(other.getLanguageIDCurrent()))) &&
            ((this.languageIDDesc==null && other.getLanguageIDDesc()==null) || 
             (this.languageIDDesc!=null &&
              this.languageIDDesc.equals(other.getLanguageIDDesc()))) &&
            ((this.serviceClassCurrent==null && other.getServiceClassCurrent()==null) || 
             (this.serviceClassCurrent!=null &&
              this.serviceClassCurrent.equals(other.getServiceClassCurrent()))) &&
            ((this.serviceClassOriginal==null && other.getServiceClassOriginal()==null) || 
             (this.serviceClassOriginal!=null &&
              this.serviceClassOriginal.equals(other.getServiceClassOriginal()))) &&
            ((this.serviceClassTemporaryExpiryDate==null && other.getServiceClassTemporaryExpiryDate()==null) || 
             (this.serviceClassTemporaryExpiryDate!=null &&
              this.serviceClassTemporaryExpiryDate.equals(other.getServiceClassTemporaryExpiryDate()))) &&
            ((this.ussdEndOfCallNotificationID==null && other.getUssdEndOfCallNotificationID()==null) || 
             (this.ussdEndOfCallNotificationID!=null &&
              this.ussdEndOfCallNotificationID.equals(other.getUssdEndOfCallNotificationID()))) &&
            ((this.accountGroupID==null && other.getAccountGroupID()==null) || 
             (this.accountGroupID!=null &&
              this.accountGroupID.equals(other.getAccountGroupID()))) &&
            ((this.serviceOfferings==null && other.getServiceOfferings()==null) || 
             (this.serviceOfferings!=null &&
              java.util.Arrays.equals(this.serviceOfferings, other.getServiceOfferings()))) &&
            ((this.communityInformationCurrent==null && other.getCommunityInformationCurrent()==null) || 
             (this.communityInformationCurrent!=null &&
              java.util.Arrays.equals(this.communityInformationCurrent, other.getCommunityInformationCurrent()))) &&
            ((this.temporaryBlockedFlag==null && other.getTemporaryBlockedFlag()==null) || 
             (this.temporaryBlockedFlag!=null &&
              this.temporaryBlockedFlag.equals(other.getTemporaryBlockedFlag()))) &&
            ((this.accountActivatedFlag==null && other.getAccountActivatedFlag()==null) || 
             (this.accountActivatedFlag!=null &&
              this.accountActivatedFlag.equals(other.getAccountActivatedFlag()))) &&
            ((this.activationDate==null && other.getActivationDate()==null) || 
             (this.activationDate!=null &&
              this.activationDate.equals(other.getActivationDate()))) &&
            ((this.accountFlags==null && other.getAccountFlags()==null) || 
             (this.accountFlags!=null &&
              this.accountFlags.equals(other.getAccountFlags()))) &&
            ((this.masterSubscriberFlag==null && other.getMasterSubscriberFlag()==null) || 
             (this.masterSubscriberFlag!=null &&
              this.masterSubscriberFlag.equals(other.getMasterSubscriberFlag()))) &&
            ((this.masterAccountNumber==null && other.getMasterAccountNumber()==null) || 
             (this.masterAccountNumber!=null &&
              this.masterAccountNumber.equals(other.getMasterAccountNumber()))) &&
            ((this.refillUnbarDateTime==null && other.getRefillUnbarDateTime()==null) || 
             (this.refillUnbarDateTime!=null &&
              this.refillUnbarDateTime.equals(other.getRefillUnbarDateTime()))) &&
            ((this.promotionAnnouncementCode==null && other.getPromotionAnnouncementCode()==null) || 
             (this.promotionAnnouncementCode!=null &&
              this.promotionAnnouncementCode.equals(other.getPromotionAnnouncementCode()))) &&
            ((this.promotionPlanID==null && other.getPromotionPlanID()==null) || 
             (this.promotionPlanID!=null &&
              this.promotionPlanID.equals(other.getPromotionPlanID()))) &&
            ((this.promotionStartDate==null && other.getPromotionStartDate()==null) || 
             (this.promotionStartDate!=null &&
              this.promotionStartDate.equals(other.getPromotionStartDate()))) &&
            ((this.promotionEndDate==null && other.getPromotionEndDate()==null) || 
             (this.promotionEndDate!=null &&
              this.promotionEndDate.equals(other.getPromotionEndDate()))) &&
            ((this.supervisionExpiryDate==null && other.getSupervisionExpiryDate()==null) || 
             (this.supervisionExpiryDate!=null &&
              this.supervisionExpiryDate.equals(other.getSupervisionExpiryDate()))) &&
            ((this.creditClearanceDate==null && other.getCreditClearanceDate()==null) || 
             (this.creditClearanceDate!=null &&
              this.creditClearanceDate.equals(other.getCreditClearanceDate()))) &&
            ((this.serviceRemovalDate==null && other.getServiceRemovalDate()==null) || 
             (this.serviceRemovalDate!=null &&
              this.serviceRemovalDate.equals(other.getServiceRemovalDate()))) &&
            ((this.serviceFeeExpiryDate==null && other.getServiceFeeExpiryDate()==null) || 
             (this.serviceFeeExpiryDate!=null &&
              this.serviceFeeExpiryDate.equals(other.getServiceFeeExpiryDate()))) &&
            ((this.serviceClassChangeUnbarDate==null && other.getServiceClassChangeUnbarDate()==null) || 
             (this.serviceClassChangeUnbarDate!=null &&
              this.serviceClassChangeUnbarDate.equals(other.getServiceClassChangeUnbarDate()))) &&
            ((this.serviceFeePeriod==null && other.getServiceFeePeriod()==null) || 
             (this.serviceFeePeriod!=null &&
              this.serviceFeePeriod.equals(other.getServiceFeePeriod()))) &&
            ((this.supervisionPeriod==null && other.getSupervisionPeriod()==null) || 
             (this.supervisionPeriod!=null &&
              this.supervisionPeriod.equals(other.getSupervisionPeriod()))) &&
            ((this.serviceRemovalPeriod==null && other.getServiceRemovalPeriod()==null) || 
             (this.serviceRemovalPeriod!=null &&
              this.serviceRemovalPeriod.equals(other.getServiceRemovalPeriod()))) &&
            ((this.creditClearancePeriod==null && other.getCreditClearancePeriod()==null) || 
             (this.creditClearancePeriod!=null &&
              this.creditClearancePeriod.equals(other.getCreditClearancePeriod()))) &&
            ((this.currency1==null && other.getCurrency1()==null) || 
             (this.currency1!=null &&
              this.currency1.equals(other.getCurrency1()))) &&
            ((this.accountValue1==null && other.getAccountValue1()==null) || 
             (this.accountValue1!=null &&
              this.accountValue1.equals(other.getAccountValue1()))) &&
            ((this.currency2==null && other.getCurrency2()==null) || 
             (this.currency2!=null &&
              this.currency2.equals(other.getCurrency2()))) &&
            ((this.accountValue2==null && other.getAccountValue2()==null) || 
             (this.accountValue2!=null &&
              this.accountValue2.equals(other.getAccountValue2()))) &&
            ((this.accountHomeRegion==null && other.getAccountHomeRegion()==null) || 
             (this.accountHomeRegion!=null &&
              this.accountHomeRegion.equals(other.getAccountHomeRegion()))) &&
            ((this.pinCode==null && other.getPinCode()==null) || 
             (this.pinCode!=null &&
              this.pinCode.equals(other.getPinCode()))) &&
            ((this.aggregatedBalance1==null && other.getAggregatedBalance1()==null) || 
             (this.aggregatedBalance1!=null &&
              this.aggregatedBalance1.equals(other.getAggregatedBalance1()))) &&
            ((this.aggregatedBalance2==null && other.getAggregatedBalance2()==null) || 
             (this.aggregatedBalance2!=null &&
              this.aggregatedBalance2.equals(other.getAggregatedBalance2()))) &&
            ((this.pamInformationList==null && other.getPamInformationList()==null) || 
             (this.pamInformationList!=null &&
              java.util.Arrays.equals(this.pamInformationList, other.getPamInformationList()))) &&
            ((this.maxServiceFeePeriod==null && other.getMaxServiceFeePeriod()==null) || 
             (this.maxServiceFeePeriod!=null &&
              this.maxServiceFeePeriod.equals(other.getMaxServiceFeePeriod()))) &&
            ((this.maxSupervisionPeriod==null && other.getMaxSupervisionPeriod()==null) || 
             (this.maxSupervisionPeriod!=null &&
              this.maxSupervisionPeriod.equals(other.getMaxSupervisionPeriod()))) &&
            ((this.negativeBalanceBarringDate==null && other.getNegativeBalanceBarringDate()==null) || 
             (this.negativeBalanceBarringDate!=null &&
              this.negativeBalanceBarringDate.equals(other.getNegativeBalanceBarringDate()))) &&
            ((this.accountFlagsBefore==null && other.getAccountFlagsBefore()==null) || 
             (this.accountFlagsBefore!=null &&
              this.accountFlagsBefore.equals(other.getAccountFlagsBefore()))) &&
            ((this.offerInformationList==null && other.getOfferInformationList()==null) || 
             (this.offerInformationList!=null &&
              java.util.Arrays.equals(this.offerInformationList, other.getOfferInformationList()))) &&
            ((this.accountTimeZone==null && other.getAccountTimeZone()==null) || 
             (this.accountTimeZone!=null &&
              this.accountTimeZone.equals(other.getAccountTimeZone()))) &&
            ((this.negotiatedCapabilities==null && other.getNegotiatedCapabilities()==null) || 
             (this.negotiatedCapabilities!=null &&
              this.negotiatedCapabilities.equals(other.getNegotiatedCapabilities()))) &&
            ((this.availableServerCapabalities==null && other.getAvailableServerCapabalities()==null) || 
             (this.availableServerCapabalities!=null &&
              this.availableServerCapabalities.equals(other.getAvailableServerCapabalities()))) &&
            ((this.cellIdentifier==null && other.getCellIdentifier()==null) || 
             (this.cellIdentifier!=null &&
              this.cellIdentifier.equals(other.getCellIdentifier()))) &&
            ((this.locationNumber==null && other.getLocationNumber()==null) || 
             (this.locationNumber!=null &&
              this.locationNumber.equals(other.getLocationNumber()))) &&
            ((this.accountPrepaidEmptyLimit1==null && other.getAccountPrepaidEmptyLimit1()==null) || 
             (this.accountPrepaidEmptyLimit1!=null &&
              this.accountPrepaidEmptyLimit1.equals(other.getAccountPrepaidEmptyLimit1()))) &&
            ((this.accountPrepaidEmptyLimit2==null && other.getAccountPrepaidEmptyLimit2()==null) || 
             (this.accountPrepaidEmptyLimit2!=null &&
              this.accountPrepaidEmptyLimit2.equals(other.getAccountPrepaidEmptyLimit2())));
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
        if (getOriginTransactionID() != null) {
            _hashCode += getOriginTransactionID().hashCode();
        }
        if (getFirstIVRCallFlag() != null) {
            _hashCode += getFirstIVRCallFlag().hashCode();
        }
        if (getLanguageIDCurrent() != null) {
            _hashCode += getLanguageIDCurrent().hashCode();
        }
        if (getLanguageIDDesc() != null) {
            _hashCode += getLanguageIDDesc().hashCode();
        }
        if (getServiceClassCurrent() != null) {
            _hashCode += getServiceClassCurrent().hashCode();
        }
        if (getServiceClassOriginal() != null) {
            _hashCode += getServiceClassOriginal().hashCode();
        }
        if (getServiceClassTemporaryExpiryDate() != null) {
            _hashCode += getServiceClassTemporaryExpiryDate().hashCode();
        }
        if (getUssdEndOfCallNotificationID() != null) {
            _hashCode += getUssdEndOfCallNotificationID().hashCode();
        }
        if (getAccountGroupID() != null) {
            _hashCode += getAccountGroupID().hashCode();
        }
        if (getServiceOfferings() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getServiceOfferings());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getServiceOfferings(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCommunityInformationCurrent() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCommunityInformationCurrent());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getCommunityInformationCurrent(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTemporaryBlockedFlag() != null) {
            _hashCode += getTemporaryBlockedFlag().hashCode();
        }
        if (getAccountActivatedFlag() != null) {
            _hashCode += getAccountActivatedFlag().hashCode();
        }
        if (getActivationDate() != null) {
            _hashCode += getActivationDate().hashCode();
        }
        if (getAccountFlags() != null) {
            _hashCode += getAccountFlags().hashCode();
        }
        if (getMasterSubscriberFlag() != null) {
            _hashCode += getMasterSubscriberFlag().hashCode();
        }
        if (getMasterAccountNumber() != null) {
            _hashCode += getMasterAccountNumber().hashCode();
        }
        if (getRefillUnbarDateTime() != null) {
            _hashCode += getRefillUnbarDateTime().hashCode();
        }
        if (getPromotionAnnouncementCode() != null) {
            _hashCode += getPromotionAnnouncementCode().hashCode();
        }
        if (getPromotionPlanID() != null) {
            _hashCode += getPromotionPlanID().hashCode();
        }
        if (getPromotionStartDate() != null) {
            _hashCode += getPromotionStartDate().hashCode();
        }
        if (getPromotionEndDate() != null) {
            _hashCode += getPromotionEndDate().hashCode();
        }
        if (getSupervisionExpiryDate() != null) {
            _hashCode += getSupervisionExpiryDate().hashCode();
        }
        if (getCreditClearanceDate() != null) {
            _hashCode += getCreditClearanceDate().hashCode();
        }
        if (getServiceRemovalDate() != null) {
            _hashCode += getServiceRemovalDate().hashCode();
        }
        if (getServiceFeeExpiryDate() != null) {
            _hashCode += getServiceFeeExpiryDate().hashCode();
        }
        if (getServiceClassChangeUnbarDate() != null) {
            _hashCode += getServiceClassChangeUnbarDate().hashCode();
        }
        if (getServiceFeePeriod() != null) {
            _hashCode += getServiceFeePeriod().hashCode();
        }
        if (getSupervisionPeriod() != null) {
            _hashCode += getSupervisionPeriod().hashCode();
        }
        if (getServiceRemovalPeriod() != null) {
            _hashCode += getServiceRemovalPeriod().hashCode();
        }
        if (getCreditClearancePeriod() != null) {
            _hashCode += getCreditClearancePeriod().hashCode();
        }
        if (getCurrency1() != null) {
            _hashCode += getCurrency1().hashCode();
        }
        if (getAccountValue1() != null) {
            _hashCode += getAccountValue1().hashCode();
        }
        if (getCurrency2() != null) {
            _hashCode += getCurrency2().hashCode();
        }
        if (getAccountValue2() != null) {
            _hashCode += getAccountValue2().hashCode();
        }
        if (getAccountHomeRegion() != null) {
            _hashCode += getAccountHomeRegion().hashCode();
        }
        if (getPinCode() != null) {
            _hashCode += getPinCode().hashCode();
        }
        if (getAggregatedBalance1() != null) {
            _hashCode += getAggregatedBalance1().hashCode();
        }
        if (getAggregatedBalance2() != null) {
            _hashCode += getAggregatedBalance2().hashCode();
        }
        if (getPamInformationList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPamInformationList());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getPamInformationList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMaxServiceFeePeriod() != null) {
            _hashCode += getMaxServiceFeePeriod().hashCode();
        }
        if (getMaxSupervisionPeriod() != null) {
            _hashCode += getMaxSupervisionPeriod().hashCode();
        }
        if (getNegativeBalanceBarringDate() != null) {
            _hashCode += getNegativeBalanceBarringDate().hashCode();
        }
        if (getAccountFlagsBefore() != null) {
            _hashCode += getAccountFlagsBefore().hashCode();
        }
        if (getOfferInformationList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOfferInformationList());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getOfferInformationList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAccountTimeZone() != null) {
            _hashCode += getAccountTimeZone().hashCode();
        }
        if (getNegotiatedCapabilities() != null) {
            _hashCode += getNegotiatedCapabilities().hashCode();
        }
        if (getAvailableServerCapabalities() != null) {
            _hashCode += getAvailableServerCapabalities().hashCode();
        }
        if (getCellIdentifier() != null) {
            _hashCode += getCellIdentifier().hashCode();
        }
        if (getLocationNumber() != null) {
            _hashCode += getLocationNumber().hashCode();
        }
        if (getAccountPrepaidEmptyLimit1() != null) {
            _hashCode += getAccountPrepaidEmptyLimit1().hashCode();
        }
        if (getAccountPrepaidEmptyLimit2() != null) {
            _hashCode += getAccountPrepaidEmptyLimit2().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetAccountDetailsResponseResponseHeaderAccountDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", ">>>GetAccountDetailsResponse>ResponseHeader>AccountDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originTransactionID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "OriginTransactionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstIVRCallFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "firstIVRCallFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("languageIDCurrent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "LanguageIDCurrent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("languageIDDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "LanguageIDDesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceClassCurrent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "ServiceClassCurrent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceClassOriginal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "serviceClassOriginal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceClassTemporaryExpiryDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "serviceClassTemporaryExpiryDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ussdEndOfCallNotificationID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "ussdEndOfCallNotificationID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountGroupID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "accountGroupID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceOfferings");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "serviceOfferings"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", ">>>>GetAccountDetailsResponse>ResponseHeader>AccountDetails>serviceOfferings"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("communityInformationCurrent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "communityInformationCurrent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", ">>>>GetAccountDetailsResponse>ResponseHeader>AccountDetails>communityInformationCurrent"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("temporaryBlockedFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "TemporaryBlockedFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountActivatedFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "accountActivatedFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "activationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountFlags");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "accountFlags"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", ">>>>GetAccountDetailsResponse>ResponseHeader>AccountDetails>accountFlags"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("masterSubscriberFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "masterSubscriberFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("masterAccountNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "masterAccountNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refillUnbarDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "refillUnbarDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promotionAnnouncementCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "promotionAnnouncementCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promotionPlanID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "promotionPlanID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promotionStartDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "promotionStartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promotionEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "promotionEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supervisionExpiryDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "supervisionExpiryDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditClearanceDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "creditClearanceDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceRemovalDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "serviceRemovalDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceFeeExpiryDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "serviceFeeExpiryDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceClassChangeUnbarDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "serviceClassChangeUnbarDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceFeePeriod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "serviceFeePeriod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supervisionPeriod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "supervisionPeriod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceRemovalPeriod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "serviceRemovalPeriod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditClearancePeriod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "creditClearancePeriod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "currency1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountValue1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "accountValue1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "currency2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountValue2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "accountValue2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountHomeRegion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "accountHomeRegion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pinCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "pinCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aggregatedBalance1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "aggregatedBalance1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aggregatedBalance2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "aggregatedBalance2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pamInformationList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "pamInformationList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", ">>>>>GetAccountDetailsResponse>ResponseHeader>AccountDetails>pamInformationList>pamInformation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "pamInformation"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxServiceFeePeriod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "maxServiceFeePeriod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxSupervisionPeriod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "maxSupervisionPeriod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("negativeBalanceBarringDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "negativeBalanceBarringDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountFlagsBefore");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "AccountFlagsBefore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", ">>>>GetAccountDetailsResponse>ResponseHeader>AccountDetails>AccountFlagsBefore"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offerInformationList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "offerInformationList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", ">>>>GetAccountDetailsResponse>ResponseHeader>AccountDetails>offerInformationList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountTimeZone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "accountTimeZone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("negotiatedCapabilities");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "NegotiatedCapabilities"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("availableServerCapabalities");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "AvailableServerCapabalities"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cellIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "cellIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "locationNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountPrepaidEmptyLimit1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "accountPrepaidEmptyLimit1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountPrepaidEmptyLimit2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "accountPrepaidEmptyLimit2"));
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
