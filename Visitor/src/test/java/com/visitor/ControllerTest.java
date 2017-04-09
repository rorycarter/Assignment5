package com.visitor;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
/**
 * Created by Rory on 2017-04-09.
 */
public class ControllerTest {
    private Controller controller;

    @Before
    public void setUp() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        controller = (Controller)ctx.getBean("controller");
    }

    @Test
    public void getColourOfController() throws Exception {
        assertEquals("Green", controller.getColourOfController());
    }

    @Test
    public void getPrice() throws Exception {
        assertEquals(400,controller.getPrice(),0);
    }

    public void testNotNull() throws Exception{

        assertNotNull(controller);

    }
}