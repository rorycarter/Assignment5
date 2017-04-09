package com.ChainPattern;

import static org.junit.Assert.*;

/**
 * Created by Rory on 2017-04-03.
 */
public class ServiceHandlerTest {
    ServiceHandler sh=new MechanicServiceHandler();
    ServiceHandler sh1=new TruckServiceHandler();
    ServiceHandler sh2=new VehicleServiceHandler();



    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.Test
    public void handleRequest() throws Exception {
        assertEquals(sh.handleRequest(3),"Mechanic");
        assertEquals(sh1.handleRequest(2),"Heavy Motor Driver");
        assertEquals(sh2.handleRequest(1),"Light Motor Driver");
    }

}