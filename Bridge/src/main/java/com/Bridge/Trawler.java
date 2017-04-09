package com.Bridge;

/**
 * Created by Rory on 2017-04-03.
 */
public class Trawler extends Boat {


    public Trawler(Fish f)
    {
        super(f);

    }

    @Override
    public void fishCaught()
    {


        System.out.println("Trawler is now filled");
        f.fishCaught();

    }

}
