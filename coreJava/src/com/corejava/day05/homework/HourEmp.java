package com.corejava.day05.homework;

public class HourEmp extends Emp {

	private double HourSalary = 15.0;
	protected double Hour;
	
	public HourEmp() {
		super();
	}


	public HourEmp(double hourSalary, double hour) {
		super();
		HourSalary = hourSalary;
		Hour = hour;
	}


	public double getHourSalary() {
		return HourSalary;
	}


	public void setHourSalary(double hourSalary) {
		HourSalary = hourSalary;
	}


	public double getHour() {
		return Hour;
	}


	public void setHour(double hour) {
		Hour = hour;
	}


	public double calcSalary() {
		// TODO Auto-generated method stub
		return Hour*HourSalary;
	}

}
