import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int min = 0, max = 0, num = 0, loopCount = 0;

        while(true)
        {
            System.out.println("Enter a number or write any letter to quit");
            String input = scanner.nextLine();
            try{
                num = Integer.parseInt(input);
                loopCount++;
                if(num < min)
                {
                    min = num;
                }
                if(num > max)
                {
                    max = num;
                }
            }catch (NumberFormatException e) {
                break;
            }
        }
       if(loopCount == 0)
       {
           System.out.println("No valid data entered");
       }else {
           System.out.println("Your lowest number was: " + min + " and your highest number was: " + max);
       }
    }
}