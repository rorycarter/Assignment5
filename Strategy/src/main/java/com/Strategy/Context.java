package com.Strategy;

/**
 * Created by Rory on 2017-04-09.
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(int w1, int w2){
        return strategy.calculateWeights(w1, w2);
    }
}
