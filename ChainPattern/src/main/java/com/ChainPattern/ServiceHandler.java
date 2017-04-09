package com.ChainPattern;

/**
 * Created by Rory on 2017-04-03.
 */
public abstract class ServiceHandler {

    ServiceHandler successor;

    public void setSuccessor(ServiceHandler successor) {
        this.successor = successor;
    }

    public abstract String handleRequest(int request);

}
