package com.example.patterns.strategy.predictors;

import com.example.patterns.strategy.BuyPredictor;

public class BalancedPredictor implements BuyPredictor {
    @Override
    public String predictWhatToBuy() {
        return "[Balanced predictor] Buy shared units of Fund XYZ";
    }
}

