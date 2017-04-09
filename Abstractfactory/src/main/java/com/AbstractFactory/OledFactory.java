package com.AbstractFactory;

import com.AbstractFactory.Oled;

/**
 * Created by Rory on 2017-04-02.
 */
public class OledFactory implements TelevisionAbstractFactory {

    private String model;
    private boolean HD;
    private int year;


    public OledFactory(String model,boolean HD,int year)
    {
        this.model=model;
        this.HD=HD;
        this.year=year;


    }

    public Television create()
    {


        return new Oled(model,HD,year);

    }


}
