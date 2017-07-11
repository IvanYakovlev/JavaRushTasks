package com.javarush.task.task20.task2014;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/* 
Serializable Solution
*/
public class Solution  implements Serializable {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
       ObjectOutputStream ObjOut = new ObjectOutputStream(new FileOutputStream("C:/1.txt"));
        Solution savedObject = new Solution(4);
        ObjOut.writeObject(savedObject);
        ObjOut.flush();
        ObjOut.close();

        Solution loadedObject = new Solution(14);
        System.out.println(loadedObject);
        ObjectInputStream ObjIn = new ObjectInputStream(new FileInputStream("C:/1.txt"));
        loadedObject = (Solution) ObjIn.readObject();
        System.out.println(savedObject.string.equals(loadedObject.string));
    }

    private transient final String pattern = "dd MMMM yyyy, EEEE";
    private transient Date currentDate;
    private transient int temperature;
    String string;

    public Solution(int temperature) {
        this.currentDate = new Date();
        this.temperature = temperature;

        string = "Today is %s, and current temperature is %s C";
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        this.string = String.format(string, format.format(currentDate), temperature);
    }

    @Override
    public String toString() {
        return this.string;
    }
}
