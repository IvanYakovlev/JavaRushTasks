package com.javarush.task.task15.task1530;

/**
 * Created by venom on 07.05.2017.
 */
public abstract class DrinkMaker {
    abstract void  getRightCup();
    abstract void putIngredient();
    abstract void pour();
    void makeDrink(){
        getRightCup();
        putIngredient();
        pour();
    }

}
