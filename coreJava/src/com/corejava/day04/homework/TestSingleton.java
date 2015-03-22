package com.corejava.day04.homework;

public class TestSingleton {

	/*//private static TestSingleton testSingleton = new TestSingleton();
	
	
	
	public static TestSingleton  getInstance(){
		return testSingleton;
	}
	
	private static TestSingleton testSingleton = null;
	
	//线程不安全，1，线程a进入19行时，检查testSingleton为空，此时切换线程b，也进入19行，检测
	//testSingleton也为空，然后实例化，切换a线程，也实例化，线程不安全
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
