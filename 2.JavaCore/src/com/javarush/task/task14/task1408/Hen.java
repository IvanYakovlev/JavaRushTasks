package com.javarush.task.task14.task1408;

/**
 * Created by Админ on 26.04.2017.
 */
public abstract class Hen implements Country {

   public abstract int getCountOfEggsPerMonth();
   public String getDescription(){
     return "Я - курица.";
   }
}
