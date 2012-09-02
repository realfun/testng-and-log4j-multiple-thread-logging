package com.fayaa.tt;

import org.testng.annotations.*;
import org.apache.log4j.Logger;

public class LoggingTest {
    private Logger logger = Logger.getLogger(LoggingTest.class);

    @BeforeClass
    public void init() {
        System.out.println(System.getProperty("user.dir"));
    }

    @Test (invocationCount=100, threadPoolSize=10)
    public void testFoo() {
        logger.info("logging from thread " + Thread.currentThread().getId());
    }
}

