package com.javarush.task.task19.task1908;

/* 
Выделяем числа
*/

import java.io.*;



public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();
        String b = reader.readLine();
        reader.close();
        BufferedReader file = new BufferedReader(new FileReader(a));
        BufferedWriter file2 = new BufferedWriter(new FileWriter(b));

        while (file.ready()){
            String s=file.readLine();
            String[] arr= (s).split(" ");
        for (String n : arr) {
            try {
                double d = Double.parseDouble(n);
                file2.write(n);
                file2.write(" ");
            } catch (NumberFormatException nfe) {
                continue;
            }
        }

        }
        file.close();
        file2.close();
    }
}