package example.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeExampleMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config3.xml");
	Object obj = context.getBean("myBean3");   //1 request
	Object obj1 = context.getBean("myBean3");  //2 request
	System.out.println(obj == obj1);
	
	
	System.out.println("------------------------------");
	 obj = context.getBean("myBean4");   //1 request
	 obj1 = context.getBean("myBean4");  //2 request
	System.out.println(obj == obj1);
		
	}

	
	
}
