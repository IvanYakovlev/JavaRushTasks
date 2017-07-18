package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/



import java.io.FileReader;
import java.io.IOException;


public class Solution {
    public static void main(String[] args) throws IOException {
        String alphabetL = "abcdefghijklmnopqrstuvwxyz";
        String alphabetH = alphabetL.toUpperCase();

        FileReader f = new FileReader(args[0]);

        int count = 0;
        while (f.ready()) {
            char s = (char) f.read();
            if ((alphabetL.indexOf(s) > -1) || alphabetH.indexOf(s) > -1)
                count++;
        }
        f.close();

        System.out.println(count);

    }


}
