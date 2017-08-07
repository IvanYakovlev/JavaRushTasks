/*
package com.javarush.task.task22.task2201;

<<<<<<< HEAD
=======
import com.javarush.task.task22.task2201.Solution;

>>>>>>> bc304386898bbc171ea77860b4b06d7299ec826e
public class ThisUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {
    @Override
    public void uncaughtException(Thread t, Throwable e) {
        final String string = "%s : %s : %s";
        if (Solution.FIRST_THREAD_NAME.equals(t.getName())) {
            System.out.println(getFormattedStringForFirstThread(t, e, string));
        } else
<<<<<<< HEAD
            if (Solution.SECOND_THREAD_NAME.equals(t.getName())) {
                System.out.println(getFormattedStringForSecondThread(t, e, string));
            } else {
                System.out.println(getFormattedStringForOtherThread(t, e, string));
            }
    }

    protected String getFormattedStringForOtherThread(Thread t, Throwable e, String string) {
        return null;
    }

    protected String getFormattedStringForSecondThread(Thread t, Throwable e, String string) {
        return null;
    }

    protected String getFormattedStringForFirstThread(Thread t, Throwable e, String string) {
        return null;
    }
}

=======
        if (Solution.SECOND_THREAD_NAME.equals(t.getName())) {
            System.out.println(getFormattedStringForSecondThread(t, e, string));
        } else {
            System.out.println(getFormattedStringForOtherThread(t, e, string));
        }
    }

    protected String getFormattedStringForOtherThread(Thread t, Throwable e, String string) {
        return String.format(string, e.getClass().getSimpleName(), e.getCause(), t.getName());
    }

    protected String getFormattedStringForSecondThread(Thread t, Throwable e, String string) {
        return String.format(string, e.getCause(), e.getClass().getSimpleName(), t.getName());
    }

    protected String getFormattedStringForFirstThread(Thread t, Throwable e, String string) {
        return String.format(string,t.getName(), e.getClass().getSimpleName(), e.getCause());
    }
}
>>>>>>> bc304386898bbc171ea77860b4b06d7299ec826e
*/
