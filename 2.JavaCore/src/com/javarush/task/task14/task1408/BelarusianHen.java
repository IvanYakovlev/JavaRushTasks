package com.javarush.task.task14.task1408;

/**
 * Created by Админ on 26.04.2017.
 */
public class BelarusianHen extends Hen {
    @Override
    public int getCountOfEggsPerMonth() {
        return 15;
    }
    public void getDescription(){
        return super.getDescription()+"Моя страна - "+BELARUS+". Я несу "+getCountOfEggsPerMonth()+"яиц в месяц.";
    }
}
