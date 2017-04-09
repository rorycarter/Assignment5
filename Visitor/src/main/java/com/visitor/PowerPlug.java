package com.visitor;

/**
 * Created by Rory on 2017-04-09.
 */
public class PowerPlug implements XboxParts {


    private double weight;
    private int voltage;
    public PowerPlug(double weight,int voltage)
    {
        this.weight=weight;
        this.voltage=voltage;

    }

    public double getWeight()
    {
        return weight;

    }

    public int getVoltage()
    {
        return voltage;

    }

    public void accept(XboxPartsVisitor xboxPartsVisitor)
    {
        xboxPartsVisitor.visit(this);

    }
}
