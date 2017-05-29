package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {


        FileReader f = new FileReader("C:/1.txt");

        int count = 0,bs = 0;
        while (f.ready()) {
            char s = (char) f.read();
            count++;
            if (s ==' ')
                bs++;
        }
        double a1=(double) count;
        double a2=(double) bs;
        f.close();
        double b = a2/(a1-a2)*100;

        System.out.printf("%.2f", b);


    }

}

