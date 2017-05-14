package com.javarush.task.task16.task1629;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static volatile BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws InterruptedException {
        Read3Strings t1 = new Read3Strings();
        t1.start();
        t1.join();
        Read3Strings t2 = new Read3Strings();
        t2.start();
        t2.join();
        //add your code here - добавьте код тут

        t1.printResult();
        t2.printResult();
    }

    public static class Read3Strings extends Thread{
     ArrayList<String> list=new ArrayList<String>();

        @Override
        public void run() {
           for (int i=0;i<3;i++){
               try {
                   list.add(reader.readLine());
               } catch (IOException e) {
                   System.out.println();
               }
           }


        }

        public void printResult() {
            for (String a : list)
            System.out.print(a+" ");
            System.out.println();
        }
    }//add your code here - добавьте код тут
}
