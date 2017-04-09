package com.adapter;

/**
 * Created by Rory on 2017-04-03.
 */
public class MeasureObject implements RulerInterface {

    RulerReporter ruler;



    public MeasureObject()
    {
        ruler=new RulerReporter();

    }


    public int getLengthInCm()
    {
        return ruler.getLength();



    }
    public int getLengthInM()
    {
        return calcM(ruler.getLength());



    }

    public void setLengthInM(int metre)
    {
        ruler.setLength(metre);



    }
    public void setLengthInCm(int centimetre)
    {
        ruler.setLength(centimetre);


    }

    protected int calcM(int c)
    {
        return (c * 100);


    }
    protected int calcCm(int d)
    {
        return (d / 100);

    }

}
