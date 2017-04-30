package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

       int a = Ex(reader.readLine());
        if (a <= 0) throw new NumberFormatException();
       int  b = Ex(reader.readLine());
        if (b <= 0) throw new NumberFormatException();

        while (a != 0 && b != 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }

        System.out.println(a + b);


    }
    public static int Ex(String a){
        int b=0;
        try {
            b = Integer.parseInt(a);
        } catch (Exception e){System.out.println(e);}
        return b;
    }
}