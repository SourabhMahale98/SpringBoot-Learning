package com.springboot.demo1;

public class Aliean {
    private int age;
    private Computer com;

    public void Aliean() {
        System.out.println("Alian object created.....");
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
