package com.test;

public class Person {

    public static Name personName;
    private static int personCounter;

    public Person(Name personName){
        Person.personName = personName;
    }

    public Person(){
        personCounter++;
    }

    public String helloWorld() {
        return "Hello World";
    }

    public String hello(String name) {
        return "Hello " + name;
    }

    public static int numberOfPersons() {
        return personCounter;
    }
}
