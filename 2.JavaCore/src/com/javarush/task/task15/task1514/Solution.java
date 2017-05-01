package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики 1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();
    static {
        labels.put(2d, "sd");
        labels.put(23d, "sad");
        labels.put(21d, "srd");
        labels.put(24d, "4sd");
        labels.put(25d, "s2d");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
