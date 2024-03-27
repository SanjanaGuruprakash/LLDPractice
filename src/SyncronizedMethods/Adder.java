package SyncronizedMethods;

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

                count.incrementVal(i);// what if count class has already handled? better use sync method


        }


    }
}
