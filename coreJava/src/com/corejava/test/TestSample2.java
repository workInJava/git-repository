package com.corejava.test;
/**
 * 
 * @author think
 * ����ģʽ ����ģʽ ģ��ģʽ
 */

//����ģʽ  Ψһ��ʵ��  �̰߳�ȫ
public class TestSample2 {
	private static TestSample2 test = new TestSample2(); 
	private TestSample2() {}
	public static TestSample2 getInstance(){
		return test;
	}
}

/*public class TestSample2 {
	private static class Test {
		private static final TestSample2 test = new TestSample2();
	}
	private TestSample2() {}
	public static final TestSample2 getInstance() {
		return Test.test;
	}
}*/



//����ģʽ��ʵ�������� ����new�� ͨ������ TestSample2.getInstance()���������ʵ������  ���÷���  ʵ�ֶ�̬  
/*public class TestSample2 {
	public static TestF getInstance (String flag) {
		if(flag == "1"){
			return new Test1();
		} else {
			return new Test2();
		}
	}
}*/

//ģ��ģʽ �� ����ģʽ ͬ��


