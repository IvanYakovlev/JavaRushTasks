package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream file1 = new FileInputStream(reader.readLine());
        FileOutputStream file2 = new FileOutputStream(reader.readLine());
        FileOutputStream file3 = new FileOutputStream(reader.readLine());
        reader.close();
        int a = file1.available()/2;
      while (a>0){
             int read = file1.read();
             file2.write(read);
             a--;
      }
      while (file1.available()>a){
          int read = file1.read();
          file3.write(read);
      }
    }

}
