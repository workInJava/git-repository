/**
 * 
 */
package com.corejava.day03;

import java.util.Date;

/**
 * @author    王华民
 * @date      Jul 23, 2013 5:06:06 PM
 * @version   v1.0
 * @since     JDK6.0
 * @项目名    CoreJava
 * @包名      com.corejava.day03
 * @文件名    BasePlusSalesEmployee.java
 */
public class BasePlusSalesEmployee 
				extends SalesEmployee {
	
	private double salary; //底薪

	
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
		System.out.printf("%s是
			个BasePlusSalesEmployee，
			他的工资: %.2f\n"
			,super.getName(),bs==0?0:bs);*/
		return bs;
	}
	
}
