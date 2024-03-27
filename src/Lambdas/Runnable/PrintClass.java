package Lambdas.Runnable;

public class PrintClass implements Runnable{
    @Override
    public void run() {
        System.out.println("Running via class " + Thread.currentThread().getName());
    }
}
