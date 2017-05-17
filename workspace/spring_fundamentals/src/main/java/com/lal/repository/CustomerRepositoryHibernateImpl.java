package com.lal.repository;

import com.lal.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ashesh on 17-May-17.
 */
@Repository("customerRepository")
public class CustomerRepositoryHibernateImpl implements CustomerRepositoryHibernate {

    public static final String FIRST_NAME = "Ashesh";
    public static final String LAST_NAME = "Lal";

    @Override
    public List<Customer> findAll(){
        List<Customer> customers = new ArrayList<>();

        Customer me = new Customer();
        me.setFirstName(FIRST_NAME);
        me.setLastName(LAST_NAME);

        customers.add(me);

        return customers;
    }
}
