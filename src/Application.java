import com.aleksii.AppConfig;
import com.aleksii.model.Customer;
import com.aleksii.service.CustomerService;
import com.aleksii.service.CustomerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Sathen on 29.03.2016.
 */
public class Application {
    public static void main(String []args){

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

         CustomerService service = applicationContext.getBean("customerService", CustomerService.class);

        System.out.println(service.findAll().get(0).getFirstname());

    }
}
