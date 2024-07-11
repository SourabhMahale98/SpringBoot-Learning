
package com.example.demo1.demo1;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {

    @Override
    public void compile() {
        System.out.println("Compiling in Laptop");
    }
}
