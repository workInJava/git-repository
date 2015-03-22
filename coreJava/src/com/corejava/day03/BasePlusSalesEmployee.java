/**
 * 
 */
package com.corejava.day03;

import java.util.Date;

/**
 * @author    ������
 * @date      Jul 23, 2013 5:06:06 PM
 * @version   v1.0
 * @since     JDK6.0
 * @��Ŀ��    CoreJava
 * @����      com.corejava.day03
 * @�ļ���    BasePlusSalesEmployee.java
 */
public class BasePlusSalesEmployee 
				extends SalesEmployee {
	
	private double salary; //��н

	
	public BasePlusSalesEmployee() {
		super();
		
	}

	public BasePlusSalesEmployee(double salasVolumeOfMonth, double royaltyRate, double salary) {
		super(salasVolumeOfMonth, royaltyRate);
		this.salary = salary;
	}

	public BasePlusSalesEmployee(String name, Date birthday,
			double salasVolumeOfMonth, double royaltyRate, double salary) {
		super(name, birthday, salasVolumeOfMonth, royaltyRate);
		this.salary = salary;
	}

	/**
	 * @param salary
	 */
	public BasePlusSalesEmployee(double salary) {
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public double getSalary(int month){
		double s = super.getSalary(month);
		double bs = salary + s;
		/*
		System.out.printf("%s��
			��BasePlusSalesEmployee��
			���Ĺ���: %.2f\n"
			,super.getName(),bs==0?0:bs);*/
		return bs;
	}
	
}
