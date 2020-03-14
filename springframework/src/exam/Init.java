package exam;

import org.springframework.beans.factory.config.BeanPostProcessor;

public class Init implements BeanPostProcessor {
	
	public Object postProcessBeforeInitialization(Object bean,String beanName) {
		System.out.println("bean before Initialized");
		return bean;
	}
	public Object postProcessAfterInitialization(Object bean,String beanName) {
		System.out.println("bean After Initialized");
		return bean;
	}


}
