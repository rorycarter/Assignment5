package com.adapter;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
/**
 * Created by Rory on 2017-04-09.
 */
public class MeasureObjectTest {
    MeasureObject mo=new MeasureObject();
    @Before
    public void setUp() throws Exception
    {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        mo = (MeasureObject)ctx.getBean("measureObj");



    }

    @Test
    public void getLengthInCm() throws Exception {
        mo.setLengthInCm(100);
        assertEquals(100, mo.getLengthInCm(),0);
    }

    @Test
    public void getLengthInM() throws Exception {
        mo.setLengthInM(10);
        assertEquals(1000,mo.getLengthInM(),0);
    }

    @Test
    public void setLengthInM() throws Exception {

        mo.setLengthInM(100);
        assertEquals(10000, mo.getLengthInM(),0);
    }

    @Test
    public void setLengthInCm() throws Exception {
        mo.setLengthInM(1);
        assertEquals(1, mo.getLengthInCm(),0);
    }

    @Test
    public void calcM() throws Exception {
        assertEquals(30000, mo.calcM(300),0);
    }

    @Test
    public void calcCm() throws Exception {
        assertEquals(0.0,mo.calcCm(3),0);
    }

}