package com.corejava.day06.homework;

import java.text.NumberFormat;

public class TestNumber {
	public static void main(String args[]){
		NumberFormat nf =  NumberFormat.getInstance();
		nf.setMaximumIntegerDigits(2);
		
		System.out.println(nf.format(66.67868));
	}
	
}
