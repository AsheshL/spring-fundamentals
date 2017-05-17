package com.lal;

import com.lal.model.Customer;
import com.lal.service.CustomerService;
import com.lal.service.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Ashesh on 18-May-17.
 */
public class Application {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        CustomerService customerService = applicationContext.getBean("customerService", CustomerService.class);

        System.out.println("First Name: " + customerService.findAll().get(0).getFirstName());
    }
}
