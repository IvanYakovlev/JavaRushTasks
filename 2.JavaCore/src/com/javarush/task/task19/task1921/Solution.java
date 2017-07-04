package com.javarush.task.task19.task1921;

import org.omg.PortableInterceptor.INACTIVE;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException, ParseException {
        BufferedReader reader = new BufferedReader(new FileReader("C:/1.txt"));
        while (reader.ready()){
            int year;
            int month;
            int day;
            String name = "";
            String[] a = reader.readLine().split(" ");
            year= Integer.parseInt(a[a.length-1]);
            month= Integer.parseInt(a[a.length-2]);
            day= Integer.parseInt(a[a.length-3]);
            Date date1 = new GregorianCalendar(year, month-1, day).getTime();
            for (int i=0;i<a.length-3;i++){
                if (i==a.length-4){name=name+a[i];}else {name=name+a[i]+" ";}
            }
            PEOPLE.add(new Person(name, date1));

        }
        reader.close();
        for (Person p :PEOPLE)
            System.out.println(p.getName()+" "+p.getBirthday());
    }
}

