package Lab23.Number2;

import java.util.NoSuchElementException;

public abstract class AbstractQueue<E> implements Queue<E> {
    public void enqueue(E element) {
        if (element == null) {
            throw new NullPointerException();
        }
        add(element);
    }

    public E dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return remove();
    }

    public E element() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return peek();
    }

    public void clear() {
        while (!isEmpty()) {
            dequeue();
        }
    }

    protected abstract void add(E element);
    protected abstract E remove();
    protected abstract E peek();
}

