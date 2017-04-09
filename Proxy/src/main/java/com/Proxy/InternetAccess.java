package com.Proxy;

/**
 * Created by Rory on 2017-04-02.
 */
public class InternetAccess implements CampusInternetAccess {
    private String studentName;

    public InternetAccess(String studentName)
    {
        this.studentName=studentName;
    }

    public void grantAccess()
    {

        System.out.println("Internet access granted to: "+studentName);

    }
}
