public class Main {
    public static void main(String[] args)
    {
        System.out.println(toMilesPerHour(25.42));

        printConversion(-2.0);
    }

    public static long toMilesPerHour(double kilometersPerHour)
    {
        if(kilometersPerHour < 0)
        {
            return -1;
        }

        double fromMilesToKm = kilometersPerHour / 1.609;
        long finalResult = Math.round(fromMilesToKm);

        return finalResult;
    }

    public static void printConversion(double kilometersPerHour)
    {
        if(kilometersPerHour < 0 )
        {
            System.out.println("Invalid Value");
        }
        else {
            long milesPerHour = toMilesPerHour(kilometersPerHour);

            System.out.println(kilometersPerHour + " km/h " + " = " + milesPerHour + " mi/h");
        }
    }
}
