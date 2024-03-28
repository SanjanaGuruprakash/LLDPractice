package DesignPatterns.Startegy.pathCalculator;

public class BikePathCalculator implements PathCalculator{
    @Override
    public void findPath(String source, String dest) {
        System.out.println("finding bike path from "+source+" to "+dest);
    }
}
