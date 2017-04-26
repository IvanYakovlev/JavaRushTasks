package com.javarush.task.task14.task1408;

/**
 * Created by Админ on 26.04.2017.
 */
public class UkrainianHen extends Hen {
       @Override
    public int getCountOfEggsPerMonth() {
        return 19;
    }
    public void getDescription(){
        return super.getDescription()+"Моя страна - "+UKRAINE+". Я несу "+getCountOfEggsPerMonth()+"яиц в месяц.";
    }
}
