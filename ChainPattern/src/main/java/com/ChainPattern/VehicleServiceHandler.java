package com.ChainPattern;

/**
 * Created by Rory on 2017-04-03.
 */
public class VehicleServiceHandler extends ServiceHandler {
    @Override
    public String handleRequest(int request) {
        if(request == 1) {
            return  "Light Motor Driver";

        }
        else
            return successor.handleRequest(request);
    }
}
