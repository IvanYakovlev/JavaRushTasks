package com.javarush.task.task15.task1522;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Закрепляем Singleton pattern
*/

public class Solution {
    public static void main(String[] args) throws IOException {
            readKeyFromConsoleAndInitPlanet();
    }

    public static Planet thePlanet;

    //add static block here - добавьте статический блок тут

    public static void readKeyFromConsoleAndInitPlanet() throws IOException {
       BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
       String a = reader.readLine();
        reader.close();
        if (Planet.EARTH.equals(a)) {
           thePlanet= Earth.getInstance();
        } else if (Planet.SUN.equals(a)) {
           thePlanet = Sun.getInstance();
        } else if (Planet.MOON.equals(a)) {
           thePlanet= Moon.getInstance();
        } else  thePlanet=null;

        // implement step #5 here - реализуйте задание №5 тут
    }
}
