package DesignPatterns.Decorator;

public class ChocolateCone implements IceCream{

    private IceCream iceCream;

    public ChocolateCone(){

    }
    public ChocolateCone(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public int getCost() {
        if(iceCream!=null){
            return iceCream.getCost()+15;
        }
        return 15;
    }

    @Override
    public String getDesc() {
        if(iceCream!=null){
            return iceCream.getDesc()+"Chocolate Cone";
        }
        return "Chocolate Cone";
    }
}
