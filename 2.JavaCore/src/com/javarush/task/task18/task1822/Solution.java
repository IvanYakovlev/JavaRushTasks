
package com.javarush.task.task18.task1822;

import java.io.BufferedReader;
/*
Поиск данных внутри файла
*/


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader f = new BufferedReader(new FileReader(br.readLine()));
        br.close();

        while (f.ready()) {
            String s = f.readLine();
            if (s.startsWith(args[0]))
                System.out.println(s);
        }
        f.close();
    }
}


