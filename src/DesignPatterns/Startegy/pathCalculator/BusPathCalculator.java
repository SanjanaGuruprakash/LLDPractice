package DesignPatterns.Startegy.pathCalculator;

public class BusPathCalculator implements PathCalculator{
    @Override
    public void findPath(String source, String dest) {
        System.out.println("finding bsu path from "+source+" to "+dest);
    }
}
