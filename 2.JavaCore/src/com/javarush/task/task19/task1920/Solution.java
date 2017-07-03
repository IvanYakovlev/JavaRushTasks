package com.javarush.task.task19.task1920;

/* 
Самый богатый
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
        Map<Double, String> map1 = new TreeMap<>();
        double count=0;
        String name="";
        while (fileReader.ready()){
            String[] a=fileReader.readLine().split(" ");
            if (map.containsKey(a[0])){
                map.put(a[0], Double.valueOf(map.get(a[0]))+Double.valueOf(a[1]));}
            else {
                map.put(a[0], Double.valueOf(a[1]));
            }
            if (map.get(a[0])>count){
                count=map.get(a[0]);
                name= String.valueOf(map.get(a[1]));
            }
        }
        for (Map.Entry<String, Double> pair : map.entrySet())
            if (pair.getValue().equals(count))
                System.out.println(pair.getKey());
        fileReader.close();
    }

}

