package com.corejava.day08;

public class Account {

	private long id; //�ʺ�
	private double balance; //��� 
	public Account() {
		super();
	}
	public Account(long id, double balance) {
		super();
		this.id = id;
		this.balance = balance;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[�ʺ�=").append(id)
			.append(",���=").append(balance)
			.append("]");
		return builder.toString();
	}
}
