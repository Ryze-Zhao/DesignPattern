package com.zhaolearn.builder;

import static org.junit.Assert.assertTrue;

import com.zhaolearn.builder.colddrink.Coke;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class TestBuilder {
    @Test
    public void demoBuilderPattern() {
        MealBuilder mealBuilder = new MealBuilder();

        System.out.println("使用Veg Meal套餐");
        Meal vegMeal = mealBuilder.prepareVegMeal();
        vegMeal.showItems();
        System.out.println("Total Cost: " +vegMeal.getCost());

        System.out.println("\n\n单点可乐");
        Meal singleMeal =new Meal();
        singleMeal.addItem(new Coke());
        singleMeal.showItems();
        System.out.println("Total Cost: " +singleMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("\n\n单点可乐+使用Non-Veg Meal套餐");
        nonVegMeal.addItem(new Coke());
        nonVegMeal.showItems();
        System.out.println("Total Cost: " +nonVegMeal.getCost());
    }
}
