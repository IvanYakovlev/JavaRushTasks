package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileOutputStream file1 = new FileOutputStream(reader.readLine());
        FileInputStream file2 = new FileInputStream(reader.readLine());
        FileInputStream file3 = new FileInputStream(reader.readLine());
        ArrayList<Integer> array = new ArrayList<>();
         reader.close();
        while (file2.available()>0){
            int a = file2.read();
            array.add(a);
        }
        while (file3.available()>0){
            int a = file3.read();
            array.add(a);
        }
        for (int i=0;i<array.size();i++){
            file1.write(array.get(i));
        }
        file1.close();
        file2.close();
        file3.close();

    }
}
