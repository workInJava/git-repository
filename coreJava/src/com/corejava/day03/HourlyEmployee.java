/**
 * 
 */
package com.corejava.day03;

import java.util.Date;



/**
 * @author    王华民
 * @date      Jul 23, 2013 4:48:20 PM
 * @version   v1.0
 * @since     JDK6.0
 * @项目名    CoreJava
 * @包名      com.corejava.day03
 * @文件名    HourlyEmployee.java
 */
public class HourlyEmployee extends Employee{
	private double hourSalary;
	private int hourOfMonth;
	
	public HourlyEmployee() {
		super();
	}
	
	public HourlyEmployee(double hourSalary, int hourOfMonth) {
		super();
		this.hourSalary = hourSalary;
		this.hourOfMonth = hourOfMonth;
	}
	

	/**
	 * @param name
	 * @param birthday
	 */
	public HourlyEmployee(String name, Date birthday,double hourSalary, int hourOfMonth) {
		super(name, birthday);
		this.hourSalary = hourSalary;
		this.hourOfMonth = hourOfMonth;
	}

	public double getHourSalary() {
		return hourSalary;
	}
	public int getHourOfMonth() {
		return hourOfMonth;
	}
	
	@Override
	public double getSalary(int month){
		double s = super.getSalary(month);
		double r = 0.0;
		if(hourOfMonth > 160){
			r = (hourOfMonth - 160) * 1.5 * hourSalary + 160 * hourSalary;
		}else{
			r = hourOfMonth * hourSalary;
		}
		
		/*double sa = hourSalary;
		
		if(hourOfMonth > 160){
			hs = (hourOfMonth - 160)
				* 1.5 * sa +  s +
				160 * sa;
		}
		System.out.printf("%s是个HourlyEmployee,
			每月工资：%.2f \n"
			,super.getName(),hs == s? 0:hs);
		double hs = hourOfMonth * sa + s;
		System.out.printf("%s是个HourlyEmployee,
			每月工资：%.2f \n"
			,super.getName(),hs == s? 0:hs);*/
		
		return r + s;
	}
	
}
