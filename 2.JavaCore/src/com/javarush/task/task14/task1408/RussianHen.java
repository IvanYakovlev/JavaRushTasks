package com.javarush.task.task14.task1408;

/**
 * Created by Админ on 26.04.2017.
 */
public class RussianHen extends Hen {
    @Override
    public int getCountOfEggsPerMonth() {
        return 15;
    }
    public String getDescription(){
        return super.getDescription()+" Моя страна - "+RUSSIA+". Я несу "+getCountOfEggsPerMonth()+" яиц в месяц.";
    }
}
