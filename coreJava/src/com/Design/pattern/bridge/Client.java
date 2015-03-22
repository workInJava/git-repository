package com.Design.pattern.bridge;

public class Client {

	public static void main(String[] args){
		Bridge bridge = new MyBridge();
		bridge.setSourceable(new SourceSub1());
		bridge.method();
		
		bridge.setSourceable(new SourceSub2());
		bridge.method();
	}
}
