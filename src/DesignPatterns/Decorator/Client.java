package DesignPatterns.Decorator;

public class Client {
    public static void main(String[] args) {
        IceCream iceCream = new Chocochips(
                                    new ChocolateCone(
                                                    new OrangeCone()
                                    )
        );

        System.out.println("iceCream description = " + iceCream.getDesc());

        System.out.println("iceCream Cost = " + iceCream.getCost());
    }
}
