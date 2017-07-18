package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a;
        while (!(a=reader.readLine()).equals("exit")) {
            ReadThread thread = new ReadThread(a);
            thread.start();
        }

    }

    public static class ReadThread extends Thread {
        FileInputStream fileInputStream;
        public String fileName;
        public ReadThread(String fileName) throws FileNotFoundException {
          fileInputStream  = new FileInputStream(fileName);
          this.fileName=fileName;//implement constructor body
        }

        @Override
        public void run() {

            Map<Integer, Integer> map=new TreeMap<>();
            try {
                while (fileInputStream.available()>0){
                    int read = (int) fileInputStream.read();
                    if (map.containsKey(read)){
                        map.put(read, map.get(read)+1);}else {map.put(read, 1);}
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            int max=0;
            int maxbyte=0;
            for (Map.Entry<Integer,Integer> entry: map.entrySet()){
                if (entry.getValue()>max){
                max=entry.getValue();
                maxbyte=entry.getKey();
                }
            }
            resultMap.put(fileName,maxbyte);
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        // implement file reading here - реализуйте чтение из файла тут
    }
}
