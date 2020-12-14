/**
 * GetThirdPartyComplaintDtlsResponseComplaintDetailsArray.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.GetThirdPartyComplaintDtlsResponse_xsd;

public class GetThirdPartyComplaintDtlsResponseComplaintDetailsArray  implements java.io.Serializable {
    private long complaintId;

    private String category;

    private String accountNumber;

    private long partyId;

    private String partyFullName;

    private java.util.Date createdDate;

    private String complaintStatus;

    private String complaintDesc;

    private String complaintNature;

    private String complaintType;

    private String complaintChannelDesc;

    private java.util.Date complaintClosedDate;

    private String requestStatus;

    private String complaintNatureDesc;

    private String complaintTypeDesc;

    private String billingTechnicalFlag;

    private String accountCategory;

    private String productDesc;

    private String productGroupDesc;

    private String complaintRemarks;

    private String mobileContactNumber;

    private Boolean customerAdvisedForPossibleCharges;

    private Boolean chargeableVisitConfirmed;

    private ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.GetThirdPartyComplaintDtlsResponse_xsd.GetThirdPartyComplaintDtlsResponseComplaintDetailsArrayContactDetails[] contactDetails;

    private ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.GetThirdPartyComplaintDtlsResponse_xsd.GetThirdPartyComplaintDtlsResponseComplaintDetailsArrayAdditionalInfo[] additionalInfo;

    public GetThirdPartyComplaintDtlsResponseComplaintDetailsArray() {
    }

    public GetThirdPartyComplaintDtlsResponseComplaintDetailsArray(
           long complaintId,
           String category,
           String accountNumber,
           long partyId,
           String partyFullName,
           java.util.Date createdDate,
           String complaintStatus,
           String complaintDesc,
           String complaintNature,
           String complaintType,
           String complaintChannelDesc,
           java.util.Date complaintClosedDate,
           String requestStatus,
           String complaintNatureDesc,
           String complaintTypeDesc,
           String billingTechnicalFlag,
           String accountCategory,
           String productDesc,
           String productGroupDesc,
           String complaintRemarks,
           String mobileContactNumber,
           Boolean customerAdvisedForPossibleCharges,
           Boolean chargeableVisitConfirmed,
           ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.GetThirdPartyComplaintDtlsResponse_xsd.GetThirdPartyComplaintDtlsResponseComplaintDetailsArrayContactDetails[] contactDetails,
           ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.GetThirdPartyComplaintDtlsResponse_xsd.GetThirdPartyComplaintDtlsResponseComplaintDetailsArrayAdditionalInfo[] additionalInfo) {
           this.complaintId = complaintId;
           this.category = category;
           this.accountNumber = accountNumber;
           this.partyId = partyId;
           this.partyFullName = partyFullName;
           this.createdDate = createdDate;
           this.complaintStatus = complaintStatus;
           this.complaintDesc = complaintDesc;
           this.complaintNature = complaintNature;
           this.complaintType = complaintType;
           this.complaintChannelDesc = complaintChannelDesc;
           this.complaintClosedDate = complaintClosedDate;
           this.requestStatus = requestStatus;
           this.complaintNatureDesc = complaintNatureDesc;
           this.complaintTypeDesc = complaintTypeDesc;
           this.billingTechnicalFlag = billingTechnicalFlag;
           this.accountCategory = accountCategory;
           this.productDesc = productDesc;
           this.productGroupDesc = productGroupDesc;
           this.complaintRemarks = complaintRemarks;
           this.mobileContactNumber = mobileContactNumber;
           this.customerAdvisedForPossibleCharges = customerAdvisedForPossibleCharges;
           this.chargeableVisitConfirmed = chargeableVisitConfirmed;
           this.contactDetails = contactDetails;
           this.additionalInfo = additionalInfo;
    }


    /**
     * Gets the complaintId value for this GetThirdPartyComplaintDtlsResponseComplaintDetailsArray.
     * 
     * @return complaintId
     */
    public long getComplaintId() {
        return complaintId;
    }


    /**
     * Sets the complaintId value for this GetThirdPartyComplaintDtlsResponseComplaintDetailsArray.
     * 
     * @param complaintId
     */
    public void setComplaintId(long complaintId) {
        this.complaintId = complaintId;
    }


    /**
     * Gets the category value for this GetThirdPartyComplaintDtlsResponseComplaintDetailsArray.
     * 
     * @return category
     */
    public String getCategory() {
        return category;
    }


    /**
     * Sets the category value for this GetThirdPartyComplaintDtlsResponseComplaintDetailsArray.
     * 
     * @param category
     */
    public void setCategory(String category) {
        this.category = category;
    }


    /**
     * Gets the accountNumber value for this GetThirdPartyComplaintDtlsResponseComplaintDetailsArray.
     * 
     * @return accountNumber
     */
    public String getAccountNumber() {
        return accountNumber;
    }


    /**
     * Sets the accountNumber value for this GetThirdPartyComplaintDtlsResponseComplaintDetailsArray.
     * 
     * @param accountNumber
     */
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }


    /**
     * Gets the partyId value for this GetThirdPartyComplaintDtlsResponseComplaintDetailsArray.
     * 
     * @return partyId
     */
    public long getPartyId() {
        return partyId;
    }


    /**
     * Sets the partyId value for this GetThirdPartyComplaintDtlsResponseComplaintDetailsArray.
     * 
     * @param partyId
     */
    public void setPartyId(long partyId) {
        this.partyId = partyId;
    }


    /**
     * Gets the partyFullName value for this GetThirdPartyComplaintDtlsResponseComplaintDetailsArray.
     * 
     * @return partyFullName
     */
    public String getPartyFullName() {
        return partyFullName;
    }


    /**
     * Sets the partyFullName value for this GetThirdPartyComplaintDtlsResponseComplaintDetailsArray.
     * 
     * @param partyFullName
     */
    public void setPartyFullName(String partyFullName) {
        this.partyFullName = partyFullName;
    }


    /**
     * Gets the createdDate value for this GetThirdPartyComplaintDtlsResponseComplaintDetailsArray.
     * 
     * @return createdDate
     */
    public java.util.Date getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this GetThirdPartyComplaintDtlsResponseComplaintDetailsArray.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Date createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the complaintStatus value for this GetThirdPartyComplaintDtlsResponseComplaintDetailsArray.
     * 
     * @return complaintStatus
     */
    public String getComplaintStatus() {
        return complaintStatus;
    }


    /**
     * Sets the complaintStatus value for this GetThirdPartyComplaintDtlsResponseComplaintDetailsArray.
     * 
     * @param complaintStatus
     */
    public void setComplaintStatus(String complaintStatus) {
        this.complaintStatus = complaintStatus;
    }


    /**
     * Gets the complaintDesc value for this GetThirdPartyComplaintDtlsResponseComplaintDetailsArray.
     * 
     * @return complaintDesc
     */
    public String getComplaintDesc() {
        return complaintDesc;
    }


    /**
     * Sets the complaintDesc value for this GetThirdPartyComplaintDtlsResponseComplaintDetailsArray.
     * 
     * @param complaintDesc
     */
    public void setComplaintDesc(String complaintDesc) {
        this.complaintDesc = complaintDesc;
    }


    /**
     * Gets the complaintNature value for this GetThirdPartyComplaintDtlsResponseComplaintDetailsArray.
     * 
     * @return complaintNature
     */
    public String getComplaintNature() {
        return complaintNature;
    }


    /**
     * Sets the complaintNature value for this GetThirdPartyComplaintDtlsResponseComplaintDetailsArray.
     * 
     * @param complaintNature
     */
    public void setComplaintNature(String complaintNature) {
        this.complaintNature = complaintNature;
    }


    /**
     * Gets the complaintType value for this GetThirdPartyComplaintDtlsResponseComplaintDetailsArray.
     * 
     * @return complaintType
     */
    public String getComplaintType() {
        return complaintType;
    }


    /**
     * Sets the complaintType value for this GetThirdPartyComplaintDtlsResponseComplaintDetailsArray.
     * 
     * @param complaintType
     */
    public void setComplaintType(String complaintType) {
        this.complaintType = complaintType;
    }


    /**
     * Gets the complaintChannelDesc value for this GetThirdPartyComplaintDtlsResponseComplaintDetailsArray.
     * 
     * @return complaintChannelDesc
     */
    public String getComplaintChannelDesc() {
        return complaintChannelDesc;
    }


    /**
     * Sets the complaintChannelDesc value for this GetThirdPartyComplaintDtlsResponseComplaintDetailsArray.
     * 
     * @param complaintChannelDesc
     */
    public void setComplaintChannelDesc(String complaintChannelDesc) {
        this.complaintChannelDesc = complaintChannelDesc;
    }


    /**
     * Gets the complaintClosedDate value for this GetThirdPartyComplaintDtlsResponseComplaintDetailsArray.
     * 
     * @return complaintClosedDate
     */
    public java.util.Date getComplaintClosedDate() {
        return complaintClosedDate;
    }


    /**
     * Sets the complaintClosedDate value for this GetThirdPartyComplaintDtlsResponseComplaintDetailsArray.
     * 
     * @param complaintClosedDate
     */
    public void setComplaintClosedDate(java.util.Date complaintClosedDate) {
        this.complaintClosedDate = complaintClosedDate;
    }


    /**
     * Gets the requestStatus value for this GetThirdPartyComplaintDtlsResponseComplaintDetailsArray.
     * 
     * @return requestStatus
     */
    public String getRequestStatus() {
        return requestStatus;
    }


    /**
     * Sets the requestStatus value for this GetThirdPartyComplaintDtlsResponseComplaintDetailsArray.
     * 
     * @param requestStatus
     */
    public void setRequestStatus(String requestStatus) {
        this.requestStatus = requestStatus;
    }


    /**
     * Gets the complaintNatureDesc value for this GetThirdPartyComplaintDtlsResponseComplaintDetailsArray.
     * 
     * @return complaintNatureDesc
     */
    public String getComplaintNatureDesc() {
        return complaintNatureDesc;
    }


    /**
     * Sets the complaintNatureDesc value for this GetThirdPartyComplaintDtlsResponseComplaintDetailsArray.
     * 
     * @param complaintNatureDesc
     */
    public void setComplaintNatureDesc(String complaintNatureDesc) {
        this.complaintNatureDesc = complaintNatureDesc;
    }


    /**
     * Gets the complaintTypeDesc value for this GetThirdPartyComplaintDtlsResponseComplaintDetailsArray.
     * 
     * @return complaintTypeDesc
     */
    public String getComplaintTypeDesc() {
        return complaintTypeDesc;
    }


    /**
     * Sets the complaintTypeDesc value for this GetThirdPartyComplaintDtlsResponseComplaintDetailsArray.
     * 
     * @param complaintTypeDesc
     */
    public void setComplaintTypeDesc(String complaintTypeDesc) {
        this.complaintTypeDesc = complaintTypeDesc;
    }


    /**
     * Gets the billingTechnicalFlag value for this GetThirdPartyComplaintDtlsResponseComplaintDetailsArray.
     * 
     * @return billingTechnicalFlag
     */
    public String getBillingTechnicalFlag() {
        return billingTechnicalFlag;
    }


    /**
     * Sets the billingTechnicalFlag value for this GetThirdPartyComplaintDtlsResponseComplaintDetailsArray.
     * 
     * @param billingTechnicalFlag
     */
    public void setBillingTechnicalFlag(String billingTechnicalFlag) {
        this.billingTechnicalFlag = billingTechnicalFlag;
    }


    /**
     * Gets the accountCategory value for this GetThirdPartyComplaintDtlsResponseComplaintDetailsArray.
     * 
     * @return accountCategory
     */
    public String getAccountCategory() {
        return accountCategory;
    }


    /**
     * Sets the accountCategory value for this GetThirdPartyComplaintDtlsResponseComplaintDetailsArray.
     * 
     * @param accountCategory
     */
    public void setAccountCategory(String accountCategory) {
        this.accountCategory = accountCategory;
    }


    /**
     * Gets the productDesc value for this GetThirdPartyComplaintDtlsResponseComplaintDetailsArray.
     * 
     * @return productDesc
     */
    public String getProductDesc() {
        return productDesc;
    }


    /**
     * Sets the productDesc value for this GetThirdPartyComplaintDtlsResponseComplaintDetailsArray.
     * 
     * @param productDesc
     */
    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }


    /**
     * Gets the productGroupDesc value for this GetThirdPartyComplaintDtlsResponseComplaintDetailsArray.
     * 
     * @return productGroupDesc
     */
    public String getProductGroupDesc() {
        return productGroupDesc;
    }


    /**
     * Sets the productGroupDesc value for this GetThirdPartyComplaintDtlsResponseComplaintDetailsArray.
     * 
     * @param productGroupDesc
     */
    public void setProductGroupDesc(String productGroupDesc) {
        this.productGroupDesc = productGroupDesc;
    }


    /**
     * Gets the complaintRemarks value for this GetThirdPartyComplaintDtlsResponseComplaintDetailsArray.
     * 
     * @return complaintRemarks
     */
    public String getComplaintRemarks() {
        return complaintRemarks;
    }


    /**
     * Sets the complaintRemarks value for this GetThirdPartyComplaintDtlsResponseComplaintDetailsArray.
     * 
     * @param complaintRemarks
     */
    public void setComplaintRemarks(String complaintRemarks) {
        this.complaintRemarks = complaintRemarks;
    }


    /**
     * Gets the mobileContactNumber value for this GetThirdPartyComplaintDtlsResponseComplaintDetailsArray.
     * 
     * @return mobileContactNumber
     */
    public String getMobileContactNumber() {
        return mobileContactNumber;
    }


    /**
     * Sets the mobileContactNumber value for this GetThirdPartyComplaintDtlsResponseComplaintDetailsArray.
     * 
     * @param mobileContactNumber
     */
    public void setMobileContactNumber(String mobileContactNumber) {
        this.mobileContactNumber = mobileContactNumber;
    }


    /**
     * Gets the customerAdvisedForPossibleCharges value for this GetThirdPartyComplaintDtlsResponseComplaintDetailsArray.
     * 
     * @return customerAdvisedForPossibleCharges
     */
    public Boolean getCustomerAdvisedForPossibleCharges() {
        return customerAdvisedForPossibleCharges;
    }


    /**
     * Sets the customerAdvisedForPossibleCharges value for this GetThirdPartyComplaintDtlsResponseComplaintDetailsArray.
     * 
     * @param customerAdvisedForPossibleCharges
     */
    public void setCustomerAdvisedForPossibleCharges(Boolean customerAdvisedForPossibleCharges) {
        this.customerAdvisedForPossibleCharges = customerAdvisedForPossibleCharges;
    }


    /**
     * Gets the chargeableVisitConfirmed value for this GetThirdPartyComplaintDtlsResponseComplaintDetailsArray.
     * 
     * @return chargeableVisitConfirmed
     */
    public Boolean getChargeableVisitConfirmed() {
        return chargeableVisitConfirmed;
    }


    /**
     * Sets the chargeableVisitConfirmed value for this GetThirdPartyComplaintDtlsResponseComplaintDetailsArray.
     * 
     * @param chargeableVisitConfirmed
     */
    public void setChargeableVisitConfirmed(Boolean chargeableVisitConfirmed) {
        this.chargeableVisitConfirmed = chargeableVisitConfirmed;
    }


    /**
     * Gets the contactDetails value for this GetThirdPartyComplaintDtlsResponseComplaintDetailsArray.
     * 
     * @return contactDetails
     */
    public ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.GetThirdPartyComplaintDtlsResponse_xsd.GetThirdPartyComplaintDtlsResponseComplaintDetailsArrayContactDetails[] getContactDetails() {
        return contactDetails;
    }


    /**
     * Sets the contactDetails value for this GetThirdPartyComplaintDtlsResponseComplaintDetailsArray.
     * 
     * @param contactDetails
     */
    public void setContactDetails(ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.GetThirdPartyComplaintDtlsResponse_xsd.GetThirdPartyComplaintDtlsResponseComplaintDetailsArrayContactDetails[] contactDetails) {
        this.contactDetails = contactDetails;
    }

    public ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.GetThirdPartyComplaintDtlsResponse_xsd.GetThirdPartyComplaintDtlsResponseComplaintDetailsArrayContactDetails getContactDetails(int i) {
        return this.contactDetails[i];
    }

    public void setContactDetails(int i, ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.GetThirdPartyComplaintDtlsResponse_xsd.GetThirdPartyComplaintDtlsResponseComplaintDetailsArrayContactDetails _value) {
        this.contactDetails[i] = _value;
    }


    /**
     * Gets the additionalInfo value for this GetThirdPartyComplaintDtlsResponseComplaintDetailsArray.
     * 
     * @return additionalInfo
     */
    public ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.GetThirdPartyComplaintDtlsResponse_xsd.GetThirdPartyComplaintDtlsResponseComplaintDetailsArrayAdditionalInfo[] getAdditionalInfo() {
        return additionalInfo;
    }


    /**
     * Sets the additionalInfo value for this GetThirdPartyComplaintDtlsResponseComplaintDetailsArray.
     * 
     * @param additionalInfo
     */
    public void setAdditionalInfo(ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.GetThirdPartyComplaintDtlsResponse_xsd.GetThirdPartyComplaintDtlsResponseComplaintDetailsArrayAdditionalInfo[] additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.GetThirdPartyComplaintDtlsResponse_xsd.GetThirdPartyComplaintDtlsResponseComplaintDetailsArrayAdditionalInfo getAdditionalInfo(int i) {
        return this.additionalInfo[i];
    }

    public void setAdditionalInfo(int i, ae.etisalat.www.ManageSR.SharedResources.Schemas.ResponseSchemas.GetThirdPartyComplaintDtlsResponse_xsd.GetThirdPartyComplaintDtlsResponseComplaintDetailsArrayAdditionalInfo _value) {
        this.additionalInfo[i] = _value;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GetThirdPartyComplaintDtlsResponseComplaintDetailsArray)) return false;
        GetThirdPartyComplaintDtlsResponseComplaintDetailsArray other = (GetThirdPartyComplaintDtlsResponseComplaintDetailsArray) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.complaintId == other.getComplaintId() &&
            ((this.category==null && other.getCategory()==null) || 
             (this.category!=null &&
              this.category.equals(other.getCategory()))) &&
            ((this.accountNumber==null && other.getAccountNumber()==null) || 
             (this.accountNumber!=null &&
              this.accountNumber.equals(other.getAccountNumber()))) &&
            this.partyId == other.getPartyId() &&
            ((this.partyFullName==null && other.getPartyFullName()==null) || 
             (this.partyFullName!=null &&
              this.partyFullName.equals(other.getPartyFullName()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.complaintStatus==null && other.getComplaintStatus()==null) || 
             (this.complaintStatus!=null &&
              this.complaintStatus.equals(other.getComplaintStatus()))) &&
            ((this.complaintDesc==null && other.getComplaintDesc()==null) || 
             (this.complaintDesc!=null &&
              this.complaintDesc.equals(other.getComplaintDesc()))) &&
            ((this.complaintNature==null && other.getComplaintNature()==null) || 
             (this.complaintNature!=null &&
              this.complaintNature.equals(other.getComplaintNature()))) &&
            ((this.complaintType==null && other.getComplaintType()==null) || 
             (this.complaintType!=null &&
              this.complaintType.equals(other.getComplaintType()))) &&
            ((this.complaintChannelDesc==null && other.getComplaintChannelDesc()==null) || 
             (this.complaintChannelDesc!=null &&
              this.complaintChannelDesc.equals(other.getComplaintChannelDesc()))) &&
            ((this.complaintClosedDate==null && other.getComplaintClosedDate()==null) || 
             (this.complaintClosedDate!=null &&
              this.complaintClosedDate.equals(other.getComplaintClosedDate()))) &&
            ((this.requestStatus==null && other.getRequestStatus()==null) || 
             (this.requestStatus!=null &&
              this.requestStatus.equals(other.getRequestStatus()))) &&
            ((this.complaintNatureDesc==null && other.getComplaintNatureDesc()==null) || 
             (this.complaintNatureDesc!=null &&
              this.complaintNatureDesc.equals(other.getComplaintNatureDesc()))) &&
            ((this.complaintTypeDesc==null && other.getComplaintTypeDesc()==null) || 
             (this.complaintTypeDesc!=null &&
              this.complaintTypeDesc.equals(other.getComplaintTypeDesc()))) &&
            ((this.billingTechnicalFlag==null && other.getBillingTechnicalFlag()==null) || 
             (this.billingTechnicalFlag!=null &&
              this.billingTechnicalFlag.equals(other.getBillingTechnicalFlag()))) &&
            ((this.accountCategory==null && other.getAccountCategory()==null) || 
             (this.accountCategory!=null &&
              this.accountCategory.equals(other.getAccountCategory()))) &&
            ((this.productDesc==null && other.getProductDesc()==null) || 
             (this.productDesc!=null &&
              this.productDesc.equals(other.getProductDesc()))) &&
            ((this.productGroupDesc==null && other.getProductGroupDesc()==null) || 
             (this.productGroupDesc!=null &&
              this.productGroupDesc.equals(other.getProductGroupDesc()))) &&
            ((this.complaintRemarks==null && other.getComplaintRemarks()==null) || 
             (this.complaintRemarks!=null &&
              this.complaintRemarks.equals(other.getComplaintRemarks()))) &&
            ((this.mobileContactNumber==null && other.getMobileContactNumber()==null) || 
             (this.mobileContactNumber!=null &&
              this.mobileContactNumber.equals(other.getMobileContactNumber()))) &&
            ((this.customerAdvisedForPossibleCharges==null && other.getCustomerAdvisedForPossibleCharges()==null) || 
             (this.customerAdvisedForPossibleCharges!=null &&
              this.customerAdvisedForPossibleCharges.equals(other.getCustomerAdvisedForPossibleCharges()))) &&
            ((this.chargeableVisitConfirmed==null && other.getChargeableVisitConfirmed()==null) || 
             (this.chargeableVisitConfirmed!=null &&
              this.chargeableVisitConfirmed.equals(other.getChargeableVisitConfirmed()))) &&
            ((this.contactDetails==null && other.getContactDetails()==null) || 
             (this.contactDetails!=null &&
              java.util.Arrays.equals(this.contactDetails, other.getContactDetails()))) &&
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
        _hashCode += new Long(getComplaintId()).hashCode();
        if (getCategory() != null) {
            _hashCode += getCategory().hashCode();
        }
        if (getAccountNumber() != null) {
            _hashCode += getAccountNumber().hashCode();
        }
        _hashCode += new Long(getPartyId()).hashCode();
        if (getPartyFullName() != null) {
            _hashCode += getPartyFullName().hashCode();
        }
        if (getCreatedDate() != null) {
            _hashCode += getCreatedDate().hashCode();
        }
        if (getComplaintStatus() != null) {
            _hashCode += getComplaintStatus().hashCode();
        }
        if (getComplaintDesc() != null) {
            _hashCode += getComplaintDesc().hashCode();
        }
        if (getComplaintNature() != null) {
            _hashCode += getComplaintNature().hashCode();
        }
        if (getComplaintType() != null) {
            _hashCode += getComplaintType().hashCode();
        }
        if (getComplaintChannelDesc() != null) {
            _hashCode += getComplaintChannelDesc().hashCode();
        }
        if (getComplaintClosedDate() != null) {
            _hashCode += getComplaintClosedDate().hashCode();
        }
        if (getRequestStatus() != null) {
            _hashCode += getRequestStatus().hashCode();
        }
        if (getComplaintNatureDesc() != null) {
            _hashCode += getComplaintNatureDesc().hashCode();
        }
        if (getComplaintTypeDesc() != null) {
            _hashCode += getComplaintTypeDesc().hashCode();
        }
        if (getBillingTechnicalFlag() != null) {
            _hashCode += getBillingTechnicalFlag().hashCode();
        }
        if (getAccountCategory() != null) {
            _hashCode += getAccountCategory().hashCode();
        }
        if (getProductDesc() != null) {
            _hashCode += getProductDesc().hashCode();
        }
        if (getProductGroupDesc() != null) {
            _hashCode += getProductGroupDesc().hashCode();
        }
        if (getComplaintRemarks() != null) {
            _hashCode += getComplaintRemarks().hashCode();
        }
        if (getMobileContactNumber() != null) {
            _hashCode += getMobileContactNumber().hashCode();
        }
        if (getCustomerAdvisedForPossibleCharges() != null) {
            _hashCode += getCustomerAdvisedForPossibleCharges().hashCode();
        }
        if (getChargeableVisitConfirmed() != null) {
            _hashCode += getChargeableVisitConfirmed().hashCode();
        }
        if (getContactDetails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getContactDetails());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getContactDetails(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        new org.apache.axis.description.TypeDesc(GetThirdPartyComplaintDtlsResponseComplaintDetailsArray.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/GetThirdPartyComplaintDtlsResponse.xsd", ">>GetThirdPartyComplaintDtlsResponse>ComplaintDetailsArray"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("complaintId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/GetThirdPartyComplaintDtlsResponse.xsd", "ComplaintId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("category");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/GetThirdPartyComplaintDtlsResponse.xsd", "category"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/GetThirdPartyComplaintDtlsResponse.xsd", "AccountNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partyId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/GetThirdPartyComplaintDtlsResponse.xsd", "PartyId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partyFullName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/GetThirdPartyComplaintDtlsResponse.xsd", "PartyFullName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/GetThirdPartyComplaintDtlsResponse.xsd", "CreatedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("complaintStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/GetThirdPartyComplaintDtlsResponse.xsd", "ComplaintStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("complaintDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/GetThirdPartyComplaintDtlsResponse.xsd", "ComplaintDesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("complaintNature");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/GetThirdPartyComplaintDtlsResponse.xsd", "ComplaintNature"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("complaintType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/GetThirdPartyComplaintDtlsResponse.xsd", "ComplaintType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("complaintChannelDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/GetThirdPartyComplaintDtlsResponse.xsd", "ComplaintChannelDesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("complaintClosedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/GetThirdPartyComplaintDtlsResponse.xsd", "ComplaintClosedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/GetThirdPartyComplaintDtlsResponse.xsd", "RequestStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("complaintNatureDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/GetThirdPartyComplaintDtlsResponse.xsd", "ComplaintNatureDesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("complaintTypeDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/GetThirdPartyComplaintDtlsResponse.xsd", "ComplaintTypeDesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingTechnicalFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/GetThirdPartyComplaintDtlsResponse.xsd", "BillingTechnicalFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/GetThirdPartyComplaintDtlsResponse.xsd", "AccountCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/GetThirdPartyComplaintDtlsResponse.xsd", "ProductDesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productGroupDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/GetThirdPartyComplaintDtlsResponse.xsd", "ProductGroupDesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("complaintRemarks");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/GetThirdPartyComplaintDtlsResponse.xsd", "ComplaintRemarks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mobileContactNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/GetThirdPartyComplaintDtlsResponse.xsd", "MobileContactNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerAdvisedForPossibleCharges");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/GetThirdPartyComplaintDtlsResponse.xsd", "CustomerAdvisedForPossibleCharges"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargeableVisitConfirmed");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/GetThirdPartyComplaintDtlsResponse.xsd", "ChargeableVisitConfirmed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/GetThirdPartyComplaintDtlsResponse.xsd", "ContactDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/GetThirdPartyComplaintDtlsResponse.xsd", ">>>GetThirdPartyComplaintDtlsResponse>ComplaintDetailsArray>ContactDetails"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/GetThirdPartyComplaintDtlsResponse.xsd", "AdditionalInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.etisalat.ae/ManageSR/SharedResources/Schemas/ResponseSchemas/GetThirdPartyComplaintDtlsResponse.xsd", ">>>GetThirdPartyComplaintDtlsResponse>ComplaintDetailsArray>AdditionalInfo"));
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
