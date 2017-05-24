package com.javarush.task.task18.task1810;

/* 
DownloadException
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream file1;
        String str;
        while (!(str=reader.readLine()).isEmpty()){
            file1=new FileInputStream(str);
            if (file1.available()>1000)
                break;
        }
        throw new DownloadException();

    }

    public static class DownloadException extends Exception {

    }
}
