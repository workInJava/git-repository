package com.corejava.day08;

public enum OrderState {

	YUDING("预定")//类似private static final YUDING = new OrderState("预定")；
	,XIADANG("下单")
	,FAHUO("发货")
	,QIANDANG("签单");
	
	private OrderState(String value){
		this.value = value;
	}
	
	private String value;

	@Override
	public String toString() {
		return this.value;
	}
	
	
}
