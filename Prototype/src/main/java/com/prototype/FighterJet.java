package com.prototype;

/**
 * Created by Rory on 2017-04-03.
 */
public class FighterJet implements Copy {
    private String model;
    public FighterJet(String model)
    {
        this.model = model;
    }

    public Copy createCopy()
    {
        return new FighterJet(model);
    }

    @Override
    public String toString()
    {
        return "This model is a " + model;
    }


}
