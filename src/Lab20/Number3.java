package Lab20;


import java.io.Serializable;

public class Number3<T extends Comparable<T>, V extends Animal & Serializable, K extends Number> {
    private T t;
    private V v;
    private K k;

    public Number3(T t, V v, K k) {
        this.t = t;
        this.v = v;
        this.k = k;
    }

    public T getT() {
        return t;
    }

    public V getV() {
        return v;
    }

    public K getK() {
        return k;
    }
}
