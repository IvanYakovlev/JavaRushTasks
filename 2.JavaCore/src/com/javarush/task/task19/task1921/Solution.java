package com.javarush.task.task19.task1921;

import org.omg.PortableInterceptor.INACTIVE;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("C:/1.txt"));
        while (reader.ready()){
            int year;
            int month;
            int day;
            String name = null;
            String[] a = reader.readLine().split(" ");
            year= Integer.parseInt(a[a.length]);
            month= Integer.parseInt(a[a.length-1]);
            day= Integer.parseInt(a[a.length-2]);
            for (int i=0;i<a.length-2;i++){
                name=a[i]+" ";
            }
            PEOPLE.add(new Person(name, ));
            }
            System.out.println();
        }
    }

