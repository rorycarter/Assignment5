package com.Strategy;

import org.junit.Before;
import org.junit.*;

import static org.junit.Assert.*;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
/**
 * Created by Rory on 2017-04-09.
 */
public class AddWeightsTest {
    AddWeights aw;
    @Before
    public void setUp() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        aw = (AddWeights) ctx.getBean("add");
    }

    @Test
    public void calculateWeights() throws Exception {
        Strategy weight=new AddWeights();
        int w=weight.calculateWeights(10,10);
        Assert.assertEquals(20,w);
    }

}