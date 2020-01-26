package com.zhaolearn.old;

import com.zhaolearn.old.colddrink.Coke;
/**
 * 1    接口与类的关系如图，
 * 1.1    Packing（打包方式）下有Wrapper（纸装）与Bottle（瓶装）两种打包方式；
 * 1.2    Burger（汉堡包）下有VegBurger（素汉堡）与ChickenBurger（鸡肉汉堡）；
 * 1.3    ColdDrink（冷饮）下有Pepsi（百事）与Coke（可乐）；
 * 1.4    Burger与ColdDrink都implements到Item接口；
 * 1.5    MealBuilder是一些已经设置好的套餐；
 * 1.6    Meal是用来作为你点餐记录点了什么，并计算总价；（你可以通过这个单点，也可以通过MealBuilder点套餐，也可以单点+套餐）。
 *
 * @author: HeHaoZhao
 * @date: 2020/1/26 9:17
 */
public class DemoMain {
    public static void main(String[] args) {
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
