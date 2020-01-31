package com.zhaolearn.facade.old;

public class FruitMaker {
    private Fruit apple;
    private Fruit orange;
    private Fruit watermalon;

    public FruitMaker() {
        apple = new Apple();
        orange = new Orange();
        watermalon = new Watermalon();
    }

    public void tellMeNameApple(){
        apple.tellMeName();
    }
    public void tellMeNameOrange(){
        orange.tellMeName();
    }
    public void tellMeNameWatermalon(){
        watermalon.tellMeName();
    }
}
