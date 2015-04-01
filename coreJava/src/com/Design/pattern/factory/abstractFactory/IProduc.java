package com.Design.pattern.factory.abstractFactory;

import com.Design.pattern.factory.ISender;

//抽象工厂模式 可以提高可扩展性（即不用修改原有的类，只需增加类实现这个接口）
public interface IProduc {

	ISender produce();
}
