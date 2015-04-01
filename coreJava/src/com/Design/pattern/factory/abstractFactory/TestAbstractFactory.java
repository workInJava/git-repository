package com.Design.pattern.factory.abstractFactory;

import com.Design.pattern.factory.ISender;


public class TestAbstractFactory {

	public static void main(String[] args){
		IProduc sender = new SmsFactory();
		ISender sms = sender.produce();
		sms.send();
	}
}
