package com.Bridge;

/**
 * Created by Rory on 2017-04-02.
 */
public abstract class Boat {

    protected Fish f;


    public Boat(Fish f)
    {
        this.f=f;

    }

    abstract public void fishCaught();
}
