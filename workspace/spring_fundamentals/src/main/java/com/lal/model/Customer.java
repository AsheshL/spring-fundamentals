package com.lal.model;

/**
 * Created by Ashesh on 17-May-17.
 */
public class Customer {

    private String firstName;
    private String lastName;

    public Customer() {
        //Empty constructor for Spring
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
