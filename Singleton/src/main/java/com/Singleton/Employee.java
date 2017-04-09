package com.Singleton;

/**
 * Created by Rory on 2017-04-02.
 */
public class Employee {

    private static Employee emp=new Employee();

    private Employee(){}

    public static Employee getInstance()
    {


        return emp;


    }

    public void theMessage()
    {


        System.out.println( "Employee present");
    }





}
