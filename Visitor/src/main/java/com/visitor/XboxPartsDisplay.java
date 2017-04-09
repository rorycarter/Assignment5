package com.visitor;

/**
 * Created by Rory on 2017-04-09.
 */
public class XboxPartsDisplay implements XboxPartsVisitor {



    public void visit(Xbox xbox)
    {

        System.out.println("This is a xbox");

    }

    public void visit(Controller controller) {
        System.out.println("Showing controller");
    }


    public void visit(HdmiCable hdmiCable) {
        System.out.println("Here is the HDMI cable");
    }


    public void visit(PowerPlug powerPlug) {
        System.out.println("Careful, here's the powerplug");
    }


}
