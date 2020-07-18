package com.test;

import org.apache.commons.logging.Log;
import org.junit.Test;

import java.util.function.Predicate;

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

    @Test
    public void shouldReturnNumberOfPersons(){
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();

        assertEquals(3, Person.numberOfPersons());
    }

    @Test
    public void demonstrateArrays(){
        for(LoggingLevel state: LoggingLevel.values()){
            if(state == LoggingLevel.PENDING){

            }
            if(state == LoggingLevel.PROCESSED){

            }
            if(state == LoggingLevel.PROCESSING){

            }
        }
    }


}
