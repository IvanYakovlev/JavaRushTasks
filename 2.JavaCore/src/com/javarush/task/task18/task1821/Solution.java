package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException{
        FileInputStream fileInputStream = new FileInputStream(args[0]);
        Map<Character, Integer> map=new TreeMap<>();
        while (fileInputStream.available()>0){
            char read = (char) fileInputStream.read();
            if (map.containsKey(read)){
            map.put(read, map.get(read)+1);}else {map.put(read, 1);}
        }
        for (Map.Entry<Character,Integer> entry: map.entrySet())
        System.out.println(entry.getKey()+" "+entry.getValue());
        fileInputStream.close();
    }

}
