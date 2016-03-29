package com.aleksii;

import com.aleksii.repository.CustomerRepository;
import com.aleksii.repository.HibernateCustomerRepositoryImpl;
import com.aleksii.service.CustomerService;
import com.aleksii.service.CustomerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Sathen on 29.03.2016.
 */
@Configuration
public class AppConfig {

    @Bean(name="customerService")
    public CustomerService getCustomerService(){

        CustomerServiceImpl customerService = new CustomerServiceImpl();

        customerService.setCustomerRepository(getCustomerRepository());

        return customerService;
    }

    @Bean(name = "customerRepository")
    public CustomerRepository getCustomerRepository(){
        return new HibernateCustomerRepositoryImpl();
    }
}