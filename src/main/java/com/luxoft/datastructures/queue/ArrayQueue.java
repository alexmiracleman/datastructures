package com.luxoft.datastructures.queue;

import java.util.Objects;

public class ArrayQueue implements Queue{
    private int size;

    private Object[] array;

    public ArrayQueue() {
        array = new Object[10];
    }

    public void enqueue(Object value) {
        ensureCapacity();
        array[size] = value;
        size++;
    }
    private void ensureCapacity() {
        if (array.length == size) {
            Object[] newArray = new Object[array.length * 2];
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }

    }

    public Object dequeue() {
        if(isEmpty()){
            throw new IllegalStateException("Queue is empty");
        }
        Object result = array[0];
        for (int i = 0; i < size - 1; i++) {
            array[i] = array[i + 1];
        }

        size--;

        return result;
    }

    public Object peek() {
        if(isEmpty()){
            throw new IllegalStateException("Queue is empty");
        }
        return array[size - 1];
    }


    public int size() {

        return size;
    }


    public boolean isEmpty() {

        return size == 0;
    }


    public boolean contains(Object value) {
        for (Object valueInQueue : array) {
            if (value == valueInQueue) {
                return true;
            }

        }
        return false;
    }


    public void clear() {
        for (int i = 0; i < size; i++) {
            array[i] = null;
        }
        size = 0;

    }


    public boolean duplicates() {
        if(size < 2) {
            throw new IllegalStateException("Queue size is less than 2 elements!");
        }
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (array[i].equals(array[j])) {

                    return true;
                }

            }

        }
        return false;
    }
    public boolean moreThanValue(int value) {
        for (int i = 0; i < array.length; i++) {
            if(i <= value){
                return true;
            }

        }
        return false;
    }

}
