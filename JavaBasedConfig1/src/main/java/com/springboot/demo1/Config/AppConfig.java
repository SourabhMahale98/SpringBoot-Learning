package com.springboot.demo1.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.springboot.demo1.Alien;
import com.springboot.demo1.Computer;
import com.springboot.demo1.Desktop;
import com.springboot.demo1.Laptop;

@Configuration
@ComponentScan("com.springboot.demo1")
public class AppConfig {

    // @Bean()
    // public Desktop desktop() {
    // return new Desktop();
    // }

    // @Bean
    // @Primary
    // public Laptop laptop() {
    // return new Laptop();
    // }

    // @Bean
    // public Alien aliean(Computer com) {
    // Alien obj = new Alien();
    // obj.setAge(25);
    // obj.setCom(com);
    // return obj;
    // }

}
