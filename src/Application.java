import com.aleksii.model.Customer;
import com.aleksii.service.CustomerService;
import com.aleksii.service.CustomerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Sathen on 29.03.2016.
 */
public class Application {
    public static void main(String []args){

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        CustomerService service = applicationContext.getBean("customerService",CustomerService.class);
        System.out.println(service);
        CustomerService service2 = applicationContext.getBean("customerService",CustomerService.class);
        System.out.println(service2);

        System.out.println(service.findAll().get(0).getFirstname());

    }
}
