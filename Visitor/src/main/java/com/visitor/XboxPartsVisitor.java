package com.visitor;

/**
 * Created by Rory on 2017-04-09.
 */
public interface XboxPartsVisitor {

    public void visit(Xbox xbox);
    public void visit(PowerPlug powerPlug);
    public void visit(HdmiCable hdmiCable);
    public void visit(Controller controller);

}
