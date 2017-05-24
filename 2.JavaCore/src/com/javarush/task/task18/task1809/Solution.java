package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream file1 = new FileInputStream(reader.readLine());
        FileOutputStream file2 = new FileOutputStream(reader.readLine());
        reader.close();
        ArrayList<Integer> array = new ArrayList<Integer>();
        while (file1.available()>0){
            int read = file1.read();
            array.add(read);
        }
        System.out.println(array.size());
        for (int i=array.size()-1;i>-1;i--){
            file2.write(array.get(i));
        }
        file1.close();
        file2.close();
    }
}
