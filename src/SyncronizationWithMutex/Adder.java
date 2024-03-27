package SyncronizationWithMutex;

import java.util.concurrent.locks.Lock;

public class Adder implements Runnable{
    //Lock lock;
    Count count;

    public Adder(Count count){
        this.count=count;
        //this.lock=lock;
    }
    @Override
    public void run() {
        for(int i=1;i<=10000;i++){
            synchronized (count) {
                //lock.lock();
                count.value += i;
                //lock.unlock();
            }
        }


    }
}
