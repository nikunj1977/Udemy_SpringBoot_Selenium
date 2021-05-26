package com.udemy.springseleniumDemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Televsion {

    @Value("${tv.name:Sony}")
    private String name;

    public Televsion() {
        System.out.println("Inside the constructor :" + this.name);
    }

    @PostConstruct
    private void init(){
        System.out.println("inside the init: " + this.name);
        System.out.println("TV is turned on : ");
    }

    public void playMovie() throws InterruptedException {
        for (int i = 1; i < 6; i++) {
            System.out.println("Playing scene no :" + i);
            Thread.sleep(1000);
        }
    }

    @PreDestroy
    public void turnOff(){
        System.out.println("TV turned off ...");
    }



}
