package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws IOException {
<<<<<<< HEAD
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader file = new BufferedReader(new FileReader(reader.readLine()));
        while (file.ready()){
            String a =file.readLine();
            if (a.startsWith("14")){
                System.out.println(a);
            }
        }
    }
}

=======
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader f = new BufferedReader(new FileReader(br.readLine()));
        br.close();

        while (f.ready()) {
            String s = f.readLine();
            if (s.startsWith(args[0]))
                System.out.println(s);
        }
        f.close();
    }
}
>>>>>>> 2b98ef6fa969b3bc7cc7ad10f2c3b0e8b843f4c5
