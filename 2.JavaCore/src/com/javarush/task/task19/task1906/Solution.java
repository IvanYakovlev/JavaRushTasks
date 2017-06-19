package com.javarush.task.task19.task1906;

/* 
Четные байты
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws  IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileReader file1 = new FileReader(reader.readLine());
        FileWriter file2 = new FileWriter(reader.readLine());
        reader.close();
        int i=0;
    while (file1.ready()){
        i++;
        int data = file1.read();
        if (i%2==0){
            file2.write(file1.read());
        }
    }
    file1.close();
    file2.close();
    }
}
