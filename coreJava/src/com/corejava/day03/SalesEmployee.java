/**
 * 
 */
package com.corejava.day03;

import java.util.Date;

/**
 * 
 * @author    ������
 * @date      Jul 23, 2013 4:56:12 PM
 * @version   v1.0
 * @since     JDK6.0
 * @��Ŀ��    CoreJava
 * @����      com.corejava.day03
 * @�ļ���    SalesEmployee.java
 */
public class SalesEmployee extends Employee {
	private double salasVolumeOfMonth;
	private double royaltyRate;

	public SalesEmployee() {
		
	}
	
	public SalesEmployee(double salasVolumeOfMonth, double royaltyRate) {
		super();
		this.salasVolumeOfMonth = salasVolumeOfMonth;
		this.royaltyRate = royaltyRate;
	}

	public SalesEmployee(String name, Date birthday, double salasVolumeOfMonth,
			double royaltyRate) {
		super(name, birthday);
		this.salasVolumeOfMonth = salasVolumeOfMonth;
		this.royaltyRate = royaltyRate;
	}

	public double getSalasVolumeOfMonth() {
		return salasVolumeOfMonth;
	}
	public double getRoyaltyRate() {
		return royaltyRate;
	}
	public void setSalasVolumeOfMonth(double salasVolumeOfMonth) {
		this.salasVolumeOfMonth = salasVolumeOfMonth;
	}
	public void setRoyaltyRate(double royaltyRate) {
		this.royaltyRate = royaltyRate;
	}
	@Override
	public double getSalary(int month){
		double s = super.getSalary(month);
		
		double ms = salasVolumeOfMonth * 
			royaltyRate + s;
		return ms;
	}
	
}
