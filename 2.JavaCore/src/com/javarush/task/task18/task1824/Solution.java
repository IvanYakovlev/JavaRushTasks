package com.javarush.task.task18.task1824;

/* 
Файлы и исключения
*/

import java.io.*;
import java.lang.reflect.Field;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader conReader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream file = null;

        while (true) {
            String fileName = conReader.readLine();
            try {
                file = new FileInputStream(fileName);
                file.close();
            } catch (FileNotFoundException e) {
                System.out.println(fileName);
                conReader.close();
                return;
            }
        }
    }
}