package com.Bridge;

/**
 * Created by Rory on 2017-04-03.
 */
public class runBridgePattern {
    public static void main(String[]args)
    {
        Boat y=new Yacht(new yellowTail());
        y.fishCaught();

        Boat t=new Trawler(new Hake());
        t.fishCaught();


    }


}
