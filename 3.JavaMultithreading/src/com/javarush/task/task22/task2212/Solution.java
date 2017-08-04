package com.javarush.task.task22.task2212;

/* 
Проверка номера телефона
*/
public class Solution {

    public static boolean checkTelNumber(String telNumber) {
        boolean result = false;
        if (telNumber == null) return false;
        if (!telNumber.matches("[\\d, \\+, \\(, \\), -]+[\\d]$")) return false;
        if (telNumber.matches("^\\+.*")) {
            String digits = telNumber.replaceAll("\\D", "");
            if (digits.length() != 12) {
                return false;
            }
        }
        else if (telNumber.matches("^(\\(|\\d).*")) {
            String digits = telNumber.replaceAll("\\D", "");
            if (digits.length() != 10) {
                return false;
            }
        }
        else if (!telNumber.matches("^\\-.*")) return false;
        if (telNumber.matches("\\+?\\d*(\\(\\d{3}\\))?\\d+?-?\\d+-?\\d*")) {
            result = true;
        }
        return result;
    }
}