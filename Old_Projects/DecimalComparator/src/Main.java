public class Main {
    public static void main(String[] args) {

        System.out.println(areEqualByThreeDecimalPlaces(-3.1756,-3.175));
    }

    public static boolean areEqualByThreeDecimalPlaces(double numOne, double numTwo)
    {
        numOne *= 1000;
        int numOneInt =(int) numOne;
        numTwo *= 1000;
        int numTwoInt = (int) numTwo;

        if(numOneInt == numTwoInt)
        {
            return true;
        }
        else {
            return false;
        }
    }
}
