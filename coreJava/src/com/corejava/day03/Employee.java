/**
 * 
 */
package com.corejava.day03;

import java.util.Calendar;
import java.util.Date;


/**
 * 
 * @author    王华民
 * @date      Jul 23, 2013 4:25:27 PM
 * @version   v1.0
 * @since     JDK6.0
 * @项目名    CoreJava
 * @包名      com.corejava.day03
 * @文件名    Employee.java
 */
public class Employee {
	
	private String name;
	private Date  birthday;
	

	public Employee() {
		super();
	}
	
	
	public Employee(String name, Date  birthday) {
		super();
		this.name = name;
		this.birthday = birthday;
	}

	public String getName() {
		return name;
	}
	public Date getBirthDate() {
		return birthday;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setBirthDate(Date birthday) {
		this.birthday = birthday;
	}
	
	//业务方法
	public double getSalary(int month){
		double s = 0;
		Calendar c1 = Calendar.getInstance();
		c1.setTime(birthday);
		if(month == c1.get(Calendar.MONTH) + 1){
			s = 100; 
		}
		return s;
	}
	
}
