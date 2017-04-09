package com.AbstractFactory;

/**
 * Created by Rory on 2017-04-02.
 */
public class Oled extends Television {

    private String model;
    private boolean HD;
    private int year;


    public Oled(String model,boolean HD,int year)
    {
        this.model=model;
        this.HD=HD;
        this.year=year;


    }

    public String getModel()
    {
        return this.model;

    }
    public boolean getHD()
    {
        return this.HD;



    }
    public int getYear()
    {

        return this.year;
    }


}
