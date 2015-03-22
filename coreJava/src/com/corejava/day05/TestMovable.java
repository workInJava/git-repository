package com.corejava.day05;

/**********
 * 调用者
 * @author 	jsd1307
 * @创建时间 Jul 25, 2013 2:26:56 PM
 * @version v1.0
 * @since   JDK6.0
 * @项目名   CoreJava
 * @包名     com.corejava.day05
 * @文件名   TestMovable.java
 *
 */
public class TestMovable {

	public static void main(String[] args) {
		//创建对象
//		Movable r = new Car();
		//利用简单工厂解耦
		Movable r = MovableFactory.getInstance();
		//如果打上了 Checked 标记，则提示不要超速
		if(r instanceof Checked){
			System.out.println("注意，请不要超速...");
		}
		r.move(Movable.EAST);
	}
}


