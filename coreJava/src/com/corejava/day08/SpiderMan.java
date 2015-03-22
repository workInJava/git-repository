package com.corejava.day08;

public class SpiderMan extends Person {

	public static void main(String[] args) {
		Person p = new SpiderMan("匹克","正义");
		p.run();
	}
	
	//属性
	private String name;
	private Spiderable spider;
	
	public SpiderMan(String name,String type){
		this.name = name;
		this.spider = new MySpider(type);
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.printf("蜘蛛侠【%s】闪亮登场，期待吧。\n",name);
		spider.run();
	}

	public Spiderable getSpider(){
		return this.spider;
	}
	
	//内部类
	private class MySpider implements Spiderable{
		//属性
		private String type; //蜘蛛的类型，是正义还是邪恶
		public MySpider(String type){
			this.type = type;
		}
		
		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			if(type.equals("正义")){
				System.out.println("红色的力量启动，为正义而战.");
			}else{
				System.out.println("黑色的力量启动，摧毁一切吧.");
			}
		}
	}
}
