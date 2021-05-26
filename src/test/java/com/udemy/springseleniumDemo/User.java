package com.udemy.springseleniumDemo;

import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class User {
    // Option - 3
    @Autowired
    private Salary salary;
    @Autowired
    private Address address;



    // Option 1- Accessing via construction
   /* public User(Salary salary, Address address) {
        this.salary = salary;
        this.address = address;
    }*/

    // Option - 2 Accssing via setter methods
/*
    @Autowired
    public void setSalary(Salary salary) {
        this.salary = salary;
    }
    @Autowired
    public void setAddress(Address address) {
        this.address = address;
    }*/

    public void printDetails() {

        System.out.println("Address : " + this.address.getStreet());
        System.out.println("Salary : " + this.salary.getAmount());


    }

}
