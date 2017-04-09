package com.visitor;

/**
 * Created by Rory on 2017-04-09.
 */
public class Xbox implements XboxParts {
    XboxParts[] parts;

    public Xbox(){
        parts = new XboxParts[] {new Controller("Green",400), new HdmiCable(700), new PowerPlug(1,420)};
    }



    public void accept(XboxPartsVisitor xboxPartsVisitor) {
        for (int i = 0; i < parts.length; i++) {
            parts[i].accept(xboxPartsVisitor);
        }
        xboxPartsVisitor.visit(this);
    }

}
