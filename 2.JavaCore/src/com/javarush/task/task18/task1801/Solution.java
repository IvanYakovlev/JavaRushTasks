package com.javarush.task.task18.task1801;

import java.io.FileInputStream;
import java.util.ArrayList;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> a=new ArrayList<Integer>();
        FileInputStream inputStream = new FileInputStream("C://1.txt");
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
