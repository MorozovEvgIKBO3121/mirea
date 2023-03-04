package Lab23;

import java.util.Arrays;

public class ArrayQueueModule {
    private static int head; // указатель на начало очереди
    private static int tail; // указатель на конец очереди
    private static Object[] elements = new Object[10]; // массив элементов очереди

    public ArrayQueueModule() {
        head = 0;
        tail = 0;
        elements = new Object[10];
    }

    // Инвариант: head и tail указывают на первый свободный и последний заполненный элементы соответственно
    // elements не равен null

    // Предусловие: element не равен null
    // Постусловие: элемент добавлен в конец очереди
    public static void enqueue(Object element) {
        assert element != null;

        ensureCapacity(size() + 1);
        elements[tail] = element;
        tail = (tail + 1) % elements.length;
    }

    // Предусловие: очередь не пуста
    // Постусловие: удален и возвращен первый элемент очереди
    public static Object dequeue() {
        assert size() > 0;

        Object element = elements[head];
        elements[head] = null;
        head = (head + 1) % elements.length;
        return element;
    }

    // Предусловие: очередь не пуста
    // Постусловие: возвращен первый элемент очереди
    public static Object element() {
        assert size() > 0;

        return elements[head];
    }

    // Постусловие: очередь очищена
    public static void clear() {
        head = 0;
        tail = 0;
        Arrays.fill(elements, null);
    }

    // Постусловие: возвращено количество элементов в очереди
    public static int size() {
        return (tail - head + elements.length) % elements.length;
    }

    // Постусловие: возвращено true, если очередь пуста, и false в противном случае
    public static boolean isEmpty() {
        return head == tail;
    }

    // Постусловие: выделена память для нового массива, если текущий массив заполнен
    private static void ensureCapacity(int capacity) {
        if (capacity <= elements.length) {
            return;
        }
        Object[] newElements = new Object[2 * capacity];
        int size = size();
        if (head < tail) {
            System.arraycopy(elements, head, newElements, 0, size);
        } else {
            System.arraycopy(elements, head, newElements, 0, elements.length - head);
            System.arraycopy(elements, 0, newElements, elements.length - head, tail);
        }
        elements = newElements;
        head = 0;
        tail = size;
    }
}

