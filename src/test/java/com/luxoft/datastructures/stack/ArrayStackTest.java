package com.luxoft.datastructures.stack;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class ArrayStackTest {
    @DisplayName("Testing push and pop")
    @Test
    public void testPushAndPop(){
        ArrayStack arrayStack = new ArrayStack();
        arrayStack.push("A");
        arrayStack.push("B");

        assertEquals(2, arrayStack.size());
        assertEquals("B", arrayStack.pop());
        assertEquals("A", arrayStack.pop());
        assertEquals(0, arrayStack.size());
        assertTrue(arrayStack.isEmpty());

    }

    @Test
    public void testPushOverInitialCapacityAndPop(){
        ArrayStack arrayStack = new ArrayStack();
        for (int i = 0; i < 15; i++) {
            arrayStack.push(i);
            
        }
        assertEquals(15, arrayStack.size());
        for (int i = 14; i >= 0; i--) {
            assertEquals(i, arrayStack.pop());
        }

        assertEquals(0, arrayStack.size());
        assertTrue(arrayStack.isEmpty());

    }
    @Test
    public void testPushAndPopPeek(){
        ArrayStack arrayStack = new ArrayStack();
        arrayStack.push("A");
        arrayStack.push("B");

        assertEquals(2, arrayStack.size());
        assertEquals("B", arrayStack.peek());
        assertEquals("B", arrayStack.peek());
        assertEquals(2, arrayStack.size());

    }
    @Test
    public void testIsEmptyReturnTrueOnNewStack(){
        ArrayStack arrayStack = new ArrayStack();

        assertTrue(arrayStack.isEmpty());

    }
    @Test
    public void testIsEmptyReturnFalseOnStackWithData(){
        ArrayStack arrayStack = new ArrayStack();
        arrayStack.push("A");
        assertFalse(arrayStack.isEmpty());

    }
    @Test
    public void testIsEmptyReturnTrueOnStackAfterClear(){
        ArrayStack arrayStack = new ArrayStack();
        arrayStack.push("A");
        arrayStack.push("B");
        arrayStack.clear();

        assertTrue(arrayStack.isEmpty());

    }
    @Test
    public void testContainsReturnTrue(){
        ArrayStack arrayStack = new ArrayStack();
        arrayStack.push("A");
        arrayStack.push("B");

        assertTrue(arrayStack.contains("A"));

    }
    @Test
    public void testContainsReturnFalse(){
        ArrayStack arrayStack = new ArrayStack();
        arrayStack.push("A");
        arrayStack.push("B");

        assertFalse(arrayStack.contains("C"));

    }
    @Test
    public void testContainsReturnFalseOnEmptyStack(){
        ArrayStack arrayStack = new ArrayStack();
        arrayStack.push("A");

        assertFalse(arrayStack.isEmpty());

    }
    @Test
    public void testThrownIllegalStateExceptionWhenPopOnEmptyStack() {
        ArrayStack arrayStack = new ArrayStack();

        Assertions.assertThrows(IllegalStateException.class, () -> {
            arrayStack.pop();

        });

    }


}
