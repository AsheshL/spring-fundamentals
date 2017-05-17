package com.lal.repository;

import com.lal.model.Customer;

import java.util.List;

/**
 * Created by Ashesh on 18-May-17.
 */
public interface CustomerRepositoryHibernate {
    List<Customer> findAll();
}
