package models;

public class Account {
	private AccountStatus status;
	private AccountType type;
	private int accountId; // primary key
	private double balance;  // not null
	  
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}

}
