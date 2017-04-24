package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        Scanner scanner=new Scanner(new FileInputStream(name));
        while(scanner.hasNextLine())
        {
            String data=scanner.nextLine();
            System.out.println(data);
        }
        reader.close();
        scanner.close();

    }
}