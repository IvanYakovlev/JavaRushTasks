package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> a=new ArrayList<Integer>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        reader.close();
        while (inputStream.available()>0){
            int data=inputStream.read();
            a.add(data);
        }
        inputStream.close();
        int max=-128;
        for (int i=0;i<a.size();i++){
            if (a.get(i)>max)
                max=a.get(i);
        }
        System.out.print(max);
    }
}
