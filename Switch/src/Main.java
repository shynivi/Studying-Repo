import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {


        int switchValue = 3;

        switch (switchValue) {
            case 1 -> System.out.println("Value was 1");
            case 2 -> System.out.println("Value was 2");
            case 3, 4, 5 -> {
                System.out.println("Was a 3, a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
            }
            default -> System.out.println("Was not 1, 2, 3, 4 or 5");
        }

        String month = "xyz";
        System.out.println(month + " is in the " + getQuarter(month) + " quarter");

        System.out.println(switchChallenge('A'));
        System.out.println(printDayOfWeek(6));

    }

    public static String getQuarter(String month)
    {
        return switch (month) {
            case "January", "February", "March" -> "1st";
            case "April", "May", "June" -> "2nd";
            case "July", "August", "September" -> "3rd";
            case "October", "November", "December" -> "4th";
            default -> {
                String badResponse = month + " is bad";
                yield badResponse;
            }
        };

    }

    public static String switchChallenge(char word)
    {
        switch(word) {
            case 'A': return "A is Able";
            case 'B': return "B is Baker";
            case 'C': return "C is Charlie";
            case 'D': return "D is Dog";
            case 'E': return "E is Easy";
            default: return "Not valid char";
        }
    }

    public static String printDayOfWeek(int number)
    {
        String dayOfTheWeek;

        return switch (number)
        {
            case 0 ->{
                dayOfTheWeek = "Is Sunday";
                yield dayOfTheWeek + " " + number;
            }
            case 1 ->{
                dayOfTheWeek = "Is Monday";
                yield dayOfTheWeek + " " + number;
            }
            case 2 ->{
                dayOfTheWeek = "Is Tuesday";
                yield dayOfTheWeek + " " + number;
            }
            case 3 ->{
                dayOfTheWeek = " is Wednesday";
                yield dayOfTheWeek + " " + number;
            }
            case 4 ->{
                dayOfTheWeek = "is Thursday";
                yield dayOfTheWeek + " " + number;
            }
            case 5 ->{
                dayOfTheWeek = "is Friday";
                yield dayOfTheWeek + " " + number;
            }
            case 6 -> {
                dayOfTheWeek = "is Saturday";
                yield dayOfTheWeek + " " +number;
            }
            default -> "Invalid Day";
        };
    }

    public static String printDayOfWeek(int num, int num2)
    {
        if(num == 0)
        {
            return "Sunday";
        }
        else if(num == 1)
        {
            return "Monday";
        }
        else if(num == 2)
        {
            return "Tuesday";
        }
        else if(num == 3)
        {
            return "Wednesday";
        }
        else if(num == 4)
        {
            return "Thursday";
        }
        else if(num == 5)
        {
            return "Friday";
        }
        else if(num == 6)
        {
            return "Saturday";
        }
        else
            return "Invalid Value";
    }
}

