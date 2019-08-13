package com.ing.modelbank.dto;

import java.io.Serializable;

public class TransactionDTO implements Serializable{
	

	
	public int getFromAccount() {
		return fromAccount;
	}
	public void setFromAccount(int fromAccount) {
		this.fromAccount = fromAccount;
	}
	public int getToAccount() {
		return toAccount;
	}
	public void setToAccount(int toAccount) {
		this.toAccount = toAccount;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	private int fromAccount;
	private int toAccount;
	private double amount;

}
