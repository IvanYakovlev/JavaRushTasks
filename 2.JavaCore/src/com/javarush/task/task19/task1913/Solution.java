package com.javarush.task.task19.task1913;

/* 
Выводим только цифры
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);
        testString.printSomething();
        String result = outputStream.toString();
        String[] a=result.split("");
        StringBuilder b= new StringBuilder();
        for (int i=0;i<a.length;i++){
            try {
                int c=Integer.parseInt(a[i]);
                b.append(c);
            }
            catch (Exception e){
                continue;
            }
        }
        System.setOut(consoleStream);
        System.out.println(b);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's 1 a 23 text 4 f5-6or7 tes8ting");
        }
    }
}
