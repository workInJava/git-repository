package com.corejava.day04.homework;

public class TestSingleton {

	/*//private static TestSingleton testSingleton = new TestSingleton();
	
	
	
	public static TestSingleton  getInstance(){
		return testSingleton;
	}
	
	private static TestSingleton testSingleton = null;
	
	//�̲߳���ȫ��1���߳�a����19��ʱ�����testSingletonΪ�գ���ʱ�л��߳�b��Ҳ����19�У����
	//testSingletonҲΪ�գ�Ȼ��ʵ�������л�a�̣߳�Ҳʵ�������̲߳���ȫ
	public static TestSingleton getInstance(){
		if(testSingleton==null){
			testSingleton = new TestSingleton();
		}
		return testSingleton;
	}
	
	
	*/
	
	private TestSingleton(){
		
	}
	
	private static class  TestSingle{
		private static final TestSingleton testSingleton = new TestSingleton();
	}
	
	public static TestSingleton getInstance(){
		return TestSingle.testSingleton;
	}
}
