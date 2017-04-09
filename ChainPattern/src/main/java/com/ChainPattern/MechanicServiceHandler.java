package com.ChainPattern;

/**
 * Created by Rory on 2017-04-03.
 */
public class MechanicServiceHandler extends ServiceHandler{
    @Override
    public String handleRequest(int request) {
        if(request >= 3) {
            return  "Mechanic";
        }
        else
            return successor.handleRequest(request);
    }

}
