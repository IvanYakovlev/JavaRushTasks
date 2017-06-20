package com.javarush.task.task19.task1909;

/* 
Замена знаков
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();
        String b = reader.readLine();
        reader.close();
        BufferedReader file = new BufferedReader(new FileReader(a));
        BufferedWriter file2 = new BufferedWriter(new FileWriter(b));

        while (file.ready()){
            String s=file.readLine();
            String[] n=s.split("");
            for (String d:n){
                if (d.equals(".")){
                    file2.write("!");} else {
                    file2.write(d);
                }
            }
        }
        file.close();
        file2.close();
    }
}