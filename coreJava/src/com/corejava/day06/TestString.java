package com.corejava.day06;

public class TestString {

	public static void main(String[] args) {
		//���á����ء�
		String s1 = "Jack";
		String s2 = "Jack";
		System.out.println(s1.hashCode()+","+s2.hashCode());
		
		System.out.println(Integer.toHexString(s1.hashCode()));
		System.out.println(Integer.toHexString(s2.hashCode()));
		
		System.out.println(s1 == s2);
		
		//��ʹ�� �����ء�
		String s3 = new String("ann");
		String s4 = new String("ann");
		System.out.println(s3 == s4);//���ڴ��ַ
		
		System.out.println("//------------------------");
		/*long start = System.currentTimeMillis();
		String str = "";
		for(int i=0;i<50000;i++){
			str += "hello,����";
		}
		long end = System.currentTimeMillis();
		//��������ʱ
		System.out.printf("��ʱ��[%d] ms\n",end-start);
		*/
		long start = System.currentTimeMillis();
		StringBuilder builder = new StringBuilder();
		for(int i=0;i<3000000;i++){
			builder.append("hello,����");
		}
		long end = System.currentTimeMillis();
		System.out.printf("��ʱ��[%d] ms\n",end-start);
	}
}




