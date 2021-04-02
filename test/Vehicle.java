package test;

public abstract class Vehicle extends Product{

    private int qty;
    private double price;
    private int speed;
    final static double TAX = .15;
    private Engine engine;

    public Vehicle(String name, int qty, double price, Engine engine ,int speed) {
        super(name);
        this.qty = qty;
        this.price = price;
        this.speed = speed;
        this.engine = engine;
    }


    public static double getTAX() {
        return TAX;
    }

    public int getQty() {
        return qty;
    }

    public double getPrice() {
        return price;
    }

    public int getSpeed() {
        return speed;
    }

    public Engine getEngine() {
        return engine;
    }

    @Override
    public String toString() {
        return "Vehicle name is: " + getName() + "and its price is : " + getPrice();

    }
}
