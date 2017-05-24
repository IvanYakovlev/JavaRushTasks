package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        HashMap<Integer, Integer> map = new HashMap<>();
        while (inputStream.available()>0){
            int data;
            data=inputStream.read();
            if (map.containsKey(data)){
                map.put(data, map.get(data)+1);
            } else {
                map.put(data, 1);
            }

        }

        int max = 127;
        for(HashMap.Entry entry: map.entrySet()) {
            if ((int) entry.getValue() < max) max = (int) entry.getValue();
        }

        for (HashMap.Entry entry: map.entrySet()) {
            if(entry.getValue().equals(max)) System.out.print(entry.getKey() + " ");
        }
        reader.close();
        inputStream.close();

    }
}
