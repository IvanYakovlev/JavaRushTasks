package com.javarush.task.task19.task1916;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Отслеживаем изменения
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader1 = new BufferedReader(new FileReader(reader.readLine()));
        BufferedReader reader2 = new BufferedReader(new FileReader(reader.readLine()));
//        Сделать ввод с консоли
        collate(reader1, reader2);
        reader.close();
        reader1.close();
        reader2.close();
    }

    private static void collate(BufferedReader reader1, BufferedReader reader2) throws IOException {
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        while (reader1.ready()) {list1.add(reader1.readLine());}
        while (reader2.ready()) {list2.add(reader2.readLine());}
        for (int i = 0; i < list1.size(); i++){
            if (list1.get(i).equals(list2.get(i))){
                lines.add(new LineItem(Type.SAME, list1.get(i)));
                list2.set(i, null);
            } else if (!list1.get(i).equals(list2.get(i)) && list1.get(i).equals(list2.get(i + 1))) {
                lines.add(new LineItem(Type.ADDED, list2.get(i)));
                list2.remove(i);
            } else if (!list1.get(i).equals(list2.get(i)) && !list1.get(i).equals(list2.get(i + 1))) {
                lines.add(new LineItem(Type.REMOVED, list1.get(i)));
                list2.add(0 , null);
            }
        }
//        for (LineItem li: lines) {
//            System.out.println(li.type + " " + li.line);
//        }
    }


    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}