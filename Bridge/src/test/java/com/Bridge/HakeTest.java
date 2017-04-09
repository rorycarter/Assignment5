package com.Bridge;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
/**
 * Created by Rory on 2017-04-03.
 */
public class HakeTest {
    private Hake hake;


    @org.junit.Before
    public void setUp() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        hake = (Hake)ctx.getBean("hake");
    }

    @org.junit.Test
    public void fishCaught() throws Exception {
     assertNotNull(hake);

    }

}