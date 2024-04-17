

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainApp2 {

	public static void main(String[] args) {
		 Resource resource=new ClassPathResource("beans.xml");  

		    
		    ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
		    System.out.println("container is init...");
		    Employee a=(Employee) ctx.getBean(Employee.class);
//		    Employee b=(Employee) ctx.getBean("e2");
		    a.show();
//		    b.show();
//		  
		    
		   

	}

}
