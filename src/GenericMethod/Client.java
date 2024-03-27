package GenericMethod;

import java.lang.reflect.Type;
import java.util.Map;
import java.util.TreeMap;

public class Client {
    public static void main(String[] args) {
        Triplet<String> idNameEmail = new Triplet<>("1","name","name@something.com");
        Triplet<Integer> rollAgePh = new Triplet<>(11, 29, 812378656);
        print(idNameEmail);
        print(rollAgePh);

        System.out.println(calculate(rollAgePh));
       // System.out.println(calculate(idNameEmail));// since it has string we cannot

    }
//    public static void print(Triplet<String> t){
//        System.out.println(t.getLeft()+"----"+ t.getMiddle()+"----"+ t.getRight());
//    } this will accept only triplet with string,
//    so to make this generic we need to define the method generic
        public static<Type> void print(Triplet<Type> t){
              System.out.println(t.getLeft()+"----"+ t.getMiddle()+"----"+ t.getRight());
        }// this will make the method also generic now
    // how to find average of the triplet and still support generics?

    public static double calculate(Triplet<? extends Number> t){
        return (t.getLeft().doubleValue()+t.getRight().doubleValue()+t.getRight().doubleValue())/3;
    }

}
