package DesignPatterns.Startegy;

import DesignPatterns.Startegy.pathCalculator.PathCalculator;
import DesignPatterns.Startegy.pathCalculator.PathCalculatorFactory;

public class GoogleMaps {
    public void findPath(String source, String dest, Mode mode){
        PathCalculator pathCalculator= PathCalculatorFactory.getPathCalculatorforMode(mode);
        pathCalculator.findPath(source,dest);
    }
}
