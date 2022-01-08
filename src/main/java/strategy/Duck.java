package strategy;

public abstract class Duck {

    FlyBehaviour flyBehaviour;

    public Duck() { }

    public abstract void display();

    public void performFly() {
        flyBehaviour.fly();
    }

    public void swim() {
        System.out.println("all docks can swim");
    }
}
