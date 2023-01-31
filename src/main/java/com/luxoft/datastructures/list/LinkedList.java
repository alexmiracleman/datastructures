package com.luxoft.datastructures.list;

import java.util.Objects;
import java.util.StringJoiner;

public class LinkedList implements List{

    Node head;
    Node tail;
    private int size;

    @Override
    public void add(Object value) {
        Node newNode = new Node(value);
        if (size == 0) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    @Override
    public void add(Object value, int index) {

        Node newNode = new Node(value);
          if (size == 0) {
            head = tail = newNode;
        } else if (index == size - 1) {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        } else if (index == 0) {
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
        } else {
              Node current = getNode(index);
              Node prevNode = current.prev;
              prevNode.next = newNode;
              newNode.prev = prevNode;
              newNode.next = current;
              current.prev = newNode;
            }

        size++;

    }

    @Override
    public Object remove(int index) {
        if (index > size - 1) {
            throw new IllegalStateException("Index is greater than size. The size is " + size + " and the index is " + index +
                    ". The index should be within " + 0 + " and " + (size - 1) + ".");
        }
        Object result;
        if (index == 0 || size == 1) {
            result = head.value;
            head = tail = null;
        } else if (index == 0) {
            result = head.value;
            head = head.next;
            head.prev = null;

        } else if (index == size - 1) {
            result = tail.value;
            tail = tail.prev;
            tail.next = null;

        } else {
            result = getNode(index).value;
            Node toRemove = getNode(index);
            Node nextNode = toRemove.next;
            Node prevNode = toRemove.prev;
            nextNode.prev = prevNode;
            prevNode.next = nextNode;
            toRemove.next = toRemove.prev = null;

        }
        size--;
        return result;
    }

    private Node getNode(int index) {
        Node node = head.next;
        int i = 1;
        while (i < index) {
            node = node.next;
            i++;
        }
        return node;
    }

    @Override
    public Object get(int index) {
        if (index > size - 1) {
            throw new IllegalStateException("Index is greater than size. The size is " + size + " and the index is " + index +
                    ". The index should be within " + 0 + " and " + (size - 1) + ".");

        } else if (index == 0) {
            return head.value;
        } else if (index == size - 1) {
            return tail.value;
        } else {
            Node node = head.next;
            int i = 1;
            while (i < index) {
                node = node.next;
                i++;
            }
            return node.value;
        }

    }


    @Override
    public Object set(Object value, int index) {
        if (index > size - 1) {
            throw new IllegalStateException("Index is greater than size. The size is " + size + " and the index is " + index +
                    ". The index should be within " + 0 + " and " + (size - 1) + ".");
        }
        Object toSet;
        if (index == size - 1) {
            toSet = tail.value;
            tail.value = value;

        } else if (index == 0) {
            toSet = head.value;
            head.value = value;
            return toSet;
        } else {
            toSet = getNode(index).value;
            getNode(index).value = value;

        }

        return toSet;
    }

    @Override
    public void clear() {
        head = null;
        tail = null;
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
        Node current = head;
        while (current != null) {
            if (Objects.equals(current.value, value)){
                return true;

            }
            current = current.next;
        }
        return false;
    }

    @Override
    public int indexOf(Object value) {
        int index = 0;
        Node current = head;
        while (value != current.value) {
            current = current.next;
            index++;
            }
            return index;
    }

    public String toString() {
        StringJoiner stringJoiner = new StringJoiner(", ", "[", "]");
        Node current = head;
        while (current != null) {
            stringJoiner.add(String.valueOf(current.value.toString()));
            current = current.next;
        }
        return stringJoiner.toString();
    }
}
