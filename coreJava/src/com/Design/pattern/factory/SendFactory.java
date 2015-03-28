package com.Design.pattern.factory;

public class SendFactory {

	public ISender produce(String type){
		if("sms".equals(type)){
			return new SmsSender();
		}else if("mail".equals(type)){
			return new EmailSender();
		}else{
			System.out.println("输入正确类型！！");
			return null;
		}
	}
	
	
}
