package com.Design.pattern.prototype;

public class PrototypeDemo implements Cloneable {
	
	//ǳcopyע������������Դ�����ã����������½�
	public PrototypeDemo clone() throws CloneNotSupportedException{
		return (PrototypeDemo)super.clone();
	}
	
}
