package com.InteractionLogging.InteractionLogging.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CustomerResponse {
	
	private Result result;

	public Result getResult() {
		return result;
	}

	public void setResult(Result result) {
		this.result = result;
		
		
		
	}


	@JsonIgnoreProperties(ignoreUnknown = true)
	public static class Result{
		
		
		private Segment segment;
		private Nationality nationality;
		private List<Accounts> accounts;
		private List<Document> documents;
		
		

		
		
		
		public List<Document> getDocuments() {
			return documents;
		}

		public void setDocuments(List<Document> documents) {
			this.documents = documents;
		}
		
		
		public Segment getSegment() {
			return segment;
		}
		public void setSegment(Segment segment) {
			this.segment = segment;
		}
		public Nationality getNationality() {
			return nationality;
		}
		public void setNationality(Nationality nationality) {
			this.nationality = nationality;
		}
		public List<Accounts> getAccounts() {
			return accounts;
		}
		public void setAccounts(List<Accounts> accounts) {
			this.accounts = accounts;
		}
		
		
		
	}

	@JsonIgnoreProperties(ignoreUnknown = true)
	public static class Segment{
		
		private String code;

		public String getCode() {
			return code;
		}

		public void setCode(String code) {
			this.code = code;
		}
		
		
	}

	@JsonIgnoreProperties(ignoreUnknown = true)
	public static class Nationality{
		
		private String code;

		public String getCode() {
			return code;
		}

		public void setCode(String code) {
			this.code = code;
		}
		
	}

	@JsonIgnoreProperties(ignoreUnknown = true)
	public static class Accounts{
		
		private ProductGroup productGroup;
		private ProductStatus accountStatus;
		private CreditStatus creditStatus;
		private CreditReason creditReason;
		private List<Subscriptions> subscriptions; 
		private List<Notes> notes;
		private String customerClass;

		public String getCustomerClass() {
			return customerClass;
		}

		public void setCustomerClass(String customerClass) {
			this.customerClass = customerClass;
		}

		public List<Notes> getNotes() {
			return notes;
		}

		public void setNotes(List<Notes> notes) {
			this.notes = notes;
		}

		public CreditReason getCreditReason() {
			return creditReason;
		}

		public void setCreditReason(CreditReason creditReason) {
			this.creditReason = creditReason;
		}

		public CreditStatus getCreditStatus() {
			return creditStatus;
		}

		public void setCreditStatus(CreditStatus creditStatus) {
			this.creditStatus = creditStatus;
		}

		public ProductGroup getProductGroup() {
			return productGroup;
		}

		public void setProductGroup(ProductGroup productGroup) {
			this.productGroup = productGroup;
		}

		public ProductStatus getAccountStatus() {
			return accountStatus;
		}

		public void setAccountStatus(ProductStatus accountStatus) {
			this.accountStatus = accountStatus;
		}

		public List<Subscriptions> getSubscriptions() {
			return subscriptions;
		}

		public void setSubscriptions(List<Subscriptions> subscriptions) {
			this.subscriptions = subscriptions;
		}
		
		
		
		
	}

	@JsonIgnoreProperties(ignoreUnknown = true)
	public static class ProductGroup{
		
		private String code;

		public String getCode() {
			return code;
		}

		public void setCode(String code) {
			this.code = code;
		}
		
	}

	@JsonIgnoreProperties(ignoreUnknown = true)
	public static class ProductStatus{
		
		private String code;
		private String name;

		public String getCode() {
			return code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		
		
		
	}

	@JsonIgnoreProperties(ignoreUnknown = true)
	public static class CreditStatus{
	
	private String code;
	private String name;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
	@JsonIgnoreProperties(ignoreUnknown = true)
	public static class CreditReason{
	
	private String code;
	private String name;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}

	@JsonIgnoreProperties(ignoreUnknown = true)
	public static class Subscriptions{
		
		private Product product;

	    private Status status;

	    public Product getProduct ()
	    {
	        return product;
	    }

	    public void setProduct (Product product)
	    {
	        this.product = product;
	    }

	    public Status getStatus ()
	    {
	        return status;
	    }

	    public void setStatus (Status status)
	    {
	        this.status = status;
	    }
	}

	@JsonIgnoreProperties(ignoreUnknown = true)
	public static class Product
	{
	    private String productCode1;

	    public String getProductCode1 ()
	    {
	        return productCode1;
	    }

	    public void setProductCode1 (String productCode1)
	    {
	        this.productCode1 = productCode1;
	    }

	    
	}

	@JsonIgnoreProperties(ignoreUnknown = true)
	public static class Status
	{
	    private String code;

	    private String name;

	    private String id;

	    public String getCode ()
	    {
	        return code;
	    }

	    public void setCode (String code)
	    {
	        this.code = code;
	    }

	    public String getName ()
	    {
	        return name;
	    }

	    public void setName (String name)
	    {
	        this.name = name;
	    }

	    public String getId ()
	    {
	        return id;
	    }

	    public void setId (String id)
	    {
	        this.id = id;
	    }

	   
	    
	}

	@JsonIgnoreProperties(ignoreUnknown = true)
	public static class Notes{
		
		private String notesRemovedDate;
		private NotesType notesType;
		public String getNotesRemovedDate() {
			return notesRemovedDate;
		}
		public void setNotesRemovedDate(String notesRemovedDate) {
			this.notesRemovedDate = notesRemovedDate;
		}
		public NotesType getNotesType() {
			return notesType;
		}
		public void setNotesType(NotesType notesType) {
			this.notesType = notesType;
		}
		
		
		
	}
	@JsonIgnoreProperties(ignoreUnknown = true)
	public static class NotesType{
		
		private String code;

		public String getCode() {
			return code;
		}

		public void setCode(String code) {
			this.code = code;
		}
		
		
		
	}
	@JsonIgnoreProperties(ignoreUnknown = true)
	public static class Document{
		
		private String registrationStatus;
		private String effectiveTill;
		private Status status;
		
		
		

		public String getEffectiveTill() {
			return effectiveTill;
		}

		public void setEffectiveTill(String effectiveTill) {
			this.effectiveTill = effectiveTill;
		}

		public String getRegistrationStatus() {
			return registrationStatus;
		}

		public void setRegistrationStatus(String registrationStatus) {
			this.registrationStatus = registrationStatus;
		}

		public Status getStatus() {
			return status;
		}

		public void setStatus(Status status) {
			this.status = status;
		}
	}

}
