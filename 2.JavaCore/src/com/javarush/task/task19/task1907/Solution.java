package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileReader file = new FileReader(reader.readLine());
        reader.close();
        StringBuffer sb = new StringBuffer();
        while (file.ready()){
            char a =(char) file.read();
            String b = String.valueOf(a);
            sb.append(b);

        }
     String s = sb.toString();
        String[] arr= (s).split("[\\s,.?:;!]+");
        int count=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i].equals("world")) {
                count++;
            }
        }
        System.out.println(count);
    }
}

