package com.Design.pattern.factory;

public class SendFactory {

	public ISender produce(String type){
		if("sms".equals(type)){
			return new SmsSender();
		}else if("mail".equals(type)){
			return new EmailSender();
		}else{
			System.out.println("������ȷ���ͣ���");
			return null;
		}
	}
	
	
}
