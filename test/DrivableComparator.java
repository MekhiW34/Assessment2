package test;

import java.util.Comparator;

public class DrivableComparator implements Comparator<Vehicle> {

    @Override
    public int compare(Vehicle vehicle1, Vehicle vehicle2) {
        if (vehicle1.getSpeed() < vehicle1.getSpeed()){
            return 1;
        }
        return -1;
    }

}
