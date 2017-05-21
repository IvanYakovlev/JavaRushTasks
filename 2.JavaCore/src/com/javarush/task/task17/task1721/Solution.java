package com.javarush.task.task17.task1721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws IOException {
       try {
           BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
           allLines.add(reader.readLine());
           forRemoveLines.add(reader.readLine());
           reader.close();
           joinData();
       } catch (CorruptedDataException e) {}
    }

    public static void joinData() throws IOException {
         if (allLines.contains(forRemoveLines)){
            allLines.remove(forRemoveLines);

        } else {
            allLines.remove(allLines);
            new CorruptedDataException();
        }
    }
}
