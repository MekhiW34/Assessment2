package test;

public class MotorBike extends Vehicle{



    public MotorBike(String name, int qty, double price, int speed, Engine engine) {
        super(name, qty, price, engine,speed);
    }

    @Override
    public String toString() {
        return "MotorBike " + getName() + " :" + getPrice();
    }
}
