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
            for (int j=0;j<a.length;j++){
             long firstslog =(long) Math.pow(Double.parseDouble(a[j]), a.length);
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
<<<<<<< HEAD
        long n = 2989; //1.978
=======
        long n = 99999;
>>>>>>> 5f26a57f72f9d0141be0278d4db7a89ea3934de6
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
