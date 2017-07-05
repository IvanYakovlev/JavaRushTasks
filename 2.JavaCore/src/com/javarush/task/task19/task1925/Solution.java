package com.javarush.task.task19.task1925;

/* 
Длинные слова
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new FileReader("C:/1.txt"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("C:/2.txt"));
        while (reader.ready()){
            String[] line = reader.readLine().split(" ");
            for (int i=0;i<line.length;i++){
                if (line[i].length()>6){
                    {
                        writer.write(line[i]);
                        if (reader.ready())
                            writer.write(",");
                    }
                }
            }
        }
        reader.close();
        writer.close();
    }
}
