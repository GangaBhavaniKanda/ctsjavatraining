package exam;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DenpendencyInjectionOfListValuesMain {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("dependency_using_constructor.xml");
		System.out.println("=================== Using Map=============");
		DenpendencyInjectionUsingMap dm=(DenpendencyInjectionUsingMap)ctx.getBean("con");
		dm.show();
		

	}

}
