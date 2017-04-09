package com.AbstractFactory;

/**
 * Created by Rory on 2017-04-02.
 */
public class runAll {

    public static void main(String[]args)
    {

        testTelevisionFactory();


    }
    private static void testTelevisionFactory()
    {

        Television plasma = com.AbstractFactory.TeleFactory.getTelevision(new PlasmaFactory("LG",true,2012));
        Television oled = com.AbstractFactory.TeleFactory.getTelevision(new OledFactory("Samsung",true,2016));

        System.out.println("Plasma Factory Produced: "+plasma);
        System.out.println("Oled factory produced: "+oled);
    }
}
