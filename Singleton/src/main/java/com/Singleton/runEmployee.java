package com.Singleton;

/**
 * Created by Rory on 2017-04-02.
 */
public class runEmployee {
    public static void main(String[]args)

    {


        Employee emp=Employee.getInstance();

        emp.theMessage();
    }
}
