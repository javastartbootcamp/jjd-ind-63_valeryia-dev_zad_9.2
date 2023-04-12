package pl.javastart.task.model;

public class Vehicle {
    private String name;
    private  double tankCapacity;
    private double averageCombustionPer100Km;

    public Vehicle(String name, double tankCapacity, double averageCombustionPer100Km) {
        this.name = name;
        this.tankCapacity = tankCapacity;
        this.averageCombustionPer100Km = averageCombustionPer100Km;
    }

    public String getName() {
        return name;
    }

    public double getAverageCombustionPer100Km() {
        return averageCombustionPer100Km;
    }

    public double getRange() {
        return tankCapacity / (averageCombustionPer100Km / 100);
    }

    public void printInfo() {
        System.out.println(name + ": pojemność = " + tankCapacity + ", average combustion per 100km = "
                + averageCombustionPer100Km + ", zasięg = " + getRange() + "km");
    }
}
