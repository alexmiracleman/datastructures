package com.luxoft.datastructures.list;
import com.luxoft.datastructures.list.ArrayList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArrayListTest {
    @Test
    public void testAddValueByIndex() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");
        arrayList.add("G", 0);
//        assertTrue(arrayList.contains("D"));
        arrayList.add("X", 4);
        System.out.println(arrayList.toString());
//        assertEquals("D",arrayList.get(3));

    }
    @Test
    public void testSetValueByIndex() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");
        arrayList.set("G", 3);

        assertTrue(arrayList.contains("G"));
    }
    @Test
    public void testRemoveByIndex() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");
        arrayList.remove(3);
        System.out.println(arrayList.toString());
//        assertEquals("C", arrayList.remove(2));

    }
    @Test
    public void testContainsReturnTrue() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");

        assertTrue(arrayList.contains("A"));
        assertFalse(arrayList.contains("X"));

    }
    @Test
    public void testGetByIndex() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");

        assertEquals("C", arrayList.get(2));
    }
    @Test
    public void testSetByIndex() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");

        assertEquals("A", arrayList.set("H", 0));
    }
    @Test
    public void testReturnIndex() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");

        assertEquals(2, arrayList.indexOf("C"));
    }
    @Test
    public void testSize() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        assertEquals(3, arrayList.size());
    }
    @Test
    public void testClearAndEmpty() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");
        arrayList.clear();
        assertTrue(arrayList.isEmpty());
    }
    @Test
    public void testToString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("A");
        arrayList.add(27);
        arrayList.add(5);
        arrayList.add("D");
        System.out.println(arrayList.toString());


    }

}
