package com.javarush.task.task15.task1523;

/* 
Перегрузка конструкторов
*/

public class Solution {
    private Solution(int b,int a) {}
    public Solution(int a) {}
    protected Solution (String a){}
    Solution(String a,String b){}
    public static void main(String[] args) {

    }
}

