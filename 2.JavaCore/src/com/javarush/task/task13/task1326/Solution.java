package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner scanner = new Scanner(new FileInputStream(reader.readLine()));
        SortedSet<Integer> sort = new TreeSet<Integer>();
        while (scanner.hasNextLine()){

            sort.add(Integer.valueOf(scanner.nextLine()));
        }
        for (int a: sort){
            if (a%2==0)
            System.out.println(a);
        }
        scanner.close();
        // напишите тут ваш код
    }
}
