package com.javarush.task.task25.task2503;

import java.util.LinkedList;
import java.util.List;

public enum Column implements Columnable
{
    Customer ("Customer"),
    BankName ("Bank Name"),
    AccountNumber ("Account Number"),
    Amount ("Available Amount");

    private String columnName;

    private static int[] realOrder;

    private Column(String columnName)
    {
        this.columnName = columnName;
    }

    /**
     * Задает новый порядок отображения колонок, который хранится в массиве realOrder.
     * realOrder[индекс в энуме] = порядок отображения; -1, если колонка не отображается.
     *
     * @param newOrder новая последовательность колонок, в которой они будут отображаться в таблице
     * @throws IllegalArgumentException при дубликате колонки
     */
    public static void configureColumns(Column... newOrder)
    {
        realOrder = new int[values ( ).length];
        for (Column column : values ( ))
        {
            realOrder[column.ordinal ( )] = -1;
            boolean isFound = false;

            for (int i = 0; i < newOrder.length; i++)
            {
                if (column == newOrder[i])
                {
                    if (isFound)
                    {
                        throw new IllegalArgumentException ("Column '" + column.columnName + "' is already configured.");
                    }
                    realOrder[column.ordinal ( )] = i;
                    isFound = true;
                }
            }
        }
    }

    /**
     * Вычисляет и возвращает список отображаемых колонок в сконфигурированом порядке (см. метод configureColumns)
     * Используется поле realOrder.
     *
     * @return список колонок
     */
    public static List<Column> getVisibleColumns()
    {
        int          k      = 44;
        List<Column> result = new LinkedList<> ( );
        for (int i = 0; i < realOrder.length; i++)
        {
            for (int j = 0; j < realOrder.length; j++)
            {
                int ord = realOrder[j];
                if (ord == i)
                {
                    for (Column column : values ( ))
                    {
                        int kk = column.ordinal ( );
                        if (kk == j)
                            result.add (column);
                    }
                }
            }
        }
        return result;
    }

    @Override
    public String getColumnName()
    {
        return columnName;
    }

    @Override
    public boolean isShown()
    {
        int value = this.ordinal ( );
        if (realOrder[value] == -1)
            return false;
        return true;
    }

    @Override
    public void hide()
    {
        //  System.out.println (this.ordinal ( ));
        int value = this.ordinal ( );
        realOrder[value] = -1;
    }
}