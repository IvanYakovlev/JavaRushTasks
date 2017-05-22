package com.javarush.task.task17.task1721;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws IOException {
      joinData();


    }

    public static void joinData() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner name1 = new Scanner(new FileInputStream(reader.readLine()));
        Scanner name2 = new Scanner(new FileInputStream(reader.readLine()));
        reader.close();
        while (name1.hasNext()) {
            allLines.add(name1.nextLine());
        }
        while (name2.hasNext()){
            forRemoveLines.add(name2.nextLine());
        }
        name1.close();
        name2.close();
        int count=0;
        for (String a : forRemoveLines)
            for (String b : allLines) {
                if (a.equals(b)){
                    count++;
                }
            }
            if (count==forRemoveLines.size()){
                for (int i=0;i<forRemoveLines.size();i++) {
                    allLines.remove(0);
                }
            } else {
                for (int i=0;i<allLines.size();i++){
                    allLines.set(i,"");
                    throw new CorruptedDataException();
                }
            }

        }
    }

