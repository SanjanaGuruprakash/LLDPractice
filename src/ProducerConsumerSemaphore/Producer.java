package ProducerConsumerSemaphore;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Producer implements Runnable {

    //int maxSize;
    Queue<Object> store;
    String name;
    Semaphore producerSema;
    Semaphore consumerSema;

    public Producer(Queue<Object> store, String name, Semaphore producerSema, Semaphore consumerSema) {
        this.store = store;
        this.name = name;
        this.producerSema = producerSema;
        this.consumerSema = consumerSema;
    }

    @Override
    public void run() {
        while (true) {
            try {
                producerSema.acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            store.add(new Object());
            System.out.println(this.name + " is adding shirt." +" New store size is " + store.size());
            consumerSema.release();
        }
    }
}
