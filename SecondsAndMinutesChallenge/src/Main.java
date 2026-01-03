public class Main {
    public static void main(String[] args) {

        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(65, 45));
    }

    public static String getDurationString(int seconds)
    {
        if(seconds < 0 )
        {
            return "Error!";
        }
        else {
            int minutes = seconds / 60;
            return getDurationString(seconds / 60,seconds % 60);
        }

    }

    public static String getDurationString(int minutes, int seconds)
    {
        if(minutes < 0 || (seconds < 0 || seconds > 60))
        {
            return "Error!";
        }
        else
        {
            int hours = minutes / 60;

            int minutesRemainder = minutes % 60;
            int secondsRemainder = seconds % 60;

            String display = String.valueOf(hours) + "h " + String.valueOf(minutesRemainder) + "m " + String.valueOf(secondsRemainder) + "s";
            return display;
        }
    }
}
