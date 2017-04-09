package com.prototype;

/**
 * Created by Rory on 2017-04-03.
 */
public class Aeroplane implements Copy
{
    private String model;

    public Aeroplane(String model)
    {
        this.model=model;

    }


    public Copy createCopy()
    {
        return new Aeroplane(model);

    }


    public String toString()
    {


        return "Houston this is " +model;

    }
}
