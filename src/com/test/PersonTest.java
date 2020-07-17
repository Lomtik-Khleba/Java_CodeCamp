package com.test;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {

    @Test
    public void shouldReturnHelloWorld(){
        Person Ilya = new Person();
        assertEquals("Hello World", Ilya.helloWorld());
    }

    @Test
    public void shouldReturnIlya(){
        Person person = new Person();
        assertEquals("Hello Ilya", person.hello("Ilya"));
    }

}
