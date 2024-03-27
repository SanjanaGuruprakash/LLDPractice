package ProducerConsumerMutex;

import java.util.LinkedList;
import java.util.Queue;

public class Client {
    public static void main(String[] args) {
        int maxSize=5;
        Queue<Object> store = new LinkedList<>();

        Producer p1=new Producer(maxSize,store,"P1");
        Producer p2=new Producer(maxSize,store,"P2");
        Producer p3=new Producer(maxSize,store,"P3");
        Producer p4=new Producer(maxSize,store,"P4");
        Producer p5=new Producer(maxSize,store,"P5");

        Consumer c1= new Consumer(maxSize,store,"C1");
        Consumer c2= new Consumer(maxSize,store,"C2");
        Consumer c3= new Consumer(maxSize,store,"C3");
        Consumer c4= new Consumer(maxSize,store,"C4");
        Consumer c5= new Consumer(maxSize,store,"C5");

        Thread t1=new Thread(p1);
        t1.start();
        Thread t2=new Thread(p2);
        t2.start();
        Thread t3=new Thread(p3);
        t3.start();
        Thread t4=new Thread(p4);
        t4.start();
        Thread t5=new Thread(p5);
        t5.start();

        Thread t6=new Thread(c1);
        t6.start();
        Thread t7=new Thread(c2);
        t7.start();
        Thread t8=new Thread(c3);
        t8.start();
        Thread t9=new Thread(c4);
        t9.start();
        Thread t10=new Thread(c5);
        t10.start();











    }
}
