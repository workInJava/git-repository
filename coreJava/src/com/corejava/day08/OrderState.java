package com.corejava.day08;

public enum OrderState {

	YUDING("Ԥ��")//����private static final YUDING = new OrderState("Ԥ��")��
	,XIADANG("�µ�")
	,FAHUO("����")
	,QIANDANG("ǩ��");
	
	private OrderState(String value){
		this.value = value;
	}
	
	private String value;

	@Override
	public String toString() {
		return this.value;
	}
	
	
}
