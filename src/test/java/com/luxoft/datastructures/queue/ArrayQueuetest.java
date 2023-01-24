package com.luxoft.datastructures.stack;

import com.luxoft.datastructures.queue.ArrayQueue;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArrayQueueTest {
    @DisplayName("Enqueuing and Dequeuing array")
    @Test
    public void testEnqueueAndDequeue(){
        ArrayQueue arrayQueue = new ArrayQueue();
        arrayQueue.enqueue("A");
        arrayQueue.enqueue("B");
        assertEquals(2, arrayQueue.size());
        assertEquals("A", arrayQueue.dequeue());

    }
    @Test
    public void testContainsTwoIdenticalObjects(){
        ArrayQueue arrayQueue = new ArrayQueue();
        arrayQueue.enqueue("A");
        arrayQueue.enqueue("B");
        arrayQueue.enqueue("B");
        arrayQueue.enqueue("A");
        assertTrue(arrayQueue.duplicates());

    }
    @Test
    public void testReturnsTrueIfValueMoreThanValue(){
        ArrayQueue arrayQueue = new ArrayQueue();
        arrayQueue.enqueue(2);
        arrayQueue.enqueue(5);
        arrayQueue.enqueue(11);
        arrayQueue.enqueue(3);

        assertTrue(arrayQueue.moreThanValue(10));

    }
    @Test
    public void testThrownIllegalStateExceptionWhenDequeueOnEmptyStack() {
        ArrayQueue arrayQueue = new ArrayQueue();

        Assertions.assertThrows(IllegalStateException.class, () -> {
            arrayQueue.dequeue();

        });

    }
    @Test
    public void testReturnFalseOnEmptyStack() {
        ArrayQueue arrayQueue = new ArrayQueue();
        arrayQueue.enqueue("G");

        assertFalse(arrayQueue.isEmpty());
    }
    @Test
    public void testContainsReturnTrue(){
        ArrayQueue arrayQueue = new ArrayQueue();
        arrayQueue.enqueue("A");
        arrayQueue.enqueue("B");

        assertTrue(arrayQueue.contains("A"));

    }
    @Test
    public void testClearsArray(){
        ArrayQueue arrayQueue = new ArrayQueue();
        arrayQueue.enqueue("A");
        arrayQueue.enqueue("B");
        arrayQueue.clear();
        assertTrue(arrayQueue.isEmpty());

    }
    @Test
    public void testEnqueueAndPeekAndDequeue() {
        ArrayQueue arrayQueue = new ArrayQueue();
        arrayQueue.enqueue("A");
        arrayQueue.enqueue("B");
        arrayQueue.enqueue("C");

        assertEquals(3, arrayQueue.size());
        assertEquals("C", arrayQueue.peek());
        arrayQueue.dequeue();
        assertEquals("C", arrayQueue.peek());
        assertEquals(2, arrayQueue.size());
    }
}
