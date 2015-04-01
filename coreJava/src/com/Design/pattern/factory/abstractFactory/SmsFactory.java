package com.Design.pattern.factory.abstractFactory;

import com.Design.pattern.factory.ISender;
import com.Design.pattern.factory.SmsSender;

public class SmsFactory implements IProduc {

	@Override
	public ISender produce() {
		return new SmsSender();
	}

}
