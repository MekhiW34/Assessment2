package test;

public interface Drivable {

    default int milesPerHour() {
        return 0;
    }


}
