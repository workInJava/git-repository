package ext;

public class TestInner {

	public Inner method(){
		return new Inner(){
			
			public void method(){
				System.out.println("Inner method1");
			}
			
			public void method2(){
				System.out.println("Inner method2");
			}
		};
	}
	
}
