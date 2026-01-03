public class Main {
    public static void main(String[] args) {
       // numberToWords(5);

        System.out.println(reverse(208));
        //System.out.println(getDigitCount(3));
    }

    public static void numberToWords(int number)
    {
        if(number < 0)
        {
            System.out.println("Invalid Value");
        }

        int digitCount = getDigitCount(number);

        int reversedNum = reverse(number);

        int num = reversedNum;

        for(int i = 0; i < digitCount; i++)
        {
            num = reversedNum % 10;
            reversedNum /= 10;

            switch (num)
            {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;

            }
        }
    }

    public static int reverse(int number)
    {
        int reverseNum = 0;
        int reverseNumRemainder = 0;

        while(true)
        {

            reverseNumRemainder = number % 10;
            reverseNum += reverseNumRemainder;

            number /= 10;
            if(number == 0)
            {
            break;
            }
            reverseNum *= 10;

//            if(number < 10)
//            {
//                reverseNum += number;
//                //break;
//            }
        }
        return reverseNum;
    }

    public static int getDigitCount(int number)
    {
        if(number < 0)
        {
            return -1;
        }

        int digitCount = 0;

        if(number == 0)
        {
            return 1;
        }

        while(number > 0)
        {
            digitCount++;
            number /= 10;
        }
        return digitCount;
    }
}
