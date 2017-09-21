package com.javarush.task.task20.task2028;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collection;
import java.util.List;

/*
Итак, основа дерева создана, пора тебе поработать немного самому.
Вспомним как должно выглядеть наше дерево.

Элементы дерева должны следовать так как показано на картинке:
http://info.javarush.ru/uploads/images/00/04/89/2014/03/21/ee9a9b.jpg

Необходимо написать методы, которые бы позволили создать такую структуру дерева и проводить операции над ней.

Тебе необходимо реализовать:
1. метод add(String s) — добавляет элементы дерева, в качестве параметра принимает имя элемента (elementName),
 искать место для вставки начинаем слева направо.
2. метод remove(String s) — удаляет элемент дерева имя которого было полученного в качестве параметра.
3. метод size() — возвращает текущее количество элементов в дереве.
4. метод getParent(String s) — возвращает имя родителя элемента дерева, имя которого было полученного в качестве параметра.


Требования:
1. После добавления N элементов в дерево с помощью метода add, метод size должен возвращать N.
2. После удаления последнего добавленного элемента из дерева с помощью метода remove, метод size должен возвращать N-1.
3. После удаления второго элемента добавленного в дерево, метод size должен возвращать N/2 + 1
 (для случаев где N > 2 и является степенью двойки), N - размер дерева до удаления.
4. Метод getParent должен возвращать имя родителя для любого элемента дерева.
*/
public class CustomTree extends AbstractList<String> implements Cloneable, Serializable {
    Entry<String> root;
    public static void main(String[] args) {
        List<String> list = new CustomTree();
        for (int i = 1; i < 16; i++) {
            list.add(String.valueOf(i));
        }
        System.out.println("Expected 3, actual is " + ((CustomTree) list).getParent("8"));
        list.remove("5");
        System.out.println("Expected null, actual is " + ((CustomTree) list).getParent("11"));
    }


    public boolean add(String s) {
        if (this.isEmpty()) {
            root = new Entry<>(s);
            root.checkChildren();
            return true;
        } else {
            Entry<String> entry = root;
            entry.checkChildren();
            if (entry.isAvailableToAddChildren()) {

            }
        }


        return false;
    }

    public void remove(String s) {

    }
    public String getParent(String s) {
        return  null;
    }


    static class Entry<T> implements Serializable {
        String elementName;
        int lineNumber;
        boolean availableToAddLeftChildren, availableToAddRightChildren;
        Entry<T> parent, leftChild, rightChild;

        public Entry(String elementName) {
            this.elementName = elementName;
            this.availableToAddLeftChildren = true;
            this.availableToAddRightChildren = true;
        }

        public void checkChildren() {
            if (leftChild != null) {
                availableToAddLeftChildren = false;
            }
            if (rightChild != null) {
                availableToAddRightChildren = false;
            }
        }

        public boolean isAvailableToAddChildren() {
            return availableToAddLeftChildren | availableToAddRightChildren;
        }
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public String get(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String set(int index, String element) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void add(int index, String element) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String remove(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<String> subList(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException();
    }

    @Override
    protected void removeRange(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean addAll(int index, Collection<? extends String> c) {
        throw new UnsupportedOperationException();
    }
}