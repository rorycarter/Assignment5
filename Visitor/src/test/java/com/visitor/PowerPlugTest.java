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
public class PowerPlugTest {
    PowerPlug powerPlug;

    @Before
    public void setUp() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        powerPlug = (PowerPlug) ctx.getBean("powerPlug");
    }

    @Test
    public void getWeight() throws Exception {
        assertEquals(1,powerPlug.getWeight(),0);
    }

    @Test
    public void getVoltage() throws Exception {
        assertEquals(420,powerPlug.getVoltage(),0);
    }

    public void testNotNull()
    {
        assertNotNull(powerPlug);

    }

}