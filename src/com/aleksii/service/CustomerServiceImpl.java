package com.aleksii.service;

import com.aleksii.model.Customer;
import com.aleksii.repository.CustomerRepository;
import com.aleksii.repository.HibernateCustomerRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository ;

    @Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository) {
        System.out.println("We are using the constructor  injection ");
        this.customerRepository = customerRepository;
    }


    public void setCustomerRepository(CustomerRepository customerRepository) {
        System.out.println("We are using the setter injection ");
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Customer> findAll(){

        return customerRepository.findAll();

    }
}
