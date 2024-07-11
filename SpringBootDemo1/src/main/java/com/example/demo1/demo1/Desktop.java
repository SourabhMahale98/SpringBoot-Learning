package com.example.demo1.demo1;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Desktop implements Computer {

    @Override
    public void compile() {
        System.out.println("Compiling in Desktop");
    }

}
