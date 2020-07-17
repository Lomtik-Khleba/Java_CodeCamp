package com.test;

public class Person {

    public static Name personName;

    public Person(Name personName){
        Person.personName = personName;
    }

    public Person(){}

    public String helloWorld() {
        return "Hello World";
    }

    public String hello(String name) {
        return "Hello " + name;
    }
}
