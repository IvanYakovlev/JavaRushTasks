package com.javarush.task.task15.task1530;

/* 
Template pattern
*/

public class Solution {
    public static void main(String[] args) {
        DrinkMaker tea=new TeaMaker();
        DrinkMaker coffe=new LatteMaker();
        tea.makeDrink();
        coffe.makeDrink();
    }
}
