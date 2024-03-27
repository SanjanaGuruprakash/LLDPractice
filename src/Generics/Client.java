package Generics;

public class Client {
//    public static void doSomething(Pair p){
//        //ambiguity on what is being passed
//    }
    public static void doSomething(GenericPair<Integer,String> p) {
        //now this accepts only of type int,string
    }
    public static void main(String[] args) {
//            Pair p1= new Pair(1,"name");
//            Pair p2 = new Pair(1.24,5.55);
//            // here though we can use the return type has to be typecasted and
//            // often it will be difficult to know.
//
//            int a =(int)p1.getFirst();
//            int b=a+10;// works for p1 but not for p2, so if we go on having different
//                       // classes for each pair datatype, this leads to class explosion
//                       // this case use generics
        GenericPair<Integer, String> p1= new GenericPair<>(1,"name");
        GenericPair<Double, Double> p2 = new GenericPair<>(1.245,5.55);
        doSomething(p1);// we can pass only p1 and not p2 hence helping with compile checks


    }
}
