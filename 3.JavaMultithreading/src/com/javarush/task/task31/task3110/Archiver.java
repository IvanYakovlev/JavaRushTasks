package com.javarush.task.task31.task3110;

import java.io.IOException;

public class Archiver {
    public static void main(String[] args) throws IOException {


        ConsoleHelper.writeMessage("");
        ConsoleHelper.writeMessage("Выберите операцию:");
        ConsoleHelper.writeMessage(String.format("\t %d - упаковать файлы в архив", Operation.CREATE.ordinal()));
        ConsoleHelper.writeMessage(String.format("\t %d - добавить файл в архив", Operation.ADD.ordinal()));
        ConsoleHelper.writeMessage(String.format("\t %d - удалить файл из архива", Operation.REMOVE.ordinal()));
        ConsoleHelper.writeMessage(String.format("\t %d - распаковать архив", Operation.EXTRACT.ordinal()));
        ConsoleHelper.writeMessage(String.format("\t %d - просмотреть содержимое архива", Operation.CONTENT.ordinal()));
        ConsoleHelper.writeMessage(String.format("\t %d - выход", Operation.EXIT.ordinal()));

    }
}