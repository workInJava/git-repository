/**
 * 
 */
package com.corejava.day05.homework;

/**
 * @author   jsd1307 cl
 * @date     Jul 25, 2013 6:51:24 PM
 * @version  v1.0
 * @since    JDK6.0
 * @项目名    CoreJava
 * @包名      com.corejava.day05.homework
 * @文件名    CalPlayer.java
 *
 */
public class CalPlayer implements Player {
	 private String name;//参与者的名字
	 
	public CalPlayer(String name) {
		super();
		this.name = name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/* (non-Javadoc)
	 * @see com.corejava.day05.homework.Player#getName()
	 */
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	/* (non-Javadoc)
	 * @see com.corejava.day05.homework.Player#show()
	 */
	@Override
	public String show() {
		// TODO Auto-generated method stub
		String str="";
		int num=(int)(Math.random()*3);
		switch (num) {
		case 0:
			str=BU;
			break;
		case 1:
			str=JIANDAO;
			break;
		case 2:
			str=SHITOU;
			break;
		default:
			System.out.println("出的手势无效！");
			break;
		}
		return str;
	}

}
