package com.corejava.day08;


//�ļ�
public enum Season {
	//public static final Season SPRING = new Season("��");
	SPRING("��"){
		@Override
		public Season next() {
			// TODO Auto-generated method stub
			return SUMMER;
		}
	}
	,SUMMER("��"){
		@Override
		public Season next() {
			// TODO Auto-generated method stub
			return AUTUMN;
		}
	}
	,AUTUMN("��"){
		@Override
		public Season next() {
			// TODO Auto-generated method stub
			return WINTER;
		}
	}
	,WINTER("��"){
		@Override
		public Season next() {
			// TODO Auto-generated method stub
			return SPRING;
		}
	};
	
	//����
	private String value;
	
	//���췽��
	private Season(String value){
		this.value = value;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.value;
	}
	
	//���󷽷�: ������һ������
	public abstract Season next();
	
}


