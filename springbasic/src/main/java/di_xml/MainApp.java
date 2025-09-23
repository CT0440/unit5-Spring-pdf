package di_xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Car car = context.getBean(Car.class);  // Get Car bean
        car.drive();  // Output: Car it's working..
    }
}
