package com.test;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CarServiceTest {
    @Test
    public void shouldDemonstrateLogging(){
        CarService carService = new CarService();
        carService.process("BMW");
    }
}
