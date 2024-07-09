package com.springboot.demo1;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Laptop implements Computer {
    public Laptop() {
        System.out.println("Laptop obj created");
    }

    @Override
    public void compile() {
        System.out.println("Compiling using Laptop");
    }

}
