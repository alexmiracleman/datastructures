package com.luxoft.datastructures.queue;

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
            throw new IllegalStateException("Stack is empty");
        }
        Object result = array[0];
        Object[] newArray = new Object[size - 1];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = array[i+1];
        }
        array = newArray;
        size--;

        return result;
    }

    public Object peek() {
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
        size = 0;

    }


    public boolean duplicates() {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
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
