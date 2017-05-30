package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream file1 = new FileInputStream(reader.readLine());
        FileOutputStream file2 = new FileOutputStream(reader.readLine());
        StringBuffer sb = new StringBuffer();
        while (file1.available()>0){
            char b = (char) file1.read();
            sb.append(b);
            if (b==' '){
                System.out.println(sb);
                }



        }
    }
}
