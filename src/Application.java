import com.aleksii.model.Customer;
import com.aleksii.service.CustomerService;
import com.aleksii.service.CustomerServiceImpl;

/**
 * Created by Sathen on 29.03.2016.
 */
public class Application {
    public static void main(String []args){

         CustomerService service = new CustomerServiceImpl();

        System.out.println(service.findAll().get(0).getFirstname());

    }
}
