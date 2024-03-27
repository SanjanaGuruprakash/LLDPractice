package SyncronizedMethods;

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
                count.incrementVal(-i);
        }
    }
}
