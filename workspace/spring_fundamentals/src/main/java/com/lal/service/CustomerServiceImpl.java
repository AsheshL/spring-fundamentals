package com.lal.service;

import com.lal.model.Customer;
import com.lal.repository.CustomerRepositoryHibernate;

import java.util.List;

/**
 * Created by Ashesh on 18-May-17.
 */
public class CustomerServiceImpl implements CustomerService {

    private CustomerRepositoryHibernate customerRepository;

    public void setCustomerRepository(CustomerRepositoryHibernate customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Customer> findAll(){
        return customerRepository.findAll();
    }
}
