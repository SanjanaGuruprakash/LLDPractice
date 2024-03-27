package ProducerConsumerSemaphore;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Consumer implements Runnable{
    //int maxSize;
    Queue<Object> store;
    String name;
    Semaphore producerSema;
    Semaphore consumerSema;

    public Consumer(Queue<Object> store, String name, Semaphore producerSema, Semaphore consumerSema) {
        this.store = store;
        this.name = name;
        this.producerSema = producerSema;
        this.consumerSema = consumerSema;
    }

    @Override
    public void run() {
        while(true) {
            try {
                consumerSema.acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            store.remove();
            System.out.println(this.name + " is consuming shirt." +" New store size is " + store.size());
            producerSema.release();

        }
    }
}
