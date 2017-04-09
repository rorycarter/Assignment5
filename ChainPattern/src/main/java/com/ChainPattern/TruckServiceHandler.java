package com.ChainPattern;

/**
 * Created by Rory on 2017-04-03.
 */
public class TruckServiceHandler extends ServiceHandler {

    @Override
    public String handleRequest(int request) {
        if(request == 2) {
            return "Heavy Motor Driver";
        }
        else
            return successor.handleRequest(request);
    }
}
