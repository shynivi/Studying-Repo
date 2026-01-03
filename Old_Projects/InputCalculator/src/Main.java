import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sum = 0;
        int average = 0;
        long loopCount = 0;

        while (true) {
            System.out.println("Enter a number");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            try {
                int num = Integer.parseInt(input);
                sum += num;
                loopCount++;
            } catch (NumberFormatException e) {
                break;
            }
        }
        if (loopCount == 0) {
            System.out.println("SUM = " + sum + " AVG = " + average);
        } else {
            average = Math.round((float) sum / loopCount);
            System.out.println(loopCount + " " +average);
            System.out.println("SUM = " + sum + " AVG = " + average);
            //System.out.println(loopCount + " " +average);
        }
    }
}