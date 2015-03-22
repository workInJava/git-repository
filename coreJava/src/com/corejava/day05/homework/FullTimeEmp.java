package com.corejava.day05.homework;

public class FullTimeEmp extends Emp {
	
	private double BaseSalary = 3000.0;
	private double TiCheng = 0.1;
	private double Job;//完成任务
	
	
	public FullTimeEmp(double baseSalary, double tiCheng, double job) {
		super();
		BaseSalary = baseSalary;
		TiCheng = tiCheng;
		Job = job;
	}
		

	public double getBaseSalary() {
		return BaseSalary;
	}


	public void setBaseSalary(double baseSalary) {
		BaseSalary = baseSalary;
	}


	public double getTiCheng() {
		return TiCheng;
	}


	public void setTiCheng(double tiCheng) {
		TiCheng = tiCheng;
	}


	public double getJob() {
		return Job;
	}


	public void setJob(double job) {
		Job = job;
	}

	

	public double calcSalary() {
		// TODO Auto-generated method stub
		double d = 0.0;
		if(Job<1.3){
			d = BaseSalary*1.1;
		}else if(Job<1.5){
			d = BaseSalary+300*1.5;
		}else if(Job<1.8){
			d = BaseSalary+300*2;			
		}else{
			d = BaseSalary+300*3;
		}
		return d;
	}

}
