package com.javarush.task.task20.task2022;

import java.io.*;

/* 
Переопределение сериализации в потоке
1) создать экземпляр класса Solution
2) записать в него данные - writeObject
3) сериализовать класс Solution - writeObject(ObjectOutputStream out)
4) десериализовать, получаем новый объект
5) записать в новый объект данные - writeObject
6) проверить, что в файле есть данные из п.2 и п.5
*/
public class Solution implements Serializable, AutoCloseable {
    private transient FileOutputStream stream;
    String filename;

    public Solution(String fileName) throws FileNotFoundException {
        this.stream = new FileOutputStream(fileName);
        this.filename=fileName;
    }

    public void writeObject(String string) throws IOException {
        stream.write(string.getBytes());
        stream.write("\n".getBytes());
        stream.flush();
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        stream = new FileOutputStream(filename, true);
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closing everything!");
        stream.close();
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Solution sol = new Solution("C:/1.txt");
        sol.writeObject("kyky");
        ObjectOutputStream obj1= new ObjectOutputStream(new FileOutputStream("C:/1.txt") );
        obj1.writeObject(sol);

        ObjectInputStream objr = new ObjectInputStream(new FileInputStream("C:/1.txt"));
        Solution sol2=(Solution) objr.readObject();
        sol2.writeObject("meow");

    }
}
