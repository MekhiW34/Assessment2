package test;

public class Car extends Vehicle implements Drivable{



    public Car(String name, int qty, double price, int speed, Engine engine) {
        super(name, qty, price, engine, speed);
    }

    public void totalAfterTax(){
        System.out.println(getPrice() * getQty() + getTAX());
    }

    @Override
    public String toString() {
        return "Car " + getName() + " :" + getPrice();
    }

    public void totalBeforeTax(){
        System.out.println(getPrice() * getQty());
    }
}
