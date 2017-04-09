package com.ChainPattern;

/**
 * Created by Rory on 2017-04-03.
 */
public class runHandler {
    public static ServiceHandler getChain(){
        ServiceHandler vehicle = new VehicleServiceHandler();
        ServiceHandler truck = new TruckServiceHandler();
        ServiceHandler mechanic = new MechanicServiceHandler();

        vehicle.setSuccessor(truck);
        truck.setSuccessor(mechanic);

        return vehicle;
    }
}
