package com.ing.modelbank.dto;

import java.io.Serializable;

public class TransactionDetailsDTO implements Serializable{

	
	private Long transactionId;
	private String message;
	public Long getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(Long transactionId) {
		this.transactionId = transactionId;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}
