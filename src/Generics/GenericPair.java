package Generics;

public class GenericPair<A,B> {
    private A first;
    private B second;

    public GenericPair(A first, B second) {
        this.first = first;
        this.second = second;
    }

    public A getFirst() {
        return first;
    }

    public B getSecond() {
        return second;
    }
}
