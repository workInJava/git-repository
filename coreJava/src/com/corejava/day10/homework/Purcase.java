package com.corejava.day10.homework;

public class Purcase {
	private String brand; // Ʒ��
	private String name; // ��Ʒ��
	private double cost; // ����

	public Purcase(String brand, String name, double cost) {
		super();
		this.brand = brand;
		this.name = name;
		this.cost = cost;
	}

	/**
	 * @return the brand
	 */
	public String getBrand() {
		return brand;
	}

	/**
	 * @param brand
	 *            the brand to set
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}

	/**
	 * @return the cost
	 */
	public double getCost() {
		return cost;
	}

	/**
	 * @param cost
	 *            the cost to set
	 */
	public void setCost(double cost) {
		this.cost = cost;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
