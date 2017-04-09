package com.Strategy;

/**
 * Created by Rory on 2017-04-09.
 */
public class RunWeight {
    public static void main(String[] args) {


        Context context = new Context(new AddWeights());
        System.out.println("150 + 50 = " + context.executeStrategy(150, 50));

        context = new Context(new MinusWeights());
        System.out.println("200 - 100 = " + context.executeStrategy(200, 100));

        context = new Context(new DivideWeights());
        System.out.println("30 / 10 = " + context.executeStrategy(30, 10));
    }
}
