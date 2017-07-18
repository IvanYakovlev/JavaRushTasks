package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.TreeSet;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        TreeSet<Integer> array=new TreeSet<Integer>();
        while (inputStream.available()>0){
            int data;
            data=inputStream.read();
            array.add(data);

        }
        reader.close();
        inputStream.close();
        for (int a:array){
            System.out.print(" "+a);
        }
    }
}
