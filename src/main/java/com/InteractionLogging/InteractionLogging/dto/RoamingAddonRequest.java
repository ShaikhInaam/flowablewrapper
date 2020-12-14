package com.InteractionLogging.InteractionLogging.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.ToString;

@ToString
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RoamingAddonRequest {

	
	
	private ReqInfo requiredInfo;
	private String accountNumber;
	
	
	
	public ReqInfo getRequiredInfo() {
		return requiredInfo;
	}




	public void setRequiredInfo(ReqInfo requiredInfo) {
		this.requiredInfo = requiredInfo;
	}




	public String getAccountNumber() {
		return accountNumber;
	}




	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}




	public static class ReqInfo{
		
		private String subscriptions;
		private String autopay;
		private String accounts;
		private String latestAccount;
		private String segments;
		private String notes;
		private String documents;
		
		
		
		
		
		public String getDocuments() {
			return documents;
		}
		public void setDocuments(String documents) {
			this.documents = documents;
		}
		public String getNotes() {
			return notes;
		}
		public void setNotes(String notes) {
			this.notes = notes;
		}
		public String getSubscriptions() {
			return subscriptions;
		}
		public void setSubscriptions(String subscriptions) {
			this.subscriptions = subscriptions;
		}
		public String getAutopay() {
			return autopay;
		}
		public void setAutopay(String autopay) {
			this.autopay = autopay;
		}
		public String getAccounts() {
			return accounts;
		}
		public void setAccounts(String accounts) {
			this.accounts = accounts;
		}
		public String getLatestAccount() {
			return latestAccount;
		}
		public void setLatestAccount(String latestAccount) {
			this.latestAccount = latestAccount;
		}
		public String getSegments() {
			return segments;
		}
		public void setSegments(String segments) {
			this.segments = segments;
		}
		
		
		
	}
	
}
