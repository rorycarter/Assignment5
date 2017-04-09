package com.visitor;

/**
 * Created by Rory on 2017-04-09.
 */
public class Controller implements XboxParts {

    private String colourOfController;
    private double price;

    public Controller(String colourOfController,double price)
    {
        this.colourOfController=colourOfController;
        this.price=price;

    }

    public Controller() {

    }

    public String getColourOfController()
    {
        return colourOfController;
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
