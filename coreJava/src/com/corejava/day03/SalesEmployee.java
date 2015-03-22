/**
 * 
 */
package com.corejava.day03;

import java.util.Date;

/**
 * 
 * @author    王华民
 * @date      Jul 23, 2013 4:56:12 PM
 * @version   v1.0
 * @since     JDK6.0
 * @项目名    CoreJava
 * @包名      com.corejava.day03
 * @文件名    SalesEmployee.java
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
