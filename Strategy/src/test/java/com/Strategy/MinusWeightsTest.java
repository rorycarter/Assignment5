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
public class MinusWeightsTest {
    MinusWeights mw;
    @Before
    public void setUp() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        mw = (MinusWeights) ctx.getBean("minus");
    }

    @Test
    public void calculateWeights() throws Exception {
        Strategy weight=new MinusWeights();
        int w=weight.calculateWeights(100,10);
        Assert.assertEquals(90,w);

    }

}