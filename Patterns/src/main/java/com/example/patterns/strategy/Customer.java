package com.example.patterns.strategy;

import com.example.patterns.strategy.predictors.ConservativePredictor;

public class Customer {
    final private String name;
    protected BuyPredictor buyPredictor = new ConservativePredictor();

    public Customer(final String name) {
        this.name = name;
        //this.buyPredictor = buyPredictor;
    }

    public String getName() {
        return name;
    }

    public String predict() {
        return buyPredictor.predictWhatToBuy();
    }

    public void setBuyingStrategy(BuyPredictor buyPredictor) {
        this.buyPredictor = buyPredictor;
    }
}


