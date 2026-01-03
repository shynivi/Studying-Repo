public class Main {
    public static void main(String[] args) {
        System.out.println(shouldWakeUp(false, 7));
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay)
    {
        if(hourOfDay < 0 || hourOfDay > 23)
        {
            return false;
        }
        else
        {
            if(barking && (hourOfDay < 8 || hourOfDay > 22))
            {
                return true;
            }
            else
            {
                return false;
            }
        }

    }
}
