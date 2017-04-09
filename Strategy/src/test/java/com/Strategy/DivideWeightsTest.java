package com.Strategy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
/**
 * Created by Rory on 2017-04-09.
 */
public class DivideWeightsTest {
    DivideWeights dw;
    @Before
    public void setUp() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        dw = (DivideWeights) ctx.getBean("divide");
    }

    @Test
    public void calculateWeights() throws Exception {

        Strategy weight=new DivideWeights();
        int w=weight.calculateWeights(100,10);
        Assert.assertEquals(10,w);

    }

}