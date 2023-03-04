package Lab23.Number2;

import java.util.NoSuchElementException;

public class LinkedQueue<E> extends AbstractQueue<E> {
    private Node<E> head;
    private Node<E> tail;
    private int size;

    private static class Node<E> {
        E element;
        Node<E> next;

        Node(E element, Node<E> next) {
            this.element = element;
            this.next = next;
        }
    }

    protected void add(E element) {
        Node<E> newNode = new Node<>(element, null);
        if (tail == null) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
        size++;
    }

    protected E remove() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        E element = head.element;
        head = head.next;
        size--;
        if (head == null) {
            tail = null;
        }
        return element;
    }

    protected E peek() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return head.element;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }
}
