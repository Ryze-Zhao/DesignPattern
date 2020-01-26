package com.zhaolearn.old;

import com.zhaolearn.old.burger.ChickenBurger;
import com.zhaolearn.old.burger.VegBurger;
import com.zhaolearn.old.colddrink.Coke;
import com.zhaolearn.old.colddrink.Pepsi;

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
