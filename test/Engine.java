package test;

public class Engine {

    private int numOfCylinders;

    public Engine(int numOfCylinders) {
        this.numOfCylinders = numOfCylinders;
    }

    public int getNumOfCylinders() {
        return numOfCylinders;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "numOfCylinders=" + numOfCylinders +
                '}';
    }


}
