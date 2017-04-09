package com.prototype;

import static org.junit.Assert.*;

/**
 * Created by Rory on 2017-04-03.
 */
public class AeroplaneTest {
    Copy c = new Aeroplane("Fighter");
    public void testType() throws Exception
    {
        assertEquals(c.toString(),"This would be a : Fighter");
    }

    Copy cOne = new FighterJet("Jet");

    public void testModel() throws Exception
    {
        assertEquals(cOne.toString(),"Jet");
    }

}