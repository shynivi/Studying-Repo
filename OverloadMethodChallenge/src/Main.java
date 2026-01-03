public class Main {
    public static void main(String[] args) {
        System.out.println(convertToCentimeters(15));
        System.out.println(convertToCentimeters(6,0));
    }
    //Note: 1 inch = 2.54cm
    //Note: 1 foot = 12 inches

    public static double convertToCentimeters(int inchHeight)
    {
        if(inchHeight < 0)
        {
            return -1;
        }
        else
        {
         double inchToCm = (double)inchHeight * 2.54;
         return inchToCm;
        }
    }

    public static double convertToCentimeters(int feetHeight, int inchHeight)
    {
       int feetToInch = 12 * feetHeight;

       int sum = feetToInch + inchHeight;

        return convertToCentimeters(sum);
    }
}
