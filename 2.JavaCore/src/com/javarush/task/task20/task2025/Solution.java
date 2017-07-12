package com.javarush.task.task20.task2025;

import java.util.TreeSet;

/*
Алгоритмы-числа
*/
public class Solution {
    public static long[] getNumbers(long N) {
        long[] result = null;
        TreeSet<Long> array = new TreeSet<>();
        for (long i=1;i<N;i++){
            long value=0;
            String[] a = String.valueOf(i).split("");
            double st= (double) a.length;
         for (int j=0;j<a.length;j++){
             long firstslog =(long) Math.pow(Double.parseDouble(a[j]), st);
             value=value+firstslog;
            }
            if (value==i){
                array.add(i);
            }
        }
        result = new long[array.size()];
        int count = 0;
        for (Long l : array) {
            result[count] = l;
            count++;
        }
        return result;
    }

    public static void main(String[] args) {
        Long t0 = System.currentTimeMillis();
        //int n = 99999999   //1.204
        //int n = 146511208;
        long n = 99999; //1.978
        //int n = 99999; //9.62
        //int n = 2147483647;//22.338 - 24.887
        long[] lst = getNumbers(n);
        Long t1 = System.currentTimeMillis();
        System.out.println("time: " + (t1 - t0) / 1000d + " sec");
        System.out.println("memory: " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / (1024 * 1024) + " mb");
        for (int i = 0; i < lst.length; i++) {
            System.out.print(lst[i] + ", ");
        }
        System.out.println();

    }
}
