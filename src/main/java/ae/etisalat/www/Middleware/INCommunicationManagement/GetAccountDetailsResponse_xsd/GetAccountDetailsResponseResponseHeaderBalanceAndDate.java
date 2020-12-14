/**
 * GetAccountDetailsResponseResponseHeaderBalanceAndDate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd;

public class GetAccountDetailsResponseResponseHeaderBalanceAndDate  implements java.io.Serializable {
    private String originTransactionID;

    private String serviceClassCurrent;

    private String serviceClassDesc;

    private String currencym1;

    private String accountValue1;

    private String aggregatedBalance1;

    private String currencym2;

    private String accountValue2;

    private String aggregatedBalance2;

    private GetAccountDetailsResponseResponseHeaderBalanceAndDateDedicatedAccountInformation[] dedicatedAccountInformation;

    private String supervisionExpiryDate;

    private String serviceFeeExpiryDate;

    private String creditClearanceDate;

    private String serviceRemovalDate;

    private String languageIDCurrent;

    private String temporaryBlockedFlag;

    private ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.GetAccountDetailsResponseResponseHeaderBalanceAndDateChargingResultInformation chargingResultInformation;

    private ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.GetAccountDetailsResponseResponseHeaderBalanceAndDateAccountFlagsAfter accountFlagsAfter;

    private ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.GetAccountDetailsResponseResponseHeaderBalanceAndDateAccountFlagsBefore accountFlagsBefore;

    private GetAccountDetailsResponseResponseHeaderBalanceAndDateOfferInformationList[] offerInformationList;

    private String negotiatedCapabilities;

    private String availableServerCapabilities;

    private String accountPrepaidEmptyLimit1;

    private String accountPrepaidEmptyLimit2;

    private GetAccountDetailsResponseResponseHeaderBalanceAndDateAggregatedBalanceInformation aggregatedBalanceInformation;

    private ae.etisalat.www.Middleware.SharedResources.Common.Common_xsd.AdditionalInfo[] additionalInfo;

    public GetAccountDetailsResponseResponseHeaderBalanceAndDate() {
    }

    public GetAccountDetailsResponseResponseHeaderBalanceAndDate(
           String originTransactionID,
           String serviceClassCurrent,
           String serviceClassDesc,
           String currencym1,
           String accountValue1,
           String aggregatedBalance1,
           String currencym2,
           String accountValue2,
           String aggregatedBalance2,
           GetAccountDetailsResponseResponseHeaderBalanceAndDateDedicatedAccountInformation[] dedicatedAccountInformation,
           String supervisionExpiryDate,
           String serviceFeeExpiryDate,
           String creditClearanceDate,
           String serviceRemovalDate,
           String languageIDCurrent,
           String temporaryBlockedFlag,
           ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.GetAccountDetailsResponseResponseHeaderBalanceAndDateChargingResultInformation chargingResultInformation,
           ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.GetAccountDetailsResponseResponseHeaderBalanceAndDateAccountFlagsAfter accountFlagsAfter,
           ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.GetAccountDetailsResponseResponseHeaderBalanceAndDateAccountFlagsBefore accountFlagsBefore,
           GetAccountDetailsResponseResponseHeaderBalanceAndDateOfferInformationList[] offerInformationList,
           String negotiatedCapabilities,
           String availableServerCapabilities,
           String accountPrepaidEmptyLimit1,
           String accountPrepaidEmptyLimit2,
           GetAccountDetailsResponseResponseHeaderBalanceAndDateAggregatedBalanceInformation aggregatedBalanceInformation,
           ae.etisalat.www.Middleware.SharedResources.Common.Common_xsd.AdditionalInfo[] additionalInfo) {
           this.originTransactionID = originTransactionID;
           this.serviceClassCurrent = serviceClassCurrent;
           this.serviceClassDesc = serviceClassDesc;
           this.currencym1 = currencym1;
           this.accountValue1 = accountValue1;
           this.aggregatedBalance1 = aggregatedBalance1;
           this.currencym2 = currencym2;
           this.accountValue2 = accountValue2;
           this.aggregatedBalance2 = aggregatedBalance2;
           this.dedicatedAccountInformation = dedicatedAccountInformation;
           this.supervisionExpiryDate = supervisionExpiryDate;
           this.serviceFeeExpiryDate = serviceFeeExpiryDate;
           this.creditClearanceDate = creditClearanceDate;
           this.serviceRemovalDate = serviceRemovalDate;
           this.languageIDCurrent = languageIDCurrent;
           this.temporaryBlockedFlag = temporaryBlockedFlag;
           this.chargingResultInformation = chargingResultInformation;
           this.accountFlagsAfter = accountFlagsAfter;
           this.accountFlagsBefore = accountFlagsBefore;
           this.offerInformationList = offerInformationList;
           this.negotiatedCapabilities = negotiatedCapabilities;
           this.availableServerCapabilities = availableServerCapabilities;
           this.accountPrepaidEmptyLimit1 = accountPrepaidEmptyLimit1;
           this.accountPrepaidEmptyLimit2 = accountPrepaidEmptyLimit2;
           this.aggregatedBalanceInformation = aggregatedBalanceInformation;
           this.additionalInfo = additionalInfo;
    }


    /**
     * Gets the originTransactionID value for this GetAccountDetailsResponseResponseHeaderBalanceAndDate.
     * 
     * @return originTransactionID
     */
    public String getOriginTransactionID() {
        return originTransactionID;
    }


    /**
     * Sets the originTransactionID value for this GetAccountDetailsResponseResponseHeaderBalanceAndDate.
     * 
     * @param originTransactionID
     */
    public void setOriginTransactionID(String originTransactionID) {
        this.originTransactionID = originTransactionID;
    }


    /**
     * Gets the serviceClassCurrent value for this GetAccountDetailsResponseResponseHeaderBalanceAndDate.
     * 
     * @return serviceClassCurrent
     */
    public String getServiceClassCurrent() {
        return serviceClassCurrent;
    }


    /**
     * Sets the serviceClassCurrent value for this GetAccountDetailsResponseResponseHeaderBalanceAndDate.
     * 
     * @param serviceClassCurrent
     */
    public void setServiceClassCurrent(String serviceClassCurrent) {
        this.serviceClassCurrent = serviceClassCurrent;
    }


    /**
     * Gets the serviceClassDesc value for this GetAccountDetailsResponseResponseHeaderBalanceAndDate.
     * 
     * @return serviceClassDesc
     */
    public String getServiceClassDesc() {
        return serviceClassDesc;
    }


    /**
     * Sets the serviceClassDesc value for this GetAccountDetailsResponseResponseHeaderBalanceAndDate.
     * 
     * @param serviceClassDesc
     */
    public void setServiceClassDesc(String serviceClassDesc) {
        this.serviceClassDesc = serviceClassDesc;
    }


    /**
     * Gets the currencym1 value for this GetAccountDetailsResponseResponseHeaderBalanceAndDate.
     * 
     * @return currencym1
     */
    public String getCurrencym1() {
        return currencym1;
    }


    /**
     * Sets the currencym1 value for this GetAccountDetailsResponseResponseHeaderBalanceAndDate.
     * 
     * @param currencym1
     */
    public void setCurrencym1(String currencym1) {
        this.currencym1 = currencym1;
    }


    /**
     * Gets the accountValue1 value for this GetAccountDetailsResponseResponseHeaderBalanceAndDate.
     * 
     * @return accountValue1
     */
    public String getAccountValue1() {
        return accountValue1;
    }


    /**
     * Sets the accountValue1 value for this GetAccountDetailsResponseResponseHeaderBalanceAndDate.
     * 
     * @param accountValue1
     */
    public void setAccountValue1(String accountValue1) {
        this.accountValue1 = accountValue1;
    }


    /**
     * Gets the aggregatedBalance1 value for this GetAccountDetailsResponseResponseHeaderBalanceAndDate.
     * 
     * @return aggregatedBalance1
     */
    public String getAggregatedBalance1() {
        return aggregatedBalance1;
    }


    /**
     * Sets the aggregatedBalance1 value for this GetAccountDetailsResponseResponseHeaderBalanceAndDate.
     * 
     * @param aggregatedBalance1
     */
    public void setAggregatedBalance1(String aggregatedBalance1) {
        this.aggregatedBalance1 = aggregatedBalance1;
    }


    /**
     * Gets the currencym2 value for this GetAccountDetailsResponseResponseHeaderBalanceAndDate.
     * 
     * @return currencym2
     */
    public String getCurrencym2() {
        return currencym2;
    }


    /**
     * Sets the currencym2 value for this GetAccountDetailsResponseResponseHeaderBalanceAndDate.
     * 
     * @param currencym2
     */
    public void setCurrencym2(String currencym2) {
        this.currencym2 = currencym2;
    }


    /**
     * Gets the accountValue2 value for this GetAccountDetailsResponseResponseHeaderBalanceAndDate.
     * 
     * @return accountValue2
     */
    public String getAccountValue2() {
        return accountValue2;
    }


    /**
     * Sets the accountValue2 value for this GetAccountDetailsResponseResponseHeaderBalanceAndDate.
     * 
     * @param accountValue2
     */
    public void setAccountValue2(String accountValue2) {
        this.accountValue2 = accountValue2;
    }


    /**
     * Gets the aggregatedBalance2 value for this GetAccountDetailsResponseResponseHeaderBalanceAndDate.
     * 
     * @return aggregatedBalance2
     */
    public String getAggregatedBalance2() {
        return aggregatedBalance2;
    }


    /**
     * Sets the aggregatedBalance2 value for this GetAccountDetailsResponseResponseHeaderBalanceAndDate.
     * 
     * @param aggregatedBalance2
     */
    public void setAggregatedBalance2(String aggregatedBalance2) {
        this.aggregatedBalance2 = aggregatedBalance2;
    }


    /**
     * Gets the dedicatedAccountInformation value for this GetAccountDetailsResponseResponseHeaderBalanceAndDate.
     * 
     * @return dedicatedAccountInformation
     */
    public GetAccountDetailsResponseResponseHeaderBalanceAndDateDedicatedAccountInformation[] getDedicatedAccountInformation() {
        return dedicatedAccountInformation;
    }


    /**
     * Sets the dedicatedAccountInformation value for this GetAccountDetailsResponseResponseHeaderBalanceAndDate.
     * 
     * @param dedicatedAccountInformation
     */
    public void setDedicatedAccountInformation(GetAccountDetailsResponseResponseHeaderBalanceAndDateDedicatedAccountInformation[] dedicatedAccountInformation) {
        this.dedicatedAccountInformation = dedicatedAccountInformation;
    }

    public GetAccountDetailsResponseResponseHeaderBalanceAndDateDedicatedAccountInformation getDedicatedAccountInformation(int i) {
        return this.dedicatedAccountInformation[i];
    }

    public void setDedicatedAccountInformation(int i, GetAccountDetailsResponseResponseHeaderBalanceAndDateDedicatedAccountInformation _value) {
        this.dedicatedAccountInformation[i] = _value;
    }


    /**
     * Gets the supervisionExpiryDate value for this GetAccountDetailsResponseResponseHeaderBalanceAndDate.
     * 
     * @return supervisionExpiryDate
     */
    public String getSupervisionExpiryDate() {
        return supervisionExpiryDate;
    }


    /**
     * Sets the supervisionExpiryDate value for this GetAccountDetailsResponseResponseHeaderBalanceAndDate.
     * 
     * @param supervisionExpiryDate
     */
    public void setSupervisionExpiryDate(String supervisionExpiryDate) {
        this.supervisionExpiryDate = supervisionExpiryDate;
    }


    /**
     * Gets the serviceFeeExpiryDate value for this GetAccountDetailsResponseResponseHeaderBalanceAndDate.
     * 
     * @return serviceFeeExpiryDate
     */
    public String getServiceFeeExpiryDate() {
        return serviceFeeExpiryDate;
    }


    /**
     * Sets the serviceFeeExpiryDate value for this GetAccountDetailsResponseResponseHeaderBalanceAndDate.
     * 
     * @param serviceFeeExpiryDate
     */
    public void setServiceFeeExpiryDate(String serviceFeeExpiryDate) {
        this.serviceFeeExpiryDate = serviceFeeExpiryDate;
    }


    /**
     * Gets the creditClearanceDate value for this GetAccountDetailsResponseResponseHeaderBalanceAndDate.
     * 
     * @return creditClearanceDate
     */
    public String getCreditClearanceDate() {
        return creditClearanceDate;
    }


    /**
     * Sets the creditClearanceDate value for this GetAccountDetailsResponseResponseHeaderBalanceAndDate.
     * 
     * @param creditClearanceDate
     */
    public void setCreditClearanceDate(String creditClearanceDate) {
        this.creditClearanceDate = creditClearanceDate;
    }


    /**
     * Gets the serviceRemovalDate value for this GetAccountDetailsResponseResponseHeaderBalanceAndDate.
     * 
     * @return serviceRemovalDate
     */
    public String getServiceRemovalDate() {
        return serviceRemovalDate;
    }


    /**
     * Sets the serviceRemovalDate value for this GetAccountDetailsResponseResponseHeaderBalanceAndDate.
     * 
     * @param serviceRemovalDate
     */
    public void setServiceRemovalDate(String serviceRemovalDate) {
        this.serviceRemovalDate = serviceRemovalDate;
    }


    /**
     * Gets the languageIDCurrent value for this GetAccountDetailsResponseResponseHeaderBalanceAndDate.
     * 
     * @return languageIDCurrent
     */
    public String getLanguageIDCurrent() {
        return languageIDCurrent;
    }


    /**
     * Sets the languageIDCurrent value for this GetAccountDetailsResponseResponseHeaderBalanceAndDate.
     * 
     * @param languageIDCurrent
     */
    public void setLanguageIDCurrent(String languageIDCurrent) {
        this.languageIDCurrent = languageIDCurrent;
    }


    /**
     * Gets the temporaryBlockedFlag value for this GetAccountDetailsResponseResponseHeaderBalanceAndDate.
     * 
     * @return temporaryBlockedFlag
     */
    public String getTemporaryBlockedFlag() {
        return temporaryBlockedFlag;
    }


    /**
     * Sets the temporaryBlockedFlag value for this GetAccountDetailsResponseResponseHeaderBalanceAndDate.
     * 
     * @param temporaryBlockedFlag
     */
    public void setTemporaryBlockedFlag(String temporaryBlockedFlag) {
        this.temporaryBlockedFlag = temporaryBlockedFlag;
    }


    /**
     * Gets the chargingResultInformation value for this GetAccountDetailsResponseResponseHeaderBalanceAndDate.
     * 
     * @return chargingResultInformation
     */
    public ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.GetAccountDetailsResponseResponseHeaderBalanceAndDateChargingResultInformation getChargingResultInformation() {
        return chargingResultInformation;
    }


    /**
     * Sets the chargingResultInformation value for this GetAccountDetailsResponseResponseHeaderBalanceAndDate.
     * 
     * @param chargingResultInformation
     */
    public void setChargingResultInformation(ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.GetAccountDetailsResponseResponseHeaderBalanceAndDateChargingResultInformation chargingResultInformation) {
        this.chargingResultInformation = chargingResultInformation;
    }


    /**
     * Gets the accountFlagsAfter value for this GetAccountDetailsResponseResponseHeaderBalanceAndDate.
     * 
     * @return accountFlagsAfter
     */
    public ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.GetAccountDetailsResponseResponseHeaderBalanceAndDateAccountFlagsAfter getAccountFlagsAfter() {
        return accountFlagsAfter;
    }


    /**
     * Sets the accountFlagsAfter value for this GetAccountDetailsResponseResponseHeaderBalanceAndDate.
     * 
     * @param accountFlagsAfter
     */
    public void setAccountFlagsAfter(ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.GetAccountDetailsResponseResponseHeaderBalanceAndDateAccountFlagsAfter accountFlagsAfter) {
        this.accountFlagsAfter = accountFlagsAfter;
    }


    /**
     * Gets the accountFlagsBefore value for this GetAccountDetailsResponseResponseHeaderBalanceAndDate.
     * 
     * @return accountFlagsBefore
     */
    public ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.GetAccountDetailsResponseResponseHeaderBalanceAndDateAccountFlagsBefore getAccountFlagsBefore() {
        return accountFlagsBefore;
    }


    /**
     * Sets the accountFlagsBefore value for this GetAccountDetailsResponseResponseHeaderBalanceAndDate.
     * 
     * @param accountFlagsBefore
     */
    public void setAccountFlagsBefore(ae.etisalat.www.Middleware.INCommunicationManagement.GetAccountDetailsResponse_xsd.GetAccountDetailsResponseResponseHeaderBalanceAndDateAccountFlagsBefore accountFlagsBefore) {
        this.accountFlagsBefore = accountFlagsBefore;
    }


    /**
     * Gets the offerInformationList value for this GetAccountDetailsResponseResponseHeaderBalanceAndDate.
     * 
     * @return offerInformationList
     */
    public GetAccountDetailsResponseResponseHeaderBalanceAndDateOfferInformationList[] getOfferInformationList() {
        return offerInformationList;
    }


    /**
     * Sets the offerInformationList value for this GetAccountDetailsResponseResponseHeaderBalanceAndDate.
     * 
     * @param offerInformationList
     */
    public void setOfferInformationList(GetAccountDetailsResponseResponseHeaderBalanceAndDateOfferInformationList[] offerInformationList) {
        this.offerInformationList = offerInformationList;
    }

    public GetAccountDetailsResponseResponseHeaderBalanceAndDateOfferInformationList getOfferInformationList(int i) {
        return this.offerInformationList[i];
    }

    public void setOfferInformationList(int i, GetAccountDetailsResponseResponseHeaderBalanceAndDateOfferInformationList _value) {
        this.offerInformationList[i] = _value;
    }


    /**
     * Gets the negotiatedCapabilities value for this GetAccountDetailsResponseResponseHeaderBalanceAndDate.
     * 
     * @return negotiatedCapabilities
     */
    public String getNegotiatedCapabilities() {
        return negotiatedCapabilities;
    }


    /**
     * Sets the negotiatedCapabilities value for this GetAccountDetailsResponseResponseHeaderBalanceAndDate.
     * 
     * @param negotiatedCapabilities
     */
    public void setNegotiatedCapabilities(String negotiatedCapabilities) {
        this.negotiatedCapabilities = negotiatedCapabilities;
    }


    /**
     * Gets the availableServerCapabilities value for this GetAccountDetailsResponseResponseHeaderBalanceAndDate.
     * 
     * @return availableServerCapabilities
     */
    public String getAvailableServerCapabilities() {
        return availableServerCapabilities;
    }


    /**
     * Sets the availableServerCapabilities value for this GetAccountDetailsResponseResponseHeaderBalanceAndDate.
     * 
     * @param availableServerCapabilities
     */
    public void setAvailableServerCapabilities(String availableServerCapabilities) {
        this.availableServerCapabilities = availableServerCapabilities;
    }


    /**
     * Gets the accountPrepaidEmptyLimit1 value for this GetAccountDetailsResponseResponseHeaderBalanceAndDate.
     * 
     * @return accountPrepaidEmptyLimit1
     */
    public String getAccountPrepaidEmptyLimit1() {
        return accountPrepaidEmptyLimit1;
    }


    /**
     * Sets the accountPrepaidEmptyLimit1 value for this GetAccountDetailsResponseResponseHeaderBalanceAndDate.
     * 
     * @param accountPrepaidEmptyLimit1
     */
    public void setAccountPrepaidEmptyLimit1(String accountPrepaidEmptyLimit1) {
        this.accountPrepaidEmptyLimit1 = accountPrepaidEmptyLimit1;
    }


    /**
     * Gets the accountPrepaidEmptyLimit2 value for this GetAccountDetailsResponseResponseHeaderBalanceAndDate.
     * 
     * @return accountPrepaidEmptyLimit2
     */
    public String getAccountPrepaidEmptyLimit2() {
        return accountPrepaidEmptyLimit2;
    }


    /**
     * Sets the accountPrepaidEmptyLimit2 value for this GetAccountDetailsResponseResponseHeaderBalanceAndDate.
     * 
     * @param accountPrepaidEmptyLimit2
     */
    public void setAccountPrepaidEmptyLimit2(String accountPrepaidEmptyLimit2) {
        this.accountPrepaidEmptyLimit2 = accountPrepaidEmptyLimit2;
    }


    /**
     * Gets the aggregatedBalanceInformation value for this GetAccountDetailsResponseResponseHeaderBalanceAndDate.
     * 
     * @return aggregatedBalanceInformation
     */
    public GetAccountDetailsResponseResponseHeaderBalanceAndDateAggregatedBalanceInformation getAggregatedBalanceInformation() {
        return aggregatedBalanceInformation;
    }


    /**
     * Sets the aggregatedBalanceInformation value for this GetAccountDetailsResponseResponseHeaderBalanceAndDate.
     * 
     * @param aggregatedBalanceInformation
     */
    public void setAggregatedBalanceInformation(GetAccountDetailsResponseResponseHeaderBalanceAndDateAggregatedBalanceInformation aggregatedBalanceInformation) {
        this.aggregatedBalanceInformation = aggregatedBalanceInformation;
    }


    /**
     * Gets the additionalInfo value for this GetAccountDetailsResponseResponseHeaderBalanceAndDate.
     * 
     * @return additionalInfo
     */
    public ae.etisalat.www.Middleware.SharedResources.Common.Common_xsd.AdditionalInfo[] getAdditionalInfo() {
        return additionalInfo;
    }


    /**
     * Sets the additionalInfo value for this GetAccountDetailsResponseResponseHeaderBalanceAndDate.
     * 
     * @param additionalInfo
     */
    public void setAdditionalInfo(ae.etisalat.www.Middleware.SharedResources.Common.Common_xsd.AdditionalInfo[] additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public ae.etisalat.www.Middleware.SharedResources.Common.Common_xsd.AdditionalInfo getAdditionalInfo(int i) {
        return this.additionalInfo[i];
    }

    public void setAdditionalInfo(int i, ae.etisalat.www.Middleware.SharedResources.Common.Common_xsd.AdditionalInfo _value) {
        this.additionalInfo[i] = _value;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GetAccountDetailsResponseResponseHeaderBalanceAndDate)) return false;
        GetAccountDetailsResponseResponseHeaderBalanceAndDate other = (GetAccountDetailsResponseResponseHeaderBalanceAndDate) obj;
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
            ((this.serviceClassCurrent==null && other.getServiceClassCurrent()==null) || 
             (this.serviceClassCurrent!=null &&
              this.serviceClassCurrent.equals(other.getServiceClassCurrent()))) &&
            ((this.serviceClassDesc==null && other.getServiceClassDesc()==null) || 
             (this.serviceClassDesc!=null &&
              this.serviceClassDesc.equals(other.getServiceClassDesc()))) &&
            ((this.currencym1==null && other.getCurrencym1()==null) || 
             (this.currencym1!=null &&
              this.currencym1.equals(other.getCurrencym1()))) &&
            ((this.accountValue1==null && other.getAccountValue1()==null) || 
             (this.accountValue1!=null &&
              this.accountValue1.equals(other.getAccountValue1()))) &&
            ((this.aggregatedBalance1==null && other.getAggregatedBalance1()==null) || 
             (this.aggregatedBalance1!=null &&
              this.aggregatedBalance1.equals(other.getAggregatedBalance1()))) &&
            ((this.currencym2==null && other.getCurrencym2()==null) || 
             (this.currencym2!=null &&
              this.currencym2.equals(other.getCurrencym2()))) &&
            ((this.accountValue2==null && other.getAccountValue2()==null) || 
             (this.accountValue2!=null &&
              this.accountValue2.equals(other.getAccountValue2()))) &&
            ((this.aggregatedBalance2==null && other.getAggregatedBalance2()==null) || 
             (this.aggregatedBalance2!=null &&
              this.aggregatedBalance2.equals(other.getAggregatedBalance2()))) &&
            ((this.dedicatedAccountInformation==null && other.getDedicatedAccountInformation()==null) || 
             (this.dedicatedAccountInformation!=null &&
              java.util.Arrays.equals(this.dedicatedAccountInformation, other.getDedicatedAccountInformation()))) &&
            ((this.supervisionExpiryDate==null && other.getSupervisionExpiryDate()==null) || 
             (this.supervisionExpiryDate!=null &&
              this.supervisionExpiryDate.equals(other.getSupervisionExpiryDate()))) &&
            ((this.serviceFeeExpiryDate==null && other.getServiceFeeExpiryDate()==null) || 
             (this.serviceFeeExpiryDate!=null &&
              this.serviceFeeExpiryDate.equals(other.getServiceFeeExpiryDate()))) &&
            ((this.creditClearanceDate==null && other.getCreditClearanceDate()==null) || 
             (this.creditClearanceDate!=null &&
              this.creditClearanceDate.equals(other.getCreditClearanceDate()))) &&
            ((this.serviceRemovalDate==null && other.getServiceRemovalDate()==null) || 
             (this.serviceRemovalDate!=null &&
              this.serviceRemovalDate.equals(other.getServiceRemovalDate()))) &&
            ((this.languageIDCurrent==null && other.getLanguageIDCurrent()==null) || 
             (this.languageIDCurrent!=null &&
              this.languageIDCurrent.equals(other.getLanguageIDCurrent()))) &&
            ((this.temporaryBlockedFlag==null && other.getTemporaryBlockedFlag()==null) || 
             (this.temporaryBlockedFlag!=null &&
              this.temporaryBlockedFlag.equals(other.getTemporaryBlockedFlag()))) &&
            ((this.chargingResultInformation==null && other.getChargingResultInformation()==null) || 
             (this.chargingResultInformation!=null &&
              this.chargingResultInformation.equals(other.getChargingResultInformation()))) &&
            ((this.accountFlagsAfter==null && other.getAccountFlagsAfter()==null) || 
             (this.accountFlagsAfter!=null &&
              this.accountFlagsAfter.equals(other.getAccountFlagsAfter()))) &&
            ((this.accountFlagsBefore==null && other.getAccountFlagsBefore()==null) || 
             (this.accountFlagsBefore!=null &&
              this.accountFlagsBefore.equals(other.getAccountFlagsBefore()))) &&
            ((this.offerInformationList==null && other.getOfferInformationList()==null) || 
             (this.offerInformationList!=null &&
              java.util.Arrays.equals(this.offerInformationList, other.getOfferInformationList()))) &&
            ((this.negotiatedCapabilities==null && other.getNegotiatedCapabilities()==null) || 
             (this.negotiatedCapabilities!=null &&
              this.negotiatedCapabilities.equals(other.getNegotiatedCapabilities()))) &&
            ((this.availableServerCapabilities==null && other.getAvailableServerCapabilities()==null) || 
             (this.availableServerCapabilities!=null &&
              this.availableServerCapabilities.equals(other.getAvailableServerCapabilities()))) &&
            ((this.accountPrepaidEmptyLimit1==null && other.getAccountPrepaidEmptyLimit1()==null) || 
             (this.accountPrepaidEmptyLimit1!=null &&
              this.accountPrepaidEmptyLimit1.equals(other.getAccountPrepaidEmptyLimit1()))) &&
            ((this.accountPrepaidEmptyLimit2==null && other.getAccountPrepaidEmptyLimit2()==null) || 
             (this.accountPrepaidEmptyLimit2!=null &&
              this.accountPrepaidEmptyLimit2.equals(other.getAccountPrepaidEmptyLimit2()))) &&
            ((this.aggregatedBalanceInformation==null && other.getAggregatedBalanceInformation()==null) || 
             (this.aggregatedBalanceInformation!=null &&
              this.aggregatedBalanceInformation.equals(other.getAggregatedBalanceInformation()))) &&
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
        if (getOriginTransactionID() != null) {
            _hashCode += getOriginTransactionID().hashCode();
        }
        if (getServiceClassCurrent() != null) {
            _hashCode += getServiceClassCurrent().hashCode();
        }
        if (getServiceClassDesc() != null) {
            _hashCode += getServiceClassDesc().hashCode();
        }
        if (getCurrencym1() != null) {
            _hashCode += getCurrencym1().hashCode();
        }
        if (getAccountValue1() != null) {
            _hashCode += getAccountValue1().hashCode();
        }
        if (getAggregatedBalance1() != null) {
            _hashCode += getAggregatedBalance1().hashCode();
        }
        if (getCurrencym2() != null) {
            _hashCode += getCurrencym2().hashCode();
        }
        if (getAccountValue2() != null) {
            _hashCode += getAccountValue2().hashCode();
        }
        if (getAggregatedBalance2() != null) {
            _hashCode += getAggregatedBalance2().hashCode();
        }
        if (getDedicatedAccountInformation() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDedicatedAccountInformation());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getDedicatedAccountInformation(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSupervisionExpiryDate() != null) {
            _hashCode += getSupervisionExpiryDate().hashCode();
        }
        if (getServiceFeeExpiryDate() != null) {
            _hashCode += getServiceFeeExpiryDate().hashCode();
        }
        if (getCreditClearanceDate() != null) {
            _hashCode += getCreditClearanceDate().hashCode();
        }
        if (getServiceRemovalDate() != null) {
            _hashCode += getServiceRemovalDate().hashCode();
        }
        if (getLanguageIDCurrent() != null) {
            _hashCode += getLanguageIDCurrent().hashCode();
        }
        if (getTemporaryBlockedFlag() != null) {
            _hashCode += getTemporaryBlockedFlag().hashCode();
        }
        if (getChargingResultInformation() != null) {
            _hashCode += getChargingResultInformation().hashCode();
        }
        if (getAccountFlagsAfter() != null) {
            _hashCode += getAccountFlagsAfter().hashCode();
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
        if (getNegotiatedCapabilities() != null) {
            _hashCode += getNegotiatedCapabilities().hashCode();
        }
        if (getAvailableServerCapabilities() != null) {
            _hashCode += getAvailableServerCapabilities().hashCode();
        }
        if (getAccountPrepaidEmptyLimit1() != null) {
            _hashCode += getAccountPrepaidEmptyLimit1().hashCode();
        }
        if (getAccountPrepaidEmptyLimit2() != null) {
            _hashCode += getAccountPrepaidEmptyLimit2().hashCode();
        }
        if (getAggregatedBalanceInformation() != null) {
            _hashCode += getAggregatedBalanceInformation().hashCode();
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
        new org.apache.axis.description.TypeDesc(GetAccountDetailsResponseResponseHeaderBalanceAndDate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", ">>>GetAccountDetailsResponse>ResponseHeader>BalanceAndDate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originTransactionID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "originTransactionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceClassCurrent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "serviceClassCurrent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceClassDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "serviceClassDesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencym1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "currencym1"));
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
        elemField.setFieldName("aggregatedBalance1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "aggregatedBalance1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencym2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "currencym2"));
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
        elemField.setFieldName("aggregatedBalance2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "aggregatedBalance2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dedicatedAccountInformation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "dedicatedAccountInformation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", ">>>>GetAccountDetailsResponse>ResponseHeader>BalanceAndDate>dedicatedAccountInformation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supervisionExpiryDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "supervisionExpiryDate"));
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
        elemField.setFieldName("languageIDCurrent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "languageIDCurrent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("temporaryBlockedFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "temporaryBlockedFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargingResultInformation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "ChargingResultInformation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", ">>>>GetAccountDetailsResponse>ResponseHeader>BalanceAndDate>ChargingResultInformation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountFlagsAfter");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "accountFlagsAfter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", ">>>>GetAccountDetailsResponse>ResponseHeader>BalanceAndDate>accountFlagsAfter"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountFlagsBefore");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "accountFlagsBefore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", ">>>>GetAccountDetailsResponse>ResponseHeader>BalanceAndDate>accountFlagsBefore"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offerInformationList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "offerInformationList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", ">>>>GetAccountDetailsResponse>ResponseHeader>BalanceAndDate>offerInformationList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("negotiatedCapabilities");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "negotiatedCapabilities"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("availableServerCapabilities");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "availableServerCapabilities"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aggregatedBalanceInformation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", "aggregatedBalanceInformation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/INCommunicationManagement/GetAccountDetailsResponse.xsd", ">>>>GetAccountDetailsResponse>ResponseHeader>BalanceAndDate>aggregatedBalanceInformation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/SharedResources/Common/Common.xsd", "AdditionalInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/Middleware/SharedResources/Common/Common.xsd", "AdditionalInfo"));
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
