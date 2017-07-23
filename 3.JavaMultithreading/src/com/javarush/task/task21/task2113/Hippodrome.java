package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.List;

public class Hippodrome {

    private List<Horse> horses;

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public static Hippodrome game;

    public List<Horse> getHorses(){
        return horses;
    }

    public static void main(String[] args) throws InterruptedException {
        ArrayList<Horse> list=new ArrayList<>();
        game=new Hippodrome(list);
        list.add(new Horse("Коняша",3,0));
        list.add(new Horse("Сивка-Бурка",3,0));
        list.add(new Horse("Мустанг",3,0));
        game.getHorses();
        game.run();
        game.printWinner();
    }
    public void run() throws InterruptedException {
        for (int i=0;i<100;i++){
            move();
            print();
            Thread.sleep(200);
        }
    }
    public void print(){
        for (int i=0;i<horses.size();i++){
            horses.get(i).print();
            for (int j=0;j<10;j++){
                System.out.println();
            }
        }

    }
    public void move(){
        for (int i=0;i<horses.size();i++){
            horses.get(i).move();
        }

    }
    public Horse getWinner(){
        double windistance=0;
        Horse winHorse=null;
        for (int i=0;i<horses.size();i++){
            if (horses.get(i).distance>windistance){
                windistance=horses.get(i).distance;
            }
        }
        for (int i=0;i<horses.size();i++) {
            if (horses.get(i).distance==windistance){
                winHorse=horses.get(i);
            }
        }
        return winHorse;
    }
    public void printWinner(){
        System.out.println("Winner is "+getWinner().name+"!");
    }
}

