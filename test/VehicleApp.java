package test;

import java.util.ArrayList;

import java.util.Collections;

public class VehicleApp {

        public static void printVehicleNamesAndPrice(Vehicle[] vehicles){
            System.out.println(vehicles.toString());
        }

        public static void getSpeedOfDrivableVehicles(ArrayList<Drivable> driveAbleVehicles) {
            for (Drivable x: driveAbleVehicles) {
            System.out.println(x);
            }

        }

        public static void sortAndPrintDrivableVehiclesBySpeed(ArrayList<Vehicle> driveAbleVehicles){
            Collections.sort(driveAbleVehicles, new DrivableComparator());
           for (Vehicle x: driveAbleVehicles) {
               System.out.println(x);
           }

        }


    public static void main(String[] args) {


        Engine carEngine = new Engine(6);
        Engine truckEngine = new Engine(10);
        Engine bikeEngine = new Engine(8);

        Car car = new Car("Honda", 5, 50.0, 100, carEngine);
        Truck truck = new Truck("GM", 5, 100.0, 75, truckEngine);
        MotorBike motorBike = new MotorBike("Suzuki",5, 75.00, 50, bikeEngine);


        Vehicle[] vehicles = {car, truck, motorBike};

        ArrayList<Vehicle> vehicleList = new ArrayList<>();
        vehicleList.add(car); vehicleList.add(truck); vehicleList.add(motorBike);

        ArrayList<Drivable> drivableVehicle = new ArrayList<>();
        vehicleList.add(car); vehicleList.add(truck);



        printVehicleNamesAndPrice(vehicles);


        getSpeedOfDrivableVehicles(drivableVehicle);

        car.totalBeforeTax();
        truck.totalBeforeTax();
        truck.totalAfterTax();

        sortAndPrintDrivableVehiclesBySpeed(vehicleList);




    }
}
