package DesignPatterns.Startegy.pathCalculator;

public class CarPathCalculator implements PathCalculator{
    @Override
    public void findPath(String source, String dest) {
        System.out.println("finding car path from "+source+" to "+dest);

    }
}
