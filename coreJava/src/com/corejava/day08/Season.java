package com.corejava.day08;


//四季
public enum Season {
	//public static final Season SPRING = new Season("春");
	SPRING("春"){
		@Override
		public Season next() {
			// TODO Auto-generated method stub
			return SUMMER;
		}
	}
	,SUMMER("夏"){
		@Override
		public Season next() {
			// TODO Auto-generated method stub
			return AUTUMN;
		}
	}
	,AUTUMN("秋"){
		@Override
		public Season next() {
			// TODO Auto-generated method stub
			return WINTER;
		}
	}
	,WINTER("冬"){
		@Override
		public Season next() {
			// TODO Auto-generated method stub
			return SPRING;
		}
	};
	
	//属性
	private String value;
	
	//构造方法
	private Season(String value){
		this.value = value;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.value;
	}
	
	//抽象方法: 返回下一个季节
	public abstract Season next();
	
}


