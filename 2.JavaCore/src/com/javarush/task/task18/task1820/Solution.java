package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a1=reader.readLine();
        String a2=reader.readLine();
        reader.close();
        FileInputStream file1 = new FileInputStream(a1);
        FileWriter file2 = new FileWriter(a2);

        StringBuffer sb = new StringBuffer();
        while (file1.available()>0){
            char b = (char) file1.read();
            sb.append(b);
            if (b==' '||file1.available()==0){
                double a=Double.parseDouble(String.valueOf(sb));
                int  res=(int) Math.round(a);
                file2.write(Integer.toString(res));
                if (file1.available()==0){}else
                {file2.write(" ");}
                sb.delete(0,sb.length());
            }
        }
        file1.close();
        file2.close();
    }
}
