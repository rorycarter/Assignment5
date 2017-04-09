package com.Proxy;

/**
 * Created by Rory on 2017-04-02.
 */
public class Connection {
    public static void main(String[]args)
    {

        CampusInternetAccess cia=new AccessCheck("ll");
        cia.grantAccess();



    }
}
