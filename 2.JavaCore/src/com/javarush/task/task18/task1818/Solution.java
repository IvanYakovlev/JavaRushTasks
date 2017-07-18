package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a1 =reader.readLine();
        String a2 =reader.readLine();
        String a3 =reader.readLine();
        reader.close();
        FileOutputStream file1 = new FileOutputStream(a1);
        FileInputStream file2 = new FileInputStream(a2);
        FileInputStream file3 = new FileInputStream(a3);
        ArrayList<Integer> array = new ArrayList<>();

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
