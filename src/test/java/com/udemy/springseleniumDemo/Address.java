package com.udemy.springseleniumDemo;

import org.springframework.stereotype.Component;

@Component
public class Address {
    private String street;

    public Address() {
        this.street = "27 Coxwell Boulevard";
    }

    public String getStreet() {
        return street;
    }
}


