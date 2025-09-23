package di_xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;
public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");	
//		Vehicle obj = (Vehicle)context.getBean(Tyre.class);
//		obj.drive();
		
		Tyre t = (Tyre)context.getBean("tyre");
		System.out.println(t);

	}

}
