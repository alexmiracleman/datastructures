package com.luxoft.datastructures.list;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LinkedListTest {

    @DisplayName("Test checking if the linked list is empty")
    @Test
    public void testListIsEmpty() {
        LinkedList linkedList = new LinkedList();
        assertTrue(linkedList.isEmpty());
        assertEquals(0, linkedList.size());

    }
    @DisplayName("Test adding Node by Value")
    @Test
    public void testAddNodeByValue() {
        LinkedList linkedList = new LinkedList();
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        linkedList.add("D");
        assertEquals(4, linkedList.size());
        assertTrue(linkedList.contains("C"));
    }

    @DisplayName("Test adding node with a value and index")
    @Test
    public void testAddNodeWithValueAndIndex() {
        LinkedList linkedList = new LinkedList();
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        linkedList.add("D");
        linkedList.add("X", 1);
        assertEquals(5, linkedList.size());
        linkedList.add("H", 4);
        System.out.println(linkedList.toString());
        assertEquals(6, linkedList.size());
        linkedList.clear();
        assertTrue(linkedList.isEmpty());



    }
    @DisplayName("Test removing a node by index")
    @Test
    public void testRemoveNodeByIndex() {
        LinkedList linkedList = new LinkedList();
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        linkedList.add("D");
        assertEquals(4, linkedList.size());
        linkedList.remove(2);
        assertFalse(linkedList.contains("C"));
        assertEquals(3, linkedList.size());
        System.out.println(linkedList.toString());
        linkedList.remove(1);
        linkedList.remove(1);
        linkedList.remove(0);
        assertEquals(0,linkedList.size());


    }
    @DisplayName("Test setting a node value by index and display all the nodes values in one String")
    @Test
    public void testSetNodeValueByIndexToString() {
        LinkedList linkedList = new LinkedList();
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        linkedList.add("D");
        System.out.println(linkedList.toString());
        linkedList.set("a", 0);
        linkedList.set("c", 2);
        System.out.println(linkedList.toString());

    }
    @DisplayName("Test getting the node's value by index")
    @Test
    public void testGetNodeValueByIndex() {
        LinkedList linkedList = new LinkedList();
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        linkedList.add("D");
        System.out.println(linkedList.get(2));
    }
    @DisplayName("Test getting the node's index by value")
    @Test
    public void testGetNodeIndexByValue() {
        LinkedList linkedList = new LinkedList();
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        linkedList.add("D");
        assertEquals(2, linkedList.indexOf("C"));
        assertEquals(0, linkedList.indexOf("A"));
        assertEquals(3, linkedList.indexOf("D"));


    }


}
