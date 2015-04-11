package com.Design.pattern.prototype;

public class PrototypeDemo implements Cloneable {
	
	//浅copy注：引用类型与源对象公用，基本类型新建
	public PrototypeDemo clone() throws CloneNotSupportedException{
		return (PrototypeDemo)super.clone();
	}
	
}
