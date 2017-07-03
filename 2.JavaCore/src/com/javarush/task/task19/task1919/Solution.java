package com.javarush.task.task19.task1919;

/* 
Считаем зарплаты
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader fileReader =new BufferedReader(new FileReader(args[0]));
        Map<String, Double> map = new TreeMap<>();
        while (fileReader.ready()){
            String[] a=fileReader.readLine().split(" ");
            if (map.containsKey(a[0])){
                map.put(a[0], Double.valueOf(map.get(a[0]))+Double.valueOf(a[1]));}
                else {
                map.put(a[0], Double.valueOf(a[1]));
            }
            }
            System.out.println(map);
        fileReader.close();
        }

    }

