package com.aleksii.service;

import com.aleksii.model.Customer;
import com.aleksii.repository.CustomerRepository;
import com.aleksii.repository.HibernateCustomerRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository;

    public CustomerServiceImpl() {

    }

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }
    // = new HibernateCustomerRepositoryImpl();

    @Autowired
    public void setCustomerRepository(CustomerRepository customerRepository) {
        System.out.println("Here i am using a setter injection");
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Customer> findAll() {

        return customerRepository.findAll();

    }
}
