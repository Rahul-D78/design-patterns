package strategy;

public class MallardDuck extends Duck {

    public MallardDuck() {
         flyBehaviour = new FlyWithWings();
    }

    public void display() {
        System.out.println("I am real Mallard Duck");
    }
}
