package com.AbstractFactory;

/**
 * Created by Rory on 2017-04-02.
 */
public class TeleFactory {

    public static Television getTelevision(TelevisionAbstractFactory fact)
    {


        return fact.create();
    }
}
