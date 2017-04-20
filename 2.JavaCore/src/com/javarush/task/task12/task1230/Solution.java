package com.javarush.task.task12.task1230;

/* 
Попадание в десятку
*/

public class Solution {
    public static void main(String[] args) {
        Integer i = 5;
        Integer a=i;
        int x = transformValue(i);

        System.out.println(x);
    }


    public static int transformValue(Integer a) {
        return a*2;
    }
    public static int transformValue(int i) {
        return i * i;
    }
}
