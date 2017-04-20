package com.javarush.task.task12.task1226;

/* 
Лазать, летать и бегать
*/

public class Solution {

    public class Cat implements Climb, Run{
        public void climb(){};
        public void run(){};
    }

    public class Dog implements Run{
        public void run(){};
    }

    public class Tiger extends Cat {
        public void climb(){};
        public void run(){};
    }

    public class Duck implements Run, Fly {
        public void fly(){};
        public void run(){};
    }
    public interface Fly{
        void fly();
    }
    public interface Climb{
        void climb();
    }
    public interface Run{
        void run();
    }


}
