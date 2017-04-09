package com.Singleton;

import org.junit.Before;

import static org.junit.Assert.*;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
/**
 * Created by Rory on 2017-04-09.
 */
public class EmployeeTest {
    Employee emp;
    @Before
    public void setUp() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        emp = (Employee)ctx.getBean("run");
    }

    public void testNotNull() throws Exception{
        assertNotNull(emp);

    }


}