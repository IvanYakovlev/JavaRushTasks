package com.javarush.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader = new BufferedReader(new FileReader(reader1.readLine()));
        reader1.close();
        while (reader.ready()){
            String read=reader.readLine();
            String[] a =read.split("[\\p{P}\\s\\t\\n\\r]");
            int count=0;
           for (String line : a) {
               for (String word : words) {
                   if (line.trim().equals(word)) ;
                   count+=1;
               }

           }
            if (count==2) System.out.println(read);
        }
        reader.close();
    }
}
