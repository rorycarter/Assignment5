package com.Proxy;

/**
 * Created by Rory on 2017-04-02.
 */
public class AccessCheck implements CampusInternetAccess
{

    private String studentName;
    private InternetAccess ia;

    public AccessCheck(String studentName)
    {

        this.studentName=studentName;

    }
    public int getAuthorisation(String studentName) {

        return 6;
    }


    public void grantAccess()
    {

        if(getAuthorisation(studentName)>5)
        {
            ia=new InternetAccess(studentName);
            ia.grantAccess();
        }
        else
        {
            System.out.println("No internet access for you peasant, you are not me");
        }


    }


}
