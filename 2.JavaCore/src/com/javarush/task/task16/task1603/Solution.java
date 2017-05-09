package com.javarush.task.task16.task1603;

import java.util.ArrayList;
import java.util.List;

/* 
Список и нити
*/

public class Solution {
    public static volatile List<Thread> list = new ArrayList<Thread>(5);

    public static void main(String[] args) {
       SpecialThread sthread1=new SpecialThread();
        SpecialThread sthread2=new SpecialThread();
        SpecialThread sthread3=new SpecialThread();
        SpecialThread sthread4=new SpecialThread();
        SpecialThread sthread5=new SpecialThread();
        Thread thread1=new Thread(sthread1);
        Thread thread2=new Thread(sthread2);
        Thread thread3=new Thread(sthread3);
        Thread thread4=new Thread(sthread4);
        Thread thread5=new Thread(sthread5);
        list.add(thread1);
        list.add(thread2);
        list.add(thread3);
        list.add(thread4);
        list.add(thread5);

      list.get(0).run();
        list.get(1).run();
        list.get(2).run();
        list.get(3).run();
        list.get(4).run();
        //Add your code here - добавьте свой код тут
    }

    public static class SpecialThread implements Runnable {
        public void run() {
            System.out.println("it's a run method inside SpecialThread");
        }
    }
}
