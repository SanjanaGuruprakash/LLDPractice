package SyncronizedMethods;

public class Count {
    private int value=0;

    public synchronized void incrementVal(int offset){
        value+=offset;
    }
    public int getValue(){
        return value;
    }


}
