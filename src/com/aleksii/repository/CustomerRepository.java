package com.aleksii.repository;

import com.aleksii.model.Customer;

import java.util.List;


public interface CustomerRepository {
    List<Customer> findAll();
}
