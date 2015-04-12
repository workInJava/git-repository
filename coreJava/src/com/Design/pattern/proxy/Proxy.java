package com.Design.pattern.proxy;


public class Proxy implements ISourceable {
	
	private ISourceable source;
	
	public Proxy(){
		this.source = new Source();
	}
	
	public Proxy(Source source){
		this.source = source;
	}
	
	public ISourceable getSource() {
		return source;
	}
	
	public void setSource(ISourceable source) {
		this.source = source;
	}
	
	private void before(){
		System.out.println("before proxy");
	}

	private void after(){
		System.out.println("after proxy");
	}
	@Override
	public void method() {
		before();
		source.method();
		after();
	}

}
