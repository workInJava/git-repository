package com.corejava.day08;
//�����쳣
public class BalanceNotEnoughException 
						extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3673123933885680471L;

	//�Զ�������
	private double balance;
	
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public BalanceNotEnoughException() {
		// TODO Auto-generated constructor stub
	}

	public BalanceNotEnoughException
			(String message,double balance) {
		super(message);
		this.balance = balance;
		// TODO Auto-generated constructor stub
	}

	public BalanceNotEnoughException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public BalanceNotEnoughException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

}
