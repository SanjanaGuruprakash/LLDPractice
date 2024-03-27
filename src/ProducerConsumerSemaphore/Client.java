package ProducerConsumerSemaphore;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Semaphore;

public class Client {
    public static void main(String[] args) {

        Queue<Object> store = new ConcurrentLinkedQueue<>();

        Semaphore producerSema= new Semaphore(5);
        Semaphore consumerSema = new Semaphore(0);

        Producer p1=new Producer(store,"P1", producerSema, consumerSema);
        Producer p2=new Producer(store,"P2", producerSema, consumerSema);
        Producer p3=new Producer(store,"P3", producerSema, consumerSema);
        Producer p4=new Producer(store,"P4", producerSema, consumerSema);
        Producer p5=new Producer(store,"P5", producerSema, consumerSema);

        Consumer c1= new Consumer(store,"C1", producerSema, consumerSema);
        Consumer c2= new Consumer(store,"C2", producerSema, consumerSema);
        Consumer c3= new Consumer(store,"C3", producerSema, consumerSema);
        Consumer c4= new Consumer(store,"C4", producerSema, consumerSema);
        Consumer c5= new Consumer(store,"C5", producerSema, consumerSema);

        Thread t1=new Thread(p1);
        Thread t2=new Thread(p2);
        Thread t3=new Thread(p3);
        Thread t4=new Thread(p4);
        Thread t5=new Thread(p5);
        t1.start();

        t2.start();

        t3.start();

        t4.start();

        t5.start();

        Thread t6=new Thread(c1);
        Thread t7=new Thread(c2);
        Thread t8=new Thread(c3);
        Thread t9=new Thread(c4);
        Thread t10=new Thread(c5);
        t6.start();

        t7.start();

        t8.start();

        t9.start();

        t10.start();











    }
}
