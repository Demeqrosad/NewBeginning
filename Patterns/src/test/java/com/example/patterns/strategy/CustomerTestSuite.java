package com.example.patterns.strategy;

import com.example.patterns.strategy.predictors.ConservativePredictor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.example.patterns.strategy.predictors.AggressivePredictor;

public class CustomerTestSuite {
    @Test
    public void testDefaultInvestingStrategies() {
        //Given
        Customer steven = new IndividualCustomer("Steven Links");
        Customer john = new IndividualYoungCustomer("John Hemerald");
        Customer kodilla = new CorporateCustomer("Kodilla");

        //When
        String stevenShouldBuy = steven.predict();
        System.out.println("Steven should: " + stevenShouldBuy);
        String johnShouldBuy = john.predict();
        System.out.println("John should: " + johnShouldBuy);
        String kodillaShouldBuy = kodilla.predict();
        System.out.println("Kodilla should: " + kodillaShouldBuy);

        //Then
        Assertions.assertEquals("[Conservative predictor] Buy debentures of XYZ", stevenShouldBuy);
        Assertions.assertEquals("[Aggressive predictor] Buy stock of XYZ", johnShouldBuy);
        Assertions.assertEquals("[Balanced predictor] Buy shared units of Fund XYZ", kodillaShouldBuy);
    }

    @Test
    public void testIndividualInvestingStrategy() {
        //Given
        Customer steven = new IndividualCustomer("Steven Links");

        //When
        String stevenShouldBuy = steven.predict();
        System.out.println("Steven should: " + stevenShouldBuy);
        steven.setBuyingStrategy(new AggressivePredictor());
        stevenShouldBuy = steven.predict();
        System.out.println("Steven now should: " + stevenShouldBuy);

        //Then
        Assertions.assertEquals("[Aggressive predictor] Buy stock of XYZ", stevenShouldBuy);
    }

    @Test
    public void testCustomerStrategy() {
        //Given
        Customer somebody = new Customer("Some Customer");

        //When
        String somebodyShouldBuy = somebody.predict();
        System.out.println("Some Customer should: " + somebodyShouldBuy);
        somebody.setBuyingStrategy(new AggressivePredictor());
        somebodyShouldBuy = somebody.predict();
        System.out.println("Some Customer now should: " + somebodyShouldBuy);

        //Then
        Assertions.assertEquals("[Aggressive predictor] Buy stock of XYZ", somebodyShouldBuy);
    }
}

