public class Main {
    public static void main(String[] args) {
        System.out.println(isCatPlaying(true, 33));
    }

    public static boolean isCatPlaying(boolean summer, int temperature)
    {
        if(temperature < 0)
        {
            return false;
        }

        if(!summer && (temperature > 24 && temperature <= 35))
        {
            return true;
        }
        else if(summer && (temperature > 24 && temperature <= 45))
        {
            return true;
        }
        else
            return false;
    }
}
