package com.visitor;

/**
 * Created by Rory on 2017-04-09.
 */
public class HdmiCable implements XboxParts {


    private double price;
public HdmiCable(double price)
{

    this.price=price;

}

public double getPrice()
{
    return price;
}

    public void accept(XboxPartsVisitor xboxPartsVisitor)
    {

        xboxPartsVisitor.visit(this);
    }
}
