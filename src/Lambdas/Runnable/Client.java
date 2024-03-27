package Lambdas.Runnable;

public class Client {
    public static void main(String[] args) {
        PrintClass printClass=new PrintClass();
        Thread thread=new Thread(printClass);
        thread.start();

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Running via anonymous class "+ Thread.currentThread().getName());
            }
        };
        Thread thread1=new Thread(runnable);
        thread1.start();

        Thread thread2 = new Thread(()->{
            System.out.println("Running via lambdas "+ Thread.currentThread().getName());
        });
        thread2.start();
    }
}
