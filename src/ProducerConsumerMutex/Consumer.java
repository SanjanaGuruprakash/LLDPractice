package ProducerConsumerMutex;

import java.util.Queue;

public class Consumer implements Runnable{
    int maxSize;
    Queue<Object> store;
    String name;

    public Consumer(int maxSize, Queue<Object> store, String name) {
        this.maxSize = maxSize;
        this.store = store;
        this.name=name;
    }

    @Override
    public void run() {
        while(true) {
            synchronized (store) {
                if (store.size() > 0) {
                    store.remove();
                    System.out.println(this.name + " is consuming shirt." + " New store size is" + store.size());
                }
            }
        }
    }
}
