package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a= reader.readLine();
        String b = reader.readLine();
        reader.close();
        FileInputStream file1 = new FileInputStream(a);
        FileOutputStream file2 = new FileOutputStream(b);

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
