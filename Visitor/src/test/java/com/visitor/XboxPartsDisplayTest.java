package com.visitor;

import org.junit.Before;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Rory on 2017-04-09.
 */
public class XboxPartsDisplayTest {
    private XboxPartsDisplay xboxPartsDisplay;
    @Before
    public void setUp() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        xboxPartsDisplay = (XboxPartsDisplay) ctx.getBean("xboxDisplay");

    }
    @Test
    public void testNotNull() throws Exception{
        assertNotNull(xboxPartsDisplay);
    }

}