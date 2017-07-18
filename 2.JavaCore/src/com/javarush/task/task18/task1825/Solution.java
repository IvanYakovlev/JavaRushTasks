package com.javarush.task.task18.task1825;

/* 
Собираем файл
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            Set<String> set = new TreeSet<>((o1, o2) -> {
                int first = Integer.parseInt(o1.substring(o1.lastIndexOf(".part") + 5));
                int second = Integer.parseInt(o2.substring(o1.lastIndexOf(".part") + 5));
                return first - second;
            });
            String fileName;

            while (!(fileName = reader.readLine()).equals("end")) {
                set.add(fileName);
            }

            String outputFile = ((TreeSet<String>) set).first();
            try (FileOutputStream fos = new FileOutputStream(outputFile.substring(0, outputFile.lastIndexOf(".part")))) {
                for (String file : set) {
                    try (FileInputStream fis = new FileInputStream(file)) {
                        byte[] bytes = new byte[fis.available()];
                        fis.read(bytes);
                        fos.write(bytes);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}