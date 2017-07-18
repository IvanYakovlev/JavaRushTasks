package com.javarush.task.task18.task1824;

/* 
Файлы и исключения
*/

import java.io.*;
import java.lang.reflect.Field;

public class Solution {
    public static void main(String[] args) throws IOException {
        String a=null;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true){
            try {
                a = reader.readLine();
                FileReader reader1 = new FileReader(a);
                reader1.close();
            } catch (FileNotFoundException e) {
                reader.close();
               break;
            }
        }
        System.out.print(a);
        reader.close();

    }
}
