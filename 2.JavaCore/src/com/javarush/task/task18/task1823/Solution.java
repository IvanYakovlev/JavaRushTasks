package com.javarush.task.task18.task1823;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) {

    }

    public static class ReadThread extends Thread {
        FileInputStream fileInputStream;
        public ReadThread(String fileName) throws FileNotFoundException {
          fileInputStream  = new FileInputStream(fileName); //implement constructor body
        }

        @Override
        public void run() {

            Map<Character, Integer> map=new TreeMap<>();
            try {
                while (fileInputStream.available()>0){
                    char read = (char) fileInputStream.read();
                    if (map.containsKey(read)){
                        map.put(read, map.get(read)+1);}else {map.put(read, 1);}
                    for (Map.Entry<Character,Integer> entry: map.entrySet())
                        System.out.println(entry.getKey()+" "+entry.getValue());
                    fileInputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        // implement file reading here - реализуйте чтение из файла тут
    }
}
