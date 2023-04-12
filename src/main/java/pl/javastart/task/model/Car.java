package pl.javastart.task.model;

public class Car extends Vehicle {
    private boolean airConditioningOn;
    private static final double COMBUSTION = 0.8;

    public Car(String name, double tankCapacity, double averageCombustionPer100Km, boolean airConditioningOn) {
        super(name, tankCapacity, averageCombustionPer100Km);
        this.airConditioningOn = airConditioningOn;
    }

    public boolean isAirConditioningOn() {
        return airConditioningOn;
    }

    @SuppressWarnings("checkstyle:WhitespaceAround")
    @Override
    public double getAverageCombustionPer100Km() {
        if (airConditioningOn) {
            return super.getAverageCombustionPer100Km() + COMBUSTION;
        } else {
            return super.getAverageCombustionPer100Km();
        }
    }
}
