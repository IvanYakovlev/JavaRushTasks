package com.javarush.task.task14.task1408;

/**
 * Created by Админ on 26.04.2017.
 */
public class MoldovanHen extends Hen {
    @Override
    public int getCountOfEggsPerMonth() {
        return 12;
    }
    public String getDescription(){
        return super.getDescription()+" Моя страна - "+MOLDOVA+". Я несу "+getCountOfEggsPerMonth()+" яиц в месяц.";
    }
}
