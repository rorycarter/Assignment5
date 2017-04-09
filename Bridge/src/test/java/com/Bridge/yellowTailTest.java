package com.Bridge;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
/**
 * Created by Rory on 2017-04-09.
 */
public class yellowTailTest {
    private yellowTail yt;


    @org.junit.Before
    public void setUp() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        yt = (yellowTail) ctx.getBean("yellowTail");
    }

    @org.junit.Test
    public void fishCaught() throws Exception {
        assertNotNull(yt);

    }
}