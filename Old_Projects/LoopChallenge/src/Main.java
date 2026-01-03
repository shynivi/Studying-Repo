public class Main {
    public static void main(String[] args) {
        evenNumberLoop(5);
    }

    public static boolean isEvenNumber(int num)
    {
        return num % 2 == 0;
    }

    public static void evenNumberLoop(int num)
    {
        int evenNumFound = 0;
        int oddNumFound = 0;
        while(true)
        {
            if(num < 5 || num > 20)
            {
                System.out.println("Either not in range or it's reached max range");
                break;
            }

            if(isEvenNumber(num))
            {
                evenNumFound++;
                System.out.println(num + " Is a Even Number");
                System.out.println("---");
            }
            else if(!isEvenNumber(num))
            {
                oddNumFound++;
                System.out.println(num + " Is an Odd Number");
            }
            num++;

            if(evenNumFound == 5)
            {
                System.out.println("Found " + evenNumFound + " even and " + oddNumFound + " odd numbers, exiting loop!");
                break;
            }
        }
    }
}
