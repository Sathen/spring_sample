package com.aleksii.repository;

import com.aleksii.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

    @Override
    public List<Customer> findAll() {

        List<Customer> customers = new ArrayList<>();

        Customer customer = new Customer();

        customer.setFirstname("Aleksii");
        customer.setLastname("Shkot");

        customers.add(customer);

        return customers;

    }
}
