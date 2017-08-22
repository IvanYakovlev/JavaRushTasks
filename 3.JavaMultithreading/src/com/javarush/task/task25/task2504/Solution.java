package com.javarush.task.task25.task2504;

/* 
Switch для нитей
*/
public class Solution {
    public static void processThreads(Thread... threads) {
        for (Thread tr: threads) {
            switch (tr.getState()) {
                case NEW:
                    tr.interrupt();
            }
        }//implement this method - реализуйте этот метод
    }

    public static void main(String[] args) {
    }
}
