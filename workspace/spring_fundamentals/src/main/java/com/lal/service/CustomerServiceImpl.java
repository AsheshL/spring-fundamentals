package com.lal.service;

import com.lal.model.Customer;
import com.lal.repository.CustomerRepositoryHibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Ashesh on 18-May-17.
 */
@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepositoryHibernate customerRepository;

    @Override
    public List<Customer> findAll(){
        return customerRepository.findAll();
    }
}
