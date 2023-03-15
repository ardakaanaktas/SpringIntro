import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

    //OkunacakContext xmk dosyamızı okuyarak contexte attık
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        ICustomerServices services = context.getBean("service",ICustomerServices.class);

        services.add();

    }
}