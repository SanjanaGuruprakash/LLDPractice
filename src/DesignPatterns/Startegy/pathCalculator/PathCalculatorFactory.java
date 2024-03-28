package DesignPatterns.Startegy.pathCalculator;

import DesignPatterns.Startegy.Mode;

import static DesignPatterns.Startegy.Mode.BUS;

public class PathCalculatorFactory {
    private static BusPathCalculator busPathCalculator=new BusPathCalculator();
    private static CarPathCalculator carPathCalculator = new CarPathCalculator();
    private static BikePathCalculator bikePathCalculator = new BikePathCalculator();

    public static PathCalculator getPathCalculatorforMode(Mode mode){
        return switch (mode)  {
            case BUS -> busPathCalculator;
            case CAR -> carPathCalculator;
            case BIKE -> bikePathCalculator;
        };
    }
}
