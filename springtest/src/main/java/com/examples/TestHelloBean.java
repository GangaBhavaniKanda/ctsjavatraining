package com.examples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestHelloBean {
	public static void main(String []args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationcontext.xml");
		HelloBean h=(HelloBean)ctx.getBean("hello");
		h.hello();
	}

}
