package com.luxoft.datastructures.stack;
import com.luxoft.datastructures.list.ArrayList;
import com.luxoft.datastructures.queue.ArrayQueue;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArrayListTest {
    @Test
    public void testRemoveByIndex() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");
        System.out.println(arrayList[2]);

//        assertEquals(3, arrayQueue.size());
//        assertEquals("C", arrayQueue.peek());
//        arrayQueue.dequeue();
//        assertEquals("C", arrayQueue.peek());
//        assertEquals(2, arrayQueue.size());
    }

}
