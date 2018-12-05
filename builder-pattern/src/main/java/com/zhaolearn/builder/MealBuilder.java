package com.zhaolearn.builder;

import com.zhaolearn.builder.burger.ChickenBurger;
import com.zhaolearn.builder.burger.VegBurger;
import com.zhaolearn.builder.colddrink.Coke;
import com.zhaolearn.builder.colddrink.Pepsi;

public class MealBuilder {
    public Meal prepareVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
