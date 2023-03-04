package Lab20;

public class Number2<T, V, K> {
    private T var1;
    private V var2;
    private K var3;

    public Number2(T var1, V var2, K var3) {
        this.var1 = var1;
        this.var2 = var2;
        this.var3 = var3;
    }

    public T getVar1() {
        return var1;
    }

    public V getVar2() {
        return var2;
    }

    public K getVar3() {
        return var3;
    }

    public void printClassNames() {
        System.out.println("Type of var1: " + var1.getClass().getName());
        System.out.println("Type of var2: " + var2.getClass().getName());
        System.out.println("Type of var3: " + var3.getClass().getName());
    }
}
