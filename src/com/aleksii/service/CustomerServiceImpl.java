package com.aleksii.service;

import com.aleksii.model.Customer;
import com.aleksii.repository.CustomerRepository;
import com.aleksii.repository.HibernateCustomerRepositoryImpl;

import java.util.List;


public class CustomerServiceImpl implements CustomerService {



    private CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }
    // = new HibernateCustomerRepositoryImpl();


    public void setCustomerRepository(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Customer> findAll(){

        return customerRepository.findAll();

    }
}
