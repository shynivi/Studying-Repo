import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int numberOfChecks = 1;
        while (true) {
            if (numberOfChecks >= 6) {
                break;
            }
            try {
                System.out.println("Enter number #" + numberOfChecks + ":");
                String input = scanner.nextLine();
                if(!checkData(input)) {
                    continue;
                }
                numberOfChecks++;
                int stringToNum = Integer.parseInt(input);
                sum += stringToNum;
            } catch(NumberFormatException e){
                System.out.println("Please Enter Valid Values!");
            }
        }
        System.out.println("You number value is: " + sum);
    }
    public static boolean checkData(String input) {
        int number = Integer.parseInt(input);
        if(number < 0)
        {
            return false;
        }
        return true;
    }
}