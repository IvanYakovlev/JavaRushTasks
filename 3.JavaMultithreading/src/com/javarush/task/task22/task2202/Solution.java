package com.javarush.task.task22.task2202;

/*
Найти подстроку
*/
public class Solution {
    public static void main(String[] args) {
        System.out.println(getPartOfString("JavaRush - лучший сервис обучения Java."));
    }

    public static String getPartOfString(String string) {
        if (string == null || string.isEmpty())
            throw new TooShortStringException();
        String[] c=string.split(" ");
        if (c.length<5){
            throw new TooShortStringException();
        }
        return c[1] + " " + c[2] + " " + c[3] + " " + c[4];

    }

    public static class TooShortStringException extends RuntimeException {

    }
}
