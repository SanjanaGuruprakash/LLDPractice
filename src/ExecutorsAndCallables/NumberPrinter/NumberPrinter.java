package ExecutorsAndCallables.NumberPrinter;

public class NumberPrinter implements Runnable{
    int toPrint;

    NumberPrinter(int toPrint){
        this.toPrint=toPrint;
    }
    @Override
    public void run() {
        System.out.println("Printed by Thread " +Thread.currentThread().getName() + "-> " + toPrint );
    }
}
