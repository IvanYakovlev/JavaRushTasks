package com.javarush.task.task16.task1630;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static String firstFileName;
    public static String secondFileName;
    static
    {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        try {
            firstFileName=reader.readLine();
            secondFileName=reader.readLine();
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    //add your code here - добавьте код тут

    public static void main(String[] args) throws InterruptedException, FileNotFoundException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException, FileNotFoundException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        f.join();//add your code here - добавьте код тут
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent() throws FileNotFoundException;

        void join() throws InterruptedException;

        void start();
    }

    public static class ReadFileThread extends Thread implements ReadFileInterface{
        public String FileName;
        public String FileContent="";
        public String aa;
        @Override
        public void setFileName(String fullFileName) {
             this.FileName=fullFileName;
        }

        @Override
        public String getFileContent()  {

            return this.FileContent;
        }

        @Override
        public void run() {
            ArrayList<String> list = new ArrayList<String>();
            try {
               Scanner scanner = new Scanner(new FileReader(FileName));
                     while (scanner.hasNext()){
                     list.add(scanner.nextLine());
            }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            for (String bb : list){
                FileContent=FileContent+bb+" ";
            }

        }
    }//add your code here - добавьте код тут
}
