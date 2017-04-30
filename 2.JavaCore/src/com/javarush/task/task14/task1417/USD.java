package com.javarush.task.task14.task1417;

/**
 * Created by venom on 29.04.2017.
 */
public class USD extends Money {
    public USD(double a) {
      super(a);
    }
    @Override
    public String getCurrencyName() {
        return "USD";
    }
}
