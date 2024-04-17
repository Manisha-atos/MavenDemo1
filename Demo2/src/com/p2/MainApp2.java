package com.p2;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainApp2 {

	public static void main(String[] args) {
		 Resource resource=new ClassPathResource("beans1.xml");  

		    
		    AbstractApplicationContext ctx=new ClassPathXmlApplicationContext("beans1.xml");
		    System.out.println("container is init...");
		    Employee a=(Employee) ctx.getBean("e1");
		    a.show();
		    Employee b=(Employee) ctx.getBean("e2");
		    b.show();
		    ctx.close();
		    
		  
		    
		   

	}

}
