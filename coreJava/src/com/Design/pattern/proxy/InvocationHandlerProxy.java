package com.Design.pattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class InvocationHandlerProxy implements InvocationHandler {
	
	private Object obj;
	
	public Object bind(Object obj){
		this.obj = obj;
		return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), this);
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)throws Throwable {
		Object result = null;
		beforeMethod();
		obj = method.invoke(this.obj, args);
		afterMethod();
		return result;
	}

	private void beforeMethod(){
		System.out.println("方法前切入");
	}
	
	private void afterMethod(){
		System.out.println("方法后切入");
	}
	
}
