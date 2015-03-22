package com.corejava.day08;

public class SpiderMan extends Person {

	public static void main(String[] args) {
		Person p = new SpiderMan("ƥ��","����");
		p.run();
	}
	
	//����
	private String name;
	private Spiderable spider;
	
	public SpiderMan(String name,String type){
		this.name = name;
		this.spider = new MySpider(type);
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.printf("֩������%s�������ǳ����ڴ��ɡ�\n",name);
		spider.run();
	}

	public Spiderable getSpider(){
		return this.spider;
	}
	
	//�ڲ���
	private class MySpider implements Spiderable{
		//����
		private String type; //֩������ͣ������廹��а��
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
			if(type.equals("����")){
				System.out.println("��ɫ������������Ϊ�����ս.");
			}else{
				System.out.println("��ɫ�������������ݻ�һ�а�.");
			}
		}
	}
}
