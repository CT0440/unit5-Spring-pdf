package di_xml;

import org.springframework.stereotype.Component;

@Component  // Marks Tyre as a Spring bean
public class Tyre {
    @Override
    public String toString() {
        return "it's working..";
    }
}
