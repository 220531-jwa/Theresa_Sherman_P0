package dev.sherman.models;

public class Account {

	private int accountId;
	private String accountName;
	private float balance;
	
	public Account() {
		
	}
	
	public Account(int accountId, String accountName, float balance) {
		this.accountId = accountId;
		this.accountName = accountName;
		this.balance = balance;
		
	}
	
	public int getAccountId() {
		return accountId;
	}

	public void setClientId(int accountId) {
		this.accountId = accountId;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public float getBalance() {
		return balance;
	}

	public void setPassword(float balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", accountName=" + accountName + ", balance=" + balance + "]";
	}


	
}
