public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-222));
    }

    public static boolean isPalindrome(int number)
    {
        int reverseNum = 0;

        int num = number;

        if(num > 0)
        {
            while (number > 0) {
                int lastDigit = number % 10;
                reverseNum *= 10;
                reverseNum += lastDigit;
                number /= 10;
            }
        }
        else if(num < 0)
        {
            while (number < 0) {
                int lastDigit = number % 10;
                reverseNum *= 10;
                reverseNum += lastDigit;
                number /= 10;
            }
        }

        if(num == reverseNum)
        {
            return true;
        }
        else
            return false;
    }
}
