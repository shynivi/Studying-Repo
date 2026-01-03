public class Main {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(5));
    }

    public static int sumFirstAndLastDigit(int number)
    {
        if(number < 0)
        {
            return -1;
        }

        int firstDigit = 0;
        int lastDigit = 0;
        int sum = 0;
        int num = number;

        if(num < 10)
        {
            sum = num + num;
            return sum;
        }

        while (num > 0)
        {
            if(num == number)
            {
                lastDigit = num % 10;
                sum += lastDigit;
            }
            num /= 10;
            if(num < 10)
            {
                firstDigit = num % 10;
                sum += firstDigit;
            }
        }

        return sum;
    }
}
