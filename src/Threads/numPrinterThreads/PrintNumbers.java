package Threads.numPrinterThreads;

public class PrintNumbers implements Runnable{
    int toPrint;

    public PrintNumbers(int toPrint){
        this.toPrint=toPrint;
    }
    @Override
    public void run() {
//        for(int i=1;i<=toPrint;i++)
//        System.out.println("printed by thread"+ Thread.currentThread().getName()+ "=>>" + i);
        System.out.println("printed by thread --> "+ Thread.currentThread().getName() +"-->" + toPrint);
    }
}
