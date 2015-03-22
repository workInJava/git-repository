package com.corejava.day10.homework;

public class PurcaseView implements Comparable {

	private String brand;
	private double total;
	
	public PurcaseView(String brand, double total) {
		super();
		this.brand = brand;
		this.total = total;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		//°´ ×Ü¼ÛÅÅ
		PurcaseView pv = (PurcaseView)o;
		if(pv.total > this.total){
			return 1;
		}else if(pv.total < this.total){
			return -1;
		}else{
			return 0;
		}
	}
	
}
