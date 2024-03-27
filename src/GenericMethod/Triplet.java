package GenericMethod;

public class Triplet <Type>{
    private Type left;
    private Type right;

    private Type middle;
    public Triplet(Type left, Type right, Type middle) {
        this.left = left;
        this.right = right;
        this.middle = middle;
    }

    public Type getLeft() {
        return left;
    }

    public Type getRight() {
        return right;
    }

    public Type getMiddle() {
        return middle;
    }




}
