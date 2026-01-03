public class Main {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12,12));
    }

    public static boolean hasSharedDigit(int numOne, int numTwo)
    {
        if((numOne < 10 || numOne > 99) || (numTwo < 10 || numTwo > 99))
        {
            return false;
        }

        int numOneDigitOne = 0;
        int numOneDigitTwo = 0;

        while(numOne > 0)
        {
            numOneDigitOne = numOne % 10;
            numOne /= 10;
            numOneDigitTwo = numOne % 10;
            numOne /= 10;

        }


        int numTwoDigitOne = 0;
        int numTwoDigitTwo = 0;

        while(numTwo > 0)
        {
            numTwoDigitOne = numTwo % 10;
            numTwo /= 10;
            numTwoDigitTwo = numTwo % 10;
            numTwo /= 10;

        }


        if(numOneDigitOne == numTwoDigitOne || numOneDigitTwo == numTwoDigitTwo || numOneDigitOne == numTwoDigitTwo) {
            return true;
        }
        else
            return false;

    }
}
