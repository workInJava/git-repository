package com.corejava.day05.homework;

public class Boss extends Emp {

	private double BaseSalary = 50000.0;
	

	public Boss() {
		// TODO Auto-generated constructor stub
	}
	
	public Boss(double baseSalary) {
		super();
		BaseSalary = baseSalary;
	}


	public double getBaseSalary() {
		return BaseSalary;
	}



	public void setBaseSalary(double baseSalary) {
		BaseSalary = baseSalary;
	}



	public double calcSalary() {
		// TODO Auto-generated method stub
		return BaseSalary;
	}

}
