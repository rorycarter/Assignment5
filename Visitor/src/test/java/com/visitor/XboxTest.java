package com.visitor;

import org.junit.*;

import static org.junit.Assert.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Rory on 2017-04-09.
 */
public class XboxTest {
    private Xbox xbox;
    @Before
    public void setUp() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        xbox = (Xbox)ctx.getBean("xbox");
    }

    @Test
    public void testNotNull() throws Exception {
        assertNotNull(xbox);
    }
}