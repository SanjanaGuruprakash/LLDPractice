package DesignPatterns.Decorator;

public class Chocochips implements IceCream{
    private IceCream iceCream;

    public Chocochips(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public int getCost() {
        return iceCream.getCost()+10;
    }

    @Override
    public String getDesc() {
        return iceCream.getDesc()+"Chocochip";
    }
}
