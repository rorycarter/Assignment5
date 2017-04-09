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
public class HdmiCableTest {
    private HdmiCable hdmiCable;
    @Before
    public void setUp() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        hdmiCable = (HdmiCable) ctx.getBean("hdmiCable");    }

    @Test
    public void getPrice() throws Exception {
        assertEquals(700,hdmiCable.getPrice(),0);
    }

    @Test
    public void testNotNull() throws Exception
    {
        assertNotNull(hdmiCable);
    }

}