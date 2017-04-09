package com.AbstractFactory;

import com.AbstractFactory.Plasma;

/**
 * Created by Rory on 2017-04-02.
 */
public class PlasmaFactory implements TelevisionAbstractFactory {


    private String model;
    private boolean HD;
    private int year;


    public PlasmaFactory(String model,boolean HD,int year)
    {
        this.model=model;
        this.HD=HD;
        this.year=year;


    }

    public Television create()
    {


        return new Plasma(model,HD,year);

    }

}
