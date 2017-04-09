package com.AbstractFactory;

/**
 * Created by Rory on 2017-04-02.
 */
public abstract class Television {

    public abstract String getModel();
    public abstract boolean getHD();
    public abstract int getYear();

    @Override
    public String toString()
    {

        return "Model: "+this.getModel() + "HD equipped: " +this.getHD()+ "The year: "+this.getYear();

    }


}
