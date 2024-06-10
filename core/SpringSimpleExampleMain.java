package example.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringSimpleExampleMain {

	public static void main(String[] args) {
		ApplicationContext context;        
		String configPath =  "./src/main/resources/spring-config.xml";
	    context = new FileSystemXmlApplicationContext(configPath);
	    Object loadedObject = context.getBean("greet4");
	   GreetingService gs = (GreetingService)loadedObject;
	    //GreetingService gs = (GreetingService)loadedObject;  ----> there are 3 way
	    //HelloService gs = (HelloService)loadedObject;
	    String reply = (gs).sayGreeting();
	    System.out.println(reply);
	    
	    
	    
	    
	    System.out.println("-------------------------");
	    
		   loadedObject = context.getBean("greet5");
			  gs = (GreetingService)loadedObject;
			    reply = (gs).sayGreeting();
			    System.out.println(reply);
		    
			
	}

}
