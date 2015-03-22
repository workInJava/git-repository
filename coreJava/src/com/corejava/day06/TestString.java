package com.corejava.day06;

public class TestString {

	public static void main(String[] args) {
		//利用“串池”
		String s1 = "Jack";
		String s2 = "Jack";
		System.out.println(s1.hashCode()+","+s2.hashCode());
		
		System.out.println(Integer.toHexString(s1.hashCode()));
		System.out.println(Integer.toHexString(s2.hashCode()));
		
		System.out.println(s1 == s2);
		
		//不使用 “串池”
		String s3 = new String("ann");
		String s4 = new String("ann");
		System.out.println(s3 == s4);//比内存地址
		
		System.out.println("//------------------------");
		/*long start = System.currentTimeMillis();
		String str = "";
		for(int i=0;i<50000;i++){
			str += "hello,张三";
		}
		long end = System.currentTimeMillis();
		//输出所需耗时
		System.out.printf("耗时：[%d] ms\n",end-start);
		*/
		long start = System.currentTimeMillis();
		StringBuilder builder = new StringBuilder();
		for(int i=0;i<3000000;i++){
			builder.append("hello,张三");
		}
		long end = System.currentTimeMillis();
		System.out.printf("耗时：[%d] ms\n",end-start);
	}
}




