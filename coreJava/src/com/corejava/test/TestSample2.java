package com.corejava.test;
/**
 * 
 * @author think
 * 单例模式 工厂模式 模版模式
 */

//单例模式  唯一的实例  线程安全
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



//工厂模式（实例化对象 代替new） 通过调用 TestSample2.getInstance()方法来获得实例对象  调用方法  实现多态  
/*public class TestSample2 {
	public static TestF getInstance (String flag) {
		if(flag == "1"){
			return new Test1();
		} else {
			return new Test2();
		}
	}
}*/

//模版模式 与 工厂模式 同用


