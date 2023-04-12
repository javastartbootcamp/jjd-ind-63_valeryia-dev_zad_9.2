package pl.javastart.task.test;

import pl.javastart.task.model.Car;
import pl.javastart.task.model.Truck;
import pl.javastart.task.model.Vehicle;

public class Test {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = new Vehicle("Vehicle 1", 60, 6.5);
        vehicles[1] = new Car("Car 1", 50, 8.0, false);
        vehicles[2] = new Truck("Truck 1", 120, 15.0, false, 500);

        for (Vehicle vehicle : vehicles) {
            vehicle.printInfo();
        }

    }
}
