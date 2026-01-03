import java.util.Scanner;

public class Car {
    private String description;

    public Car(String description) {
        this.description = description;
    }

    public void startEngine()
    {

        runEngine();
        drive();

    }

    public void drive()
    {
        System.out.println("You are driving your " + description + " car!");

    }

    protected void runEngine()
    {
        System.out.println("The engine of your " + description + " car has started");

    }
}
class GasPoweredCar extends Car{
    private double avgKmPerLitre;
    private int cylinders;

    public GasPoweredCar(String description, double avgKmPerLitre, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }
    @Override
    public void runEngine()
    {
        super.runEngine();
        System.out.println("Engine is running on " + cylinders
                + " cylinders" + " and with an average of " + avgKmPerLitre
                + "km/h per liter.");
    }
}

class ElectricCar extends Car{
    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String description, double avgKmPerCharge, int batterySize) {
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        System.out.printf("BEV -> switch %d kWh battery on, Ready!%n", batterySize);
        runEngine();
    }

    @Override
    protected void runEngine() {
        System.out.printf("BEV -> usage under the average: %.2f %n", avgKmPerCharge);
    }
}

class HybridCar extends Car{
    private double avgKmPerLitre;
    private int batterySize;
    private int cylinders;

    public HybridCar(String description, double avgKmPerLitre, int batterySize, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    @Override
    protected void runEngine()
    {
        super.runEngine();
        System.out.println("Engine is running on " +
                 cylinders + " and with an average of "
                + avgKmPerLitre + "km/h per liter."
                + " And your battery is at " + batterySize + " health!");
    }
}