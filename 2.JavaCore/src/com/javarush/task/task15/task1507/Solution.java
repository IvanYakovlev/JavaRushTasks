package com.javarush.task.task15.task1507;

/* 
ООП - Перегрузка
*/

public class Solution {
    public static void main(String[] args) {
        printMatrix(2, 3, "8");
    }

    public static void printMatrix(int m, int n, String value) {
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, Object value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
        }
    }
    public static void printMatrix() {

        System.out.println("hi");

    }
    public static void printMatrix(String a) {

        System.out.println(a);

    }
    public static void printMatrix(int a) {

        System.out.println(a);

    }
    public static void printMatrix(int a, int b) {

        System.out.println(a+b);

    }
    public static void printMatrix(String a, int b) {

        System.out.println(a+b);

    }
    public static void printMatrix(int[] a) {

        System.out.println(a);

    }
    public static void printMatrix(String a,String b, String c) {

        System.out.println(a+b +c );

    }
    public static void printMatrix(Character a) {

        System.out.println(a);

    }
}
