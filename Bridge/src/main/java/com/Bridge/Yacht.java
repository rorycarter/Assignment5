package com.Bridge;

/**
 * Created by Rory on 2017-04-03.
 */
public class Yacht extends Boat {



    public Yacht(Fish f)
    {

        super(f);
    }
    @Override
    public void fishCaught()
    {

        System.out.println("Yacht is now filled");
        f.fishCaught();


    }

}
