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

    public void setName(String name) {
        this.name = name;
    }

    public double getTankCapacity() {
        return tankCapacity;
    }

    public void setTankCapacity(int tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

    public double getAverageCombustionPer100Km() {
        return averageCombustionPer100Km;
    }

    public void setAverageCombustionPer100Km(double averageCombustionPer100Km) {
        this.averageCombustionPer100Km = averageCombustionPer100Km;
    }

    public double getRange() {
        return tankCapacity / (averageCombustionPer100Km / 100);
    }

    public void printInfo() {
        System.out.println(name + ": pojemność = " + tankCapacity + ", average combustion per 100km = "
                + averageCombustionPer100Km + ", zasięg = " + getRange() + "km");
    }
}
