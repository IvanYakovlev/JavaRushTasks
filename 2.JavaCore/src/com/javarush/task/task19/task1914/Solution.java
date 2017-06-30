package com.javarush.task.task19.task1914;

/* 
Решаем пример
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
        String[] a=result.split(" ");
        StringBuilder l=new StringBuilder();
        String equation = outputStream.toString().replaceAll("[\\n|\\r]", "");
       if (a[1].equals("+")) {
           int c=Integer.parseInt(a[0])+Integer.parseInt(a[2]);
           l.append(equation+c);
       } else  {if (a[1].equals("-")) {
           int c=Integer.parseInt(a[0])-Integer.parseInt(a[2]);
           l.append(equation+c); } else if (a[1].equals("*")) {
           int c=Integer.parseInt(a[0])*Integer.parseInt(a[2]);
           l.append(equation+c);}}
        System.setOut(consoleStream);
        System.out.print(l);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

