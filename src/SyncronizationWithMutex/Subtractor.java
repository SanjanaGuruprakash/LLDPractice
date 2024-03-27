package SyncronizationWithMutex;

import java.util.concurrent.locks.Lock;

public class Subtractor implements Runnable{

    Count count;
    //Lock lock;

    public Subtractor(Count count){
        this.count=count;
        //this.lock=lock;
    }
    @Override
    public void run() {
        for(int i=1;i<=10000;i++){
            synchronized (count) {
                //lock.lock();
                count.value -= i;//what if count class has already handled? better use sync method
                //lock.unlock();
            }
        }
    }
}
