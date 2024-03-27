package ProducerConsumerMutex;

import java.util.Queue;

public class Producer implements Runnable {

    int maxSize;
    Queue<Object> store;
    String name;

    public Producer(int maxSize, Queue<Object> store, String name) {
        this.maxSize = maxSize;
        this.store = store;
        this.name = name;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (store) {
                if (store.size() < maxSize) {
                    store.add(new Object());
                    System.out.println(this.name + " is adding shirt." + " New store size is" + store.size());
                }
            }
        }
    }
}
