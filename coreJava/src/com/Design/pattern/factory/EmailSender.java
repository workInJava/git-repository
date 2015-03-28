package com.Design.pattern.factory;

public class EmailSender implements ISender {

	@Override
	public void send() {
		System.out.println("EmailSender send!!!!");
	}

}
