package com.corejava.test;
/**
 * 
 * @author think
 * µ¥ÀýÄ£Ê½
 *
 */
/*public class TestSample {

	private static TestSample testSample = new TestSample();
	private TestSample(){}
	public static TestSample getInstance(){
		return testSample;
	} 
	
}*/
public class TestSample {
	private static class Sample {
		private static final TestSample TESTSAMPLE = new TestSample();
	}
	private TestSample(){}
	public static final TestSample getInstance() {
		return Sample.TESTSAMPLE;
	}  
}