package com.corejava.day08;

public class TestOrderEnum {

		public static void  main(String[] args){
			OrderState[] od = OrderState.values();
			for(OrderState st : od){
				System.out.println(st);
			}
		}
}
