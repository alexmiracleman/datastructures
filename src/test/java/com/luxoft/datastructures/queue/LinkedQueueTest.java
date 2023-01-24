package com.luxoft.datastructures.queue;

import com.luxoft.datastructures.queue.LinkedQueue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LinkedQueueTest {


    @DisplayName("Enqueuing and Dequeuing array")
    @Test
    public void testEnqueueAndDequeue(){
        LinkedQueue queue = new LinkedQueue();
        queue.enqueue("A");
        queue.enqueue("B");
        assertEquals(2, queue.size());
        assertEquals("A", queue.dequeue());

    }


    @Test
    public void testThrownIllegalStateExceptionWhenDequeueOnEmptyStack() {
        LinkedQueue queue = new LinkedQueue();
        Assertions.assertThrows(IllegalStateException.class, () -> {
            queue.dequeue();

        });

    }
    @Test
    public void testReturnFalseOnEmptyStack() {
        LinkedQueue queue = new LinkedQueue();
        queue.enqueue("G");

        assertFalse(queue.isEmpty());
    }
    @Test
    public void testContainsReturnTrue(){
        LinkedQueue queue = new LinkedQueue();
        queue.enqueue("A");
        queue.enqueue("B");

        assertTrue(queue.contains("A"));

    }
    @Test
    public void testClearsArray(){
        LinkedQueue queue = new LinkedQueue();

        queue.enqueue("A");
        queue.enqueue("B");
        queue.clear();
        assertTrue(queue.isEmpty());

    }
    @Test
    public void testEnqueueAndPeekAndDequeue() {
        LinkedQueue queue = new LinkedQueue();

        queue.enqueue("A");
        queue.enqueue("B");
        queue.enqueue("C");

        assertEquals(3, queue.size());
        assertEquals("A", queue.peek());
        queue.dequeue();
        assertEquals("B", queue.peek());
        assertEquals(2, queue.size());
    }
}
