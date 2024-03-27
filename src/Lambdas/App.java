package Lambdas;

public class App {
    public static void main(String[] args) {

        Demo demo = new Demo();
        demo.fun();

    DemoInterface demo1=new DemoInterface(){
      @Override
      public void fun(){
          System.out.println("anonymous class running");
      }
    };

        demo1.fun();
        DemoInterface demo2=()->{
            System.out.println("running fun via lambda");
        };
        demo2.fun();

    }
}
