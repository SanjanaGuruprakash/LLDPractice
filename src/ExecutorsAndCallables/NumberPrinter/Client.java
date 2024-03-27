package ExecutorsAndCallables.NumberPrinter;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
        ExecutorService es= Executors.newFixedThreadPool(5);
        //ExecutorService es= Executors.newSingleThreadExecutor();
        //ExecutorService es = Executors.newCachedThreadPool();

        for(int i=1;i<=100;i++){
            if(i==5 || i==11 || i==20 || i==80){
                System.out.println("DEBUG");
            }
            NumberPrinter numberPrinter=new NumberPrinter(i);
            es.execute(numberPrinter);
        }
    }
}
