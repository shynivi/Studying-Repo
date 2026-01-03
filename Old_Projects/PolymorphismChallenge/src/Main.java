import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while(true) {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the type of car you are driving.'Q' to quit!");
            String type = s.nextLine();
            if(type.toUpperCase().charAt(0) == 'Q')
            {
                break;
            }
            switch (type.toUpperCase().charAt(0)) {
                case 'G', 'H' -> {
                    double avgKmPerLitre = 0;
                    int cylinders = 0;
                    String values;

                    System.out.println("Enter the Km per liter:");
                    values = s.nextLine();
                    avgKmPerLitre = Double.parseDouble(values);

                    System.out.println("Enter the number of cylinders");
                    values = s.nextLine();
                    cylinders = Integer.parseInt(values);

                    if(type.toUpperCase().charAt(0) == 'H')
                    {
                        int batterySize = 0;

                        System.out.println("Enter the battery size: ");
                        values = s.nextLine();
                        batterySize = Integer.parseInt(values);

                        Car c = getCarType(type ,avgKmPerLitre,cylinders,batterySize);
                        c.startEngine();
                        break;
                    }

                    Car c = getCarType(type,avgKmPerLitre, cylinders, 0);
                    c.startEngine();
                }
                case 'E' -> {
                    double avgKmPerCharge = 0;
                    int batterySize = 0;
                    String values;

                    System.out.println("Enter the Km per Charge:");
                    values = s.nextLine();
                    avgKmPerCharge = Double.parseDouble(values);

                    System.out.println("Enter the battery size of the car:");
                    values = s.nextLine();
                    batterySize = Integer.parseInt(values);

                    Car c = getCarType(type,avgKmPerCharge,0,batterySize);
                    c.startEngine();

                }
                default -> System.out.println("Error");
            }
        }


    }

    public static Car getCarType(String description, double avgKmPerLiter, int cylinders, int batterySize)
    {
        return switch(description.toUpperCase().charAt(0))
        {
            case 'G' -> new GasPoweredCar(description,avgKmPerLiter,cylinders);
            case 'H' -> new HybridCar(description,avgKmPerLiter,batterySize,cylinders);
            case 'E' -> new ElectricCar(description,avgKmPerLiter,batterySize);
            default -> new Car(description);
        };
    }
}
