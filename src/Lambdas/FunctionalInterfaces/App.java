package Lambdas.FunctionalInterfaces;


import java.util.Collection;
import java.util.function.*;

public class App {
    public static void main(String[] args) {
        Consumer<Integer> consumer=(a)->{
            System.out.println("accepted val "+ a);
        };
      consumer.accept(10);

        BiConsumer<String,Integer> biConsumer=(str,val)->{
            System.out.println("accepted str and val "+ str + val);
        };
        biConsumer.accept("Hello", 4);
        consumer.accept(20);
        
        Predicate<String> predicate=(str)->{
            if(str.length()<4){
                return false;
            }
            return true;
        };
        System.out.println("predicate.test(\"Scaler\") = " + predicate.test("Scaler"));

        BiPredicate<String,String> biPredicate = (str,str1)->{
            if(str1.equals(str)){
                return true;
            }
            return false;
        };
        System.out.println("biPredicate.test(\"Scaler\", \"University\") = " + biPredicate.test("Scaler", "University"));

        Function<String, String> function = (str2)->{
            return str2.toUpperCase();
        };
        System.out.println("function.apply(\"scaler\") = " + function.apply("scaler"));
        BiFunction<String,String,String> biFunction = (str3,str4)->{
            return str3+str4;
        };
        System.out.println("biFunction.apply(\"Scaler\", \"School\") = " + biFunction.apply("Scaler", "School"));

    }
}
