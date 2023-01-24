package com.luxoft.datastructures.list;

import java.util.StringJoiner;

public class ArrayList implements List{
    private Object[] array;
    private int size;
    private final int size2 = 10;

    public int getSize2() {
        return size2;
    }

    public ArrayList() {
        array = new Object[10];
    }

    @Override
    public void add(Object value) {
        array[size] = value;
        size++;
    }

    @Override
    public void add(Object value, int index) {
        if (index >= size) {
            throw new IndexOutOfBoundsException("Index is larger than the ArrayList size");
        }
        if (size == array.length) {
            arrayEnlarge();
        }
        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];
            array[index] = value;
            size++;

        }

    }

    @Override
    public Object remove(int index) {
        if (index >= size) {
            throw new IndexOutOfBoundsException("Index is larger than the ArrayList size");
        }
        Object toRemove = array[index];
        System.arraycopy(array, index + 1, array, index, size - index - 1);
//        for (int i = index; i < size -1; i++) {
//             array[i] = array[i + 1];
//        }
        array[size -1] = null;
        size--;
        return toRemove;
    }

    @Override
    public Object get(int index) {
//        if (index > size - 1) {
//            throw new IndexOutOfBoundsException("Index is larger than the ArrayList size");
//        }

        return array[index];
    }
    @Override
    public Object set(Object value, int index) {
        if (index >= size) {
            throw new IndexOutOfBoundsException("Index is larger than the ArrayList size");
        }
        Object toSet = array[index];
        array[index] = value;

        return toSet;
    }

    @Override
    public void clear() {
        for (int i = 0; i < size; i++) {
            array[i] = null;
        }
        size = 0;

    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object value) {
        for (Object valueInList : array) {
            if (value == valueInList) {
                return true;
            }

        }
        return false;
    }

    @Override
    public int indexOf(Object value) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }
    private void arrayEnlarge() {
        Object[] newArray = new Object[(int)(array.length * 1.5)];
        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        array = newArray;


}
    public String toString() {
        StringJoiner stringJoiner = new StringJoiner(", ", "[", "]" );
        for (int i = 0; i < size; i++) {
            stringJoiner.add(array[i].toString());
            }
       return stringJoiner.toString();
    }
}
