package com.examples;

public class HelloBean {
	private String name;
	public HelloBean(){
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void hello() {
		System.out.println("hello "+name);
	}

}
