package com.Design.pattern.factory.abstractFactory;

import com.Design.pattern.factory.EmailSender;
import com.Design.pattern.factory.ISender;

public class EmailFactory implements IProduc {

	@Override
	public ISender produce() {
		return new EmailSender();
	}

}
