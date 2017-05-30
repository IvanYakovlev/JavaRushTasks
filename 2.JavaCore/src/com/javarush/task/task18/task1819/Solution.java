package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1name = reader.readLine();
        String file2name = reader.readLine();
        reader.close();
        FileInputStream file1r = new FileInputStream(file1name);
        FileInputStream file2 = new FileInputStream(file2name);
        ArrayList<Integer> array = new ArrayList<>();
        reader.close();
        while (file2.available()>0){
            int a = file2.read();
            array.add(a);
        }

        while (file1r.available()>0){
            int a = file1r.read();
            array.add(a);
        }

        file1r.close();
        FileOutputStream file1w = new FileOutputStream(file1name);
        for (int i=0;i<array.size();i++){
            file1w.write(array.get(i));
        }

        file1w.close();
        file2.close();
    }
}
