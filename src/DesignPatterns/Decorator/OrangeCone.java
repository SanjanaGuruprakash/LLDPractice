package DesignPatterns.Decorator;

public class OrangeCone implements IceCream{
    private IceCream iceCream;
    public OrangeCone() {

    }
    public OrangeCone(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public int getCost() {
        if(iceCream!=null){
            return iceCream.getCost()+10;
        }
        return 10;
    }

    @Override
    public String getDesc() {
        if(iceCream!=null){
            return iceCream.getDesc()+"Orange Cone";
        }
        return "Orange Cone";
    }
}
