package com.Strategy;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
/**
 * Created by Rory on 2017-04-09.
 */
public class ContextTest {
    Context context;
    @Before
    public void setUp() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        context = (Context)ctx.getBean("context");
    }

    @Test
    public void testNotNull() throws Exception {
        assertNotNull(context);
    }

}