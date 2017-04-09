package com.visitor;

/**
 * Created by Rory on 2017-04-09.
 */
public class DisplayXbox {

    public static void main(String[]args)
    {

        XboxParts xbox=new Xbox();
        xbox.accept(new XboxPartsDisplay());


    }

}
