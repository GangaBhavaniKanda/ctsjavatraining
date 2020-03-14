package exam;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonMain {

	public static void main(String[] args) {
	
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("person-bean.xml");
	
		Person p=(Person)context.getBean("p");
		p.showData();
		context.registerShutdownHook();
	}

}
