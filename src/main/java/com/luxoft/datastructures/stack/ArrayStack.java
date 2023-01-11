package com.luxoft.datastructures.stack;

public class ArrayStack implements Stack {
    private int size;

    private Object[] array;

    public ArrayStack() {
        array = new Object[10];
    }

    public void push(Object value) {
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

    public Object pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        Object result = array[size - 1];
        size--;
        return result;
    }

    public Object peek() {
        return array[size - 1];
    }

    public boolean contains(Object value) {
        for (Object valueInStack : array) {
            if (value == valueInStack) {
                return true;
            }

        }
        return false;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        size = 0;

    }


}