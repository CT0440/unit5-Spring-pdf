package di_xml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component  // Marks Car as a Spring bean
public class Car {

    @Autowired  // Automatically injects Tyre bean
    private Tyre tyre;

    public void drive() {
        System.out.println("Car " + tyre);
    }
}
