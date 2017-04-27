package com.javarush.task.task14.task1413;

/**
 * Created by venom on 27.04.2017.
 */
public class Computer {
    private Monitor monitor;
    private Keyboard keyboard;
    private Mouse mouse;

    public Monitor getMonitor() {
        return monitor;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public Computer( Keyboard keyboard,Mouse mouse,Monitor monitor) {
        this.monitor = monitor;
        this.keyboard = keyboard;
        this.mouse = mouse;

    }
}
