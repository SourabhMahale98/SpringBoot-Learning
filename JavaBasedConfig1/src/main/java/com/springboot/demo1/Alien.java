package com.springboot.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Alien {
    @Value("34")
    private int age;
    @Autowired
    private Computer com;

    public void Alien() {
        System.out.println("Alien object created.....");
    }

    public void code() {
        System.out.println("Coding");
        com.compile();
    }

    public int getAge() {
        return age;
    }

    public Computer getCom() {
        return com;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

}
