public class Main {
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(-1));
    }

    public static boolean isPerfectNumber(int number)
    {
        if(number < 1)
        {
            return false;
        }

        int numCounter = 0;
        boolean isPerfect = false;

        for(int i = 1; i < number; i++)
        {
            if(number % i == 0)
            {
                numCounter += i;
            }
        }
        return number == numCounter;
    }
}
