package com.example.patterns.builder.pizza;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PizzaTestSuite {
    @Test
    public void testPizzaNew() {
        //Given
        Pizza pizza = new Pizza.PizzaBuilder()
                .ingredient("Onion")
                .bottom("Thin")
                .sauce("Spicy")
                .ingredient("Ham")
                .ingredient("Mushrooms")
                .build();
        System.out.println(pizza);
        //When
        int howManyIngredients = pizza.getIngredients().size();
        //Then
        Assertions.assertEquals(3, howManyIngredients);
    }
}


