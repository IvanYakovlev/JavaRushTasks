package com.javarush.task.task18.task1815;

import java.util.List;

/* 
Таблица
*/

public class Solution {
    public class TableInterfaceWrapper  implements ATableInterface{
        ATableInterface component;

        @Override
        public void setModel(List rows) {
            component.setModel(rows);
            System.out.println(rows.size());
        }

        @Override
        public String getHeaderText() {
            return component.getHeaderText().toUpperCase();
        }

        @Override
        public void setHeaderText(String newHeaderText) {
            component.setHeaderText(newHeaderText);
        }

        public TableInterfaceWrapper(ATableInterface component) {
            this.component=component;
        }
    }

    public interface ATableInterface {
        void setModel(List rows);

        String getHeaderText();

        void setHeaderText(String newHeaderText);
    }

    public static void main(String[] args) {
    }
}