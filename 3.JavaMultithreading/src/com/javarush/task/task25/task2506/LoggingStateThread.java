package com.javarush.task.task25.task2506;

public class LoggingStateThread extends Thread
{
    Thread target = new Thread ( );


    public LoggingStateThread(Thread target)
    {
        this.target = target;
        setDaemon (true);
    }

    @Override
    public void run()
    {
        State state = this.target.getState ( );
        System.out.println (state);
        while (state != State.TERMINATED)
        {
            if (state != this.target.getState ( ))
            {
                state = this.target.getState ( );
                System.out.println (state);
            }
        }


    }


}