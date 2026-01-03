public class Main {
    public static void main(String[] args) {
        challengeSum(12);
        challengeSum(723);
        challengeSum(333);
    }

    public static void challengeSum(int number)
    {
        int numSum = 0;
        int numCount = 0;
        for(int i = number; numCount < 5 && i <= 1000; i++)
        {
            if(i % 3 == 0 && i % 5 == 0)
            {

                numSum += i;
                numCount++;
                System.out.println("Number found = " + i);
            }

        }
        System.out.println("The total of the numbers found is: " + numSum);
        System.out.println("-----");
    }
}
