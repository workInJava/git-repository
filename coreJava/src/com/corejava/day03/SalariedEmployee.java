/**
 * 
 */
package com.corejava.day03;

import java.util.Calendar;
import java.util.Date;

/**
 * @author    王华民
 * @date      Jul 23, 2013 4:44:53 PM
 * @version   v1.0
 * @since     JDK6.0
 * @项目名    CoreJava
 * @包名      com.corejava.day03
 * @文件名    SalariedEmployee.java
 */
public class SalariedEmployee extends Employee{
	
	private double wage;
	

	public SalariedEmployee() {
		super();
	}

	
	

	/**
	 * @param name
	 * @param birthday
	 * @param wage
	 */
	public SalariedEmployee(String name, Date birthday, double wage) {
		super(name, birthday);
		this.wage = wage;
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		this.wage = wage;
	}
	@Override
	public double getSalary(int month){
		
		double s = super.getSalary(month) + wage;
		
		/*System.out.printf("%s是个
		SalariedEmployee，
			他的工资%d月是%.2f\n"
		,super.getName(),month,s == 100?0:s);
		if(s == 100){
			System.out.printf("原因：
			因为%s没上班\n",super.getName());
		}*/
		return s;
	}
	
	
}
