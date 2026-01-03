public class Main {
    public static void main(String[] args) {

    }

    public static boolean hasSameLastDigit(int numOne, int numTwo, int numThree)
    {
        if(numOne < 10 || numOne > 1000 || numTwo < 10 || numTwo > 1000 || numThree < 10 || numThree > 1000)
        {
            return false;
        }

        int numOneRemainder = 0;
        numOneRemainder = numOne % 10;

        int numTwoRemainder = 0;
        numTwoRemainder = numTwo % 10;

        int numThreeReminder = 0;
        numThreeReminder = numThree % 10;

        return numOneRemainder == numTwoRemainder || numTwoRemainder == numThreeReminder || numOneRemainder == numThreeReminder;


    }

    public static boolean isValid(int num)
    {
        if(num < 10 || num > 1000)
        {
            return false;
        }
        else
            return true;
    }
}
