package ext;

import java.util.Date;

class TestThread implements Runnable {
	private String name;

	Student s = new Student();
	@Override
	public void run() {
		System.out.println(new Date());
		//for(int i=0;i<100;i++){
			s.fixName(Thread.currentThread().getName()+"-huahua",1);
		//}
		System.out.println(new Date());
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}

public class TestT{
	
	public static void main(String[] args){
		TestThread tt = new TestThread();
		Thread t = new Thread(tt,"thread-t");
		Thread ts = new Thread(tt,"thread-s");
		t.start();
		ts.start();
	}
}