package Lab23;

import java.util.Arrays;

public class ArrayQueueADT {
    private int head; // указатель на начало очереди
    private int tail; // указатель на конец очереди
    private Object[] elements; // массив элементов очереди

    // Инвариант: head и tail указывают на первый свободный и последний заполненный элементы соответственно
    // elements не равен null

    // Предусловие: element не равен null
    // Постусловие: элемент добавлен в конец очереди
    public static void enqueue(ArrayQueueADT queue, Object element) {
        assert element != null;

        ensureCapacity(queue, queue.size() + 1);
        queue.elements[queue.tail] = element;
        queue.tail = (queue.tail + 1) % queue.elements.length;
    }

    public int size() {
        return (tail - head + elements.length) % elements.length;
    }

    public ArrayQueueADT() {
        head = 0;
        tail = 0;
        elements = new Object[10];
    }

    // Предусловие: очередь не пуста
    // Постусловие: удален и возвращен первый элемент очереди
    public static Object dequeue(ArrayQueueADT queue) {
        assert queue.size() > 0;

        Object element = queue.elements[queue.head];
        queue.elements[queue.head] = null;
        queue.head = (queue.head + 1) % queue.elements.length;
        return element;
    }

    // Предусловие: очередь не пуста
    // Постусловие: возвращен первый элемент очереди
    public static Object element(ArrayQueueADT queue) {
        assert queue.size() > 0;

        return queue.elements[queue.head];
    }

    // Постусловие: очередь очищена
    public static void clear(ArrayQueueADT queue) {
        queue.head = 0;
        queue.tail = 0;
        Arrays.fill(queue.elements, null);
    }

    // Постусловие: возвращено количество элементов в очереди
    public static int size(ArrayQueueADT queue) {
        return (queue.tail - queue.head + queue.elements.length) % queue.elements.length;
    }

    // Постусловие: возвращено true, если очередь пуста, и false в противном случае
    public static boolean isEmpty(ArrayQueueADT queue) {
        return queue.head == queue.tail;
    }

    // Постусловие: выделена память для нового массива, если текущий массив заполнен
    private static void ensureCapacity(ArrayQueueADT queue, int capacity) {
        if (capacity <= queue.elements.length) {
            return;
        }
        Object[] newElements = new Object[2 * capacity];
        int size = size(queue);
        if (queue.head < queue.tail) {
            System.arraycopy(queue.elements, queue.head, newElements, 0, size);
        } else {
            System.arraycopy(queue.elements, queue.head, newElements, 0, queue.elements.length - queue.head);
            System.arraycopy(queue.elements, 0, newElements, queue.elements.length - queue.head, queue.tail);
        }
        queue.elements = newElements;
        queue.head = 0;
        queue.tail = size;
    }
}
