package Lab23;

import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayQueueTest {
    @Test
    public void testEnqueue() {
        ArrayQueueADT queue1 = new ArrayQueueADT();
        ArrayQueueModule queue2 = new ArrayQueueModule();

        ArrayQueueADT.enqueue(queue1, "hello");
        ArrayQueueModule.enqueue("world");

        assertEquals(1, ArrayQueueADT.size(queue1));
        assertEquals(1, ArrayQueueModule.size());
    }

    @Test
    public void testDequeue() {
        ArrayQueueADT queue1 = new ArrayQueueADT();
        ArrayQueueModule queue2 = new ArrayQueueModule();

        ArrayQueueADT.enqueue(queue1, "hello");
        ArrayQueueModule.enqueue("world");

        assertEquals("hello", ArrayQueueADT.dequeue(queue1));
        assertEquals("world", ArrayQueueModule.dequeue());
        assertEquals(0, ArrayQueueADT.size(queue1));
        assertEquals(0, ArrayQueueModule.size());
    }

    @Test
    public void testElement() {
        ArrayQueueADT queue1 = new ArrayQueueADT();
        ArrayQueueModule queue2 = new ArrayQueueModule();

        ArrayQueueADT.enqueue(queue1, "hello");
        ArrayQueueModule.enqueue("world");

        assertEquals("hello", ArrayQueueADT.element(queue1));
        assertEquals("world", ArrayQueueModule.element());
        assertEquals(1, ArrayQueueADT.size(queue1));
        assertEquals(1, ArrayQueueModule.size());
    }

    @Test
    public void testClear() {
        ArrayQueueADT queue1 = new ArrayQueueADT();
        ArrayQueueModule queue2 = new ArrayQueueModule();

        ArrayQueueADT.enqueue(queue1, "hello");
        ArrayQueueModule.enqueue("world");

        ArrayQueueADT.clear(queue1);
        ArrayQueueModule.clear();

        assertEquals(0, ArrayQueueADT.size(queue1));
        assertEquals(0, ArrayQueueModule.size());
        assertTrue(ArrayQueueADT.isEmpty(queue1));
        assertTrue(ArrayQueueModule.isEmpty());
    }
}

