package com.javarush.task.task19.task1910;

/* 
Пунктуация
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader file = new  BufferedReader(new FileReader(reader.readLine()));
        BufferedWriter file2= new BufferedWriter(new FileWriter(reader.readLine()));
        reader.close();
        StringBuffer sb = new StringBuffer();
        while (file.ready()){

        String s = file.readLine();
        String[] arr= (s).split("[\\s,.?:;!]+");
            for (String l:arr){
            file2.write(l);
            }
        }
        file.close();
        file2.close();
    }
}