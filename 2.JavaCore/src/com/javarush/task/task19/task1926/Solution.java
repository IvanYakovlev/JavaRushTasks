package com.javarush.task.task19.task1926;

/* 
Перевертыши
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader file = new BufferedReader(new FileReader(reader.readLine()));
        reader.close();
        while (file.ready()){
            String[] line =file.readLine().split("");
            for (int i=line.length-1;i>-1;i--){
                if (i==0){
                    System.out.println(line[i]);

                } else
                System.out.print(line[i]);
            }
        }
        file.close();
    }
}
