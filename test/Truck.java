package test;

public class Truck extends Vehicle implements Drivable{

    final static double TAX = 20.0;


    public Truck(String name, int qty, double price, int speed, Engine engine) {
        super(name, qty, price, engine, speed);

    }

    public void totalBeforeTax(){
        System.out.println(getPrice() * getQty());
    }

    @Override
    public String toString() {
        return "Truck " + getName() + " :" + getPrice();
    }

    public void totalAfterTax(){
        System.out.println(getPrice() * getQty() + TAX);
    }
}
