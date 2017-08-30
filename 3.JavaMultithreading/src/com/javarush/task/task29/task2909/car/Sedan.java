package com.javarush.task.task29.task2909.car;

/**
 * Created by IGOR on 02.01.2016.
 */
public class Sedan extends Car
{
    public Sedan(int numberOfPassengers)
    {
        super(Car.SEDAN, numberOfPassengers);
    }

    @Override
    public int getMaxSpeed()
    {
        final int MAX_SEDAN_SPEED = 120;
        return MAX_SEDAN_SPEED;
    }
}
