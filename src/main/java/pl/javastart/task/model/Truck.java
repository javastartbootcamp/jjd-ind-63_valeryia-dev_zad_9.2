package pl.javastart.task.model;

import pl.javastart.task.model.Car;

public class Truck extends Car {
    private double cargoWeight;
    private static final double COMBUSTION = 1.6;

    public Truck(String name, double tankCapacity, double averageCombustionPer100Km, boolean airConditioningOn, double cargoWeight) {
        super(name, tankCapacity, averageCombustionPer100Km, airConditioningOn);
        this.cargoWeight = cargoWeight;
    }

    @Override
    public double getAverageCombustionPer100Km() {
        if (isAirConditioningOn()) {
            return super.getAverageCombustionPer100Km() + COMBUSTION + (cargoWeight / 200);
        } else {
            return super.getAverageCombustionPer100Km() + (cargoWeight / 200);
        }
    }
}

