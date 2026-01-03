public class Main {
    public static void main(String[] args) {
        System.out.println(sumDigits(1234));
        System.out.println(sumDigits(32123));
        System.out.println(sumDigits(-3));
        System.out.println(sumDigits(4));
    }

    public static int sumDigits(int num)
    {
        if(num < 0)
        {
            return -1; 
        }

        int sumValue = 0;
        int newNum;

        while (num != 0)
        {
            newNum = num % 10;
            num /= 10;
            sumValue += newNum;
        }
        return sumValue;
    }
}
